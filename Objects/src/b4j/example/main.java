package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends Object{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			anywheresoftware.b4a.ShellBA.delegateBA = new anywheresoftware.b4a.StandardBA("b4j.example", null, null);
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) throws Exception{
        try {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            ba.raiseEvent(null, "appstart", (Object)args);
        } catch (Throwable t) {
			BA.printException(t, true);
		
        } finally {
            anywheresoftware.b4a.keywords.Common.LogDebug("Program terminated (StartMessageLoop was not called).");
        }
    }


private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.httputils2service._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.object.ServerWrapper _srvr = null;
public static String _base_url = "";
public static b4j.example.httputils2service _httputils2service = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "application_error"))
	return (Boolean) Debug.delegate(ba, "application_error", new Object[] {_error,_stacktrace});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(String[] _args) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(ba, "appstart"))
	return (String) Debug.delegate(ba, "appstart", new Object[] {_args});
RDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Sub AppStart (Args() As String)";
RDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="Args = Array As String(8082)";
_args = new String[]{BA.NumberToString(8082)};
RDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="If Args.Length<1 Then";
if (_args.length<1) { 
RDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="Log( \" \")";
anywheresoftware.b4a.keywords.Common.Log(" ");
RDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Log(\"PORT BELUM DISETTING\")";
anywheresoftware.b4a.keywords.Common.Log("PORT BELUM DISETTING");
RDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Log( \" \")";
anywheresoftware.b4a.keywords.Common.Log(" ");
RDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
RDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="srvr.Initialize(\"\")";
_srvr.Initialize(ba,"");
RDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="srvr.Port =  Args(0)";
_srvr.setPort((int)(Double.parseDouble(_args[(int) (0)])));
RDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="srvr.AddWebSocket(\"/login\",\"clsLogin\")";
_srvr.AddWebSocket("/login","clsLogin");
RDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="srvr.AddWebSocket(\"/dashboard\",\"clsDashboard\")";
_srvr.AddWebSocket("/dashboard","clsDashboard");
RDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="srvr.AddWebSocket(\"/monitoring\",\"clsMonitoring\")";
_srvr.AddWebSocket("/monitoring","clsMonitoring");
RDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="srvr.AddWebSocket(\"/secman\",\"clsSecman\")";
_srvr.AddWebSocket("/secman","clsSecman");
RDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="srvr.Start";
_srvr.Start();
RDebugUtils.currentLine=65556;
 //BA.debugLineNum = 65556;BA.debugLine="StartMessageLoop";
anywheresoftware.b4a.keywords.Common.StartMessageLoop(ba);
RDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="End Sub";
return "";
}
}