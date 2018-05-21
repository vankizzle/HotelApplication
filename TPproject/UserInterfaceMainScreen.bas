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
	
	Dim MenuHolder As ScrollView
	Dim MenuTasks As Label
	Dim MenuOther1 As Label
	Dim MenuOther2 As Label
	Dim CreateMenu As Label
'	Dim MenuOther3 As Label
	

	
	Dim NumberOfMenus As Int = 0
	Dim MenuTypes As ChooseMenuType
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
	
	MenuHolder.Initialize(40%y+4dip)
	MenuTasks.Initialize("Tasks")
	MenuOther1.Initialize("MyTask")
	MenuOther2.Initialize("MyWorkers")
	CreateMenu.Initialize("MenuCreator")
'	MenuOther3.Initialize("Menu4")
	MenuTypes.Initialize
	BuildUI
End Sub
Sub BuildUI

	usernamelbl.Textcolor = Colors.White
	usernamelbl.Gravity = Gravity.CENTER
'	usernamelbl.Text = Types.currentuser.username
	usernamelbl.TextSize = 20
	wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%y)
	
	availability.TextColor = Colors.White
	availability.Gravity = Gravity.CENTER
	availability.TextSize = 20
	
	
	
'	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,30)
	wholescreen.AddView(availability,40%x,0%y,50%x,10%y)
	wholescreen.AddView(statusindicator,availability.Left+availability.Width ,3.5%y,5%x,3%y)
	
	wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4dip,40%y+4dip)
	MenuTasks.Gravity = Gravity.CENTER
	MenuTasks.Text = "Task Table"
	MenuTasks.TextColor = Colors.White
	MenuTasks.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,20%y)
	
	MenuOther1.Gravity = Gravity.CENTER
	MenuOther1.Text = "My Task"
	MenuOther1.TextColor = Colors.White
	MenuOther1.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther1,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Left+MenuTasks.Width)+4dip,MenuTasks.Top,MenuTasks.Width,MenuTasks.Height)
	
	MenuOther2.Gravity = Gravity.CENTER
	MenuOther2.Text = "Workers"
	MenuOther2.TextColor = Colors.White
	MenuOther2.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther2,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(MenuOther2,(MenuTasks.Left+MenuTasks.Width)+4dip,MenuTasks.Top,MenuTasks.Width,MenuTasks.Height)
	MenuOther2.Visible = False
	MenuOther2.Enabled = False
	
	CreateMenu.Gravity = Gravity.CENTER
	CreateMenu.Text = "+"
	CreateMenu.TextColor = Colors.White
	CreateMenu.TextSize = 25
	HelperFunctions1.Apply_ViewStyle(CreateMenu,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Left,(MenuTasks.Top+MenuTasks.Height)+4dip,MenuTasks.Width,MenuTasks.Height)
	CreateMenu.Visible = False
	CreateMenu.Enabled = False
	
	wholescreen.AddView(MenuTypes.AsView,MenuHolder.Left,MenuHolder.Top,MenuHolder.Width,MenuHolder.Height)
	MenuTypes.AsView.Visible = False
	
End Sub

Public Sub IfBoss
	If Types.Isboss = True Then
		CreateMenu.Visible = True
		CreateMenu.Enabled = True
		MenuOther1.Visible = False
		MenuOther1.Enabled = False
		MenuOther2.Visible = True
		MenuOther2.Enabled = True
		availability.Visible = False
		statusindicator.Visible = False
	Else
		CreateMenu.Visible = False
		CreateMenu.Enabled = False
		MenuOther1.Visible = True
		MenuOther1.Enabled = True
		MenuOther2.Visible = False
		MenuOther2.Enabled = False
		availability.Visible = True
		statusindicator.Visible = True
	End If
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
Sub MenuCreator_Click
	CreateMenuIcon
End Sub
Sub propwindow_Click As Boolean
	Return True
End Sub
Sub CreateMenuIcon
	If NumberOfMenus < 3 Then
	Dim MenuNew As Label
	MenuNew.Initialize("BonusMenu")
	MenuNew.Gravity = Gravity.CENTER
	MenuNew.Text = "Menu"
	MenuNew.TextColor = Colors.White
	MenuNew.TextSize = 15
'	MenuNew.Tag = Rnd(1,5)
	HelperFunctions1.Apply_ViewStyle(MenuNew,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(MenuNew,CreateMenu.Left,CreateMenu.Top,CreateMenu.Width,CreateMenu.Height)
	
	If CreateMenu.Left = MenuTasks.Left Then
		CreateMenu.SetLayoutAnimated(500,(MenuTasks.Left + MenuTasks.Width)+4dip,MenuNew.Top,MenuNew.Width,MenuNew.Height)
	Else If CreateMenu.Left = (MenuTasks.Left + MenuTasks.Width)+4dip Then
		CreateMenu.SetLayoutAnimated(500,MenuTasks.Left,(MenuNew.Top+MenuNew.Height)+4dip,MenuNew.Width,MenuNew.Height)
		MenuHolder.panel.Height = MenuHolder.panel.Height + MenuNew.Height
	End If
		NumberOfMenus = NumberOfMenus + 1
	Else
		Msgbox("You have reached maximum number of menus!Please buy more!","We are sorry!")	
	End If
End Sub
Sub MyWorkers_Click
	CallSub(Main,"ShowMyWorkers")
End Sub

Sub BonusMenu_LongClick
	MenuTypes.AsView.Visible = True
End Sub



Sub MenuTypeSelected_CheckedChange(Checked As Boolean)
	Dim cbox As CheckBox = Sender
	
	If Checked = True Then
		
	Else
		Checked = False
		
	End If
End Sub

Public Sub SetBusy
	Types.currentuser.available = False
	availability.Text = "Status: Busy"
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,Colors.Red,30)
End Sub
Public Sub SetAvailable
	Types.currentuser.available = True
	availability.Text = "Status: Available"
	HelperFunctions1.Apply_ViewStyle(statusindicator,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,Colors.Green,30)
End Sub

Sub screenview_Click As Boolean
 Return True
End Sub