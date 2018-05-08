package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class tasktable_subs_0 {


public static RemoteObject  _accept_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("accept_CheckedChange (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("accept_checkedchange")) return __ref.runUserSub(false, "tasktable","accept_checkedchange", __ref, _checked);
RemoteObject _cbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 150;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="Dim cbox As CheckBox = Sender";
Debug.ShouldStop(4194304);
_cbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_cbox.setObject(tasktable.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cbox", _cbox);
 BA.debugLineNum = 154;BA.debugLine="If Checked = True Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_checked,tasktable.__c.getField(true,"True"))) { 
 BA.debugLineNum = 156;BA.debugLine="RefreshTimer.Enabled = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_refreshtimer").runMethod(true,"setEnabled",tasktable.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="If boxchecked < 3 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("<",__ref.getField(true,"_boxchecked"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 158;BA.debugLine="boxchecked = boxchecked + 1";
Debug.ShouldStop(536870912);
__ref.setField ("_boxchecked",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_boxchecked"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 159;BA.debugLine="Log(boxchecked)";
Debug.ShouldStop(1073741824);
tasktable.__c.runVoidMethod ("Log",(Object)(BA.NumberToString(__ref.getField(true,"_boxchecked"))));
 BA.debugLineNum = 160;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
Debug.ShouldStop(-2147483648);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
{
final RemoteObject group7 = __ref.getField(false,"_mapoftaskviews").runMethod(false,"Values");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject(group7.runMethod(false,"Get",index7));
Debug.locals.put("v", _v);
 BA.debugLineNum = 161;BA.debugLine="If cbox.Tag = v.Tag Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_cbox.runMethod(false,"getTag"),_v.runMethod(false,"getTag"))) { 
 BA.debugLineNum = 162;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
Debug.ShouldStop(2);
tasktable.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("You selected task "),_v.runMethod(false,"getTag")))),(Object)(tasktable.__c.getField(true,"False")));
 BA.debugLineNum = 163;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
Debug.ShouldStop(4);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Put",(Object)(_cbox.runMethod(false,"getTag")),(Object)(__ref.getField(false,"_taskslist").runMethod(false,"Get",(Object)(__ref.getField(false,"_taskslist").runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, _v.runMethod(false,"getTag"))))))));
 };
 }
}Debug.locals.put("v", _v);
;
 }else {
 BA.debugLineNum = 167;BA.debugLine="cbox.Checked = False";
Debug.ShouldStop(64);
_cbox.runMethodAndSync(true,"setChecked",tasktable.__c.getField(true,"False"));
 BA.debugLineNum = 168;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
Debug.ShouldStop(128);
tasktable.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cant accept more")),(Object)(tasktable.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 173;BA.debugLine="Checked = False";
Debug.ShouldStop(4096);
_checked = tasktable.__c.getField(true,"False");Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 174;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
Debug.ShouldStop(8192);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Remove",(Object)(_cbox.runMethod(false,"getTag")));
 BA.debugLineNum = 175;BA.debugLine="boxchecked = boxchecked - 1";
Debug.ShouldStop(16384);
__ref.setField ("_boxchecked",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_boxchecked"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 176;BA.debugLine="If boxchecked = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_boxchecked"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 177;BA.debugLine="RefreshTimer.Enabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_refreshtimer").runMethod(true,"setEnabled",tasktable.__c.getField(true,"True"));
 };
 };
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("AsView (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "tasktable","asview", __ref);
 BA.debugLineNum = 46;BA.debugLine="Sub AsView As View";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Return WholeScreen";
Debug.ShouldStop(16384);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_wholescreen").getObject());
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildtasks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("buildTasks (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("buildtasks")) return __ref.runUserSub(false, "tasktable","buildtasks", __ref);
RemoteObject _p = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.declareNull("b4a.example.types._task");
RemoteObject _taskpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _taskidlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tasknamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _taskinfolbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _checked = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 BA.debugLineNum = 98;BA.debugLine="Sub buildTasks";
Debug.ShouldStop(2);
 BA.debugLineNum = 100;BA.debugLine="tableofrequests.removeAllViews";
Debug.ShouldStop(8);
__ref.getField(false,"_tableofrequests").runVoidMethod ("removeAllViews");
 BA.debugLineNum = 101;BA.debugLine="boxchecked = 0";
Debug.ShouldStop(16);
__ref.setField ("_boxchecked",BA.numberCast(int.class, 0));
 BA.debugLineNum = 102;BA.debugLine="Dim p As Int = 0";
Debug.ShouldStop(32);
_p = BA.numberCast(int.class, 0);Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 103;BA.debugLine="For Each i As Task In TasksList.Values";
Debug.ShouldStop(64);
{
final RemoteObject group4 = __ref.getField(false,"_taskslist").runMethod(false,"Values");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (group4.runMethod(false,"Get",index4));Debug.locals.put("i", _i);
Debug.locals.put("i", _i);
 BA.debugLineNum = 104;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_i.getField(true,"TaskType"),BA.numberCast(double.class, tasktable._main._currentuser.getField(true,"TypeOfWorker")))) { 
 BA.debugLineNum = 105;BA.debugLine="Dim TaskPanel As Panel";
Debug.ShouldStop(256);
_taskpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("TaskPanel", _taskpanel);
 BA.debugLineNum = 106;BA.debugLine="Dim TaskIdLbl As Label";
Debug.ShouldStop(512);
_taskidlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskIdLbl", _taskidlbl);
 BA.debugLineNum = 107;BA.debugLine="Dim TaskNameLbl As Label";
Debug.ShouldStop(1024);
_tasknamelbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("TaskNameLbl", _tasknamelbl);
 BA.debugLineNum = 108;BA.debugLine="Dim taskInfoLbl As Label";
Debug.ShouldStop(2048);
_taskinfolbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("taskInfoLbl", _taskinfolbl);
 BA.debugLineNum = 109;BA.debugLine="Dim checked As CheckBox";
Debug.ShouldStop(4096);
_checked = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checked", _checked);
 BA.debugLineNum = 111;BA.debugLine="TaskPanel.Initialize(\"\")";
Debug.ShouldStop(16384);
_taskpanel.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 112;BA.debugLine="TaskIdLbl.Initialize(\"\")";
Debug.ShouldStop(32768);
_taskidlbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 113;BA.debugLine="TaskNameLbl.Initialize(\"\")";
Debug.ShouldStop(65536);
_tasknamelbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 114;BA.debugLine="taskInfoLbl.Initialize(\"\")";
Debug.ShouldStop(131072);
_taskinfolbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 115;BA.debugLine="checked.Initialize(\"accept\")";
Debug.ShouldStop(262144);
_checked.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("accept")));
 BA.debugLineNum = 117;BA.debugLine="TaskIdLbl.Text = i.TaskID";
