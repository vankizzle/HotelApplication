package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class mytasks_subs_0 {


public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("asview")) return __ref.runUserSub(false, "mytasks","asview", __ref);
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
public static RemoteObject  _buildui(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildUI (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("buildui")) return __ref.runUserSub(false, "mytasks","buildui", __ref);
 BA.debugLineNum = 27;BA.debugLine="Sub BuildUI";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_taskfakepan").runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 29;BA.debugLine="TaskHeader.Color = Colors.ARGB(150,0,0,0)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_taskheader").runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 150)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 30;BA.debugLine="FinishBtn.Color = Colors.rgb(41, 163, 41)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_finishbtn").runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 41)),(Object)(BA.numberCast(int.class, 163)),(Object)(BA.numberCast(int.class, 41))));
 BA.debugLineNum = 31;BA.debugLine="FinishBtn.Gravity =Gravity.CENTER";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_finishbtn").runMethod(true,"setGravity",mytasks.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 32;BA.debugLine="FinishBtn.Text = \"Finish\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_finishbtn").runMethod(true,"setText",BA.ObjectToCharSequence("Finish"));
 BA.debugLineNum = 33;BA.debugLine="FinishBtn.TextSize = 25";
Debug.ShouldStop(1);
__ref.getField(false,"_finishbtn").runMethod(true,"setTextSize",BA.numberCast(float.class, 25));
 BA.debugLineNum = 34;BA.debugLine="FinishBtn.Enabled = False";
Debug.ShouldStop(2);
__ref.getField(false,"_finishbtn").runMethod(true,"setEnabled",mytasks.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y";
Debug.ShouldStop(4);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_taskheader").getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 36;BA.debugLine="WholeScreen.AddView(TaskFakePan,TaskHeader.Left,T";
Debug.ShouldStop(8);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_taskfakepan").getObject())),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_taskheader").runMethod(true,"getTop"),__ref.getField(false,"_taskheader").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getWidth")),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 60)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 37;BA.debugLine="WholeScreen.AddView(TaskHolder.ScrollView,TaskHea";
Debug.ShouldStop(16);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)(__ref.getField(false,"_taskholder").runMethod(false,"getScrollView")),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_taskheader").runMethod(true,"getTop"),__ref.getField(false,"_taskheader").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_taskfakepan").runMethod(true,"getHeight")));
 BA.debugLineNum = 38;BA.debugLine="WholeScreen.AddView(FinishBtn,TaskHeader.Left,Tas";
