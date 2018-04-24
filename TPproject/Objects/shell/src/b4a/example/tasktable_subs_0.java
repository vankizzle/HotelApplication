package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tasktable_subs_0 {


public static RemoteObject  _accept_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("accept_CheckedChange (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("accept_checkedchange")) return __ref.runUserSub(false, "tasktable","accept_checkedchange", __ref, _checked);
RemoteObject _cbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
int _x = 0;
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 135;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim cbox As CheckBox = Sender";
Debug.ShouldStop(128);
_cbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_cbox.setObject(tasktable.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cbox", _cbox);
 BA.debugLineNum = 139;BA.debugLine="If Checked = True Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_checked,tasktable.__c.getField(true,"True"))) { 
 BA.debugLineNum = 140;BA.debugLine="If boxchecked < 3 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_boxchecked"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 141;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
Debug.ShouldStop(4096);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
{
final RemoteObject group4 = __ref.getField(false,"_mapoftaskviews").runMethod(false,"Values");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v.setObject(group4.runMethod(false,"Get",index4));
Debug.locals.put("v", _v);
 BA.debugLineNum = 142;BA.debugLine="If cbox.Tag = v.Tag Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_cbox.runMethod(false,"getTag"),_v.runMethod(false,"getTag"))) { 
 BA.debugLineNum = 143;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
Debug.ShouldStop(16384);
tasktable.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("You selected task "),_v.runMethod(false,"getTag")))),(Object)(tasktable.__c.getField(true,"False")));
 BA.debugLineNum = 144;BA.debugLine="SelectedTasks.Put(TasksList.GetKeyAt(v.Tag),";
Debug.ShouldStop(32768);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Put",(Object)(__ref.getField(false,"_taskslist").runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))),(Object)(__ref.getField(false,"_taskslist").runMethod(false,"Get",(Object)(__ref.getField(false,"_taskslist").runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))))));
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 147;BA.debugLine="boxchecked = boxchecked + 1";
Debug.ShouldStop(262144);
__ref.setField ("_boxchecked",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_boxchecked"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 148;BA.debugLine="Log(boxchecked)";
Debug.ShouldStop(524288);
tasktable.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_boxchecked"))));
 }else {
 BA.debugLineNum = 152;BA.debugLine="cbox.Checked = False";
Debug.ShouldStop(8388608);
_cbox.runMethodAndSync(true,"setChecked",tasktable.__c.getField(true,"False"));
 BA.debugLineNum = 153;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
Debug.ShouldStop(16777216);
tasktable.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cant accept more")),(Object)(tasktable.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 158;BA.debugLine="Checked = False";
Debug.ShouldStop(536870912);
_checked = tasktable.__c.getField(true,"False");Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 160;BA.debugLine="For  x = 0 To SelectedTasks.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step18 = 1;
final int limit18 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_selectedtasks").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = 0 ;
for (;(step18 > 0 && _x <= limit18) || (step18 < 0 && _x >= limit18) ;_x = ((int)(0 + _x + step18))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 161;BA.debugLine="If cbox.Tag = x Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cbox.runMethod(false,"getTag"),RemoteObject.createImmutable((_x)))) { 
 BA.debugLineNum = 162;BA.debugLine="SelectedTasks.Remove(SelectedTasks.GetKeyAt(cb";
Debug.ShouldStop(2);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Remove",(Object)(__ref.getField(false,"_selectedtasks").runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _cbox.runMethod(false,"getTag"))))));
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 167;BA.debugLine="boxchecked = boxchecked - 1";
Debug.ShouldStop(64);
__ref.setField ("_boxchecked",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_boxchecked"),RemoteObject.createImmutable(1)}, "-",1, 1));
 };
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "tasktable","asview", __ref);
 BA.debugLineNum = 37;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Return WholeScreen";
Debug.ShouldStop(32);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_wholescreen").getObject());
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("BuildUI (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "tasktable","buildui", __ref);
 BA.debugLineNum = 41;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(256);
 BA.debugLineNum = 42;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(512);
__ref.getField(false,"_tableheader").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 43;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(1024);
__ref.getField(false,"_tablefooter").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 44;BA.debugLine="tableType.Gravity = Gravity.CENTER";
Debug.ShouldStop(2048);
__ref.getField(false,"_tabletype").runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 45;BA.debugLine="submit.Text = \"Accept\"";
Debug.ShouldStop(4096);
__ref.getField(false,"_submit").runMethod(true,"setText",BA.ObjectToCharSequence("Accept"));
 BA.debugLineNum = 46;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
Debug.ShouldStop(8192);
tasktable._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_submit").getObject()),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Black")),(Object)(tasktable.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"White")),(Object)(tasktable.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 48;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
Debug.ShouldStop(32768);
__ref.getField(false,"_tasksrefreshbtn").runVoidMethod ("SetBackgroundImageNew",(Object)((__ref.getField(false,"_refreshbtngraphic").getObject())));
 BA.debugLineNum = 49;BA.debugLine="tableType.TextColor = Colors.White";
Debug.ShouldStop(65536);
__ref.getField(false,"_tabletype").runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 50;BA.debugLine="tableType.TextSize = 25";
Debug.ShouldStop(131072);
__ref.getField(false,"_tabletype").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 51;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 52;BA.debugLine="tableType.Text = \"Workers Table\"";
Debug.ShouldStop(524288);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Workers Table"));
 }else 
{ BA.debugLineNum = 53;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 54;BA.debugLine="tableType.Text = \"Cooks Table\"";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Cooks Table"));
 }else 
{ BA.debugLineNum = 55;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 56;BA.debugLine="tableType.Text = \"Waiters Table\"";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
 BA.debugLineNum = 59;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
Debug.ShouldStop(67108864);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableholder").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 60;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tableofrequests").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 61;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableheader").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 62;BA.debugLine="tableHolder.AddView(tableofrequests,0%x,tableHead";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableofrequests").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tableheader").runMethod(true,"getTop"),__ref.getField(false,"_tableheader").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 63;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tablefooter").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 64;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tablefooter").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_submit").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)));
 BA.debugLineNum = 65;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
