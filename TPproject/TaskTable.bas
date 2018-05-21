B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim TasksList As Map
	Dim tableHolder As Panel
	Dim tableHeader As Panel
	Dim tableFooter As Panel
	Dim tableType As Label
	Dim tableofrequests As MiScrollView
	Dim submit As Button
'	Dim refreshbtngraphic As Bitmap
'	Dim TasksRefreshBtn As Button
	Dim mapoftaskviews As Map
	Dim boxchecked As Int = 0
	
	Dim SelectedTasks As Map

	Dim TaskFakePan As Panel
	
	Dim RefreshTimer As Timer
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	TasksList.Initialize
	tableHolder.Initialize("table")
	tableHeader.Initialize("Header")
	tableFooter.Initialize("Footer")
	tableType.Initialize("type")
'	refreshbtngraphic.Initialize(File.DirAssets,"refresh.png")
'	TasksRefreshBtn.Initialize("refreshtask")
	submit.Initialize("Submit")
	tableofrequests.Initialize
	mapoftaskviews.Initialize
	SelectedTasks.Initialize
	
	TaskFakePan.initialize("")
	
	RefreshTimer.Initialize("Refresh",2000)
	RefreshTimer.Enabled = True
	
	BuildUI
	Get_Tasks
End Sub

Sub AsView As View
	Return WholeScreen
End Sub
Sub Refresh_Tick
	If Types.currentuser.available = True  Then
		buildTasks	
		submit.Enabled = True
		Log("_TABLE REFRESHED_")
	End If
End Sub
Sub BuildUI
	TaskFakePan.Color = Colors.ARGB(150,0,0,0)
	tableHeader.color = Colors.ARGB(150,0,0,0)
	tableFooter.color = Colors.ARGB(150,0,0,0)
	tableType.Gravity = Gravity.CENTER
	submit.Text = "Accept"
	HelperFunctions1.Apply_ViewStyle(submit,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
'	submit.Enabled = False
	
'	TasksRefreshBtn.SetBackgroundImage(refreshbtngraphic)
	tableType.TextColor = Colors.White
	tableType.TextSize = 25
	If Types.currentuser.TypeOfWorker = 1 Then
		tableType.Text = "Workers Table"
	Else If Types.currentuser.TypeOfWorker = 2 Then
		tableType.Text = "Cooks Table"
	Else If Types.currentuser.TypeOfWorker = 3 Then
		tableType.Text = "Waiters Table"
	End If
	
	WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70%y)
	tableofrequests.Color = Colors.ARGB(150,0,0,0)
	tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y)
'	WholeScreen.AddView(TaskFakePan,0%x,tableHeader.Top + tableHeader.Height,100%x,60%y)
	tableHolder.AddView(tableofrequests.ScrollView,0%x,tableHeader.Top + tableHeader.Height,100%x,60%y)
	tableHolder.AddView(tableFooter,0%x,65%y - 1dip,100%x,8%y)
	tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4%y - 2dip)
	tableHeader.AddView(tableType,0,0,40%x,5%y)
'	tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%y)
End Sub

Sub Get_Tasks
	For i = 0 To 5
		Dim Task As Task
		Task.Initialize
		Task.TaskID = i
		Task.TaskName = "Task "&i
		Task.TaskType = 1
		Task.TaskInfo = "This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"&i
		TasksList.Put(Task.TaskID,Task)
	Next
End Sub
Sub buildTasks

	tableofrequests.removeAllViews
	boxchecked = 0
	Dim p As Int = 0
	For Each i As Task In TasksList.Values
		If i.TaskType = Types.currentuser.TypeOfWorker Then
			Dim TaskPanel As Panel
			Dim TaskIdLbl As Label
			Dim TaskNameLbl As Label
			Dim taskInfoLbl As Label
			Dim checked As CheckBox
			
			TaskPanel.Initialize("")
			TaskIdLbl.Initialize("")
			TaskNameLbl.Initialize("")
			taskInfoLbl.Initialize("")
			checked.Initialize("accept")
			
			TaskIdLbl.Text = i.TaskID
			TaskIdLbl.TextColor = Colors.White
			TaskIdLbl.TextSize = 15
			TaskIdLbl.Gravity = Gravity.CENTER
			TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)
			
			TaskNameLbl.Text = i.TaskName
			TaskNameLbl.TextColor = Colors.White
			TaskNameLbl.TextSize = 15
			TaskNameLbl.Gravity = Gravity.CENTER
			TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)
			
			taskInfoLbl.Text = i.TaskInfo
			taskInfoLbl.TextColor = Colors.White
			taskInfoLbl.TextSize = 10
			taskInfoLbl.Gravity = Gravity.CENTER
			TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)
			
			
			checked.Gravity = Gravity.CENTER
			TaskPanel.AddView(checked,70%x,0,10%x,5%y)
			
			TaskPanel.Color = Colors.rgb(0, 128, 255)
			tableofrequests.addView(TaskPanel,100%x,5%y,0,0,0,2dip)
			
			TaskPanel.Tag = p
			checked.Tag = p
			p = p + 1
			mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)
			
		End If
	Next
End Sub
Sub accept_CheckedChange(Checked As Boolean)
	Dim cbox As CheckBox = Sender
	
	
	If Checked = True Then
'		submit.Enabled = True
		RefreshTimer.Enabled = False
		If boxchecked < 3 Then
			boxchecked = boxchecked + 1
			Log(boxchecked)
			For Each v As Panel In mapoftaskviews.Values
					If cbox.Tag = v.Tag Then
						ToastMessageShow("You selected task " & v.Tag,False)
						SelectedTasks.Put(cbox.Tag,TasksList.Get(TasksList.GetKeyAt(v.Tag)))
					End If
			Next
		Else
			cbox.Checked = False
			ToastMessageShow("Cant accept more",False)
		
		End If
	
	Else
		Checked = False
		SelectedTasks.Remove(cbox.tag)
		boxchecked = boxchecked - 1
		If boxchecked = 0 Then
			RefreshTimer.Enabled = True
		End If
	End If
End Sub

Sub Submit_Click
	If SelectedTasks.Size > 0 Then
		boxchecked = 0
		RefreshTimer.Enabled = True
		submit.Enabled = False
		Dim i As Int = 0
		
		For Each v As Task In SelectedTasks.Values
			Types.currentuser.CurrentTaskID(i) = v.TaskID
			i = i + 1
		Next
		
		Log(SelectedTasks)
		CallSub(Main,"SetUserBusy")
		CallSub2(Main,"LoadMyTasks",SelectedTasks)
		CallSub(Main,"TaskTableToMyTasks")
		SelectedTasks.Clear
	Else
		ToastMessageShow("Please select a task to continue!",False)
	End If
End Sub