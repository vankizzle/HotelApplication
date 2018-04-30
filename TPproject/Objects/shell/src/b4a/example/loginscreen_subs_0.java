package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class loginscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (loginscreen) ","loginscreen",7,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "loginscreen","asview", __ref);
 BA.debugLineNum = 26;BA.debugLine="Sub AsView As Panel";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="Return wholescreen";
Debug.ShouldStop(67108864);
if (true) return __ref.getField(false,"_wholescreen");
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("BuildUI (loginscreen) ","loginscreen",7,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "loginscreen","buildui", __ref);
 BA.debugLineNum = 30;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 32;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_screenimg").runVoidMethod ("SetBackgroundImageNew",(Object)((loginscreen.__c.runMethod(false,"LoadBitmap",(Object)(loginscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("hotelappscreen.jpg"))).getObject())));
 BA.debugLineNum = 33;BA.debugLine="screenimg.Gravity = Gravity.FILL";
Debug.ShouldStop(1);
__ref.getField(false,"_screenimg").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 34;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
Debug.ShouldStop(2);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenimg").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 35;BA.debugLine="wholescreen.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(4);
__ref.getField(false,"_wholescreen").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 38;BA.debugLine="infoholder.Color =  Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(32);
__ref.getField(false,"_infoholder").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 40;BA.debugLine="wholescreen.AddView(infoholder,30%x,100%y,40%x,30";
Debug.ShouldStop(128);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_infoholder").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 41;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
Debug.ShouldStop(256);
__ref.getField(false,"_usernamefield").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 42;BA.debugLine="usernamefield.Color = Colors.White";
Debug.ShouldStop(512);
__ref.getField(false,"_usernamefield").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 44;BA.debugLine="usernamefield.Text = Main.currentuser.username";
Debug.ShouldStop(2048);
__ref.getField(false,"_usernamefield").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(loginscreen._main._currentuser.getField(true,"username")));
 BA.debugLineNum = 45;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
Debug.ShouldStop(4096);
__ref.getField(false,"_usernamefield").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 46;BA.debugLine="usernamefield.SingleLine = True";
Debug.ShouldStop(8192);
__ref.getField(false,"_usernamefield").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="usernamefield.TextColor = Colors.Black";
Debug.ShouldStop(16384);
__ref.getField(false,"_usernamefield").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 48;BA.debugLine="infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x";
Debug.ShouldStop(32768);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernamefield").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2.5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2.5)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 50;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
Debug.ShouldStop(131072);
__ref.getField(false,"_passwordfield").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 51;BA.debugLine="passwordfield.Color = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_passwordfield").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 53;BA.debugLine="passwordfield.Text = Main.currentuser.password";
Debug.ShouldStop(1048576);
__ref.getField(false,"_passwordfield").runMethodAndSync(true,"setText",BA.ObjectToCharSequence(loginscreen._main._currentuser.getField(true,"password")));
 BA.debugLineNum = 54;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
Debug.ShouldStop(2097152);
__ref.getField(false,"_passwordfield").runMethod(true,"setHintColor",loginscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 55;BA.debugLine="passwordfield.PasswordMode = True";
Debug.ShouldStop(4194304);
__ref.getField(false,"_passwordfield").runVoidMethod ("setPasswordMode",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 56;BA.debugLine="passwordfield.SingleLine = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_passwordfield").runVoidMethod ("setSingleLine",loginscreen.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="passwordfield.TextColor = Colors.Black";
Debug.ShouldStop(16777216);
__ref.getField(false,"_passwordfield").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 58;BA.debugLine="infoholder.AddView(passwordfield,2.5%x,(usernamef";
Debug.ShouldStop(33554432);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_passwordfield").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2.5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_usernamefield").runMethod(true,"getTop"),__ref.getField(false,"_usernamefield").runMethod(true,"getHeight")}, "+",1, 1)),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 60;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_loginbtn").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 61;BA.debugLine="loginbtn.Color = Colors.White";
Debug.ShouldStop(268435456);
__ref.getField(false,"_loginbtn").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 62;BA.debugLine="loginbtn.Text = \"Login\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_loginbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Login"));
 BA.debugLineNum = 63;BA.debugLine="loginbtn.TextSize = 20";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_loginbtn").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 64;BA.debugLine="loginbtn.Textcolor = Colors.Black";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_loginbtn").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 65;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
