package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tasktable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.tasktable");
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public String  _accept_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
 //BA.debugLineNum = 150;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 151;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 154;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 156;BA.debugLine="RefreshTimer.Enabled = False";
_refreshtimer.setEnabled(__c.False);
 //BA.debugLineNum = 157;BA.debugLine="If boxchecked < 3 Then";
if (_boxchecked<3) { 
 //BA.debugLineNum = 158;BA.debugLine="boxchecked = boxchecked + 1";
_boxchecked = (int) (_boxchecked+1);
 //BA.debugLineNum = 159;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(_boxchecked));
 //BA.debugLineNum = 160;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _mapoftaskviews.Values();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject((android.view.ViewGroup)(group7.Get(index7)));
 //BA.debugLineNum = 161;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
 //BA.debugLineNum = 162;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
 //BA.debugLineNum = 163;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
_selectedtasks.Put(_cbox.getTag(),_taskslist.Get(_taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
 }else {
 //BA.debugLineNum = 167;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
 //BA.debugLineNum = 168;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
 //BA.debugLineNum = 173;BA.debugLine="Checked = False";
_checked = __c.False;
 //BA.debugLineNum = 174;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
_selectedtasks.Remove(_cbox.getTag());
 //BA.debugLineNum = 175;BA.debugLine="boxchecked = boxchecked - 1";
_boxchecked = (int) (_boxchecked-1);
 //BA.debugLineNum = 176;BA.debugLine="If boxchecked = 0 Then";
if (_boxchecked==0) { 
 //BA.debugLineNum = 177;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 };
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 47;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _buildtasks() throws Exception{
int _p = 0;
b4a.example.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
 //BA.debugLineNum = 98;BA.debugLine="Sub buildTasks";
 //BA.debugLineNum = 100;BA.debugLine="tableofrequests.removeAllViews";
_tableofrequests.removeAllViews();
 //BA.debugLineNum = 101;BA.debugLine="boxchecked = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 102;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
 //BA.debugLineNum = 103;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = _taskslist.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (b4a.example.types._task)(group4.Get(index4));
 //BA.debugLineNum = 104;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
 //BA.debugLineNum = 105;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 106;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 108;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 109;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 111;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
 //BA.debugLineNum = 112;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
 //BA.debugLineNum = 113;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
 //BA.debugLineNum = 114;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
 //BA.debugLineNum = 115;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
 //BA.debugLineNum = 117;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
 //BA.debugLineNum = 118;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 119;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
 //BA.debugLineNum = 120;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 121;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 123;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
 //BA.debugLineNum = 124;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 125;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
 //BA.debugLineNum = 126;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 127;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 129;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
 //BA.debugLineNum = 130;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 131;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
 //BA.debugLineNum = 132;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 133;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 136;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 137;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 139;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
_taskpanel.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 140;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
_tableofrequests.addView((android.view.View)(_taskpanel.getObject()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 142;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
 //BA.debugLineNum = 143;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
 //BA.debugLineNum = 144;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
 //BA.debugLineNum = 145;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
_mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 57;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
_taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 58;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
_tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 59;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
_tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 60;BA.debugLine="tableType.Gravity = Gravity.CENTER";
_tabletype.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 61;BA.debugLine="submit.Text = \"Accept\"";
_submit.setText(BA.ObjectToCharSequence("Accept"));
 //BA.debugLineNum = 62;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 66;BA.debugLine="tableType.TextColor = Colors.White";
_tabletype.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 67;BA.debugLine="tableType.TextSize = 25";
_tabletype.setTextSize((float) (25));
 //BA.debugLineNum = 68;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
 //BA.debugLineNum = 69;BA.debugLine="tableType.Text = \"Workers Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else if(_main._currentuser.TypeOfWorker==2) { 
 //BA.debugLineNum = 71;BA.debugLine="tableType.Text = \"Cooks Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else if(_main._currentuser.TypeOfWorker==3) { 
 //BA.debugLineNum = 73;BA.debugLine="tableType.Text = \"Waiters Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 };
 //BA.debugLineNum = 76;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
_wholescreen.AddView((android.view.View)(_tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
 //BA.debugLineNum = 77;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
_tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 78;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
_tableholder.AddView((android.view.View)(_tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 80;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
_tableholder.AddView(_tableofrequests.getScrollView(),__c.PerXToCurrent((float) (0),ba),(int) (_tableheader.getTop()+_tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 81;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
_tableholder.AddView((android.view.View)(_tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
 //BA.debugLineNum = 82;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
_tablefooter.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 83;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
_tableheader.AddView((android.view.View)(_tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim tableofrequests As MiScrollView";
_tableofrequests = new wrappers.MiScrollView();
 //BA.debugLineNum = 9;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 15;BA.debugLine="Dim SelectedTasks As Map";
_selectedtasks = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim RefreshTimer As Timer";
_refreshtimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks() throws Exception{
int _i = 0;
b4a.example.types._task _task = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub Get_Tasks";
 //BA.debugLineNum = 88;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
 //BA.debugLineNum = 89;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
 //BA.debugLineNum = 90;BA.debugLine="Task.Initialize";
_task.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
 //BA.debugLineNum = 92;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
 //BA.debugLineNum = 93;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
 //BA.debugLineNum = 94;BA.debugLine="Task.TaskInfo = \"This is a very long text that i";
_task.TaskInfo = "This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"+BA.NumberToString(_i);
 //BA.debugLineNum = 95;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
_taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 24;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="TasksList.Initialize";
_taskslist.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="tableHolder.Initialize(\"table\")";
_tableholder.Initialize(ba,"table");
 //BA.debugLineNum = 27;BA.debugLine="tableHeader.Initialize(\"Header\")";
_tableheader.Initialize(ba,"Header");
 //BA.debugLineNum = 28;BA.debugLine="tableFooter.Initialize(\"Footer\")";
_tablefooter.Initialize(ba,"Footer");
 //BA.debugLineNum = 29;BA.debugLine="tableType.Initialize(\"type\")";
_tabletype.Initialize(ba,"type");
 //BA.debugLineNum = 32;BA.debugLine="submit.Initialize(\"Submit\")";
_submit.Initialize(ba,"Submit");
 //BA.debugLineNum = 33;BA.debugLine="tableofrequests.Initialize";
_tableofrequests.Initialize(ba);
 //BA.debugLineNum = 34;BA.debugLine="mapoftaskviews.Initialize";
_mapoftaskviews.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="SelectedTasks.Initialize";
_selectedtasks.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="TaskFakePan.initialize(\"\")";
_taskfakepan.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",2000)";
_refreshtimer.Initialize(ba,"Refresh",(long) (2000));
 //BA.debugLineNum = 40;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 42;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 43;BA.debugLine="Get_Tasks";
_get_tasks();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _refresh_tick() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub Refresh_Tick";
 //BA.debugLineNum = 50;BA.debugLine="If Main.currentuser.available = True  Then";
if (_main._currentuser.available==__c.True) { 
 //BA.debugLineNum = 51;BA.debugLine="buildTasks";
_buildtasks();
 //BA.debugLineNum = 52;BA.debugLine="submit.Enabled = True";
_submit.setEnabled(__c.True);
 //BA.debugLineNum = 53;BA.debugLine="Log(\"_TABLE REFRESHED_\")";
__c.Log("_TABLE REFRESHED_");
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _submit_click() throws Exception{
int _i = 0;
b4a.example.types._task _v = null;
 //BA.debugLineNum = 182;BA.debugLine="Sub Submit_Click";
 //BA.debugLineNum = 183;BA.debugLine="If SelectedTasks.Size > 0 Then";
if (_selectedtasks.getSize()>0) { 
 //BA.debugLineNum = 184;BA.debugLine="boxchecked = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 185;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 186;BA.debugLine="submit.Enabled = False";
_submit.setEnabled(__c.False);
 //BA.debugLineNum = 187;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 189;BA.debugLine="For Each v As Task In SelectedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group6 = _selectedtasks.Values();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (b4a.example.types._task)(group6.Get(index6));
 //BA.debugLineNum = 190;BA.debugLine="Main.currentuser.CurrentTaskID(i) = v.TaskID";
_main._currentuser.CurrentTaskID[_i] = _v.TaskID;
 //BA.debugLineNum = 191;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 //BA.debugLineNum = 194;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(_selectedtasks));
 //BA.debugLineNum = 195;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"SetUserBusy");
 //BA.debugLineNum = 196;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"LoadMyTasks",(Object)(_selectedtasks));
 //BA.debugLineNum = 197;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
 //BA.debugLineNum = 198;BA.debugLine="SelectedTasks.Clear";
_selectedtasks.Clear();
 }else {
 //BA.debugLineNum = 200;BA.debugLine="ToastMessageShow(\"Please select a task to contin";
__c.ToastMessageShow(BA.ObjectToCharSequence("Please select a task to continue!"),__c.False);
 };
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
