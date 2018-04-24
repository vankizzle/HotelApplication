B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim TaskHolder As Panel
	Dim TaskHeader As Panel
	Dim TableName As Label
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	TaskHolder.Initialize("")
	TaskHeader.Initialize("")
	TableName.Initialize("")
	BuildUI
End Sub

Sub BuildUI
	TaskHolder.Color = Colors.ARGB(150,0,0,0)
	WholeScreen.AddView(TaskHolder,10%x,15%y,80%x,70%y)
	TaskHolder.AddView(TaskHeader,0,0,80%x,5%y)
	TableName.Gravity = Gravity.CENTER
	TableName.Text = "My Tasks"
	TableName.TextColor = Colors.White
	TableName.TextSize = 15
	TaskHeader.AddView(TableName,20%x,0,40%x,5%y)
End Sub

Sub AsView As View
	Return WholeScreen
End Sub

