﻿B4A=true
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
'	usernamefield.Text = "s10yy9Ge"
	usernamefield.Text = "smoldelf@abv.bg"
	usernamefield.HintColor = Colors.DarkGray
	usernamefield.SingleLine = True
	usernamefield.TextColor = Colors.Black
	infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x,5%y)
	
	passwordfield.Gravity = Gravity.LEFT
	passwordfield.Color = Colors.White
	passwordfield.Hint = "Password"
'	passwordfield.Text = "ogwmjacz"
	passwordfield.Text = "a936157z"
	passwordfield.HintColor = Colors.DarkGray
	passwordfield.SingleLine = True
	passwordfield.TextColor = Colors.Black
	passwordfield.PasswordMode = True
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
'				result = result.Replace("userType"," ")
'				result = result.Replace("worker"," ")
'				result = result.Replace("userId"," ")
'				result = result.Replace(usernamefield.Text," ")
'				result = result.Replace("hotelName"," ")
'				result = result.Replace("email"," ")
'				result = result.Replace("null"," ")
'				result = result.Replace("busy"," ")
'				result = result.Replace("false"," ")
'				result = result.Replace("workerType"," ")
'				result = result.Replace("typeId"," ")
'				result = result.Replace("Type"," ")
'				result = result.Replace("name"," ")
'				result = result.Replace("Cooker"," ")
'					Log(result)
				result = result.Replace(" "," ")
				result = result.Replace("  "," ")
				result = result.Replace("   "," ")
				result = result.Replace("    "," ")
				result = result.Trim
				result = result.Replace("   "," ")
'				result = "X " & result
'				Log(result)
'				result = result.Replace(" ",",")
				Log(result)
				Dim results() As String
				results = Regex.Split(" ",result)
				If results(1) = 0 Then
					Types.currentuser.TypeOfWorker = 0
					Types.currentuser.username = usernamefield.Text
					Types.currentuser.available = True
					CallSub(Main,"SetNameLbl")
				Else
					Types.currentuser.TypeOfWorker = 1
					Types.currentuser.username = usernamefield.Text
					Types.currentuser.available = True
					CallSub(Main,"SetNameLbl")
				End If
					Log("Token-> " & results(4))
					Types.ResToken  = results(4)
			End If
				CallSub(Main,"ShowUI")
		End Select
		job1.Release
	End If
End Sub

Sub login_Click
	Login
End Sub

Sub Login
	LoginJob.Initialize("JobLogin", Me)
	Dim url As String = "https://hacktues.com/api/login"
	Dim jstr As String = Types.getJSONforLogin(usernamefield.Text,passwordfield.Text)
	Log(jstr)
	LoginJob.PostString(url,jstr)
	LoginJob.GetRequest.SetContentType("application/json")
	LoginJob.GetRequest.SetHeader("Accept","application/json")
End Sub
Sub setuser(u As user)
	Types.currentuser.username = u.username
	Types.currentuser.password = u.password
	Types.currentuser.available = u.available
	Types.currentuser.ID = u.ID
	Types.currentuser.TypeOfWorker = u.TypeOfWorker
	Types.currentuser.CurrentTaskID = u.CurrentTaskID
End Sub
