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
public anywheresoftware.b4a.objects.ScrollViewWrapper _tableofrequests = null;
public anywheresoftware.b4a.objects.ButtonWrapper _submit = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _refreshbtngraphic = null;
public anywheresoftware.b4a.objects.ButtonWrapper _tasksrefreshbtn = null;
public anywheresoftware.b4a.objects.collections.Map _mapoftaskviews = null;
public int _boxchecked = 0;
public anywheresoftware.b4a.objects.collections.Map _selectedtasks = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public String  _initialize(b4a.example.tasktable __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="TasksList.Initialize";
__ref._taskslist.Initialize();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="tableHolder.Initialize(\"table\")";
__ref._tableholder.Initialize(ba,"table");
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="tableHeader.Initialize(\"Header\")";
__ref._tableheader.Initialize(ba,"Header");
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="tableFooter.Initialize(\"Footer\")";
__ref._tablefooter.Initialize(ba,"Footer");
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="tableType.Initialize(\"type\")";
__ref._tabletype.Initialize(ba,"type");
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
__ref._refreshbtngraphic.Initialize(__c.File.getDirAssets(),"refresh.png");
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
__ref._tasksrefreshbtn.Initialize(ba,"refreshtask");
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="submit.Initialize(\"Submit\")";
__ref._submit.Initialize(ba,"Submit");
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="tableofrequests.Initialize(150%y)";
__ref._tableofrequests.Initialize(ba,__c.PerYToCurrent((float) (150),ba));
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="mapoftaskviews.Initialize";
__ref._mapoftaskviews.Initialize();
RDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="SelectedTasks.Initialize";
__ref._selectedtasks.Initialize();
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="Get_Tasks";
__ref._get_tasks(null);
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return null;
}
public String  _accept_checkedchange(b4a.example.tasktable __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "accept_checkedchange"))
	return (String) Debug.delegate(ba, "accept_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
int _x = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="If boxchecked < 3 Then";
if (__ref._boxchecked<3) { 
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._mapoftaskviews.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v.setObject((android.view.ViewGroup)(group4.Get(index4)));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="SelectedTasks.Put(TasksList.GetKeyAt(v.Tag),";
__ref._selectedtasks.Put(__ref._taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag()))),__ref._taskslist.Get(__ref._taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="boxchecked = boxchecked + 1";
__ref._boxchecked = (int) (__ref._boxchecked+1);
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(__ref._boxchecked));
 }else {
RDebugUtils.currentLine=3211281;
 //BA.debugLineNum = 3211281;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
RDebugUtils.currentLine=3211287;
 //BA.debugLineNum = 3211287;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=3211289;
 //BA.debugLineNum = 3211289;BA.debugLine="For  x = 0 To SelectedTasks.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._selectedtasks.getSize()-1);
_x = (int) (0) ;
for (;(step18 > 0 && _x <= limit18) || (step18 < 0 && _x >= limit18) ;_x = ((int)(0 + _x + step18))  ) {
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="If cbox.Tag = x Then";
if ((_cbox.getTag()).equals((Object)(_x))) { 
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="SelectedTasks.Remove(SelectedTasks.GetKeyAt(cb";
__ref._selectedtasks.Remove(__ref._selectedtasks.GetKeyAt((int)(BA.ObjectToNumber(_cbox.getTag()))));
 };
 }
};
RDebugUtils.currentLine=3211296;
 //BA.debugLineNum = 3211296;BA.debugLine="boxchecked = boxchecked - 1";
__ref._boxchecked = (int) (__ref._boxchecked-1);
 };
RDebugUtils.currentLine=3211300;
 //BA.debugLineNum = 3211300;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2621441;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
