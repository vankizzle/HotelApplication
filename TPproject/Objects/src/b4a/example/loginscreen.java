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
public anywheresoftware.b4a.objects.SaxParser _myxml = null;
public b4a.example.types._user _workinguser = null;
public b4a.example.userinterfacemainscreen _usermainscreen = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 32;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 37;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
_screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"hotelappscreen.jpg").getObject()));
 //BA.debugLineNum = 38;BA.debugLine="screenimg.Gravity = Gravity.FILL";
_screenimg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 39;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
_wholescreen.AddView((android.view.View)(_screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
 //BA.debugLineNum = 40;BA.debugLine="wholescreen.Color = Colors.ARGB(150,0,0,0)";
_wholescreen.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 43;BA.debugLine="infoholder.Color =  Colors.ARGB(150,0,0,0)";
_infoholder.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 44;BA.debugLine="wholescreen.AddView(infoholder,30%x,100%y,40%x,30";
_wholescreen.AddView((android.view.View)(_infoholder.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (100),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 45;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
_usernamefield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 46;BA.debugLine="usernamefield.Color = Colors.White";
_usernamefield.setColor(__c.Colors.White);
 //BA.debugLineNum = 47;BA.debugLine="usernamefield.Hint = \"Username\"";
_usernamefield.setHint("Username");
 //BA.debugLineNum = 48;BA.debugLine="usernamefield.Text = \"pump\"";
_usernamefield.setText(BA.ObjectToCharSequence("pump"));
 //BA.debugLineNum = 49;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
_usernamefield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 50;BA.debugLine="usernamefield.SingleLine = True";
_usernamefield.setSingleLine(__c.True);
 //BA.debugLineNum = 51;BA.debugLine="usernamefield.TextColor = Colors.Black";
_usernamefield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 52;BA.debugLine="infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x";
_infoholder.AddView((android.view.View)(_usernamefield.getObject()),__c.PerXToCurrent((float) (2.5),ba),__c.PerYToCurrent((float) (2.5),ba),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 54;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
_passwordfield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 55;BA.debugLine="passwordfield.Color = Colors.White";
_passwordfield.setColor(__c.Colors.White);
 //BA.debugLineNum = 56;BA.debugLine="passwordfield.Hint = \"Password\"";
_passwordfield.setHint("Password");
 //BA.debugLineNum = 57;BA.debugLine="passwordfield.Text = \"12345\"";
_passwordfield.setText(BA.ObjectToCharSequence("12345"));
 //BA.debugLineNum = 58;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
_passwordfield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 59;BA.debugLine="passwordfield.PasswordMode = True";
_passwordfield.setPasswordMode(__c.True);
 //BA.debugLineNum = 60;BA.debugLine="passwordfield.SingleLine = True";
_passwordfield.setSingleLine(__c.True);
 //BA.debugLineNum = 61;BA.debugLine="passwordfield.TextColor = Colors.Black";
_passwordfield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 62;BA.debugLine="infoholder.AddView(passwordfield,2.5%x,(usernamef";
_infoholder.AddView((android.view.View)(_passwordfield.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_usernamefield.getTop()+_usernamefield.getHeight())+__c.DipToCurrent((int) (10))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 64;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 65;BA.debugLine="loginbtn.Color = Colors.White";
_loginbtn.setColor(__c.Colors.White);
 //BA.debugLineNum = 66;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 67;BA.debugLine="loginbtn.TextSize = 20";
_loginbtn.setTextSize((float) (20));
 //BA.debugLineNum = 68;BA.debugLine="loginbtn.Textcolor = Colors.Black";
_loginbtn.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 69;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 70;BA.debugLine="infoholder.AddView(loginbtn,2.5%x,(passwordfield.";
_infoholder.AddView((android.view.View)(_loginbtn.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_passwordfield.getTop()+_passwordfield.getHeight())+__c.PerYToCurrent((float) (5),ba)),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 72;BA.debugLine="singup.Gravity = Gravity.CENTER";
_singup.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 73;BA.debugLine="singup.Color = Colors.White";
_singup.setColor(__c.Colors.White);
 //BA.debugLineNum = 74;BA.debugLine="singup.Text = \"Sing up\"";
_singup.setText(BA.ObjectToCharSequence("Sing up"));
 //BA.debugLineNum = 75;BA.debugLine="singup.TextSize = 20";
_singup.setTextSize((float) (20));
 //BA.debugLineNum = 76;BA.debugLine="singup.Textcolor = Colors.Black";
_singup.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 77;BA.debugLine="HelperFunctions1.Apply_ViewStyle(singup,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_singup.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 78;BA.debugLine="infoholder.AddView(singup,2.5%x,(loginbtn.Top + l";
_infoholder.AddView((android.view.View)(_singup.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_loginbtn.getTop()+_loginbtn.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 80;BA.debugLine="infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,";
_infoholder.SetLayoutAnimated((int) (1000),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public String  _checkuser() throws Exception{
b4a.example.types._user _u = null;
 //BA.debugLineNum = 104;BA.debugLine="Sub CheckUser";
 //BA.debugLineNum = 106;BA.debugLine="For Each u As user In Types.userslist.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _types._userslist.Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_u = (b4a.example.types._user)(group1.Get(index1));
 //BA.debugLineNum = 107;BA.debugLine="If  usernamefield.Text = u.username Then";
if ((_usernamefield.getText()).equals(_u.username)) { 
 //BA.debugLineNum = 108;BA.debugLine="If passwordfield.Text = u.password Then";
if ((_passwordfield.getText()).equals(_u.password)) { 
 //BA.debugLineNum = 109;BA.debugLine="setuser(u)";
_setuser(_u);
 //BA.debugLineNum = 110;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowUI");
 };
 };
 }
};
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 9;BA.debugLine="Dim myxml As SaxParser";
_myxml = new anywheresoftware.b4a.objects.SaxParser();
 //BA.debugLineNum = 11;BA.debugLine="Dim workingUser As user";
_workinguser = new b4a.example.types._user();
 //BA.debugLineNum = 12;BA.debugLine="Dim usermainscreen As UserInterfaceMainScreen";
_usermainscreen = new b4a.example.userinterfacemainscreen();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
_wholescreen.Initialize(ba,"wholescr");
 //BA.debugLineNum = 18;BA.debugLine="usernamefield.Initialize(\"username\")";
_usernamefield.Initialize(ba,"username");
 //BA.debugLineNum = 19;BA.debugLine="passwordfield.Initialize(\"password\")";
_passwordfield.Initialize(ba,"password");
 //BA.debugLineNum = 20;BA.debugLine="loginbtn.Initialize(\"login\")";
_loginbtn.Initialize(ba,"login");
 //BA.debugLineNum = 21;BA.debugLine="screenimg.Initialize(\"\")";
_screenimg.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="infoholder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="singup.Initialize(\"register\")";
_singup.Initialize(ba,"register");
 //BA.debugLineNum = 24;BA.debugLine="myxml.Initialize";
_myxml.Initialize(ba);
 //BA.debugLineNum = 25;BA.debugLine="Types.userslist.Initialize";
_types._userslist.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="usermainscreen.Initialize";
_usermainscreen._initialize(ba);
 //BA.debugLineNum = 27;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub login_Click";
 //BA.debugLineNum = 85;BA.debugLine="myxml.Parse(File.OpenInput(File.DirAssets,\"Exampl";
_myxml.Parse((java.io.InputStream)(__c.File.OpenInput(__c.File.getDirAssets(),"ExampleXML.xml").getObject()),"Parse");
 //BA.debugLineNum = 86;BA.debugLine="CheckUser";
_checkuser();
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return "";
}
public String  _parse_endelement(String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
b4a.example.types._user _newuser = null;
int _i = 0;
String _s = "";
 //BA.debugLineNum = 116;BA.debugLine="Sub Parse_EndElement (Uri As String, Name As Strin";
 //BA.debugLineNum = 117;BA.debugLine="If Name.EqualsIgnoreCase(\"user\") Then";
if (_name.equalsIgnoreCase("user")) { 
 //BA.debugLineNum = 118;BA.debugLine="Dim newUser As user";
_newuser = new b4a.example.types._user();
 //BA.debugLineNum = 119;BA.debugLine="newUser.Initialize";
_newuser.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="newUser.available = workingUser.available";
_newuser.available = _workinguser.available;
 //BA.debugLineNum = 121;BA.debugLine="newUser.CurrentTaskID = workingUser.CurrentTaskI";
_newuser.CurrentTaskID = _workinguser.CurrentTaskID;
 //BA.debugLineNum = 122;BA.debugLine="newUser.ID = workingUser.ID";
_newuser.ID = _workinguser.ID;
 //BA.debugLineNum = 123;BA.debugLine="newUser.password = workingUser.password";
_newuser.password = _workinguser.password;
 //BA.debugLineNum = 124;BA.debugLine="newUser.username = workingUser.username";
_newuser.username = _workinguser.username;
 //BA.debugLineNum = 125;BA.debugLine="newUser.TypeOfWorker = workingUser.TypeOfWorker";
_newuser.TypeOfWorker = _workinguser.TypeOfWorker;
 //BA.debugLineNum = 126;BA.debugLine="Types.userslist.Put(newUser.username,newUser)";
_types._userslist.Put((Object)(_newuser.username),(Object)(_newuser));
 };
 //BA.debugLineNum = 129;BA.debugLine="If Name.EqualsIgnoreCase(\"name\") Then workingUser";
if (_name.equalsIgnoreCase("name")) { 
_workinguser.username = _text.ToString();};
 //BA.debugLineNum = 130;BA.debugLine="If Name.EqualsIgnoreCase(\"password\") Then working";
if (_name.equalsIgnoreCase("password")) { 
_workinguser.password = _text.ToString();};
 //BA.debugLineNum = 131;BA.debugLine="If Name.EqualsIgnoreCase(\"available\") Then";
if (_name.equalsIgnoreCase("available")) { 
 //BA.debugLineNum = 132;BA.debugLine="If Text.ToString  = \"True\" Then";
if ((_text.ToString()).equals("True")) { 
 //BA.debugLineNum = 133;BA.debugLine="workingUser.available = True";
_workinguser.available = __c.True;
 }else {
 //BA.debugLineNum = 135;BA.debugLine="workingUser.available = False";
_workinguser.available = __c.False;
 };
 };
 //BA.debugLineNum = 138;BA.debugLine="If Name.EqualsIgnoreCase(\"TypeOfWorker\") Then wor";
if (_name.equalsIgnoreCase("TypeOfWorker")) { 
_workinguser.TypeOfWorker = (int)(Double.parseDouble(_text.ToString()));};
 //BA.debugLineNum = 139;BA.debugLine="If Name.EqualsIgnoreCase(\"id\") Then workingUser.I";
if (_name.equalsIgnoreCase("id")) { 
_workinguser.ID = (int)(Double.parseDouble(_text.ToString()));};
 //BA.debugLineNum = 140;BA.debugLine="If Name.EqualsIgnoreCase(\"CurrentTaskID\") Then";
if (_name.equalsIgnoreCase("CurrentTaskID")) { 
 //BA.debugLineNum = 141;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 142;BA.debugLine="For Each s As String In Regex.Split(\",\",Text.ToS";
{
final String[] group25 = __c.Regex.Split(",",_text.ToString());
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_s = group25[index25];
 //BA.debugLineNum = 143;BA.debugLine="If IsNumber(s) Then";
if (__c.IsNumber(_s)) { 
 //BA.debugLineNum = 144;BA.debugLine="workingUser.CurrentTaskID(i) = s";
_workinguser.CurrentTaskID[_i] = (int)(Double.parseDouble(_s));
 //BA.debugLineNum = 145;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 };
 }
};
 };
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _parse_startelement(String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Parse_StartElement (Uri As String, Name As Str";
 //BA.debugLineNum = 90;BA.debugLine="If Name.EqualsIgnoreCase(\"user\") Then";
if (_name.equalsIgnoreCase("user")) { 
 //BA.debugLineNum = 91;BA.debugLine="workingUser.Initialize";
_workinguser.Initialize();
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _setuser(b4a.example.types._user _u) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub setuser(u As user)";
 //BA.debugLineNum = 96;BA.debugLine="Types.currentuser.username = u.username";
_types._currentuser.username = _u.username;
 //BA.debugLineNum = 97;BA.debugLine="Types.currentuser.password = u.password";
_types._currentuser.password = _u.password;
 //BA.debugLineNum = 98;BA.debugLine="Types.currentuser.available = u.available";
_types._currentuser.available = _u.available;
 //BA.debugLineNum = 99;BA.debugLine="Types.currentuser.ID = u.ID";
_types._currentuser.ID = _u.ID;
 //BA.debugLineNum = 100;BA.debugLine="Types.currentuser.TypeOfWorker = u.TypeOfWorker";
_types._currentuser.TypeOfWorker = _u.TypeOfWorker;
 //BA.debugLineNum = 101;BA.debugLine="Types.currentuser.CurrentTaskID = u.CurrentTaskID";
_types._currentuser.CurrentTaskID = _u.CurrentTaskID;
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
