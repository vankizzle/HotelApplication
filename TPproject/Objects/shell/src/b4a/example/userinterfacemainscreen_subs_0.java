package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userinterfacemainscreen_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "userinterfacemainscreen","asview", __ref);
 BA.debugLineNum = 92;BA.debugLine="Sub AsView As Panel";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Return wholescreen";
Debug.ShouldStop(268435456);
if (true) return __ref.getField(false,"_wholescreen");
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _avail_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("avail_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("avail_click")) return __ref.runUserSub(false, "userinterfacemainscreen","avail_click", __ref);
 BA.debugLineNum = 117;BA.debugLine="Sub avail_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 119;BA.debugLine="Main.currentuser.available = True";
Debug.ShouldStop(4194304);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 120;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator";
Debug.ShouldStop(8388608);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 30)));
 }else {
 BA.debugLineNum = 122;BA.debugLine="Main.currentuser.available = False";
Debug.ShouldStop(33554432);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 123;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator";
Debug.ShouldStop(67108864);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 30)));
 };
 BA.debugLineNum = 126;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 127;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 }else {
 BA.debugLineNum = 129;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(1);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 };
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("BuildUI (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "userinterfacemainscreen","buildui", __ref);
 BA.debugLineNum = 43;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="usernamelbl.Textcolor = Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(4096);
__ref.getField(false,"_usernamelbl").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 46;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
Debug.ShouldStop(8192);
__ref.getField(false,"_usernamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(userinterfacemainscreen._main._currentuser.getField(true,"username")));
 BA.debugLineNum = 47;BA.debugLine="usernamelbl.TextSize = 20";
Debug.ShouldStop(16384);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 48;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,0%y,30%x,10%";
Debug.ShouldStop(32768);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernamelbl").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 50;BA.debugLine="availability.TextColor = Colors.White";
Debug.ShouldStop(131072);
__ref.getField(false,"_availability").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 51;BA.debugLine="availability.Gravity = Gravity.CENTER";
Debug.ShouldStop(262144);
__ref.getField(false,"_availability").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 52;BA.debugLine="availability.TextSize = 20";
Debug.ShouldStop(524288);
__ref.getField(false,"_availability").runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 53;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 }else {
 BA.debugLineNum = 56;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 };
 BA.debugLineNum = 58;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(33554432);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 59;BA.debugLine="wholescreen.AddView(availability,40%x,0%y,50%x,10";
Debug.ShouldStop(67108864);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_availability").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 60;BA.debugLine="wholescreen.AddView(statusindicator,availability.";
Debug.ShouldStop(134217728);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_statusindicator").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_availability").runMethod(true,"getLeft"),__ref.getField(false,"_availability").runMethod(true,"getWidth")}, "+",1, 1)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3.5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 62;BA.debugLine="wholescreen.AddView(MenuHolder,20%x,25%y,60%x+4di";
Debug.ShouldStop(536870912);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuholder").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)));
 BA.debugLineNum = 63;BA.debugLine="MenuTasks.Gravity = Gravity.CENTER";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_menutasks").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 64;BA.debugLine="MenuTasks.Text = \"Task Table\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_menutasks").runMethod(true,"setText",BA.ObjectToCharSequence("Task Table"));
 BA.debugLineNum = 65;BA.debugLine="MenuTasks.TextColor = Colors.White";
Debug.ShouldStop(1);
__ref.getField(false,"_menutasks").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 66;BA.debugLine="MenuTasks.TextSize = 15";
Debug.ShouldStop(2);
__ref.getField(false,"_menutasks").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 67;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuTasks,Colors";
Debug.ShouldStop(4);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menutasks").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 68;BA.debugLine="MenuHolder.AddView(MenuTasks,0%x,0%y,30%x,20%y)";
Debug.ShouldStop(8);
__ref.getField(false,"_menuholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menutasks").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 70;BA.debugLine="MenuOther1.Gravity = Gravity.CENTER";
Debug.ShouldStop(32);
__ref.getField(false,"_menuother1").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 71;BA.debugLine="MenuOther1.Text = \"My Task\"";
Debug.ShouldStop(64);
__ref.getField(false,"_menuother1").runMethod(true,"setText",BA.ObjectToCharSequence("My Task"));
 BA.debugLineNum = 72;BA.debugLine="MenuOther1.TextColor = Colors.White";
