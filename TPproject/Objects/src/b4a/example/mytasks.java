package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mytasks extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.mytasks");
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _wholescreen = null;
public wrappers.MiScrollView _taskholder = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskheader = null;
public anywheresoftware.b4a.objects.LabelWrapper _tablename = null;
public anywheresoftware.b4a.objects.PanelWrapper _taskfakepan = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _asview() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AsView As View";
 //BA.debugLineNum = 34;BA.debugLine="Return WholeScreen";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_wholescreen.getObject()));
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 20;BA.debugLine="TaskFakePan.Color = Colors.ARGB(150,0,0,0)";
_taskfakepan.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 21;BA.debugLine="TaskHeader.Color = Colors.ARGB(150,0,0,0)";
_taskheader.setColor(__c.Colors.ARGB((int) (150),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 22;BA.debugLine="WholeScreen.AddView(TaskHeader,10%x,15%y,80%x,5%y";
_wholescreen.AddView((android.view.View)(_taskheader.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 23;BA.debugLine="WholeScreen.AddView(TaskFakePan,TaskHeader.Left,T";
_wholescreen.AddView((android.view.View)(_taskfakepan.getObject()),_taskheader.getLeft(),(int) (_taskheader.getTop()+_taskheader.getHeight()),_taskheader.getWidth(),__c.PerYToCurrent((float) (60),ba));
 //BA.debugLineNum = 24;BA.debugLine="WholeScreen.AddView(TaskHolder.ScrollView,TaskHea";
_wholescreen.AddView(_taskholder.getScrollView(),_taskheader.getLeft(),(int) (_taskheader.getTop()+_taskheader.getHeight()),_taskheader.getWidth(),_taskfakepan.getHeight());
 //BA.debugLineNum = 26;BA.debugLine="TableName.Gravity = Gravity.CENTER";
_tablename.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 27;BA.debugLine="TableName.Text = \"My Tasks\"";
_tablename.setText(BA.ObjectToCharSequence("My Tasks"));
 //BA.debugLineNum = 28;BA.debugLine="TableName.TextColor = Colors.White";
_tablename.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 29;BA.debugLine="TableName.TextSize = 15";
_tablename.setTextSize((float) (15));
 //BA.debugLineNum = 30;BA.debugLine="TaskHeader.AddView(TableName,TaskHeader.Left + 10";
_taskheader.AddView((android.view.View)(_tablename.getObject()),(int) (_taskheader.getLeft()+__c.PerXToCurrent((float) (10),ba)),(int) (0),(int) (_taskheader.getWidth()/(double)2),_taskheader.getHeight());
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _getmytasks(anywheresoftware.b4a.objects.collections.Map _acceptedtasks) throws Exception{
b4a.example.types._task _v = null;
 //BA.debugLineNum = 37;BA.debugLine="Public Sub GetMyTasks(AcceptedTasks As Map)";
 //BA.debugLineNum = 38;BA.debugLine="TaskHolder.removeAllViews";
_taskholder.removeAllViews();
 //BA.debugLineNum = 39;BA.debugLine="For Each v As Task In AcceptedTasks.Values";
{
final anywheresoftware.b4a.BA.IterableList group2 = _acceptedtasks.Values();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (b4a.example.types._task)(group2.Get(index2));
 //BA.debugLineNum = 41;BA.debugLine="TaskHolder.addView(PanBuilder(v.TaskID,v.TaskNam";
_taskholder.addView((android.view.View)(_panbuilder(_v.TaskID,_v.TaskName,_v.TaskType,_v.TaskInfo).getObject()),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (2)));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="WholeScreen.Initialize(\"\")";
_wholescreen.Initialize(ba,"");
 //BA.debugLineNum = 12;BA.debugLine="TaskHolder.Initialize";
_taskholder.Initialize(ba);
 //BA.debugLineNum = 13;BA.debugLine="TaskHeader.Initialize(\"\")";
_taskheader.Initialize(ba,"");
 //BA.debugLineNum = 14;BA.debugLine="TableName.Initialize(\"\")";
_tablename.Initialize(ba,"");
 //BA.debugLineNum = 15;BA.debugLine="TaskFakePan.initialize(\"\")";
_taskfakepan.Initialize(ba,"");
 //BA.debugLineNum = 16;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _panbuilder(int _id,String _name,int _tasktype,String _info) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _holder = null;
anywheresoftware.b4a.objects.LabelWrapper _lblid = null;
anywheresoftware.b4a.objects.LabelWrapper _lblname = null;
wrappers.MiScrollView _viewinfo = null;
anywheresoftware.b4a.objects.LabelWrapper _lblinfo = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub PanBuilder(ID As Int,Name As String,TaskType A";
 //BA.debugLineNum = 46;BA.debugLine="Dim Holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Holder.Initialize(\"\")";
_holder.Initialize(ba,"");
 //BA.debugLineNum = 48;BA.debugLine="Dim lblID As Label";
_lblid = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 49;BA.debugLine="lblID.Initialize(\"\")";
_lblid.Initialize(ba,"");
 //BA.debugLineNum = 50;BA.debugLine="Dim lblName As Label";
_lblname = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 51;BA.debugLine="lblName.Initialize(\"\")";
_lblname.Initialize(ba,"");
 //BA.debugLineNum = 52;BA.debugLine="Dim ViewInfo As MiScrollView";
_viewinfo = new wrappers.MiScrollView();
 //BA.debugLineNum = 53;BA.debugLine="ViewInfo.Initialize";
_viewinfo.Initialize(ba);
 //BA.debugLineNum = 54;BA.debugLine="Dim lblInfo As Label";
_lblinfo = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="lblInfo.Initialize(\"\")";
_lblinfo.Initialize(ba,"");
 //BA.debugLineNum = 57;BA.debugLine="lblID.Color = Colors.rgb(0, 128, 255)";
_lblid.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 58;BA.debugLine="lblID.Text = ID";
_lblid.setText(BA.ObjectToCharSequence(_id));
 //BA.debugLineNum = 59;BA.debugLine="lblID.TextSize = 20";
_lblid.setTextSize((float) (20));
 //BA.debugLineNum = 60;BA.debugLine="lblID.TextColor = Colors.White";
_lblid.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 61;BA.debugLine="lblID.Gravity = Gravity.CENTER";
_lblid.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 62;BA.debugLine="Holder.AddView(lblID,0,0,10%x,15%y)";
_holder.AddView((android.view.View)(_lblid.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba));
 //BA.debugLineNum = 64;BA.debugLine="lblName.Color = Colors.rgb(0, 128, 255)";
_lblname.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 65;BA.debugLine="lblName.Text = Name";
_lblname.setText(BA.ObjectToCharSequence(_name));
 //BA.debugLineNum = 66;BA.debugLine="lblName.TextSize = 20";
_lblname.setTextSize((float) (20));
 //BA.debugLineNum = 67;BA.debugLine="lblName.TextColor = Colors.White";
_lblname.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 68;BA.debugLine="lblName.Gravity = Gravity.CENTER";
_lblname.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 69;BA.debugLine="Holder.AddView(lblName,0%x,0,80%x,5%y)";
_holder.AddView((android.view.View)(_lblname.getObject()),__c.PerXToCurrent((float) (0),ba),(int) (0),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (5),ba));
 //BA.debugLineNum = 71;BA.debugLine="lblInfo.Text = Info";
_lblinfo.setText(BA.ObjectToCharSequence(_info));
 //BA.debugLineNum = 72;BA.debugLine="lblInfo.TextSize = 15";
_lblinfo.setTextSize((float) (15));
 //BA.debugLineNum = 73;BA.debugLine="lblInfo.TextColor = Colors.White";
_lblinfo.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 74;BA.debugLine="lblInfo.Color = Colors.rgb(0, 128, 255)";
_lblinfo.setColor(__c.Colors.RGB((int) (0),(int) (128),(int) (255)));
 //BA.debugLineNum = 76;BA.debugLine="Holder.AddView(ViewInfo.ScrollView,10%x,5%y,70%x,";
_holder.AddView(_viewinfo.getScrollView(),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (70),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 77;BA.debugLine="ViewInfo.addView(lblInfo,70%x,15%y,0,0,0,0)";
_viewinfo.addView((android.view.View)(_lblinfo.getObject()),__c.PerXToCurrent((float) (70),ba),__c.PerYToCurrent((float) (15),ba),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 79;BA.debugLine="Return Holder";
if (true) return _holder;
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
