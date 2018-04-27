package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static b4a.example.types._currentuser _currentuser = null;
public b4a.example.loginscreen _loginscr = null;
public b4a.example.userinterfacemainscreen _uiscreen = null;
public b4a.example.tasktable _tabletasks = null;
public b4a.example.mytasks _usertasks = null;
public b4a.example.types _types = null;
public b4a.example.starter _starter = null;
public b4a.example.helperfunctions1 _helperfunctions1 = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static String  _activity_create(boolean _firsttime) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 34;BA.debugLine="currentuser.Initialize";
_currentuser.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="currentuser.username = \"TestUser\"";
_currentuser.username = "TestUser";
 //BA.debugLineNum = 36;BA.debugLine="currentuser.password = \"testelsys1\"";
_currentuser.password = "testelsys1";
 //BA.debugLineNum = 37;BA.debugLine="currentuser.TypeOfWorker = 1   '<- 0 = not a work";
_currentuser.TypeOfWorker = (int) (1);
 //BA.debugLineNum = 38;BA.debugLine="currentuser.available = True";
_currentuser.available = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 41;BA.debugLine="LoginScr.Initialize";
mostCurrent._loginscr._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 42;BA.debugLine="UIscreen.Initialize";
mostCurrent._uiscreen._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 43;BA.debugLine="TableTasks.Initialize";
mostCurrent._tabletasks._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 44;BA.debugLine="UserTasks.Initialize";
mostCurrent._usertasks._initialize(mostCurrent.activityBA);
 //BA.debugLineNum = 46;BA.debugLine="Activity.AddView(LoginScr.AsView,0,0,100%x,100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._loginscr._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 47;BA.debugLine="LoginScr.AsView.Visible = True";