Debug.ShouldStop(1);
__ref.getField(false,"_tableheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabletype").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
Debug.ShouldStop(2);
__ref.getField(false,"_tableheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tasksrefreshbtn").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 73)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
tasktable._wholescreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_wholescreen",tasktable._wholescreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim TasksList As Map";
tasktable._taskslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_taskslist",tasktable._taskslist);
 //BA.debugLineNum = 4;BA.debugLine="Dim tableHolder As Panel";
tasktable._tableholder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tableholder",tasktable._tableholder);
 //BA.debugLineNum = 5;BA.debugLine="Dim tableHeader As Panel";
tasktable._tableheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tableheader",tasktable._tableheader);
 //BA.debugLineNum = 6;BA.debugLine="Dim tableFooter As Panel";
tasktable._tablefooter = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_tablefooter",tasktable._tablefooter);
 //BA.debugLineNum = 7;BA.debugLine="Dim tableType As Label";
tasktable._tabletype = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tabletype",tasktable._tabletype);
 //BA.debugLineNum = 8;BA.debugLine="Dim tableofrequests As ScrollView";
tasktable._tableofrequests = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_tableofrequests",tasktable._tableofrequests);
 //BA.debugLineNum = 9;BA.debugLine="Dim submit As Button";
tasktable._submit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_submit",tasktable._submit);
 //BA.debugLineNum = 10;BA.debugLine="Dim refreshbtngraphic As Bitmap";
tasktable._refreshbtngraphic = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");__ref.setField("_refreshbtngraphic",tasktable._refreshbtngraphic);
 //BA.debugLineNum = 11;BA.debugLine="Dim TasksRefreshBtn As Button";
tasktable._tasksrefreshbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_tasksrefreshbtn",tasktable._tasksrefreshbtn);
 //BA.debugLineNum = 12;BA.debugLine="Dim mapoftaskviews As Map";
tasktable._mapoftaskviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapoftaskviews",tasktable._mapoftaskviews);
 //BA.debugLineNum = 13;BA.debugLine="Dim boxchecked As Int = 0";
tasktable._boxchecked = BA.numberCast(int.class, 0);__ref.setField("_boxchecked",tasktable._boxchecked);
 //BA.debugLineNum = 15;BA.debugLine="Dim SelectedTasks As Map";