Debug.ShouldStop(32);
__ref.getField(false,"_wholescreen").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_finishbtn").getObject())),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getLeft")),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_taskfakepan").runMethod(true,"getTop"),__ref.getField(false,"_taskfakepan").runMethod(true,"getHeight")}, "+",1, 1)),(Object)(__ref.getField(false,"_taskfakepan").runMethod(true,"getWidth")),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 39;BA.debugLine="TableName.Gravity = Gravity.CENTER";
Debug.ShouldStop(64);
__ref.getField(false,"_tablename").runMethod(true,"setGravity",mytasks.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 40;BA.debugLine="TableName.Text = \"My Tasks\"";
Debug.ShouldStop(128);
__ref.getField(false,"_tablename").runMethod(true,"setText",BA.ObjectToCharSequence("My Tasks"));
 BA.debugLineNum = 41;BA.debugLine="TableName.TextColor = Colors.White";
Debug.ShouldStop(256);
__ref.getField(false,"_tablename").runMethod(true,"setTextColor",mytasks.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 42;BA.debugLine="TableName.TextSize = 15";
Debug.ShouldStop(512);
__ref.getField(false,"_tablename").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 43;BA.debugLine="TaskHeader.AddView(TableName,TaskHeader.Left + 10";
Debug.ShouldStop(1024);
__ref.getField(false,"_taskheader").runVoidMethod ("AddView",(Object)((__ref.getField(false,"_tablename").getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_taskheader").runMethod(true,"getLeft"),mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))}, "+",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_taskheader").runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(__ref.getField(false,"_taskheader").runMethod(true,"getHeight")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim WholeScreen As Panel";
mytasks._wholescreen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_wholescreen",mytasks._wholescreen);
 //BA.debugLineNum = 3;BA.debugLine="Dim TaskHolder As MiScrollView";
mytasks._taskholder = RemoteObject.createNew ("wrappers.MiScrollView");__ref.setField("_taskholder",mytasks._taskholder);
 //BA.debugLineNum = 4;BA.debugLine="Dim TaskHeader As Panel";
mytasks._taskheader = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_taskheader",mytasks._taskheader);
 //BA.debugLineNum = 5;BA.debugLine="Dim TableName As Label";
mytasks._tablename = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_tablename",mytasks._tablename);
 //BA.debugLineNum = 6;BA.debugLine="Dim TaskFakePan As Panel";
mytasks._taskfakepan = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_taskfakepan",mytasks._taskfakepan);
 //BA.debugLineNum = 7;BA.debugLine="Dim FinishBtn As Button";
mytasks._finishbtn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_finishbtn",mytasks._finishbtn);
 //BA.debugLineNum = 8;BA.debugLine="Dim MapOfView As Map";
mytasks._mapofview = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_mapofview",mytasks._mapofview);
 //BA.debugLineNum = 9;BA.debugLine="Dim ViewToRemove As Map";
mytasks._viewtoremove = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_viewtoremove",mytasks._viewtoremove);
 //BA.debugLineNum = 10;BA.debugLine="Dim chekboxtag As Int = 0";
mytasks._chekboxtag = BA.numberCast(int.class, 0);__ref.setField("_chekboxtag",mytasks._chekboxtag);
 //BA.debugLineNum = 11;BA.debugLine="Dim checkNumbers As Int = 0";
mytasks._checknumbers = BA.numberCast(int.class, 0);__ref.setField("_checknumbers",mytasks._checknumbers);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _finish_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Finish_Click (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("finish_click")) return __ref.runUserSub(false, "mytasks","finish_click", __ref);
int _i = 0;
RemoteObject _k = RemoteObject.createImmutable(0);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 135;BA.debugLine="Sub Finish_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Log(ViewToRemove)";
Debug.ShouldStop(128);
mytasks.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_viewtoremove"))));
 BA.debugLineNum = 137;BA.debugLine="Log(MapOfView)";
Debug.ShouldStop(256);
mytasks.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_mapofview"))));
 BA.debugLineNum = 139;BA.debugLine="For i = 0 To ViewToRemove.Size - 1";
Debug.ShouldStop(1024);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_viewtoremove").runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 140;BA.debugLine="Main.currentuser.CurrentTaskID(i) = 0";
Debug.ShouldStop(2048);
mytasks._main._currentuser.getField(false,"CurrentTaskID").setArrayElement (BA.numberCast(int.class, 0),BA.numberCast(int.class, _i));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 143;BA.debugLine="Main.currentuser.CurrentTaskID(0) = 5";
Debug.ShouldStop(16384);
mytasks._main._currentuser.getField(false,"CurrentTaskID").setArrayElement (BA.numberCast(int.class, 5),BA.numberCast(int.class, 0));
 BA.debugLineNum = 144;BA.debugLine="For Each k As Int In ViewToRemove.Keys";
Debug.ShouldStop(32768);
{
final RemoteObject group7 = __ref.getField(false,"_viewtoremove").runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.numberCast(int.class, group7.runMethod(false,"Get",index7));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 145;BA.debugLine="If MapOfView.ContainsKey(k) Then";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_mapofview").runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 146;BA.debugLine="MapOfView.Remove(k)";
Debug.ShouldStop(131072);
__ref.getField(false,"_mapofview").runVoidMethod ("Remove",(Object)((_k)));
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 150;BA.debugLine="For Each v As Panel In ViewToRemove.Values";
Debug.ShouldStop(2097152);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
{
final RemoteObject group12 = __ref.getField(false,"_viewtoremove").runMethod(false,"Values");
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v.setObject(group12.runMethod(false,"Get",index12));
Debug.locals.put("v", _v);
 BA.debugLineNum = 151;BA.debugLine="v.RemoveAllViews";
Debug.ShouldStop(4194304);
_v.runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 152;BA.debugLine="v.RemoveView";
Debug.ShouldStop(8388608);
_v.runVoidMethod ("RemoveView");
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 155;BA.debugLine="ViewToRemove.Clear";
Debug.ShouldStop(67108864);
__ref.getField(false,"_viewtoremove").runVoidMethod ("Clear");
 BA.debugLineNum = 157;BA.debugLine="Log(\"???????????????\")";
Debug.ShouldStop(268435456);
mytasks.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("???????????????")));
 BA.debugLineNum = 158;BA.debugLine="Log(ViewToRemove)";
Debug.ShouldStop(536870912);
mytasks.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_viewtoremove"))));
 BA.debugLineNum = 159;BA.debugLine="Log(MapOfView)";
Debug.ShouldStop(1073741824);
mytasks.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(__ref.getField(false,"_mapofview"))));
 BA.debugLineNum = 161;BA.debugLine="FinishBtn.Enabled = False";
Debug.ShouldStop(1);
__ref.getField(false,"_finishbtn").runMethod(true,"setEnabled",mytasks.__c.getField(true,"False"));
 BA.debugLineNum = 163;BA.debugLine="If MapOfView.Size = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mapofview").runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 164;BA.debugLine="MapOfView.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_mapofview").runVoidMethod ("Clear");
 BA.debugLineNum = 165;BA.debugLine="ViewToRemove.Clear";
Debug.ShouldStop(16);
__ref.getField(false,"_viewtoremove").runVoidMethod ("Clear");
 BA.debugLineNum = 166;BA.debugLine="CallSub(Main,\"SetUserAvailable\")";
Debug.ShouldStop(32);
mytasks.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)((mytasks._main.getObject())),(Object)(RemoteObject.createImmutable("SetUserAvailable")));
 };
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finished_checkedchange(RemoteObject __ref,RemoteObject _checked) throws Exception{
try {
		Debug.PushSubsStack("finished_CheckedChange (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("finished_checkedchange")) return __ref.runUserSub(false, "mytasks","finished_checkedchange", __ref, _checked);
RemoteObject _cbox = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _k = RemoteObject.createImmutable(0);
Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 110;BA.debugLine="Sub finished_CheckedChange(Checked As Boolean)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Dim cbox As CheckBox = Sender";
Debug.ShouldStop(16384);
_cbox = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_cbox.setObject(mytasks.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("cbox", _cbox);
 BA.debugLineNum = 113;BA.debugLine="If Checked = True Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_checked,mytasks.__c.getField(true,"True"))) { 
 BA.debugLineNum = 114;BA.debugLine="FinishBtn.Enabled = True";
Debug.ShouldStop(131072);
__ref.getField(false,"_finishbtn").runMethod(true,"setEnabled",mytasks.__c.getField(true,"True"));
 BA.debugLineNum = 115;BA.debugLine="checkNumbers = checkNumbers + 1";
Debug.ShouldStop(262144);
__ref.setField ("_checknumbers",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_checknumbers"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 116;BA.debugLine="For Each k As Int In MapOfView.Keys";
Debug.ShouldStop(524288);
{
final RemoteObject group5 = __ref.getField(false,"_mapofview").runMethod(false,"Keys");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = BA.numberCast(int.class, group5.runMethod(false,"Get",index5));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 117;BA.debugLine="If cbox.Tag = k Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_cbox.runMethod(false,"getTag"),(_k))) { 
 BA.debugLineNum = 118;BA.debugLine="ToastMessageShow(\"You selected task \" & k,Fals";
Debug.ShouldStop(2097152);
mytasks.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("You selected task "),_k))),(Object)(mytasks.__c.getField(true,"False")));
 BA.debugLineNum = 119;BA.debugLine="ViewToRemove.Put(k,MapOfView.Get(k))";
Debug.ShouldStop(4194304);
__ref.getField(false,"_viewtoremove").runVoidMethod ("Put",(Object)((_k)),(Object)(__ref.getField(false,"_mapofview").runMethod(false,"Get",(Object)((_k)))));
 };
 }
}Debug.locals.put("k", _k);
;
 }else {
 BA.debugLineNum = 123;BA.debugLine="Checked = False";
Debug.ShouldStop(67108864);
_checked = mytasks.__c.getField(true,"False");Debug.locals.put("Checked", _checked);
 BA.debugLineNum = 124;BA.debugLine="checkNumbers = checkNumbers - 1";
Debug.ShouldStop(134217728);
__ref.setField ("_checknumbers",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_checknumbers"),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 125;BA.debugLine="ViewToRemove.Remove(cbox.tag)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_viewtoremove").runVoidMethod ("Remove",(Object)(_cbox.runMethod(false,"getTag")));
 BA.debugLineNum = 127;BA.debugLine="If 	checkNumbers = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_checknumbers"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 128;BA.debugLine="FinishBtn.Enabled = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_finishbtn").runMethod(true,"setEnabled",mytasks.__c.getField(true,"False"));
 };
 };
 BA.debugLineNum = 132;BA.debugLine="Log(\"Checked = \"& checkNumbers)";
