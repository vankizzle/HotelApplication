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
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 27;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 32;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
_screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"hotelappscreen.jpg").getObject()));
 //BA.debugLineNum = 33;BA.debugLine="screenimg.Gravity = Gravity.FILL";
_screenimg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 34;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
_wholescreen.AddView((android.view.View)(_screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
 //BA.debugLineNum = 35;BA.debugLine="wholescreen.Color = Colors.ARGB(150,0,0,0)";
_wholescreen.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 38;BA.debugLine="infoholder.Color =  Colors.ARGB(150,0,0,0)";
_infoholder.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 40;BA.debugLine="wholescreen.AddView(infoholder,30%x,100%y,40%x,30";
_wholescreen.AddView((android.view.View)(_infoholder.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (100),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 41;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
_usernamefield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 42;BA.debugLine="usernamefield.Color = Colors.White";
_usernamefield.setColor(__c.Colors.White);
 //BA.debugLineNum = 44;BA.debugLine="usernamefield.Text = Main.currentuser.username";
_usernamefield.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 45;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
_usernamefield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 46;BA.debugLine="usernamefield.SingleLine = True";
_usernamefield.setSingleLine(__c.True);
 //BA.debugLineNum = 47;BA.debugLine="usernamefield.TextColor = Colors.Black";
_usernamefield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 48;BA.debugLine="infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x";
_infoholder.AddView((android.view.View)(_usernamefield.getObject()),__c.PerXToCurrent((float) (2.5),ba),__c.PerYToCurrent((float) (2.5),ba),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 50;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
_passwordfield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 51;BA.debugLine="passwordfield.Color = Colors.White";
_passwordfield.setColor(__c.Colors.White);
 //BA.debugLineNum = 53;BA.debugLine="passwordfield.Text = Main.currentuser.password";
_passwordfield.setText(BA.ObjectToCharSequence(_main._currentuser.password));
 //BA.debugLineNum = 54;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
_passwordfield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 55;BA.debugLine="passwordfield.PasswordMode = True";
_passwordfield.setPasswordMode(__c.True);
 //BA.debugLineNum = 56;BA.debugLine="passwordfield.SingleLine = True";
_passwordfield.setSingleLine(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="passwordfield.TextColor = Colors.Black";
_passwordfield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 58;BA.debugLine="infoholder.AddView(passwordfield,2.5%x,(usernamef";
_infoholder.AddView((android.view.View)(_passwordfield.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_usernamefield.getTop()+_usernamefield.getHeight())+__c.DipToCurrent((int) (10))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 60;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 61;BA.debugLine="loginbtn.Color = Colors.White";
_loginbtn.setColor(__c.Colors.White);
 //BA.debugLineNum = 62;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 63;BA.debugLine="loginbtn.TextSize = 20";
_loginbtn.setTextSize((float) (20));
 //BA.debugLineNum = 64;BA.debugLine="loginbtn.Textcolor = Colors.Black";
_loginbtn.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 65;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 66;BA.debugLine="infoholder.AddView(loginbtn,2.5%x,(passwordfield.";
_infoholder.AddView((android.view.View)(_loginbtn.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_passwordfield.getTop()+_passwordfield.getHeight())+__c.PerYToCurrent((float) (5),ba)),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 68;BA.debugLine="singup.Gravity = Gravity.CENTER";
_singup.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 69;BA.debugLine="singup.Color = Colors.White";
_singup.setColor(__c.Colors.White);
 //BA.debugLineNum = 70;BA.debugLine="singup.Text = \"Sing up\"";
_singup.setText(BA.ObjectToCharSequence("Sing up"));
 //BA.debugLineNum = 71;BA.debugLine="singup.TextSize = 20";
_singup.setTextSize((float) (20));
 //BA.debugLineNum = 72;BA.debugLine="singup.Textcolor = Colors.Black";
_singup.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 73;BA.debugLine="HelperFunctions1.Apply_ViewStyle(singup,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_singup.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 74;BA.debugLine="infoholder.AddView(singup,2.5%x,(loginbtn.Top + l";
_infoholder.AddView((android.view.View)(_singup.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_loginbtn.getTop()+_loginbtn.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 76;BA.debugLine="infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,";
_infoholder.SetLayoutAnimated((int) (1000),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim infoholder As Panel";
_infoholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim screenimg As ImageView";
_screenimg = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim usernamefield As EditText";
_usernamefield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim passwordfield As EditText";
_passwordfield = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim loginbtn As Button";
_loginbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim singup As Button";
_singup = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 14;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
_wholescreen.Initialize(ba,"wholescr");
 //BA.debugLineNum = 15;BA.debugLine="usernamefield.Initialize(\"username\")";
_usernamefield.Initialize(ba,"username");
 //BA.debugLineNum = 16;BA.debugLine="passwordfield.Initialize(\"password\")";
_passwordfield.Initialize(ba,"password");
 //BA.debugLineNum = 17;BA.debugLine="loginbtn.Initialize(\"login\")";
_loginbtn.Initialize(ba,"login");
 //BA.debugLineNum = 18;BA.debugLine="screenimg.Initialize(\"\")";
_screenimg.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="infoholder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 20;BA.debugLine="singup.Initialize(\"register\")";
_singup.Initialize(ba,"register");
 //BA.debugLineNum = 22;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub login_Click";
 //BA.debugLineNum = 84;BA.debugLine="Log(Main.currentuser)";
__c.Log(BA.ObjectToString(_main._currentuser));
 //BA.debugLineNum = 85;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowUI");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