Debug.ShouldStop(1);
loginscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_loginbtn").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(loginscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 77)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 255)))),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 66;BA.debugLine="infoholder.AddView(loginbtn,2.5%x,(passwordfield.";
Debug.ShouldStop(2);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_loginbtn").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2.5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_passwordfield").runMethod(true,"getTop"),__ref.getField(false,"_passwordfield").runMethod(true,"getHeight")}, "+",1, 1)),loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 68;BA.debugLine="singup.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
__ref.getField(false,"_singup").runMethod(true,"setGravity",loginscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 69;BA.debugLine="singup.Color = Colors.White";
Debug.ShouldStop(16);
__ref.getField(false,"_singup").runVoidMethod ("setColor",loginscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="singup.Text = \"Sing up\"";
Debug.ShouldStop(32);
__ref.getField(false,"_singup").runMethod(true,"setText",BA.ObjectToCharSequence("Sing up"));
 BA.debugLineNum = 71;BA.debugLine="singup.TextSize = 20";
Debug.ShouldStop(64);
__ref.getField(false,"_singup").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 72;BA.debugLine="singup.Textcolor = Colors.Black";
Debug.ShouldStop(128);
__ref.getField(false,"_singup").runMethod(true,"setTextColor",loginscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 73;BA.debugLine="HelperFunctions1.Apply_ViewStyle(singup,Colors.Bl";
Debug.ShouldStop(256);
loginscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_singup").getObject()),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(loginscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(loginscreen.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 77)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 255)))),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(loginscreen.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 74;BA.debugLine="infoholder.AddView(singup,2.5%x,(loginbtn.Top + l";
Debug.ShouldStop(512);
__ref.getField(false,"_infoholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_singup").getObject())),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2.5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_loginbtn").runMethod(true,"getTop"),__ref.getField(false,"_loginbtn").runMethod(true,"getHeight")}, "+",1, 1)),loginscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 35)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 76;BA.debugLine="infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,";
Debug.ShouldStop(2048);
__ref.getField(false,"_infoholder").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1000)),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(loginscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 3;BA.debugLine="Dim infoholder As Panel";
loginscreen._infoholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_infoholder",loginscreen._infoholder);
 //BA.debugLineNum = 4;BA.debugLine="Dim screenimg As ImageView";
loginscreen._screenimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_screenimg",loginscreen._screenimg);
 //BA.debugLineNum = 5;BA.debugLine="Dim usernamefield As EditText";
loginscreen._usernamefield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_usernamefield",loginscreen._usernamefield);
 //BA.debugLineNum = 6;BA.debugLine="Dim passwordfield As EditText";
loginscreen._passwordfield = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_passwordfield",loginscreen._passwordfield);
 //BA.debugLineNum = 7;BA.debugLine="Dim loginbtn As Button";
loginscreen._loginbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_loginbtn",loginscreen._loginbtn);
 //BA.debugLineNum = 8;BA.debugLine="Dim singup As Button";
loginscreen._singup = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_singup",loginscreen._singup);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (loginscreen) ","loginscreen",7,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "loginscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4096);
 BA.debugLineNum = 14;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("wholescr")));
 BA.debugLineNum = 15;BA.debugLine="usernamefield.Initialize(\"username\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_usernamefield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 16;BA.debugLine="passwordfield.Initialize(\"password\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_passwordfield").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("password")));
 BA.debugLineNum = 17;BA.debugLine="loginbtn.Initialize(\"login\")";
Debug.ShouldStop(65536);
__ref.getField(false,"_loginbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("login")));
 BA.debugLineNum = 18;BA.debugLine="screenimg.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_screenimg").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="infoholder.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_infoholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 20;BA.debugLine="singup.Initialize(\"register\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_singup").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("register")));
 BA.debugLineNum = 22;BA.debugLine="BuildUI";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4a.example.loginscreen.class, "_buildui");
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("login_Click (loginscreen) ","loginscreen",7,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("login_click")) return __ref.runUserSub(false, "loginscreen","login_click", __ref);
 BA.debugLineNum = 80;BA.debugLine="Sub login_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 84;BA.debugLine="Log(Main.currentuser)";
Debug.ShouldStop(524288);
loginscreen.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(loginscreen._main._currentuser)));
 BA.debugLineNum = 85;BA.debugLine="CallSub(Main,\"ShowUI\")";
Debug.ShouldStop(1048576);
loginscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((loginscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowUI")));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}