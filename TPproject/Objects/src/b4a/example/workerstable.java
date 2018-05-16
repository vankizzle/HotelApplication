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
public anywheresoftware.b4a.objects.collections.Map _mapofview = null;
public int _chekboxtag = 0;
public anywheresoftware.b4a.samples.httputils2.httputils2service _httputils2service = null;
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public b4a.example.starter _starter = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 47;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 28;BA.debugLine="TableFakePan.Color = Colors.ARGB(150,0,0,0)";
_tablefakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 29;BA.debugLine="TableHeader.Color = Colors.ARGB(150,0,0,0)";
_tableheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 35;BA.debugLine="WholeScreen.AddView(TableHeader,10%x,15%y,80%x,5%";
_wholescreen.AddView((android.view.View)(_tableheader.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 36;BA.debugLine="WholeScreen.AddView(TableFakePan,TableHeader.Left";
_wholescreen.AddView((android.view.View)(_tablefakepan.getObject()),_tableheader.getLeft(),(int) (_tableheader.getTop()+_tableheader.getHeight()),_tableheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 37;BA.debugLine="WholeScreen.AddView(WorkersHolder.ScrollView,Tabl";
_wholescreen.AddView(_workersholder.getScrollView(),_tableheader.getLeft(),(int) (_tableheader.getTop()+_tableheader.getHeight()),_tableheader.getWidth(),_tablefakepan.getHeight());
 //BA.debugLineNum = 39;BA.debugLine="TableName.Gravity = Gravity.CENTER";
_tablename.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 40;BA.debugLine="TableName.Text = \"My Workers\"";
_tablename.setText(BA.ObjectToCharSequence("My Workers"));
 //BA.debugLineNum = 41;BA.debugLine="TableName.TextColor = Colors.White";
_tablename.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 42;BA.debugLine="TableName.TextSize = 15";
_tablename.setTextSize((float) (15));
 //BA.debugLineNum = 43;BA.debugLine="TableHeader.AddView(TableName,TableHeader.Left +";
_tableheader.AddView((android.view.View)(_tablename.getObject()),(int) (_tableheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (_tableheader.getWidth()/(double)2),_tableheader.getHeight());
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
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
 //BA.debugLineNum = 8;BA.debugLine="Dim MapOfView As Map";
_mapofview = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Dim chekboxtag As Int = 0";
_chekboxtag = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _finished_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub finished_CheckedChange(Checked As Boolean)";
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _getmyworkers(anywheresoftware.b4a.objects.collections.Map _workers) throws Exception{
b4a.example.types._worker _w = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub GetMyWorkers(Workers As Map)";
 //BA.debugLineNum = 51;BA.debugLine="For Each w As worker In Workers.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _workers.Values();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_w = (b4a.example.types._worker)(group1.Get(index1));
 //BA.debugLineNum = 52;BA.debugLine="PanBuilder(w.username,w.available,w.TypeOfWorker";
_panbuilder(_w.username,_w.available,_w.TypeOfWorker,(int)(_w.CurrentTaskID));
 }
};
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 16;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="WorkersHolder.Initialize";
_workersholder.Initialize(ba);
 //BA.debugLineNum = 18;BA.debugLine="TableHeader.Initialize(\"\")";
_tableheader.Initialize(ba,"");
 //BA.debugLineNum = 19;BA.debugLine="TableName.Initialize(\"\")";
_tablename.Initialize(ba,"");
 //BA.debugLineNum = 20;BA.debugLine="TableFakePan.initialize(\"\")";
_tablefakepan.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="MapOfView.Initialize";
_mapofview.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _panbuilder(String _username,boolean _available,int _typeofworker,int _currenttaskid) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.PanelWrapper _header = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
wrappers.MiScrollView _viewcurrenttaskid = null;
anywheresoftware.b4a.objects.LabelWrapper _lblavaileable = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltypeofworker = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _checked = null;
 //BA.debugLineNum = 56;BA.debugLine="Sub PanBuilder(username As String,available As Boo";
 //BA.debugLineNum = 57;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
 //BA.debugLineNum = 59;BA.debugLine="Dim header As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 61;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
 //BA.debugLineNum = 63;BA.debugLine="Dim ViewCurrentTaskID As MiScrollView";
_viewcurrenttaskid = new wrappers.MiScrollView();
 //BA.debugLineNum = 64;BA.debugLine="ViewCurrentTaskID.Initialize";
_viewcurrenttaskid.Initialize(ba);
 //BA.debugLineNum = 65;BA.debugLine="Dim lblAvaileable As Label";
_lblavaileable = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 66;BA.debugLine="lblAvaileable.Initialize(\"\")";
_lblavaileable.Initialize(ba,"");
 //BA.debugLineNum = 67;BA.debugLine="Dim lblTypeOfWorker As Label";
_lbltypeofworker = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 68;BA.debugLine="lblTypeOfWorker.Initialize(\"\")";
_lbltypeofworker.Initialize(ba,"");
 //BA.debugLineNum = 69;BA.debugLine="Dim checked As CheckBox";
_checked = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 70;BA.debugLine="checked.Initialize(\"finished\")";
_checked.Initialize(ba,"finished");
 //BA.debugLineNum = 71;BA.debugLine="Holder.AddView(header,0,0,80%x,5%y)";
_holder.AddView((android.view.View)(_header.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 73;BA.debugLine="header.Color = Colors.rgb(0, 128, 255)";
_header.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 74;BA.debugLine="Holder.Tag = chekboxtag";
_holder.setTag((Object)(_chekboxtag));
 //BA.debugLineNum = 75;BA.debugLine="checked.Tag = chekboxtag";
_checked.setTag((Object)(_chekboxtag));
 //BA.debugLineNum = 76;BA.debugLine="checked.Gravity = Gravity.CENTER";
_checked.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 77;BA.debugLine="header.AddView(checked,70%x,0,10%x,5%y)";
_header.AddView((android.view.View)(_checked.getObject()),__c.PerXToCurrent((float) (70),ba),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 79;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
_lblname.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 80;BA.debugLine="lblName.Text = username";
_lblname.setText(BA.ObjectToCharSequence(_username));
 //BA.debugLineNum = 81;BA.debugLine="lblName.TextSize = 20";
_lblname.setTextSize((float) (20));
 //BA.debugLineNum = 82;BA.debugLine="lblName.TextColor = Colors.White";
_lblname.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 83;BA.debugLine="lblName.Gravity = Gravity.CENTER";
_lblname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 84;BA.debugLine="header.AddView(lblName,20%x,0,40%x,5%y)";
_header.AddView((android.view.View)(_lblname.getObject()),__c.PerXToCurrent((float) (20),ba),(int) (0),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 86;BA.debugLine="lblTypeOfWorker.Text = TypeOfWorker";
_lbltypeofworker.setText(BA.ObjectToCharSequence(_typeofworker));
 //BA.debugLineNum = 87;BA.debugLine="header.AddView(lblTypeOfWorker,5%x,0,5%x,5%y)";
_header.AddView((android.view.View)(_lbltypeofworker.getObject()),__c.PerXToCurrent((float) (5),ba),(int) (0),__c.PerXToCurrent((float) (5),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 88;BA.debugLine="lblTypeOfWorker.Visible = False";
_lbltypeofworker.setVisible(__c.False);
 //BA.debugLineNum = 90;BA.debugLine="lblAvaileable.Text = available";
_lblavaileable.setText(BA.ObjectToCharSequence(_available));
 //BA.debugLineNum = 91;BA.debugLine="lblAvaileable.TextSize = 15";
_lblavaileable.setTextSize((float) (15));
 //BA.debugLineNum = 92;BA.debugLine="lblAvaileable.TextColor = Colors.White";
_lblavaileable.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 93;BA.debugLine="lblAvaileable.Color = Colors.rgb(0, 128, 255)";
_lblavaileable.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 95;BA.debugLine="Holder.AddView(ViewCurrentTaskID.ScrollView,0%x,5";
_holder.AddView(_viewcurrenttaskid.getScrollView(),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 96;BA.debugLine="MapOfView.Put(checked.Tag,Holder)";
_mapofview.Put(_checked.getTag(),(Object)(_holder.getObject()));
 //BA.debugLineNum = 97;BA.debugLine="chekboxtag = chekboxtag + 1";
_chekboxtag = (int) (_chekboxtag+1);
 //BA.debugLineNum = 98;BA.debugLine="Return Holder";
if (true) return _holder;
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