__ref._tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
__ref._tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="tableType.Gravity = Gravity.CENTER";
__ref._tabletype.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="submit.Text = \"Accept\"";
__ref._submit.setText(BA.ObjectToCharSequence("Accept"));
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
__ref._tasksrefreshbtn.SetBackgroundImageNew((android.graphics.Bitmap)(__ref._refreshbtngraphic.getObject()));
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="tableType.TextColor = Colors.White";
__ref._tabletype.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="tableType.TextSize = 25";
__ref._tabletype.setTextSize((float) (25));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="tableType.Text = \"Workers Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else 
{RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
if (_main._currentuser.TypeOfWorker==2) { 
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="tableType.Text = \"Cooks Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else 
{RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
if (_main._currentuser.TypeOfWorker==3) { 
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="tableType.Text = \"Waiters Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
RDebugUtils.currentLine=2621458;
 //BA.debugLineNum = 2621458;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
__ref._wholescreen.AddView((android.view.View)(__ref._tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
RDebugUtils.currentLine=2621459;
 //BA.debugLineNum = 2621459;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
__ref._tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
__ref._tableholder.AddView((android.view.View)(__ref._tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="tableHolder.AddView(tableofrequests,0%x,tableHead";
__ref._tableholder.AddView((android.view.View)(__ref._tableofrequests.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__ref._tableheader.getTop()+__ref._tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
__ref._tableholder.AddView((android.view.View)(__ref._tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=2621463;
 //BA.debugLineNum = 2621463;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
__ref._tablefooter.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=2621464;
 //BA.debugLineNum = 2621464;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
__ref._tableheader.AddView((android.view.View)(__ref._tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
__ref._tableheader.AddView((android.view.View)(__ref._tasksrefreshbtn.getObject()),__c.PerXToCurrent((float) (73),ba),(int) (0),__c.PerXToCurrent((float) (8),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Dim tableofrequests As ScrollView";
_tableofrequests = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="Dim refreshbtngraphic As Bitmap";
_refreshbtngraphic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Dim TasksRefreshBtn As Button";
_tasksrefreshbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Dim SelectedTasks As Map";
_selectedtasks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "get_tasks"))
	return (String) Debug.delegate(ba, "get_tasks", null);
int _i = 0;
b4a.example.types._task _task = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub Get_Tasks";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Task.Initialize";
_task.Initialize();
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Task.TaskInfo = \"Test on Task->\"&i";
_task.TaskInfo = "Test on Task->"+BA.NumberToString(_i);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
__ref._taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="End Sub";
return "";
}
public String  _refreshtask_click(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "refreshtask_click"))
	return (String) Debug.delegate(ba, "refreshtask_click", null);
int _p = 0;
b4a.example.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub refreshtask_Click";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="submit.Enabled = True";
__ref._submit.setEnabled(__c.True);
 };
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="tableofrequests.Panel.RemoveAllViews";
__ref._tableofrequests.getPanel().RemoveAllViews();
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group9 = __ref._taskslist.Values();
final int groupLen9 = group9.getSize()
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_i = (b4a.example.types._task)(group9.Get(index9));
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
RDebugUtils.currentLine=3145747;
 //BA.debugLineNum = 3145747;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
RDebugUtils.currentLine=3145749;
 //BA.debugLineNum = 3145749;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
RDebugUtils.currentLine=3145751;
 //BA.debugLineNum = 3145751;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145753;
 //BA.debugLineNum = 3145753;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145757;
 //BA.debugLineNum = 3145757;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
RDebugUtils.currentLine=3145758;
 //BA.debugLineNum = 3145758;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145759;
 //BA.debugLineNum = 3145759;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
RDebugUtils.currentLine=3145760;
 //BA.debugLineNum = 3145760;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145761;
 //BA.debugLineNum = 3145761;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145763;
 //BA.debugLineNum = 3145763;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3145765;
 //BA.debugLineNum = 3145765;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
RDebugUtils.currentLine=3145766;
 //BA.debugLineNum = 3145766;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145767;
 //BA.debugLineNum = 3145767;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145770;
 //BA.debugLineNum = 3145770;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3145771;
 //BA.debugLineNum = 3145771;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145773;
 //BA.debugLineNum = 3145773;BA.debugLine="TaskPanel.Color = Colors.DarkGray";
_taskpanel.setColor(__c.Colors.DarkGray);
RDebugUtils.currentLine=3145774;
 //BA.debugLineNum = 3145774;BA.debugLine="tableofrequests.Panel.AddView(TaskPanel,0,(5%y+";
__ref._tableofrequests.getPanel().AddView((android.view.View)(_taskpanel.getObject()),(int) (0),(int) ((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (2)))*_p),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3145775;
 //BA.debugLineNum = 3145775;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
RDebugUtils.currentLine=3145776;
 //BA.debugLineNum = 3145776;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
RDebugUtils.currentLine=3145777;
 //BA.debugLineNum = 3145777;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
RDebugUtils.currentLine=3145778;
 //BA.debugLineNum = 3145778;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
__ref._mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
RDebugUtils.currentLine=3145782;
 //BA.debugLineNum = 3145782;BA.debugLine="End Sub";
return "";
}
public String  _submit_click(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "submit_click"))
	return (String) Debug.delegate(ba, "submit_click", null);
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub Submit_Click";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(__ref._selectedtasks));
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="End Sub";
return "";
}
}