
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
public static RemoteObject _taskholder = RemoteObject.declareNull("wrappers.MiScrollView");
public static RemoteObject _taskheader = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tablename = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _taskfakepan = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _finishbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _mapofview = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _viewtoremove = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _chekboxtag = RemoteObject.createImmutable(0);
public static RemoteObject _checknumbers = RemoteObject.createImmutable(0);
public static b4a.example.main _main = null;
public static b4a.example.types _types = null;
public static b4a.example.helperfunctions1 _helperfunctions1 = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"checkNumbers",_ref.getField(false, "_checknumbers"),"chekboxtag",_ref.getField(false, "_chekboxtag"),"FinishBtn",_ref.getField(false, "_finishbtn"),"MapOfView",_ref.getField(false, "_mapofview"),"TableName",_ref.getField(false, "_tablename"),"TaskFakePan",_ref.getField(false, "_taskfakepan"),"TaskHeader",_ref.getField(false, "_taskheader"),"TaskHolder",_ref.getField(false, "_taskholder"),"ViewToRemove",_ref.getField(false, "_viewtoremove"),"WholeScreen",_ref.getField(false, "_wholescreen")};
}
}