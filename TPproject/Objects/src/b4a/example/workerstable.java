package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class workerstable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.workerstable");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.workerstable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public wrappers.MiScrollView _workersholder = null;
public anywheresoftware.b4a.objects.PanelWrapper _tableheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _tablename = null;
public anywheresoftware.b4a.objects.PanelWrapper _tablefakepan = null;
public anywheresoftware.b4a.objects.PanelWrapper _tablefooter = null;
public anywheresoftware.b4a.objects.ButtonWrapper _reloadworkers = null;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 48;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _buildtablelegend() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _workertypelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _isavailablelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _currtaskslbl = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub BuildTableLegend As Panel";
 //BA.debugLineNum = 60;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
 //BA.debugLineNum = 62;BA.debugLine="Dim UsernameLbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="UsernameLbl.Initialize(\"\")";
_usernamelbl.Initialize(ba,"");
 //BA.debugLineNum = 64;BA.debugLine="Dim WorkerTypeLbl As Label";
_workertypelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 65;BA.debugLine="WorkerTypeLbl.Initialize(\"\")";
_workertypelbl.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="Dim IsAvailableLbl As Label";
_isavailablelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="IsAvailableLbl.Initialize(\"\")";
_isavailablelbl.Initialize(ba,"");
 //BA.debugLineNum = 68;BA.debugLine="Dim CurrTasksLbl As Label";
_currtaskslbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="CurrTasksLbl.Initialize(\"\")";
_currtaskslbl.Initialize(ba,"");
 //BA.debugLineNum = 71;BA.debugLine="UsernameLbl.Text = \"Username\"";
_usernamelbl.setText(BA.ObjectToCharSequence("Username"));
 //BA.debugLineNum = 72;BA.debugLine="UsernameLbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 73;BA.debugLine="UsernameLbl.TextColor = Colors.White";
_usernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 74;BA.debugLine="UsernameLbl.TextSize = 15";
_usernamelbl.setTextSize((float) (15));
 //BA.debugLineNum = 75;BA.debugLine="UsernameLbl.Color=  Colors.ARGB(150,0,0,0)";
_usernamelbl.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 78;BA.debugLine="WorkerTypeLbl.Text = \"Worker Type\"";
_workertypelbl.setText(BA.ObjectToCharSequence("Worker Type"));
 //BA.debugLineNum = 79;BA.debugLine="WorkerTypeLbl.Gravity = Gravity.CENTER";
_workertypelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 80;BA.debugLine="WorkerTypeLbl.TextColor = Colors.White";
_workertypelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 81;BA.debugLine="WorkerTypeLbl.TextSize = 15";
_workertypelbl.setTextSize((float) (15));
 //BA.debugLineNum = 82;BA.debugLine="WorkerTypeLbl.Color= Colors.ARGB(150,0,0,0)";
_workertypelbl.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 84;BA.debugLine="IsAvailableLbl.Text = \"Status\"";
_isavailablelbl.setText(BA.ObjectToCharSequence("Status"));
 //BA.debugLineNum = 85;BA.debugLine="IsAvailableLbl.Gravity = Gravity.CENTER";
_isavailablelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 86;BA.debugLine="IsAvailableLbl.TextColor = Colors.White";
_isavailablelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 87;BA.debugLine="IsAvailableLbl.TextSize = 15";
_isavailablelbl.setTextSize((float) (15));
 //BA.debugLineNum = 88;BA.debugLine="IsAvailableLbl.Color=  Colors.ARGB(150,0,0,0)";
_isavailablelbl.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 90;BA.debugLine="CurrTasksLbl.Text = \"Current Tasks\"";
_currtaskslbl.setText(BA.ObjectToCharSequence("Current Tasks"));
 //BA.debugLineNum = 91;BA.debugLine="CurrTasksLbl.Gravity = Gravity.CENTER";
_currtaskslbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 92;BA.debugLine="CurrTasksLbl.TextColor = Colors.White";
_currtaskslbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 93;BA.debugLine="CurrTasksLbl.TextSize = 15";
_currtaskslbl.setTextSize((float) (15));
 //BA.debugLineNum = 94;BA.debugLine="CurrTasksLbl.Color=  Colors.ARGB(150,0,0,0)";
