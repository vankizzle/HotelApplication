
package b4a.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class loginscreen {
    public static RemoteObject myClass;
	public loginscreen() {
	}
    public static PCBA staticBA = new PCBA(null, loginscreen.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _wholescreen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _usernamefield = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _passwordfield = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _loginbtn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static b4a.example.main _main = null;
public static b4a.example.starter _starter = null;
public static b4a.example.types _types = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"loginbtn",_ref.getField(false, "_loginbtn"),"passwordfield",_ref.getField(false, "_passwordfield"),"usernamefield",_ref.getField(false, "_usernamefield"),"wholescreen",_ref.getField(false, "_wholescreen")};
}
}