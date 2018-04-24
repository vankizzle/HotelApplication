
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class mytasks {
    public static RemoteObject myClass;
	public mytasks() {
	}
    public static PCBA staticBA = new PCBA(null, mytasks.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _wholescreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _taskholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _taskheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tablename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.types _types = null;
public static b4a.example.helperfunctions1 _helperfunctions1 = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"TableName",_ref.getField(false, "_tablename"),"TaskHeader",_ref.getField(false, "_taskheader"),"TaskHolder",_ref.getField(false, "_taskholder"),"WholeScreen",_ref.getField(false, "_wholescreen")};
}
}