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
	Dim CreateMenu As Label
'	Dim MenuOther3 As Label
	
	Dim NumberOfMenus As Int = 0
	
	Dim PropertyWindowHolder As Panel
	
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
	CreateMenu.Initialize("MenuCreator")
'	MenuOther3.Initialize("Menu4")

	PropertyWindowHolder.Initialize("propwindow")
	
	
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
	MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,20%y)
	
	MenuOther1.Gravity = Gravity.CENTER
	MenuOther1.Text = "My Task"
	MenuOther1.TextColor = Colors.White
	MenuOther1.TextSize = 15
	HelperFunctions1.Apply_ViewStyle(MenuOther1,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Left+MenuTasks.Width)+4dip,MenuTasks.Top,MenuTasks.Width,MenuTasks.Height)
	
	CreateMenu.Gravity = Gravity.CENTER
	CreateMenu.Text = "+"
	CreateMenu.TextColor = Colors.White
	CreateMenu.TextSize = 25
	HelperFunctions1.Apply_ViewStyle(CreateMenu,Colors.White,Colors.ARGB(150,0,0,0),Colors.ARGB(120,0,0,0),Colors.ARGB(200,0,0,0),Colors.ARGB(160,0,0,0),Colors.Black,Colors.Black,0)
	MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Left,(MenuTasks.Top+MenuTasks.Height)+4dip,MenuTasks.Width,MenuTasks.Height)
	CreateMenu.Visible = False
	CreateMenu.Enabled = False
	If Main.currentuser.TypeOfWorker = 0 Then
		CreateMenu.Visible = True
		CreateMenu.Enabled = True
	End If
	
	BuildMenuPropertyWindow
	
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
Sub BonusMenu_LongClick
	PropertyWindowHolder.Visible = True
End Sub

Sub BuildMenuPropertyWindow
	PropertyWindowHolder.Color = Colors.rgb(77, 77, 77)
	wholescreen.AddView(PropertyWindowHolder,MenuHolder.Left,MenuHolder.Top,MenuHolder.Width,MenuHolder.Height)
	PropertyWindowHolder.Visible = False
	
	Dim optionholder As Panel
	optionholder.Initialize("")
	Dim checkbox As CheckBox
	checkbox.Initialize("MenuTypeSelected")
	checkbox.Tag = 0
	Dim name As Label
	name.Initialize("")
	optionholder.AddView(checkbox,5%x,0,10%x,5%y)
	name.Gravity = Gravity.CENTER
	name.Text = "Workers manager"
	name.TextColor = Colors.White
	name.TextSize = 13
	optionholder.AddView(name,15%x,0,30%x,5%y)	
	PropertyWindowHolder.AddView(optionholder,5%x,5%y,MenuHolder.Width,5%y)
	
	Dim optionholder1 As Panel
	optionholder1.Initialize("")
	Dim checkbox1 As CheckBox
	checkbox1.Initialize("MenuTypeSelected")
	checkbox1.Tag = 1
	Dim name1 As Label
	name1.Initialize("")
	optionholder1.AddView(checkbox1,5%x,0,10%x,5%y)
	name1.Gravity = Gravity.CENTER
	name1.Text = "Efficiency check"
	name1.TextColor = Colors.White
	name1.TextSize = 13
	optionholder1.AddView(name1,15%x,0,30%x,5%y)
	PropertyWindowHolder.AddView(optionholder1,5%x,10%y,MenuHolder.Width,5%y)
	
	Dim optionholder2 As Panel
	optionholder2.Initialize("")
	Dim checkbox2 As CheckBox
	checkbox2.Initialize("MenuTypeSelected")
	checkbox2.Tag = 2
	Dim name2 As Label
	name2.Initialize("")
	optionholder2.AddView(checkbox2,5%x,0,10%x,5%y)
	name2.Gravity = Gravity.CENTER
	name2.Text = "Tasks Manager"
	name2.TextColor = Colors.White
	name2.TextSize = 13
	optionholder2.AddView(name2,15%x,0,30%x,5%y)
	PropertyWindowHolder.AddView(optionholder2,5%x,15%y,MenuHolder.Width,5%y)
	
	Dim OKbtn As Button
	OKbtn.Initialize("SelectedMenuType")
	OKbtn.Gravity = Gravity.CENTER
	OKbtn.Text = "OK"
	HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	PropertyWindowHolder.AddView(OKbtn,15%x,30%y,MenuHolder.Width/2,5%y)
End Sub
Sub SelectedMenuType_Click
	PropertyWindowHolder.Visible = False
End Sub
Sub MenuTypeSelected_CheckedChange(Checked As Boolean)
	Dim cbox As CheckBox = Sender
	
	If Checked = True Then
		
	Else
		Checked = False
		
	End If
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

Sub screenview_Click As Boolean
 Return True
End Sub