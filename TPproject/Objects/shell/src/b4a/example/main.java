
package b4a.example;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "b4a.example.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _currentuser = RemoteObject.declareNull("b4a.example.types._currentuser");
public static RemoteObject _loginscr = RemoteObject.declareNull("b4a.example.loginscreen");
public static RemoteObject _uiscreen = RemoteObject.declareNull("b4a.example.userinterfacemainscreen");
public static RemoteObject _tabletasks = RemoteObject.declareNull("b4a.example.tasktable");
public static RemoteObject _usertasks = RemoteObject.declareNull("b4a.example.mytasks");
public static b4a.example.types _types = null;
public static b4a.example.helperfunctions1 _helperfunctions1 = null;
public static b4a.example.starter _starter = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"currentuser",main._currentuser,"HelperFunctions1",Debug.moduleToString(b4a.example.helperfunctions1.class),"LoginScr",main.mostCurrent._loginscr,"Starter",Debug.moduleToString(b4a.example.starter.class),"TableTasks",main.mostCurrent._tabletasks,"Types",Debug.moduleToString(b4a.example.types.class),"UIscreen",main.mostCurrent._uiscreen,"UserTasks",main.mostCurrent._usertasks};
}
}