Debug.ShouldStop(1048576);
_taskidlbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskID")));
 BA.debugLineNum = 118;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
Debug.ShouldStop(2097152);
_taskidlbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 119;BA.debugLine="TaskIdLbl.TextSize = 15";
Debug.ShouldStop(4194304);
_taskidlbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 120;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8388608);
_taskidlbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 121;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
Debug.ShouldStop(16777216);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskidlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 123;BA.debugLine="TaskNameLbl.Text = i.TaskName";
Debug.ShouldStop(67108864);
_tasknamelbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskName")));
 BA.debugLineNum = 124;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
Debug.ShouldStop(134217728);
_tasknamelbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 125;BA.debugLine="TaskNameLbl.TextSize = 15";
Debug.ShouldStop(268435456);
_tasknamelbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 126;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(536870912);
_tasknamelbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 127;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
Debug.ShouldStop(1073741824);
_taskpanel.runVoidMethod ("AddView",(Object)((_tasknamelbl.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 129;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
Debug.ShouldStop(1);
_taskinfolbl.runMethod(true,"setText",BA.ObjectToCharSequence(_i.getField(true,"TaskInfo")));
 BA.debugLineNum = 130;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
Debug.ShouldStop(2);
_taskinfolbl.runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 131;BA.debugLine="taskInfoLbl.TextSize = 10";
Debug.ShouldStop(4);
_taskinfolbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 10));
 BA.debugLineNum = 132;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
Debug.ShouldStop(8);
_taskinfolbl.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 133;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
Debug.ShouldStop(16);
_taskpanel.runVoidMethod ("AddView",(Object)((_taskinfolbl.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 136;BA.debugLine="checked.Gravity = Gravity.CENTER";
Debug.ShouldStop(128);
_checked.runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 137;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
Debug.ShouldStop(256);
_taskpanel.runVoidMethod ("AddView",(Object)((_checked.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 139;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
Debug.ShouldStop(1024);
_taskpanel.runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 140;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
Debug.ShouldStop(2048);
__ref.getField(false,"_tableofrequests").runVoidMethod ("addView",(Object)((_taskpanel.getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 142;BA.debugLine="TaskPanel.Tag = p";
Debug.ShouldStop(8192);
_taskpanel.runMethod(false,"setTag",(_p));
 BA.debugLineNum = 143;BA.debugLine="checked.Tag = p";
Debug.ShouldStop(16384);
_checked.runMethod(false,"setTag",(_p));
 BA.debugLineNum = 144;BA.debugLine="p = p + 1";
Debug.ShouldStop(32768);
_p = RemoteObject.solve(new RemoteObject[] {_p,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("p", _p);
 BA.debugLineNum = 145;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
Debug.ShouldStop(65536);
__ref.getField(false,"_mapoftaskviews").runVoidMethod ("Put",(Object)(_taskpanel.runMethod(false,"getTag")),(Object)((_taskpanel.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("BuildUI (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "tasktable","buildui", __ref);
 BA.debugLineNum = 56;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_taskfakepan").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 58;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tableheader").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 59;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tablefooter").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 60;BA.debugLine="tableType.Gravity = Gravity.CENTER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tabletype").runMethod(true,"setGravity",tasktable.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 61;BA.debugLine="submit.Text = \"Accept\"";
Debug.ShouldStop(268435456);
__ref.getField(false,"_submit").runMethod(true,"setText",BA.ObjectToCharSequence("Accept"));
 BA.debugLineNum = 62;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
Debug.ShouldStop(536870912);
tasktable._helperfunctions1.runVoidMethod ("_apply_viewstyle",__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), __ref.getField(false,"_submit").getObject()),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Black")),(Object)(tasktable.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"White")),(Object)(tasktable.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255)))),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(tasktable.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(BA.numberCast(int.class, 10)));
 BA.debugLineNum = 66;BA.debugLine="tableType.TextColor = Colors.White";
Debug.ShouldStop(2);
__ref.getField(false,"_tabletype").runMethod(true,"setTextColor",tasktable.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 67;BA.debugLine="tableType.TextSize = 25";
Debug.ShouldStop(4);
__ref.getField(false,"_tabletype").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 68;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 69;BA.debugLine="tableType.Text = \"Workers Table\"";
Debug.ShouldStop(16);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Workers Table"));
 }else 
{ BA.debugLineNum = 70;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 71;BA.debugLine="tableType.Text = \"Cooks Table\"";
Debug.ShouldStop(64);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Cooks Table"));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"TypeOfWorker"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 73;BA.debugLine="tableType.Text = \"Waiters Table\"";
Debug.ShouldStop(256);
__ref.getField(false,"_tabletype").runMethod(true,"setText",BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
 BA.debugLineNum = 76;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
Debug.ShouldStop(2048);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableholder").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 77;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(4096);
__ref.getField(false,"_tableofrequests").runVoidMethod ("setColor",tasktable.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 78;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
Debug.ShouldStop(8192);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tableheader").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 80;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
Debug.ShouldStop(32768);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)(__ref.getField(false,"_tableofrequests").runMethod(false,"getScrollView")),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tableheader").runMethod(true,"getTop"),__ref.getField(false,"_tableheader").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 81;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
Debug.ShouldStop(65536);
__ref.getField(false,"_tableholder").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tablefooter").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 65)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))}, "-",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 82;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
Debug.ShouldStop(131072);
__ref.getField(false,"_tablefooter").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_submit").getObject())),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(RemoteObject.solve(new RemoteObject[] {tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba")),tasktable.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))}, "-",1, 1)));
 BA.debugLineNum = 83;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
Debug.ShouldStop(262144);
__ref.getField(false,"_tableheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tabletype").getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(tasktable.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(tasktable.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 8;BA.debugLine="Dim tableofrequests As MiScrollView";
tasktable._tableofrequests = RemoteObject.createNew ("wrappers.MiScrollView");__ref.setField("_tableofrequests",tasktable._tableofrequests);
 //BA.debugLineNum = 9;BA.debugLine="Dim submit As Button";
tasktable._submit = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_submit",tasktable._submit);
 //BA.debugLineNum = 12;BA.debugLine="Dim mapoftaskviews As Map";
tasktable._mapoftaskviews = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapoftaskviews",tasktable._mapoftaskviews);
 //BA.debugLineNum = 13;BA.debugLine="Dim boxchecked As Int = 0";
tasktable._boxchecked = BA.numberCast(int.class, 0);__ref.setField("_boxchecked",tasktable._boxchecked);
 //BA.debugLineNum = 15;BA.debugLine="Dim SelectedTasks As Map";
tasktable._selectedtasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_selectedtasks",tasktable._selectedtasks);
 //BA.debugLineNum = 17;BA.debugLine="Dim TaskFakePan As Panel";
tasktable._taskfakepan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_taskfakepan",tasktable._taskfakepan);
 //BA.debugLineNum = 19;BA.debugLine="Dim RefreshTimer As Timer";
tasktable._refreshtimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");__ref.setField("_refreshtimer",tasktable._refreshtimer);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _get_tasks(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Get_Tasks (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("get_tasks")) return __ref.runUserSub(false, "tasktable","get_tasks", __ref);
int _i = 0;
RemoteObject _task = RemoteObject.declareNull("b4a.example.types._task");
 BA.debugLineNum = 87;BA.debugLine="Sub Get_Tasks";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 88;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(8388608);
{
final int step1 = 1;
final int limit1 = 5;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 89;BA.debugLine="Dim Task As Task";
Debug.ShouldStop(16777216);
_task = RemoteObject.createNew ("b4a.example.types._task");Debug.locals.put("Task", _task);
 BA.debugLineNum = 90;BA.debugLine="Task.Initialize";
Debug.ShouldStop(33554432);
_task.runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="Task.TaskID = i";
Debug.ShouldStop(67108864);
_task.setField ("TaskID",BA.numberCast(int.class, _i));
 BA.debugLineNum = 92;BA.debugLine="Task.TaskName = \"Task \"&i";
Debug.ShouldStop(134217728);
_task.setField ("TaskName",RemoteObject.concat(RemoteObject.createImmutable("Task "),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 93;BA.debugLine="Task.TaskType = 1";
Debug.ShouldStop(268435456);
_task.setField ("TaskType",BA.numberCast(int.class, 1));
 BA.debugLineNum = 94;BA.debugLine="Task.TaskInfo = \"This is a very long text that i";
Debug.ShouldStop(536870912);
_task.setField ("TaskInfo",RemoteObject.concat(RemoteObject.createImmutable("This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"),RemoteObject.createImmutable(_i)));
 BA.debugLineNum = 95;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_taskslist").runVoidMethod ("Put",(Object)((_task.getField(true,"TaskID"))),(Object)((_task)));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "tasktable","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="WholeScreen.Initialize(\"\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="TasksList.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_taskslist").runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="tableHolder.Initialize(\"table\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tableholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("table")));
 BA.debugLineNum = 27;BA.debugLine="tableHeader.Initialize(\"Header\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tableheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Header")));
 BA.debugLineNum = 28;BA.debugLine="tableFooter.Initialize(\"Footer\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tablefooter").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Footer")));
 BA.debugLineNum = 29;BA.debugLine="tableType.Initialize(\"type\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tabletype").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("type")));
 BA.debugLineNum = 32;BA.debugLine="submit.Initialize(\"Submit\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_submit").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Submit")));
 BA.debugLineNum = 33;BA.debugLine="tableofrequests.Initialize";
Debug.ShouldStop(1);
__ref.getField(false,"_tableofrequests").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 34;BA.debugLine="mapoftaskviews.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_mapoftaskviews").runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="SelectedTasks.Initialize";
Debug.ShouldStop(4);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="TaskFakePan.initialize(\"\")";
Debug.ShouldStop(16);
__ref.getField(false,"_taskfakepan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",2000)";
Debug.ShouldStop(64);
__ref.getField(false,"_refreshtimer").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Refresh")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 40;BA.debugLine="RefreshTimer.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_refreshtimer").runMethod(true,"setEnabled",tasktable.__c.getField(true,"True"));
 BA.debugLineNum = 42;BA.debugLine="BuildUI";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.tasktable.class, "_buildui");
 BA.debugLineNum = 43;BA.debugLine="Get_Tasks";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.tasktable.class, "_get_tasks");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh_tick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh_Tick (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("refresh_tick")) return __ref.runUserSub(false, "tasktable","refresh_tick", __ref);
 BA.debugLineNum = 49;BA.debugLine="Sub Refresh_Tick";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="If Main.currentuser.available = True  Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",tasktable._main._currentuser.getField(true,"available"),tasktable.__c.getField(true,"True"))) { 
 BA.debugLineNum = 51;BA.debugLine="buildTasks";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.tasktable.class, "_buildtasks");
 BA.debugLineNum = 52;BA.debugLine="submit.Enabled = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_submit").runMethod(true,"setEnabled",tasktable.__c.getField(true,"True"));
 BA.debugLineNum = 53;BA.debugLine="Log(\"_TABLE REFRESHED_\")";
