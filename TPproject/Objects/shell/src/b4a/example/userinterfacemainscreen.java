
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
public static RemoteObject _screenimg = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _usernamelbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _availability = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _statusindicator = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _menuholder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _menutasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _menuother1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _menuother2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _createmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _numberofmenus = RemoteObject.createImmutable(0);
public static RemoteObject _menutypes = RemoteObject.declareNull("b4a.example.choosemenutype");
public static b4a.example.main _main = null;
public static b4a.example.types _types = null;
public static b4a.example.helperfunctions1 _helperfunctions1 = null;
public static b4a.example.starter _starter = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"availability",_ref.getField(false, "_availability"),"CreateMenu",_ref.getField(false, "_createmenu"),"MenuHolder",_ref.getField(false, "_menuholder"),"MenuOther1",_ref.getField(false, "_menuother1"),"MenuOther2",_ref.getField(false, "_menuother2"),"MenuTasks",_ref.getField(false, "_menutasks"),"MenuTypes",_ref.getField(false, "_menutypes"),"NumberOfMenus",_ref.getField(false, "_numberofmenus"),"screenimg",_ref.getField(false, "_screenimg"),"statusindicator",_ref.getField(false, "_statusindicator"),"usernamelbl",_ref.getField(false, "_usernamelbl"),"wholescreen",_ref.getField(false, "_wholescreen")};
}
}