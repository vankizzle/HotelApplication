package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class choosemenutype extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.choosemenutype");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _propertywindowholder = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.choosemenutype __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="choosemenutype";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return PropertyWindowHolder";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._propertywindowholder.getObject()));
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.choosemenutype __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="choosemenutype";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="PropertyWindowHolder.Initialize(\"propwindow\")";
__ref._propertywindowholder.Initialize(ba,"propwindow");
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="BuildMenuPropertyWindow";
__ref._buildmenupropertywindow(null);
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public String  _buildmenupropertywindow(b4a.example.choosemenutype __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="choosemenutype";
if (Debug.shouldDelegate(ba, "buildmenupropertywindow"))
	return (String) Debug.delegate(ba, "buildmenupropertywindow", null);
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
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub BuildMenuPropertyWindow";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="PropertyWindowHolder.Color = Colors.rgb(77, 77, 7";
__ref._propertywindowholder.setColor(__c.Colors.RGB((int) (77),(int) (77),(int) (77)));
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="PropertyWindowHolder.Visible = False";
__ref._propertywindowholder.setVisible(__c.False);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim optionholder As Panel";
_optionholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="optionholder.Initialize(\"\")";
_optionholder.Initialize(ba,"");
RDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="Dim checkbox As CheckBox";
_checkbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="checkbox.Initialize(\"MenuTypeSelected\")";
_checkbox.Initialize(ba,"MenuTypeSelected");
RDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="checkbox.Tag = 0";
_checkbox.setTag((Object)(0));
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="Dim name As Label";
_name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="name.Initialize(\"\")";
_name.Initialize(ba,"");
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="optionholder.AddView(checkbox,5%x,0,10%x,5%y)";
_optionholder.AddView((android.view.View)(_checkbox.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="name.Gravity = Gravity.CENTER";
_name.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4390926;
 //BA.debugLineNum = 4390926;BA.debugLine="name.Text = \"Workers manager\"";
_name.setText(BA.ObjectToCharSequence("Workers manager"));
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="name.TextColor = Colors.White";
_name.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="name.TextSize = 13";
_name.setTextSize((float) (13));
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="optionholder.AddView(name,15%x,0,30%x,5%y)";
_optionholder.AddView((android.view.View)(_name.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390930;
 //BA.debugLineNum = 4390930;BA.debugLine="PropertyWindowHolder.AddView(optionholder,5%x,5%y";
__ref._propertywindowholder.AddView((android.view.View)(_optionholder.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (5),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="Dim optionholder1 As Panel";
_optionholder1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="optionholder1.Initialize(\"\")";
_optionholder1.Initialize(ba,"");
RDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="Dim checkbox1 As CheckBox";
_checkbox1 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4390935;
 //BA.debugLineNum = 4390935;BA.debugLine="checkbox1.Initialize(\"MenuTypeSelected\")";
_checkbox1.Initialize(ba,"MenuTypeSelected");
RDebugUtils.currentLine=4390936;
 //BA.debugLineNum = 4390936;BA.debugLine="checkbox1.Tag = 1";
_checkbox1.setTag((Object)(1));
RDebugUtils.currentLine=4390937;
 //BA.debugLineNum = 4390937;BA.debugLine="Dim name1 As Label";
_name1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4390938;
 //BA.debugLineNum = 4390938;BA.debugLine="name1.Initialize(\"\")";
_name1.Initialize(ba,"");
RDebugUtils.currentLine=4390939;
 //BA.debugLineNum = 4390939;BA.debugLine="optionholder1.AddView(checkbox1,5%x,0,10%x,5%y)";
_optionholder1.AddView((android.view.View)(_checkbox1.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390940;
 //BA.debugLineNum = 4390940;BA.debugLine="name1.Gravity = Gravity.CENTER";
_name1.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4390941;
 //BA.debugLineNum = 4390941;BA.debugLine="name1.Text = \"Efficiency check\"";
_name1.setText(BA.ObjectToCharSequence("Efficiency check"));
RDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="name1.TextColor = Colors.White";
_name1.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4390943;
 //BA.debugLineNum = 4390943;BA.debugLine="name1.TextSize = 13";
_name1.setTextSize((float) (13));
RDebugUtils.currentLine=4390944;
 //BA.debugLineNum = 4390944;BA.debugLine="optionholder1.AddView(name1,15%x,0,30%x,5%y)";
_optionholder1.AddView((android.view.View)(_name1.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390945;
 //BA.debugLineNum = 4390945;BA.debugLine="PropertyWindowHolder.AddView(optionholder1,5%x,10";
__ref._propertywindowholder.AddView((android.view.View)(_optionholder1.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (10),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390947;
 //BA.debugLineNum = 4390947;BA.debugLine="Dim optionholder2 As Panel";
_optionholder2 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4390948;
 //BA.debugLineNum = 4390948;BA.debugLine="optionholder2.Initialize(\"\")";
_optionholder2.Initialize(ba,"");
RDebugUtils.currentLine=4390949;
 //BA.debugLineNum = 4390949;BA.debugLine="Dim checkbox2 As CheckBox";
_checkbox2 = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=4390950;
 //BA.debugLineNum = 4390950;BA.debugLine="checkbox2.Initialize(\"MenuTypeSelected\")";
_checkbox2.Initialize(ba,"MenuTypeSelected");
RDebugUtils.currentLine=4390951;
 //BA.debugLineNum = 4390951;BA.debugLine="checkbox2.Tag = 2";
_checkbox2.setTag((Object)(2));
RDebugUtils.currentLine=4390952;
 //BA.debugLineNum = 4390952;BA.debugLine="Dim name2 As Label";
_name2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=4390953;
 //BA.debugLineNum = 4390953;BA.debugLine="name2.Initialize(\"\")";
_name2.Initialize(ba,"");
RDebugUtils.currentLine=4390954;
 //BA.debugLineNum = 4390954;BA.debugLine="optionholder2.AddView(checkbox2,5%x,0,10%x,5%y)";
_optionholder2.AddView((android.view.View)(_checkbox2.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390955;
 //BA.debugLineNum = 4390955;BA.debugLine="name2.Gravity = Gravity.CENTER";
_name2.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4390956;
 //BA.debugLineNum = 4390956;BA.debugLine="name2.Text = \"Tasks Manager\"";
_name2.setText(BA.ObjectToCharSequence("Tasks Manager"));
RDebugUtils.currentLine=4390957;
 //BA.debugLineNum = 4390957;BA.debugLine="name2.TextColor = Colors.White";
_name2.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=4390958;
 //BA.debugLineNum = 4390958;BA.debugLine="name2.TextSize = 13";
_name2.setTextSize((float) (13));
RDebugUtils.currentLine=4390959;
 //BA.debugLineNum = 4390959;BA.debugLine="optionholder2.AddView(name2,15%x,0,30%x,5%y)";
_optionholder2.AddView((android.view.View)(_name2.getObject()),__c.PerXToCurrent((float) (15),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390960;
 //BA.debugLineNum = 4390960;BA.debugLine="PropertyWindowHolder.AddView(optionholder2,5%x,15";
__ref._propertywindowholder.AddView((android.view.View)(_optionholder2.getObject()),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (15),ba),(int) (__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4))),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390962;
 //BA.debugLineNum = 4390962;BA.debugLine="Dim OKbtn As Button";
_okbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=4390963;
 //BA.debugLineNum = 4390963;BA.debugLine="OKbtn.Initialize(\"SelectedMenuType\")";
_okbtn.Initialize(ba,"SelectedMenuType");
RDebugUtils.currentLine=4390964;
 //BA.debugLineNum = 4390964;BA.debugLine="OKbtn.Gravity = Gravity.CENTER";
_okbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=4390965;
 //BA.debugLineNum = 4390965;BA.debugLine="OKbtn.Text = \"OK\"";
_okbtn.setText(BA.ObjectToCharSequence("OK"));
RDebugUtils.currentLine=4390966;
 //BA.debugLineNum = 4390966;BA.debugLine="HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Bla";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_okbtn.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=4390967;
 //BA.debugLineNum = 4390967;BA.debugLine="PropertyWindowHolder.AddView(OKbtn,15%x,30%y,(60%";
__ref._propertywindowholder.AddView((android.view.View)(_okbtn.getObject()),__c.PerXToCurrent((float) (15),ba),__c.PerYToCurrent((float) (30),ba),(int) ((__c.PerXToCurrent((float) (60),ba)+__c.DipToCurrent((int) (4)))/(double)2),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=4390968;
 //BA.debugLineNum = 4390968;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.choosemenutype __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="choosemenutype";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim PropertyWindowHolder As Panel";
_propertywindowholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="End Sub";
return "";
}
public String  _selectedmenutype_click(b4a.example.choosemenutype __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="choosemenutype";
if (Debug.shouldDelegate(ba, "selectedmenutype_click"))
	return (String) Debug.delegate(ba, "selectedmenutype_click", null);
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub SelectedMenuType_Click";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="PropertyWindowHolder.Visible = False";
__ref._propertywindowholder.setVisible(__c.False);
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="End Sub";
return "";
}
}