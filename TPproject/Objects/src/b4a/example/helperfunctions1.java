package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class helperfunctions1 {
private static helperfunctions1 mostCurrent = new helperfunctions1();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 public anywheresoftware.b4a.keywords.Common __c = null;
public static String _shareprice = "";
public b4a.example.main _main = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public static String  _apply_viewstyle(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _control,int _textcolor,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.EditTextWrapper _txt = null;
anywheresoftware.b4a.objects.SpinnerWrapper _sp = null;
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Apply_ViewStyle (Control As View, TextC";
 //BA.debugLineNum = 6;BA.debugLine="If Control Is Button Then			'Handle controls with";
if (_control.getObjectOrNull() instanceof android.widget.Button) { 
 //BA.debugLineNum = 7;BA.debugLine="Private btn As Button = Control";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
_btn.setObject((android.widget.Button)(_control.getObject()));
 //BA.debugLineNum = 8;BA.debugLine="btn.TextColor = TextColor";
_btn.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 10;BA.debugLine="If Control Is EditText Then";
if (_control.getObjectOrNull() instanceof android.widget.EditText) { 
 //BA.debugLineNum = 11;BA.debugLine="Private txt As EditText = Control";
_txt = new anywheresoftware.b4a.objects.EditTextWrapper();
_txt.setObject((android.widget.EditText)(_control.getObject()));
 //BA.debugLineNum = 12;BA.debugLine="txt.TextColor = TextColor";
_txt.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 14;BA.debugLine="If Control Is Spinner Then";
if (_control.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
 //BA.debugLineNum = 15;BA.debugLine="Private sp As Spinner = Control";
_sp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_sp.setObject((anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_control.getObject()));
 //BA.debugLineNum = 16;BA.debugLine="sp.TextColor = TextColor";
_sp.setTextColor(_textcolor);
 };
 //BA.debugLineNum = 19;BA.debugLine="Control.Background = Helper_Gradient(ColorA, Colo";
_control.setBackground((android.graphics.drawable.Drawable)(_helper_gradient(_ba,_colora,_colorb,_colorpresseda,_colorpressedb,_colordisableda,_colordisabledb,_cornerround).getObject()));
 //BA.debugLineNum = 20;BA.debugLine="Remove_Padding(Control)";
_remove_padding(_ba,(Object)(_control.getObject()));
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.StateListDrawable  _helper_gradient(anywheresoftware.b4a.BA _ba,int _colora,int _colorb,int _colorpresseda,int _colorpressedb,int _colordisableda,int _colordisabledb,int _cornerround) throws Exception{
int[] _colsenabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwenabled = null;
int[] _colspressed = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwpressed = null;
int[] _colsdisabled = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _gdwdisabled = null;
anywheresoftware.b4a.objects.drawable.StateListDrawable _stdgradient = null;
int[] _states = null;
 //BA.debugLineNum = 22;BA.debugLine="Private Sub Helper_Gradient(ColorA As Int, ColorB";
 //BA.debugLineNum = 23;BA.debugLine="Private colsEnabled(2) As Int				'Дефинира два цв";
_colsenabled = new int[(int) (2)];
;
 //BA.debugLineNum = 24;BA.debugLine="colsEnabled(0) = ColorA";
_colsenabled[(int) (0)] = _colora;
 //BA.debugLineNum = 25;BA.debugLine="colsEnabled(1) = ColorB";
_colsenabled[(int) (1)] = _colorb;
 //BA.debugLineNum = 26;BA.debugLine="Private gdwEnabled As GradientDrawable		'Дефинира";
_gdwenabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 27;BA.debugLine="gdwEnabled.Initialize(\"TOP_BOTTOM\", colsEnabled)";
_gdwenabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsenabled);
 //BA.debugLineNum = 28;BA.debugLine="gdwEnabled.CornerRadius = CornerRound";
_gdwenabled.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 29;BA.debugLine="Private colsPressed(2) As Int				'Дефинира два цв";
_colspressed = new int[(int) (2)];
;
 //BA.debugLineNum = 30;BA.debugLine="colsPressed(0) = ColorPressedA";
_colspressed[(int) (0)] = _colorpresseda;
 //BA.debugLineNum = 31;BA.debugLine="colsPressed(1) = ColorPressedB";
_colspressed[(int) (1)] = _colorpressedb;
 //BA.debugLineNum = 32;BA.debugLine="Private gdwPressed As GradientDrawable		'Дефинира";
_gdwpressed = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 33;BA.debugLine="gdwPressed.Initialize(\"TOP_BOTTOM\", colsPressed)";
_gdwpressed.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colspressed);
 //BA.debugLineNum = 34;BA.debugLine="gdwPressed.CornerRadius = CornerRound";
_gdwpressed.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 35;BA.debugLine="Private colsDisabled(2) As Int				'Дефинира два ц";
_colsdisabled = new int[(int) (2)];
;
 //BA.debugLineNum = 36;BA.debugLine="colsDisabled(0) = ColorDisabledA";
_colsdisabled[(int) (0)] = _colordisableda;
 //BA.debugLineNum = 37;BA.debugLine="colsDisabled(1) = ColorDisabledB";
_colsdisabled[(int) (1)] = _colordisabledb;
 //BA.debugLineNum = 38;BA.debugLine="Private gdwDisabled As GradientDrawable		'Дефинир";
_gdwdisabled = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
 //BA.debugLineNum = 39;BA.debugLine="gdwDisabled.Initialize(\"TOP_BOTTOM\", colsDisabled";
_gdwdisabled.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TOP_BOTTOM"),_colsdisabled);
 //BA.debugLineNum = 40;BA.debugLine="gdwDisabled.CornerRadius = CornerRound";
_gdwdisabled.setCornerRadius((float) (_cornerround));
 //BA.debugLineNum = 41;BA.debugLine="Private stdGradient As StateListDrawable	'Дефинир";
_stdgradient = new anywheresoftware.b4a.objects.drawable.StateListDrawable();
 //BA.debugLineNum = 42;BA.debugLine="stdGradient.Initialize";
_stdgradient.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="Private states(2) As Int";
_states = new int[(int) (2)];
;
 //BA.debugLineNum = 44;BA.debugLine="states(0) = stdGradient.State_Enabled";
_states[(int) (0)] = _stdgradient.State_Enabled;
 //BA.debugLineNum = 45;BA.debugLine="states(1) = -stdGradient.State_Pressed";
_states[(int) (1)] = (int) (-_stdgradient.State_Pressed);
 //BA.debugLineNum = 46;BA.debugLine="stdGradient.addState2(states, gdwEnabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwenabled.getObject()));
 //BA.debugLineNum = 47;BA.debugLine="Private states(1) As Int";
_states = new int[(int) (1)];
;
 //BA.debugLineNum = 48;BA.debugLine="states(0) = stdGradient.State_Pressed";
_states[(int) (0)] = _stdgradient.State_Pressed;
 //BA.debugLineNum = 49;BA.debugLine="stdGradient.addState2(states, gdwPressed)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwpressed.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Private states(1) As Int";
_states = new int[(int) (1)];
;
 //BA.debugLineNum = 51;BA.debugLine="states(0) = stdGradient.State_Disabled";
_states[(int) (0)] = _stdgradient.State_Disabled;
 //BA.debugLineNum = 52;BA.debugLine="stdGradient.addState2(states, gdwDisabled)";
_stdgradient.AddState2(_states,(android.graphics.drawable.Drawable)(_gdwdisabled.getObject()));
 //BA.debugLineNum = 53;BA.debugLine="Return stdGradient							'Връща градиента като па";
if (true) return _stdgradient;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public sharePrice As String";
_shareprice = "";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public static String  _remove_padding(anywheresoftware.b4a.BA _ba,Object _obj) throws Exception{
int _pad = 0;
anywheresoftware.b4a.agraham.reflection.Reflection _reflect = null;
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Remove_Padding (obj As Object)		'Премах";
 //BA.debugLineNum = 57;BA.debugLine="Private pad = 0dip As Int";
_pad = anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (0));
 //BA.debugLineNum = 58;BA.debugLine="Private reflect As Reflector";
_reflect = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 59;BA.debugLine="reflect.Target = obj";
_reflect.Target = _obj;
 //BA.debugLineNum = 60;BA.debugLine="reflect.RunMethod4(\"setPadding\", Array As Object(p";
_reflect.RunMethod4("setPadding",new Object[]{(Object)(_pad),(Object)(_pad),(Object)(_pad),(Object)(_pad)},new String[]{"java.lang.int","java.lang.int","java.lang.int","java.lang.int"});
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
}
