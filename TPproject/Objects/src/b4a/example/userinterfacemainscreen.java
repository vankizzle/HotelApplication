package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class userinterfacemainscreen extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.userinterfacemainscreen");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public anywheresoftware.b4a.objects.collections.Map _taskslist = null;
public anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _availability = null;
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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public String  _accept_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 171;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 172;BA.debugLine="If boxchecked < 3 Then";
if (_boxchecked<3) { 
 //BA.debugLineNum = 174;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 175;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _mapoftaskviews.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_v.setObject((android.view.ViewGroup)(group4.Get(index4)));
 //BA.debugLineNum = 176;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
 //BA.debugLineNum = 177;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Tag,";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
 };
 }
};
 //BA.debugLineNum = 186;BA.debugLine="boxchecked = boxchecked + 1";
_boxchecked = (int) (_boxchecked+1);
 //BA.debugLineNum = 188;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(_boxchecked));
 }else {
 //BA.debugLineNum = 190;BA.debugLine="Checked = False";
_checked = __c.False;
 //BA.debugLineNum = 191;BA.debugLine="boxchecked = boxchecked - 1";
_boxchecked = (int) (_boxchecked-1);
 };
 }else {
 //BA.debugLineNum = 195;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
 //BA.debugLineNum = 196;BA.debugLine="Log(\"Cant accept more\")";
__c.Log("Cant accept more");
 };
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 92;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public String  _avail_click() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub avail_Click";
 //BA.debugLineNum = 106;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 107;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
 }else {
 //BA.debugLineNum = 109;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
 };
 //BA.debugLineNum = 112;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 113;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 115;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 48;BA.debugLine="usernamelbl.Textcolor = Colors.White";
_usernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 49;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 50;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
_usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 51;BA.debugLine="usernamelbl.TextSize = 30";
_usernamelbl.setTextSize((float) (30));
 //BA.debugLineNum = 52;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%";
