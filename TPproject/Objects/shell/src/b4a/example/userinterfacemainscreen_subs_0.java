package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userinterfacemainscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "userinterfacemainscreen","asview", __ref);
 BA.debugLineNum = 113;BA.debugLine="Sub AsView As Panel";
Debug.ShouldStop(65536);
 BA.debugLineNum = 114;BA.debugLine="Return wholescreen";
Debug.ShouldStop(131072);
if (true) return __ref.getField(false,"_wholescreen");
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bonusmenu_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BonusMenu_LongClick (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("bonusmenu_longclick")) return __ref.runUserSub(false, "userinterfacemainscreen","bonusmenu_longclick", __ref);
 BA.debugLineNum = 152;BA.debugLine="Sub BonusMenu_LongClick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="MenuTypes.AsView.Visible = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_menutypes").runClassMethod (b4a.example.choosemenutype.class, "_asview").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "userinterfacemainscreen","buildui", __ref);
 BA.debugLineNum = 47;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="usernamelbl.Textcolor = Colors.White";
Debug.ShouldStop(32768);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 49;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(65536);
__ref.getField(false,"_usernamelbl").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 50;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
Debug.ShouldStop(131072);
__ref.getField(false,"_usernamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(userinterfacemainscreen._main._currentuser.getField(true,"username")));
 BA.debugLineNum = 51;BA.debugLine="usernamelbl.TextSize = 20";
Debug.ShouldStop(262144);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 52;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
Debug.ShouldStop(524288);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernamelbl").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 54;BA.debugLine="availability.TextColor = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_availability").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 55;BA.debugLine="availability.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_availability").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 56;BA.debugLine="availability.TextSize = 20";
Debug.ShouldStop(8388608);
__ref.getField(false,"_availability").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 57;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 58;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(33554432);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 }else {
 BA.debugLineNum = 60;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 };
 BA.debugLineNum = 62;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(536870912);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 63;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_availability").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 64;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_statusindicator").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_availability").runMethod(true,"getLeft"),__ref.getField(false,"_availability").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
Debug.ShouldStop(2);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuholder").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)));
 BA.debugLineNum = 67;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
Debug.ShouldStop(4);
__ref.getField(false,"_menutasks").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 68;BA.debugLine="MenuTasks.Text = \"Task Table\"";
Debug.ShouldStop(8);
__ref.getField(false,"_menutasks").runMethod(true,"setText",BA.ObjectToCharSequence("Task Table"));
 BA.debugLineNum = 69;BA.debugLine="MenuTasks.TextColor = Colors.White";
Debug.ShouldStop(16);
__ref.getField(false,"_menutasks").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 70;BA.debugLine="MenuTasks.TextSize = 15";
Debug.ShouldStop(32);
__ref.getField(false,"_menutasks").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 71;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
Debug.ShouldStop(64);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menutasks").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="MenuHolder.Panel.AddView(MenuTasks,0%x,0%y,30%x,2";
Debug.ShouldStop(128);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menutasks").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 74;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
__ref.getField(false,"_menuother1").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 75;BA.debugLine="MenuOther1.Text = \"My Task\"";
Debug.ShouldStop(1024);
__ref.getField(false,"_menuother1").runMethod(true,"setText",BA.ObjectToCharSequence("My Task"));
 BA.debugLineNum = 76;BA.debugLine="MenuOther1.TextColor = Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_menuother1").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 77;BA.debugLine="MenuOther1.TextSize = 15";
Debug.ShouldStop(4096);
__ref.getField(false,"_menuother1").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 78;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
Debug.ShouldStop(8192);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menuother1").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 79;BA.debugLine="MenuHolder.Panel.AddView(MenuOther1,(MenuTasks.Le";
Debug.ShouldStop(16384);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuother1").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 81;BA.debugLine="MenuOther2.Gravity = Gravity.CENTER";
Debug.ShouldStop(65536);
__ref.getField(false,"_menuother2").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 82;BA.debugLine="MenuOther2.Text = \"Workers\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_menuother2").runMethod(true,"setText",BA.ObjectToCharSequence("Workers"));
 BA.debugLineNum = 83;BA.debugLine="MenuOther2.TextColor = Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_menuother2").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 84;BA.debugLine="MenuOther2.TextSize = 15";