Debug.ShouldStop(8);
mytasks.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Checked = "),__ref.getField(true,"_checknumbers"))));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmytasks(RemoteObject __ref,RemoteObject _acceptedtasks) throws Exception{
try {
		Debug.PushSubsStack("GetMyTasks (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("getmytasks")) return __ref.runUserSub(false, "mytasks","getmytasks", __ref, _acceptedtasks);
int _i = 0;
RemoteObject _v = RemoteObject.declareNull("b4a.example.types._task");
Debug.locals.put("AcceptedTasks", _acceptedtasks);
 BA.debugLineNum = 50;BA.debugLine="Public Sub GetMyTasks(AcceptedTasks As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="For i = 0 To MapOfView.Size";
Debug.ShouldStop(262144);
{
final int step1 = 1;
final int limit1 = __ref.getField(false,"_mapofview").runMethod(true,"getSize").<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="MapOfView.Remove(i)";
Debug.ShouldStop(524288);
__ref.getField(false,"_mapofview").runVoidMethod ("Remove",(Object)(RemoteObject.createImmutable((_i))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 54;BA.debugLine="TaskHolder.removeAllViews";
Debug.ShouldStop(2097152);
__ref.getField(false,"_taskholder").runVoidMethod ("removeAllViews");
 BA.debugLineNum = 55;BA.debugLine="For Each v As Task In AcceptedTasks.Values";
Debug.ShouldStop(4194304);
{
final RemoteObject group5 = _acceptedtasks.runMethod(false,"Values");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (group5.runMethod(false,"Get",index5));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 57;BA.debugLine="TaskHolder.addView(PanBuilder(v.TaskName,v.TaskT";
Debug.ShouldStop(16777216);
__ref.getField(false,"_taskholder").runVoidMethod ("addView",(Object)((__ref.runClassMethod (b4a.example.mytasks.class, "_panbuilder",(Object)(_v.getField(true,"TaskName")),(Object)(_v.getField(true,"TaskType")),(Object)(_v.getField(true,"TaskInfo")),(Object)(_v.getField(true,"TaskID"))).getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2)))));
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Initialize (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "mytasks","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="WholeScreen.Initialize(\"\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_wholescreen").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 17;BA.debugLine="TaskHolder.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_taskholder").runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 18;BA.debugLine="TaskHeader.Initialize(\"\")";
Debug.ShouldStop(131072);
__ref.getField(false,"_taskheader").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 19;BA.debugLine="TableName.Initialize(\"\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_tablename").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 20;BA.debugLine="TaskFakePan.initialize(\"\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_taskfakepan").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="FinishBtn.Initialize(\"Finish\")";
Debug.ShouldStop(1048576);
__ref.getField(false,"_finishbtn").runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Finish")));
 BA.debugLineNum = 22;BA.debugLine="MapOfView.Initialize";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mapofview").runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="ViewToRemove.Initialize";
Debug.ShouldStop(4194304);
__ref.getField(false,"_viewtoremove").runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="BuildUI";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4a.example.mytasks.class, "_buildui");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panbuilder(RemoteObject __ref,RemoteObject _name,RemoteObject _tasktype,RemoteObject _info,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("PanBuilder (mytasks) ","mytasks",2,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("panbuilder")) return __ref.runUserSub(false, "mytasks","panbuilder", __ref, _name, _tasktype, _info, _id);
RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _header = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _lblname = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _viewinfo = RemoteObject.declareNull("wrappers.MiScrollView");
RemoteObject _lblinfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblid = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _checked = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Name", _name);
Debug.locals.put("TaskType", _tasktype);
Debug.locals.put("Info", _info);
Debug.locals.put("ID", _id);
 BA.debugLineNum = 62;BA.debugLine="Sub PanBuilder(Name As String,TaskType As Int,Info";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim Holder As Panel";
Debug.ShouldStop(1073741824);
_holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Holder", _holder);
 BA.debugLineNum = 64;BA.debugLine="Holder.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_holder.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 67;BA.debugLine="Dim header As Panel";
Debug.ShouldStop(4);
_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("header", _header);
 BA.debugLineNum = 68;BA.debugLine="header.Initialize(\"\")";
Debug.ShouldStop(8);
_header.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 69;BA.debugLine="Dim lblName As Label";
Debug.ShouldStop(16);
_lblname = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblName", _lblname);
 BA.debugLineNum = 70;BA.debugLine="lblName.Initialize(\"\")";
Debug.ShouldStop(32);
_lblname.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 71;BA.debugLine="Dim ViewInfo As MiScrollView";
Debug.ShouldStop(64);
_viewinfo = RemoteObject.createNew ("wrappers.MiScrollView");Debug.locals.put("ViewInfo", _viewinfo);
 BA.debugLineNum = 72;BA.debugLine="ViewInfo.Initialize";
Debug.ShouldStop(128);
_viewinfo.runVoidMethod ("Initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 73;BA.debugLine="Dim lblInfo As Label";
Debug.ShouldStop(256);
_lblinfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblInfo", _lblinfo);
 BA.debugLineNum = 74;BA.debugLine="lblInfo.Initialize(\"\")";
Debug.ShouldStop(512);
_lblinfo.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 75;BA.debugLine="Dim lblID As Label";
Debug.ShouldStop(1024);
_lblid = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblID", _lblid);
 BA.debugLineNum = 76;BA.debugLine="lblID.Initialize(\"\")";
Debug.ShouldStop(2048);
_lblid.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 77;BA.debugLine="Dim checked As CheckBox";
Debug.ShouldStop(4096);
_checked = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("checked", _checked);
 BA.debugLineNum = 78;BA.debugLine="checked.Initialize(\"finished\")";
Debug.ShouldStop(8192);
_checked.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("finished")));
 BA.debugLineNum = 79;BA.debugLine="Holder.AddView(header,0,0,80%x,5%y)";
Debug.ShouldStop(16384);
_holder.runVoidMethod ("AddView",(Object)((_header.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 81;BA.debugLine="header.Color = Colors.rgb(0, 128, 255)";
Debug.ShouldStop(65536);
_header.runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 82;BA.debugLine="Holder.Tag = chekboxtag";
Debug.ShouldStop(131072);
_holder.runMethod(false,"setTag",(__ref.getField(true,"_chekboxtag")));
 BA.debugLineNum = 83;BA.debugLine="checked.Tag = chekboxtag";
Debug.ShouldStop(262144);
_checked.runMethod(false,"setTag",(__ref.getField(true,"_chekboxtag")));
 BA.debugLineNum = 84;BA.debugLine="checked.Gravity = Gravity.CENTER";
Debug.ShouldStop(524288);
_checked.runMethod(true,"setGravity",mytasks.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 85;BA.debugLine="header.AddView(checked,70%x,0,10%x,5%y)";
Debug.ShouldStop(1048576);
_header.runVoidMethod ("AddView",(Object)((_checked.getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 87;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
Debug.ShouldStop(4194304);
_lblname.runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 88;BA.debugLine="lblName.Text = Name";
Debug.ShouldStop(8388608);
_lblname.runMethod(true,"setText",BA.ObjectToCharSequence(_name));
 BA.debugLineNum = 89;BA.debugLine="lblName.TextSize = 20";
Debug.ShouldStop(16777216);
_lblname.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 BA.debugLineNum = 90;BA.debugLine="lblName.TextColor = Colors.White";
Debug.ShouldStop(33554432);
_lblname.runMethod(true,"setTextColor",mytasks.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="lblName.Gravity = Gravity.CENTER";
Debug.ShouldStop(67108864);
_lblname.runMethod(true,"setGravity",mytasks.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 92;BA.debugLine="header.AddView(lblName,20%x,0,40%x,5%y)";
Debug.ShouldStop(134217728);
_header.runVoidMethod ("AddView",(Object)((_lblname.getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 94;BA.debugLine="lblID.Text = ID";
Debug.ShouldStop(536870912);
_lblid.runMethod(true,"setText",BA.ObjectToCharSequence(_id));
 BA.debugLineNum = 95;BA.debugLine="header.AddView(lblID,5%x,0,5%x,5%y)";
Debug.ShouldStop(1073741824);
_header.runVoidMethod ("AddView",(Object)((_lblid.getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 96;BA.debugLine="lblID.Visible = False";
Debug.ShouldStop(-2147483648);
_lblid.runMethod(true,"setVisible",mytasks.__c.getField(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="lblInfo.Text = Info";
Debug.ShouldStop(2);
_lblinfo.runMethod(true,"setText",BA.ObjectToCharSequence(_info));
 BA.debugLineNum = 99;BA.debugLine="lblInfo.TextSize = 15";
Debug.ShouldStop(4);
_lblinfo.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 100;BA.debugLine="lblInfo.TextColor = Colors.White";
Debug.ShouldStop(8);
_lblinfo.runMethod(true,"setTextColor",mytasks.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 101;BA.debugLine="lblInfo.Color = Colors.rgb(0, 128, 255)";
Debug.ShouldStop(16);
_lblinfo.runVoidMethod ("setColor",mytasks.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 128)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 103;BA.debugLine="Holder.AddView(ViewInfo.ScrollView,0%x,5%y,80%x,1";
Debug.ShouldStop(64);
_holder.runVoidMethod ("AddView",(Object)(_viewinfo.runMethod(false,"getScrollView")),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 104;BA.debugLine="ViewInfo.addView(lblInfo,80%x,15%y,0,0,0,0)";
Debug.ShouldStop(128);
_viewinfo.runVoidMethod ("addView",(Object)((_lblinfo.getObject())),(Object)(mytasks.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 80)),__ref.getField(false, "ba"))),(Object)(mytasks.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),__ref.getField(false, "ba"))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 105;BA.debugLine="MapOfView.Put(checked.Tag,Holder)";
Debug.ShouldStop(256);
__ref.getField(false,"_mapofview").runVoidMethod ("Put",(Object)(_checked.runMethod(false,"getTag")),(Object)((_holder.getObject())));
 BA.debugLineNum = 106;BA.debugLine="chekboxtag = chekboxtag + 1";
Debug.ShouldStop(512);
__ref.setField ("_chekboxtag",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_chekboxtag"),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 107;BA.debugLine="Return Holder";
Debug.ShouldStop(1024);
if (true) return _holder;
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}