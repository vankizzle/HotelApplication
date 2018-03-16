Type=Class
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
Sub Class_Globals
	Dim  wholescreen As Panel
	
	Dim usernamelbl As Label
	Dim availability As Label
	
	Dim tableofrequests As ScrollView
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	wholescreen.Initialize("screenview")
	wholescreen.Color = Colors.Black
	
	usernamelbl.Initialize("username")
	availability.Initialize("avail")
	tableofrequests.Initialize(100%y)
	
	BuildUI
End Sub

Sub BuildUI
	usernamelbl.Textcolor = Colors.White
	usernamelbl.Gravity = Gravity.CENTER
	usernamelbl.Text = Main.currentuser.username
	usernamelbl.TextSize = 30
	wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%y)
	
	availability.TextColor = Colors.White
	availability.Gravity = Gravity.CENTER
	availability.TextSize = 25
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	wholescreen.AddView(availability,40%x,5%y,50%x,10%y)
	
	tableofrequests.Color = Colors.White
	wholescreen.AddView(tableofrequests,10%x,15%y,80%x,70%y)
	
End Sub

Sub AsView As Panel
	Return wholescreen
End Sub

Sub avail_Click
	If Main.currentuser.available = False Then
		Main.currentuser.available = True
	Else
		Main.currentuser.available = False
	End If
	
	If Main.currentuser.available = False Then
		availability.Text = "Status: Busy"
	Else
		availability.Text = "Status: Available"
	End If
	
End Sub