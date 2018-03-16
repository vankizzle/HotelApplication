Type=StaticCode
Version=7.01
ModulesStructureVersion=1
B4A=true
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Type currentuser (username As String,password As String,available As Boolean,CurrentTaskID As Int)
	Type Task (TaskID As Int,TaskName As String,TaskType as Int,TaskInfo as String)
End Sub