
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class tasktable {
    public static RemoteObject myClass;
	public tasktable() {
	}
    public static PCBA staticBA = new PCBA(null, tasktable.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _wholescreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _taskslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tableholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tableheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tablefooter = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tabletype = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _tableofrequests = RemoteObject.declareNull("wrappers.MiScrollView");
public static RemoteObject _submit = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mapoftaskviews = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _boxchecked = RemoteObject.createImmutable(0);
public static RemoteObject _selectedtasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _taskfakepan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _refreshtimer = RemoteObject.declareNull("anywheresoftware.b4a.objects.Timer");
public static b4a.example.main _main = null;
public static b4a.example.types _types = null;
public static b4a.example.helperfunctions1 _helperfunctions1 = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"boxchecked",_ref.getField(false, "_boxchecked"),"mapoftaskviews",_ref.getField(false, "_mapoftaskviews"),"RefreshTimer",_ref.getField(false, "_refreshtimer"),"SelectedTasks",_ref.getField(false, "_selectedtasks"),"submit",_ref.getField(false, "_submit"),"tableFooter",_ref.getField(false, "_tablefooter"),"tableHeader",_ref.getField(false, "_tableheader"),"tableHolder",_ref.getField(false, "_tableholder"),"tableofrequests",_ref.getField(false, "_tableofrequests"),"tableType",_ref.getField(false, "_tabletype"),"TaskFakePan",_ref.getField(false, "_taskfakepan"),"TasksList",_ref.getField(false, "_taskslist"),"WholeScreen",_ref.getField(false, "_wholescreen")};
}
}