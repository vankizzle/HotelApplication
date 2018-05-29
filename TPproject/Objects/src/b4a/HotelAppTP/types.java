package b4a.HotelAppTP;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class types {
private static types mostCurrent = new types();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.HotelAppTP.types._user _currentuser = null;
public static anywheresoftware.b4a.objects.collections.Map _userslist = null;
public static String _restoken = "";
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.HotelAppTP.main _main = null;
public b4a.HotelAppTP.helperfunctions1 _helperfunctions1 = null;
public b4a.HotelAppTP.starter _starter = null;
public static class _user{
public boolean IsInitialized;
public String username;
public String password;
public boolean available;
public int TypeOfWorker;
public int[] CurrentTaskID;
public int ID;
public anywheresoftware.b4a.objects.collections.List workers;
public void Initialize() {
IsInitialized = true;
username = "";
password = "";
available = false;
TypeOfWorker = 0;
CurrentTaskID = new int[(int) (3)];
;
ID = 0;
workers = new anywheresoftware.b4a.objects.collections.List();
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
public static String  _getjsonforlogin(anywheresoftware.b4a.BA _ba,String _email,String _password) throws Exception{
anywheresoftware.b4a.objects.collections.Map _keyvalue = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _ojsongenerator2 = null;
 //BA.debugLineNum = 22;BA.debugLine="Sub getJSONforLogin(email As String,password As St";
 //BA.debugLineNum = 23;BA.debugLine="Dim keyValue As Map = CreateMap(\"email\":email,\"pa";
_keyvalue = new anywheresoftware.b4a.objects.collections.Map();
_keyvalue = anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("email"),(Object)(_email),(Object)("password"),(Object)(_password)});
 //BA.debugLineNum = 24;BA.debugLine="Dim oJSONGenerator2 As JSONGenerator";
_ojsongenerator2 = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 25;BA.debugLine="oJSONGenerator2.Initialize(keyValue)";
_ojsongenerator2.Initialize(_keyvalue);
 //BA.debugLineNum = 26;BA.debugLine="Return oJSONGenerator2.ToString";
if (true) return _ojsongenerator2.ToString();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public static boolean  _isboss(anywheresoftware.b4a.BA _ba) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Isboss As Boolean";
 //BA.debugLineNum = 15;BA.debugLine="If currentuser.TypeOfWorker = 0 Then";
if (_currentuser.TypeOfWorker==0) { 
 //BA.debugLineNum = 16;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 18;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Type user (username As String,password As String,";
;
 //BA.debugLineNum = 7;BA.debugLine="Type Task (TaskID As Int,TaskName As String,TaskT";
;
 //BA.debugLineNum = 9;BA.debugLine="Public currentuser As user";
_currentuser = new b4a.HotelAppTP.types._user();
 //BA.debugLineNum = 10;BA.debugLine="Public userslist As Map";
_userslist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Public ResToken As String";
_restoken = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
}
