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
public anywheresoftware.b4a.objects.PanelWrapper _infoholder = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _screenimg = null;
public anywheresoftware.b4a.objects.EditTextWrapper _usernamefield = null;
public anywheresoftware.b4a.objects.EditTextWrapper _passwordfield = null;
public anywheresoftware.b4a.objects.ButtonWrapper _loginbtn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _singup = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.loginscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
__ref._wholescreen.Initialize(ba,"wholescr");
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="usernamefield.Initialize(\"username\")";
__ref._usernamefield.Initialize(ba,"username");
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="passwordfield.Initialize(\"password\")";
__ref._passwordfield.Initialize(ba,"password");
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="loginbtn.Initialize(\"login\")";
__ref._loginbtn.Initialize(ba,"login");
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="screenimg.Initialize(\"\")";
__ref._screenimg.Initialize(ba,"");
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="infoholder.Initialize(\"\")";
__ref._infoholder.Initialize(ba,"");
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="singup.Initialize(\"register\")";
__ref._singup.Initialize(ba,"register");
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub AsView As Panel";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Return wholescreen";
if (true) return __ref._wholescreen;
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return null;
}
public String  _buildui(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
__ref._screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"hotelappscreen.jpg").getObject()));
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="screenimg.Gravity = Gravity.FILL";
__ref._screenimg.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
__ref._wholescreen.AddView((android.view.View)(__ref._screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="wholescreen.Color = Colors.ARGB(150,0,0,0)";
__ref._wholescreen.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="infoholder.Color =  Colors.ARGB(150,0,0,0)";
__ref._infoholder.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="wholescreen.AddView(infoholder,30%x,100%y,40%x,30";
__ref._wholescreen.AddView((android.view.View)(__ref._infoholder.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (100),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
__ref._usernamefield.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="usernamefield.Color = Colors.White";
__ref._usernamefield.setColor(__c.Colors.White);
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="usernamefield.Text = Main.currentuser.username";
__ref._usernamefield.setText(BA.ObjectToCharSequence(_main._currentuser.username));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
__ref._usernamefield.setHintColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3801104;
 //BA.debugLineNum = 3801104;BA.debugLine="usernamefield.SingleLine = True";
__ref._usernamefield.setSingleLine(__c.True);
RDebugUtils.currentLine=3801105;
 //BA.debugLineNum = 3801105;BA.debugLine="usernamefield.TextColor = Colors.Black";
__ref._usernamefield.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3801106;
 //BA.debugLineNum = 3801106;BA.debugLine="infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x";
__ref._infoholder.AddView((android.view.View)(__ref._usernamefield.getObject()),__c.PerXToCurrent((float) (2.5),ba),__c.PerYToCurrent((float) (2.5),ba),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
__ref._passwordfield.setGravity(__c.Gravity.LEFT);
RDebugUtils.currentLine=3801109;
 //BA.debugLineNum = 3801109;BA.debugLine="passwordfield.Color = Colors.White";
__ref._passwordfield.setColor(__c.Colors.White);
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="passwordfield.Text = Main.currentuser.password";
__ref._passwordfield.setText(BA.ObjectToCharSequence(_main._currentuser.password));
RDebugUtils.currentLine=3801112;
 //BA.debugLineNum = 3801112;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
__ref._passwordfield.setHintColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="passwordfield.PasswordMode = True";
__ref._passwordfield.setPasswordMode(__c.True);
RDebugUtils.currentLine=3801114;
 //BA.debugLineNum = 3801114;BA.debugLine="passwordfield.SingleLine = True";
__ref._passwordfield.setSingleLine(__c.True);
RDebugUtils.currentLine=3801115;
 //BA.debugLineNum = 3801115;BA.debugLine="passwordfield.TextColor = Colors.Black";
__ref._passwordfield.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3801116;
 //BA.debugLineNum = 3801116;BA.debugLine="infoholder.AddView(passwordfield,2.5%x,(usernamef";
__ref._infoholder.AddView((android.view.View)(__ref._passwordfield.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((__ref._usernamefield.getTop()+__ref._usernamefield.getHeight())+__c.DipToCurrent((int) (10))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3801118;
 //BA.debugLineNum = 3801118;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
__ref._loginbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3801119;
 //BA.debugLineNum = 3801119;BA.debugLine="loginbtn.Color = Colors.White";
__ref._loginbtn.setColor(__c.Colors.White);
RDebugUtils.currentLine=3801120;
 //BA.debugLineNum = 3801120;BA.debugLine="loginbtn.Text = \"Login\"";
__ref._loginbtn.setText(BA.ObjectToCharSequence("Login"));
RDebugUtils.currentLine=3801121;
 //BA.debugLineNum = 3801121;BA.debugLine="loginbtn.TextSize = 20";
__ref._loginbtn.setTextSize((float) (20));
RDebugUtils.currentLine=3801122;
 //BA.debugLineNum = 3801122;BA.debugLine="loginbtn.Textcolor = Colors.Black";
__ref._loginbtn.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3801123;
 //BA.debugLineNum = 3801123;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._loginbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=3801124;
 //BA.debugLineNum = 3801124;BA.debugLine="infoholder.AddView(loginbtn,2.5%x,(passwordfield.";
__ref._infoholder.AddView((android.view.View)(__ref._loginbtn.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((__ref._passwordfield.getTop()+__ref._passwordfield.getHeight())+__c.PerYToCurrent((float) (5),ba)),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3801126;
 //BA.debugLineNum = 3801126;BA.debugLine="singup.Gravity = Gravity.CENTER";
__ref._singup.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3801127;
 //BA.debugLineNum = 3801127;BA.debugLine="singup.Color = Colors.White";
__ref._singup.setColor(__c.Colors.White);
RDebugUtils.currentLine=3801128;
 //BA.debugLineNum = 3801128;BA.debugLine="singup.Text = \"Sing up\"";
__ref._singup.setText(BA.ObjectToCharSequence("Sing up"));
RDebugUtils.currentLine=3801129;
 //BA.debugLineNum = 3801129;BA.debugLine="singup.TextSize = 20";
__ref._singup.setTextSize((float) (20));
RDebugUtils.currentLine=3801130;
 //BA.debugLineNum = 3801130;BA.debugLine="singup.Textcolor = Colors.Black";
__ref._singup.setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=3801131;
 //BA.debugLineNum = 3801131;BA.debugLine="HelperFunctions1.Apply_ViewStyle(singup,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._singup.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=3801132;
 //BA.debugLineNum = 3801132;BA.debugLine="infoholder.AddView(singup,2.5%x,(loginbtn.Top + l";
__ref._infoholder.AddView((android.view.View)(__ref._singup.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((__ref._loginbtn.getTop()+__ref._loginbtn.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3801134;
 //BA.debugLineNum = 3801134;BA.debugLine="infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,";
__ref._infoholder.SetLayoutAnimated((int) (1000),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
RDebugUtils.currentLine=3801135;
 //BA.debugLineNum = 3801135;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim infoholder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim screenimg As ImageView";
_screenimg = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="Dim usernamefield As EditText";
_usernamefield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Dim passwordfield As EditText";
_passwordfield = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Dim loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="Dim singup As Button";
_singup = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="End Sub";
return "";
}
public String  _login_click(b4a.example.loginscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="loginscreen";
if (Debug.shouldDelegate(ba, "login_click"))
	return (String) Debug.delegate(ba, "login_click", null);
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub login_Click";
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Log(Main.currentuser)";
__c.Log(BA.ObjectToString(_main._currentuser));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowUI");
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="End Sub";
return "";
}
}