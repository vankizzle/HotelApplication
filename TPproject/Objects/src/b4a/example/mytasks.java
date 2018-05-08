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
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="WholeScreen.Initialize(\"\")";
__ref._wholescreen.Initialize(ba,"");
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="TaskHolder.Initialize";
__ref._taskholder.Initialize(ba);
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="TaskHeader.Initialize(\"\")";
__ref._taskheader.Initialize(ba,"");
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="TableName.Initialize(\"\")";
__ref._tablename.Initialize(ba,"");
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="TaskFakePan.initialize(\"\")";
__ref._taskfakepan.Initialize(ba,"");
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="FinishBtn.Initialize(\"Finish\")";
__ref._finishbtn.Initialize(ba,"Finish");
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="MapOfView.Initialize";
__ref._mapofview.Initialize();
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="ViewToRemove.Initialize";
__ref._viewtoremove.Initialize();
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="BuildUI";
__ref._buildui(null);
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "asview"))
	return (anywheresoftware.b4a.objects.ConcreteViewWrapper) Debug.delegate(ba, "asview", null);
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub AsView As View";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._wholescreen.getObject()));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return null;
}
public String  _getmytasks(b4a.example.mytasks __ref,anywheresoftware.b4a.objects.collections.Map _acceptedtasks) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "getmytasks"))
	return (String) Debug.delegate(ba, "getmytasks", new Object[] {_acceptedtasks});
