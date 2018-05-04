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
public int _numberofmenus = 0;
public anywheresoftware.b4a.objects.PanelWrapper _propertywindowholder = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 98;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public String  _bonusmenu_longclick() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub BonusMenu_LongClick";
 //BA.debugLineNum = 136;BA.debugLine="PropertyWindowHolder.Visible = True";
_propertywindowholder.setVisible(__c.True);
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public String  _buildmenupropertywindow() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _optionholder = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox = null;
anywheresoftware.b4a.objects.LabelWrapper _name = null;
anywheresoftware.b4a.objects.PanelWrapper _optionholder1 = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox1 = null;
anywheresoftware.b4a.objects.LabelWrapper _name1 = null;
anywheresoftware.b4a.objects.PanelWrapper _optionholder2 = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checkbox2 = null;
anywheresoftware.b4a.objects.LabelWrapper _name2 = null;
anywheresoftware.b4a.objects.ButtonWrapper _okbtn = null;
 //BA.debugLineNum = 139;BA.debugLine="Sub BuildMenuPropertyWindow";
 //BA.debugLineNum = 140;BA.debugLine="PropertyWindowHolder.Color = Colors.rgb(77, 77, 7";
_propertywindowholder.setColor(__c.Colors.RGB((int) (77),(int) (77),(int) (77)));
 //BA.debugLineNum = 141;BA.debugLine="wholescreen.AddView(PropertyWindowHolder,MenuHold";
_wholescreen.AddView((android.view.View)(_propertywindowholder.getObject()),_menuholder.getLeft(),_menuholder.getTop(),_menuholder.getWidth(),_menuholder.getHeight());
 //BA.debugLineNum = 142;BA.debugLine="PropertyWindowHolder.Visible = False";
_propertywindowholder.setVisible(__c.False);
 //BA.debugLineNum = 144;BA.debugLine="Dim optionholder As Panel";
_optionholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 145;BA.debugLine="optionholder.Initialize(\"\")";
_optionholder.Initialize(ba,"");
 //BA.debugLineNum = 146;BA.debugLine="Dim checkbox As CheckBox";
_checkbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 147;BA.debugLine="checkbox.Initialize(\"MenuTypeSelected\")";
_checkbox.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 148;BA.debugLine="checkbox.Tag = 0";
_checkbox.setTag((Object)(0));
 //BA.debugLineNum = 149;BA.debugLine="Dim name As Label";
_name = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 150;BA.debugLine="name.Initialize(\"\")";
_name.Initialize(ba,"");
 //BA.debugLineNum = 151;BA.debugLine="optionholder.AddView(checkbox,5%x,0,10%x,5%y)";
