package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class choosemenutype extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.choosemenutype");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.choosemenutype.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _propertywindowholder = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 70;BA.debugLine="Return PropertyWindowHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_propertywindowholder.getObject()));
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
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
 //BA.debugLineNum = 12;BA.debugLine="Sub BuildMenuPropertyWindow";
 //BA.debugLineNum = 13;BA.debugLine="PropertyWindowHolder.Color = Colors.rgb(77, 77, 7";
_propertywindowholder.setColor(__c.Colors.RGB((int) (77),(int) (77),(int) (77)));
 //BA.debugLineNum = 15;BA.debugLine="PropertyWindowHolder.Visible = False";
_propertywindowholder.setVisible(__c.False);
 //BA.debugLineNum = 17;BA.debugLine="Dim optionholder As Panel";
_optionholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="optionholder.Initialize(\"\")";
_optionholder.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="Dim checkbox As CheckBox";
_checkbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 20;BA.debugLine="checkbox.Initialize(\"MenuTypeSelected\")";
_checkbox.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 21;BA.debugLine="checkbox.Tag = 0";
_checkbox.setTag((Object)(0));
 //BA.debugLineNum = 22;BA.debugLine="Dim name As Label";
_name = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="name.Initialize(\"\")";
_name.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="optionholder.AddView(checkbox,5%x,0,10%x,5%y)";
_optionholder.AddView((android.view.View)(_checkbox.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 25;BA.debugLine="name.Gravity = Gravity.CENTER";
_name.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 26;BA.debugLine="name.Text = \"Workers manager\"";
_name.setText(BA.ObjectToCharSequence("Workers manager"));
 //BA.debugLineNum = 27;BA.debugLine="name.TextColor = Colors.White";
_name.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 28;BA.debugLine="name.TextSize = 13";
_name.setTextSize((float) (13));
 //BA.debugLineNum = 29;BA.debugLine="optionholder.AddView(name,15%x,0,30%x,5%y)";
_optionholder.AddView((android.view.View)(_name.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 30;BA.debugLine="PropertyWindowHolder.AddView(optionholder,5%x,5%y";
_propertywindowholder.AddView((android.view.View)(_optionholder.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (5),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 32;BA.debugLine="Dim optionholder1 As Panel";
_optionholder1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="optionholder1.Initialize(\"\")";
_optionholder1.Initialize(ba,"");
 //BA.debugLineNum = 34;BA.debugLine="Dim checkbox1 As CheckBox";
_checkbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 35;BA.debugLine="checkbox1.Initialize(\"MenuTypeSelected\")";
_checkbox1.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 36;BA.debugLine="checkbox1.Tag = 1";
_checkbox1.setTag((Object)(1));
 //BA.debugLineNum = 37;BA.debugLine="Dim name1 As Label";
_name1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 38;BA.debugLine="name1.Initialize(\"\")";
_name1.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="optionholder1.AddView(checkbox1,5%x,0,10%x,5%y)";
_optionholder1.AddView((android.view.View)(_checkbox1.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 40;BA.debugLine="name1.Gravity = Gravity.CENTER";
_name1.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 41;BA.debugLine="name1.Text = \"Efficiency check\"";
_name1.setText(BA.ObjectToCharSequence("Efficiency check"));
 //BA.debugLineNum = 42;BA.debugLine="name1.TextColor = Colors.White";
_name1.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 43;BA.debugLine="name1.TextSize = 13";
_name1.setTextSize((float) (13));
 //BA.debugLineNum = 44;BA.debugLine="optionholder1.AddView(name1,15%x,0,30%x,5%y)";
_optionholder1.AddView((android.view.View)(_name1.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 45;BA.debugLine="PropertyWindowHolder.AddView(optionholder1,5%x,10";
_propertywindowholder.AddView((android.view.View)(_optionholder1.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 47;BA.debugLine="Dim optionholder2 As Panel";
_optionholder2 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="optionholder2.Initialize(\"\")";
_optionholder2.Initialize(ba,"");
 //BA.debugLineNum = 49;BA.debugLine="Dim checkbox2 As CheckBox";
_checkbox2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 50;BA.debugLine="checkbox2.Initialize(\"MenuTypeSelected\")";
_checkbox2.Initialize(ba,"MenuTypeSelected");
 //BA.debugLineNum = 51;BA.debugLine="checkbox2.Tag = 2";
_checkbox2.setTag((Object)(2));
 //BA.debugLineNum = 52;BA.debugLine="Dim name2 As Label";
_name2 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="name2.Initialize(\"\")";
_name2.Initialize(ba,"");
 //BA.debugLineNum = 54;BA.debugLine="optionholder2.AddView(checkbox2,5%x,0,10%x,5%y)";
_optionholder2.AddView((android.view.View)(_checkbox2.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 55;BA.debugLine="name2.Gravity = Gravity.CENTER";
_name2.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 56;BA.debugLine="name2.Text = \"Tasks Manager\"";
_name2.setText(BA.ObjectToCharSequence("Tasks Manager"));
 //BA.debugLineNum = 57;BA.debugLine="name2.TextColor = Colors.White";
_name2.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 58;BA.debugLine="name2.TextSize = 13";
_name2.setTextSize((float) (13));
 //BA.debugLineNum = 59;BA.debugLine="optionholder2.AddView(name2,15%x,0,30%x,5%y)";
_optionholder2.AddView((android.view.View)(_name2.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 60;BA.debugLine="PropertyWindowHolder.AddView(optionholder2,5%x,15";
_propertywindowholder.AddView((android.view.View)(_optionholder2.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (15),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 62;BA.debugLine="Dim OKbtn As Button";
_okbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 63;BA.debugLine="OKbtn.Initialize(\"SelectedMenuType\")";
_okbtn.Initialize(ba,"SelectedMenuType");
 //BA.debugLineNum = 64;BA.debugLine="OKbtn.Gravity = Gravity.CENTER";
_okbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 65;BA.debugLine="OKbtn.Text = \"OK\"";
_okbtn.setText(BA.ObjectToCharSequence("OK"));
 //BA.debugLineNum = 66;BA.debugLine="HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Bla";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_okbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 67;BA.debugLine="PropertyWindowHolder.AddView(OKbtn,15%x,30%y,(60%";
_propertywindowholder.AddView((android.view.View)(_okbtn.getObject()),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (30),ba),(int) ((__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4)))/(double)2),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim PropertyWindowHolder As Panel";
_propertywindowholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 9;BA.debugLine="PropertyWindowHolder.Initialize(\"propwindow\")";
_propertywindowholder.Initialize(ba,"propwindow");
 //BA.debugLineNum = 10;BA.debugLine="BuildMenuPropertyWindow";
_buildmenupropertywindow();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _selectedmenutype_click() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub SelectedMenuType_Click";
 //BA.debugLineNum = 73;BA.debugLine="PropertyWindowHolder.Visible = False";
_propertywindowholder.setVisible(__c.False);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