_currtaskslbl.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 96;BA.debugLine="Holder.AddView(UsernameLbl,0,0,20%x,5%y)";
_holder.AddView((android.view.View)(_usernamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 97;BA.debugLine="Holder.AddView(WorkerTypeLbl,UsernameLbl.Width,Us";
_holder.AddView((android.view.View)(_workertypelbl.getObject()),_usernamelbl.getWidth(),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 98;BA.debugLine="Holder.AddView(IsAvailableLbl,WorkerTypeLbl.Left";
_holder.AddView((android.view.View)(_isavailablelbl.getObject()),(int) (_workertypelbl.getLeft()+_workertypelbl.getWidth()),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 99;BA.debugLine="Holder.AddView(CurrTasksLbl,IsAvailableLbl.Width";
_holder.AddView((android.view.View)(_currtaskslbl.getObject()),(int) (_isavailablelbl.getWidth()+_isavailablelbl.getLeft()),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 100;BA.debugLine="Return Holder";
if (true) return _holder;
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 24;BA.debugLine="tableFooter.color = Colors.ARGB(150,0,0,0)";
_tablefooter.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 25;BA.debugLine="TableFakePan.Color = Colors.ARGB(150,0,0,0)";
_tablefakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 26;BA.debugLine="TableHeader.Color = Colors.ARGB(150,0,0,0)";
_tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 27;BA.debugLine="WholeScreen.AddView(TableHeader,10%x,10%y + 5dip,";
_wholescreen.AddView((android.view.View)(_tableheader.getObject()),__c.PerXToCurrent((float) (10),ba),(int) (__c.PerYToCurrent((float) (10),ba)+__c.DipToCurrent((int) (5))),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 28;BA.debugLine="WholeScreen.AddView(BuildTableLegend,TableHeader.";
_wholescreen.AddView((android.view.View)(_buildtablelegend().getObject()),_tableheader.getLeft(),(int) (_tableheader.getTop()+_tableheader.getHeight()),_tableheader.getWidth(),_tableheader.getHeight());
 //BA.debugLineNum = 29;BA.debugLine="WholeScreen.AddView(TableFakePan,TableHeader.Left";
_wholescreen.AddView((android.view.View)(_tablefakepan.getObject()),_tableheader.getLeft(),(int) ((_tableheader.getTop()+_tableheader.getHeight())+__c.PerYToCurrent((float) (5),ba)),_tableheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 30;BA.debugLine="WholeScreen.AddView(WorkersHolder.ScrollView,Tabl";
_wholescreen.AddView(_workersholder.getScrollView(),_tableheader.getLeft(),(int) ((_tableheader.getTop()+_tableheader.getHeight())+__c.PerYToCurrent((float) (5),ba)),_tableheader.getWidth(),_tablefakepan.getHeight());
 //BA.debugLineNum = 31;BA.debugLine="TableName.Gravity = Gravity.CENTER";
_tablename.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 32;BA.debugLine="TableName.Text = \"My Workers\"";
_tablename.setText(BA.ObjectToCharSequence("My Workers"));
 //BA.debugLineNum = 33;BA.debugLine="TableName.TextColor = Colors.White";
_tablename.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 34;BA.debugLine="TableName.TextSize = 15";
_tablename.setTextSize((float) (15));
 //BA.debugLineNum = 35;BA.debugLine="TableHeader.AddView(TableName,TableHeader.Left +";
_tableheader.AddView((android.view.View)(_tablename.getObject()),(int) (_tableheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (_tableheader.getWidth()/(double)2),_tableheader.getHeight());
 //BA.debugLineNum = 37;BA.debugLine="ReloadWorkers.Text = \"Reload\"";
_reloadworkers.setText(BA.ObjectToCharSequence("Reload"));
 //BA.debugLineNum = 38;BA.debugLine="ReloadWorkers.TextSize = 20";
_reloadworkers.setTextSize((float) (20));
 //BA.debugLineNum = 39;BA.debugLine="HelperFunctions1.Apply_ViewStyle(ReloadWorkers,Co";
_helperfunctions1._apply_viewstyle(ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_reloadworkers.getObject())),__c.Colors.Black,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.White,__c.Colors.RGB((int) (0),(int) (128),(int) (255)),__c.Colors.Gray,__c.Colors.Gray,__c.Colors.Gray,(int) (10));
 //BA.debugLineNum = 41;BA.debugLine="WholeScreen.AddView(tableFooter,TableFakePan.Left";
_wholescreen.AddView((android.view.View)(_tablefooter.getObject()),_tablefakepan.getLeft(),(int) (_tablefakepan.getTop()+_tablefakepan.getHeight()),_tablefakepan.getWidth(),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 42;BA.debugLine="tableFooter.AddView(ReloadWorkers,20%x,1%y - 2dip";
_tablefooter.AddView((android.view.View)(_reloadworkers.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (__c.PerYToCurrent((float) (1),ba)-__c.DipToCurrent((int) (2))),__c.PerXToCurrent((float) (40),ba),(int) (__c.PerYToCurrent((float) (4),ba)-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _buildworkerpan(String _username,int _workertype,boolean _isavailable,int[] _currenttasks) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _workertypelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _isavailablelbl = null;
anywheresoftware.b4a.objects.LabelWrapper _currtaskslbl = null;
int _i = 0;
 //BA.debugLineNum = 103;BA.debugLine="Sub BuildWorkerPan(username As String,WorkerType A";
 //BA.debugLineNum = 104;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 105;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
 //BA.debugLineNum = 106;BA.debugLine="Dim UsernameLbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 107;BA.debugLine="UsernameLbl.Initialize(\"\")";
_usernamelbl.Initialize(ba,"");
 //BA.debugLineNum = 108;BA.debugLine="Dim WorkerTypeLbl As Label";
_workertypelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 109;BA.debugLine="WorkerTypeLbl.Initialize(\"\")";
_workertypelbl.Initialize(ba,"");
 //BA.debugLineNum = 110;BA.debugLine="Dim IsAvailableLbl As Label";
_isavailablelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 111;BA.debugLine="IsAvailableLbl.Initialize(\"\")";
_isavailablelbl.Initialize(ba,"");
 //BA.debugLineNum = 112;BA.debugLine="Dim CurrTasksLbl As Label";
_currtaskslbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 113;BA.debugLine="CurrTasksLbl.Initialize(\"\")";
_currtaskslbl.Initialize(ba,"");
 //BA.debugLineNum = 115;BA.debugLine="UsernameLbl.Text = username";
_usernamelbl.setText(BA.ObjectToCharSequence(_username));
 //BA.debugLineNum = 116;BA.debugLine="UsernameLbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 117;BA.debugLine="UsernameLbl.TextColor = Colors.Black";
_usernamelbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 118;BA.debugLine="UsernameLbl.TextSize = 15";
_usernamelbl.setTextSize((float) (15));
 //BA.debugLineNum = 119;BA.debugLine="UsernameLbl.Color= Colors.rgb(230, 230, 230)";
_usernamelbl.setColor(__c.Colors.RGB((int) (230),(int) (230),(int) (230)));
 //BA.debugLineNum = 121;BA.debugLine="If WorkerType = 1 Then";
if (_workertype==1) { 
 //BA.debugLineNum = 122;BA.debugLine="WorkerTypeLbl.Text = \"Cleaner\"";
_workertypelbl.setText(BA.ObjectToCharSequence("Cleaner"));
 }else if(_workertype==2) { 
 //BA.debugLineNum = 124;BA.debugLine="WorkerTypeLbl.Text = \"Cook\"";
_workertypelbl.setText(BA.ObjectToCharSequence("Cook"));
 };
 //BA.debugLineNum = 126;BA.debugLine="WorkerTypeLbl.Gravity = Gravity.CENTER";
_workertypelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 127;BA.debugLine="WorkerTypeLbl.TextColor = Colors.Black";
_workertypelbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 128;BA.debugLine="WorkerTypeLbl.TextSize = 15";
_workertypelbl.setTextSize((float) (15));
 //BA.debugLineNum = 129;BA.debugLine="WorkerTypeLbl.Color= Colors.rgb(230, 230, 230)";
_workertypelbl.setColor(__c.Colors.RGB((int) (230),(int) (230),(int) (230)));
 //BA.debugLineNum = 131;BA.debugLine="If IsAvailable = True Then";
if (_isavailable==__c.True) { 
 //BA.debugLineNum = 132;BA.debugLine="IsAvailableLbl.Text = \"Free\"";
_isavailablelbl.setText(BA.ObjectToCharSequence("Free"));
 }else {
 //BA.debugLineNum = 134;BA.debugLine="IsAvailableLbl.Text = \"Busy\"";
_isavailablelbl.setText(BA.ObjectToCharSequence("Busy"));
 };
 //BA.debugLineNum = 136;BA.debugLine="IsAvailableLbl.Gravity = Gravity.CENTER";
_isavailablelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 137;BA.debugLine="IsAvailableLbl.TextColor = Colors.Black";
_isavailablelbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 138;BA.debugLine="IsAvailableLbl.TextSize = 15";
_isavailablelbl.setTextSize((float) (15));
 //BA.debugLineNum = 139;BA.debugLine="IsAvailableLbl.Color= Colors.rgb(230, 230, 230)";
_isavailablelbl.setColor(__c.Colors.RGB((int) (230),(int) (230),(int) (230)));
 //BA.debugLineNum = 141;BA.debugLine="For Each i As Int In CurrentTasks";
{
final int[] group34 = _currenttasks;
final int groupLen34 = group34.length
;int index34 = 0;
;
for (; index34 < groupLen34;index34++){
_i = group34[index34];
 //BA.debugLineNum = 142;BA.debugLine="CurrTasksLbl.Text = CurrTasksLbl.Text & i & \",\"";
_currtaskslbl.setText(BA.ObjectToCharSequence(_currtaskslbl.getText()+BA.NumberToString(_i)+","));
 }
};
 //BA.debugLineNum = 144;BA.debugLine="CurrTasksLbl.Gravity = Gravity.CENTER";
_currtaskslbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 145;BA.debugLine="CurrTasksLbl.TextColor = Colors.Black";
_currtaskslbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 146;BA.debugLine="CurrTasksLbl.TextSize = 15";
_currtaskslbl.setTextSize((float) (15));
 //BA.debugLineNum = 147;BA.debugLine="CurrTasksLbl.Color= Colors.rgb(230, 230, 230)";
_currtaskslbl.setColor(__c.Colors.RGB((int) (230),(int) (230),(int) (230)));
 //BA.debugLineNum = 149;BA.debugLine="Holder.AddView(UsernameLbl,0,0,20%x,10%y)";
_holder.AddView((android.view.View)(_usernamelbl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (20),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 150;BA.debugLine="Holder.AddView(WorkerTypeLbl,UsernameLbl.Width,Us";
_holder.AddView((android.view.View)(_workertypelbl.getObject()),_usernamelbl.getWidth(),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 151;BA.debugLine="Holder.AddView(IsAvailableLbl,WorkerTypeLbl.Left";
_holder.AddView((android.view.View)(_isavailablelbl.getObject()),(int) (_workertypelbl.getLeft()+_workertypelbl.getWidth()),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 152;BA.debugLine="Holder.AddView(CurrTasksLbl,IsAvailableLbl.Width";
_holder.AddView((android.view.View)(_currtaskslbl.getObject()),(int) (_isavailablelbl.getWidth()+_isavailablelbl.getLeft()),_usernamelbl.getTop(),_usernamelbl.getWidth(),_usernamelbl.getHeight());
 //BA.debugLineNum = 153;BA.debugLine="Return Holder";
if (true) return _holder;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim WorkersHolder As MiScrollView";
_workersholder = new wrappers.MiScrollView();
 //BA.debugLineNum = 4;BA.debugLine="Dim TableHeader As Panel";
_tableheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim TableName As Label";
_tablename = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim TableFakePan As Panel";
_tablefakepan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim tableFooter As Panel";
_tablefooter = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim ReloadWorkers As Button";
_reloadworkers = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 14;BA.debugLine="WorkersHolder.Initialize";
_workersholder.Initialize(ba);
 //BA.debugLineNum = 15;BA.debugLine="TableHeader.Initialize(\"\")";
_tableheader.Initialize(ba,"");
 //BA.debugLineNum = 16;BA.debugLine="TableName.Initialize(\"\")";
_tablename.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="TableFakePan.initialize(\"\")";
_tablefakepan.Initialize(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="ReloadWorkers.Initialize(\"test\")";
_reloadworkers.Initialize(ba,"test");
 //BA.debugLineNum = 19;BA.debugLine="tableFooter.Initialize(\"Footer\")";
_tablefooter.Initialize(ba,"Footer");
 //BA.debugLineNum = 20;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _loadworkers() throws Exception{
b4a.example.types._user _u = null;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub LoadWorkers";
 //BA.debugLineNum = 52;BA.debugLine="WorkersHolder.removeAllViews";
_workersholder.removeAllViews();
 //BA.debugLineNum = 53;BA.debugLine="For Each u As user In Types.userslist.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = _types._userslist.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_u = (b4a.example.types._user)(group2.Get(index2));
 //BA.debugLineNum = 54;BA.debugLine="If u.ID = Types.currentuser.ID And Not(u.usernam";
if (_u.ID==_types._currentuser.ID && __c.Not((_u.username).equals(_types._currentuser.username))) { 
 //BA.debugLineNum = 55;BA.debugLine="WorkersHolder.addView(BuildWorkerPan(u.username";
_workersholder.addView((android.view.View)(_buildworkerpan(_u.username,_u.TypeOfWorker,_u.available,_u.CurrentTaskID).getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (10),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 };
 }
};
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _test_click() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub test_Click";
 //BA.debugLineNum = 45;BA.debugLine="LoadWorkers";
_loadworkers();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
