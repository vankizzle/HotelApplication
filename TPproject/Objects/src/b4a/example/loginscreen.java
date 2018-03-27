package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.loginscreen");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernamefield = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordfield = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 21;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 25;BA.debugLine="wholescreen.Color = Colors.rgb(0, 138, 230)";
_wholescreen.setColor(__c.Colors.RGB((int) (0),(int) (138),(int) (230)));
 //BA.debugLineNum = 27;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
_usernamefield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 28;BA.debugLine="usernamefield.Color = Colors.White";
_usernamefield.setColor(__c.Colors.White);
 //BA.debugLineNum = 30;BA.debugLine="usernamefield.Text = Main.currentuser.username";
_usernamefield.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 31;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
_usernamefield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 32;BA.debugLine="usernamefield.SingleLine = True";
_usernamefield.setSingleLine(__c.True);
 //BA.debugLineNum = 33;BA.debugLine="usernamefield.TextColor = Colors.Black";
_usernamefield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 34;BA.debugLine="wholescreen.AddView(usernamefield,30%x,30%y,40%x,";
_wholescreen.AddView((android.view.View)(_usernamefield.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 36;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
_passwordfield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 37;BA.debugLine="passwordfield.Color = Colors.White";
_passwordfield.setColor(__c.Colors.White);
 //BA.debugLineNum = 39;BA.debugLine="passwordfield.Text = Main.currentuser.password";
_passwordfield.setText(BA.ObjectToCharSequence(_main._currentuser.password));
 //BA.debugLineNum = 40;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
_passwordfield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 41;BA.debugLine="passwordfield.PasswordMode = True";
_passwordfield.setPasswordMode(__c.True);
 //BA.debugLineNum = 42;BA.debugLine="passwordfield.SingleLine = True";
_passwordfield.setSingleLine(__c.True);
 //BA.debugLineNum = 43;BA.debugLine="passwordfield.TextColor = Colors.Black";
_passwordfield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 44;BA.debugLine="wholescreen.AddView(passwordfield,30%x,35%y + 5di";
_wholescreen.AddView((android.view.View)(_passwordfield.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (__c.PerYToCurrent((float) (35),ba)+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 46;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 47;BA.debugLine="loginbtn.Color = Colors.White";
_loginbtn.setColor(__c.Colors.White);
 //BA.debugLineNum = 48;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 49;BA.debugLine="loginbtn.Textcolor = Colors.Black";
_loginbtn.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 50;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.White,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 51;BA.debugLine="wholescreen.AddView(loginbtn,30%x,(passwordfield.";
_wholescreen.AddView((android.view.View)(_loginbtn.getObject()),__c.PerXToCurrent((float) (30),ba),(int) ((_passwordfield.getTop()+_passwordfield.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim usernamefield As EditText";
_usernamefield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim passwordfield As EditText";
_passwordfield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
_wholescreen.Initialize(ba,"wholescr");
 //BA.debugLineNum = 12;BA.debugLine="usernamefield.Initialize(\"username\")";
_usernamefield.Initialize(ba,"username");
 //BA.debugLineNum = 13;BA.debugLine="passwordfield.Initialize(\"password\")";
_passwordfield.Initialize(ba,"password");
 //BA.debugLineNum = 14;BA.debugLine="loginbtn.Initialize(\"login\")";
_loginbtn.Initialize(ba,"login");
 //BA.debugLineNum = 16;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub login_Click";
 //BA.debugLineNum = 59;BA.debugLine="Log(Main.currentuser)";
__c.Log(BA.ObjectToString(_main._currentuser));
 //BA.debugLineNum = 60;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowUI");
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
