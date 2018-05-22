B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim WorkersHolder As MiScrollView
	Dim TableHeader As Panel
	Dim TableName As Label
	Dim TableFakePan As Panel
	Dim tableFooter As Panel
	Dim ReloadWorkers As Button
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	WorkersHolder.Initialize
	TableHeader.Initialize("")
	TableName.Initialize("")
	TableFakePan.initialize("")
	ReloadWorkers.Initialize("test")
	tableFooter.Initialize("Footer")
	BuildUI
End Sub

Sub BuildUI
	tableFooter.color = Colors.ARGB(150,0,0,0)
	TableFakePan.Color = Colors.ARGB(150,0,0,0)
	TableHeader.Color = Colors.ARGB(150,0,0,0)
	WholeScreen.AddView(TableHeader,10%x,10%y + 5dip,80%x,5%y)
	WholeScreen.AddView(BuildTableLegend,TableHeader.Left,TableHeader.Top + TableHeader.Height,TableHeader.Width,TableHeader.Height)
	WholeScreen.AddView(TableFakePan,TableHeader.Left,(TableHeader.Top + TableHeader.Height) + 5%y,TableHeader.Width,60%y)
	WholeScreen.AddView(WorkersHolder.ScrollView,TableHeader.Left,(TableHeader.Top + TableHeader.Height) + 5%y,TableHeader.Width,TableFakePan.Height)
	TableName.Gravity = Gravity.CENTER
	TableName.Text = "My Workers"
	TableName.TextColor = Colors.White
	TableName.TextSize = 15
	TableHeader.AddView(TableName,TableHeader.Left + 10%x,0,TableHeader.Width/2,TableHeader.Height)
	
	ReloadWorkers.Text = "Reload"
	ReloadWorkers.TextSize = 20
	HelperFunctions1.Apply_ViewStyle(ReloadWorkers,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	
	WholeScreen.AddView(tableFooter,TableFakePan.Left,TableFakePan.Top + TableFakePan.Height,TableFakePan.Width,5%y)
	tableFooter.AddView(ReloadWorkers,20%x,1%y - 2dip,40%x,4%y - 2dip)
End Sub
Sub test_Click
	LoadWorkers
End Sub
Sub AsView As View
	Return WholeScreen
End Sub

Public Sub LoadWorkers
	WorkersHolder.removeAllViews
	For Each u As user In Types.userslist.Values
		If u.ID = Types.currentuser.ID And Not(u.username = Types.currentuser.username) Then
			WorkersHolder.addView(BuildWorkerPan(u.username,u.TypeOfWorker,u.available,u.CurrentTaskID),80%x,10%y,0,0,0,2dip)
		End If
	Next
End Sub
Sub BuildTableLegend As Panel
	Dim Holder As Panel
	Holder.Initialize("")
	Dim UsernameLbl As Label
	UsernameLbl.Initialize("")
	Dim WorkerTypeLbl As Label
	WorkerTypeLbl.Initialize("")
	Dim IsAvailableLbl As Label
	IsAvailableLbl.Initialize("")
	Dim CurrTasksLbl As Label
	CurrTasksLbl.Initialize("")
	
	UsernameLbl.Text = "Username"
	UsernameLbl.Gravity = Gravity.CENTER
	UsernameLbl.TextColor = Colors.White
	UsernameLbl.TextSize = 15
	UsernameLbl.Color=  Colors.ARGB(150,0,0,0)
	

	WorkerTypeLbl.Text = "Worker Type"
	WorkerTypeLbl.Gravity = Gravity.CENTER
	WorkerTypeLbl.TextColor = Colors.White
	WorkerTypeLbl.TextSize = 15
	WorkerTypeLbl.Color= Colors.ARGB(150,0,0,0)
	
	IsAvailableLbl.Text = "Status"
	IsAvailableLbl.Gravity = Gravity.CENTER
	IsAvailableLbl.TextColor = Colors.White
	IsAvailableLbl.TextSize = 15
	IsAvailableLbl.Color=  Colors.ARGB(150,0,0,0)
	
	CurrTasksLbl.Text = "Current Tasks"
	CurrTasksLbl.Gravity = Gravity.CENTER
	CurrTasksLbl.TextColor = Colors.White
	CurrTasksLbl.TextSize = 15
	CurrTasksLbl.Color=  Colors.ARGB(150,0,0,0)
	
	Holder.AddView(UsernameLbl,0,0,20%x,5%y)
	Holder.AddView(WorkerTypeLbl,UsernameLbl.Width,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Holder.AddView(IsAvailableLbl,WorkerTypeLbl.Left + WorkerTypeLbl.Width,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Holder.AddView(CurrTasksLbl,IsAvailableLbl.Width + IsAvailableLbl.Left,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Return Holder
	
End Sub
Sub BuildWorkerPan(username As String,WorkerType As Int,IsAvailable As Boolean,CurrentTasks() As Int) As Panel
	Dim Holder As Panel
	Holder.Initialize("")
	Dim UsernameLbl As Label
	UsernameLbl.Initialize("")
	Dim WorkerTypeLbl As Label
	WorkerTypeLbl.Initialize("")
	Dim IsAvailableLbl As Label
	IsAvailableLbl.Initialize("")
	Dim CurrTasksLbl As Label
	CurrTasksLbl.Initialize("")
	
	UsernameLbl.Text = username
	UsernameLbl.Gravity = Gravity.CENTER
	UsernameLbl.TextColor = Colors.Black
	UsernameLbl.TextSize = 15
	UsernameLbl.Color= Colors.rgb(230, 230, 230)
	
	If WorkerType = 1 Then
		WorkerTypeLbl.Text = "Cleaner"
	Else if WorkerType = 2 Then
		WorkerTypeLbl.Text = "Cook"
	End If
	WorkerTypeLbl.Gravity = Gravity.CENTER
	WorkerTypeLbl.TextColor = Colors.Black
	WorkerTypeLbl.TextSize = 15
	WorkerTypeLbl.Color= Colors.rgb(230, 230, 230)
	
	If IsAvailable = True Then
		IsAvailableLbl.Text = "Free"
	Else
		IsAvailableLbl.Text = "Busy"
	End If
	IsAvailableLbl.Gravity = Gravity.CENTER
	IsAvailableLbl.TextColor = Colors.Black
	IsAvailableLbl.TextSize = 15
	IsAvailableLbl.Color= Colors.rgb(230, 230, 230)
	
	For Each i As Int In CurrentTasks
		CurrTasksLbl.Text = CurrTasksLbl.Text & i & "," 
	Next
	CurrTasksLbl.Gravity = Gravity.CENTER
	CurrTasksLbl.TextColor = Colors.Black
	CurrTasksLbl.TextSize = 15
	CurrTasksLbl.Color= Colors.rgb(230, 230, 230)
	
	Holder.AddView(UsernameLbl,0,0,20%x,10%y)
	Holder.AddView(WorkerTypeLbl,UsernameLbl.Width,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Holder.AddView(IsAvailableLbl,WorkerTypeLbl.Left + WorkerTypeLbl.Width,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Holder.AddView(CurrTasksLbl,IsAvailableLbl.Width + IsAvailableLbl.Left,UsernameLbl.Top,UsernameLbl.Width,UsernameLbl.Height)
	Return Holder
End Sub