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
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="TasksList.Initialize";
__ref._taskslist.Initialize();
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="tableHolder.Initialize(\"table\")";
__ref._tableholder.Initialize(ba,"table");
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="tableHeader.Initialize(\"Header\")";
__ref._tableheader.Initialize(ba,"Header");
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="tableFooter.Initialize(\"Footer\")";
__ref._tablefooter.Initialize(ba,"Footer");
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="tableType.Initialize(\"type\")";
__ref._tabletype.Initialize(ba,"type");
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="submit.Initialize(\"Submit\")";
__ref._submit.Initialize(ba,"Submit");
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="tableofrequests.Initialize";
__ref._tableofrequests.Initialize(ba);
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="mapoftaskviews.Initialize";
__ref._mapoftaskviews.Initialize();
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="SelectedTasks.Initialize";
__ref._selectedtasks.Initialize();
RDebugUtils.currentLine=3080206;
 //BA.debugLineNum = 3080206;BA.debugLine="TaskFakePan.initialize(\"\")";
__ref._taskfakepan.Initialize(ba,"");
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",2000)";
__ref._refreshtimer.Initialize(ba,"Refresh",(long) (2000));
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=3080212;
 //BA.debugLineNum = 3080212;BA.debugLine="Get_Tasks";
__ref._get_tasks(null);
RDebugUtils.currentLine=3080213;
 //BA.debugLineNum = 3080213;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return null;
}
public String  _accept_checkedchange(b4a.example.tasktable __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "accept_checkedchange"))
	return (String) Debug.delegate(ba, "accept_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="RefreshTimer.Enabled = False";
__ref._refreshtimer.setEnabled(__c.False);
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If boxchecked < 3 Then";
if (__ref._boxchecked<3) { 
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="boxchecked = boxchecked + 1";
__ref._boxchecked = (int) (__ref._boxchecked+1);
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(__ref._boxchecked));
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._mapoftaskviews.Values();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject((android.view.ViewGroup)(group7.Get(index7)));
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
RDebugUtils.currentLine=3473420;
 //BA.debugLineNum = 3473420;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
__ref._selectedtasks.Put(_cbox.getTag(),__ref._taskslist.Get(__ref._taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
 }else {
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=3473432;
 //BA.debugLineNum = 3473432;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
__ref._selectedtasks.Remove(_cbox.getTag());
RDebugUtils.currentLine=3473433;
 //BA.debugLineNum = 3473433;BA.debugLine="boxchecked = boxchecked - 1";
__ref._boxchecked = (int) (__ref._boxchecked-1);
RDebugUtils.currentLine=3473434;
 //BA.debugLineNum = 3473434;BA.debugLine="If boxchecked = 0 Then";
if (__ref._boxchecked==0) { 
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
 };
 };
RDebugUtils.currentLine=3473438;
 //BA.debugLineNum = 3473438;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub buildTasks";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="tableofrequests.removeAllViews";
__ref._tableofrequests.removeAllViews();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="For Each i As Task In TasksList.Values";
{
final anywheresoftware.b4a.BA.IterableList group4 = __ref._taskslist.Values();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (b4a.example.types._task)(group4.Get(index4));
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="If i.TaskType = Main.currentuser.TypeOfWorker Th";
if (_i.TaskType==_main._currentuser.TypeOfWorker) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3407893;
 //BA.debugLineNum = 3407893;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="TaskNameLbl.Text = i.TaskName";
_tasknamelbl.setText(BA.ObjectToCharSequence(_i.TaskName));
RDebugUtils.currentLine=3407898;
 //BA.debugLineNum = 3407898;BA.debugLine="TaskNameLbl.TextColor = Colors.White";
_tasknamelbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="TaskNameLbl.TextSize = 15";
_tasknamelbl.setTextSize((float) (15));
RDebugUtils.currentLine=3407900;
 //BA.debugLineNum = 3407900;BA.debugLine="TaskNameLbl.Gravity = Gravity.CENTER";
_tasknamelbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3407901;
 //BA.debugLineNum = 3407901;BA.debugLine="TaskPanel.AddView(TaskNameLbl,10%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_tasknamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3407903;
 //BA.debugLineNum = 3407903;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
RDebugUtils.currentLine=3407904;
 //BA.debugLineNum = 3407904;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3407905;
 //BA.debugLineNum = 3407905;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
RDebugUtils.currentLine=3407906;
 //BA.debugLineNum = 3407906;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3407907;
 //BA.debugLineNum = 3407907;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3407910;
 //BA.debugLineNum = 3407910;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3407911;
 //BA.debugLineNum = 3407911;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3407913;
 //BA.debugLineNum = 3407913;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
_taskpanel.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=3407914;
 //BA.debugLineNum = 3407914;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
__ref._tableofrequests.addView((android.view.View)(_taskpanel.getObject()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=3407916;
 //BA.debugLineNum = 3407916;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
RDebugUtils.currentLine=3407917;
 //BA.debugLineNum = 3407917;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
RDebugUtils.currentLine=3407918;
 //BA.debugLineNum = 3407918;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
RDebugUtils.currentLine=3407919;
 //BA.debugLineNum = 3407919;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
__ref._mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
RDebugUtils.currentLine=3407923;
 //BA.debugLineNum = 3407923;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
__ref._taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
__ref._tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
__ref._tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="tableType.Gravity = Gravity.CENTER";
__ref._tabletype.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="submit.Text = \"Accept\"";
__ref._submit.setText(BA.ObjectToCharSequence("Accept"));
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="tableType.TextColor = Colors.White";
__ref._tabletype.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="tableType.TextSize = 25";
__ref._tabletype.setTextSize((float) (25));
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="If Main.currentuser.TypeOfWorker = 1 Then";
if (_main._currentuser.TypeOfWorker==1) { 
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="tableType.Text = \"Workers Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else 
{RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 2 Then";
if (_main._currentuser.TypeOfWorker==2) { 
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="tableType.Text = \"Cooks Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else 
{RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="Else If Main.currentuser.TypeOfWorker = 3 Then";
if (_main._currentuser.TypeOfWorker==3) { 
RDebugUtils.currentLine=3276817;
 //BA.debugLineNum = 3276817;BA.debugLine="tableType.Text = \"Waiters Table\"";
__ref._tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 }}}
;
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
__ref._wholescreen.AddView((android.view.View)(__ref._tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
__ref._tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=3276822;
 //BA.debugLineNum = 3276822;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
__ref._tableholder.AddView((android.view.View)(__ref._tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3276824;
 //BA.debugLineNum = 3276824;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
__ref._tableholder.AddView(__ref._tableofrequests.getScrollView(),__c.PerXToCurrent((float) (0),ba),(int) (__ref._tableheader.getTop()+__ref._tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
__ref._tableholder.AddView((android.view.View)(__ref._tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
__ref._tablefooter.AddView((android.view.View)(__ref._submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=3276827;
 //BA.debugLineNum = 3276827;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
__ref._tableheader.AddView((android.view.View)(__ref._tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=3276829;
 //BA.debugLineNum = 3276829;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim TasksList As Map";
_taskslist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="Dim tableHolder As Panel";
_tableholder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim tableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim tableType As Label";
_tabletype = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="Dim tableofrequests As MiScrollView";
_tableofrequests = new wrappers.MiScrollView();
RDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="Dim submit As Button";
_submit = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Dim mapoftaskviews As Map";
_mapoftaskviews = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014668;
 //BA.debugLineNum = 3014668;BA.debugLine="Dim boxchecked As Int = 0";
_boxchecked = (int) (0);
RDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="Dim SelectedTasks As Map";
_selectedtasks = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=3014674;
 //BA.debugLineNum = 3014674;BA.debugLine="Dim RefreshTimer As Timer";
_refreshtimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="End Sub";
return "";
}
public String  _get_tasks(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "get_tasks"))
	return (String) Debug.delegate(ba, "get_tasks", null);
int _i = 0;
b4a.example.types._task _task = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Get_Tasks";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="For i = 0 To 5";
{
final int step1 = 1;
final int limit1 = (int) (5);
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim Task As Task";
_task = new b4a.example.types._task();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Task.Initialize";
_task.Initialize();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Task.TaskID = i";
_task.TaskID = _i;
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Task.TaskName = \"Task \"&i";
_task.TaskName = "Task "+BA.NumberToString(_i);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Task.TaskType = 1";
_task.TaskType = (int) (1);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="Task.TaskInfo = \"This is a very long text that i";
_task.TaskInfo = "This is a very long text that i will use to test this application and try to fing any mistakes in it.Currently we are on line:"+BA.NumberToString(_i);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="TasksList.Put(Task.TaskID,Task)";
__ref._taskslist.Put((Object)(_task.TaskID),(Object)(_task));
 }
};
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="End Sub";
return "";
}
public String  _refresh_tick(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "refresh_tick"))
	return (String) Debug.delegate(ba, "refresh_tick", null);
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub Refresh_Tick";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="If Main.currentuser.available = True  Then";
if (_main._currentuser.available==__c.True) { 
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="buildTasks";
__ref._buildtasks(null);
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="submit.Enabled = True";
__ref._submit.setEnabled(__c.True);
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="Log(\"_TABLE REFRESHED_\")";
__c.Log("_TABLE REFRESHED_");
 };
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="End Sub";
return "";
}
public String  _submit_click(b4a.example.tasktable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="tasktable";
if (Debug.shouldDelegate(ba, "submit_click"))
	return (String) Debug.delegate(ba, "submit_click", null);
int _i = 0;
b4a.example.types._task _v = null;
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub Submit_Click";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If SelectedTasks.Size > 0 Then";
if (__ref._selectedtasks.getSize()>0) { 
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="boxchecked = 0";
__ref._boxchecked = (int) (0);
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="RefreshTimer.Enabled = True";
__ref._refreshtimer.setEnabled(__c.True);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="submit.Enabled = False";
__ref._submit.setEnabled(__c.False);
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="For Each v As Task In SelectedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._selectedtasks.Values();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (b4a.example.types._task)(group6.Get(index6));
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="Main.currentuser.CurrentTaskID(i) = v.TaskID";
_main._currentuser.CurrentTaskID[_i] = _v.TaskID;
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=3538956;
 //BA.debugLineNum = 3538956;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(__ref._selectedtasks));
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"SetUserBusy");
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
__c.CallSubDebug2(ba,(Object)(_main.getObject()),"LoadMyTasks",(Object)(__ref._selectedtasks));
RDebugUtils.currentLine=3538959;
 //BA.debugLineNum = 3538959;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
RDebugUtils.currentLine=3538960;
 //BA.debugLineNum = 3538960;BA.debugLine="SelectedTasks.Clear";
__ref._selectedtasks.Clear();
 }else {
RDebugUtils.currentLine=3538962;
 //BA.debugLineNum = 3538962;BA.debugLine="ToastMessageShow(\"Please select a task to contin";
__c.ToastMessageShow(BA.ObjectToCharSequence("Please select a task to continue!"),__c.False);
 };
RDebugUtils.currentLine=3538964;
 //BA.debugLineNum = 3538964;BA.debugLine="End Sub";
return "";
}
}