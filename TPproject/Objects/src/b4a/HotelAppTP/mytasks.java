package b4a.HotelAppTP;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mytasks extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.HotelAppTP.mytasks");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.HotelAppTP.mytasks.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.HotelAppTP.main _main = null;
public b4a.HotelAppTP.types _types = null;
public b4a.HotelAppTP.helperfunctions1 _helperfunctions1 = null;
public b4a.HotelAppTP.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 47;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 28;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
_taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 29;BA.debugLine="TaskHeader.Color = Colors.ARGB(150,0,0,0)";
_taskheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 30;BA.debugLine="FinishBtn.Color = Colors.rgb(41, 163, 41)";
_finishbtn.setColor(__c.Colors.RGB((int) (41),(int) (163),(int) (41)));
 //BA.debugLineNum = 31;BA.debugLine="FinishBtn.Gravity =Gravity.CENTER";
_finishbtn.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 32;BA.debugLine="FinishBtn.Text = \"Finish\"";
_finishbtn.setText(BA.ObjectToCharSequence("Finish"));
 //BA.debugLineNum = 33;BA.debugLine="FinishBtn.TextSize = 25";
_finishbtn.setTextSize((float) (25));
 //BA.debugLineNum = 34;BA.debugLine="FinishBtn.Enabled = False";
_finishbtn.setEnabled(__c.False);
 //BA.debugLineNum = 35;BA.debugLine="WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y";