tasktable._selectedtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_selectedtasks",tasktable._selectedtasks);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _get_tasks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_Tasks (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("get_tasks")) return __ref.runUserSub(false, "tasktable","get_tasks", __ref);
int _i = 0;
RemoteObject _task = RemoteObject.declareNull("b4a.example.types._task");
 BA.debugLineNum = 69;BA.debugLine="Sub Get_Tasks";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(32);
{
final int step1 = 1;
final int limit1 = 5;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 71;BA.debugLine="Dim Task As Task";
Debug.ShouldStop(64);
_task = RemoteObject.createNew ("b4a.example.types._task");Debug.locals.put("Task", _task);
 BA.debugLineNum = 72;BA.debugLine="Task.Initialize";
Debug.ShouldStop(128);
_task.runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="Task.TaskID = i";
Debug.ShouldStop(256);
_task.setField ("TaskID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 74;BA.debugLine="Task.TaskName = \"Task \"&i";
Debug.ShouldStop(512);
_task.setField ("TaskName",RemoteObject.concat(RemoteObject.createImmutable("Task "),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 75;BA.debugLine="Task.TaskType = 1";
Debug.ShouldStop(1024);
_task.setField ("TaskType",BA.numberCast(int.class, 1));
 BA.debugLineNum = 76;BA.debugLine="Task.TaskInfo = \"Test on Task->\"&i";
Debug.ShouldStop(2048);
_task.setField ("TaskInfo",RemoteObject.concat(RemoteObject.createImmutable("Test on Task->"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 77;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
Debug.ShouldStop(4096);
__ref.getField(false,"_taskslist").runVoidMethod ("Put",(Object)((_task.getField(true,"TaskID"))),(Object)((_task)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Initialize (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "tasktable","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="WholeScreen.Initialize(\"\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 22;BA.debugLine="TasksList.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_taskslist").runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="tableHolder.Initialize(\"table\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tableholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("table")));
 BA.debugLineNum = 24;BA.debugLine="tableHeader.Initialize(\"Header\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tableheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Header")));
 BA.debugLineNum = 25;BA.debugLine="tableFooter.Initialize(\"Footer\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tablefooter").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Footer")));
 BA.debugLineNum = 26;BA.debugLine="tableType.Initialize(\"type\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tabletype").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("type")));
 BA.debugLineNum = 27;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
Debug.ShouldStop(67108864);
__ref.getField(false,"_refreshbtngraphic").runVoidMethod ("Initialize",(Object)(tasktable.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("refresh.png")));
 BA.debugLineNum = 28;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tasksrefreshbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("refreshtask")));
 BA.debugLineNum = 29;BA.debugLine="submit.Initialize(\"Submit\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_submit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Submit")));
 BA.debugLineNum = 30;BA.debugLine="tableofrequests.Initialize(150%y)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tableofrequests").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 150)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 31;BA.debugLine="mapoftaskviews.Initialize";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mapoftaskviews").runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="SelectedTasks.Initialize";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="BuildUI";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.tasktable.class, "_buildui");
 BA.debugLineNum = 34;BA.debugLine="Get_Tasks";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.tasktable.class, "_get_tasks");
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
		Debug.PushSubsStack("refreshtask_Click (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("refreshtask_click")) return __ref.runUserSub(false, "tasktable","refreshtask_click", __ref);
RemoteObject _p = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.declareNull("b4a.example.types._task");
RemoteObject _taskpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _taskidlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tasknamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _taskinfolbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _checked = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 BA.debugLineNum = 80;BA.debugLine="Sub refreshtask_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="If Main.currentuser.available = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"available"),tasktable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 82;BA.debugLine="submit.Enabled = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_submit").runMethod(true,"setEnabled",tasktable.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 84;BA.debugLine="submit.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_submit").runMethod(true,"setEnabled",tasktable.__c.getField(true,"True"));
 };
 BA.debugLineNum = 86;BA.debugLine="tableofrequests.Panel.RemoveAllViews";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tableofrequests").runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 87;BA.debugLine="boxchecked = 0";
Debug.ShouldStop(4194304);
__ref.setField ("_boxchecked",BA.numberCast(int.class, 0));
 BA.debugLineNum = 88;BA.debugLine="Dim p As Int = 0";
