B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim TaskHolder As MiScrollView
	Dim TaskHeader As Panel
	Dim TableName As Label
	Dim TaskFakePan As Panel
	Dim FinishBtn As Button
	Dim MapOfView As Map
	Dim ViewToRemove As Map
	Dim chekboxtag As Int = 0
	Dim checkNumbers As Int = 0
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	TaskHolder.Initialize
	TaskHeader.Initialize("")
	TableName.Initialize("")
	TaskFakePan.initialize("")
	FinishBtn.Initialize("Finish")
	MapOfView.Initialize
	ViewToRemove.Initialize
	BuildUI
End Sub

Sub BuildUI
	TaskFakePan.Color = Colors.ARGB(150,0,0,0)
	TaskHeader.Color = Colors.ARGB(150,0,0,0)
	FinishBtn.Color = Colors.rgb(41, 163, 41)
	FinishBtn.Gravity =Gravity.CENTER
	FinishBtn.Text = "Finish"
	FinishBtn.TextSize = 25
	FinishBtn.Enabled = False
	WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y)
	WholeScreen.AddView(TaskFakePan,TaskHeader.Left,TaskHeader.Top+TaskHeader.Height,TaskHeader.Width,60%y)
	WholeScreen.AddView(TaskHolder.ScrollView,TaskHeader.Left,TaskHeader.Top+TaskHeader.Height,TaskHeader.Width,TaskFakePan.Height)
	WholeScreen.AddView(FinishBtn,TaskHeader.Left,TaskFakePan.top + TaskFakePan.Height,TaskFakePan.Width,10%y)
	TableName.Gravity = Gravity.CENTER
	TableName.Text = "My Tasks"
	TableName.TextColor = Colors.White
	TableName.TextSize = 15
	TaskHeader.AddView(TableName,TaskHeader.Left + 10%x,0,TaskHeader.Width/2,TaskHeader.Height)
End Sub

Sub AsView As View
	Return WholeScreen
End Sub

Public Sub GetMyTasks(AcceptedTasks As Map)
	For i = 0 To MapOfView.Size
		MapOfView.Remove(i)
	Next
	TaskHolder.removeAllViews
	For Each v As Task In AcceptedTasks.Values
		
		TaskHolder.addView(PanBuilder(v.TaskName,v.TaskType,v.TaskInfo,v.TaskID),80%x,15%y,0,0,0,2dip)
	Next

End Sub

Sub PanBuilder(Name As String,TaskType As Int,Info As String,ID As Int) As Panel
	Dim Holder As Panel
	Holder.Initialize("")
'	Dim lblID As Label
'	lblID.Initialize("")
	Dim header As Panel
	header.Initialize("")
	Dim lblName As Label
	lblName.Initialize("")
	Dim ViewInfo As MiScrollView
	ViewInfo.Initialize
	Dim lblInfo As Label
	lblInfo.Initialize("")
	Dim lblID As Label
	lblID.Initialize("")
	Dim checked As CheckBox
	checked.Initialize("finished")
	Holder.AddView(header,0,0,80%x,5%y)
	
	header.Color = Colors.rgb(0, 128, 255)
	Holder.Tag = chekboxtag
	checked.Tag = chekboxtag
	checked.Gravity = Gravity.CENTER
	header.AddView(checked,70%x,0,10%x,5%y)
	
	lblName.Color = Colors.rgb(0, 128, 255)
	lblName.Text = Name
	lblName.TextSize = 20
	lblName.TextColor = Colors.White
	lblName.Gravity = Gravity.CENTER
	header.AddView(lblName,20%x,0,40%x,5%y)
	
	lblID.Text = ID
	header.AddView(lblID,5%x,0,5%x,5%y)
	lblID.Visible = False
	
	lblInfo.Text = Info
	lblInfo.TextSize = 15
	lblInfo.TextColor = Colors.White
	lblInfo.Color = Colors.rgb(0, 128, 255)
	
	Holder.AddView(ViewInfo.ScrollView,0%x,5%y,80%x,10%y)
	ViewInfo.addView(lblInfo,80%x,15%y,0,0,0,0)
	MapOfView.Put(checked.Tag,Holder)
	chekboxtag = chekboxtag + 1
	Return Holder
End Sub

Sub finished_CheckedChange(Checked As Boolean)
	Dim cbox As CheckBox = Sender

If Checked = True Then
	FinishBtn.Enabled = True
	checkNumbers = checkNumbers + 1
	For Each k As Int In MapOfView.Keys
			If cbox.Tag = k Then
				ToastMessageShow("You selected task " & k,False)
				ViewToRemove.Put(k,MapOfView.Get(k))
		    End If
	Next
Else
	Checked = False
	checkNumbers = checkNumbers - 1
	ViewToRemove.Remove(cbox.tag)
	
	If 	checkNumbers = 0 Then
			FinishBtn.Enabled = False
	End If
	
End If
	Log("Checked = "& checkNumbers)
End Sub

Sub Finish_Click
	Log(ViewToRemove)
	Log(MapOfView)
	
	For i = 0 To ViewToRemove.Size - 1
		Types.currentuser.CurrentTaskID(i) = 0
	Next
	
	Types.currentuser.CurrentTaskID(0) = 5
	For Each k As Int In ViewToRemove.Keys
		If MapOfView.ContainsKey(k) Then
			MapOfView.Remove(k)
		End If
	Next
	
	For Each v As Panel In ViewToRemove.Values
		v.RemoveAllViews
		v.RemoveView
	Next
	
	ViewToRemove.Clear

	Log("???????????????")
	Log(ViewToRemove)
	Log(MapOfView)
	
	FinishBtn.Enabled = False
	
	If MapOfView.Size = 0 Then
		MapOfView.Clear
		ViewToRemove.Clear
		CallSub(Main,"SetUserAvailable")
	End If
End Sub