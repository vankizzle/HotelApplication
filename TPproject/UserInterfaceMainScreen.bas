B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.01
@EndOfDesignText@
Sub Class_Globals
	Dim  wholescreen As Panel
	Dim screenimg As ImageView

	Dim usernamelbl As Label
	Dim availability As Label
	Dim statusindicator As Label
	
	Dim MenuHolder As Panel
	Dim MenuTasks As Label
	Dim MenuOther1 As Label
	Dim MenuOther2 As Label
	Dim MenuOther3 As Label
	
	
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("screenview")
	screenimg.Initialize("")
	screenimg.SetBackgroundImage(LoadBitmap(File.DirAssets,"mainscreenimg.png"))
	screenimg.Gravity = Gravity.FILL
	wholescreen.AddView(screenimg,0,10%y,100%x,80%y)
	
	statusindicator.Initialize("")
	usernamelbl.Initialize("username")
	availability.Initialize("avail")
	
	MenuHolder.Initialize("")
	MenuTasks.Initialize("Tasks")
	MenuOther1.Initialize("MyTask")
	MenuOther2.Initialize("Menu3")
	MenuOther3.Initialize("Menu4")
	
	
	
	BuildUI
	
End Sub

Sub BuildUI
	usernamelbl.Textcolor = Colors.White
	usernamelbl.Gravity = Gravity.CENTER
	usernamelbl.Text = Main.currentuser.username
	usernamelbl.TextSize = 20
	wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%y)
	
	availability.TextColor = Colors.White
	availability.Gravity = Gravity.CENTER
	availability.TextSize = 20
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,30)
	wholescreen.AddView(availability,40%x,0%y,50%x,10%y)
	wholescreen.AddView(statusindicator,availability.Left+availability.Width ,3.5%y,5%x,3%y)
	
	wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4dip,40%y+4dip)
	MenuTasks.Gravity = Gravity.CENTER
	MenuTasks.Text = "Task Table"
	MenuTasks.TextColor = Colors.White
	MenuTasks.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.AddView(MenuTasks,0%x,0%y,30%x,20%y)
	
	MenuOther1.Gravity = Gravity.CENTER
	MenuOther1.Text = "My Task"
	MenuOther1.TextColor = Colors.White
	MenuOther1.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther1,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.AddView(MenuOther1,(MenuTasks.Left+MenuTasks.Width)+4dip,MenuTasks.Top,MenuTasks.Width,MenuTasks.Height)
	
	MenuOther2.Gravity = Gravity.CENTER
	MenuOther2.Text = "Menu 3"
	MenuOther2.TextColor = Colors.White
	MenuOther2.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther2,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.AddView(MenuOther2,MenuTasks.Left,(MenuTasks.Top+MenuTasks.Height)+4dip,MenuTasks.Width,MenuTasks.Height)
	
	MenuOther3.Gravity = Gravity.CENTER
	MenuOther3.Text = "Menu 4"
	MenuOther3.TextColor = Colors.White
	MenuOther3.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther3,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.AddView(MenuOther3,(MenuTasks.Left+MenuTasks.Width)+4dip,(MenuTasks.Top+MenuTasks.Height)+4dip,MenuTasks.Width,MenuTasks.Height)
End Sub

Sub AsView As Panel
	Return wholescreen
End Sub
Sub Tasks_Click
	CallSub(Main,"ShowTaskTable")
End Sub
Sub MyTask_Click
	CallSub(Main,"ShowMyTasks")
End Sub
Sub Menu3_Click
	CallSub(Main,"ShowMenu3")
End Sub
Sub Menu4_Click
	CallSub(Main,"ShowMenu")
End Sub
Public Sub SetBusy
	Main.currentuser.available = False
	availability.Text = "Status: Busy"
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,30)
End Sub
Public Sub SetAvailable
	Main.currentuser.available = True
	availability.Text = "Status: Available"
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,30)
End Sub
Sub avail_Click
	If Main.currentuser.available = False Then
		Main.currentuser.available = True
		HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,30)
	Else
		Main.currentuser.available = False
		HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,30)
	End If
	
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	
End Sub

Sub screenview_Click As Boolean
 Return True
End Sub