package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mytasks extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.mytasks");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.mytasks.class).invoke(this, new Object[] {null});
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
public wrappers.MiScrollView _taskholder = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _tablename = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskfakepan = null;
public anywheresoftware.b4a.objects.ButtonWrapper _finishbtn = null;
public anywheresoftware.b4a.objects.collections.Map _mapofview = null;
public anywheresoftware.b4a.objects.collections.Map _viewtoremove = null;
public int _chekboxtag = 0;
public int _checknumbers = 0;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public String  _initialize(b4a.example.mytasks __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="TaskHolder.Initialize";
__ref._taskholder.Initialize(ba);
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="TaskHeader.Initialize(\"\")";
__ref._taskheader.Initialize(ba,"");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="TableName.Initialize(\"\")";
__ref._tablename.Initialize(ba,"");
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="TaskFakePan.initialize(\"\")";
__ref._taskfakepan.Initialize(ba,"");
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="FinishBtn.Initialize(\"Finish\")";
__ref._finishbtn.Initialize(ba,"Finish");
RDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="MapOfView.Initialize";
__ref._mapofview.Initialize();
RDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="ViewToRemove.Initialize";
__ref._viewtoremove.Initialize();
RDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=1572874;
 //BA.debugLineNum = 1572874;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return null;
}
public String  _getmytasks(b4a.example.mytasks __ref,anywheresoftware.b4a.objects.collections.Map _acceptedtasks) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "getmytasks"))
	return (String) Debug.delegate(ba, "getmytasks", new Object[] {_acceptedtasks});
int _i = 0;
b4a.example.types._task _v = null;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub GetMyTasks(AcceptedTasks As Map)";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="For i = 0 To MapOfView.Size";
{
final int step1 = 1;
final int limit1 = __ref._mapofview.getSize();
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="MapOfView.Remove(i)";
__ref._mapofview.Remove((Object)(_i));
 }
};
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="TaskHolder.removeAllViews";
__ref._taskholder.removeAllViews();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="For Each v As Task In AcceptedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _acceptedtasks.Values();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (b4a.example.types._task)(group5.Get(index5));
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="TaskHolder.addView(PanBuilder(v.TaskName,v.TaskT";
__ref._taskholder.addView((android.view.View)(__ref._panbuilder(null,_v.TaskName,_v.TaskType,_v.TaskInfo).getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 }
};
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
__ref._taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="TaskHeader.Color = Colors.ARGB(150,0,0,0)";
__ref._taskheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="FinishBtn.Color = Colors.rgb(41, 163, 41)";
__ref._finishbtn.setColor(__c.Colors.RGB((int) (41),(int) (163),(int) (41)));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="FinishBtn.Gravity =Gravity.CENTER";
__ref._finishbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="FinishBtn.Text = \"Finish\"";
__ref._finishbtn.setText(BA.ObjectToCharSequence("Finish"));
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="FinishBtn.TextSize = 25";
__ref._finishbtn.setTextSize((float) (25));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y";
__ref._wholescreen.AddView((android.view.View)(__ref._taskheader.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="WholeScreen.AddView(TaskFakePan,TaskHeader.Left,T";
__ref._wholescreen.AddView((android.view.View)(__ref._taskfakepan.getObject()),__ref._taskheader.getLeft(),(int) (__ref._taskheader.getTop()+__ref._taskheader.getHeight()),__ref._taskheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="WholeScreen.AddView(TaskHolder.ScrollView,TaskHea";
__ref._wholescreen.AddView(__ref._taskholder.getScrollView(),__ref._taskheader.getLeft(),(int) (__ref._taskheader.getTop()+__ref._taskheader.getHeight()),__ref._taskheader.getWidth(),__ref._taskfakepan.getHeight());
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="WholeScreen.AddView(FinishBtn,TaskHeader.Left,Tas";
__ref._wholescreen.AddView((android.view.View)(__ref._finishbtn.getObject()),__ref._taskheader.getLeft(),(int) (__ref._taskfakepan.getTop()+__ref._taskfakepan.getHeight()),__ref._taskfakepan.getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="TableName.Gravity = Gravity.CENTER";
__ref._tablename.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="TableName.Text = \"My Tasks\"";
__ref._tablename.setText(BA.ObjectToCharSequence("My Tasks"));
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="TableName.TextColor = Colors.White";
__ref._tablename.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="TableName.TextSize = 15";
__ref._tablename.setTextSize((float) (15));
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="TaskHeader.AddView(TableName,TaskHeader.Left + 10";
__ref._taskheader.AddView((android.view.View)(__ref._tablename.getObject()),(int) (__ref._taskheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (__ref._taskheader.getWidth()/(double)2),__ref._taskheader.getHeight());
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim TaskHolder As MiScrollView";
_taskholder = new wrappers.MiScrollView();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Dim TaskHeader As Panel";
_taskheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim TableName As Label";
_tablename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim FinishBtn As Button";
_finishbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Dim MapOfView As Map";
_mapofview = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim ViewToRemove As Map";
_viewtoremove = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Dim chekboxtag As Int = 0";
_chekboxtag = (int) (0);
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Dim checkNumbers As Int = 0";
_checknumbers = (int) (0);
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="End Sub";
return "";
}
public String  _finish_click(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "finish_click"))
	return (String) Debug.delegate(ba, "finish_click", null);
int _k = 0;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub Finish_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(__ref._viewtoremove));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(__ref._mapofview));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="For Each k As Int In ViewToRemove.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._viewtoremove.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = (int)(BA.ObjectToNumber(group3.Get(index3)));
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="If MapOfView.ContainsKey(k) Then";
if (__ref._mapofview.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="MapOfView.Remove(k)";
__ref._mapofview.Remove((Object)(_k));
 };
 }
};
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="For Each v As Panel In ViewToRemove.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._viewtoremove.Values();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_v.setObject((android.view.ViewGroup)(group8.Get(index8)));
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="v.RemoveAllViews";
_v.RemoveAllViews();
RDebugUtils.currentLine=1966094;
 //BA.debugLineNum = 1966094;BA.debugLine="v.RemoveView";
