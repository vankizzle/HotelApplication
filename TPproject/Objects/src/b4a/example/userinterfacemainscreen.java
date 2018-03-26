package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class userinterfacemainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.userinterfacemainscreen");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.userinterfacemainscreen.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _availability = null;
public anywheresoftware.b4a.objects.PanelWrapper _tableholder = null;
public anywheresoftware.b4a.objects.PanelWrapper _tableheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _tabletype = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _tableofrequests = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _refreshbtngraphic = null;
public anywheresoftware.b4a.objects.ButtonWrapper _tasksrefreshbtn = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public String  _initialize(b4a.example.userinterfacemainscreen __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="wholescreen.Initialize(\"screenview\")";
__ref._wholescreen.Initialize(ba,"screenview");
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="wholescreen.Color = Colors.Black";
__ref._wholescreen.setColor(__c.Colors.Black);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="TasksList.Initialize";
__ref._taskslist.Initialize();
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="tableHolder.Initialize(\"table\")";
__ref._tableholder.Initialize(ba,"table");
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="tableHeader.Initialize(\"Header\")";
__ref._tableheader.Initialize(ba,"Header");
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="tableType.Initialize(\"type\")";
__ref._tabletype.Initialize(ba,"type");
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
__ref._refreshbtngraphic.Initialize(__c.File.getDirAssets(),"refresh.png");
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
__ref._tasksrefreshbtn.Initialize(ba,"refreshtask");
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="usernamelbl.Initialize(\"username\")";
__ref._usernamelbl.Initialize(ba,"username");
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="availability.Initialize(\"avail\")";
__ref._availability.Initialize(ba,"avail");
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="tableofrequests.Initialize(150%y)";
__ref._tableofrequests.Initialize(ba,__c.PerYToCurrent((float) (150),ba));
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Get_Tasks";
__ref._get_tasks(null);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub AsView As Panel";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Return wholescreen";
if (true) return __ref._wholescreen;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return null;
}
public String  _avail_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "avail_click"))
	return (String) Debug.delegate(ba, "avail_click", null);
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub avail_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
 }else {
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
 };
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="usernamelbl.Textcolor = Colors.White";
__ref._usernamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
__ref._usernamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
__ref._usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="usernamelbl.TextSize = 30";
__ref._usernamelbl.setTextSize((float) (30));
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%";
__ref._wholescreen.AddView((android.view.View)(__ref._usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="availability.TextColor = Colors.White";
__ref._availability.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="availability.Gravity = Gravity.CENTER";
__ref._availability.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="availability.TextSize = 25";
__ref._availability.setTextSize((float) (25));
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="availability.Text = \"Status: Busy\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="availability.Text = \"Status: Available\"";
__ref._availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="wholescreen.AddView(availability,40%x,5%y,50%x,10";
__ref._wholescreen.AddView((android.view.View)(__ref._availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="tableHeader.Color = Colors.DarkGray";
__ref._tableheader.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="tableType.Gravity = Gravity.CENTER";
__ref._tabletype.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
__ref._tasksrefreshbtn.SetBackgroundImage((android.graphics.Bitmap)(__ref._refreshbtngraphic.getObject()));
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="tableType.Text = \"Workers Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else 
{RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
if (_main._currentuser.TypeOfWorker==2) { 
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="tableType.Text = \"Cooks Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else 
{RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
if (_main._currentuser.TypeOfWorker==3) { 
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="tableType.Text = \"Waiters Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="wholescreen.AddView(tableHolder,10%x,15%y,80%x,70";
__ref._wholescreen.AddView((android.view.View)(__ref._tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="tableofrequests.Color = Colors.White";
__ref._tableofrequests.setColor(__c.Colors.White);
RDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="tableHolder.AddView(tableofrequests,0%x,5%y,100%x";
__ref._tableholder.AddView((android.view.View)(__ref._tableofrequests.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
__ref._tableholder.AddView((android.view.View)(__ref._tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="tableHeader.AddView(tableType,0,0,20%x,5%y)";
__ref._tableheader.AddView((android.view.View)(__ref._tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
__ref._tableheader.AddView((android.view.View)(__ref._tasksrefreshbtn.getObject()),__c.PerXToCurrent((float) (73),ba),(int) (0),__c.PerXToCurrent((float) (8),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim tableofrequests As ScrollView";
_tableofrequests = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim refreshbtngraphic As Bitmap";
_refreshbtngraphic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim TasksRefreshBtn As Button";
_tasksrefreshbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
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
 //BA.debugLineNum = 2686983;BA.debugLine="Task.TaskInfo = \"Test task,just ignore it,dont w";
_task.TaskInfo = "Test task,just ignore it,dont worry you are free for now ;)";
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
__ref._taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="End Sub";
return "";
}
public String  _refreshtask_click(b4a.example.userinterfacemainscreen __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="userinterfacemainscreen";
if (Debug.shouldDelegate(ba, "refreshtask_click"))
	return (String) Debug.delegate(ba, "refreshtask_click", null);
int _p = 0;
b4a.example.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub refreshtask_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="tableofrequests.Panel.RemoveAllViews";
__ref._tableofrequests.getPanel().RemoveAllViews();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._taskslist.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_i = (b4a.example.types._task)(group3.Get(index3));
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
RDebugUtils.currentLine=2031633;
 //BA.debugLineNum = 2031633;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
RDebugUtils.currentLine=2031637;
 //BA.debugLineNum = 2031637;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
RDebugUtils.currentLine=2031643;
 //BA.debugLineNum = 2031643;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2031644;
 //BA.debugLineNum = 2031644;BA.debugLine="TaskPanel.AddView(taskInfoLbl,20%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="TaskPanel.Color = Colors.LightGray";
_taskpanel.setColor(__c.Colors.LightGray);
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="tableofrequests.Panel.AddView(TaskPanel,0,(5%y*";
__ref._tableofrequests.getPanel().AddView((android.view.View)(_taskpanel.getObject()),(int) (0),(int) ((__c.PerYToCurrent((float) (5),ba)*_p)+__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
 };
 }
};
RDebugUtils.currentLine=2031651;
 //BA.debugLineNum = 2031651;BA.debugLine="End Sub";
return "";
}
}