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
public anywheresoftware.b4a.objects.ScrollViewWrapper _menuholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _menutasks = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _createmenu = null;
public int _numberofmenus = 0;
public b4a.example.choosemenutype _menutypes = null;
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
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="wholescreen.Initialize(\"screenview\")";
__ref._wholescreen.Initialize(ba,"screenview");
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="screenimg.Initialize(\"\")";
__ref._screenimg.Initialize(ba,"");
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
__ref._screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"mainscreenimg.png").getObject()));
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="screenimg.Gravity = Gravity.FILL";
__ref._screenimg.setGravity(__c.Gravity.FILL);
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
__ref._wholescreen.AddView((android.view.View)(__ref._screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="statusindicator.Initialize(\"\")";
__ref._statusindicator.Initialize(ba,"");
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="usernamelbl.Initialize(\"username\")";
__ref._usernamelbl.Initialize(ba,"username");
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="availability.Initialize(\"avail\")";
__ref._availability.Initialize(ba,"avail");
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="MenuHolder.Initialize(40%y+4dip)";
__ref._menuholder.Initialize(ba,(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
__ref._menutasks.Initialize(ba,"Tasks");
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
__ref._menuother1.Initialize(ba,"MyTask");
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="MenuOther2.Initialize(\"MyWorkers\")";
__ref._menuother2.Initialize(ba,"MyWorkers");
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="CreateMenu.Initialize(\"MenuCreator\")";
__ref._createmenu.Initialize(ba,"MenuCreator");
RDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="MenuTypes.Initialize";
__ref._menutypes._initialize(null,ba);
RDebugUtils.currentLine=1441812;
 //BA.debugLineNum = 1441812;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub AsView As Panel";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Return wholescreen";
if (true) return __ref._wholescreen;
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return null;
}
public String  _setavailable(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "setavailable"))
	return (String) Debug.delegate(ba, "setavailable", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub SetAvailable";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="End Sub";
return "";
}
public String  _setbusy(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "setbusy"))
	return (String) Debug.delegate(ba, "setbusy", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub SetBusy";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,(int) (30));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public String  _bonusmenu_longclick(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "bonusmenu_longclick"))
	return (String) Debug.delegate(ba, "bonusmenu_longclick", null);
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub BonusMenu_LongClick";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="MenuTypes.AsView.Visible = True";
__ref._menutypes._asview(null).setVisible(__c.True);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="usernamelbl.Textcolor = Colors.White";
__ref._usernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
__ref._usernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
__ref._usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="usernamelbl.TextSize = 20";
__ref._usernamelbl.setTextSize((float) (20));
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
__ref._wholescreen.AddView((android.view.View)(__ref._usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="availability.TextColor = Colors.White";
__ref._availability.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="availability.Gravity = Gravity.CENTER";
__ref._availability.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="availability.TextSize = 20";
__ref._availability.setTextSize((float) (20));
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
__ref._wholescreen.AddView((android.view.View)(__ref._availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
__ref._wholescreen.AddView((android.view.View)(__ref._statusindicator.getObject()),(int) (__ref._availability.getLeft()+__ref._availability.getWidth()),__c.PerYToCurrent((float) (3.5),ba),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (3),ba));
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
__ref._wholescreen.AddView((android.view.View)(__ref._menuholder.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
__ref._menutasks.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="MenuTasks.Text = \"Task Table\"";
__ref._menutasks.setText(BA.ObjectToCharSequence("Task Table"));
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="MenuTasks.TextColor = Colors.White";
__ref._menutasks.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="MenuTasks.TextSize = 15";
__ref._menutasks.setTextSize((float) (15));
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menutasks.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,2";
__ref._menuholder.getPanel().AddView((android.view.View)(__ref._menutasks.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (20),ba));
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
__ref._menuother1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507356;
 //BA.debugLineNum = 1507356;BA.debugLine="MenuOther1.Text = \"My Task\"";
__ref._menuother1.setText(BA.ObjectToCharSequence("My Task"));
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="MenuOther1.TextColor = Colors.White";
__ref._menuother1.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="MenuOther1.TextSize = 15";
__ref._menuother1.setTextSize((float) (15));
RDebugUtils.currentLine=1507359;
 //BA.debugLineNum = 1507359;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menuother1.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Le";
__ref._menuholder.getPanel().AddView((android.view.View)(__ref._menuother1.getObject()),(int) ((__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))),__ref._menutasks.getTop(),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=1507362;
 //BA.debugLineNum = 1507362;BA.debugLine="MenuOther2.Gravity = Gravity.CENTER";
__ref._menuother2.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507363;
 //BA.debugLineNum = 1507363;BA.debugLine="MenuOther2.Text = \"Workers\"";
__ref._menuother2.setText(BA.ObjectToCharSequence("Workers"));
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="MenuOther2.TextColor = Colors.White";
__ref._menuother2.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="MenuOther2.TextSize = 15";
__ref._menuother2.setTextSize((float) (15));
RDebugUtils.currentLine=1507366;
 //BA.debugLineNum = 1507366;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther2,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._menuother2.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=1507367;
 //BA.debugLineNum = 1507367;BA.debugLine="MenuHolder.Panel.AddView(MenuOther2,(MenuTasks.Le";
__ref._menuholder.getPanel().AddView((android.view.View)(__ref._menuother2.getObject()),(int) ((__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))),__ref._menutasks.getTop(),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=1507368;
 //BA.debugLineNum = 1507368;BA.debugLine="MenuOther2.Visible = False";
__ref._menuother2.setVisible(__c.False);
RDebugUtils.currentLine=1507369;
 //BA.debugLineNum = 1507369;BA.debugLine="MenuOther2.Enabled = False";
__ref._menuother2.setEnabled(__c.False);
RDebugUtils.currentLine=1507371;
 //BA.debugLineNum = 1507371;BA.debugLine="CreateMenu.Gravity = Gravity.CENTER";
__ref._createmenu.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1507372;
 //BA.debugLineNum = 1507372;BA.debugLine="CreateMenu.Text = \"+\"";
__ref._createmenu.setText(BA.ObjectToCharSequence("+"));
RDebugUtils.currentLine=1507373;
 //BA.debugLineNum = 1507373;BA.debugLine="CreateMenu.TextColor = Colors.White";
__ref._createmenu.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1507374;
 //BA.debugLineNum = 1507374;BA.debugLine="CreateMenu.TextSize = 25";
__ref._createmenu.setTextSize((float) (25));
RDebugUtils.currentLine=1507375;
 //BA.debugLineNum = 1507375;BA.debugLine="HelperFunctions1.Apply_ViewStyle(CreateMenu,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._createmenu.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=1507376;
 //BA.debugLineNum = 1507376;BA.debugLine="MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Lef";
__ref._menuholder.getPanel().AddView((android.view.View)(__ref._createmenu.getObject()),__ref._menutasks.getLeft(),(int) ((__ref._menutasks.getTop()+__ref._menutasks.getHeight())+__c.DipToCurrent((int) (4))),__ref._menutasks.getWidth(),__ref._menutasks.getHeight());
RDebugUtils.currentLine=1507377;
 //BA.debugLineNum = 1507377;BA.debugLine="CreateMenu.Visible = False";
__ref._createmenu.setVisible(__c.False);
RDebugUtils.currentLine=1507378;
 //BA.debugLineNum = 1507378;BA.debugLine="CreateMenu.Enabled = False";
__ref._createmenu.setEnabled(__c.False);
RDebugUtils.currentLine=1507380;
 //BA.debugLineNum = 1507380;BA.debugLine="wholescreen.AddView(MenuTypes.AsView,MenuHolder.L";
__ref._wholescreen.AddView((android.view.View)(__ref._menutypes._asview(null).getObject()),__ref._menuholder.getLeft(),__ref._menuholder.getTop(),__ref._menuholder.getWidth(),__ref._menuholder.getHeight());
RDebugUtils.currentLine=1507381;
 //BA.debugLineNum = 1507381;BA.debugLine="MenuTypes.AsView.Visible = False";
__ref._menutypes._asview(null).setVisible(__c.False);
RDebugUtils.currentLine=1507383;
 //BA.debugLineNum = 1507383;BA.debugLine="If Main.currentuser.TypeOfWorker = 0 Then";
if (_main._currentuser.TypeOfWorker==0) { 
RDebugUtils.currentLine=1507384;
 //BA.debugLineNum = 1507384;BA.debugLine="CreateMenu.Visible = True";
__ref._createmenu.setVisible(__c.True);
RDebugUtils.currentLine=1507385;
 //BA.debugLineNum = 1507385;BA.debugLine="CreateMenu.Enabled = True";
__ref._createmenu.setEnabled(__c.True);
RDebugUtils.currentLine=1507386;
 //BA.debugLineNum = 1507386;BA.debugLine="MenuOther1.Visible = False";
__ref._menuother1.setVisible(__c.False);
RDebugUtils.currentLine=1507387;
 //BA.debugLineNum = 1507387;BA.debugLine="MenuOther1.Enabled = False";
__ref._menuother1.setEnabled(__c.False);
RDebugUtils.currentLine=1507388;
 //BA.debugLineNum = 1507388;BA.debugLine="MenuOther2.Visible = True";
__ref._menuother2.setVisible(__c.True);
RDebugUtils.currentLine=1507389;
 //BA.debugLineNum = 1507389;BA.debugLine="MenuOther2.Enabled = True";
__ref._menuother2.setEnabled(__c.True);
 };
RDebugUtils.currentLine=1507392;
 //BA.debugLineNum = 1507392;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim screenimg As ImageView";
_screenimg = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim statusindicator As Label";
_statusindicator = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim MenuHolder As ScrollView";
_menuholder = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=1376265;
 //BA.debugLineNum = 1376265;BA.debugLine="Dim MenuTasks As Label";
_menutasks = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Dim MenuOther1 As Label";
_menuother1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376267;
 //BA.debugLineNum = 1376267;BA.debugLine="Dim MenuOther2 As Label";
_menuother2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="Dim CreateMenu As Label";
_createmenu = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1376273;
 //BA.debugLineNum = 1376273;BA.debugLine="Dim NumberOfMenus As Int = 0";
_numberofmenus = (int) (0);
RDebugUtils.currentLine=1376274;
 //BA.debugLineNum = 1376274;BA.debugLine="Dim MenuTypes As ChooseMenuType";
_menutypes = new b4a.example.choosemenutype();
RDebugUtils.currentLine=1376275;
 //BA.debugLineNum = 1376275;BA.debugLine="End Sub";
return "";
}
public String  _createmenuicon(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "createmenuicon"))
	return (String) Debug.delegate(ba, "createmenuicon", null);
anywheresoftware.b4a.objects.LabelWrapper _menunew = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub CreateMenuIcon";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="If NumberOfMenus < 3 Then";
if (__ref._numberofmenus<3) { 
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim MenuNew As Label";
_menunew = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="MenuNew.Initialize(\"BonusMenu\")";
_menunew.Initialize(ba,"BonusMenu");
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="MenuNew.Gravity = Gravity.CENTER";
_menunew.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="MenuNew.Text = \"Menu\"";
_menunew.setText(BA.ObjectToCharSequence("Menu"));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="MenuNew.TextColor = Colors.White";
_menunew.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="MenuNew.TextSize = 15";
_menunew.setTextSize((float) (15));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuNew,Colors.W";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menunew.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="MenuHolder.Panel.AddView(MenuNew,CreateMenu.Left,";
__ref._menuholder.getPanel().AddView((android.view.View)(_menunew.getObject()),__ref._createmenu.getLeft(),__ref._createmenu.getTop(),__ref._createmenu.getWidth(),__ref._createmenu.getHeight());
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="If CreateMenu.Left = MenuTasks.Left Then";
if (__ref._createmenu.getLeft()==__ref._menutasks.getLeft()) { 
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="CreateMenu.SetLayoutAnimated(500,(MenuTasks.Left";
__ref._createmenu.SetLayoutAnimated((int) (500),(int) ((__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))),_menunew.getTop(),_menunew.getWidth(),_menunew.getHeight());
 }else 
{RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="Else If CreateMenu.Left = (MenuTasks.Left + MenuT";
if (__ref._createmenu.getLeft()==(__ref._menutasks.getLeft()+__ref._menutasks.getWidth())+__c.DipToCurrent((int) (4))) { 
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="CreateMenu.SetLayoutAnimated(500,MenuTasks.Left,";
__ref._createmenu.SetLayoutAnimated((int) (500),__ref._menutasks.getLeft(),(int) ((_menunew.getTop()+_menunew.getHeight())+__c.DipToCurrent((int) (4))),_menunew.getWidth(),_menunew.getHeight());
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="MenuHolder.panel.Height = MenuHolder.panel.Heigh";
__ref._menuholder.getPanel().setHeight((int) (__ref._menuholder.getPanel().getHeight()+_menunew.getHeight()));
 }}
;
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="NumberOfMenus = NumberOfMenus + 1";
__ref._numberofmenus = (int) (__ref._numberofmenus+1);
 }else {
RDebugUtils.currentLine=1900564;
 //BA.debugLineNum = 1900564;BA.debugLine="Msgbox(\"You have reached maximum number of menus";
__c.Msgbox(BA.ObjectToCharSequence("You have reached maximum number of menus!Please buy more!"),BA.ObjectToCharSequence("We are sorry!"),ba);
 };
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="End Sub";
return "";
}
public String  _menucreator_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "menucreator_click"))
	return (String) Debug.delegate(ba, "menucreator_click", null);
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub MenuCreator_Click";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="CreateMenuIcon";
__ref._createmenuicon(null);
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="End Sub";
return "";
}
public String  _menutypeselected_checkedchange(b4a.example.userinterfacemainscreen __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "menutypeselected_checkedchange"))
	return (String) Debug.delegate(ba, "menutypeselected_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub MenuTypeSelected_CheckedChange(Checked As Bool";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 }else {
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="Checked = False";
_checked = __c.False;
 };
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="End Sub";
return "";
}
public String  _mytask_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "mytask_click"))
	return (String) Debug.delegate(ba, "mytask_click", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub MyTask_Click";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowMyTasks");
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public boolean  _propwindow_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "propwindow_click"))
	return (Boolean) Debug.delegate(ba, "propwindow_click", null);
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub propwindow_Click As Boolean";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="End Sub";
return false;
}
public boolean  _screenview_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "screenview_click"))
	return (Boolean) Debug.delegate(ba, "screenview_click", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub screenview_Click As Boolean";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="End Sub";
return false;
}
public String  _tasks_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "tasks_click"))
	return (String) Debug.delegate(ba, "tasks_click", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Tasks_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"ShowTaskTable");
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="End Sub";
return "";
}
}