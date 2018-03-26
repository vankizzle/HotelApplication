package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class userinterfacemainscreen_subs_1 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "userinterfacemainscreen","asview", __ref);
 BA.debugLineNum = 74;BA.debugLine="Sub AsView As Panel";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return wholescreen";
Debug.ShouldStop(1024);
if (true) return __ref.getField(false,"_wholescreen");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("avail_Click (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("avail_click")) return __ref.runUserSub(false, "userinterfacemainscreen","avail_click", __ref);
 BA.debugLineNum = 88;BA.debugLine="Sub avail_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 90;BA.debugLine="Main.currentuser.available = True";
Debug.ShouldStop(33554432);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 92;BA.debugLine="Main.currentuser.available = False";
Debug.ShouldStop(134217728);
userinterfacemainscreen._main._currentuser.setField ("available",userinterfacemainscreen.__c.getField(true,"False"));
 };
 BA.debugLineNum = 95;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 96;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 }else {
 BA.debugLineNum = 98;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(2);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 };
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("BuildUI (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "userinterfacemainscreen","buildui", __ref);
 BA.debugLineNum = 37;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="usernamelbl.Textcolor = Colors.White";
Debug.ShouldStop(32);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 39;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
__ref.getField(false,"_usernamelbl").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 40;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
Debug.ShouldStop(128);
__ref.getField(false,"_usernamelbl").runMethod(true,"setText",BA.ObjectToCharSequence(userinterfacemainscreen._main._currentuser.getField(true,"username")));
 BA.debugLineNum = 41;BA.debugLine="usernamelbl.TextSize = 30";
Debug.ShouldStop(256);
__ref.getField(false,"_usernamelbl").runMethod(true,"setTextSize",BA.numberCast(float.class, 30));
 BA.debugLineNum = 42;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%";
Debug.ShouldStop(512);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_usernamelbl").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 44;BA.debugLine="availability.TextColor = Colors.White";
Debug.ShouldStop(2048);
__ref.getField(false,"_availability").runMethod(true,"setTextColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 45;BA.debugLine="availability.Gravity = Gravity.CENTER";
Debug.ShouldStop(4096);
__ref.getField(false,"_availability").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 46;BA.debugLine="availability.TextSize = 25";
Debug.ShouldStop(8192);
__ref.getField(false,"_availability").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 47;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"available"),userinterfacemainscreen.__c.getField(true,"False"))) { 
 BA.debugLineNum = 48;BA.debugLine="availability.Text = \"Status: Busy\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Busy"));
 }else {
 BA.debugLineNum = 50;BA.debugLine="availability.Text = \"Status: Available\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_availability").runMethod(true,"setText",BA.ObjectToCharSequence("Status: Available"));
 };
 BA.debugLineNum = 52;BA.debugLine="wholescreen.AddView(availability,40%x,5%y,50%x,10";