mostCurrent._loginscr._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 49;BA.debugLine="Activity.AddView(UIscreen.AsView,0,0,100%x,100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._uiscreen._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 50;BA.debugLine="UIscreen.AsView.Visible = False";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 53;BA.debugLine="Activity.AddView(TableTasks.AsView,0,0,100%x,100%";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._tabletasks._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 54;BA.debugLine="TableTasks.AsView.Visible = False";
mostCurrent._tabletasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 56;BA.debugLine="Activity.AddView(UserTasks.AsView,0,0,100%x,100%y";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._usertasks._asview().getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
 //BA.debugLineNum = 57;BA.debugLine="UserTasks.AsView.Visible = False";
mostCurrent._usertasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
int _ext = 0;
int _result = 0;
 //BA.debugLineNum = 110;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 112;BA.debugLine="Dim ext As Int = 0";
_ext = (int) (0);
 //BA.debugLineNum = 113;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
 //BA.debugLineNum = 115;BA.debugLine="If UIscreen.asView.Visible = True Then";
if (mostCurrent._uiscreen._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 116;BA.debugLine="UIscreen.asView.Visible = False";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 117;BA.debugLine="LoginScr.asView.Visible = True";
mostCurrent._loginscr._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 118;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 //BA.debugLineNum = 119;BA.debugLine="LoginScr.loginbtn.Enabled = True";
mostCurrent._loginscr._loginbtn.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 122;BA.debugLine="If TableTasks.AsView.Visible = True Then";
if (mostCurrent._tabletasks._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 123;BA.debugLine="TableTasks.AsView.Visible = False";
mostCurrent._tabletasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 124;BA.debugLine="UIscreen.asView.Visible = True";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 125;BA.debugLine="UIscreen.MenuHolder.Visible = True";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 126;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
 //BA.debugLineNum = 129;BA.debugLine="If UserTasks.AsView.Visible = True Then";
if (mostCurrent._usertasks._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 130;BA.debugLine="UserTasks.AsView.Visible = False";
mostCurrent._usertasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 131;BA.debugLine="UIscreen.asView.Visible = True";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 132;BA.debugLine="UIscreen.MenuHolder.Visible = True";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 133;BA.debugLine="ext = ext + 1";
_ext = (int) (_ext+1);
 };
 //BA.debugLineNum = 135;BA.debugLine="ext = ext - 1";
_ext = (int) (_ext-1);
 //BA.debugLineNum = 137;BA.debugLine="If LoginScr.asView.Visible = True And ext = -1 T";
if (mostCurrent._loginscr._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True && _ext==-1) { 
 //BA.debugLineNum = 139;BA.debugLine="Dim result As Int";
_result = 0;
 //BA.debugLineNum = 140;BA.debugLine="result = Msgbox2(\"Exit application?\",\"Exit\",\"Ye";
_result = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Exit application?"),BA.ObjectToCharSequence("Exit"),"Yes","Cancel","",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 //BA.debugLineNum = 141;BA.debugLine="If result = DialogResponse.POSITIVE Then";
if (_result==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
 //BA.debugLineNum = 142;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 };
 //BA.debugLineNum = 147;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 150;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim LoginScr As LoginScreen";
mostCurrent._loginscr = new b4a.example.loginscreen();
 //BA.debugLineNum = 25;BA.debugLine="Dim UIscreen As UserInterfaceMainScreen";
mostCurrent._uiscreen = new b4a.example.userinterfacemainscreen();
 //BA.debugLineNum = 26;BA.debugLine="Dim TableTasks As TaskTable";
mostCurrent._tabletasks = new b4a.example.tasktable();
 //BA.debugLineNum = 27;BA.debugLine="Dim UserTasks As MyTasks";
mostCurrent._usertasks = new b4a.example.mytasks();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public static String  _loadmytasks(anywheresoftware.b4a.objects.collections.Map _tasks) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub LoadMyTasks(Tasks As Map)";
 //BA.debugLineNum = 108;BA.debugLine="UserTasks.GetMyTasks(Tasks)";
mostCurrent._usertasks._getmytasks(_tasks);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
types._process_globals();
starter._process_globals();
helperfunctions1._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Dim currentuser As currentuser";
_currentuser = new b4a.example.types._currentuser();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _setuseravailable() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetUserAvailable";
 //BA.debugLineNum = 72;BA.debugLine="UIscreen.SetAvailable";
mostCurrent._uiscreen._setavailable();
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return "";
}
public static String  _setuserbusy() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetUserBusy";
 //BA.debugLineNum = 69;BA.debugLine="UIscreen.SetBusy";
mostCurrent._uiscreen._setbusy();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _showmytasks() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub ShowMyTasks";
 //BA.debugLineNum = 75;BA.debugLine="If UserTasks.AsView.Visible = False Then";
if (mostCurrent._usertasks._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 76;BA.debugLine="UserTasks.AsView.Visible = True";
mostCurrent._usertasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 77;BA.debugLine="UIscreen.MenuHolder.Visible = False";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 79;BA.debugLine="UserTasks.AsView.Visible = False";
mostCurrent._usertasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 80;BA.debugLine="UIscreen.MenuHolder.Visible = True";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _showtasktable() throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub ShowTaskTable";
 //BA.debugLineNum = 84;BA.debugLine="If TableTasks.AsView.Visible = False Then";
if (mostCurrent._tabletasks._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 85;BA.debugLine="TableTasks.AsView.Visible = True";
mostCurrent._tabletasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 86;BA.debugLine="UIscreen.MenuHolder.Visible = False";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.False);
 }else {
 //BA.debugLineNum = 88;BA.debugLine="TableTasks.AsView.Visible = False";
mostCurrent._tabletasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 89;BA.debugLine="UIscreen.MenuHolder.Visible = True";
mostCurrent._uiscreen._menuholder.setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public static String  _showui() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub ShowUI";
 //BA.debugLineNum = 99;BA.debugLine="ProgressDialogShow(\"Loading...\")";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Loading..."));
 //BA.debugLineNum = 100;BA.debugLine="If 	UIscreen.AsView.Visible = False Then";
if (mostCurrent._uiscreen._asview().getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 101;BA.debugLine="UIscreen.AsView.Visible = True";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
 //BA.debugLineNum = 103;BA.debugLine="UIscreen.AsView.Visible = False";
mostCurrent._uiscreen._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
 //BA.debugLineNum = 105;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public static String  _tasktabletomytasks() throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub TaskTableToMyTasks";
 //BA.debugLineNum = 93;BA.debugLine="If TableTasks.AsView.Visible = True Then";
if (mostCurrent._tabletasks._asview().getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 94;BA.debugLine="TableTasks.AsView.Visible = False";
mostCurrent._tabletasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 95;BA.debugLine="UserTasks.AsView.Visible = True";
mostCurrent._usertasks._asview().setVisible(anywheresoftware.b4a.keywords.Common.True);
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
}
