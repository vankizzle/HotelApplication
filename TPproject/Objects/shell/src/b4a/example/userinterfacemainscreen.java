
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class userinterfacemainscreen {
    public static RemoteObject myClass;
	public userinterfacemainscreen() {
	}
    public static PCBA staticBA = new PCBA(null, userinterfacemainscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _wholescreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _taskslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _usernamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _availability = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tableholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tableheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabletype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tableofrequests = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _refreshbtngraphic = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
public static RemoteObject _tasksrefreshbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.types _types = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"availability",_ref.getField(false, "_availability"),"refreshbtngraphic",_ref.getField(false, "_refreshbtngraphic"),"tableHeader",_ref.getField(false, "_tableheader"),"tableHolder",_ref.getField(false, "_tableholder"),"tableofrequests",_ref.getField(false, "_tableofrequests"),"tableType",_ref.getField(false, "_tabletype"),"TasksList",_ref.getField(false, "_taskslist"),"TasksRefreshBtn",_ref.getField(false, "_tasksrefreshbtn"),"usernamelbl",_ref.getField(false, "_usernamelbl"),"wholescreen",_ref.getField(false, "_wholescreen")};
}
}