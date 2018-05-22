B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.01
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Type user (username As String,password As String,available As Boolean,TypeOfWorker As Int,CurrentTaskID(3) As Int,ID As Int, workers As List)
	Type worker (username As String,password As String,available As Boolean,TypeOfWorker As Int,CurrentTaskID(3) As Int)
	Type Task (TaskID As Int,TaskName As String,TaskType As Int,TaskInfo As String) 'task type -> 1 = for cleaners,2 = for cooks,3 = for waiters
	
	Public currentuser As user 
	Public userslist As Map
End Sub

Public Sub Isboss As Boolean
	If currentuser.TypeOfWorker = 0 Then
		Return True
	Else
		Return False
	End If
End Sub