Debug.ShouldStop(1048576);
tasktable.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("_TABLE REFRESHED_")));
 };
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Submit_Click (tasktable) ","tasktable",4,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("submit_click")) return __ref.runUserSub(false, "tasktable","submit_click", __ref);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("b4a.example.types._task");
 BA.debugLineNum = 182;BA.debugLine="Sub Submit_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="If SelectedTasks.Size > 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_selectedtasks").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 184;BA.debugLine="boxchecked = 0";
Debug.ShouldStop(8388608);
__ref.setField ("_boxchecked",BA.numberCast(int.class, 0));
 BA.debugLineNum = 185;BA.debugLine="RefreshTimer.Enabled = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_refreshtimer").runMethod(true,"setEnabled",tasktable.__c.getField(true,"True"));
 BA.debugLineNum = 186;BA.debugLine="submit.Enabled = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_submit").runMethod(true,"setEnabled",tasktable.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="Dim i As Int = 0";
Debug.ShouldStop(67108864);
_i = BA.numberCast(int.class, 0);Debug.locals.put("i", _i);Debug.locals.put("i", _i);
 BA.debugLineNum = 189;BA.debugLine="For Each v As Task In SelectedTasks.Values";
Debug.ShouldStop(268435456);
{
final RemoteObject group6 = __ref.getField(false,"_selectedtasks").runMethod(false,"Values");
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (group6.runMethod(false,"Get",index6));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 190;BA.debugLine="Main.currentuser.CurrentTaskID(i) = v.TaskID";
Debug.ShouldStop(536870912);
tasktable._main._currentuser.getField(false,"CurrentTaskID").setArrayElement (_v.getField(true,"TaskID"),_i);
 BA.debugLineNum = 191;BA.debugLine="i = i + 1";
Debug.ShouldStop(1073741824);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 194;BA.debugLine="Log(SelectedTasks)";
Debug.ShouldStop(2);
tasktable.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_selectedtasks"))));
 BA.debugLineNum = 195;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
Debug.ShouldStop(4);
tasktable.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((tasktable._main.getObject())),(Object)(RemoteObject.createImmutable("SetUserBusy")));
 BA.debugLineNum = 196;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
Debug.ShouldStop(8);
tasktable.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)((tasktable._main.getObject())),(Object)(BA.ObjectToString("LoadMyTasks")),(Object)((__ref.getField(false,"_selectedtasks"))));
 BA.debugLineNum = 197;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
Debug.ShouldStop(16);
tasktable.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((tasktable._main.getObject())),(Object)(RemoteObject.createImmutable("TaskTableToMyTasks")));
 BA.debugLineNum = 198;BA.debugLine="SelectedTasks.Clear";
Debug.ShouldStop(32);
__ref.getField(false,"_selectedtasks").runVoidMethod ("Clear");
 }else {
 BA.debugLineNum = 200;BA.debugLine="ToastMessageShow(\"Please select a task to contin";
Debug.ShouldStop(128);
tasktable.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Please select a task to continue!")),(Object)(tasktable.__c.getField(true,"False")));
 };
 BA.debugLineNum = 202;BA.debugLine="End Sub";
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