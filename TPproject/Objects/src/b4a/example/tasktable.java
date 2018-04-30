package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tasktable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.tasktable");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.tasktable.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public anywheresoftware.b4a.objects.collections.Map _taskslist = null;
public anywheresoftware.b4a.objects.PanelWrapper _tableholder = null;
public anywheresoftware.b4a.objects.PanelWrapper _tableheader = null;
public anywheresoftware.b4a.objects.PanelWrapper _tablefooter = null;
public anywheresoftware.b4a.objects.LabelWrapper _tabletype = null;
public wrappers.MiScrollView _tableofrequests = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public anywheresoftware.b4a.objects.collections.Map _mapoftaskviews = null;
public int _boxchecked = 0;
public anywheresoftware.b4a.objects.collections.Map _selectedtasks = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskfakepan = null;
public anywheresoftware.b4a.objects.Timer _refreshtimer = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.tasktable __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="TasksList.Initialize";
__ref._taskslist.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="tableHolder.Initialize(\"table\")";
__ref._tableholder.Initialize(ba,"table");
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="tableHeader.Initialize(\"Header\")";
__ref._tableheader.Initialize(ba,"Header");
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="tableFooter.Initialize(\"Footer\")";
__ref._tablefooter.Initialize(ba,"Footer");
RDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="tableType.Initialize(\"type\")";
__ref._tabletype.Initialize(ba,"type");
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="submit.Initialize(\"Submit\")";
__ref._submit.Initialize(ba,"Submit");
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="tableofrequests.Initialize";
__ref._tableofrequests.Initialize(ba);
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="mapoftaskviews.Initialize";
__ref._mapoftaskviews.Initialize();
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="SelectedTasks.Initialize";
__ref._selectedtasks.Initialize();
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="TaskFakePan.initialize(\"\")";
__ref._taskfakepan.Initialize(ba,"");
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",2000)";
__ref._refreshtimer.Initialize(ba,"Refresh",(long) (2000));
RDebugUtils.currentLine=2162705;
 //BA.debugLineNum = 2162705;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="Get_Tasks";
