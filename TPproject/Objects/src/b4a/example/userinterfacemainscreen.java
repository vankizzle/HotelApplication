package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class userinterfacemainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.userinterfacemainscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.userinterfacemainscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ImageViewWrapper _screenimg = null;
public anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _availability = null;
public anywheresoftware.b4a.objects.LabelWrapper _statusindicator = null;
public anywheresoftware.b4a.objects.PanelWrapper _menuholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _menutasks = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother3 = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.userinterfacemainscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="wholescreen.Initialize(\"screenview\")";
__ref._wholescreen.Initialize(ba,"screenview");
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="screenimg.Initialize(\"\")";
__ref._screenimg.Initialize(ba,"");
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
__ref._screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"mainscreenimg.png").getObject()));
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="screenimg.Gravity = Gravity.FILL";
__ref._screenimg.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
__ref._wholescreen.AddView((android.view.View)(__ref._screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
RDebugUtils.currentLine=393223;
 //BA.debugLineNum = 393223;BA.debugLine="statusindicator.Initialize(\"\")";
__ref._statusindicator.Initialize(ba,"");
RDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="usernamelbl.Initialize(\"username\")";
__ref._usernamelbl.Initialize(ba,"username");
RDebugUtils.currentLine=393225;
 //BA.debugLineNum = 393225;BA.debugLine="availability.Initialize(\"avail\")";
__ref._availability.Initialize(ba,"avail");
RDebugUtils.currentLine=393227;
 //BA.debugLineNum = 393227;BA.debugLine="MenuHolder.Initialize(\"\")";
__ref._menuholder.Initialize(ba,"");
RDebugUtils.currentLine=393228;
 //BA.debugLineNum = 393228;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
__ref._menutasks.Initialize(ba,"Tasks");
RDebugUtils.currentLine=393229;
 //BA.debugLineNum = 393229;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
__ref._menuother1.Initialize(ba,"MyTask");
RDebugUtils.currentLine=393230;
 //BA.debugLineNum = 393230;BA.debugLine="MenuOther2.Initialize(\"Menu3\")";
__ref._menuother2.Initialize(ba,"Menu3");
RDebugUtils.currentLine=393231;
 //BA.debugLineNum = 393231;BA.debugLine="MenuOther3.Initialize(\"Menu4\")";
__ref._menuother3.Initialize(ba,"Menu4");
RDebugUtils.currentLine=393235;
 //BA.debugLineNum = 393235;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=393237;
 //BA.debugLineNum = 393237;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub AsView As Panel";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Return wholescreen";
if (true) return __ref._wholescreen;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return null;
}
public String  _setavailable(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "setavailable"))
	return (String) Debug.delegate(ba, "setavailable", null);
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub SetAvailable";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return "";
}
public String  _setbusy(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "setbusy"))
	return (String) Debug.delegate(ba, "setbusy", null);
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub SetBusy";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,(int) (30));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _avail_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "avail_click"))
	return (String) Debug.delegate(ba, "avail_click", null);
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub avail_Click";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
 }else {
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,(int) (30));
 };
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="usernamelbl.Textcolor = Colors.White";
__ref._usernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
__ref._usernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
__ref._usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="usernamelbl.TextSize = 20";
__ref._usernamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
__ref._wholescreen.AddView((android.view.View)(__ref._usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="availability.TextColor = Colors.White";
__ref._availability.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="availability.Gravity = Gravity.CENTER";
__ref._availability.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458761;
 //BA.debugLineNum = 458761;BA.debugLine="availability.TextSize = 20";
__ref._availability.setTextSize((float) (20));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=458763;
 //BA.debugLineNum = 458763;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
RDebugUtils.currentLine=458765;
 //BA.debugLineNum = 458765;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
RDebugUtils.currentLine=458767;
 //BA.debugLineNum = 458767;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
RDebugUtils.currentLine=458768;
 //BA.debugLineNum = 458768;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
__ref._wholescreen.AddView((android.view.View)(__ref._availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=458769;
 //BA.debugLineNum = 458769;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
__ref._wholescreen.AddView((android.view.View)(__ref._statusindicator.getObject()),(int) (__ref._availability.getLeft()+__ref._availability.getWidth()),__c.PerYToCurrent((float) (3.5),ba),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=458771;
 //BA.debugLineNum = 458771;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
__ref._wholescreen.AddView((android.view.View)(__ref._menuholder.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=458772;
 //BA.debugLineNum = 458772;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
__ref._menutasks.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458773;
 //BA.debugLineNum = 458773;BA.debugLine="MenuTasks.Text = \"Task Table\"";
__ref._menutasks.setText(BA.ObjectToCharSequence("Task Table"));
RDebugUtils.currentLine=458774;
 //BA.debugLineNum = 458774;BA.debugLine="MenuTasks.TextColor = Colors.White";
__ref._menutasks.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458775;
 //BA.debugLineNum = 458775;BA.debugLine="MenuTasks.TextSize = 15";
__ref._menutasks.setTextSize((float) (15));
RDebugUtils.currentLine=458776;
 //BA.debugLineNum = 458776;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menutasks.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=458777;
 //BA.debugLineNum = 458777;BA.debugLine="MenuHolder.AddView(MenuTasks,0%x,0%y,30%x,20%y)";
__ref._menuholder.AddView((android.view.View)(__ref._menutasks.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=458779;
 //BA.debugLineNum = 458779;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
__ref._menuother1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458780;
 //BA.debugLineNum = 458780;BA.debugLine="MenuOther1.Text = \"My Task\"";
__ref._menuother1.setText(BA.ObjectToCharSequence("My Task"));
RDebugUtils.currentLine=458781;
 //BA.debugLineNum = 458781;BA.debugLine="MenuOther1.TextColor = Colors.White";
__ref._menuother1.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458782;
 //BA.debugLineNum = 458782;BA.debugLine="MenuOther1.TextSize = 15";
__ref._menuother1.setTextSize((float) (15));
RDebugUtils.currentLine=458783;
 //BA.debugLineNum = 458783;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menuother1.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=458784;
 //BA.debugLineNum = 458784;BA.debugLine="MenuHolder.AddView(MenuOther1,(MenuTasks.Left+Men";
__ref._menuholder.AddView((android.view.View)(__ref._menuother1.getObject()),(int) ((__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))),__ref._menutasks.getTop(),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=458786;
 //BA.debugLineNum = 458786;BA.debugLine="MenuOther2.Gravity = Gravity.CENTER";
__ref._menuother2.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458787;
 //BA.debugLineNum = 458787;BA.debugLine="MenuOther2.Text = \"Menu 3\"";
__ref._menuother2.setText(BA.ObjectToCharSequence("Menu 3"));
RDebugUtils.currentLine=458788;
 //BA.debugLineNum = 458788;BA.debugLine="MenuOther2.TextColor = Colors.White";
__ref._menuother2.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458789;
 //BA.debugLineNum = 458789;BA.debugLine="MenuOther2.TextSize = 15";
__ref._menuother2.setTextSize((float) (15));
RDebugUtils.currentLine=458790;
 //BA.debugLineNum = 458790;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther2,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menuother2.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=458791;
 //BA.debugLineNum = 458791;BA.debugLine="MenuHolder.AddView(MenuOther2,MenuTasks.Left,(Men";
__ref._menuholder.AddView((android.view.View)(__ref._menuother2.getObject()),__ref._menutasks.getLeft(),(int) ((__ref._menutasks.getTop()+__ref._menutasks.getHeight())+__c.DipToCurrent((int) (4))),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=458793;
 //BA.debugLineNum = 458793;BA.debugLine="MenuOther3.Gravity = Gravity.CENTER";
__ref._menuother3.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=458794;
 //BA.debugLineNum = 458794;BA.debugLine="MenuOther3.Text = \"Menu 4\"";
__ref._menuother3.setText(BA.ObjectToCharSequence("Menu 4"));
RDebugUtils.currentLine=458795;
 //BA.debugLineNum = 458795;BA.debugLine="MenuOther3.TextColor = Colors.White";
__ref._menuother3.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=458796;
 //BA.debugLineNum = 458796;BA.debugLine="MenuOther3.TextSize = 15";
__ref._menuother3.setTextSize((float) (15));
RDebugUtils.currentLine=458797;
 //BA.debugLineNum = 458797;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther3,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menuother3.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=458798;
 //BA.debugLineNum = 458798;BA.debugLine="MenuHolder.AddView(MenuOther3,(MenuTasks.Left+Men";
__ref._menuholder.AddView((android.view.View)(__ref._menuother3.getObject()),(int) ((__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))),(int) ((__ref._menutasks.getTop()+__ref._menutasks.getHeight())+__c.DipToCurrent((int) (4))),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=458799;
 //BA.debugLineNum = 458799;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim screenimg As ImageView";
_screenimg = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="Dim statusindicator As Label";
_statusindicator = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Dim MenuHolder As Panel";
_menuholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Dim MenuTasks As Label";
_menutasks = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="Dim MenuOther1 As Label";
_menuother1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327691;
 //BA.debugLineNum = 327691;BA.debugLine="Dim MenuOther2 As Label";
_menuother2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="Dim MenuOther3 As Label";
_menuother3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="End Sub";
return "";
}
public String  _menu3_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "menu3_click"))
	return (String) Debug.delegate(ba, "menu3_click", null);
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub Menu3_Click";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="CallSub(Main,\"ShowMenu3\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMenu3");
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public String  _menu4_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "menu4_click"))
	return (String) Debug.delegate(ba, "menu4_click", null);
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub Menu4_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="CallSub(Main,\"ShowMenu\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMenu");
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
public String  _mytask_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "mytask_click"))
	return (String) Debug.delegate(ba, "mytask_click", null);
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub MyTask_Click";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMyTasks");
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
public boolean  _screenview_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "screenview_click"))
	return (Boolean) Debug.delegate(ba, "screenview_click", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub screenview_Click As Boolean";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="End Sub";
return false;
}
public String  _tasks_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "tasks_click"))
	return (String) Debug.delegate(ba, "tasks_click", null);
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Tasks_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowTaskTable");
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
}