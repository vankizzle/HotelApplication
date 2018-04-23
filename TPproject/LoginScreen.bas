B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.01
@EndOfDesignText@
Sub Class_Globals
	Dim wholescreen As Panel
	Dim infoholder As Panel
	Dim screenimg As ImageView
	Dim usernamefield As EditText
	Dim passwordfield As EditText
	Dim loginbtn As Button
	Dim singup As Button
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("wholescr")
	usernamefield.Initialize("username")
	passwordfield.Initialize("password")
	loginbtn.Initialize("login")
	screenimg.Initialize("")
	infoholder.Initialize("")
	singup.Initialize("register")
	
	BuildUI
End Sub


Sub AsView As Panel
	Return wholescreen
End Sub

Sub BuildUI
	
	screenimg.SetBackgroundImage(LoadBitmap(File.DirAssets,"hotelappscreen.jpg"))
	screenimg.Gravity = Gravity.FILL
	wholescreen.AddView(screenimg,0,10%y,100%x,80%y)
	wholescreen.Color = Colors.ARGB(150,0,0,0)
	
	
	infoholder.Color =  Colors.ARGB(150,0,0,0)
'	wholescreen.AddView(infoholder,30%x,30%y,40%x,30%y)
	wholescreen.AddView(infoholder,30%x,100%y,40%x,30%y)
	usernamefield.Gravity = Gravity.LEFT
	usernamefield.Color = Colors.White
'	usernamefield.Hint = "Username"
	usernamefield.Text = Main.currentuser.username
	usernamefield.HintColor = Colors.DarkGray
	usernamefield.SingleLine = True
	usernamefield.TextColor = Colors.Black
	infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x,5%y)
	
	passwordfield.Gravity = Gravity.LEFT
	passwordfield.Color = Colors.White
'	passwordfield.Hint = "Password"
	passwordfield.Text = Main.currentuser.password
	passwordfield.HintColor = Colors.DarkGray
	passwordfield.PasswordMode = True
	passwordfield.SingleLine = True
	passwordfield.TextColor = Colors.Black
	infoholder.AddView(passwordfield,2.5%x,(usernamefield.Top +usernamefield.Height) + 10dip,35%x,5%y)
	
	loginbtn.Gravity = Gravity.CENTER
	loginbtn.Color = Colors.White
	loginbtn.Text = "Login"
	loginbtn.TextSize = 20
	loginbtn.Textcolor = Colors.Black
	HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(77, 166, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	infoholder.AddView(loginbtn,2.5%x,(passwordfield.Top +passwordfield.Height) + 5%y,35%x,5%y)
	
	singup.Gravity = Gravity.CENTER
	singup.Color = Colors.White
	singup.Text = "Sing up"
	singup.TextSize = 20
	singup.Textcolor = Colors.Black
	HelperFunctions1.Apply_ViewStyle(singup,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(77, 166, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	infoholder.AddView(singup,2.5%x,(loginbtn.Top + loginbtn.Height) + 5dip,35%x,5%y)
	
	infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,30%y)
End Sub


Sub login_Click
'	Main.currentuser.username = usernamefield.Text
'	Main.currentuser.password = passwordfield.Text
'	Main.currentuser.available = True
	Log(Main.currentuser)
	CallSub(Main,"ShowUI")
End Sub