Debug.ShouldStop(524288);
__ref.getField(false,"_menuother2").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 85;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther2,Color";
Debug.ShouldStop(1048576);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menuother2").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 86;BA.debugLine="MenuHolder.Panel.AddView(MenuOther2,(MenuTasks.Le";
Debug.ShouldStop(2097152);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuother2").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 87;BA.debugLine="MenuOther2.Visible = False";
Debug.ShouldStop(4194304);
__ref.getField(false,"_menuother2").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 88;BA.debugLine="MenuOther2.Enabled = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_menuother2").runMethod(true,"setEnabled",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="CreateMenu.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
__ref.getField(false,"_createmenu").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 91;BA.debugLine="CreateMenu.Text = \"+\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_createmenu").runMethod(true,"setText",BA.ObjectToCharSequence("+"));
 BA.debugLineNum = 92;BA.debugLine="CreateMenu.TextColor = Colors.White";
Debug.ShouldStop(134217728);
__ref.getField(false,"_createmenu").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 93;BA.debugLine="CreateMenu.TextSize = 25";
Debug.ShouldStop(268435456);
__ref.getField(false,"_createmenu").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 94;BA.debugLine="HelperFunctions1.Apply_ViewStyle(CreateMenu,Color";
Debug.ShouldStop(536870912);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_createmenu").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 95;BA.debugLine="MenuHolder.Panel.AddView(CreateMenu,MenuTasks.Lef";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_createmenu").getObject())),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getTop"),__ref.getField(false,"_menutasks").runMethod(true,"getHeight")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="CreateMenu.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_createmenu").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 97;BA.debugLine="CreateMenu.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_createmenu").runMethod(true,"setEnabled",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="wholescreen.AddView(MenuTypes.AsView,MenuHolder.L";
Debug.ShouldStop(4);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menutypes").runClassMethod (b4a.example.choosemenutype.class, "_asview").getObject())),(Object)(__ref.getField(false,"_menuholder").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_menuholder").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_menuholder").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menuholder").runMethod(true,"getHeight")));
 BA.debugLineNum = 100;BA.debugLine="MenuTypes.AsView.Visible = False";
Debug.ShouldStop(8);
__ref.getField(false,"_menutypes").runClassMethod (b4a.example.choosemenutype.class, "_asview").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 102;BA.debugLine="If Main.currentuser.TypeOfWorker = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 103;BA.debugLine="CreateMenu.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_createmenu").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 104;BA.debugLine="CreateMenu.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_createmenu").runMethod(true,"setEnabled",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="MenuOther1.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_menuother1").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 106;BA.debugLine="MenuOther1.Enabled = False";
Debug.ShouldStop(512);
__ref.getField(false,"_menuother1").runMethod(true,"setEnabled",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 107;BA.debugLine="MenuOther2.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_menuother2").runMethod(true,"setVisible",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 108;BA.debugLine="MenuOther2.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_menuother2").runMethod(true,"setEnabled",userinterfacemainscreen.__c.getField(true,"True"));
 };
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
 //BA.debugLineNum = 2;BA.debugLine="Dim  wholescreen As Panel";
userinterfacemainscreen._wholescreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_wholescreen",userinterfacemainscreen._wholescreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim screenimg As ImageView";
userinterfacemainscreen._screenimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_screenimg",userinterfacemainscreen._screenimg);
 //BA.debugLineNum = 5;BA.debugLine="Dim usernamelbl As Label";
userinterfacemainscreen._usernamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_usernamelbl",userinterfacemainscreen._usernamelbl);
 //BA.debugLineNum = 6;BA.debugLine="Dim availability As Label";
userinterfacemainscreen._availability = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_availability",userinterfacemainscreen._availability);
 //BA.debugLineNum = 7;BA.debugLine="Dim statusindicator As Label";
userinterfacemainscreen._statusindicator = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_statusindicator",userinterfacemainscreen._statusindicator);
 //BA.debugLineNum = 9;BA.debugLine="Dim MenuHolder As ScrollView";
userinterfacemainscreen._menuholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_menuholder",userinterfacemainscreen._menuholder);
 //BA.debugLineNum = 10;BA.debugLine="Dim MenuTasks As Label";
userinterfacemainscreen._menutasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menutasks",userinterfacemainscreen._menutasks);
 //BA.debugLineNum = 11;BA.debugLine="Dim MenuOther1 As Label";
userinterfacemainscreen._menuother1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menuother1",userinterfacemainscreen._menuother1);
 //BA.debugLineNum = 12;BA.debugLine="Dim MenuOther2 As Label";
userinterfacemainscreen._menuother2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menuother2",userinterfacemainscreen._menuother2);
 //BA.debugLineNum = 13;BA.debugLine="Dim CreateMenu As Label";
userinterfacemainscreen._createmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_createmenu",userinterfacemainscreen._createmenu);
 //BA.debugLineNum = 18;BA.debugLine="Dim NumberOfMenus As Int = 0";
userinterfacemainscreen._numberofmenus = BA.numberCast(int.class, 0);__ref.setField("_numberofmenus",userinterfacemainscreen._numberofmenus);
 //BA.debugLineNum = 19;BA.debugLine="Dim MenuTypes As ChooseMenuType";
