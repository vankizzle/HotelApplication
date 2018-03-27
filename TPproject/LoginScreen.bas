Type=Class
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Dim wholescreen As Panel
	Dim usernamefield As EditText
	Dim passwordfield As EditText
	Dim loginbtn As Button

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("wholescr")
	usernamefield.Initialize("username")
	passwordfield.Initialize("password")
	loginbtn.Initialize("login")
	
	BuildUI
End Sub


Sub AsView As Panel
	Return wholescreen
End Sub

Sub BuildUI
	wholescreen.Color = Colors.rgb(0, 138, 230)
	
	usernamefield.Gravity = Gravity.LEFT
	usernamefield.Color = Colors.White
'	usernamefield.Hint = "Username"
	usernamefield.Text = Main.currentuser.username
	usernamefield.HintColor = Colors.DarkGray
	usernamefield.SingleLine = True
	usernamefield.TextColor = Colors.Black
	wholescreen.AddView(usernamefield,30%x,30%y,40%x,5%y)
	
	passwordfield.Gravity = Gravity.LEFT
	passwordfield.Color = Colors.White
'	passwordfield.Hint = "Password"
	passwordfield.Text = Main.currentuser.password
	passwordfield.HintColor = Colors.DarkGray
	passwordfield.PasswordMode = True
	passwordfield.SingleLine = True
	passwordfield.TextColor = Colors.Black
	wholescreen.AddView(passwordfield,30%x,35%y + 5dip,40%x,5%y)
	
	loginbtn.Gravity = Gravity.CENTER
	loginbtn.Color = Colors.White
	loginbtn.Text = "Login"
	loginbtn.Textcolor = Colors.Black
	HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.Black,Colors.rgb(255, 191, 0),Colors.White,Colors.rgb(255, 191, 0),Colors.Gray,Colors.Gray,Colors.Gray,10)
	wholescreen.AddView(loginbtn,30%x,(passwordfield.Top +passwordfield.Height) + 5dip,40%x,5%y)
End Sub


Sub login_Click
'	Main.currentuser.username = usernamefield.Text
'	Main.currentuser.password = passwordfield.Text
'	Main.currentuser.available = True
	Log(Main.currentuser)
	CallSub(Main,"ShowUI")
End Sub