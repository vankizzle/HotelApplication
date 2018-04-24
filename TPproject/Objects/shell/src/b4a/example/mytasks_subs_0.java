package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mytasks_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (mytasks) ","mytasks",7,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "mytasks","asview", __ref);
 BA.debugLineNum = 28;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return WholeScreen";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_wholescreen").getObject());
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (mytasks) ","mytasks",7,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "mytasks","buildui", __ref);
 BA.debugLineNum = 17;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="TaskHolder.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(131072);
__ref.getField(false,"_taskholder").runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 19;BA.debugLine="WholeScreen.AddView(TaskHolder,10%x,15%y,80%x,70%";
Debug.ShouldStop(262144);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_taskholder").getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 20;BA.debugLine="TaskHolder.AddView(TaskHeader,0,0,80%x,5%y)";
Debug.ShouldStop(524288);
__ref.getField(false,"_taskholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_taskheader").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 21;BA.debugLine="TableName.Gravity = Gravity.CENTER";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tablename").runMethod(true,"setGravity",mytasks.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 22;BA.debugLine="TableName.Text = \"My Tasks\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tablename").runMethod(true,"setText",BA.ObjectToCharSequence("My Tasks"));
 BA.debugLineNum = 23;BA.debugLine="TableName.TextColor = Colors.White";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tablename").runMethod(true,"setTextColor",mytasks.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 24;BA.debugLine="TableName.TextSize = 15";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tablename").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 25;BA.debugLine="TaskHeader.AddView(TableName,20%x,0,40%x,5%y)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_taskheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tablename").getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Dim WholeScreen As Panel";
mytasks._wholescreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_wholescreen",mytasks._wholescreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim TaskHolder As Panel";
mytasks._taskholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_taskholder",mytasks._taskholder);
 //BA.debugLineNum = 4;BA.debugLine="Dim TaskHeader As Panel";
mytasks._taskheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_taskheader",mytasks._taskheader);
 //BA.debugLineNum = 5;BA.debugLine="Dim TableName As Label";
mytasks._tablename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tablename",mytasks._tablename);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (mytasks) ","mytasks",7,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "mytasks","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="WholeScreen.Initialize(\"\")";
Debug.ShouldStop(512);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 11;BA.debugLine="TaskHolder.Initialize(\"\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_taskholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 12;BA.debugLine="TaskHeader.Initialize(\"\")";
Debug.ShouldStop(2048);
__ref.getField(false,"_taskheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="TableName.Initialize(\"\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_tablename").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 14;BA.debugLine="BuildUI";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.mytasks.class, "_buildui");
 BA.debugLineNum = 15;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}