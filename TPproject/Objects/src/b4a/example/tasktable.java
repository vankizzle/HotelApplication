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
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="TasksList.Initialize";
__ref._taskslist.Initialize();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="tableHolder.Initialize(\"table\")";
__ref._tableholder.Initialize(ba,"table");
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="tableHeader.Initialize(\"Header\")";
__ref._tableheader.Initialize(ba,"Header");
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="tableFooter.Initialize(\"Footer\")";
__ref._tablefooter.Initialize(ba,"Footer");
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="tableType.Initialize(\"type\")";
__ref._tabletype.Initialize(ba,"type");
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="submit.Initialize(\"Submit\")";
__ref._submit.Initialize(ba,"Submit");
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="tableofrequests.Initialize";
__ref._tableofrequests.Initialize(ba);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="mapoftaskviews.Initialize";
__ref._mapoftaskviews.Initialize();
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="SelectedTasks.Initialize";
__ref._selectedtasks.Initialize();
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="TaskFakePan.initialize(\"\")";
__ref._taskfakepan.Initialize(ba,"");
RDebugUtils.currentLine=2424848;
 //BA.debugLineNum = 2424848;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",2000)";
__ref._refreshtimer.Initialize(ba,"Refresh",(long) (2000));
RDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2424852;
 //BA.debugLineNum = 2424852;BA.debugLine="Get_Tasks";
__ref._get_tasks(null);
RDebugUtils.currentLine=2424853;
 //BA.debugLineNum = 2424853;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="End Sub";
return null;
}
public String  _accept_checkedchange(b4a.example.tasktable __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "accept_checkedchange"))
	return (String) Debug.delegate(ba, "accept_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="RefreshTimer.Enabled = False";
__ref._refreshtimer.setEnabled(__c.False);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If boxchecked < 3 Then";
if (__ref._boxchecked<3) { 
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="boxchecked = boxchecked + 1";
__ref._boxchecked = (int) (__ref._boxchecked+1);
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(__ref._boxchecked));
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._mapoftaskviews.Values();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject((android.view.ViewGroup)(group7.Get(index7)));
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
__ref._selectedtasks.Put(_cbox.getTag(),__ref._taskslist.Get(__ref._taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
 }else {
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
__ref._selectedtasks.Remove(_cbox.getTag());
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="boxchecked = boxchecked - 1";
__ref._boxchecked = (int) (__ref._boxchecked-1);
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="If boxchecked = 0 Then";
if (__ref._boxchecked==0) { 
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=2818078;
 //BA.debugLineNum = 2818078;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub buildTasks";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="tableofrequests.removeAllViews";
__ref._tableofrequests.removeAllViews();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._taskslist.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (b4a.example.types._task)(group4.Get(index4));
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
RDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752545;
 //BA.debugLineNum = 2752545;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
RDebugUtils.currentLine=2752546;
 //BA.debugLineNum = 2752546;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752547;
 //BA.debugLineNum = 2752547;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752550;
 //BA.debugLineNum = 2752550;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752551;
 //BA.debugLineNum = 2752551;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752553;
 //BA.debugLineNum = 2752553;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
_taskpanel.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=2752554;
 //BA.debugLineNum = 2752554;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
__ref._tableofrequests.addView((android.view.View)(_taskpanel.getObject()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=2752556;
 //BA.debugLineNum = 2752556;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
RDebugUtils.currentLine=2752557;
 //BA.debugLineNum = 2752557;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
RDebugUtils.currentLine=2752558;
 //BA.debugLineNum = 2752558;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
RDebugUtils.currentLine=2752559;
 //BA.debugLineNum = 2752559;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
__ref._mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
RDebugUtils.currentLine=2752563;
 //BA.debugLineNum = 2752563;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
__ref._taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
__ref._tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
__ref._tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="tableType.Gravity = Gravity.CENTER";
__ref._tabletype.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="submit.Text = \"Accept\"";
__ref._submit.setText(BA.ObjectToCharSequence("Accept"));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="tableType.TextColor = Colors.White";
__ref._tabletype.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="tableType.TextSize = 25";
__ref._tabletype.setTextSize((float) (25));
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="tableType.Text = \"Workers Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else 
{RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
if (_main._currentuser.TypeOfWorker==2) { 
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="tableType.Text = \"Cooks Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else 
{RDebugUtils.currentLine=2621456;
 //BA.debugLineNum = 2621456;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
if (_main._currentuser.TypeOfWorker==3) { 
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="tableType.Text = \"Waiters Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
__ref._wholescreen.AddView((android.view.View)(__ref._tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
__ref._tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
__ref._tableholder.AddView((android.view.View)(__ref._tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
__ref._tableholder.AddView(__ref._tableofrequests.getScrollView(),__c.PerXToCurrent((float) (0),ba),(int) (__ref._tableheader.getTop()+__ref._tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
__ref._tableholder.AddView((android.view.View)(__ref._tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
__ref._tablefooter.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
__ref._tableheader.AddView((android.view.View)(__ref._tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2621469;
 //BA.debugLineNum = 2621469;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Dim tableofrequests As MiScrollView";
_tableofrequests = new wrappers.MiScrollView();
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="Dim SelectedTasks As Map";
_selectedtasks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="Dim RefreshTimer As Timer";
_refreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "get_tasks"))
	return (String) Debug.delegate(ba, "get_tasks", null);
int _i = 0;
b4a.example.types._task _task = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub Get_Tasks";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Task.Initialize";
_task.Initialize();
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Task.TaskInfo = \"This is a very long text that i";
_task.TaskInfo = "This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"+BA.NumberToString(_i);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
__ref._taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="End Sub";
return "";
}
public String  _refresh_tick(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "refresh_tick"))
	return (String) Debug.delegate(ba, "refresh_tick", null);
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub Refresh_Tick";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="If Main.currentuser.available = True  Then";
if (_main._currentuser.available==__c.True) { 
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="buildTasks";
__ref._buildtasks(null);
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="submit.Enabled = True";
__ref._submit.setEnabled(__c.True);
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Log(\"_TABLE REFRESHED_\")";
__c.Log("_TABLE REFRESHED_");
 };
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return "";
}
public String  _submit_click(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "submit_click"))
	return (String) Debug.delegate(ba, "submit_click", null);
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Submit_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="If SelectedTasks.Size > 0 Then";
if (__ref._selectedtasks.getSize()>0) { 
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(__ref._selectedtasks));
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"SetUserBusy");
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"LoadMyTasks",(Object)(__ref._selectedtasks));
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="SelectedTasks.Clear";
__ref._selectedtasks.Clear();
 }else {
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="ToastMessageShow(\"Please select a task to contin";
__c.ToastMessageShow(BA.ObjectToCharSequence("Please select a task to continue!"),__c.False);
 };
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="End Sub";
return "";
}
}