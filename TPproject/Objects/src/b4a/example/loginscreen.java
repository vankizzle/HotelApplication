package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.loginscreen.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernamefield = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordfield = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public String  _initialize(b4a.example.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
__ref._wholescreen.Initialize(ba,"wholescr");
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="usernamefield.Initialize(\"username\")";
__ref._usernamefield.Initialize(ba,"username");
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="passwordfield.Initialize(\"password\")";
__ref._passwordfield.Initialize(ba,"password");
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="loginbtn.Initialize(\"login\")";
__ref._loginbtn.Initialize(ba,"login");
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub AsView As Panel";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Return wholescreen";
if (true) return __ref._wholescreen;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="wholescreen.Color = Colors.Black";
__ref._wholescreen.setColor(__c.Colors.Black);
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
__ref._usernamefield.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="usernamefield.Color = Colors.White";
__ref._usernamefield.setColor(__c.Colors.White);
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="usernamefield.Text = Main.currentuser.username";
__ref._usernamefield.setText(BA.ObjectToCharSequence(_main._currentuser.username));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
__ref._usernamefield.setHintColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="usernamefield.SingleLine = True";
__ref._usernamefield.setSingleLine(__c.True);
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="usernamefield.TextColor = Colors.Black";
__ref._usernamefield.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="wholescreen.AddView(usernamefield,30%x,30%y,40%x,";
__ref._wholescreen.AddView((android.view.View)(__ref._usernamefield.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
__ref._passwordfield.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="passwordfield.Color = Colors.White";
__ref._passwordfield.setColor(__c.Colors.White);
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="passwordfield.Text = Main.currentuser.password";
__ref._passwordfield.setText(BA.ObjectToCharSequence(_main._currentuser.password));
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
__ref._passwordfield.setHintColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="passwordfield.PasswordMode = True";
__ref._passwordfield.setPasswordMode(__c.True);
RDebugUtils.currentLine=1441810;
 //BA.debugLineNum = 1441810;BA.debugLine="passwordfield.SingleLine = True";
__ref._passwordfield.setSingleLine(__c.True);
RDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="passwordfield.TextColor = Colors.Black";
__ref._passwordfield.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="wholescreen.AddView(passwordfield,30%x,35%y + 5di";
__ref._wholescreen.AddView((android.view.View)(__ref._passwordfield.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (__c.PerYToCurrent((float) (35),ba)+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
__ref._loginbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1441815;
 //BA.debugLineNum = 1441815;BA.debugLine="loginbtn.Color = Colors.White";
__ref._loginbtn.setColor(__c.Colors.White);
RDebugUtils.currentLine=1441816;
 //BA.debugLineNum = 1441816;BA.debugLine="loginbtn.Text = \"Login\"";
__ref._loginbtn.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="loginbtn.Textcolor = Colors.Black";
__ref._loginbtn.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="wholescreen.AddView(loginbtn,30%x,(passwordfield.";
__ref._wholescreen.AddView((android.view.View)(__ref._loginbtn.getObject()),__c.PerXToCurrent((float) (30),ba),(int) ((__ref._passwordfield.getTop()+__ref._passwordfield.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim usernamefield As EditText";
_usernamefield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Dim passwordfield As EditText";
_passwordfield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Dim loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return "";
}
public String  _login_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "login_click"))
	return (String) Debug.delegate(ba, "login_click", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub login_Click";
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Log(Main.currentuser)";
__c.Log(BA.ObjectToString(_main._currentuser));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowUI");
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="End Sub";
return "";
}
}