B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim TaskHolder As MiScrollView
	Dim TaskHeader As Panel
	Dim TableName As Label
	Dim TaskFakePan As Panel
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	TaskHolder.Initialize
	TaskHeader.Initialize("")
	TableName.Initialize("")
	TaskFakePan.initialize("")
	BuildUI
End Sub

Sub BuildUI
	TaskFakePan.Color = Colors.ARGB(150,0,0,0)
	TaskHeader.Color = Colors.ARGB(150,0,0,0)
	WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y)
	WholeScreen.AddView(TaskFakePan,TaskHeader.Left,TaskHeader.Top+TaskHeader.Height,TaskHeader.Width,60%y)
	WholeScreen.AddView(TaskHolder.ScrollView,TaskHeader.Left,TaskHeader.Top+TaskHeader.Height,TaskHeader.Width,TaskFakePan.Height)

	TableName.Gravity = Gravity.CENTER
	TableName.Text = "My Tasks"
	TableName.TextColor = Colors.White
	TableName.TextSize = 15
	TaskHeader.AddView(TableName,TaskHeader.Left + 10%x,0,TaskHeader.Width/2,TaskHeader.Height)
End Sub

Sub AsView As View
	Return WholeScreen
End Sub

Public Sub GetMyTasks(AcceptedTasks As Map)
	TaskHolder.removeAllViews
	For Each v As Task In AcceptedTasks.Values
		
		TaskHolder.addView(PanBuilder(v.TaskID,v.TaskName,v.TaskType,v.TaskInfo),80%x,15%y,0,0,0,2dip)
	Next
End Sub

Sub PanBuilder(ID As Int,Name As String,TaskType As Int,Info As String) As Panel
	Dim Holder As Panel
	Holder.Initialize("")
	Dim lblID As Label
	lblID.Initialize("")
	Dim lblName As Label
	lblName.Initialize("")
	Dim ViewInfo As MiScrollView
	ViewInfo.Initialize
	Dim lblInfo As Label
	lblInfo.Initialize("")
	
	lblID.Color = Colors.rgb(0, 128, 255)
	lblID.Text = ID
	lblID.TextSize = 20
	lblID.TextColor = Colors.White
	lblID.Gravity = Gravity.CENTER
	Holder.AddView(lblID,0,0,10%x,15%y)
	
	lblName.Color = Colors.rgb(0, 128, 255)
	lblName.Text = Name
	lblName.TextSize = 20
	lblName.TextColor = Colors.White
	lblName.Gravity = Gravity.CENTER
	Holder.AddView(lblName,0%x,0,80%x,5%y)
	
	lblInfo.Text = Info
	lblInfo.TextSize = 15
	lblInfo.TextColor = Colors.White
	lblInfo.Color = Colors.rgb(0, 128, 255)
	
	Holder.AddView(ViewInfo.ScrollView,10%x,5%y,70%x,10%y)
	ViewInfo.addView(lblInfo,70%x,15%y,0,0,0,0)
	
	Return Holder
End Sub