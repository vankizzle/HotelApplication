package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 34;BA.debugLine="currentuser.Initialize";
Debug.ShouldStop(2);
main._currentuser.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="currentuser.username = \"TestUser\"";
Debug.ShouldStop(4);
main._currentuser.setField ("username",BA.ObjectToString("TestUser"));
 BA.debugLineNum = 36;BA.debugLine="currentuser.password = \"testelsys1\"";
Debug.ShouldStop(8);
main._currentuser.setField ("password",BA.ObjectToString("testelsys1"));
 BA.debugLineNum = 37;BA.debugLine="currentuser.TypeOfWorker = 1   '<- 0 = not a work";
Debug.ShouldStop(16);
main._currentuser.setField ("TypeOfWorker",BA.numberCast(int.class, 1));
 BA.debugLineNum = 38;BA.debugLine="currentuser.available = True";
Debug.ShouldStop(32);
main._currentuser.setField ("available",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="LoginScr.Initialize";
Debug.ShouldStop(256);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 42;BA.debugLine="UIscreen.Initialize";
Debug.ShouldStop(512);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 43;BA.debugLine="TableTasks.Initialize";
Debug.ShouldStop(1024);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 44;BA.debugLine="UserTasks.Initialize";
Debug.ShouldStop(2048);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_initialize",main.mostCurrent.activityBA);
 BA.debugLineNum = 46;BA.debugLine="Activity.AddView(LoginScr.AsView,0,0,100%x,100%y)";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 47;BA.debugLine="LoginScr.AsView.Visible = True";
Debug.ShouldStop(16384);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 49;BA.debugLine="Activity.AddView(UIscreen.AsView,0,0,100%x,100%y)";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 50;BA.debugLine="UIscreen.AsView.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 53;BA.debugLine="Activity.AddView(TableTasks.AsView,0,0,100%x,100%";
Debug.ShouldStop(1048576);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 54;BA.debugLine="TableTasks.AsView.Visible = False";
Debug.ShouldStop(2097152);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="Activity.AddView(UserTasks.AsView,0,0,100%x,100%y";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 57;BA.debugLine="UserTasks.AsView.Visible = False";
Debug.ShouldStop(16777216);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,102);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);
RemoteObject _ext = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 102;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="Dim ext As Int = 0";
Debug.ShouldStop(128);
_ext = BA.numberCast(int.class, 0);Debug.locals.put("ext", _ext);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 105;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 107;BA.debugLine="If UIscreen.asView.Visible = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 108;BA.debugLine="UIscreen.asView.Visible = False";
Debug.ShouldStop(2048);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="LoginScr.asView.Visible = True";
Debug.ShouldStop(4096);
main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 110;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(8192);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 111;BA.debugLine="LoginScr.loginbtn.Enabled = True";
Debug.ShouldStop(16384);
main.mostCurrent._loginscr.getField(false,"_loginbtn").runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 114;BA.debugLine="If TableTasks.AsView.Visible = True Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 115;BA.debugLine="TableTasks.AsView.Visible = False";
Debug.ShouldStop(262144);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 116;BA.debugLine="UIscreen.asView.Visible = True";
Debug.ShouldStop(524288);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="UIscreen.MenuHolder.Visible = True";
Debug.ShouldStop(1048576);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 118;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(2097152);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 };
 BA.debugLineNum = 121;BA.debugLine="If UserTasks.AsView.Visible = True Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 122;BA.debugLine="UserTasks.AsView.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 123;BA.debugLine="UIscreen.asView.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 124;BA.debugLine="UIscreen.MenuHolder.Visible = True";
Debug.ShouldStop(134217728);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 125;BA.debugLine="ext = ext + 1";
Debug.ShouldStop(268435456);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("ext", _ext);
 };
 BA.debugLineNum = 127;BA.debugLine="ext = ext - 1";
Debug.ShouldStop(1073741824);
_ext = RemoteObject.solve(new RemoteObject[] {_ext,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("ext", _ext);
 BA.debugLineNum = 129;BA.debugLine="If LoginScr.asView.Visible = True And ext = -1 T";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main.mostCurrent._loginscr.runClassMethod (b4a.example.loginscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_ext,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 131;BA.debugLine="Dim result As Int";
Debug.ShouldStop(4);
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 132;BA.debugLine="result = Msgbox2(\"Exit application?\",\"Exit\",\"Ye";
Debug.ShouldStop(8);
_result = main.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Exit application?")),(Object)(BA.ObjectToCharSequence("Exit")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("Cancel")),(Object)(BA.ObjectToString("")),(Object)((main.mostCurrent.__c.getField(false,"Null"))),main.mostCurrent.activityBA);Debug.locals.put("result", _result);
 BA.debugLineNum = 133;BA.debugLine="If result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 134;BA.debugLine="ExitApplication";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("ExitApplication");
 };
 };
 BA.debugLineNum = 139;BA.debugLine="Return True";
Debug.ShouldStop(1024);
if (true) return main.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 142;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return main.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,65);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 65;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 61;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
 //BA.debugLineNum = 26;BA.debugLine="Dim TableTasks As TaskTable";
