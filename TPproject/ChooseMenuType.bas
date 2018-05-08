B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim PropertyWindowHolder As Panel
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	PropertyWindowHolder.Initialize("propwindow")
	BuildMenuPropertyWindow
End Sub
Sub BuildMenuPropertyWindow
	PropertyWindowHolder.Color = Colors.rgb(77, 77, 77)
'	wholescreen.AddView(PropertyWindowHolder,MenuHolder.Left,MenuHolder.Top,MenuHolder.Width,MenuHolder.Height)
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
	PropertyWindowHolder.AddView(optionholder,5%x,5%y,60%x+4dip,5%y)
	
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
	PropertyWindowHolder.AddView(optionholder1,5%x,10%y,60%x+4dip,5%y)
	
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
	PropertyWindowHolder.AddView(optionholder2,5%x,15%y,60%x+4dip,5%y)
	
	Dim OKbtn As Button
	OKbtn.Initialize("SelectedMenuType")
	OKbtn.Gravity = Gravity.CENTER
	OKbtn.Text = "OK"
	HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Black,Colors.rgb(0, 128, 255),Colors.White,Colors.rgb(0, 128, 255),Colors.Gray,Colors.Gray,Colors.Gray,10)
	PropertyWindowHolder.AddView(OKbtn,15%x,30%y,(60%x+4dip)/2,5%y)
End Sub
Sub AsView As View
	Return PropertyWindowHolder
End Sub
Sub SelectedMenuType_Click
	PropertyWindowHolder.Visible = False
End Sub