Type=Class
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Dim  wholescreen As Panel
	
	Dim TasksList As Map
	
	Dim usernamelbl As Label
	Dim availability As Label
	Dim tableHolder As Panel
	Dim tableHeader As Panel
	Dim tableFooter As Panel
	Dim tableType As Label
	Dim tableofrequests As ScrollView
	Dim submit As Button
	
	Dim refreshbtngraphic As Bitmap
	Dim TasksRefreshBtn As Button
	
	Dim mapoftaskviews As Map
	
	Dim boxchecked As Int = 0
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("screenview")
	wholescreen.Color =  Colors.rgb(0, 138, 230)
	
	TasksList.Initialize
	
	tableHolder.Initialize("table")
	tableHeader.Initialize("Header")
	tableFooter.Initialize("Footer")
	tableType.Initialize("type")
	refreshbtngraphic.Initialize(File.DirAssets,"refresh.png")
	TasksRefreshBtn.Initialize("refreshtask")
	usernamelbl.Initialize("username")
	availability.Initialize("avail")
	submit.Initialize("Submit")
	
	tableofrequests.Initialize(150%y)
	mapoftaskviews.Initialize
	
	BuildUI
	Get_Tasks
End Sub

Sub BuildUI
	usernamelbl.Textcolor = Colors.White
	usernamelbl.Gravity = Gravity.CENTER
	usernamelbl.Text = Main.currentuser.username
	usernamelbl.TextSize = 30
	wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%y)
	
	availability.TextColor = Colors.White
	availability.Gravity = Gravity.CENTER
	availability.TextSize = 25
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	wholescreen.AddView(availability,40%x,5%y,50%x,10%y)
	
	HelperFunctions1.Apply_ViewStyle(tableHeader,Colors.Black,Colors.rgb(255, 191, 0),Colors.White,Colors.rgb(255, 191, 0),Colors.Gray,Colors.Gray,Colors.Gray,0)
	HelperFunctions1.Apply_ViewStyle(tableFooter,Colors.Black,Colors.White,Colors.rgb(255, 191, 0),Colors.Gray,Colors.rgb(255, 191, 0),Colors.Gray,Colors.Gray,0)
	tableType.Gravity = Gravity.CENTER
	
	submit.Text = "Accept"
	HelperFunctions1.Apply_ViewStyle(submit,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	
	TasksRefreshBtn.SetBackgroundImage(refreshbtngraphic)
	tableType.TextColor = Colors.Black
	If Main.currentuser.TypeOfWorker = 1 Then
		tableType.Text = "Workers Table"
	Else If Main.currentuser.TypeOfWorker = 2 Then
		tableType.Text = "Cooks Table"
	Else If Main.currentuser.TypeOfWorker = 3 Then
		tableType.Text = "Waiters Table"
	End If
	
	wholescreen.AddView(tableHolder,10%x,15%y,80%x,70%y)
	tableofrequests.Color = Colors.White
	tableHolder.AddView(tableofrequests,0%x,5%y,100%x,95%y)
	tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y)
	tableHolder.AddView(tableFooter,0%x,64%y,100%x,6%y + 2dip)
	tableHolder.AddView(submit,20%x,65%y,40%x,5%y - 2dip)
	tableHeader.AddView(tableType,0,0,20%x,5%y)
	tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%y)
End Sub

Sub AsView As Panel
	Return wholescreen
End Sub
Sub Get_Tasks
	For i = 0 To 5 
		Dim Task As Task
		Task.Initialize
		Task.TaskID = i
		Task.TaskName = "Task "&i
		Task.TaskType = 1
		Task.TaskInfo = "Test task,just ignore it,dont worry you are free for now ;)"
		TasksList.Put(Task.TaskID,Task)
	Next
End Sub
Sub avail_Click
	If Main.currentuser.available = False Then
		Main.currentuser.available = True
	Else
		Main.currentuser.available = False
	End If
	
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	
End Sub

Sub refreshtask_Click
	tableofrequests.Panel.RemoveAllViews
	Dim p As Int = 0
	For Each i As Task In TasksList.Values
		If i.TaskType = Main.currentuser.TypeOfWorker Then
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
			
			TaskPanel.Color = Colors.DarkGray
			tableofrequests.Panel.AddView(TaskPanel,0,(5%y+2dip)*p,100%x,5%y)
			TaskPanel.Tag = p
			checked.Tag = p
			p = p + 1
			mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)
			
		End If
	Next
End Sub

Sub accept_CheckedChange(Checked As Boolean)
	Dim cbox As CheckBox = Sender
	If boxchecked < 3 Then
	
	 If Checked = True Then
		For Each v As Panel In mapoftaskviews.Values
			If cbox.Tag = v.Tag Then
				ToastMessageShow("You selected task " & v.Tag,False)
'				For Each t As Task In TasksList.Values
'					If t.TaskID = v.Tag Then
'						Main.currentuser.CurrentTaskID = t.TaskID
'						Log(Main.currentuser.username&"is currently working on task " & t.TaskID)
'					End If
'				Next
			End If
		Next		
		boxchecked = boxchecked + 1

		Log(boxchecked)
	Else 
		 Checked = False
		boxchecked = boxchecked - 1
	End If
	
	Else
			cbox.Checked = False
			ToastMessageShow("Cant accept more",False)
		
	End If
End Sub