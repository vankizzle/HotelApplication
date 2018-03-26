package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,29);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 32;BA.debugLine="currentuser.Initialize";
Debug.ShouldStop(-2147483648);
main._currentuser.runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="currentuser.username = \"TestUser\"";
Debug.ShouldStop(1);
main._currentuser.setField ("username",BA.ObjectToString("TestUser"));
 BA.debugLineNum = 34;BA.debugLine="currentuser.password = \"testelsys1\"";
Debug.ShouldStop(2);
main._currentuser.setField ("password",BA.ObjectToString("testelsys1"));
 BA.debugLineNum = 35;BA.debugLine="currentuser.TypeOfWorker = 1   '<- 0 = not a work";
Debug.ShouldStop(4);
main._currentuser.setField ("TypeOfWorker",BA.numberCast(int.class, 1));
 BA.debugLineNum = 36;BA.debugLine="currentuser.available = True";
Debug.ShouldStop(8);
main._currentuser.setField ("available",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 37;BA.debugLine="currentuser.CurrentTaskID = 0";
Debug.ShouldStop(16);
main._currentuser.setField ("CurrentTaskID",BA.numberCast(int.class, 0));
 BA.debugLineNum = 39;BA.debugLine="LoginScr.Initialize";
Debug.ShouldStop(64);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 40;BA.debugLine="UIscreen.Initialize";
Debug.ShouldStop(128);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(LoginScr.AsView,0,0,100%x,100%y)";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 43;BA.debugLine="LoginScr.AsView.Visible = True";
Debug.ShouldStop(1024);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 45;BA.debugLine="Activity.AddView(UIscreen.AsView,0,0,100%x,100%y)";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 46;BA.debugLine="UIscreen.AsView.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,67);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);
RemoteObject _ext = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 67;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 69;BA.debugLine="Dim ext As Int = 0";
Debug.ShouldStop(16);
_ext = BA.numberCast(int.class, 0);Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 70;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 72;BA.debugLine="If UIscreen.asView.Visible = True Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 73;BA.debugLine="UIscreen.asView.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="LoginScr.asView.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 75;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(1024);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 76;BA.debugLine="LoginScr.loginbtn.Enabled = True";
Debug.ShouldStop(2048);
main.mostCurrent._loginscr.getField(false,"_loginbtn").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 79;BA.debugLine="ext = ext - 1";
Debug.ShouldStop(16384);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 81;BA.debugLine="If LoginScr.asView.Visible = True And ext = -1 T";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_ext,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 83;BA.debugLine="Dim result As Int";
Debug.ShouldStop(262144);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 84;BA.debugLine="result = Msgbox2(\"Exit application?\",\"Exit\",\"Ye";
Debug.ShouldStop(524288);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Exit application?")),(Object)(BA.ObjectToCharSequence("Exit")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 85;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 86;BA.debugLine="ExitApplication";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 };
 BA.debugLineNum = 91;BA.debugLine="Return True";
Debug.ShouldStop(67108864);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 94;BA.debugLine="Return False";
Debug.ShouldStop(536870912);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim LoginScr As LoginScreen";
main.mostCurrent._loginscr = RemoteObject.createNew ("b4a.example.loginscreen");
 //BA.debugLineNum = 25;BA.debugLine="Dim UIscreen As UserInterfaceMainScreen";
main.mostCurrent._uiscreen = RemoteObject.createNew ("b4a.example.userinterfacemainscreen");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
types_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
types.myClass = BA.getDeviceClass ("b4a.example.types");
userinterfacemainscreen.myClass = BA.getDeviceClass ("b4a.example.userinterfacemainscreen");
loginscreen.myClass = BA.getDeviceClass ("b4a.example.loginscreen");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim currentuser As currentuser";
main._currentuser = RemoteObject.createNew ("b4a.example.types._currentuser");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _showui() throws Exception{
try {
		Debug.PushSubsStack("ShowUI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("showui")) return b4a.example.main.remoteMe.runUserSub(false, "main","showui");
 BA.debugLineNum = 59;BA.debugLine="Sub ShowUI";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="If 	UIscreen.AsView.Visible = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 61;BA.debugLine="UIscreen.AsView.Visible = True";
Debug.ShouldStop(268435456);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 63;BA.debugLine="UIscreen.AsView.Visible = False";
Debug.ShouldStop(1073741824);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}