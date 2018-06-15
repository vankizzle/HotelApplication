package b4a.HotelAppTP;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class loginscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.HotelAppTP.loginscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.HotelAppTP.loginscreen.class).invoke(this, new Object[] {null});
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
public b4a.HotelAppTP.userinterfacemainscreen _usermainscreen = null;
public anywheresoftware.b4a.samples.httputils2.httpjob _loginjob = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.HotelAppTP.main _main = null;
public b4a.HotelAppTP.types _types = null;
public b4a.HotelAppTP.helperfunctions1 _helperfunctions1 = null;
public b4a.HotelAppTP.starter _starter = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 36;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 41;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
_screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"hotelappscreen.jpg").getObject()));
 //BA.debugLineNum = 42;BA.debugLine="screenimg.Gravity = Gravity.FILL";
_screenimg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 43;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
_wholescreen.AddView((android.view.View)(_screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
 //BA.debugLineNum = 44;BA.debugLine="wholescreen.Color = Colors.ARGB(150,0,0,0)";
_wholescreen.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 47;BA.debugLine="infoholder.Color =  Colors.ARGB(150,0,0,0)";
_infoholder.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 48;BA.debugLine="wholescreen.AddView(infoholder,30%x,100%y,40%x,30";
_wholescreen.AddView((android.view.View)(_infoholder.getObject()),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (100),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 49;BA.debugLine="usernamefield.Gravity = Gravity.LEFT";
_usernamefield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 50;BA.debugLine="usernamefield.Color = Colors.White";
_usernamefield.setColor(__c.Colors.White);
 //BA.debugLineNum = 51;BA.debugLine="usernamefield.Hint = \"Username\"";
_usernamefield.setHint("Username");
 //BA.debugLineNum = 53;BA.debugLine="usernamefield.Text = \"smoldelf@abv.bg\"";
_usernamefield.setText(BA.ObjectToCharSequence("smoldelf@abv.bg"));
 //BA.debugLineNum = 54;BA.debugLine="usernamefield.HintColor = Colors.DarkGray";
_usernamefield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 55;BA.debugLine="usernamefield.SingleLine = True";
_usernamefield.setSingleLine(__c.True);
 //BA.debugLineNum = 56;BA.debugLine="usernamefield.TextColor = Colors.Black";
_usernamefield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 57;BA.debugLine="infoholder.AddView(usernamefield,2.5%x,2.5%y,35%x";
_infoholder.AddView((android.view.View)(_usernamefield.getObject()),__c.PerXToCurrent((float) (2.5),ba),__c.PerYToCurrent((float) (2.5),ba),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 59;BA.debugLine="passwordfield.Gravity = Gravity.LEFT";
_passwordfield.setGravity(__c.Gravity.LEFT);
 //BA.debugLineNum = 60;BA.debugLine="passwordfield.Color = Colors.White";
_passwordfield.setColor(__c.Colors.White);
 //BA.debugLineNum = 61;BA.debugLine="passwordfield.Hint = \"Password\"";
_passwordfield.setHint("Password");
 //BA.debugLineNum = 63;BA.debugLine="passwordfield.Text = \"a936157z\"";
_passwordfield.setText(BA.ObjectToCharSequence("a936157z"));
 //BA.debugLineNum = 64;BA.debugLine="passwordfield.HintColor = Colors.DarkGray";
_passwordfield.setHintColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 65;BA.debugLine="passwordfield.SingleLine = True";
_passwordfield.setSingleLine(__c.True);
 //BA.debugLineNum = 66;BA.debugLine="passwordfield.TextColor = Colors.Black";
_passwordfield.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 67;BA.debugLine="passwordfield.PasswordMode = True";
_passwordfield.setPasswordMode(__c.True);
 //BA.debugLineNum = 68;BA.debugLine="infoholder.AddView(passwordfield,2.5%x,(usernamef";
_infoholder.AddView((android.view.View)(_passwordfield.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_usernamefield.getTop()+_usernamefield.getHeight())+__c.DipToCurrent((int) (10))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 70;BA.debugLine="loginbtn.Gravity = Gravity.CENTER";
_loginbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 71;BA.debugLine="loginbtn.Color = Colors.White";
_loginbtn.setColor(__c.Colors.White);
 //BA.debugLineNum = 72;BA.debugLine="loginbtn.Text = \"Login\"";
_loginbtn.setText(BA.ObjectToCharSequence("Login"));
 //BA.debugLineNum = 73;BA.debugLine="loginbtn.TextSize = 20";
_loginbtn.setTextSize((float) (20));
 //BA.debugLineNum = 74;BA.debugLine="loginbtn.Textcolor = Colors.Black";
_loginbtn.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 75;BA.debugLine="HelperFunctions1.Apply_ViewStyle(loginbtn,Colors.";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_loginbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 76;BA.debugLine="infoholder.AddView(loginbtn,2.5%x,(passwordfield.";
_infoholder.AddView((android.view.View)(_loginbtn.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_passwordfield.getTop()+_passwordfield.getHeight())+__c.PerYToCurrent((float) (5),ba)),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 78;BA.debugLine="singup.Gravity = Gravity.CENTER";
_singup.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 79;BA.debugLine="singup.Color = Colors.White";
_singup.setColor(__c.Colors.White);
 //BA.debugLineNum = 80;BA.debugLine="singup.Text = \"Sing up\"";
_singup.setText(BA.ObjectToCharSequence("Sing up"));
 //BA.debugLineNum = 81;BA.debugLine="singup.TextSize = 20";
_singup.setTextSize((float) (20));
 //BA.debugLineNum = 82;BA.debugLine="singup.Textcolor = Colors.Black";
_singup.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 83;BA.debugLine="HelperFunctions1.Apply_ViewStyle(singup,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_singup.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (77),(int) (166),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 84;BA.debugLine="infoholder.AddView(singup,2.5%x,(loginbtn.Top + l";
_infoholder.AddView((android.view.View)(_singup.getObject()),__c.PerXToCurrent((float) (2.5),ba),(int) ((_loginbtn.getTop()+_loginbtn.getHeight())+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (35),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 86;BA.debugLine="infoholder.SetLayoutAnimated(1000,30%x,30%y,40%x,";
_infoholder.SetLayoutAnimated((int) (1000),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (30),ba),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (30),ba));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 12;BA.debugLine="Dim usermainscreen As UserInterfaceMainScreen";
_usermainscreen = new b4a.HotelAppTP.userinterfacemainscreen();
 //BA.debugLineNum = 14;BA.debugLine="Dim LoginJob As HttpJob";
_loginjob = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 20;BA.debugLine="wholescreen.Initialize(\"wholescr\")";
_wholescreen.Initialize(ba,"wholescr");
 //BA.debugLineNum = 21;BA.debugLine="usernamefield.Initialize(\"username\")";
_usernamefield.Initialize(ba,"username");
 //BA.debugLineNum = 22;BA.debugLine="passwordfield.Initialize(\"password\")";
_passwordfield.Initialize(ba,"password");
 //BA.debugLineNum = 23;BA.debugLine="loginbtn.Initialize(\"login\")";
_loginbtn.Initialize(ba,"login");
 //BA.debugLineNum = 24;BA.debugLine="screenimg.Initialize(\"\")";
_screenimg.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="infoholder.Initialize(\"\")";
_infoholder.Initialize(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="singup.Initialize(\"register\")";
_singup.Initialize(ba,"register");
 //BA.debugLineNum = 27;BA.debugLine="myxml.Initialize";
_myxml.Initialize(ba);
 //BA.debugLineNum = 28;BA.debugLine="Types.userslist.Initialize";
_types._userslist.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="usermainscreen.Initialize";
_usermainscreen._initialize(ba);
 //BA.debugLineNum = 31;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job1) throws Exception{
String _s = "";
String _result = "";
String[] _results = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub JobDone(job1 As HttpJob)";
 //BA.debugLineNum = 90;BA.debugLine="If job1.Success Then";
if (_job1._success) { 
 //BA.debugLineNum = 91;BA.debugLine="Dim s As String = job1.JobName";
_s = _job1._jobname;
 //BA.debugLineNum = 92;BA.debugLine="Select s";
switch (BA.switchObjectToInt(_s,"JobLogin")) {
case 0: {
 //BA.debugLineNum = 95;BA.debugLine="Dim result As String = job1.GetString";
_result = _job1._getstring();
 //BA.debugLineNum = 96;BA.debugLine="Log(result)";
__c.Log(_result);
 //BA.debugLineNum = 97;BA.debugLine="If Not(result.Contains(\"errorMessage\")) Then";
if (__c.Not(_result.contains("errorMessage"))) { 
 //BA.debugLineNum = 98;BA.debugLine="result = result.Replace(QUOTE,\" \")";
_result = _result.replace(__c.QUOTE," ");
 //BA.debugLineNum = 99;BA.debugLine="result = result.Replace(\":\",\" \")";
_result = _result.replace(":"," ");
 //BA.debugLineNum = 100;BA.debugLine="result = result.Replace(\"{\",\" \")";
_result = _result.replace("{"," ");
 //BA.debugLineNum = 101;BA.debugLine="result = result.Replace(\"accessToken\",\" \")";
_result = _result.replace("accessToken"," ");
 //BA.debugLineNum = 102;BA.debugLine="result = result.Replace(\",\",\" \")";
_result = _result.replace(","," ");
 //BA.debugLineNum = 103;BA.debugLine="result = result.Replace(\"tokenType\",\" \")";
_result = _result.replace("tokenType"," ");
 //BA.debugLineNum = 104;BA.debugLine="result = result.Replace(\"Bearer\",\" \")";
_result = _result.replace("Bearer"," ");
 //BA.debugLineNum = 105;BA.debugLine="result = result.Replace(\"}\",\" \")";
_result = _result.replace("}"," ");
 //BA.debugLineNum = 121;BA.debugLine="result = result.Replace(\" \",\" \")";
_result = _result.replace(" "," ");
 //BA.debugLineNum = 122;BA.debugLine="result = result.Replace(\"  \",\" \")";
_result = _result.replace("  "," ");
 //BA.debugLineNum = 123;BA.debugLine="result = result.Replace(\"   \",\" \")";
_result = _result.replace("   "," ");
 //BA.debugLineNum = 124;BA.debugLine="result = result.Replace(\"    \",\" \")";
_result = _result.replace("    "," ");
 //BA.debugLineNum = 125;BA.debugLine="result = result.Trim";
_result = _result.trim();
 //BA.debugLineNum = 126;BA.debugLine="result = result.Replace(\"   \",\" \")";
_result = _result.replace("   "," ");
 //BA.debugLineNum = 130;BA.debugLine="Log(result)";
__c.Log(_result);
 //BA.debugLineNum = 131;BA.debugLine="Dim results() As String";
_results = new String[(int) (0)];
java.util.Arrays.fill(_results,"");
 //BA.debugLineNum = 132;BA.debugLine="results = Regex.Split(\" \",result)";
_results = __c.Regex.Split(" ",_result);
 //BA.debugLineNum = 133;BA.debugLine="If results(1) = 0 Then";
if ((_results[(int) (1)]).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 134;BA.debugLine="Types.currentuser.TypeOfWorker = 0";
_types._currentuser.TypeOfWorker = (int) (0);
 //BA.debugLineNum = 135;BA.debugLine="Types.currentuser.username = usernamefield.Te";
_types._currentuser.username = _usernamefield.getText();
 //BA.debugLineNum = 136;BA.debugLine="Types.currentuser.available = True";
_types._currentuser.available = __c.True;
 //BA.debugLineNum = 137;BA.debugLine="CallSub(Main,\"SetNameLbl\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"SetNameLbl");
 }else {
 //BA.debugLineNum = 139;BA.debugLine="Types.currentuser.TypeOfWorker = 1";
_types._currentuser.TypeOfWorker = (int) (1);
 //BA.debugLineNum = 140;BA.debugLine="Types.currentuser.username = usernamefield.Te";
_types._currentuser.username = _usernamefield.getText();
 //BA.debugLineNum = 141;BA.debugLine="Types.currentuser.available = True";
_types._currentuser.available = __c.True;
 //BA.debugLineNum = 142;BA.debugLine="CallSub(Main,\"SetNameLbl\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"SetNameLbl");
 };
 //BA.debugLineNum = 144;BA.debugLine="Log(\"Token-> \" & results(4))";
__c.Log("Token-> "+_results[(int) (4)]);
 //BA.debugLineNum = 145;BA.debugLine="Types.ResToken  = results(4)";
_types._restoken = _results[(int) (4)];
 };
 //BA.debugLineNum = 147;BA.debugLine="CallSub(Main,\"ShowUI\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowUI");
 break; }
}
;
 //BA.debugLineNum = 149;BA.debugLine="job1.Release";
_job1._release();
 };
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return "";
}
public String  _login() throws Exception{
String _url = "";
String _jstr = "";
 //BA.debugLineNum = 157;BA.debugLine="Sub Login";
 //BA.debugLineNum = 158;BA.debugLine="LoginJob.Initialize(\"JobLogin\", Me)";
_loginjob._initialize(ba,"JobLogin",this);
 //BA.debugLineNum = 159;BA.debugLine="Dim url As String = \"https://hacktues.com/api/log";
_url = "https://hacktues.com/api/login";
 //BA.debugLineNum = 160;BA.debugLine="Dim jstr As String = Types.getJSONforLogin(userna";
_jstr = _types._getjsonforlogin(ba,_usernamefield.getText(),_passwordfield.getText());
 //BA.debugLineNum = 161;BA.debugLine="Log(jstr)";
__c.Log(_jstr);
 //BA.debugLineNum = 162;BA.debugLine="LoginJob.PostString(url,jstr)";
_loginjob._poststring(_url,_jstr);
 //BA.debugLineNum = 163;BA.debugLine="LoginJob.GetRequest.SetContentType(\"application/j";
_loginjob._getrequest().SetContentType("application/json");
 //BA.debugLineNum = 164;BA.debugLine="LoginJob.GetRequest.SetHeader(\"Accept\",\"applicati";
_loginjob._getrequest().SetHeader("Accept","application/json");
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return "";
}
public String  _login_click() throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub login_Click";
 //BA.debugLineNum = 154;BA.debugLine="Login";
_login();
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public String  _setuser(b4a.HotelAppTP.types._user _u) throws Exception{
 //BA.debugLineNum = 166;BA.debugLine="Sub setuser(u As user)";
 //BA.debugLineNum = 167;BA.debugLine="Types.currentuser.username = u.username";
_types._currentuser.username = _u.username;
 //BA.debugLineNum = 168;BA.debugLine="Types.currentuser.password = u.password";
_types._currentuser.password = _u.password;
 //BA.debugLineNum = 169;BA.debugLine="Types.currentuser.available = u.available";
_types._currentuser.available = _u.available;
 //BA.debugLineNum = 170;BA.debugLine="Types.currentuser.ID = u.ID";
_types._currentuser.ID = _u.ID;
 //BA.debugLineNum = 171;BA.debugLine="Types.currentuser.TypeOfWorker = u.TypeOfWorker";
_types._currentuser.TypeOfWorker = _u.TypeOfWorker;
 //BA.debugLineNum = 172;BA.debugLine="Types.currentuser.CurrentTaskID = u.CurrentTaskID";
_types._currentuser.CurrentTaskID = _u.CurrentTaskID;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