main.mostCurrent._tabletasks = RemoteObject.createNew ("b4a.example.tasktable");
 //BA.debugLineNum = 27;BA.debugLine="Dim UserTasks As MyTasks";
main.mostCurrent._usertasks = RemoteObject.createNew ("b4a.example.mytasks");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
types_subs_0._process_globals();
helperfunctions1_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
types.myClass = BA.getDeviceClass ("b4a.example.types");
userinterfacemainscreen.myClass = BA.getDeviceClass ("b4a.example.userinterfacemainscreen");
loginscreen.myClass = BA.getDeviceClass ("b4a.example.loginscreen");
helperfunctions1.myClass = BA.getDeviceClass ("b4a.example.helperfunctions1");
tasktable.myClass = BA.getDeviceClass ("b4a.example.tasktable");
mytasks.myClass = BA.getDeviceClass ("b4a.example.mytasks");
		
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
public static RemoteObject  _showmytasks() throws Exception{
try {
		Debug.PushSubsStack("ShowMyTasks (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,68);
if (RapidSub.canDelegate("showmytasks")) return b4a.example.main.remoteMe.runUserSub(false, "main","showmytasks");
 BA.debugLineNum = 68;BA.debugLine="Sub ShowMyTasks";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="If UserTasks.AsView.Visible = False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 70;BA.debugLine="UserTasks.AsView.Visible = True";
Debug.ShouldStop(32);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 71;BA.debugLine="UIscreen.MenuHolder.Visible = False";
Debug.ShouldStop(64);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 73;BA.debugLine="UserTasks.AsView.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="UIscreen.MenuHolder.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showtasktable() throws Exception{
try {
		Debug.PushSubsStack("ShowTaskTable (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("showtasktable")) return b4a.example.main.remoteMe.runUserSub(false, "main","showtasktable");
 BA.debugLineNum = 77;BA.debugLine="Sub ShowTaskTable";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="If TableTasks.AsView.Visible = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 79;BA.debugLine="TableTasks.AsView.Visible = True";
Debug.ShouldStop(16384);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="UIscreen.MenuHolder.Visible = False";
Debug.ShouldStop(32768);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 82;BA.debugLine="TableTasks.AsView.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 83;BA.debugLine="UIscreen.MenuHolder.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._uiscreen.getField(false,"_menuholder").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showui() throws Exception{
try {
		Debug.PushSubsStack("ShowUI (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,92);
if (RapidSub.canDelegate("showui")) return b4a.example.main.remoteMe.runUserSub(false, "main","showui");
 BA.debugLineNum = 92;BA.debugLine="Sub ShowUI";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="ProgressDialogShow(\"Loading...\")";
Debug.ShouldStop(268435456);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",main.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Loading..."))));
 BA.debugLineNum = 94;BA.debugLine="If 	UIscreen.AsView.Visible = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 95;BA.debugLine="UIscreen.AsView.Visible = True";
Debug.ShouldStop(1073741824);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 97;BA.debugLine="UIscreen.AsView.Visible = False";
Debug.ShouldStop(1);
main.mostCurrent._uiscreen.runClassMethod (b4a.example.userinterfacemainscreen.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 99;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tasktabletomytasks() throws Exception{
try {
		Debug.PushSubsStack("TaskTableToMyTasks (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("tasktabletomytasks")) return b4a.example.main.remoteMe.runUserSub(false, "main","tasktabletomytasks");
 BA.debugLineNum = 86;BA.debugLine="Sub TaskTableToMyTasks";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="If TableTasks.AsView.Visible = True Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 88;BA.debugLine="TableTasks.AsView.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._tabletasks.runClassMethod (b4a.example.tasktable.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="UserTasks.AsView.Visible = True";
Debug.ShouldStop(16777216);
main.mostCurrent._usertasks.runClassMethod (b4a.example.mytasks.class, "_asview").runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}