_v.RemoveView();
 }
};
RDebugUtils.currentLine=1966097;
 //BA.debugLineNum = 1966097;BA.debugLine="ViewToRemove.Clear";
__ref._viewtoremove.Clear();
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="Log(\"???????????????\")";
__c.Log("???????????????");
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(__ref._viewtoremove));
RDebugUtils.currentLine=1966101;
 //BA.debugLineNum = 1966101;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(__ref._mapofview));
RDebugUtils.currentLine=1966103;
 //BA.debugLineNum = 1966103;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
RDebugUtils.currentLine=1966105;
 //BA.debugLineNum = 1966105;BA.debugLine="If MapOfView.Size = 0 Then";
if (__ref._mapofview.getSize()==0) { 
RDebugUtils.currentLine=1966106;
 //BA.debugLineNum = 1966106;BA.debugLine="MapOfView.Clear";
__ref._mapofview.Clear();
RDebugUtils.currentLine=1966107;
 //BA.debugLineNum = 1966107;BA.debugLine="ViewToRemove.Clear";
__ref._viewtoremove.Clear();
RDebugUtils.currentLine=1966108;
 //BA.debugLineNum = 1966108;BA.debugLine="CallSub(Main,\"SetUserAvailable\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"SetUserAvailable");
 };
RDebugUtils.currentLine=1966110;
 //BA.debugLineNum = 1966110;BA.debugLine="End Sub";
return "";
}
public String  _finished_checkedchange(b4a.example.mytasks __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "finished_checkedchange"))
	return (String) Debug.delegate(ba, "finished_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
int _k = 0;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub finished_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="FinishBtn.Enabled = True";
__ref._finishbtn.setEnabled(__c.True);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="checkNumbers = checkNumbers + 1";
__ref._checknumbers = (int) (__ref._checknumbers+1);
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="For Each k As Int In MapOfView.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mapofview.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = (int)(BA.ObjectToNumber(group5.Get(index5)));
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="If cbox.Tag = k Then";
if ((_cbox.getTag()).equals((Object)(_k))) { 
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="ToastMessageShow(\"You selected task \" & k,Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.NumberToString(_k)),__c.False);
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="ViewToRemove.Put(k,MapOfView.Get(k))";
__ref._viewtoremove.Put((Object)(_k),__ref._mapofview.Get((Object)(_k)));
 };
 }
};
 }else {
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="checkNumbers = checkNumbers - 1";
__ref._checknumbers = (int) (__ref._checknumbers-1);
RDebugUtils.currentLine=1900559;
 //BA.debugLineNum = 1900559;BA.debugLine="ViewToRemove.Remove(cbox.tag)";
__ref._viewtoremove.Remove(_cbox.getTag());
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="If 	checkNumbers = 0 Then";
if (__ref._checknumbers==0) { 
RDebugUtils.currentLine=1900562;
 //BA.debugLineNum = 1900562;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
 };
 };
