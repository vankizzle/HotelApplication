package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public static class _currentuser{
public boolean IsInitialized;
public String username;
public String password;
public boolean available;
public int TypeOfWorker;
public int[] CurrentTaskID;
public void Initialize() {
IsInitialized = true;
username = "";
password = "";
available = false;
TypeOfWorker = 0;
CurrentTaskID = new int[(int) (3)];
;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _task{
public boolean IsInitialized;
public int TaskID;
public String TaskName;
public int TaskType;
public String TaskInfo;
public void Initialize() {
IsInitialized = true;
TaskID = 0;
TaskName = "";
TaskType = 0;
TaskInfo = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Type currentuser (username As String,password As";
;
 //BA.debugLineNum = 7;BA.debugLine="Type Task (TaskID As Int,TaskName As String,TaskT";
;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
}