int _i = 0;
b4a.example.types._task _v = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub GetMyTasks(AcceptedTasks As Map)";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="For i = 0 To MapOfView.Size";
{
final int step1 = 1;
final int limit1 = __ref._mapofview.getSize();
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="MapOfView.Remove(i)";
__ref._mapofview.Remove((Object)(_i));
 }
};
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="TaskHolder.removeAllViews";
__ref._taskholder.removeAllViews();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="For Each v As Task In AcceptedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _acceptedtasks.Values();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (b4a.example.types._task)(group5.Get(index5));
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="TaskHolder.addView(PanBuilder(v.TaskName,v.TaskT";
__ref._taskholder.addView((android.view.View)(__ref._panbuilder(null,_v.TaskName,_v.TaskType,_v.TaskInfo,_v.TaskID).getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 }
};
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="End Sub";
return "";
}
public String  _buildui(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "buildui"))
	return (String) Debug.delegate(ba, "buildui", null);
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub BuildUI";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
__ref._taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="TaskHeader.Color = Colors.ARGB(150,0,0,0)";
__ref._taskheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="FinishBtn.Color = Colors.rgb(41, 163, 41)";
__ref._finishbtn.setColor(__c.Colors.RGB((int) (41),(int) (163),(int) (41)));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="FinishBtn.Gravity =Gravity.CENTER";
__ref._finishbtn.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="FinishBtn.Text = \"Finish\"";
__ref._finishbtn.setText(BA.ObjectToCharSequence("Finish"));
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="FinishBtn.TextSize = 25";
__ref._finishbtn.setTextSize((float) (25));
RDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y";
__ref._wholescreen.AddView((android.view.View)(__ref._taskheader.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="WholeScreen.AddView(TaskFakePan,TaskHeader.Left,T";
__ref._wholescreen.AddView((android.view.View)(__ref._taskfakepan.getObject()),__ref._taskheader.getLeft(),(int) (__ref._taskheader.getTop()+__ref._taskheader.getHeight()),__ref._taskheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
RDebugUtils.currentLine=2555914;
 //BA.debugLineNum = 2555914;BA.debugLine="WholeScreen.AddView(TaskHolder.ScrollView,TaskHea";
__ref._wholescreen.AddView(__ref._taskholder.getScrollView(),__ref._taskheader.getLeft(),(int) (__ref._taskheader.getTop()+__ref._taskheader.getHeight()),__ref._taskheader.getWidth(),__ref._taskfakepan.getHeight());
RDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="WholeScreen.AddView(FinishBtn,TaskHeader.Left,Tas";
__ref._wholescreen.AddView((android.view.View)(__ref._finishbtn.getObject()),__ref._taskheader.getLeft(),(int) (__ref._taskfakepan.getTop()+__ref._taskfakepan.getHeight()),__ref._taskfakepan.getWidth(),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2555916;
 //BA.debugLineNum = 2555916;BA.debugLine="TableName.Gravity = Gravity.CENTER";
__ref._tablename.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2555917;
 //BA.debugLineNum = 2555917;BA.debugLine="TableName.Text = \"My Tasks\"";
__ref._tablename.setText(BA.ObjectToCharSequence("My Tasks"));
RDebugUtils.currentLine=2555918;
 //BA.debugLineNum = 2555918;BA.debugLine="TableName.TextColor = Colors.White";
__ref._tablename.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2555919;
 //BA.debugLineNum = 2555919;BA.debugLine="TableName.TextSize = 15";
__ref._tablename.setTextSize((float) (15));
RDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="TaskHeader.AddView(TableName,TaskHeader.Left + 10";
__ref._taskheader.AddView((android.view.View)(__ref._tablename.getObject()),(int) (__ref._taskheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (__ref._taskheader.getWidth()/(double)2),__ref._taskheader.getHeight());
RDebugUtils.currentLine=2555921;
 //BA.debugLineNum = 2555921;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim TaskHolder As MiScrollView";
_taskholder = new wrappers.MiScrollView();
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="Dim TaskHeader As Panel";
_taskheader = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Dim TableName As Label";
_tablename = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="Dim FinishBtn As Button";
_finishbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="Dim MapOfView As Map";
_mapofview = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424840;
 //BA.debugLineNum = 2424840;BA.debugLine="Dim ViewToRemove As Map";
_viewtoremove = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Dim chekboxtag As Int = 0";
_chekboxtag = (int) (0);
RDebugUtils.currentLine=2424842;
 //BA.debugLineNum = 2424842;BA.debugLine="Dim checkNumbers As Int = 0";
_checknumbers = (int) (0);
RDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="End Sub";
return "";
}
public String  _finish_click(b4a.example.mytasks __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "finish_click"))
	return (String) Debug.delegate(ba, "finish_click", null);
int _i = 0;
int _k = 0;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Finish_Click";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(__ref._viewtoremove));
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(__ref._mapofview));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="For i = 0 To ViewToRemove.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._viewtoremove.getSize()-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Main.currentuser.CurrentTaskID(i) = 0";
_main._currentuser.CurrentTaskID[_i] = (int) (0);
 }
};
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="Main.currentuser.CurrentTaskID(0) = 5";
_main._currentuser.CurrentTaskID[(int) (0)] = (int) (5);
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="For Each k As Int In ViewToRemove.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._viewtoremove.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = (int)(BA.ObjectToNumber(group7.Get(index7)));
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="If MapOfView.ContainsKey(k) Then";
if (__ref._mapofview.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="MapOfView.Remove(k)";
__ref._mapofview.Remove((Object)(_k));
 };
 }
};
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="For Each v As Panel In ViewToRemove.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = __ref._viewtoremove.Values();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v.setObject((android.view.ViewGroup)(group12.Get(index12)));
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="v.RemoveAllViews";
_v.RemoveAllViews();
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="v.RemoveView";
_v.RemoveView();
 }
};
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="ViewToRemove.Clear";
__ref._viewtoremove.Clear();
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="Log(\"???????????????\")";
__c.Log("???????????????");
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(__ref._viewtoremove));
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(__ref._mapofview));
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
RDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="If MapOfView.Size = 0 Then";
if (__ref._mapofview.getSize()==0) { 
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="MapOfView.Clear";
__ref._mapofview.Clear();
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="ViewToRemove.Clear";
__ref._viewtoremove.Clear();
RDebugUtils.currentLine=2883615;
 //BA.debugLineNum = 2883615;BA.debugLine="CallSub(Main,\"SetUserAvailable\")";
__c.CallSubDebug(ba,(Object)(_main.getObject()),"SetUserAvailable");
 };
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="End Sub";
return "";
}
public String  _finished_checkedchange(b4a.example.mytasks __ref,boolean _checked) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "finished_checkedchange"))
	return (String) Debug.delegate(ba, "finished_checkedchange", new Object[] {_checked});
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
int _k = 0;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub finished_CheckedChange(Checked As Boolean)";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="FinishBtn.Enabled = True";
__ref._finishbtn.setEnabled(__c.True);
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="checkNumbers = checkNumbers + 1";
__ref._checknumbers = (int) (__ref._checknumbers+1);
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="For Each k As Int In MapOfView.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mapofview.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = (int)(BA.ObjectToNumber(group5.Get(index5)));
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="If cbox.Tag = k Then";
if ((_cbox.getTag()).equals((Object)(_k))) { 
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="ToastMessageShow(\"You selected task \" & k,Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.NumberToString(_k)),__c.False);
RDebugUtils.currentLine=2818057;
 //BA.debugLineNum = 2818057;BA.debugLine="ViewToRemove.Put(k,MapOfView.Get(k))";
__ref._viewtoremove.Put((Object)(_k),__ref._mapofview.Get((Object)(_k)));
 };
 }
};
 }else {
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="Checked = False";
_checked = __c.False;
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="checkNumbers = checkNumbers - 1";
__ref._checknumbers = (int) (__ref._checknumbers-1);
RDebugUtils.currentLine=2818063;
 //BA.debugLineNum = 2818063;BA.debugLine="ViewToRemove.Remove(cbox.tag)";
__ref._viewtoremove.Remove(_cbox.getTag());
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="If 	checkNumbers = 0 Then";
if (__ref._checknumbers==0) { 
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="FinishBtn.Enabled = False";
__ref._finishbtn.setEnabled(__c.False);
 };
 };
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="Log(\"Checked = \"& checkNumbers)";
__c.Log("Checked = "+BA.NumberToString(__ref._checknumbers));
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _panbuilder(b4a.example.mytasks __ref,String _name,int _tasktype,String _info,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="mytasks";
if (Debug.shouldDelegate(ba, "panbuilder"))
	return (anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "panbuilder", new Object[] {_name,_tasktype,_info,_id});
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.PanelWrapper _header = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
wrappers.MiScrollView _viewinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub PanBuilder(Name As String,TaskType As Int,Info";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="Dim header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="header.Initialize(\"\")";
_header.Initialize(ba,"");
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Dim ViewInfo As MiScrollView";
_viewinfo = new wrappers.MiScrollView();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="ViewInfo.Initialize";
_viewinfo.Initialize(ba);
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="Dim lblInfo As Label";
_lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="lblInfo.Initialize(\"\")";
_lblinfo.Initialize(ba,"");
RDebugUtils.currentLine=2752525;
 //BA.debugLineNum = 2752525;BA.debugLine="Dim lblID As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="lblID.Initialize(\"\")";
_lblid.Initialize(ba,"");
RDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="checked.Initialize(\"finished\")";
_checked.Initialize(ba,"finished");
RDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="Holder.AddView(header,0,0,80%x,5%y)";
_holder.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752531;
 //BA.debugLineNum = 2752531;BA.debugLine="header.Color = Colors.rgb(0, 128, 255)";
_header.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=2752532;
 //BA.debugLineNum = 2752532;BA.debugLine="Holder.Tag = chekboxtag";
_holder.setTag((Object)(__ref._chekboxtag));
RDebugUtils.currentLine=2752533;
 //BA.debugLineNum = 2752533;BA.debugLine="checked.Tag = chekboxtag";
_checked.setTag((Object)(__ref._chekboxtag));
RDebugUtils.currentLine=2752534;
 //BA.debugLineNum = 2752534;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="header.AddView(checked,70%x,0,10%x,5%y)";
_header.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752537;
 //BA.debugLineNum = 2752537;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
_lblname.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="lblName.Text = Name";
_lblname.setText(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=2752539;
 //BA.debugLineNum = 2752539;BA.debugLine="lblName.TextSize = 20";
_lblname.setTextSize((float) (20));
RDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="lblName.TextColor = Colors.White";
_lblname.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752541;
 //BA.debugLineNum = 2752541;BA.debugLine="lblName.Gravity = Gravity.CENTER";
_lblname.setGravity(__c.Gravity.CENTER);
RDebugUtils.currentLine=2752542;
 //BA.debugLineNum = 2752542;BA.debugLine="header.AddView(lblName,20%x,0,40%x,5%y)";
_header.AddView((android.view.View)(_lblname.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752544;
 //BA.debugLineNum = 2752544;BA.debugLine="lblID.Text = ID";
_lblid.setText(BA.ObjectToCharSequence(_id));
RDebugUtils.currentLine=2752545;
 //BA.debugLineNum = 2752545;BA.debugLine="header.AddView(lblID,5%x,0,5%x,5%y)";
_header.AddView((android.view.View)(_lblid.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (5),ba));
RDebugUtils.currentLine=2752546;
 //BA.debugLineNum = 2752546;BA.debugLine="lblID.Visible = False";
_lblid.setVisible(__c.False);
RDebugUtils.currentLine=2752548;
 //BA.debugLineNum = 2752548;BA.debugLine="lblInfo.Text = Info";
_lblinfo.setText(BA.ObjectToCharSequence(_info));
RDebugUtils.currentLine=2752549;
 //BA.debugLineNum = 2752549;BA.debugLine="lblInfo.TextSize = 15";
_lblinfo.setTextSize((float) (15));
RDebugUtils.currentLine=2752550;
 //BA.debugLineNum = 2752550;BA.debugLine="lblInfo.TextColor = Colors.White";
_lblinfo.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=2752551;
 //BA.debugLineNum = 2752551;BA.debugLine="lblInfo.Color = Colors.rgb(0, 128, 255)";
_lblinfo.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
RDebugUtils.currentLine=2752553;
 //BA.debugLineNum = 2752553;BA.debugLine="Holder.AddView(ViewInfo.ScrollView,0%x,5%y,80%x,1";
_holder.AddView(_viewinfo.getScrollView(),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=2752554;
 //BA.debugLineNum = 2752554;BA.debugLine="ViewInfo.addView(lblInfo,80%x,15%y,0,0,0,0)";
_viewinfo.addView((android.view.View)(_lblinfo.getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=2752555;
 //BA.debugLineNum = 2752555;BA.debugLine="MapOfView.Put(checked.Tag,Holder)";
__ref._mapofview.Put(_checked.getTag(),(Object)(_holder.getObject()));
RDebugUtils.currentLine=2752556;
 //BA.debugLineNum = 2752556;BA.debugLine="chekboxtag = chekboxtag + 1";
__ref._chekboxtag = (int) (__ref._chekboxtag+1);
RDebugUtils.currentLine=2752557;
 //BA.debugLineNum = 2752557;BA.debugLine="Return Holder";
if (true) return _holder;
RDebugUtils.currentLine=2752558;
 //BA.debugLineNum = 2752558;BA.debugLine="End Sub";
return null;
}
}