userinterfacemainscreen._menutypes = RemoteObject.createNew ("b4a.example.choosemenutype");__ref.setField("_menutypes",userinterfacemainscreen._menutypes);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createmenuicon(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateMenuIcon (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("createmenuicon")) return __ref.runUserSub(false, "userinterfacemainscreen","createmenuicon", __ref);
RemoteObject _menunew = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 128;BA.debugLine="Sub CreateMenuIcon";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="If NumberOfMenus < 3 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_numberofmenus"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 130;BA.debugLine="Dim MenuNew As Label";
Debug.ShouldStop(2);
_menunew = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("MenuNew", _menunew);
 BA.debugLineNum = 131;BA.debugLine="MenuNew.Initialize(\"BonusMenu\")";
Debug.ShouldStop(4);
_menunew.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("BonusMenu")));
 BA.debugLineNum = 132;BA.debugLine="MenuNew.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
_menunew.runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 133;BA.debugLine="MenuNew.Text = \"Menu\"";
Debug.ShouldStop(16);
_menunew.runMethod(true,"setText",BA.ObjectToCharSequence("Menu"));
 BA.debugLineNum = 134;BA.debugLine="MenuNew.TextColor = Colors.White";
Debug.ShouldStop(32);
_menunew.runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 135;BA.debugLine="MenuNew.TextSize = 15";
Debug.ShouldStop(64);
_menunew.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 137;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuNew,Colors.W";
Debug.ShouldStop(256);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _menunew.getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 138;BA.debugLine="MenuHolder.Panel.AddView(MenuNew,CreateMenu.Left,";
Debug.ShouldStop(512);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_menunew.getObject())),(Object)(__ref.getField(false,"_createmenu").runMethod(true,"getLeft")),(Object)(__ref.getField(false,"_createmenu").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_createmenu").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_createmenu").runMethod(true,"getHeight")));
 BA.debugLineNum = 140;BA.debugLine="If CreateMenu.Left = MenuTasks.Left Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_createmenu").runMethod(true,"getLeft"),BA.numberCast(double.class, __ref.getField(false,"_menutasks").runMethod(true,"getLeft")))) { 
 BA.debugLineNum = 141;BA.debugLine="CreateMenu.SetLayoutAnimated(500,(MenuTasks.Left";
Debug.ShouldStop(4096);
__ref.getField(false,"_createmenu").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(_menunew.runMethod(true,"getTop")),(Object)(_menunew.runMethod(true,"getWidth")),(Object)(_menunew.runMethod(true,"getHeight")));
 }else 
{ BA.debugLineNum = 142;BA.debugLine="Else If CreateMenu.Left = (MenuTasks.Left + MenuT";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_createmenu").runMethod(true,"getLeft"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)))) { 
 BA.debugLineNum = 143;BA.debugLine="CreateMenu.SetLayoutAnimated(500,MenuTasks.Left,";
Debug.ShouldStop(16384);
__ref.getField(false,"_createmenu").runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_menunew.runMethod(true,"getTop"),_menunew.runMethod(true,"getHeight")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(_menunew.runMethod(true,"getWidth")),(Object)(_menunew.runMethod(true,"getHeight")));
 BA.debugLineNum = 144;BA.debugLine="MenuHolder.panel.Height = MenuHolder.panel.Heigh";
Debug.ShouldStop(32768);
__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menuholder").runMethod(false,"getPanel").runMethod(true,"getHeight"),_menunew.runMethod(true,"getHeight")}, "+",1, 1));
 }}
;
 BA.debugLineNum = 146;BA.debugLine="NumberOfMenus = NumberOfMenus + 1";
Debug.ShouldStop(131072);
__ref.setField ("_numberofmenus",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_numberofmenus"),RemoteObject.createImmutable(1)}, "+",1, 1));
 }else {
 BA.debugLineNum = 148;BA.debugLine="Msgbox(\"You have reached maximum number of menus";
Debug.ShouldStop(524288);
userinterfacemainscreen.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("You have reached maximum number of menus!Please buy more!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("We are sorry!"))),__ref.getField(false, "ba"));
 };
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "userinterfacemainscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="wholescreen.Initialize(\"screenview\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("screenview")));
 BA.debugLineNum = 25;BA.debugLine="screenimg.Initialize(\"\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_screenimg").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 26;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(33554432);
__ref.getField(false,"_screenimg").runVoidMethod ("SetBackgroundImageNew",(Object)((userinterfacemainscreen.__c.runMethod(false,"LoadBitmap",(Object)(userinterfacemainscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("mainscreenimg.png"))).getObject())));
 BA.debugLineNum = 27;BA.debugLine="screenimg.Gravity = Gravity.FILL";
Debug.ShouldStop(67108864);
__ref.getField(false,"_screenimg").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 28;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenimg").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 30;BA.debugLine="statusindicator.Initialize(\"\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_statusindicator").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="usernamelbl.Initialize(\"username\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_usernamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 32;BA.debugLine="availability.Initialize(\"avail\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_availability").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("avail")));
 BA.debugLineNum = 34;BA.debugLine="MenuHolder.Initialize(40%y+4dip)";