Debug.ShouldStop(128);
__ref.getField(false,"_menuother1").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 73;BA.debugLine="MenuOther1.TextSize = 15";
Debug.ShouldStop(256);
__ref.getField(false,"_menuother1").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 74;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther1,Color";
Debug.ShouldStop(512);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menuother1").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 75;BA.debugLine="MenuHolder.AddView(MenuOther1,(MenuTasks.Left+Men";
Debug.ShouldStop(1024);
__ref.getField(false,"_menuholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuother1").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getTop")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 77;BA.debugLine="MenuOther2.Gravity = Gravity.CENTER";
Debug.ShouldStop(4096);
__ref.getField(false,"_menuother2").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 78;BA.debugLine="MenuOther2.Text = \"Menu 3\"";
Debug.ShouldStop(8192);
__ref.getField(false,"_menuother2").runMethod(true,"setText",BA.ObjectToCharSequence("Menu 3"));
 BA.debugLineNum = 79;BA.debugLine="MenuOther2.TextColor = Colors.White";
Debug.ShouldStop(16384);
__ref.getField(false,"_menuother2").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 80;BA.debugLine="MenuOther2.TextSize = 15";
Debug.ShouldStop(32768);
__ref.getField(false,"_menuother2").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 81;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther2,Color";
Debug.ShouldStop(65536);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menuother2").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 82;BA.debugLine="MenuHolder.AddView(MenuOther2,MenuTasks.Left,(Men";
Debug.ShouldStop(131072);
__ref.getField(false,"_menuholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuother2").getObject())),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getTop"),__ref.getField(false,"_menutasks").runMethod(true,"getHeight")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 84;BA.debugLine="MenuOther3.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
__ref.getField(false,"_menuother3").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 85;BA.debugLine="MenuOther3.Text = \"Menu 4\"";
Debug.ShouldStop(1048576);
__ref.getField(false,"_menuother3").runMethod(true,"setText",BA.ObjectToCharSequence("Menu 4"));
 BA.debugLineNum = 86;BA.debugLine="MenuOther3.TextColor = Colors.White";
Debug.ShouldStop(2097152);
__ref.getField(false,"_menuother3").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 87;BA.debugLine="MenuOther3.TextSize = 15";
Debug.ShouldStop(4194304);
__ref.getField(false,"_menuother3").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 88;BA.debugLine="HelperFunctions1.Apply_ViewStyle(MenuOther3,Color";
Debug.ShouldStop(8388608);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_menuother3").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 120)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 160)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 89;BA.debugLine="MenuHolder.AddView(MenuOther3,(MenuTasks.Left+Men";
Debug.ShouldStop(16777216);
__ref.getField(false,"_menuholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_menuother3").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getLeft"),__ref.getField(false,"_menutasks").runMethod(true,"getWidth")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_menutasks").runMethod(true,"getTop"),__ref.getField(false,"_menutasks").runMethod(true,"getHeight")}, "+",1, 1)),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 4)))}, "+",1, 1)),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_menutasks").runMethod(true,"getHeight")));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim MenuHolder As Panel";
userinterfacemainscreen._menuholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_menuholder",userinterfacemainscreen._menuholder);
 //BA.debugLineNum = 10;BA.debugLine="Dim MenuTasks As Label";
userinterfacemainscreen._menutasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menutasks",userinterfacemainscreen._menutasks);
 //BA.debugLineNum = 11;BA.debugLine="Dim MenuOther1 As Label";
userinterfacemainscreen._menuother1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menuother1",userinterfacemainscreen._menuother1);
 //BA.debugLineNum = 12;BA.debugLine="Dim MenuOther2 As Label";
userinterfacemainscreen._menuother2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menuother2",userinterfacemainscreen._menuother2);
 //BA.debugLineNum = 13;BA.debugLine="Dim MenuOther3 As Label";
userinterfacemainscreen._menuother3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_menuother3",userinterfacemainscreen._menuother3);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "userinterfacemainscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="wholescreen.Initialize(\"screenview\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("screenview")));
 BA.debugLineNum = 22;BA.debugLine="screenimg.Initialize(\"\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_screenimg").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 23;BA.debugLine="screenimg.SetBackgroundImage(LoadBitmap(File.DirA";
Debug.ShouldStop(4194304);
__ref.getField(false,"_screenimg").runVoidMethod ("SetBackgroundImageNew",(Object)((userinterfacemainscreen.__c.runMethod(false,"LoadBitmap",(Object)(userinterfacemainscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("mainscreenimg.png"))).getObject())));
 BA.debugLineNum = 24;BA.debugLine="screenimg.Gravity = Gravity.FILL";
