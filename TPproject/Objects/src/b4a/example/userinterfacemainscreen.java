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
public anywheresoftware.b4a.objects.LabelWrapper _usernamelbl = null;
public anywheresoftware.b4a.objects.LabelWrapper _availability = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _tableofrequests = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.types _types = null;
public anywheresoftware.b4a.objects.PanelWrapper  _asview() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub AsView As Panel";
 //BA.debugLineNum = 46;BA.debugLine="Return wholescreen";
if (true) return _wholescreen;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public String  _avail_click() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub avail_Click";
 //BA.debugLineNum = 50;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 51;BA.debugLine="Main.currentuser.available = True";
_main._currentuser.available = __c.True;
 }else {
 //BA.debugLineNum = 53;BA.debugLine="Main.currentuser.available = False";
_main._currentuser.available = __c.False;
 };
 //BA.debugLineNum = 56;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 57;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 59;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _buildui() throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub BuildUI";
 //BA.debugLineNum = 24;BA.debugLine="usernamelbl.Textcolor = Colors.White";
_usernamelbl.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 25;BA.debugLine="usernamelbl.Gravity = Gravity.CENTER";
_usernamelbl.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 26;BA.debugLine="usernamelbl.Text = Main.currentuser.username";
_usernamelbl.setText(BA.ObjectToCharSequence(_main._currentuser.username));
 //BA.debugLineNum = 27;BA.debugLine="usernamelbl.TextSize = 30";
_usernamelbl.setTextSize((float) (30));
 //BA.debugLineNum = 28;BA.debugLine="wholescreen.AddView(usernamelbl,10%x,5%y,30%x,10%";
_wholescreen.AddView((android.view.View)(_usernamelbl.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (30),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 30;BA.debugLine="availability.TextColor = Colors.White";
_availability.setTextColor(__c.Colors.White);
 //BA.debugLineNum = 31;BA.debugLine="availability.Gravity = Gravity.CENTER";
_availability.setGravity(__c.Gravity.CENTER);
 //BA.debugLineNum = 32;BA.debugLine="availability.TextSize = 25";
_availability.setTextSize((float) (25));
 //BA.debugLineNum = 33;BA.debugLine="If Main.currentuser.available = False Then";
if (_main._currentuser.available==__c.False) { 
 //BA.debugLineNum = 34;BA.debugLine="availability.Text = \"Status: Busy\"";
_availability.setText(BA.ObjectToCharSequence("Status: Busy"));
 }else {
 //BA.debugLineNum = 36;BA.debugLine="availability.Text = \"Status: Available\"";
_availability.setText(BA.ObjectToCharSequence("Status: Available"));
 };
 //BA.debugLineNum = 38;BA.debugLine="wholescreen.AddView(availability,40%x,5%y,50%x,10";
_wholescreen.AddView((android.view.View)(_availability.getObject()),__c.PerXToCurrent((float) (40),ba),__c.PerYToCurrent((float) (5),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (10),ba));
 //BA.debugLineNum = 40;BA.debugLine="tableofrequests.Color = Colors.White";
_tableofrequests.setColor(__c.Colors.White);
 //BA.debugLineNum = 41;BA.debugLine="wholescreen.AddView(tableofrequests,10%x,15%y,80%";
_wholescreen.AddView((android.view.View)(_tableofrequests.getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (15),ba),__c.PerXToCurrent((float) (80),ba),__c.PerYToCurrent((float) (70),ba));
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Dim  wholescreen As Panel";
_wholescreen = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Dim usernamelbl As Label";
_usernamelbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim availability As Label";
_availability = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim tableofrequests As ScrollView";
_tableofrequests = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 13;BA.debugLine="wholescreen.Initialize(\"screenview\")";
_wholescreen.Initialize(ba,"screenview");
 //BA.debugLineNum = 14;BA.debugLine="wholescreen.Color = Colors.Black";
_wholescreen.setColor(__c.Colors.Black);
 //BA.debugLineNum = 16;BA.debugLine="usernamelbl.Initialize(\"username\")";
_usernamelbl.Initialize(ba,"username");
 //BA.debugLineNum = 17;BA.debugLine="availability.Initialize(\"avail\")";
_availability.Initialize(ba,"avail");
 //BA.debugLineNum = 18;BA.debugLine="tableofrequests.Initialize(100%y)";
_tableofrequests.Initialize(ba,__c.PerYToCurrent((float) (100),ba));
 //BA.debugLineNum = 20;BA.debugLine="BuildUI";
_buildui();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