Debug.ShouldStop(524288);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_availability").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 54;BA.debugLine="tableHeader.Color = Colors.DarkGray";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tableheader").runVoidMethod ("setColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 55;BA.debugLine="tableType.Gravity = Gravity.CENTER";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tabletype").runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 56;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tasksrefreshbtn").runVoidMethod ("SetBackgroundImage",(Object)((__ref.getField(false,"_refreshbtngraphic").getObject())));
 BA.debugLineNum = 58;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 59;BA.debugLine="tableType.Text = \"Workers Table\"";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Workers Table"));
 }else 
{ BA.debugLineNum = 60;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 61;BA.debugLine="tableType.Text = \"Cooks Table\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Cooks Table"));
 }else 
{ BA.debugLineNum = 62;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",userinterfacemainscreen._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 63;BA.debugLine="tableType.Text = \"Waiters Table\"";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
 BA.debugLineNum = 66;BA.debugLine="wholescreen.AddView(tableHolder,10%x,15%y,80%x,70";
Debug.ShouldStop(2);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableholder").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 67;BA.debugLine="tableofrequests.Color = Colors.White";
Debug.ShouldStop(4);
__ref.getField(false,"_tableofrequests").runVoidMethod ("setColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 68;BA.debugLine="tableHolder.AddView(tableofrequests,0%x,5%y,100%x";
Debug.ShouldStop(8);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableofrequests").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 69;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
Debug.ShouldStop(16);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableheader").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 70;BA.debugLine="tableHeader.AddView(tableType,0,0,20%x,5%y)";
Debug.ShouldStop(32);
__ref.getField(false,"_tableheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabletype").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 71;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
Debug.ShouldStop(64);
__ref.getField(false,"_tableheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tasksrefreshbtn").getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 73)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 4;BA.debugLine="Dim TasksList As Map";
userinterfacemainscreen._taskslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_taskslist",userinterfacemainscreen._taskslist);
 //BA.debugLineNum = 6;BA.debugLine="Dim usernamelbl As Label";
userinterfacemainscreen._usernamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_usernamelbl",userinterfacemainscreen._usernamelbl);
 //BA.debugLineNum = 7;BA.debugLine="Dim availability As Label";
userinterfacemainscreen._availability = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_availability",userinterfacemainscreen._availability);
 //BA.debugLineNum = 8;BA.debugLine="Dim tableHolder As Panel";
userinterfacemainscreen._tableholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tableholder",userinterfacemainscreen._tableholder);
 //BA.debugLineNum = 9;BA.debugLine="Dim tableHeader As Panel";
userinterfacemainscreen._tableheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tableheader",userinterfacemainscreen._tableheader);
 //BA.debugLineNum = 10;BA.debugLine="Dim tableType As Label";
userinterfacemainscreen._tabletype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tabletype",userinterfacemainscreen._tabletype);
 //BA.debugLineNum = 11;BA.debugLine="Dim tableofrequests As ScrollView";
userinterfacemainscreen._tableofrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_tableofrequests",userinterfacemainscreen._tableofrequests);
 //BA.debugLineNum = 13;BA.debugLine="Dim refreshbtngraphic As Bitmap";
userinterfacemainscreen._refreshbtngraphic = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_refreshbtngraphic",userinterfacemainscreen._refreshbtngraphic);
 //BA.debugLineNum = 14;BA.debugLine="Dim TasksRefreshBtn As Button";
userinterfacemainscreen._tasksrefreshbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_tasksrefreshbtn",userinterfacemainscreen._tasksrefreshbtn);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _get_tasks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_Tasks (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("get_tasks")) return __ref.runUserSub(false, "userinterfacemainscreen","get_tasks", __ref);
int _i = 0;
RemoteObject _task = RemoteObject.declareNull("b4a.example.types._task");
 BA.debugLineNum = 77;BA.debugLine="Sub Get_Tasks";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(8192);
{
final int step1 = 1;
final int limit1 = 5;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="Dim Task As Task";
Debug.ShouldStop(16384);
_task = RemoteObject.createNew ("b4a.example.types._task");Debug.locals.put("Task", _task);
 BA.debugLineNum = 80;BA.debugLine="Task.Initialize";
Debug.ShouldStop(32768);
_task.runVoidMethod ("Initialize");
 BA.debugLineNum = 81;BA.debugLine="Task.TaskID = i";
Debug.ShouldStop(65536);
_task.setField ("TaskID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 82;BA.debugLine="Task.TaskName = \"Task \"&i";
Debug.ShouldStop(131072);
_task.setField ("TaskName",RemoteObject.concat(RemoteObject.createImmutable("Task "),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 83;BA.debugLine="Task.TaskType = 1";
Debug.ShouldStop(262144);
_task.setField ("TaskType",BA.numberCast(int.class, 1));
 BA.debugLineNum = 84;BA.debugLine="Task.TaskInfo = \"Test task,just ignore it,dont w";
Debug.ShouldStop(524288);
_task.setField ("TaskInfo",BA.ObjectToString("Test task,just ignore it,dont worry you are free for now ;)"));
 BA.debugLineNum = 85;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_taskslist").runVoidMethod ("Put",(Object)((_task.getField(true,"TaskID"))),(Object)((_task)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Initialize (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "userinterfacemainscreen","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 19;BA.debugLine="wholescreen.Initialize(\"screenview\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("screenview")));
 BA.debugLineNum = 20;BA.debugLine="wholescreen.Color = Colors.Black";
Debug.ShouldStop(524288);
__ref.getField(false,"_wholescreen").runVoidMethod ("setColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 22;BA.debugLine="TasksList.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_taskslist").runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="tableHolder.Initialize(\"table\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tableholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("table")));
 BA.debugLineNum = 25;BA.debugLine="tableHeader.Initialize(\"Header\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tableheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Header")));
 BA.debugLineNum = 26;BA.debugLine="tableType.Initialize(\"type\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tabletype").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("type")));
 BA.debugLineNum = 27;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
Debug.ShouldStop(67108864);
__ref.getField(false,"_refreshbtngraphic").runVoidMethod ("Initialize",(Object)(userinterfacemainscreen.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("refresh.png")));
 BA.debugLineNum = 28;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tasksrefreshbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("refreshtask")));
 BA.debugLineNum = 29;BA.debugLine="usernamelbl.Initialize(\"username\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_usernamelbl").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("username")));
 BA.debugLineNum = 30;BA.debugLine="availability.Initialize(\"avail\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_availability").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("avail")));
 BA.debugLineNum = 31;BA.debugLine="tableofrequests.Initialize(150%y)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tableofrequests").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 150)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 33;BA.debugLine="BuildUI";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.userinterfacemainscreen.class, "_buildui");
 BA.debugLineNum = 34;BA.debugLine="Get_Tasks";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.userinterfacemainscreen.class, "_get_tasks");
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshtask_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("refreshtask_Click (userinterfacemainscreen) ","userinterfacemainscreen",3,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("refreshtask_click")) return __ref.runUserSub(false, "userinterfacemainscreen","refreshtask_click", __ref);
RemoteObject _p = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.declareNull("b4a.example.types._task");
RemoteObject _taskpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _taskidlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tasknamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _taskinfolbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 103;BA.debugLine="Sub refreshtask_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="tableofrequests.Panel.RemoveAllViews";
Debug.ShouldStop(128);
__ref.getField(false,"_tableofrequests").runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 105;BA.debugLine="Dim p As Int = 0";
Debug.ShouldStop(256);
_p = BA.numberCast(int.class, 0);Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="For Each i As Task In TasksList.Values";
Debug.ShouldStop(512);
{
final RemoteObject group3 = __ref.getField(false,"_taskslist").runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_i = (group3.runMethod(false,"Get",index3));Debug.locals.put("i", _i);
Debug.locals.put("i", _i);
 BA.debugLineNum = 107;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_i.getField(true,"TaskType"),BA.numberCast(double.class, userinterfacemainscreen._main._currentuser.getField(true,"TypeOfWorker")))) { 
 BA.debugLineNum = 108;BA.debugLine="Dim TaskPanel As Panel";
Debug.ShouldStop(2048);
_taskpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("TaskPanel", _taskpanel);
 BA.debugLineNum = 109;BA.debugLine="Dim TaskIdLbl As Label";
Debug.ShouldStop(4096);
_taskidlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskIdLbl", _taskidlbl);
 BA.debugLineNum = 110;BA.debugLine="Dim TaskNameLbl As Label";
Debug.ShouldStop(8192);
_tasknamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskNameLbl", _tasknamelbl);
 BA.debugLineNum = 111;BA.debugLine="Dim taskInfoLbl As Label";
Debug.ShouldStop(16384);
_taskinfolbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("taskInfoLbl", _taskinfolbl);
 BA.debugLineNum = 113;BA.debugLine="TaskPanel.Initialize(\"\")";
Debug.ShouldStop(65536);
_taskpanel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 114;BA.debugLine="TaskIdLbl.Initialize(\"\")";
Debug.ShouldStop(131072);
_taskidlbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 115;BA.debugLine="TaskNameLbl.Initialize(\"\")";
Debug.ShouldStop(262144);
_tasknamelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 116;BA.debugLine="taskInfoLbl.Initialize(\"\")";
Debug.ShouldStop(524288);
_taskinfolbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 118;BA.debugLine="TaskIdLbl.Text = i.TaskID";
Debug.ShouldStop(2097152);
_taskidlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskID")));
 BA.debugLineNum = 119;BA.debugLine="TaskIdLbl.TextSize = 15";
Debug.ShouldStop(4194304);
_taskidlbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 120;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
_taskidlbl.runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 121;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
Debug.ShouldStop(16777216);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskidlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 123;BA.debugLine="TaskNameLbl.Text = i.TaskName";
Debug.ShouldStop(67108864);
_tasknamelbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskName")));
 BA.debugLineNum = 124;BA.debugLine="TaskNameLbl.TextSize = 15";
Debug.ShouldStop(134217728);
_tasknamelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 125;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(268435456);
_tasknamelbl.runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 126;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
Debug.ShouldStop(536870912);
_taskpanel.runVoidMethod ("AddView",(Object)((_tasknamelbl.getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 128;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
Debug.ShouldStop(-2147483648);
_taskinfolbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskInfo")));
 BA.debugLineNum = 129;BA.debugLine="taskInfoLbl.TextSize = 10";
Debug.ShouldStop(1);
_taskinfolbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 10));
 BA.debugLineNum = 130;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(2);
_taskinfolbl.runMethod(true,"setGravity",userinterfacemainscreen.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 131;BA.debugLine="TaskPanel.AddView(taskInfoLbl,20%x,0,40%x,5%y)";
Debug.ShouldStop(4);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskinfolbl.getObject())),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 133;BA.debugLine="TaskPanel.Color = Colors.LightGray";
Debug.ShouldStop(16);
_taskpanel.runVoidMethod ("setColor",userinterfacemainscreen.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 134;BA.debugLine="tableofrequests.Panel.AddView(TaskPanel,0,(5%y+";
Debug.ShouldStop(32);
__ref.getField(false,"_tableofrequests").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_taskpanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),userinterfacemainscreen.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),_p}, "*",0, 1)),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(userinterfacemainscreen.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 135;BA.debugLine="p = p + 1";
Debug.ShouldStop(64);
_p = RemoteObject.solve(new RemoteObject[] {_p,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("p", _p);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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