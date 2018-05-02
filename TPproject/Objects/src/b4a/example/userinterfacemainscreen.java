package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class userinterfacemainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.userinterfacemainscreen");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _screenimg = null;
public anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _availability = null;
public anywheresoftware.b4a.objects.LabelWrapper _statusindicator = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _menuholder = null;
public anywheresoftware.b4a.objects.LabelWrapper _menutasks = null;
public anywheresoftware.b4a.objects.LabelWrapper _menuother1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _createmenu = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 87;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 44;BA.debugLine="usernamelbl.Textcolor = Colors.White";
_usernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 45;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 46;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
_usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 47;BA.debugLine="usernamelbl.TextSize = 20";
_usernamelbl.setTextSize((float) (20));
 //BA.debugLineNum = 48;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
_wholescreen.AddView((android.view.View)(_usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 50;BA.debugLine="availability.TextColor = Colors.White";
_availability.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 51;BA.debugLine="availability.Gravity = Gravity.CENTER";
_availability.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 52;BA.debugLine="availability.TextSize = 20";
_availability.setTextSize((float) (20));
 //BA.debugLineNum = 53;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 54;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 56;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 58;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
 //BA.debugLineNum = 59;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
_wholescreen.AddView((android.view.View)(_availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 60;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
_wholescreen.AddView((android.view.View)(_statusindicator.getObject()),(int) (_availability.getLeft()+_availability.getWidth()),__c.PerYToCurrent((float) (3.5),ba),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (3),ba));
 //BA.debugLineNum = 62;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
_wholescreen.AddView((android.view.View)(_menuholder.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 63;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
_menutasks.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 64;BA.debugLine="MenuTasks.Text = \"Task Table\"";
_menutasks.setText(BA.ObjectToCharSequence("Task Table"));
 //BA.debugLineNum = 65;BA.debugLine="MenuTasks.TextColor = Colors.White";
_menutasks.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 66;BA.debugLine="MenuTasks.TextSize = 15";
_menutasks.setTextSize((float) (15));
 //BA.debugLineNum = 67;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menutasks.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 68;BA.debugLine="MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,2";
_menuholder.getPanel().AddView((android.view.View)(_menutasks.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 70;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
_menuother1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 71;BA.debugLine="MenuOther1.Text = \"My Task\"";
_menuother1.setText(BA.ObjectToCharSequence("My Task"));
 //BA.debugLineNum = 72;BA.debugLine="MenuOther1.TextColor = Colors.White";
_menuother1.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 73;BA.debugLine="MenuOther1.TextSize = 15";
_menuother1.setTextSize((float) (15));
 //BA.debugLineNum = 74;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menuother1.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 75;BA.debugLine="MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Le";
_menuholder.getPanel().AddView((android.view.View)(_menuother1.getObject()),(int) ((_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))),_menutasks.getTop(),_menutasks.getWidth(),_menutasks.getHeight());
 //BA.debugLineNum = 77;BA.debugLine="CreateMenu.Gravity = Gravity.CENTER";
_createmenu.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 78;BA.debugLine="CreateMenu.Text = \"+\"";
_createmenu.setText(BA.ObjectToCharSequence("+"));
 //BA.debugLineNum = 79;BA.debugLine="CreateMenu.TextColor = Colors.White";
_createmenu.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 80;BA.debugLine="CreateMenu.TextSize = 25";
_createmenu.setTextSize((float) (25));
 //BA.debugLineNum = 81;BA.debugLine="HelperFunctions1.Apply_ViewStyle(CreateMenu,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_createmenu.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 82;BA.debugLine="MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Lef";
_menuholder.getPanel().AddView((android.view.View)(_createmenu.getObject()),_menutasks.getLeft(),(int) ((_menutasks.getTop()+_menutasks.getHeight())+__c.DipToCurrent((int) (4))),_menutasks.getWidth(),_menutasks.getHeight());
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim screenimg As ImageView";
_screenimg = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim statusindicator As Label";
_statusindicator = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim MenuHolder As ScrollView";
_menuholder = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim MenuTasks As Label";
_menutasks = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim MenuOther1 As Label";
_menuother1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim CreateMenu As Label";
_createmenu = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _createmenuicon() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _menunew = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub CreateMenuIcon";
 //BA.debugLineNum = 100;BA.debugLine="Dim MenuNew As Label";
_menunew = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 101;BA.debugLine="MenuNew.Initialize(\"BonusMenu\")";
_menunew.Initialize(ba,"BonusMenu");
 //BA.debugLineNum = 102;BA.debugLine="MenuNew.Gravity = Gravity.CENTER";
_menunew.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 103;BA.debugLine="MenuNew.Text = \"Menu\"";
_menunew.setText(BA.ObjectToCharSequence("Menu"));
 //BA.debugLineNum = 104;BA.debugLine="MenuNew.TextColor = Colors.White";
_menunew.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 105;BA.debugLine="MenuNew.TextSize = 15";
_menunew.setTextSize((float) (15));
 //BA.debugLineNum = 107;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuNew,Colors.W";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menunew.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 108;BA.debugLine="MenuHolder.Panel.AddView(MenuNew,CreateMenu.Left,";
_menuholder.getPanel().AddView((android.view.View)(_menunew.getObject()),_createmenu.getLeft(),_createmenu.getTop(),_createmenu.getWidth(),_createmenu.getHeight());
 //BA.debugLineNum = 110;BA.debugLine="If CreateMenu.Left = MenuTasks.Left Then";
if (_createmenu.getLeft()==_menutasks.getLeft()) { 
 //BA.debugLineNum = 111;BA.debugLine="CreateMenu.SetLayoutAnimated(500,(MenuTasks.Left";
_createmenu.SetLayoutAnimated((int) (500),(int) ((_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))),_menunew.getTop(),_menunew.getWidth(),_menunew.getHeight());
 }else if(_createmenu.getLeft()==(_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))) { 
 //BA.debugLineNum = 113;BA.debugLine="CreateMenu.SetLayoutAnimated(500,MenuTasks.Left,";
_createmenu.SetLayoutAnimated((int) (500),_menutasks.getLeft(),(int) ((_menunew.getTop()+_menunew.getHeight())+__c.DipToCurrent((int) (4))),_menunew.getWidth(),_menunew.getHeight());
 //BA.debugLineNum = 114;BA.debugLine="MenuHolder.panel.Height = MenuHolder.panel.Heigh";
_menuholder.getPanel().setHeight((int) (_menuholder.getPanel().getHeight()+_menunew.getHeight()));
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="wholescreen.Initialize(\"screenview\")";
_wholescreen.Initialize(ba,"screenview");
 //BA.debugLineNum = 22;BA.debugLine="screenimg.Initialize(\"\")";
_screenimg.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
_screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"mainscreenimg.png").getObject()));
 //BA.debugLineNum = 24;BA.debugLine="screenimg.Gravity = Gravity.FILL";
_screenimg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 25;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
_wholescreen.AddView((android.view.View)(_screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
 //BA.debugLineNum = 27;BA.debugLine="statusindicator.Initialize(\"\")";
_statusindicator.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="usernamelbl.Initialize(\"username\")";
_usernamelbl.Initialize(ba,"username");
 //BA.debugLineNum = 29;BA.debugLine="availability.Initialize(\"avail\")";
_availability.Initialize(ba,"avail");
 //BA.debugLineNum = 31;BA.debugLine="MenuHolder.Initialize(40%y+4dip)";
_menuholder.Initialize(ba,(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 32;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
_menutasks.Initialize(ba,"Tasks");
 //BA.debugLineNum = 33;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
_menuother1.Initialize(ba,"MyTask");
 //BA.debugLineNum = 34;BA.debugLine="CreateMenu.Initialize(\"MenuCreator\")";
_createmenu.Initialize(ba,"MenuCreator");
 //BA.debugLineNum = 39;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _menu4_click() throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub Menu4_Click";
 //BA.debugLineNum = 118;BA.debugLine="CallSub(Main,\"ShowMenu4\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowMenu4");
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _menucreator_click() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub MenuCreator_Click";
 //BA.debugLineNum = 96;BA.debugLine="CreateMenuIcon";
_createmenuicon();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _mytask_click() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub MyTask_Click";
 //BA.debugLineNum = 93;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowMyTasks");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public boolean  _screenview_click() throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub screenview_Click As Boolean";
 //BA.debugLineNum = 132;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return false;
}
public String  _setavailable() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Public Sub SetAvailable";
 //BA.debugLineNum = 126;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
 //BA.debugLineNum = 127;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 //BA.debugLineNum = 128;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _setbusy() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub SetBusy";
 //BA.debugLineNum = 121;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
 //BA.debugLineNum = 122;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 //BA.debugLineNum = 123;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,(int) (30));
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return "";
}
public String  _tasks_click() throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Sub Tasks_Click";
 //BA.debugLineNum = 90;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowTaskTable");
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
