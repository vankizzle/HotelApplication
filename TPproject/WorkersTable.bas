B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
Sub Class_Globals
	Dim WholeScreen As Panel
	Dim WorkersHolder As MiScrollView
	Dim TableHeader As Panel
	Dim TableName As Label
	Dim TableFakePan As Panel
'	Dim FinishBtn As Button
	Dim MapOfView As Map

	Dim chekboxtag As Int = 0

End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	WholeScreen.Initialize("")
	WorkersHolder.Initialize
	TableHeader.Initialize("")
	TableName.Initialize("")
	TableFakePan.initialize("")
'	FinishBtn.Initialize("Finish")
	MapOfView.Initialize
	
	BuildUI
End Sub

Sub BuildUI
	TableFakePan.Color = Colors.ARGB(150,0,0,0)
	TableHeader.Color = Colors.ARGB(150,0,0,0)
'	FinishBtn.Color = Colors.rgb(41, 163, 41)
'	FinishBtn.Gravity =Gravity.CENTER
'	FinishBtn.Text = "Finish"
'	FinishBtn.TextSize = 25
'	FinishBtn.Enabled = False
	WholeScreen.AddView(TableHeader,10%x,15%y,80%x,5%y)
	WholeScreen.AddView(TableFakePan,TableHeader.Left,TableHeader.Top+TableHeader.Height,TableHeader.Width,60%y)
	WholeScreen.AddView(WorkersHolder.ScrollView,TableHeader.Left,TableHeader.Top+TableHeader.Height,TableHeader.Width,TableFakePan.Height)
'	WholeScreen.AddView(FinishBtn,TaskHeader.Left,TaskFakePan.top + TaskFakePan.Height,TaskFakePan.Width,10%y)
	TableName.Gravity = Gravity.CENTER
	TableName.Text = "My Workers"
	TableName.TextColor = Colors.White
	TableName.TextSize = 15
	TableHeader.AddView(TableName,TableHeader.Left + 10%x,0,TableHeader.Width/2,TableHeader.Height)
End Sub

Sub AsView As View
	Return WholeScreen
End Sub

Public Sub GetMyWorkers(Workers As Map)
	For Each w As worker In Workers.Values
		PanBuilder(w.username,w.available,w.TypeOfWorker,w.CurrentTaskID)
	Next
End Sub

Sub PanBuilder(username As String,available As Boolean,TypeOfWorker As Int,CurrentTaskID As Int) As Panel
	Dim Holder As Panel
	Holder.Initialize("")
	Dim header As Panel
	header.Initialize("")
	Dim lblName As Label
	lblName.Initialize("")
	Dim ViewCurrentTaskID As MiScrollView
	ViewCurrentTaskID.Initialize
	Dim lblAvaileable As Label
	lblAvaileable.Initialize("")
	Dim lblTypeOfWorker As Label
	lblTypeOfWorker.Initialize("")
	Dim checked As CheckBox
	checked.Initialize("finished")
	Holder.AddView(header,0,0,80%x,5%y)
	
	header.Color = Colors.rgb(0, 128, 255)
	Holder.Tag = chekboxtag
	checked.Tag = chekboxtag
	checked.Gravity = Gravity.CENTER
	header.AddView(checked,70%x,0,10%x,5%y)
	
	lblName.Color = Colors.rgb(0, 128, 255)
	lblName.Text = username
	lblName.TextSize = 20
	lblName.TextColor = Colors.White
	lblName.Gravity = Gravity.CENTER
	header.AddView(lblName,20%x,0,40%x,5%y)
	
	lblTypeOfWorker.Text = TypeOfWorker
	header.AddView(lblTypeOfWorker,5%x,0,5%x,5%y)
	lblTypeOfWorker.Visible = False
	
	lblAvaileable.Text = available
	lblAvaileable.TextSize = 15
	lblAvaileable.TextColor = Colors.White
	lblAvaileable.Color = Colors.rgb(0, 128, 255)
	
	Holder.AddView(ViewCurrentTaskID.ScrollView,0%x,5%y,80%x,10%y)
	MapOfView.Put(checked.Tag,Holder)
	chekboxtag = chekboxtag + 1
	Return Holder
End Sub

Sub finished_CheckedChange(Checked As Boolean)
	
End Sub