Debug.ShouldStop(8388608);
_p = BA.numberCast(int.class, 0);Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 89;BA.debugLine="For Each i As Task In TasksList.Values";
Debug.ShouldStop(16777216);
{
final RemoteObject group9 = __ref.getField(false,"_taskslist").runMethod(false,"Values");
final int groupLen9 = group9.runMethod(true,"getSize").<Integer>get()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_i = (group9.runMethod(false,"Get",index9));Debug.locals.put("i", _i);
Debug.locals.put("i", _i);
 BA.debugLineNum = 90;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_i.getField(true,"TaskType"),BA.numberCast(double.class, tasktable._main._currentuser.getField(true,"TypeOfWorker")))) { 
 BA.debugLineNum = 91;BA.debugLine="Dim TaskPanel As Panel";
Debug.ShouldStop(67108864);
_taskpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("TaskPanel", _taskpanel);
 BA.debugLineNum = 92;BA.debugLine="Dim TaskIdLbl As Label";
Debug.ShouldStop(134217728);
_taskidlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskIdLbl", _taskidlbl);
 BA.debugLineNum = 93;BA.debugLine="Dim TaskNameLbl As Label";
Debug.ShouldStop(268435456);
_tasknamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskNameLbl", _tasknamelbl);
 BA.debugLineNum = 94;BA.debugLine="Dim taskInfoLbl As Label";
Debug.ShouldStop(536870912);
_taskinfolbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("taskInfoLbl", _taskinfolbl);
 BA.debugLineNum = 95;BA.debugLine="Dim checked As CheckBox";
Debug.ShouldStop(1073741824);
_checked = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checked", _checked);
 BA.debugLineNum = 97;BA.debugLine="TaskPanel.Initialize(\"\")";
Debug.ShouldStop(1);
_taskpanel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 98;BA.debugLine="TaskIdLbl.Initialize(\"\")";
Debug.ShouldStop(2);
_taskidlbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 99;BA.debugLine="TaskNameLbl.Initialize(\"\")";
Debug.ShouldStop(4);
_tasknamelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 100;BA.debugLine="taskInfoLbl.Initialize(\"\")";
Debug.ShouldStop(8);
_taskinfolbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 101;BA.debugLine="checked.Initialize(\"accept\")";
Debug.ShouldStop(16);
_checked.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("accept")));
 BA.debugLineNum = 103;BA.debugLine="TaskIdLbl.Text = i.TaskID";
Debug.ShouldStop(64);
_taskidlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskID")));
 BA.debugLineNum = 104;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
Debug.ShouldStop(128);
_taskidlbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 105;BA.debugLine="TaskIdLbl.TextSize = 15";
Debug.ShouldStop(256);
_taskidlbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 106;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
_taskidlbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 107;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
Debug.ShouldStop(1024);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskidlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 109;BA.debugLine="TaskNameLbl.Text = i.TaskName";
Debug.ShouldStop(4096);
_tasknamelbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskName")));
 BA.debugLineNum = 110;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
Debug.ShouldStop(8192);
_tasknamelbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 111;BA.debugLine="TaskNameLbl.TextSize = 15";
Debug.ShouldStop(16384);
_tasknamelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 112;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(32768);
_tasknamelbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 113;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
Debug.ShouldStop(65536);
_taskpanel.runVoidMethod ("AddView",(Object)((_tasknamelbl.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 115;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
Debug.ShouldStop(262144);
_taskinfolbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskInfo")));
 BA.debugLineNum = 116;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
Debug.ShouldStop(524288);
_taskinfolbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 117;BA.debugLine="taskInfoLbl.TextSize = 10";
Debug.ShouldStop(1048576);
_taskinfolbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 10));
 BA.debugLineNum = 118;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(2097152);
_taskinfolbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 119;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
Debug.ShouldStop(4194304);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskinfolbl.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 122;BA.debugLine="checked.Gravity = Gravity.CENTER";
Debug.ShouldStop(33554432);
_checked.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 123;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
Debug.ShouldStop(67108864);
_taskpanel.runVoidMethod ("AddView",(Object)((_checked.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 125;BA.debugLine="TaskPanel.Color = Colors.DarkGray";
Debug.ShouldStop(268435456);
_taskpanel.runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").getField(true,"DarkGray"));
 BA.debugLineNum = 126;BA.debugLine="tableofrequests.Panel.AddView(TaskPanel,0,(5%y+";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tableofrequests").runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_taskpanel.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 1)),_p}, "*",0, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 127;BA.debugLine="TaskPanel.Tag = p";
Debug.ShouldStop(1073741824);
_taskpanel.runMethod(false,"setTag",(_p));
 BA.debugLineNum = 128;BA.debugLine="checked.Tag = p";
Debug.ShouldStop(-2147483648);
_checked.runMethod(false,"setTag",(_p));
 BA.debugLineNum = 129;BA.debugLine="p = p + 1";
Debug.ShouldStop(1);
_p = RemoteObject.solve(new RemoteObject[] {_p,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("p", _p);
 BA.debugLineNum = 130;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
Debug.ShouldStop(2);
__ref.getField(false,"_mapoftaskviews").runVoidMethod ("Put",(Object)(_taskpanel.runMethod(false,"getTag")),(Object)((_taskpanel.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Submit_Click (tasktable) ","tasktable",6,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("submit_click")) return __ref.runUserSub(false, "tasktable","submit_click", __ref);
 BA.debugLineNum = 173;BA.debugLine="Sub Submit_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 174;BA.debugLine="Log(SelectedTasks)";
Debug.ShouldStop(8192);
tasktable.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_selectedtasks"))));
 BA.debugLineNum = 175;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
Debug.ShouldStop(16384);
tasktable.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((tasktable._main.getObject())),(Object)(RemoteObject.createImmutable("TaskTableToMyTasks")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}