_wholescreen.AddView((android.view.View)(_usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 54;BA.debugLine="availability.TextColor = Colors.White";
_availability.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 55;BA.debugLine="availability.Gravity = Gravity.CENTER";
_availability.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 56;BA.debugLine="availability.TextSize = 25";
_availability.setTextSize((float) (25));
 //BA.debugLineNum = 57;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 58;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 60;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 62;BA.debugLine="wholescreen.AddView(availability,40%x,5%y,50%x,10";
_wholescreen.AddView((android.view.View)(_availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 64;BA.debugLine="HelperFunctions1.Apply_ViewStyle(tableHeader,Colo";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_tableheader.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.White,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (0));
 //BA.debugLineNum = 65;BA.debugLine="HelperFunctions1.Apply_ViewStyle(tableFooter,Colo";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_tablefooter.getObject())),__c.Colors.Black,__c.Colors.White,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.Gray,__c.Colors.RGB((int) (255),(int) (191),(int) (0)),__c.Colors.Gray,__c.Colors.Gray,(int) (0));
 //BA.debugLineNum = 66;BA.debugLine="tableType.Gravity = Gravity.CENTER";
_tabletype.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 68;BA.debugLine="submit.Text = \"Accept\"";
_submit.setText(BA.ObjectToCharSequence("Accept"));
 //BA.debugLineNum = 69;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 71;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
_tasksrefreshbtn.SetBackgroundImage((android.graphics.Bitmap)(_refreshbtngraphic.getObject()));
 //BA.debugLineNum = 72;BA.debugLine="tableType.TextColor = Colors.Black";
_tabletype.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 73;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
 //BA.debugLineNum = 74;BA.debugLine="tableType.Text = \"Workers Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else if(_main._currentuser.TypeOfWorker==2) { 
 //BA.debugLineNum = 76;BA.debugLine="tableType.Text = \"Cooks Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else if(_main._currentuser.TypeOfWorker==3) { 
 //BA.debugLineNum = 78;BA.debugLine="tableType.Text = \"Waiters Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 };
 //BA.debugLineNum = 81;BA.debugLine="wholescreen.AddView(tableHolder,10%x,15%y,80%x,70";
_wholescreen.AddView((android.view.View)(_tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
 //BA.debugLineNum = 82;BA.debugLine="tableofrequests.Color = Colors.White";
_tableofrequests.setColor(__c.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="tableHolder.AddView(tableofrequests,0%x,5%y,100%x";
_tableholder.AddView((android.view.View)(_tableofrequests.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (95),ba));
 //BA.debugLineNum = 84;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
_tableholder.AddView((android.view.View)(_tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 85;BA.debugLine="tableHolder.AddView(tableFooter,0%x,64%y,100%x,6%";
_tableholder.AddView((android.view.View)(_tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (64),ba),__c.PerXToCurrent((float) (100),ba),(int) (__c.PerYToCurrent((float) (6),ba)+__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 86;BA.debugLine="tableHolder.AddView(submit,20%x,65%y,40%x,5%y - 2";
_tableholder.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (65),ba),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (5),ba)-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 87;BA.debugLine="tableHeader.AddView(tableType,0,0,20%x,5%y)";
_tableheader.AddView((android.view.View)(_tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 88;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
_tableheader.AddView((android.view.View)(_tasksrefreshbtn.getObject()),__c.PerXToCurrent((float) (73),ba),(int) (0),__c.PerXToCurrent((float) (8),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim tableofrequests As ScrollView";
_tableofrequests = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim refreshbtngraphic As Bitmap";
_refreshbtngraphic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim TasksRefreshBtn As Button";
_tasksrefreshbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 20;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks() throws Exception{
int _i = 0;
b4a.example.types._task _task = null;
 //BA.debugLineNum = 94;BA.debugLine="Sub Get_Tasks";
 //BA.debugLineNum = 95;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
 //BA.debugLineNum = 96;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
 //BA.debugLineNum = 97;BA.debugLine="Task.Initialize";
_task.Initialize();
 //BA.debugLineNum = 98;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
 //BA.debugLineNum = 99;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
 //BA.debugLineNum = 100;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
 //BA.debugLineNum = 101;BA.debugLine="Task.TaskInfo = \"Test task,just ignore it,dont w";
_task.TaskInfo = "Test task,just ignore it,dont worry you are free for now ;)";
 //BA.debugLineNum = 102;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
_taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 25;BA.debugLine="wholescreen.Initialize(\"screenview\")";
_wholescreen.Initialize(ba,"screenview");
 //BA.debugLineNum = 26;BA.debugLine="wholescreen.Color =  Colors.rgb(0, 138, 230)";
_wholescreen.setColor(__c.Colors.RGB((int) (0),(int) (138),(int) (230)));
 //BA.debugLineNum = 28;BA.debugLine="TasksList.Initialize";
_taskslist.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="tableHolder.Initialize(\"table\")";
_tableholder.Initialize(ba,"table");
 //BA.debugLineNum = 31;BA.debugLine="tableHeader.Initialize(\"Header\")";
_tableheader.Initialize(ba,"Header");
 //BA.debugLineNum = 32;BA.debugLine="tableFooter.Initialize(\"Footer\")";
_tablefooter.Initialize(ba,"Footer");
 //BA.debugLineNum = 33;BA.debugLine="tableType.Initialize(\"type\")";
_tabletype.Initialize(ba,"type");
 //BA.debugLineNum = 34;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
_refreshbtngraphic.Initialize(__c.File.getDirAssets(),"refresh.png");
 //BA.debugLineNum = 35;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
_tasksrefreshbtn.Initialize(ba,"refreshtask");
 //BA.debugLineNum = 36;BA.debugLine="usernamelbl.Initialize(\"username\")";
_usernamelbl.Initialize(ba,"username");
 //BA.debugLineNum = 37;BA.debugLine="availability.Initialize(\"avail\")";
_availability.Initialize(ba,"avail");
 //BA.debugLineNum = 38;BA.debugLine="submit.Initialize(\"Submit\")";
_submit.Initialize(ba,"Submit");
 //BA.debugLineNum = 40;BA.debugLine="tableofrequests.Initialize(150%y)";
_tableofrequests.Initialize(ba,__c.PerYToCurrent((float) (150),ba));
 //BA.debugLineNum = 41;BA.debugLine="mapoftaskviews.Initialize";
_mapoftaskviews.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 44;BA.debugLine="Get_Tasks";
_get_tasks();
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _refreshtask_click() throws Exception{
int _p = 0;
b4a.example.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
 //BA.debugLineNum = 120;BA.debugLine="Sub refreshtask_Click";
 //BA.debugLineNum = 121;BA.debugLine="tableofrequests.Panel.RemoveAllViews";
_tableofrequests.getPanel().RemoveAllViews();
 //BA.debugLineNum = 122;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
 //BA.debugLineNum = 123;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _taskslist.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_i = (b4a.example.types._task)(group3.Get(index3));
 //BA.debugLineNum = 124;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
 //BA.debugLineNum = 125;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 126;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 127;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 128;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 129;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 131;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
 //BA.debugLineNum = 132;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
 //BA.debugLineNum = 133;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
 //BA.debugLineNum = 134;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
 //BA.debugLineNum = 135;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
 //BA.debugLineNum = 137;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
 //BA.debugLineNum = 138;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 139;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
 //BA.debugLineNum = 140;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 141;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 143;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
 //BA.debugLineNum = 144;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 145;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
 //BA.debugLineNum = 146;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 147;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 149;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
 //BA.debugLineNum = 150;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 151;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
 //BA.debugLineNum = 152;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 153;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 156;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 157;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 159;BA.debugLine="TaskPanel.Color = Colors.DarkGray";
_taskpanel.setColor(__c.Colors.DarkGray);
 //BA.debugLineNum = 160;BA.debugLine="tableofrequests.Panel.AddView(TaskPanel,0,(5%y+";
_tableofrequests.getPanel().AddView((android.view.View)(_taskpanel.getObject()),(int) (0),(int) ((__c.PerYToCurrent((float) (5),ba)+__c.DipToCurrent((int) (2)))*_p),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 161;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
 //BA.debugLineNum = 162;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
 //BA.debugLineNum = 163;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
 //BA.debugLineNum = 164;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
_mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
