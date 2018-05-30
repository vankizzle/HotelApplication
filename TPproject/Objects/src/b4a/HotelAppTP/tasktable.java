package b4a.HotelAppTP;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class tasktable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.HotelAppTP.tasktable");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.HotelAppTP.tasktable.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _refreshbtngraphic = null;
public anywheresoftware.b4a.objects.ButtonWrapper _tasksrefreshbtn = null;
public anywheresoftware.b4a.objects.collections.Map _mapoftaskviews = null;
public int _boxchecked = 0;
public anywheresoftware.b4a.objects.collections.Map _selectedtasks = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskfakepan = null;
public anywheresoftware.b4a.objects.Timer _refreshtimer = null;
public anywheresoftware.b4a.samples.httputils2.httpjob _gettasks = null;
public b4a.HotelAppTP.types._task _newtask = null;
public anywheresoftware.b4a.objects.SaxParser _myxml = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.HotelAppTP.main _main = null;
public b4a.HotelAppTP.types _types = null;
public b4a.HotelAppTP.helperfunctions1 _helperfunctions1 = null;
public b4a.HotelAppTP.starter _starter = null;
public String  _accept_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
 //BA.debugLineNum = 198;BA.debugLine="Sub accept_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 199;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 202;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 204;BA.debugLine="RefreshTimer.Enabled = False";
_refreshtimer.setEnabled(__c.False);
 //BA.debugLineNum = 205;BA.debugLine="If boxchecked < 3 Then";
