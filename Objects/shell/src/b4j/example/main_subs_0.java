package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,36);
if (RapidSub.canDelegate("application_error")) return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 36;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="Return True";
Debug.ShouldStop(16);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,12);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 12;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="Args = Array As String(8082)";
Debug.ShouldStop(8192);
_args = RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(8082)});Debug.locals.put("Args", _args);
 BA.debugLineNum = 17;BA.debugLine="If Args.Length<1 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_args.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 18;BA.debugLine="Log( \" \")";
Debug.ShouldStop(131072);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 19;BA.debugLine="Log(\"PORT BELUM DISETTING\")";
Debug.ShouldStop(262144);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("PORT BELUM DISETTING")));
 BA.debugLineNum = 20;BA.debugLine="Log( \" \")";
Debug.ShouldStop(524288);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 21;BA.debugLine="ExitApplication";
Debug.ShouldStop(1048576);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 24;BA.debugLine="srvr.Initialize(\"\")";
Debug.ShouldStop(8388608);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 25;BA.debugLine="srvr.Port =  Args(0)";
Debug.ShouldStop(16777216);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, _args.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 26;BA.debugLine="srvr.AddWebSocket(\"/login\",\"clsLogin\")";
Debug.ShouldStop(33554432);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/login")),(Object)(RemoteObject.createImmutable("clsLogin")));
 BA.debugLineNum = 27;BA.debugLine="srvr.AddWebSocket(\"/dashboard\",\"clsDashboard\")";
Debug.ShouldStop(67108864);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/dashboard")),(Object)(RemoteObject.createImmutable("clsDashboard")));
 BA.debugLineNum = 28;BA.debugLine="srvr.AddWebSocket(\"/monitoring\",\"clsMonitoring\")";
Debug.ShouldStop(134217728);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/monitoring")),(Object)(RemoteObject.createImmutable("clsMonitoring")));
 BA.debugLineNum = 29;BA.debugLine="srvr.AddWebSocket(\"/secman\",\"clsSecman\")";
Debug.ShouldStop(268435456);
main._srvr.runVoidMethod ("AddWebSocket",(Object)(BA.ObjectToString("/secman")),(Object)(RemoteObject.createImmutable("clsSecman")));
 BA.debugLineNum = 30;BA.debugLine="srvr.Start";
Debug.ShouldStop(536870912);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 32;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(-2147483648);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
clslogin.myClass = BA.getDeviceClass ("b4j.example.clslogin");
clsservice.myClass = BA.getDeviceClass ("b4j.example.clsservice");
clsdashboard.myClass = BA.getDeviceClass ("b4j.example.clsdashboard");
clsmonitoring.myClass = BA.getDeviceClass ("b4j.example.clsmonitoring");
clssecman.myClass = BA.getDeviceClass ("b4j.example.clssecman");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Dim base_url As String = \"http://localhost:8081/\"";
main._base_url = BA.ObjectToString("http://localhost:8081/");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}