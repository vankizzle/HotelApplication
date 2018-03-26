package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",4,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "loginscreen","asview", __ref);
 BA.debugLineNum = 20;BA.debugLine="Sub AsView As Panel";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Return wholescreen";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(false,"_wholescreen");
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",4,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "loginscreen","buildui", __ref);
 BA.debugLineNum = 24;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="wholescreen.Color = Colors.Black";
Debug.ShouldStop(16777216);
__ref.getField(false,"_wholescreen").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 27;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
Debug.ShouldStop(67108864);
__ref.getField(false,"_usernamefield").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 28;BA.debugLine="usernamefield.Color = Colors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_usernamefield").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 30;BA.debugLine="usernamefield.Text = Main.currentuser.username";
Debug.ShouldStop(536870912);
__ref.getField(false,"_usernamefield").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(loginscreen._main._currentuser.getField(true,"username")));
 BA.debugLineNum = 31;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_usernamefield").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 32;BA.debugLine="usernamefield.SingleLine = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_usernamefield").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 33;BA.debugLine="usernamefield.TextColor = Colors.Black";
Debug.ShouldStop(1);
__ref.getField(false,"_usernamefield").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 34;BA.debugLine="wholescreen.AddView(usernamefield,30%x,30%y,40%x,";
Debug.ShouldStop(2);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernamefield").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 36;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
Debug.ShouldStop(8);
__ref.getField(false,"_passwordfield").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 37;BA.debugLine="passwordfield.Color = Colors.White";
Debug.ShouldStop(16);
__ref.getField(false,"_passwordfield").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="passwordfield.Text = Main.currentuser.password";
Debug.ShouldStop(64);
__ref.getField(false,"_passwordfield").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(loginscreen._main._currentuser.getField(true,"password")));
 BA.debugLineNum = 40;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
Debug.ShouldStop(128);
__ref.getField(false,"_passwordfield").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 41;BA.debugLine="passwordfield.PasswordMode = True";
Debug.ShouldStop(256);
__ref.getField(false,"_passwordfield").runVoidMethod ("setPasswordMode",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="passwordfield.SingleLine = True";
Debug.ShouldStop(512);
__ref.getField(false,"_passwordfield").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 43;BA.debugLine="passwordfield.TextColor = Colors.Black";
Debug.ShouldStop(1024);
__ref.getField(false,"_passwordfield").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 44;BA.debugLine="wholescreen.AddView(passwordfield,30%x,35%y + 5di";
Debug.ShouldStop(2048);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordfield").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba")),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 46;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(8192);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 47;BA.debugLine="loginbtn.Color = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_loginbtn").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 48;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 49;BA.debugLine="loginbtn.Textcolor = Colors.Black";
Debug.ShouldStop(65536);
__ref.getField(false,"_loginbtn").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 51;BA.debugLine="wholescreen.AddView(loginbtn,30%x,(passwordfield.";
Debug.ShouldStop(262144);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordfield").runMethod(true,"getTop"),__ref.getField(false,"_passwordfield").runMethod(true,"getHeight")}, "+",1, 1)),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim wholescreen As Panel";
loginscreen._wholescreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_wholescreen",loginscreen._wholescreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim usernamefield As EditText";
loginscreen._usernamefield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_usernamefield",loginscreen._usernamefield);
 //BA.debugLineNum = 4;BA.debugLine="Dim passwordfield As EditText";
loginscreen._passwordfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_passwordfield",loginscreen._passwordfield);
 //BA.debugLineNum = 5;BA.debugLine="Dim loginbtn As Button";
loginscreen._loginbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_loginbtn",loginscreen._loginbtn);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("wholescr")));
 BA.debugLineNum = 12;BA.debugLine="usernamefield.Initialize(\"username\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_usernamefield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 13;BA.debugLine="passwordfield.Initialize(\"password\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_passwordfield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("password")));
 BA.debugLineNum = 14;BA.debugLine="loginbtn.Initialize(\"login\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_loginbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("login")));
 BA.debugLineNum = 16;BA.debugLine="BuildUI";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.loginscreen.class, "_buildui");
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _login_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("login_Click (loginscreen) ","loginscreen",4,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("login_click")) return __ref.runUserSub(false, "loginscreen","login_click", __ref);
 BA.debugLineNum = 55;BA.debugLine="Sub login_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 59;BA.debugLine="Log(Main.currentuser)";
Debug.ShouldStop(67108864);
loginscreen.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(loginscreen._main._currentuser)));
 BA.debugLineNum = 60;BA.debugLine="CallSub(Main,\"ShowUI\")";
Debug.ShouldStop(134217728);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowUI")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}