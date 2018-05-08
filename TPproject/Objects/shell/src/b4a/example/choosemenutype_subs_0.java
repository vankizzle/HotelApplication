package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class choosemenutype_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (choosemenutype) ","choosemenutype",8,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "choosemenutype","asview", __ref);
 BA.debugLineNum = 69;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return PropertyWindowHolder";
Debug.ShouldStop(32);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_propertywindowholder").getObject());
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildmenupropertywindow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildMenuPropertyWindow (choosemenutype) ","choosemenutype",8,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("buildmenupropertywindow")) return __ref.runUserSub(false, "choosemenutype","buildmenupropertywindow", __ref);
RemoteObject _optionholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _checkbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _name = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _optionholder1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _checkbox1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _name1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _optionholder2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _checkbox2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _name2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _okbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 12;BA.debugLine="Sub BuildMenuPropertyWindow";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="PropertyWindowHolder.Color = Colors.rgb(77, 77, 7";
Debug.ShouldStop(4096);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("setColor",choosemenutype.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 77)),(Object)(BA.numberCast(int.class, 77)),(Object)(BA.numberCast(int.class, 77))));
 BA.debugLineNum = 15;BA.debugLine="PropertyWindowHolder.Visible = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_propertywindowholder").runMethod(true,"setVisible",choosemenutype.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="Dim optionholder As Panel";
Debug.ShouldStop(65536);
_optionholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("optionholder", _optionholder);
 BA.debugLineNum = 18;BA.debugLine="optionholder.Initialize(\"\")";
Debug.ShouldStop(131072);
_optionholder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="Dim checkbox As CheckBox";
Debug.ShouldStop(262144);
_checkbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checkbox", _checkbox);
 BA.debugLineNum = 20;BA.debugLine="checkbox.Initialize(\"MenuTypeSelected\")";
Debug.ShouldStop(524288);
_checkbox.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MenuTypeSelected")));
 BA.debugLineNum = 21;BA.debugLine="checkbox.Tag = 0";
Debug.ShouldStop(1048576);
_checkbox.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 22;BA.debugLine="Dim name As Label";
Debug.ShouldStop(2097152);
_name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("name", _name);
 BA.debugLineNum = 23;BA.debugLine="name.Initialize(\"\")";
Debug.ShouldStop(4194304);
_name.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 24;BA.debugLine="optionholder.AddView(checkbox,5%x,0,10%x,5%y)";
Debug.ShouldStop(8388608);
_optionholder.runVoidMethod ("AddView",(Object)((_checkbox.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 25;BA.debugLine="name.Gravity = Gravity.CENTER";
Debug.ShouldStop(16777216);
_name.runMethod(true,"setGravity",choosemenutype.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 26;BA.debugLine="name.Text = \"Workers manager\"";
Debug.ShouldStop(33554432);
_name.runMethod(true,"setText",BA.ObjectToCharSequence("Workers manager"));
 BA.debugLineNum = 27;BA.debugLine="name.TextColor = Colors.White";
Debug.ShouldStop(67108864);
_name.runMethod(true,"setTextColor",choosemenutype.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 28;BA.debugLine="name.TextSize = 13";
Debug.ShouldStop(134217728);
_name.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 29;BA.debugLine="optionholder.AddView(name,15%x,0,30%x,5%y)";
Debug.ShouldStop(268435456);
_optionholder.runVoidMethod ("AddView",(Object)((_name.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 30;BA.debugLine="PropertyWindowHolder.AddView(optionholder,5%x,5%y";
Debug.ShouldStop(536870912);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("AddView",(Object)((_optionholder.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),choosemenutype.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 32;BA.debugLine="Dim optionholder1 As Panel";
Debug.ShouldStop(-2147483648);
_optionholder1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("optionholder1", _optionholder1);
 BA.debugLineNum = 33;BA.debugLine="optionholder1.Initialize(\"\")";
Debug.ShouldStop(1);
_optionholder1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 34;BA.debugLine="Dim checkbox1 As CheckBox";
Debug.ShouldStop(2);
_checkbox1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checkbox1", _checkbox1);
 BA.debugLineNum = 35;BA.debugLine="checkbox1.Initialize(\"MenuTypeSelected\")";
Debug.ShouldStop(4);
_checkbox1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MenuTypeSelected")));
 BA.debugLineNum = 36;BA.debugLine="checkbox1.Tag = 1";
Debug.ShouldStop(8);
_checkbox1.runMethod(false,"setTag",RemoteObject.createImmutable((1)));
 BA.debugLineNum = 37;BA.debugLine="Dim name1 As Label";
Debug.ShouldStop(16);
_name1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("name1", _name1);
 BA.debugLineNum = 38;BA.debugLine="name1.Initialize(\"\")";
Debug.ShouldStop(32);
_name1.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="optionholder1.AddView(checkbox1,5%x,0,10%x,5%y)";
Debug.ShouldStop(64);
_optionholder1.runVoidMethod ("AddView",(Object)((_checkbox1.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 40;BA.debugLine="name1.Gravity = Gravity.CENTER";
Debug.ShouldStop(128);
_name1.runMethod(true,"setGravity",choosemenutype.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 41;BA.debugLine="name1.Text = \"Efficiency check\"";
Debug.ShouldStop(256);
_name1.runMethod(true,"setText",BA.ObjectToCharSequence("Efficiency check"));
 BA.debugLineNum = 42;BA.debugLine="name1.TextColor = Colors.White";
Debug.ShouldStop(512);
_name1.runMethod(true,"setTextColor",choosemenutype.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 43;BA.debugLine="name1.TextSize = 13";
Debug.ShouldStop(1024);
_name1.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 44;BA.debugLine="optionholder1.AddView(name1,15%x,0,30%x,5%y)";
Debug.ShouldStop(2048);
_optionholder1.runVoidMethod ("AddView",(Object)((_name1.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 45;BA.debugLine="PropertyWindowHolder.AddView(optionholder1,5%x,10";
Debug.ShouldStop(4096);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("AddView",(Object)((_optionholder1.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),choosemenutype.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 47;BA.debugLine="Dim optionholder2 As Panel";
Debug.ShouldStop(16384);
_optionholder2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("optionholder2", _optionholder2);
 BA.debugLineNum = 48;BA.debugLine="optionholder2.Initialize(\"\")";
Debug.ShouldStop(32768);
_optionholder2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 49;BA.debugLine="Dim checkbox2 As CheckBox";
Debug.ShouldStop(65536);
_checkbox2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checkbox2", _checkbox2);
 BA.debugLineNum = 50;BA.debugLine="checkbox2.Initialize(\"MenuTypeSelected\")";
Debug.ShouldStop(131072);
_checkbox2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MenuTypeSelected")));
 BA.debugLineNum = 51;BA.debugLine="checkbox2.Tag = 2";
Debug.ShouldStop(262144);
_checkbox2.runMethod(false,"setTag",RemoteObject.createImmutable((2)));
 BA.debugLineNum = 52;BA.debugLine="Dim name2 As Label";
Debug.ShouldStop(524288);
_name2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("name2", _name2);
 BA.debugLineNum = 53;BA.debugLine="name2.Initialize(\"\")";
Debug.ShouldStop(1048576);
_name2.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 54;BA.debugLine="optionholder2.AddView(checkbox2,5%x,0,10%x,5%y)";
Debug.ShouldStop(2097152);
_optionholder2.runVoidMethod ("AddView",(Object)((_checkbox2.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 55;BA.debugLine="name2.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
_name2.runMethod(true,"setGravity",choosemenutype.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 56;BA.debugLine="name2.Text = \"Tasks Manager\"";
Debug.ShouldStop(8388608);
_name2.runMethod(true,"setText",BA.ObjectToCharSequence("Tasks Manager"));
 BA.debugLineNum = 57;BA.debugLine="name2.TextColor = Colors.White";
Debug.ShouldStop(16777216);
_name2.runMethod(true,"setTextColor",choosemenutype.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 58;BA.debugLine="name2.TextSize = 13";
Debug.ShouldStop(33554432);
_name2.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 59;BA.debugLine="optionholder2.AddView(name2,15%x,0,30%x,5%y)";
Debug.ShouldStop(67108864);
_optionholder2.runVoidMethod ("AddView",(Object)((_name2.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 60;BA.debugLine="PropertyWindowHolder.AddView(optionholder2,5%x,15";
Debug.ShouldStop(134217728);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("AddView",(Object)((_optionholder2.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),choosemenutype.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 62;BA.debugLine="Dim OKbtn As Button";
Debug.ShouldStop(536870912);
_okbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("OKbtn", _okbtn);
 BA.debugLineNum = 63;BA.debugLine="OKbtn.Initialize(\"SelectedMenuType\")";
Debug.ShouldStop(1073741824);
_okbtn.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("SelectedMenuType")));
 BA.debugLineNum = 64;BA.debugLine="OKbtn.Gravity = Gravity.CENTER";
Debug.ShouldStop(-2147483648);
_okbtn.runMethod(true,"setGravity",choosemenutype.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 65;BA.debugLine="OKbtn.Text = \"OK\"";
Debug.ShouldStop(1);
_okbtn.runMethod(true,"setText",BA.ObjectToCharSequence("OK"));
 BA.debugLineNum = 66;BA.debugLine="HelperFunctions1.Apply_ViewStyle(OKbtn,Colors.Bla";
Debug.ShouldStop(2);
choosemenutype._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _okbtn.getObject()),(Object)(choosemenutype.__c.getField(false,"Colors").getField(true,"Black")),(Object)(choosemenutype.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(choosemenutype.__c.getField(false,"Colors").getField(true,"White")),(Object)(choosemenutype.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(choosemenutype.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(choosemenutype.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(choosemenutype.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 67;BA.debugLine="PropertyWindowHolder.AddView(OKbtn,15%x,30%y,(60%";
Debug.ShouldStop(4);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("AddView",(Object)((_okbtn.getObject())),(Object)(choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {choosemenutype.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),choosemenutype.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(choosemenutype.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim PropertyWindowHolder As Panel";
choosemenutype._propertywindowholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_propertywindowholder",choosemenutype._propertywindowholder);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (choosemenutype) ","choosemenutype",8,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "choosemenutype","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 9;BA.debugLine="PropertyWindowHolder.Initialize(\"propwindow\")";
Debug.ShouldStop(256);
__ref.getField(false,"_propertywindowholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("propwindow")));
 BA.debugLineNum = 10;BA.debugLine="BuildMenuPropertyWindow";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.choosemenutype.class, "_buildmenupropertywindow");
 BA.debugLineNum = 11;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectedmenutype_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SelectedMenuType_Click (choosemenutype) ","choosemenutype",8,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("selectedmenutype_click")) return __ref.runUserSub(false, "choosemenutype","selectedmenutype_click", __ref);
 BA.debugLineNum = 72;BA.debugLine="Sub SelectedMenuType_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="PropertyWindowHolder.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_propertywindowholder").runMethod(true,"setVisible",choosemenutype.__c.getField(true,"False"));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}