if (_boxchecked<3) { 
 //BA.debugLineNum = 206;BA.debugLine="boxchecked = boxchecked + 1";
_boxchecked = (int) (_boxchecked+1);
 //BA.debugLineNum = 207;BA.debugLine="Log(boxchecked)";
__c.Log(BA.NumberToString(_boxchecked));
 //BA.debugLineNum = 208;BA.debugLine="For Each v As Panel In mapoftaskviews.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group7 = _mapoftaskviews.Values();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject((android.view.ViewGroup)(group7.Get(index7)));
 //BA.debugLineNum = 209;BA.debugLine="If cbox.Tag = v.Tag Then";
if ((_cbox.getTag()).equals(_v.getTag())) { 
 //BA.debugLineNum = 210;BA.debugLine="ToastMessageShow(\"You selected task \" & v.Ta";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.ObjectToString(_v.getTag())),__c.False);
 //BA.debugLineNum = 211;BA.debugLine="SelectedTasks.Put(cbox.Tag,TasksList.Get(Tas";
_selectedtasks.Put(_cbox.getTag(),_taskslist.Get(_taskslist.GetKeyAt((int)(BA.ObjectToNumber(_v.getTag())))));
 };
 }
};
 }else {
 //BA.debugLineNum = 215;BA.debugLine="cbox.Checked = False";
_cbox.setChecked(__c.False);
 //BA.debugLineNum = 216;BA.debugLine="ToastMessageShow(\"Cant accept more\",False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Cant accept more"),__c.False);
 };
 }else {
 //BA.debugLineNum = 221;BA.debugLine="Checked = False";
_checked = __c.False;
 //BA.debugLineNum = 222;BA.debugLine="SelectedTasks.Remove(cbox.tag)";
_selectedtasks.Remove(_cbox.getTag());
 //BA.debugLineNum = 223;BA.debugLine="boxchecked = boxchecked - 1";
_boxchecked = (int) (_boxchecked-1);
 //BA.debugLineNum = 224;BA.debugLine="If boxchecked = 0 Then";
if (_boxchecked==0) { 
 //BA.debugLineNum = 225;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 };
 };
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 77;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public String  _buildtasks() throws Exception{
int _p = 0;
b4a.HotelAppTP.types._task _i = null;
anywheresoftware.b4a.objects.PanelWrapper _taskpanel = null;
anywheresoftware.b4a.objects.LabelWrapper _taskidlbl = null;
anywheresoftware.b4a.objects.LabelWrapper _tasknamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _taskinfolbl = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub buildTasks";
 //BA.debugLineNum = 148;BA.debugLine="tableofrequests.removeAllViews";
_tableofrequests.removeAllViews();
 //BA.debugLineNum = 149;BA.debugLine="boxchecked = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 150;BA.debugLine="Dim p As Int = 0";
_p = (int) (0);
 //BA.debugLineNum = 151;BA.debugLine="For Each i As Task In Types.TasksList";
{
final anywheresoftware.b4a.BA.IterableList group4 = _types._taskslist;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_i = (b4a.HotelAppTP.types._task)(group4.Get(index4));
 //BA.debugLineNum = 152;BA.debugLine="If i.TaskType = Types.currentuser.TypeOfWorker T";
if ((_i.TaskType).equals(BA.NumberToString(_types._currentuser.TypeOfWorker))) { 
 //BA.debugLineNum = 153;BA.debugLine="Dim TaskPanel As Panel";
_taskpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 154;BA.debugLine="Dim TaskIdLbl As Label";
_taskidlbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 155;BA.debugLine="Dim TaskNameLbl As Label";
_tasknamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 156;BA.debugLine="Dim taskInfoLbl As Label";
_taskinfolbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 157;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 159;BA.debugLine="TaskPanel.Initialize(\"\")";
_taskpanel.Initialize(ba,"");
 //BA.debugLineNum = 160;BA.debugLine="TaskIdLbl.Initialize(\"\")";
_taskidlbl.Initialize(ba,"");
 //BA.debugLineNum = 161;BA.debugLine="TaskNameLbl.Initialize(\"\")";
_tasknamelbl.Initialize(ba,"");
 //BA.debugLineNum = 162;BA.debugLine="taskInfoLbl.Initialize(\"\")";
_taskinfolbl.Initialize(ba,"");
 //BA.debugLineNum = 163;BA.debugLine="checked.Initialize(\"accept\")";
_checked.Initialize(ba,"accept");
 //BA.debugLineNum = 165;BA.debugLine="TaskIdLbl.Text = i.TaskID";
_taskidlbl.setText(BA.ObjectToCharSequence(_i.TaskID));
 //BA.debugLineNum = 166;BA.debugLine="TaskIdLbl.TextColor = Colors.White";
_taskidlbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 167;BA.debugLine="TaskIdLbl.TextSize = 15";
_taskidlbl.setTextSize((float) (15));
 //BA.debugLineNum = 168;BA.debugLine="TaskIdLbl.Gravity = Gravity.CENTER";
_taskidlbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 169;BA.debugLine="TaskPanel.AddView(TaskIdLbl,0,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskidlbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 177;BA.debugLine="taskInfoLbl.Text = i.TaskInfo";
_taskinfolbl.setText(BA.ObjectToCharSequence(_i.TaskInfo));
 //BA.debugLineNum = 178;BA.debugLine="taskInfoLbl.TextColor = Colors.White";
_taskinfolbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 179;BA.debugLine="taskInfoLbl.TextSize = 10";
_taskinfolbl.setTextSize((float) (10));
 //BA.debugLineNum = 180;BA.debugLine="taskInfoLbl.Gravity = Gravity.CENTER";
_taskinfolbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 181;BA.debugLine="TaskPanel.AddView(taskInfoLbl,25%x,0,40%x,5%y)";
_taskpanel.AddView((android.view.View)(_taskinfolbl.getObject()),__c.PerXToCurrent((float) (25),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 184;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 185;BA.debugLine="TaskPanel.AddView(checked,70%x,0,10%x,5%y)";
_taskpanel.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 187;BA.debugLine="TaskPanel.Color = Colors.rgb(0, 128, 255)";
_taskpanel.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 188;BA.debugLine="tableofrequests.addView(TaskPanel,100%x,5%y,0,0";
_tableofrequests.addView((android.view.View)(_taskpanel.getObject()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 190;BA.debugLine="TaskPanel.Tag = p";
_taskpanel.setTag((Object)(_p));
 //BA.debugLineNum = 191;BA.debugLine="checked.Tag = p";
_checked.setTag((Object)(_p));
 //BA.debugLineNum = 192;BA.debugLine="p = p + 1";
_p = (int) (_p+1);
 //BA.debugLineNum = 193;BA.debugLine="mapoftaskviews.Put(TaskPanel.Tag,TaskPanel)";
_mapoftaskviews.Put(_taskpanel.getTag(),(Object)(_taskpanel.getObject()));
 };
 }
};
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 88;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
_taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 89;BA.debugLine="tableHeader.color = Colors.ARGB(150,0,0,0)";
_tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 90;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
_tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 91;BA.debugLine="tableType.Gravity = Gravity.CENTER";
_tabletype.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 92;BA.debugLine="submit.Text = \"Accept\"";
_submit.setText(BA.ObjectToCharSequence("Accept"));
 //BA.debugLineNum = 93;BA.debugLine="HelperFunctions1.Apply_ViewStyle(submit,Colors.Bl";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_submit.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 96;BA.debugLine="TasksRefreshBtn.SetBackgroundImage(refreshbtngrap";
_tasksrefreshbtn.SetBackgroundImageNew((android.graphics.Bitmap)(_refreshbtngraphic.getObject()));
 //BA.debugLineNum = 97;BA.debugLine="tableType.TextColor = Colors.White";
_tabletype.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 98;BA.debugLine="tableType.TextSize = 25";
_tabletype.setTextSize((float) (25));
 //BA.debugLineNum = 99;BA.debugLine="If Types.currentuser.TypeOfWorker = 1 Then";
if (_types._currentuser.TypeOfWorker==1) { 
 //BA.debugLineNum = 100;BA.debugLine="tableType.Text = \"Workers Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Workers Table"));
 }else if(_types._currentuser.TypeOfWorker==2) { 
 //BA.debugLineNum = 102;BA.debugLine="tableType.Text = \"Cooks Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Cooks Table"));
 }else if(_types._currentuser.TypeOfWorker==3) { 
 //BA.debugLineNum = 104;BA.debugLine="tableType.Text = \"Waiters Table\"";
_tabletype.setText(BA.ObjectToCharSequence("Waiters Table"));
 };
 //BA.debugLineNum = 107;BA.debugLine="WholeScreen.AddView(tableHolder,10%x,15%y,80%x,70";
_wholescreen.AddView((android.view.View)(_tableholder.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
 //BA.debugLineNum = 108;BA.debugLine="tableofrequests.Color = Colors.ARGB(150,0,0,0)";
_tableofrequests.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 109;BA.debugLine="tableHolder.AddView(tableHeader,0%x,0%y,100%x,5%y";
_tableholder.AddView((android.view.View)(_tableheader.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 111;BA.debugLine="tableHolder.AddView(tableofrequests.ScrollView,0%";
_tableholder.AddView(_tableofrequests.getScrollView(),__c.PerXToCurrent((float) (0),ba),(int) (_tableheader.getTop()+_tableheader.getHeight()),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 112;BA.debugLine="tableHolder.AddView(tableFooter,0%x,65%y - 1dip,1";
_tableholder.AddView((android.view.View)(_tablefooter.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (__c.PerYToCurrent((float) (65),ba)-__c.DipToCurrent((int) (1))),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (8),ba));
 //BA.debugLineNum = 113;BA.debugLine="tableFooter.AddView(submit,20%x,1%y - 2dip,40%x,4";
_tablefooter.AddView((android.view.View)(_submit.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 114;BA.debugLine="tableHeader.AddView(tableType,0,0,40%x,5%y)";
_tableheader.AddView((android.view.View)(_tabletype.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 115;BA.debugLine="tableHeader.AddView(TasksRefreshBtn,73%x,0,8%x,5%";
_tableheader.AddView((android.view.View)(_tasksrefreshbtn.getObject()),__c.PerXToCurrent((float) (73),ba),(int) (0),__c.PerXToCurrent((float) (8),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 10;BA.debugLine="Dim refreshbtngraphic As Bitmap";
_refreshbtngraphic = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim TasksRefreshBtn As Button";
_tasksrefreshbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
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
 //BA.debugLineNum = 21;BA.debugLine="Dim GetTasks As HttpJob";
_gettasks = new anywheresoftware.b4a.samples.httputils2.httpjob();
 //BA.debugLineNum = 23;BA.debugLine="Dim NewTask As Task";
_newtask = new b4a.HotelAppTP.types._task();
 //BA.debugLineNum = 25;BA.debugLine="Dim myxml As SaxParser";
_myxml = new anywheresoftware.b4a.objects.SaxParser();
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public String  _getalltasks() throws Exception{
String _url = "";
 //BA.debugLineNum = 54;BA.debugLine="Sub GetAllTasks";
 //BA.debugLineNum = 55;BA.debugLine="GetTasks.Initialize(\"GetTasks\", Me)";
_gettasks._initialize(ba,"GetTasks",this);
 //BA.debugLineNum = 56;BA.debugLine="Dim url As String = \"https://hacktues.com/api/tas";
_url = "https://hacktues.com/api/tasks";
 //BA.debugLineNum = 57;BA.debugLine="GetTasks.Download(url)";
_gettasks._download(_url);
 //BA.debugLineNum = 58;BA.debugLine="GetTasks.GetRequest.SetHeader(\"Accept\",\"applicati";
_gettasks._getrequest().SetHeader("Accept","application/xml");
 //BA.debugLineNum = 59;BA.debugLine="GetTasks.GetRequest.SetHeader(\"Authorization\",\"Be";
_gettasks._getrequest().SetHeader("Authorization","Bearer "+_types._restoken);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 30;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 31;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="TasksList.Initialize";
_taskslist.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="tableHolder.Initialize(\"table\")";
_tableholder.Initialize(ba,"table");
 //BA.debugLineNum = 34;BA.debugLine="tableHeader.Initialize(\"Header\")";
_tableheader.Initialize(ba,"Header");
 //BA.debugLineNum = 35;BA.debugLine="tableFooter.Initialize(\"Footer\")";
_tablefooter.Initialize(ba,"Footer");
 //BA.debugLineNum = 36;BA.debugLine="tableType.Initialize(\"type\")";
_tabletype.Initialize(ba,"type");
 //BA.debugLineNum = 37;BA.debugLine="refreshbtngraphic.Initialize(File.DirAssets,\"refr";
_refreshbtngraphic.Initialize(__c.File.getDirAssets(),"refresh.png");
 //BA.debugLineNum = 38;BA.debugLine="TasksRefreshBtn.Initialize(\"refreshtask\")";
_tasksrefreshbtn.Initialize(ba,"refreshtask");
 //BA.debugLineNum = 39;BA.debugLine="submit.Initialize(\"Submit\")";
_submit.Initialize(ba,"Submit");
 //BA.debugLineNum = 40;BA.debugLine="tableofrequests.Initialize";
_tableofrequests.Initialize(ba);
 //BA.debugLineNum = 41;BA.debugLine="mapoftaskviews.Initialize";
_mapoftaskviews.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="SelectedTasks.Initialize";
_selectedtasks.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="TaskFakePan.initialize(\"\")";
_taskfakepan.Initialize(ba,"");
 //BA.debugLineNum = 46;BA.debugLine="RefreshTimer.Initialize(\"Refresh\",5000)";
_refreshtimer.Initialize(ba,"Refresh",(long) (5000));
 //BA.debugLineNum = 47;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 49;BA.debugLine="myxml.Initialize";
_myxml.Initialize(ba);
 //BA.debugLineNum = 51;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _jobdone(anywheresoftware.b4a.samples.httputils2.httpjob _job1) throws Exception{
String _s = "";
 //BA.debugLineNum = 64;BA.debugLine="Sub JobDone(job1 As HttpJob)";
 //BA.debugLineNum = 65;BA.debugLine="If job1.Success Then";
if (_job1._success) { 
 //BA.debugLineNum = 66;BA.debugLine="Dim s As String = job1.JobName";
_s = _job1._jobname;
 //BA.debugLineNum = 67;BA.debugLine="Select s";
switch (BA.switchObjectToInt(_s,"GetTasks")) {
case 0: {
 //BA.debugLineNum = 69;BA.debugLine="Log(job1.GetString)";
__c.Log(_job1._getstring());
 //BA.debugLineNum = 70;BA.debugLine="TaskParser(job1.GetString)";
_taskparser(_job1._getstring());
 break; }
}
;
 //BA.debugLineNum = 72;BA.debugLine="job1.Release";
_job1._release();
 };
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _parse_endelement(String _uri,String _name,anywheresoftware.b4a.keywords.StringBuilderWrapper _text) throws Exception{
b4a.HotelAppTP.types._task _task = null;
 //BA.debugLineNum = 129;BA.debugLine="Sub Parse_EndElement (Uri As String, Name As Strin";
 //BA.debugLineNum = 130;BA.debugLine="If Name.EqualsIgnoreCase(\"item\") Then";
if (_name.equalsIgnoreCase("item")) { 
 //BA.debugLineNum = 131;BA.debugLine="Dim task As Task";
_task = new b4a.HotelAppTP.types._task();
 //BA.debugLineNum = 132;BA.debugLine="task.Initialize";
_task.Initialize();
 //BA.debugLineNum = 133;BA.debugLine="task.TaskID = NewTask.TaskID";
_task.TaskID = _newtask.TaskID;
 //BA.debugLineNum = 134;BA.debugLine="task.TaskInfo = NewTask.TaskInfo";
_task.TaskInfo = _newtask.TaskInfo;
 //BA.debugLineNum = 135;BA.debugLine="task.Status = NewTask.Status";
_task.Status = _newtask.Status;
 //BA.debugLineNum = 136;BA.debugLine="task.TaskType = NewTask.TaskType";
_task.TaskType = _newtask.TaskType;
 //BA.debugLineNum = 137;BA.debugLine="Types.TasksList.Add(task)";
_types._taskslist.Add((Object)(_task));
 };
 //BA.debugLineNum = 140;BA.debugLine="If Name.EqualsIgnoreCase(\"description\") Then NewT";
if (_name.equalsIgnoreCase("description")) { 
_newtask.TaskInfo = _text.ToString();};
 //BA.debugLineNum = 141;BA.debugLine="If Name.EqualsIgnoreCase(\"id\") Then NewTask.TaskI";
if (_name.equalsIgnoreCase("id")) { 
_newtask.TaskID = (int)(Double.parseDouble(_text.ToString()));};
 //BA.debugLineNum = 142;BA.debugLine="If Name.EqualsIgnoreCase(\"status\") Then NewTask.S";
if (_name.equalsIgnoreCase("status")) { 
_newtask.Status = _text.ToString();};
 //BA.debugLineNum = 143;BA.debugLine="If Name.EqualsIgnoreCase(\"name\") Then NewTask.Tas";
if (_name.equalsIgnoreCase("name")) { 
_newtask.TaskType = _text.ToString();};
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _parse_startelement(String _uri,String _name,anywheresoftware.b4a.objects.SaxParser.AttributesWrapper _attributes) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub Parse_StartElement (Uri As String, Name As Str";
 //BA.debugLineNum = 125;BA.debugLine="If Name.EqualsIgnoreCase(\"item\") Then";
if (_name.equalsIgnoreCase("item")) { 
 //BA.debugLineNum = 126;BA.debugLine="NewTask.Initialize";
_newtask.Initialize();
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _refresh_tick() throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub Refresh_Tick";
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _refreshtask_click() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub refreshtask_Click";
 //BA.debugLineNum = 62;BA.debugLine="GetAllTasks";
_getalltasks();
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _submit_click() throws Exception{
int _i = 0;
b4a.HotelAppTP.types._task _v = null;
 //BA.debugLineNum = 230;BA.debugLine="Sub Submit_Click";
 //BA.debugLineNum = 231;BA.debugLine="If SelectedTasks.Size > 0 Then";
if (_selectedtasks.getSize()>0) { 
 //BA.debugLineNum = 232;BA.debugLine="boxchecked = 0";
_boxchecked = (int) (0);
 //BA.debugLineNum = 233;BA.debugLine="RefreshTimer.Enabled = True";
_refreshtimer.setEnabled(__c.True);
 //BA.debugLineNum = 234;BA.debugLine="submit.Enabled = False";
_submit.setEnabled(__c.False);
 //BA.debugLineNum = 235;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 237;BA.debugLine="For Each v As Task In SelectedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group6 = _selectedtasks.Values();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_v = (b4a.HotelAppTP.types._task)(group6.Get(index6));
 //BA.debugLineNum = 238;BA.debugLine="Types.currentuser.CurrentTaskID(i) = v.TaskID";
_types._currentuser.CurrentTaskID[_i] = _v.TaskID;
 //BA.debugLineNum = 239;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 //BA.debugLineNum = 242;BA.debugLine="Log(SelectedTasks)";
__c.Log(BA.ObjectToString(_selectedtasks));
 //BA.debugLineNum = 243;BA.debugLine="CallSub(Main,\"SetUserBusy\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"SetUserBusy");
 //BA.debugLineNum = 244;BA.debugLine="CallSub2(Main,\"LoadMyTasks\",SelectedTasks)";
__c.CallSubNew2(ba,(Object)(_main.getObject()),"LoadMyTasks",(Object)(_selectedtasks));
 //BA.debugLineNum = 245;BA.debugLine="CallSub(Main,\"TaskTableToMyTasks\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"TaskTableToMyTasks");
 //BA.debugLineNum = 246;BA.debugLine="SelectedTasks.Clear";
_selectedtasks.Clear();
 }else {
 //BA.debugLineNum = 248;BA.debugLine="ToastMessageShow(\"Please select a task to contin";
__c.ToastMessageShow(BA.ObjectToCharSequence("Please select a task to continue!"),__c.False);
 };
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _taskparser(String _tmpstring) throws Exception{
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _newstream = null;
 //BA.debugLineNum = 118;BA.debugLine="Sub TaskParser(tmpString As String)";
 //BA.debugLineNum = 119;BA.debugLine="Dim NewStream As InputStream";
_newstream = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 120;BA.debugLine="NewStream.InitializeFromBytesArray(tmpString.GetB";
_newstream.InitializeFromBytesArray(_tmpstring.getBytes("UTF8"),(int) (0),_tmpstring.getBytes("UTF8").length);
 //BA.debugLineNum = 121;BA.debugLine="myxml.Parse(NewStream,\"AllTasks\")";
_myxml.Parse((java.io.InputStream)(_newstream.getObject()),"AllTasks");
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