Debug.ShouldStop(8388608);
__ref.getField(false,"_screenimg").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 25;BA.debugLine="wholescreen.AddView(screenimg,0,10%y,100%x,80%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_screenimg").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 27;BA.debugLine="statusindicator.Initialize(\"\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_statusindicator").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 28;BA.debugLine="usernamelbl.Initialize(\"username\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_usernamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 29;BA.debugLine="availability.Initialize(\"avail\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_availability").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("avail")));
 BA.debugLineNum = 31;BA.debugLine="MenuHolder.Initialize(\"\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_menuholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 32;BA.debugLine="MenuTasks.Initialize(\"Tasks\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_menutasks").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Tasks")));
 BA.debugLineNum = 33;BA.debugLine="MenuOther1.Initialize(\"MyTask\")";
Debug.ShouldStop(1);
__ref.getField(false,"_menuother1").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MyTask")));
 BA.debugLineNum = 34;BA.debugLine="MenuOther2.Initialize(\"Menu3\")";
Debug.ShouldStop(2);
__ref.getField(false,"_menuother2").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu3")));
 BA.debugLineNum = 35;BA.debugLine="MenuOther3.Initialize(\"Menu4\")";
Debug.ShouldStop(4);
__ref.getField(false,"_menuother3").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu4")));
 BA.debugLineNum = 39;BA.debugLine="BuildUI";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.userinterfacemainscreen.class, "_buildui");
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menu3_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Menu3_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("menu3_click")) return __ref.runUserSub(false, "userinterfacemainscreen","menu3_click", __ref);
 BA.debugLineNum = 101;BA.debugLine="Sub Menu3_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="CallSub(Main,\"ShowMenu3\")";
Debug.ShouldStop(32);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMenu3")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _menu4_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Menu4_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("menu4_click")) return __ref.runUserSub(false, "userinterfacemainscreen","menu4_click", __ref);
 BA.debugLineNum = 104;BA.debugLine="Sub Menu4_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="CallSub(Main,\"ShowMenu\")";
Debug.ShouldStop(256);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMenu")));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("MyTask_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("mytask_click")) return __ref.runUserSub(false, "userinterfacemainscreen","mytask_click", __ref);
 BA.debugLineNum = 98;BA.debugLine="Sub MyTask_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 99;BA.debugLine="CallSub(Main,\"ShowMyTasks\")";
Debug.ShouldStop(4);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowMyTasks")));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _screenview_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("screenview_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("screenview_click")) return __ref.runUserSub(false, "userinterfacemainscreen","screenview_click", __ref);
 BA.debugLineNum = 134;BA.debugLine="Sub screenview_Click As Boolean";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="Return True";
Debug.ShouldStop(64);
if (true) return userinterfacemainscreen.__c.getField(true,"True");
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SetAvailable (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setavailable")) return __ref.runUserSub(false, "userinterfacemainscreen","setavailable", __ref);
 BA.debugLineNum = 112;BA.debugLine="Public Sub SetAvailable";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Main.currentuser.available = True";
Debug.ShouldStop(65536);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"True"));
 BA.debugLineNum = 114;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 BA.debugLineNum = 115;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(262144);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Green")),(Object)(BA.numberCast(int.class, 30)));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("SetBusy (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setbusy")) return __ref.runUserSub(false, "userinterfacemainscreen","setbusy", __ref);
 BA.debugLineNum = 107;BA.debugLine="Public Sub SetBusy";
Debug.ShouldStop(1024);
 BA.debugLineNum = 108;BA.debugLine="Main.currentuser.available = False";
Debug.ShouldStop(2048);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 BA.debugLineNum = 110;BA.debugLine="HelperFunctions1.Apply_ViewStyle(statusindicator,";
Debug.ShouldStop(8192);
userinterfacemainscreen._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_statusindicator").getObject()),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Red")),(Object)(BA.numberCast(int.class, 30)));
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
public static RemoteObject  _tasks_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Tasks_Click (userinterfacemainscreen) ","userinterfacemainscreen",1,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("tasks_click")) return __ref.runUserSub(false, "userinterfacemainscreen","tasks_click", __ref);
 BA.debugLineNum = 95;BA.debugLine="Sub Tasks_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 96;BA.debugLine="CallSub(Main,\"ShowTaskTable\")";
Debug.ShouldStop(-2147483648);
userinterfacemainscreen.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((userinterfacemainscreen._main.getObject())),(Object)(RemoteObject.createImmutable("ShowTaskTable")));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}