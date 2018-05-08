package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class helperfunctions1_subs_0 {


public static RemoteObject  _apply_viewstyle(RemoteObject _ba,RemoteObject _control,RemoteObject _textcolor,RemoteObject _colora,RemoteObject _colorb,RemoteObject _colorpresseda,RemoteObject _colorpressedb,RemoteObject _colordisableda,RemoteObject _colordisabledb,RemoteObject _cornerround) throws Exception{
try {
		Debug.PushSubsStack("Apply_ViewStyle (helperfunctions1) ","helperfunctions1",5,_ba,helperfunctions1.mostCurrent,5);
if (RapidSub.canDelegate("apply_viewstyle")) return b4a.example.helperfunctions1.remoteMe.runUserSub(false, "helperfunctions1","apply_viewstyle", _ba, _control, _textcolor, _colora, _colorb, _colorpresseda, _colorpressedb, _colordisableda, _colordisabledb, _cornerround);
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _txt = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
RemoteObject _sp = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
;
Debug.locals.put("Control", _control);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("ColorA", _colora);
Debug.locals.put("ColorB", _colorb);
Debug.locals.put("ColorPressedA", _colorpresseda);
Debug.locals.put("ColorPressedB", _colorpressedb);
Debug.locals.put("ColorDisabledA", _colordisableda);
Debug.locals.put("ColorDisabledB", _colordisabledb);
Debug.locals.put("CornerRound", _cornerround);
 BA.debugLineNum = 5;BA.debugLine="Public Sub Apply_ViewStyle (Control As View, TextC";
Debug.ShouldStop(16);
 BA.debugLineNum = 6;BA.debugLine="If Control Is Button Then			'Handle controls with";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("android.widget.Button"))) { 
 BA.debugLineNum = 7;BA.debugLine="Private btn As Button = Control";
Debug.ShouldStop(64);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn.setObject(_control.getObject());Debug.locals.put("btn", _btn);
 BA.debugLineNum = 8;BA.debugLine="btn.TextColor = TextColor";
Debug.ShouldStop(128);
_btn.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 10;BA.debugLine="If Control Is EditText Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("android.widget.EditText"))) { 
 BA.debugLineNum = 11;BA.debugLine="Private txt As EditText = Control";
Debug.ShouldStop(1024);
_txt = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
_txt.setObject(_control.getObject());Debug.locals.put("txt", _txt);
 BA.debugLineNum = 12;BA.debugLine="txt.TextColor = TextColor";
Debug.ShouldStop(2048);
_txt.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 14;BA.debugLine="If Control Is Spinner Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("i",_control.getObjectOrNull(), RemoteObject.createImmutable("anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner"))) { 
 BA.debugLineNum = 15;BA.debugLine="Private sp As Spinner = Control";
Debug.ShouldStop(16384);
_sp = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
_sp.setObject(_control.getObject());Debug.locals.put("sp", _sp);
 BA.debugLineNum = 16;BA.debugLine="sp.TextColor = TextColor";
Debug.ShouldStop(32768);
_sp.runMethod(true,"setTextColor",_textcolor);
 };
 BA.debugLineNum = 19;BA.debugLine="Control.Background = Helper_Gradient(ColorA, Colo";
Debug.ShouldStop(262144);
_control.runMethod(false,"setBackground",(_helper_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
 BA.debugLineNum = 20;BA.debugLine="Remove_Padding(Control)";
Debug.ShouldStop(524288);
_remove_padding(_ba,(_control.getObject()));
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _helper_gradient(RemoteObject _ba,RemoteObject _colora,RemoteObject _colorb,RemoteObject _colorpresseda,RemoteObject _colorpressedb,RemoteObject _colordisableda,RemoteObject _colordisabledb,RemoteObject _cornerround) throws Exception{
try {
		Debug.PushSubsStack("Helper_Gradient (helperfunctions1) ","helperfunctions1",5,_ba,helperfunctions1.mostCurrent,22);
if (RapidSub.canDelegate("helper_gradient")) return b4a.example.helperfunctions1.remoteMe.runUserSub(false, "helperfunctions1","helper_gradient", _ba, _colora, _colorb, _colorpresseda, _colorpressedb, _colordisableda, _colordisabledb, _cornerround);
RemoteObject _colsenabled = null;
RemoteObject _gdwenabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colspressed = null;
RemoteObject _gdwpressed = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _colsdisabled = null;
RemoteObject _gdwdisabled = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _stdgradient = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.StateListDrawable");
RemoteObject _states = null;
;
Debug.locals.put("ColorA", _colora);
Debug.locals.put("ColorB", _colorb);
Debug.locals.put("ColorPressedA", _colorpresseda);
Debug.locals.put("ColorPressedB", _colorpressedb);
Debug.locals.put("ColorDisabledA", _colordisableda);
Debug.locals.put("ColorDisabledB", _colordisabledb);
Debug.locals.put("CornerRound", _cornerround);
 BA.debugLineNum = 22;BA.debugLine="Private Sub Helper_Gradient(ColorA As Int, ColorB";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Private colsEnabled(2) As Int				'Дефинира два цв";
Debug.ShouldStop(4194304);
_colsenabled = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsEnabled", _colsenabled);
 BA.debugLineNum = 24;BA.debugLine="colsEnabled(0) = ColorA";
Debug.ShouldStop(8388608);
_colsenabled.setArrayElement (_colora,BA.numberCast(int.class, 0));
 BA.debugLineNum = 25;BA.debugLine="colsEnabled(1) = ColorB";
Debug.ShouldStop(16777216);
_colsenabled.setArrayElement (_colorb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 26;BA.debugLine="Private gdwEnabled As GradientDrawable		'Дефинира";
Debug.ShouldStop(33554432);
_gdwenabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwEnabled", _gdwenabled);
 BA.debugLineNum = 27;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
Debug.ShouldStop(67108864);
_gdwenabled.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colsenabled));
 BA.debugLineNum = 28;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
Debug.ShouldStop(134217728);
_gdwenabled.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 29;BA.debugLine="Private colsPressed(2) As Int				'Дефинира два цв";
Debug.ShouldStop(268435456);
_colspressed = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsPressed", _colspressed);
 BA.debugLineNum = 30;BA.debugLine="colsPressed(0) = ColorPressedA";
Debug.ShouldStop(536870912);
_colspressed.setArrayElement (_colorpresseda,BA.numberCast(int.class, 0));
 BA.debugLineNum = 31;BA.debugLine="colsPressed(1) = ColorPressedB";
Debug.ShouldStop(1073741824);
_colspressed.setArrayElement (_colorpressedb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 32;BA.debugLine="Private gdwPressed As GradientDrawable		'Дефинира";
Debug.ShouldStop(-2147483648);
_gdwpressed = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwPressed", _gdwpressed);
 BA.debugLineNum = 33;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
Debug.ShouldStop(1);
_gdwpressed.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colspressed));
 BA.debugLineNum = 34;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
Debug.ShouldStop(2);
_gdwpressed.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 35;BA.debugLine="Private colsDisabled(2) As Int				'Дефинира два ц";
Debug.ShouldStop(4);
_colsdisabled = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("colsDisabled", _colsdisabled);
 BA.debugLineNum = 36;BA.debugLine="colsDisabled(0) = ColorDisabledA";
Debug.ShouldStop(8);
_colsdisabled.setArrayElement (_colordisableda,BA.numberCast(int.class, 0));
 BA.debugLineNum = 37;BA.debugLine="colsDisabled(1) = ColorDisabledB";
Debug.ShouldStop(16);
_colsdisabled.setArrayElement (_colordisabledb,BA.numberCast(int.class, 1));
 BA.debugLineNum = 38;BA.debugLine="Private gdwDisabled As GradientDrawable		'Дефинир";
Debug.ShouldStop(32);
_gdwdisabled = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("gdwDisabled", _gdwdisabled);
 BA.debugLineNum = 39;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
Debug.ShouldStop(64);
_gdwdisabled.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TOP_BOTTOM")),(Object)(_colsdisabled));
 BA.debugLineNum = 40;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
Debug.ShouldStop(128);
_gdwdisabled.runVoidMethod ("setCornerRadius",BA.numberCast(float.class, _cornerround));
 BA.debugLineNum = 41;BA.debugLine="Private stdGradient As StateListDrawable	'Дефинир";
Debug.ShouldStop(256);
_stdgradient = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.StateListDrawable");Debug.locals.put("stdGradient", _stdgradient);
 BA.debugLineNum = 42;BA.debugLine="stdGradient.Initialize";
Debug.ShouldStop(512);
_stdgradient.runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="Private states(2) As Int";
Debug.ShouldStop(1024);
_states = RemoteObject.createNewArray ("int", new int[] {2}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 44;BA.debugLine="states(0) = stdGradient.State_Enabled";
Debug.ShouldStop(2048);
_states.setArrayElement (_stdgradient.getField(true,"State_Enabled"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 45;BA.debugLine="states(1) = -stdGradient.State_Pressed";
Debug.ShouldStop(4096);
_states.setArrayElement (BA.numberCast(int.class, -(double) (0 + _stdgradient.getField(true,"State_Pressed").<Integer>get().intValue())),BA.numberCast(int.class, 1));
 BA.debugLineNum = 46;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
Debug.ShouldStop(8192);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwenabled.getObject())));
 BA.debugLineNum = 47;BA.debugLine="Private states(1) As Int";
Debug.ShouldStop(16384);
_states = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 48;BA.debugLine="states(0) = stdGradient.State_Pressed";
Debug.ShouldStop(32768);
_states.setArrayElement (_stdgradient.getField(true,"State_Pressed"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 49;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
Debug.ShouldStop(65536);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwpressed.getObject())));
 BA.debugLineNum = 50;BA.debugLine="Private states(1) As Int";
Debug.ShouldStop(131072);
_states = RemoteObject.createNewArray ("int", new int[] {1}, new Object[]{});Debug.locals.put("states", _states);
 BA.debugLineNum = 51;BA.debugLine="states(0) = stdGradient.State_Disabled";
Debug.ShouldStop(262144);
_states.setArrayElement (_stdgradient.getField(true,"State_Disabled"),BA.numberCast(int.class, 0));
 BA.debugLineNum = 52;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
Debug.ShouldStop(524288);
_stdgradient.runVoidMethod ("AddState2",(Object)(_states),(Object)((_gdwdisabled.getObject())));
 BA.debugLineNum = 53;BA.debugLine="Return stdGradient							'Връща градиента като па";
Debug.ShouldStop(1048576);
if (true) return _stdgradient;
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public sharePrice As String";
helperfunctions1._shareprice = RemoteObject.createImmutable("");
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _remove_padding(RemoteObject _ba,RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("Remove_Padding (helperfunctions1) ","helperfunctions1",5,_ba,helperfunctions1.mostCurrent,56);
if (RapidSub.canDelegate("remove_padding")) return b4a.example.helperfunctions1.remoteMe.runUserSub(false, "helperfunctions1","remove_padding", _ba, _obj);
RemoteObject _pad = RemoteObject.createImmutable(0);
RemoteObject _reflect = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
;
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 56;BA.debugLine="Public Sub Remove_Padding (obj As Object)		'Премах";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Private pad = 0dip As Int";
Debug.ShouldStop(16777216);
_pad = helperfunctions1.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("pad", _pad);Debug.locals.put("pad", _pad);
 BA.debugLineNum = 58;BA.debugLine="Private reflect As Reflector";
Debug.ShouldStop(33554432);
_reflect = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("reflect", _reflect);
 BA.debugLineNum = 59;BA.debugLine="reflect.Target = obj";
Debug.ShouldStop(67108864);
_reflect.setField ("Target",_obj);
 BA.debugLineNum = 60;BA.debugLine="reflect.RunMethod4(\"setPadding\", Array As Object(p";
Debug.ShouldStop(134217728);
_reflect.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_pad),(_pad),(_pad),(_pad)})),(Object)(RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),BA.ObjectToString("java.lang.int"),RemoteObject.createImmutable("java.lang.int")})));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}