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
	Dim myxml As SaxParser
'	Dim userslist As List
'	Dim workingUser As user
	Dim usermainscreen As UserInterfaceMainScreen
	
	Dim LoginJob As HttpJob
	
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
	myxml.Initialize
	Types.userslist.Initialize
	usermainscreen.Initialize
	
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
	wholescreen.AddView(infoholder,30%x,100%y,40%x,30%y)
	usernamefield.Gravity = Gravity.LEFT
	usernamefield.Color = Colors.White
	usernamefield.Hint = "Username"
	usernamefield.Text = "k.madjunov@gmail.com"
	usernamefield.HintColor = Colors.DarkGray
	usernamefield.SingleLine = True
	usernamefield.TextColor = Colors.Black
	infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x,5%y)
	
	passwordfield.Gravity = Gravity.LEFT
	passwordfield.Color = Colors.White
	passwordfield.Hint = "Password"
	passwordfield.Text = "a936157z"
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

Sub JobDone(job1 As HttpJob)
	If job1.Success Then
		Dim s As String = job1.JobName
		Select s
			Case "JobLogin" 
'			Log("Logged In")
			Dim result As String = job1.GetString
			Log(result)
			If Not(result.Contains("errorMessage")) Then
				result = result.Replace(QUOTE," ")
				result = result.Replace(":"," ")
				result = result.Replace("{"," ")
				result = result.Replace("accessToken"," ")
				result = result.Replace(","," ")
				result = result.Replace("tokenType"," ")
				result = result.Replace("Bearer"," ")
				result = result.Replace("}"," ")
				result = result.Trim
				Log(result)
				Types.ResToken  = result
			End If
				CallSub(Main,"ShowUI")
		End Select
		job1.Release
	End If
End Sub

Sub login_Click
	LoginJob.Initialize("JobLogin", Me)
	Dim url As String = "https://hacktues.com/api/login"
	Dim jstr As String = Types.getJSONforLogin(usernamefield.Text,passwordfield.Text)
	Log(jstr)
	LoginJob.PostString(url,jstr)
	LoginJob.GetRequest.SetContentType("application/json")
	LoginJob.GetRequest.SetHeader("Accept","application/json")

'	myxml.Parse(File.OpenInput(File.DirAssets,"ExampleXML.xml"),"Parse")
'	CheckUser
End Sub

'Sub Parse_StartElement (Uri As String, Name As String, Attributes As Attributes)
'	If Name.EqualsIgnoreCase("user") Then
'		workingUser.Initialize
'	End If
'End Sub

Sub setuser(u As user)
	Types.currentuser.username = u.username
	Types.currentuser.password = u.password
	Types.currentuser.available = u.available
	Types.currentuser.ID = u.ID
	Types.currentuser.TypeOfWorker = u.TypeOfWorker
	Types.currentuser.CurrentTaskID = u.CurrentTaskID
End Sub

'Sub CheckUser
'
'	For Each u As user In Types.userslist.Values
'		If  usernamefield.Text = u.username Then
'			If passwordfield.Text = u.password Then
'				setuser(u)	
'				CallSub(Main,"ShowUI")
'			End If
'		End If
'	Next
'End Sub
'
'Sub Parse_EndElement (Uri As String, Name As String, Text As StringBuilder)
'	If Name.EqualsIgnoreCase("user") Then
'		Dim newUser As user
'		newUser.Initialize
'		newUser.available = workingUser.available
'		newUser.CurrentTaskID = workingUser.CurrentTaskID
'		newUser.ID = workingUser.ID
'		newUser.password = workingUser.password
'		newUser.username = workingUser.username
'		newUser.TypeOfWorker = workingUser.TypeOfWorker
'		Types.userslist.Put(newUser.username,newUser)
'	End If
'	
'	If Name.EqualsIgnoreCase("name") Then workingUser.username = Text.ToString
'	If Name.EqualsIgnoreCase("password") Then workingUser.password = Text.ToString
'	If Name.EqualsIgnoreCase("available") Then
'		If Text.ToString  = "True" Then
'			workingUser.available = True
'		Else
'			workingUser.available = False
'		End If
'	End If
'	If Name.EqualsIgnoreCase("TypeOfWorker") Then workingUser.TypeOfWorker = Text.ToString
'	If Name.EqualsIgnoreCase("id") Then workingUser.ID = Text.ToString
'	If Name.EqualsIgnoreCase("CurrentTaskID") Then 
'		Dim i As Int = 0 
'		For Each s As String In Regex.Split(",",Text.ToString)
'			If IsNumber(s) Then
'				workingUser.CurrentTaskID(i) = s
'				i = i + 1
'			End If
'		Next
'	End If
'End Sub