RDebugUtils.currentLine=1900566;
 //BA.debugLineNum = 1900566;BA.debugLine="Log(\"Checked = \"& checkNumbers)";
__c.Log("Checked = "+BA.NumberToString(__ref._checknumbers));
RDebugUtils.currentLine=1900567;
 //BA.debugLineNum = 1900567;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _panbuilder(b4a.example.mytasks __ref,String _name,int _tasktype,String _info) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "panbuilder"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "panbuilder", new Object[] {_name,_tasktype,_info});
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.PanelWrapper _header = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
wrappers.MiScrollView _viewinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub PanBuilder(Name As String,TaskType As Int,Info";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Dim header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="header.Initialize(\"\")";
_header.Initialize(ba,"");
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Dim ViewInfo As MiScrollView";
_viewinfo = new wrappers.MiScrollView();
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="ViewInfo.Initialize";
_viewinfo.Initialize(ba);
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Dim lblInfo As Label";
_lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="lblInfo.Initialize(\"\")";
_lblinfo.Initialize(ba,"");
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="checked.Initialize(\"finished\")";
_checked.Initialize(ba,"finished");
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="Holder.AddView(header,0,0,80%x,5%y)";
_holder.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="header.Color = Colors.rgb(0, 128, 255)";
_header.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="Holder.Tag = chekboxtag";
_holder.setTag((Object)(__ref._chekboxtag));
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="checked.Tag = chekboxtag";
_checked.setTag((Object)(__ref._chekboxtag));
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="header.AddView(checked,70%x,0,10%x,5%y)";
_header.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
_lblname.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="lblName.Text = Name";
_lblname.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=1835033;
 //BA.debugLineNum = 1835033;BA.debugLine="lblName.TextSize = 20";
_lblname.setTextSize((float) (20));
RDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="lblName.TextColor = Colors.White";
_lblname.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835035;
 //BA.debugLineNum = 1835035;BA.debugLine="lblName.Gravity = Gravity.CENTER";
_lblname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=1835036;
 //BA.debugLineNum = 1835036;BA.debugLine="header.AddView(lblName,20%x,0,40%x,5%y)";
_header.AddView((android.view.View)(_lblname.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=1835038;
 //BA.debugLineNum = 1835038;BA.debugLine="lblInfo.Text = Info";
_lblinfo.setText(BA.ObjectToCharSequence(_info));
RDebugUtils.currentLine=1835039;
 //BA.debugLineNum = 1835039;BA.debugLine="lblInfo.TextSize = 15";
_lblinfo.setTextSize((float) (15));
RDebugUtils.currentLine=1835040;
 //BA.debugLineNum = 1835040;BA.debugLine="lblInfo.TextColor = Colors.White";
_lblinfo.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=1835041;
 //BA.debugLineNum = 1835041;BA.debugLine="lblInfo.Color = Colors.rgb(0, 128, 255)";
_lblinfo.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=1835043;
 //BA.debugLineNum = 1835043;BA.debugLine="Holder.AddView(ViewInfo.ScrollView,0%x,5%y,80%x,1";
_holder.AddView(_viewinfo.getScrollView(),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=1835044;
 //BA.debugLineNum = 1835044;BA.debugLine="ViewInfo.addView(lblInfo,80%x,15%y,0,0,0,0)";
_viewinfo.addView((android.view.View)(_lblinfo.getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=1835045;
 //BA.debugLineNum = 1835045;BA.debugLine="MapOfView.Put(checked.Tag,Holder)";
__ref._mapofview.Put(_checked.getTag(),(Object)(_holder.getObject()));
RDebugUtils.currentLine=1835046;
 //BA.debugLineNum = 1835046;BA.debugLine="chekboxtag = chekboxtag + 1";
__ref._chekboxtag = (int) (__ref._chekboxtag+1);
RDebugUtils.currentLine=1835047;
 //BA.debugLineNum = 1835047;BA.debugLine="Return Holder";
if (true) return _holder;
RDebugUtils.currentLine=1835048;
 //BA.debugLineNum = 1835048;BA.debugLine="End Sub";
return null;
}
}