_optionholder.AddView((android.view.View)(_checkbox.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 152;BA.debugLine="name.Gravity = Gravity.CENTER";
_name.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 153;BA.debugLine="name.Text = \"Workers manager\"";
_name.setText(BA.ObjectToCharSequence("Workers manager"));
 //BA.debugLineNum = 154;BA.debugLine="name.TextColor = Colors.White";
_name.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 155;BA.debugLine="name.TextSize = 13";
_name.setTextSize((float) (13));
 //BA.debugLineNum = 156;BA.debugLine="optionholder.AddView(name,15%x,0,30%x,5%y)";
_optionholder.AddView((android.view.View)(_name.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 157;BA.debugLine="PropertyWindowHolder.AddView(optionholder,5%x,5%y";
_propertywindowholder.AddView((android.view.View)(_optionholder.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (5),ba),_menuholder.getWidth(),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 159;BA.debugLine="Dim optionholder1 As Panel";
_optionholder1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 160;BA.debugLine="optionholder1.Initialize(\"\")";
_optionholder1.Initialize(ba,"");
 //BA.debugLineNum = 161;BA.debugLine="Dim checkbox1 As CheckBox";
_checkbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 162;BA.debugLine="checkbox1.Initialize(\"MenuTypeSelected\")";
_checkbox1.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 163;BA.debugLine="checkbox1.Tag = 1";
_checkbox1.setTag((Object)(1));
 //BA.debugLineNum = 164;BA.debugLine="Dim name1 As Label";
_name1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 165;BA.debugLine="name1.Initialize(\"\")";
_name1.Initialize(ba,"");
 //BA.debugLineNum = 166;BA.debugLine="optionholder1.AddView(checkbox1,5%x,0,10%x,5%y)";
_optionholder1.AddView((android.view.View)(_checkbox1.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 167;BA.debugLine="name1.Gravity = Gravity.CENTER";
_name1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 168;BA.debugLine="name1.Text = \"Efficiency check\"";
_name1.setText(BA.ObjectToCharSequence("Efficiency check"));
 //BA.debugLineNum = 169;BA.debugLine="name1.TextColor = Colors.White";
_name1.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 170;BA.debugLine="name1.TextSize = 13";
_name1.setTextSize((float) (13));
 //BA.debugLineNum = 171;BA.debugLine="optionholder1.AddView(name1,15%x,0,30%x,5%y)";
_optionholder1.AddView((android.view.View)(_name1.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 172;BA.debugLine="PropertyWindowHolder.AddView(optionholder1,5%x,10";
_propertywindowholder.AddView((android.view.View)(_optionholder1.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),_menuholder.getWidth(),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 174;BA.debugLine="Dim optionholder2 As Panel";
_optionholder2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 175;BA.debugLine="optionholder2.Initialize(\"\")";
_optionholder2.Initialize(ba,"");
 //BA.debugLineNum = 176;BA.debugLine="Dim checkbox2 As CheckBox";
_checkbox2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 177;BA.debugLine="checkbox2.Initialize(\"MenuTypeSelected\")";
_checkbox2.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 178;BA.debugLine="checkbox2.Tag = 2";
_checkbox2.setTag((Object)(2));
 //BA.debugLineNum = 179;BA.debugLine="Dim name2 As Label";
_name2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 180;BA.debugLine="name2.Initialize(\"\")";
_name2.Initialize(ba,"");
 //BA.debugLineNum = 181;BA.debugLine="optionholder2.AddView(checkbox2,5%x,0,10%x,5%y)";
_optionholder2.AddView((android.view.View)(_checkbox2.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 182;BA.debugLine="name2.Gravity = Gravity.CENTER";
_name2.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 183;BA.debugLine="name2.Text = \"Tasks Manager\"";
_name2.setText(BA.ObjectToCharSequence("Tasks Manager"));
 //BA.debugLineNum = 184;BA.debugLine="name2.TextColor = Colors.White";
_name2.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 185;BA.debugLine="name2.TextSize = 13";
_name2.setTextSize((float) (13));
 //BA.debugLineNum = 186;BA.debugLine="optionholder2.AddView(name2,15%x,0,30%x,5%y)";
_optionholder2.AddView((android.view.View)(_name2.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 187;BA.debugLine="PropertyWindowHolder.AddView(optionholder2,5%x,15";
_propertywindowholder.AddView((android.view.View)(_optionholder2.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (15),ba),_menuholder.getWidth(),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 189;BA.debugLine="Dim OKbtn As Button";
_okbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 190;BA.debugLine="OKbtn.Initialize(\"SelectedMenuType\")";
_okbtn.Initialize(ba,"SelectedMenuType");
 //BA.debugLineNum = 191;BA.debugLine="OKbtn.Gravity = Gravity.CENTER";
_okbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 192;BA.debugLine="OKbtn.Text = \"OK\"";
_okbtn.setText(BA.ObjectToCharSequence("OK"));
 //BA.debugLineNum = 193;BA.debugLine="HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Bla";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_okbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 194;BA.debugLine="PropertyWindowHolder.AddView(OKbtn,15%x,30%y,Menu";
_propertywindowholder.AddView((android.view.View)(_okbtn.getObject()),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (30),ba),(int) (_menuholder.getWidth()/(double)2),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 47;BA.debugLine="usernamelbl.Textcolor = Colors.White";
_usernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 48;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 49;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
_usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 50;BA.debugLine="usernamelbl.TextSize = 20";
_usernamelbl.setTextSize((float) (20));
 //BA.debugLineNum = 51;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
_wholescreen.AddView((android.view.View)(_usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 53;BA.debugLine="availability.TextColor = Colors.White";
_availability.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 54;BA.debugLine="availability.Gravity = Gravity.CENTER";
_availability.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 55;BA.debugLine="availability.TextSize = 20";
_availability.setTextSize((float) (20));
 //BA.debugLineNum = 56;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 57;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 59;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 61;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
 //BA.debugLineNum = 62;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
_wholescreen.AddView((android.view.View)(_availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 63;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
_wholescreen.AddView((android.view.View)(_statusindicator.getObject()),(int) (_availability.getLeft()+_availability.getWidth()),__c.PerYToCurrent((float) (3.5),ba),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (3),ba));
 //BA.debugLineNum = 65;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
_wholescreen.AddView((android.view.View)(_menuholder.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (25),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 66;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
_menutasks.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 67;BA.debugLine="MenuTasks.Text = \"Task Table\"";
_menutasks.setText(BA.ObjectToCharSequence("Task Table"));
 //BA.debugLineNum = 68;BA.debugLine="MenuTasks.TextColor = Colors.White";
_menutasks.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 69;BA.debugLine="MenuTasks.TextSize = 15";
_menutasks.setTextSize((float) (15));
 //BA.debugLineNum = 70;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menutasks.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 71;BA.debugLine="MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,2";
_menuholder.getPanel().AddView((android.view.View)(_menutasks.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (20),ba));
 //BA.debugLineNum = 73;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
_menuother1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 74;BA.debugLine="MenuOther1.Text = \"My Task\"";
_menuother1.setText(BA.ObjectToCharSequence("My Task"));
 //BA.debugLineNum = 75;BA.debugLine="MenuOther1.TextColor = Colors.White";
_menuother1.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 76;BA.debugLine="MenuOther1.TextSize = 15";
_menuother1.setTextSize((float) (15));
 //BA.debugLineNum = 77;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menuother1.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 78;BA.debugLine="MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Le";
_menuholder.getPanel().AddView((android.view.View)(_menuother1.getObject()),(int) ((_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))),_menutasks.getTop(),_menutasks.getWidth(),_menutasks.getHeight());
 //BA.debugLineNum = 80;BA.debugLine="CreateMenu.Gravity = Gravity.CENTER";
_createmenu.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 81;BA.debugLine="CreateMenu.Text = \"+\"";
_createmenu.setText(BA.ObjectToCharSequence("+"));
 //BA.debugLineNum = 82;BA.debugLine="CreateMenu.TextColor = Colors.White";
_createmenu.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="CreateMenu.TextSize = 25";
_createmenu.setTextSize((float) (25));
 //BA.debugLineNum = 84;BA.debugLine="HelperFunctions1.Apply_ViewStyle(CreateMenu,Color";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_createmenu.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 85;BA.debugLine="MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Lef";
_menuholder.getPanel().AddView((android.view.View)(_createmenu.getObject()),_menutasks.getLeft(),(int) ((_menutasks.getTop()+_menutasks.getHeight())+__c.DipToCurrent((int) (4))),_menutasks.getWidth(),_menutasks.getHeight());
 //BA.debugLineNum = 86;BA.debugLine="CreateMenu.Visible = False";
_createmenu.setVisible(__c.False);
 //BA.debugLineNum = 87;BA.debugLine="CreateMenu.Enabled = False";
_createmenu.setEnabled(__c.False);
 //BA.debugLineNum = 88;BA.debugLine="If Main.currentuser.TypeOfWorker = 0 Then";
if (_main._currentuser.TypeOfWorker==0) { 
 //BA.debugLineNum = 89;BA.debugLine="CreateMenu.Visible = True";
_createmenu.setVisible(__c.True);
 //BA.debugLineNum = 90;BA.debugLine="CreateMenu.Enabled = True";
_createmenu.setEnabled(__c.True);
 };
 //BA.debugLineNum = 93;BA.debugLine="BuildMenuPropertyWindow";
_buildmenupropertywindow();
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 15;BA.debugLine="Dim NumberOfMenus As Int = 0";
_numberofmenus = (int) (0);
 //BA.debugLineNum = 17;BA.debugLine="Dim PropertyWindowHolder As Panel";
_propertywindowholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _createmenuicon() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _menunew = null;
 //BA.debugLineNum = 112;BA.debugLine="Sub CreateMenuIcon";
 //BA.debugLineNum = 113;BA.debugLine="If NumberOfMenus < 3 Then";
if (_numberofmenus<3) { 
 //BA.debugLineNum = 114;BA.debugLine="Dim MenuNew As Label";
_menunew = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 115;BA.debugLine="MenuNew.Initialize(\"BonusMenu\")";
_menunew.Initialize(ba,"BonusMenu");
 //BA.debugLineNum = 116;BA.debugLine="MenuNew.Gravity = Gravity.CENTER";
_menunew.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 117;BA.debugLine="MenuNew.Text = \"Menu\"";
_menunew.setText(BA.ObjectToCharSequence("Menu"));
 //BA.debugLineNum = 118;BA.debugLine="MenuNew.TextColor = Colors.White";
_menunew.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 119;BA.debugLine="MenuNew.TextSize = 15";
_menunew.setTextSize((float) (15));
 //BA.debugLineNum = 121;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuNew,Colors.W";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_menunew.getObject())),__c.Colors.White,__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (120),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (200),(int) (0),(int) (0),(int) (0)),__c.Colors.ARGB((int) (160),(int) (0),(int) (0),(int) (0)),__c.Colors.Black,__c.Colors.Black,(int) (0));
 //BA.debugLineNum = 122;BA.debugLine="MenuHolder.Panel.AddView(MenuNew,CreateMenu.Left,";
_menuholder.getPanel().AddView((android.view.View)(_menunew.getObject()),_createmenu.getLeft(),_createmenu.getTop(),_createmenu.getWidth(),_createmenu.getHeight());
 //BA.debugLineNum = 124;BA.debugLine="If CreateMenu.Left = MenuTasks.Left Then";
if (_createmenu.getLeft()==_menutasks.getLeft()) { 
 //BA.debugLineNum = 125;BA.debugLine="CreateMenu.SetLayoutAnimated(500,(MenuTasks.Left";
_createmenu.SetLayoutAnimated((int) (500),(int) ((_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))),_menunew.getTop(),_menunew.getWidth(),_menunew.getHeight());
 }else if(_createmenu.getLeft()==(_menutasks.getLeft()+_menutasks.getWidth())+__c.DipToCurrent((int) (4))) { 
 //BA.debugLineNum = 127;BA.debugLine="CreateMenu.SetLayoutAnimated(500,MenuTasks.Left,";
_createmenu.SetLayoutAnimated((int) (500),_menutasks.getLeft(),(int) ((_menunew.getTop()+_menunew.getHeight())+__c.DipToCurrent((int) (4))),_menunew.getWidth(),_menunew.getHeight());
 //BA.debugLineNum = 128;BA.debugLine="MenuHolder.panel.Height = MenuHolder.panel.Heigh";
_menuholder.getPanel().setHeight((int) (_menuholder.getPanel().getHeight()+_menunew.getHeight()));
 };
 //BA.debugLineNum = 130;BA.debugLine="NumberOfMenus = NumberOfMenus + 1";
_numberofmenus = (int) (_numberofmenus+1);
 }else {
 //BA.debugLineNum = 132;BA.debugLine="Msgbox(\"You have reached maximum number of menus";
__c.Msgbox(BA.ObjectToCharSequence("You have reached maximum number of menus!Please buy more!"),BA.ObjectToCharSequence("We are sorry!"),ba);
 };
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 23;BA.debugLine="wholescreen.Initialize(\"screenview\")";
_wholescreen.Initialize(ba,"screenview");
 //BA.debugLineNum = 24;BA.debugLine="screenimg.Initialize(\"\")";
_screenimg.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
_screenimg.SetBackgroundImageNew((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),"mainscreenimg.png").getObject()));
 //BA.debugLineNum = 26;BA.debugLine="screenimg.Gravity = Gravity.FILL";
_screenimg.setGravity(__c.Gravity.FILL);
 //BA.debugLineNum = 27;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
_wholescreen.AddView((android.view.View)(_screenimg.getObject()),(int) (0),__c.PerYToCurrent((float) (10),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (80),ba));
 //BA.debugLineNum = 29;BA.debugLine="statusindicator.Initialize(\"\")";
_statusindicator.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="usernamelbl.Initialize(\"username\")";
_usernamelbl.Initialize(ba,"username");
 //BA.debugLineNum = 31;BA.debugLine="availability.Initialize(\"avail\")";
_availability.Initialize(ba,"avail");
 //BA.debugLineNum = 33;BA.debugLine="MenuHolder.Initialize(40%y+4dip)";
_menuholder.Initialize(ba,(int) (__c.PerYToCurrent((float) (40),ba)+__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 34;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
_menutasks.Initialize(ba,"Tasks");
 //BA.debugLineNum = 35;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
_menuother1.Initialize(ba,"MyTask");
 //BA.debugLineNum = 36;BA.debugLine="CreateMenu.Initialize(\"MenuCreator\")";
_createmenu.Initialize(ba,"MenuCreator");
 //BA.debugLineNum = 39;BA.debugLine="PropertyWindowHolder.Initialize(\"propwindow\")";
_propertywindowholder.Initialize(ba,"propwindow");
 //BA.debugLineNum = 42;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _menucreator_click() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub MenuCreator_Click";
 //BA.debugLineNum = 107;BA.debugLine="CreateMenuIcon";
_createmenuicon();
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _menutypeselected_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub MenuTypeSelected_CheckedChange(Checked As Bool";
 //BA.debugLineNum = 200;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 202;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 }else {
 //BA.debugLineNum = 205;BA.debugLine="Checked = False";
_checked = __c.False;
 };
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return "";
}
public String  _mytask_click() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub MyTask_Click";
 //BA.debugLineNum = 104;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowMyTasks");
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return "";
}
public boolean  _propwindow_click() throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub propwindow_Click As Boolean";
 //BA.debugLineNum = 110;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return false;
}
public boolean  _screenview_click() throws Exception{
 //BA.debugLineNum = 220;BA.debugLine="Sub screenview_Click As Boolean";
 //BA.debugLineNum = 221;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return false;
}
public String  _selectedmenutype_click() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub SelectedMenuType_Click";
 //BA.debugLineNum = 197;BA.debugLine="PropertyWindowHolder.Visible = False";
_propertywindowholder.setVisible(__c.False);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _setavailable() throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Public Sub SetAvailable";
 //BA.debugLineNum = 215;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
 //BA.debugLineNum = 216;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 //BA.debugLineNum = 217;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,__c.Colors.Green,(int) (30));
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return "";
}
public String  _setbusy() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Public Sub SetBusy";
 //BA.debugLineNum = 210;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
 //BA.debugLineNum = 211;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 //BA.debugLineNum = 212;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_statusindicator.getObject())),__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,__c.Colors.Red,(int) (30));
 //BA.debugLineNum = 213;BA.debugLine="End Sub";
return "";
}
public String  _tasks_click() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub Tasks_Click";
 //BA.debugLineNum = 101;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"ShowTaskTable");
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
