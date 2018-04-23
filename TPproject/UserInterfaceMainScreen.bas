B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.01
@EndOfDesignText@
Sub Class_Globals
	Dim  wholescreen As Panel
	Dim screenimg As ImageView
	
	Dim TasksList As Map
	
	Dim usernamelbl As Label
	Dim availability As Label
	Dim tableHolder As Panel
	Dim tableHeader As Panel
	Dim tableFooter As Panel
	Dim tableType As Label
	Dim tableofrequests As ScrollView
	Dim submit As Button
	Dim statusindicator As Label
	
	Dim refreshbtngraphic As Bitmap
	Dim TasksRefreshBtn As Button
	
	Dim mapoftaskviews As Map
	
	Dim boxchecked As Int = 0
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("screenview")
	screenimg.Initialize("")
	screenimg.SetBackgroundImage(LoadBitmap(File.DirAssets,"mainscreenimg.png"))
	screenimg.Gravity = Gravity.FILL
	wholescreen.AddView(screenimg,0,10%y,100%x,80%y)
	
	TasksList.Initialize
	
	statusindicator.Initialize("")
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
	wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%y)
	
	availability.TextColor = Colors.White
	availability.Gravity = Gravity.CENTER
	availability.TextSize = 25
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,20)
	wholescreen.AddView(availability,40%x,0%y,50%x,10%y)
	wholescreen.AddView(statusindicator,availability.Left+availability.Width - 20dip,3.5%y,5%x,3%y)
	
'	statusindicator.Color = Colors.Green
	tableHeader.color = Colors.ARGB(150,0,0,0)
	tableFooter.color = Colors.ARGB(150,0,0,0)
'	tableFooter.color = Colors.Red
	tableType.Gravity = Gravity.CENTER
	
	submit.Text = "Accept"
	HelperFunctions1.Apply_ViewStyle(submit,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	
	TasksRefreshBtn.SetBackgroundImage(refreshbtngraphic)
	tableType.TextColor = Colors.White
	tableType.TextSize = 25
	If Main.currentuser.TypeOfWorker = 1 Then
		tableType.Text = "Workers Table"
	Else If Main.currentuser.TypeOfWorker = 2 Then
		tableType.Text = "Cooks Table"
	Else If Main.currentuser.TypeOfWorker = 3 Then
		tableType.Text = "Waiters Table"
	End If
	
	wholescreen.AddView(tableHolder,10%x,15%y,80%x,70%y)
	tableofrequests.Color = Colors.ARGB(150,0,0,0)	
	tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y)
	tableHolder.AddView(tableofrequests,0%x,tableHeader.Top + tableHeader.Height,100%x,60%y)
	tableHolder.AddView(tableFooter,0%x,65%y - 1dip,100%x,8%y)
	tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4%y - 2dip)
	tableHeader.AddView(tableType,0,0,40%x,5%y)
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
		HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,20)
	Else
		Main.currentuser.available = False
		HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,20)
	End If
	
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	
End Sub

Sub refreshtask_Click
	tableofrequests.Panel.RemoveAllViews
	boxchecked = 0
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
	
	
	 If Checked = True Then
		If boxchecked < 3 Then
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
			cbox.Checked = False
			ToastMessageShow("Cant accept more",False)
		
		End If
	Else 
		Checked = False
		boxchecked = boxchecked - 1
	End If
	
	
End Sub