Debug.ShouldStop(2);
__ref.getField(false,"_menuholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)));
 BA.debugLineNum = 35;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
Debug.ShouldStop(4);
__ref.getField(false,"_menutasks").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Tasks")));
 BA.debugLineNum = 36;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
Debug.ShouldStop(8);
__ref.getField(false,"_menuother1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyTask")));
 BA.debugLineNum = 37;BA.debugLine="MenuOther2.Initialize(\"MyWorkers\")";
Debug.ShouldStop(16);
__ref.getField(false,"_menuother2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyWorkers")));
 BA.debugLineNum = 38;BA.debugLine="CreateMenu.Initialize(\"MenuCreator\")";
Debug.ShouldStop(32);
__ref.getField(false,"_createmenu").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MenuCreator")));
 BA.debugLineNum = 40;BA.debugLine="MenuTypes.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_menutypes").runClassMethod (b4a.example.choosemenutype.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 43;BA.debugLine="BuildUI";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.userinterfacemainscreen.class, "_buildui");
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menucreator_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MenuCreator_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("menucreator_click")) return __ref.runUserSub(false, "userinterfacemainscreen","menucreator_click", __ref);
 BA.debugLineNum = 122;BA.debugLine="Sub MenuCreator_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="CreateMenuIcon";
Debug.ShouldStop(67108864);
__ref.runClassMethod (b4a.example.userinterfacemainscreen.class, "_createmenuicon");
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menutypeselected_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("MenuTypeSelected_CheckedChange (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("menutypeselected_checkedchange")) return __ref.runUserSub(false, "userinterfacemainscreen","menutypeselected_checkedchange", __ref, _checked);
RemoteObject _cbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 158;BA.debugLine="Sub MenuTypeSelected_CheckedChange(Checked As Bool";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 159;BA.debugLine="Dim cbox As CheckBox = Sender";
Debug.ShouldStop(1073741824);
_cbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_cbox.setObject(userinterfacemainscreen.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cbox", _cbox);
 BA.debugLineNum = 161;BA.debugLine="If Checked = True Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_checked,userinterfacemainscreen.__c.getField(true,"True"))) { 
 }else {
 BA.debugLineNum = 164;BA.debugLine="Checked = False";
Debug.ShouldStop(8);
_checked = userinterfacemainscreen.__c.getField(true,"False");Debug.locals.put("Checked", _checked);
 };
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mytask_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("MyTask_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("mytask_click")) return __ref.runUserSub(false, "userinterfacemainscreen","mytask_click", __ref);
 BA.debugLineNum = 119;BA.debugLine="Sub MyTask_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 120;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
Debug.ShouldStop(8388608);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMyTasks")));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _propwindow_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("propwindow_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("propwindow_click")) return __ref.runUserSub(false, "userinterfacemainscreen","propwindow_click", __ref);
 BA.debugLineNum = 125;BA.debugLine="Sub propwindow_Click As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 126;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return userinterfacemainscreen.__c.getField(true,"True");
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _screenview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("screenview_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("screenview_click")) return __ref.runUserSub(false, "userinterfacemainscreen","screenview_click", __ref);
 BA.debugLineNum = 179;BA.debugLine="Sub screenview_Click As Boolean";
Debug.ShouldStop(262144);
 BA.debugLineNum = 180;BA.debugLine="Return True";
Debug.ShouldStop(524288);
if (true) return userinterfacemainscreen.__c.getField(true,"True");
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setavailable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAvailable (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("setavailable")) return __ref.runUserSub(false, "userinterfacemainscreen","setavailable", __ref);
 BA.debugLineNum = 173;BA.debugLine="Public Sub SetAvailable";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Main.currentuser.available = True";
Debug.ShouldStop(8192);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 175;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(16384);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 BA.debugLineNum = 176;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(32768);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbusy(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBusy (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("setbusy")) return __ref.runUserSub(false, "userinterfacemainscreen","setbusy", __ref);
 BA.debugLineNum = 168;BA.debugLine="Public Sub SetBusy";
Debug.ShouldStop(128);
 BA.debugLineNum = 169;BA.debugLine="Main.currentuser.available = False";
Debug.ShouldStop(256);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 170;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(512);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 BA.debugLineNum = 171;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(1024);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tasks_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Tasks_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("tasks_click")) return __ref.runUserSub(false, "userinterfacemainscreen","tasks_click", __ref);
 BA.debugLineNum = 116;BA.debugLine="Sub Tasks_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
Debug.ShouldStop(1048576);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowTaskTable")));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}