__ref._get_tasks(null);
RDebugUtils.currentLine=2162709;
 //BA.debugLineNum = 2162709;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return null;
}
public String  _accept_checkedchange(b4a.example.tasktable __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "accept_checkedchange"))
	return (String) Debug.delegate(ba, "accept_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="submit.Enabled = True";
__ref._submit.setEnabled(__c.True);
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="RefreshTimer.Enabled = False";
__ref._refreshtimer.setEnabled(__c.False);
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="If boxchecked < 3 Then";
if (__ref._boxchecked<3) { 
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._mapoftaskviews.Values();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v.setObject((android.view.ViewGroup)(group6.Get(index6)));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
__ref._selectedtasks.Put(_cbox.getTag(),__ref._taskslist.Get(__ref._taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="boxchecked = boxchecked + 1";
__ref._boxchecked = (int) (__ref._boxchecked+1);
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(__ref._boxchecked));
 }else {
RDebugUtils.currentLine=2555923;
 //BA.debugLineNum = 2555923;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
RDebugUtils.currentLine=2555924;
 //BA.debugLineNum = 2555924;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
RDebugUtils.currentLine=2555929;
 //BA.debugLineNum = 2555929;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=2555932;
 //BA.debugLineNum = 2555932;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
__ref._selectedtasks.Remove(_cbox.getTag());
RDebugUtils.currentLine=2555937;
 //BA.debugLineNum = 2555937;BA.debugLine="boxchecked = boxchecked - 1";
__ref._boxchecked = (int) (__ref._boxchecked-1);
RDebugUtils.currentLine=2555938;
 //BA.debugLineNum = 2555938;BA.debugLine="If boxchecked = 0 Then";
if (__ref._boxchecked==0) { 
RDebugUtils.currentLine=2555939;
 //BA.debugLineNum = 2555939;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=2555944;
 //BA.debugLineNum = 2555944;BA.debugLine="End Sub";
return "";
}
public String  _buildtasks(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "buildtasks"))
	return (String) Debug.delegate(ba, "buildtasks", null);
int _p = 0;
b4a.example.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub buildTasks";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="tableofrequests.removeAllViews";
__ref._tableofrequests.removeAllViews();
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._taskslist.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (b4a.example.types._task)(group4.Get(index4));
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2490389;
 //BA.debugLineNum = 2490389;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
RDebugUtils.currentLine=2490394;
 //BA.debugLineNum = 2490394;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
RDebugUtils.currentLine=2490400;
 //BA.debugLineNum = 2490400;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2490401;
 //BA.debugLineNum = 2490401;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
RDebugUtils.currentLine=2490402;
 //BA.debugLineNum = 2490402;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2490403;
 //BA.debugLineNum = 2490403;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2490407;
 //BA.debugLineNum = 2490407;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
_taskpanel.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
__ref._tableofrequests.addView((android.view.View)(_taskpanel.getObject()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2490412;
 //BA.debugLineNum = 2490412;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
RDebugUtils.currentLine=2490413;
 //BA.debugLineNum = 2490413;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
RDebugUtils.currentLine=2490414;
 //BA.debugLineNum = 2490414;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
RDebugUtils.currentLine=2490415;
 //BA.debugLineNum = 2490415;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
__ref._mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
RDebugUtils.currentLine=2490419;
 //BA.debugLineNum = 2490419;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
__ref._taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
__ref._tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
__ref._tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="tableType.Gravity = Gravity.CENTER";
__ref._tabletype.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="submit.Text = \"Accept\"";
__ref._submit.setText(BA.ObjectToCharSequence("Accept"));
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="tableType.TextColor = Colors.White";
__ref._tabletype.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="tableType.TextSize = 25";
__ref._tabletype.setTextSize((float) (25));
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="tableType.Text = \"Workers Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else 
{RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
if (_main._currentuser.TypeOfWorker==2) { 
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="tableType.Text = \"Cooks Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else 
{RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
if (_main._currentuser.TypeOfWorker==3) { 
RDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="tableType.Text = \"Waiters Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
RDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
__ref._wholescreen.AddView((android.view.View)(__ref._tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
RDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
__ref._tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
__ref._tableholder.AddView((android.view.View)(__ref._tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
__ref._tableholder.AddView(__ref._tableofrequests.getScrollView(),__c.PerXToCurrent((float) (0),ba),(int) (__ref._tableheader.getTop()+__ref._tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=2359321;
 //BA.debugLineNum = 2359321;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
__ref._tableholder.AddView((android.view.View)(__ref._tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
__ref._tablefooter.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
__ref._tableheader.AddView((android.view.View)(__ref._tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2359325;
 //BA.debugLineNum = 2359325;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="Dim tableofrequests As MiScrollView";
_tableofrequests = new wrappers.MiScrollView();
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Dim SelectedTasks As Map";
_selectedtasks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="Dim RefreshTimer As Timer";
_refreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "get_tasks"))
	return (String) Debug.delegate(ba, "get_tasks", null);
int _i = 0;
b4a.example.types._task _task = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Get_Tasks";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Task.Initialize";
_task.Initialize();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Task.TaskInfo = \"This is a very long text that i";
_task.TaskInfo = "This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"+BA.NumberToString(_i);
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
__ref._taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="End Sub";
return "";
}
public String  _refresh_tick(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "refresh_tick"))
	return (String) Debug.delegate(ba, "refresh_tick", null);
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub Refresh_Tick";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If Main.currentuser.available = True Then";
if (_main._currentuser.available==__c.True) { 
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="buildTasks";
__ref._buildtasks(null);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="If boxchecked = 0 Then";
if (__ref._boxchecked==0) { 
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="submit.Enabled = True";
__ref._submit.setEnabled(__c.True);
 };
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="Log(\"_TABLE REFRESHED_\")";
__c.Log("_TABLE REFRESHED_");
 }else {
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
 };
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="End Sub";
return "";
}
public String  _submit_click(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "submit_click"))
	return (String) Debug.delegate(ba, "submit_click", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub Submit_Click";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(__ref._selectedtasks));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"SetUserBusy");
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"LoadMyTasks",(Object)(__ref._selectedtasks));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="SelectedTasks.Clear";
__ref._selectedtasks.Clear();
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="End Sub";
return "";
}
}