_wholescreen.AddView((android.view.View)(_taskheader.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 36;BA.debugLine="WholeScreen.AddView(TaskFakePan,TaskHeader.Left,T";
_wholescreen.AddView((android.view.View)(_taskfakepan.getObject()),_taskheader.getLeft(),(int) (_taskheader.getTop()+_taskheader.getHeight()),_taskheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 37;BA.debugLine="WholeScreen.AddView(TaskHolder.ScrollView,TaskHea";
_wholescreen.AddView(_taskholder.getScrollView(),_taskheader.getLeft(),(int) (_taskheader.getTop()+_taskheader.getHeight()),_taskheader.getWidth(),_taskfakepan.getHeight());
 //BA.debugLineNum = 38;BA.debugLine="WholeScreen.AddView(FinishBtn,TaskHeader.Left,Tas";
_wholescreen.AddView((android.view.View)(_finishbtn.getObject()),_taskheader.getLeft(),(int) (_taskfakepan.getTop()+_taskfakepan.getHeight()),_taskfakepan.getWidth(),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 39;BA.debugLine="TableName.Gravity = Gravity.CENTER";
_tablename.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 40;BA.debugLine="TableName.Text = \"My Tasks\"";
_tablename.setText(BA.ObjectToCharSequence("My Tasks"));
 //BA.debugLineNum = 41;BA.debugLine="TableName.TextColor = Colors.White";
_tablename.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 42;BA.debugLine="TableName.TextSize = 15";
_tablename.setTextSize((float) (15));
 //BA.debugLineNum = 43;BA.debugLine="TaskHeader.AddView(TableName,TaskHeader.Left + 10";
_taskheader.AddView((android.view.View)(_tablename.getObject()),(int) (_taskheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (_taskheader.getWidth()/(double)2),_taskheader.getHeight());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim WholeScreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Dim TaskHolder As MiScrollView";
_taskholder = new wrappers.MiScrollView();
 //BA.debugLineNum = 4;BA.debugLine="Dim TaskHeader As Panel";
_taskheader = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim TableName As Label";
_tablename = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim TaskFakePan As Panel";
_taskfakepan = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim FinishBtn As Button";
_finishbtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim MapOfView As Map";
_mapofview = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Dim ViewToRemove As Map";
_viewtoremove = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Dim chekboxtag As Int = 0";
_chekboxtag = (int) (0);
 //BA.debugLineNum = 11;BA.debugLine="Dim checkNumbers As Int = 0";
_checknumbers = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _finish_click() throws Exception{
int _i = 0;
int _k = 0;
anywheresoftware.b4a.objects.PanelWrapper _v = null;
 //BA.debugLineNum = 143;BA.debugLine="Sub Finish_Click";
 //BA.debugLineNum = 144;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(_viewtoremove));
 //BA.debugLineNum = 145;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(_mapofview));
 //BA.debugLineNum = 147;BA.debugLine="For i = 0 To ViewToRemove.Size - 1";
{
final int step3 = 1;
final int limit3 = (int) (_viewtoremove.getSize()-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 148;BA.debugLine="Types.currentuser.CurrentTaskID(i) = 0";
_types._currentuser.CurrentTaskID[_i] = (int) (0);
 }
};
 //BA.debugLineNum = 151;BA.debugLine="Types.currentuser.CurrentTaskID(0) = 5";
_types._currentuser.CurrentTaskID[(int) (0)] = (int) (5);
 //BA.debugLineNum = 152;BA.debugLine="For Each k As Int In ViewToRemove.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _viewtoremove.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = (int)(BA.ObjectToNumber(group7.Get(index7)));
 //BA.debugLineNum = 153;BA.debugLine="If MapOfView.ContainsKey(k) Then";
if (_mapofview.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 154;BA.debugLine="MapOfView.Remove(k)";
_mapofview.Remove((Object)(_k));
 };
 }
};
 //BA.debugLineNum = 158;BA.debugLine="For Each v As Panel In ViewToRemove.Values";
_v = new anywheresoftware.b4a.objects.PanelWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _viewtoremove.Values();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v.setObject((android.view.ViewGroup)(group12.Get(index12)));
 //BA.debugLineNum = 159;BA.debugLine="v.RemoveAllViews";
_v.RemoveAllViews();
 //BA.debugLineNum = 160;BA.debugLine="v.RemoveView";
_v.RemoveView();
 }
};
 //BA.debugLineNum = 163;BA.debugLine="ViewToRemove.Clear";
_viewtoremove.Clear();
 //BA.debugLineNum = 165;BA.debugLine="Log(\"???????????????\")";
__c.Log("???????????????");
 //BA.debugLineNum = 166;BA.debugLine="Log(ViewToRemove)";
__c.Log(BA.ObjectToString(_viewtoremove));
 //BA.debugLineNum = 167;BA.debugLine="Log(MapOfView)";
__c.Log(BA.ObjectToString(_mapofview));
 //BA.debugLineNum = 169;BA.debugLine="FinishBtn.Enabled = False";
_finishbtn.setEnabled(__c.False);
 //BA.debugLineNum = 171;BA.debugLine="If MapOfView.Size = 0 Then";
if (_mapofview.getSize()==0) { 
 //BA.debugLineNum = 172;BA.debugLine="MapOfView.Clear";
_mapofview.Clear();
 //BA.debugLineNum = 173;BA.debugLine="ViewToRemove.Clear";
_viewtoremove.Clear();
 //BA.debugLineNum = 174;BA.debugLine="CallSub(Main,\"SetUserAvailable\")";
__c.CallSubNew(ba,(Object)(_main.getObject()),"SetUserAvailable");
 };
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return "";
}
public String  _finished_checkedchange(boolean _checked) throws Exception{
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _cbox = null;
int _k = 0;
 //BA.debugLineNum = 118;BA.debugLine="Sub finished_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 119;BA.debugLine="Dim cbox As CheckBox = Sender";
_cbox = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_cbox.setObject((android.widget.CheckBox)(__c.Sender(ba)));
 //BA.debugLineNum = 121;BA.debugLine="If Checked = True Then";
if (_checked==__c.True) { 
 //BA.debugLineNum = 122;BA.debugLine="FinishBtn.Enabled = True";
_finishbtn.setEnabled(__c.True);
 //BA.debugLineNum = 123;BA.debugLine="checkNumbers = checkNumbers + 1";
_checknumbers = (int) (_checknumbers+1);
 //BA.debugLineNum = 124;BA.debugLine="For Each k As Int In MapOfView.Keys";
{
final anywheresoftware.b4a.BA.IterableList group5 = _mapofview.Keys();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_k = (int)(BA.ObjectToNumber(group5.Get(index5)));
 //BA.debugLineNum = 125;BA.debugLine="If cbox.Tag = k Then";
if ((_cbox.getTag()).equals((Object)(_k))) { 
 //BA.debugLineNum = 126;BA.debugLine="ToastMessageShow(\"You selected task \" & k,Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("You selected task "+BA.NumberToString(_k)),__c.False);
 //BA.debugLineNum = 127;BA.debugLine="ViewToRemove.Put(k,MapOfView.Get(k))";
_viewtoremove.Put((Object)(_k),_mapofview.Get((Object)(_k)));
 };
 }
};
 }else {
 //BA.debugLineNum = 131;BA.debugLine="Checked = False";
_checked = __c.False;
 //BA.debugLineNum = 132;BA.debugLine="checkNumbers = checkNumbers - 1";
_checknumbers = (int) (_checknumbers-1);
 //BA.debugLineNum = 133;BA.debugLine="ViewToRemove.Remove(cbox.tag)";
_viewtoremove.Remove(_cbox.getTag());
 //BA.debugLineNum = 135;BA.debugLine="If 	checkNumbers = 0 Then";
if (_checknumbers==0) { 
 //BA.debugLineNum = 136;BA.debugLine="FinishBtn.Enabled = False";
_finishbtn.setEnabled(__c.False);
 };
 };
 //BA.debugLineNum = 140;BA.debugLine="Log(\"Checked = \"& checkNumbers)";
__c.Log("Checked = "+BA.NumberToString(_checknumbers));
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _getmytasks(anywheresoftware.b4a.objects.collections.Map _acceptedtasks) throws Exception{
int _i = 0;
b4a.HotelAppTP.types._task _v = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GetMyTasks(AcceptedTasks As Map)";
 //BA.debugLineNum = 51;BA.debugLine="For i = 0 To MapOfView.Size";
{
final int step1 = 1;
final int limit1 = _mapofview.getSize();
_i = (int) (0) ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
 //BA.debugLineNum = 52;BA.debugLine="MapOfView.Remove(i)";
_mapofview.Remove((Object)(_i));
 }
};
 //BA.debugLineNum = 54;BA.debugLine="TaskHolder.removeAllViews";
_taskholder.removeAllViews();
 //BA.debugLineNum = 55;BA.debugLine="For Each v As Task In AcceptedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _acceptedtasks.Values();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v = (b4a.HotelAppTP.types._task)(group5.Get(index5));
 //BA.debugLineNum = 56;BA.debugLine="TaskHolder.addView(PanBuilder(v.TaskID,v.TaskInf";
_taskholder.addView((android.view.View)(_panbuilder(_v.TaskID,_v.TaskInfo,_v.Status).getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 }
};
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 16;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="TaskHolder.Initialize";
_taskholder.Initialize(ba);
 //BA.debugLineNum = 18;BA.debugLine="TaskHeader.Initialize(\"\")";
_taskheader.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="TableName.Initialize(\"\")";
_tablename.Initialize(ba,"");
 //BA.debugLineNum = 20;BA.debugLine="TaskFakePan.initialize(\"\")";
_taskfakepan.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="FinishBtn.Initialize(\"Finish\")";
_finishbtn.Initialize(ba,"Finish");
 //BA.debugLineNum = 22;BA.debugLine="MapOfView.Initialize";
_mapofview.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="ViewToRemove.Initialize";
_viewtoremove.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _panbuilder(int _id,String _info,String _status) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.PanelWrapper _header = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
wrappers.MiScrollView _viewinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
anywheresoftware.b4a.objects.LabelWrapper _lblstatus = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub PanBuilder(ID As Int,Info As String,Status As";
 //BA.debugLineNum = 62;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="Dim header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 67;BA.debugLine="header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 68;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
 //BA.debugLineNum = 70;BA.debugLine="Dim ViewInfo As MiScrollView";
_viewinfo = new wrappers.MiScrollView();
 //BA.debugLineNum = 71;BA.debugLine="ViewInfo.Initialize";
_viewinfo.Initialize(ba);
 //BA.debugLineNum = 72;BA.debugLine="Dim lblInfo As Label";
_lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 73;BA.debugLine="lblInfo.Initialize(\"\")";
_lblinfo.Initialize(ba,"");
 //BA.debugLineNum = 74;BA.debugLine="Dim lblID As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 75;BA.debugLine="lblID.Initialize(\"\")";
_lblid.Initialize(ba,"");
 //BA.debugLineNum = 76;BA.debugLine="Dim lblStatus As Label";
_lblstatus = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 77;BA.debugLine="lblStatus.Initialize(\"\")";
_lblstatus.Initialize(ba,"");
 //BA.debugLineNum = 78;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 79;BA.debugLine="checked.Initialize(\"finished\")";
_checked.Initialize(ba,"finished");
 //BA.debugLineNum = 80;BA.debugLine="Holder.AddView(header,0,0,80%x,5%y)";
_holder.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 82;BA.debugLine="header.Color = Colors.rgb(0, 128, 255)";
_header.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 83;BA.debugLine="Holder.Tag = chekboxtag";
_holder.setTag((Object)(_chekboxtag));
 //BA.debugLineNum = 84;BA.debugLine="checked.Tag = chekboxtag";
_checked.setTag((Object)(_chekboxtag));
 //BA.debugLineNum = 85;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 86;BA.debugLine="header.AddView(checked,70%x,0,10%x,5%y)";
_header.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 88;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
_lblname.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 89;BA.debugLine="lblName.Text = \"ID:\" & ID";
_lblname.setText(BA.ObjectToCharSequence("ID:"+BA.NumberToString(_id)));
 //BA.debugLineNum = 90;BA.debugLine="lblName.TextSize = 20";
_lblname.setTextSize((float) (20));
 //BA.debugLineNum = 91;BA.debugLine="lblName.TextColor = Colors.White";
_lblname.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 92;BA.debugLine="lblName.Gravity = Gravity.CENTER";
_lblname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 93;BA.debugLine="header.AddView(lblName,0%x,0,30%x,5%y)";
_header.AddView((android.view.View)(_lblname.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 99;BA.debugLine="lblInfo.Text = Info";
_lblinfo.setText(BA.ObjectToCharSequence(_info));
 //BA.debugLineNum = 100;BA.debugLine="lblInfo.TextSize = 15";
_lblinfo.setTextSize((float) (15));
 //BA.debugLineNum = 101;BA.debugLine="lblInfo.TextColor = Colors.White";
_lblinfo.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 102;BA.debugLine="lblInfo.Color = Colors.rgb(0, 128, 255)";
_lblinfo.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 104;BA.debugLine="lblStatus.Text = Status";
_lblstatus.setText(BA.ObjectToCharSequence(_status));
 //BA.debugLineNum = 105;BA.debugLine="lblStatus.TextSize = 20";
_lblstatus.setTextSize((float) (20));
 //BA.debugLineNum = 106;BA.debugLine="lblStatus.TextColor = Colors.White";
_lblstatus.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 107;BA.debugLine="lblStatus.Gravity = Gravity.CENTER";
_lblstatus.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 108;BA.debugLine="lblStatus.Color = Colors.rgb(0, 128, 255)";
_lblstatus.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 109;BA.debugLine="header.AddView(lblStatus,30%x,0,40%x,5%y)";
_header.AddView((android.view.View)(_lblstatus.getObject()),__c.PerXToCurrent((float) (30),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 111;BA.debugLine="Holder.AddView(ViewInfo.ScrollView,0%x,5%y,80%x,1";
_holder.AddView(_viewinfo.getScrollView(),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 112;BA.debugLine="ViewInfo.addView(lblInfo,80%x,15%y,0,0,0,0)";
_viewinfo.addView((android.view.View)(_lblinfo.getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 113;BA.debugLine="MapOfView.Put(checked.Tag,Holder)";
_mapofview.Put(_checked.getTag(),(Object)(_holder.getObject()));
 //BA.debugLineNum = 114;BA.debugLine="chekboxtag = chekboxtag + 1";
_chekboxtag = (int) (_chekboxtag+1);
 //BA.debugLineNum = 115;BA.debugLine="Return Holder";
if (true) return _holder;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
