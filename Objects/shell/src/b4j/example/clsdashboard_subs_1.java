package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsdashboard_subs_1 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
clsdashboard._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",clsdashboard._ws);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _coba_hit_click(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("coba_hit_click (clsdashboard) ","clsdashboard",3,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("coba_hit_click")) return __ref.runUserSub(false, "clsdashboard","coba_hit_click", __ref, _a);
Debug.locals.put("a", _a);
 BA.debugLineNum = 10;BA.debugLine="Sub coba_hit_click(a As Object)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="ws.RunFunction(\"getData\",Null)";
Debug.ShouldStop(1024);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("getData")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), clsdashboard.__c.getField(false,"Null")));
 BA.debugLineNum = 12;BA.debugLine="ws.Flush";
Debug.ShouldStop(2048);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsdashboard) ","clsdashboard",3,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clsdashboard","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (clsdashboard) ","clsdashboard",3,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("websocket_connected")) return __ref.runUserSub(false, "clsdashboard","websocket_connected", __ref, _websocket1);
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 15;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(32768);
__ref.setField ("_ws",_websocket1);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (clsdashboard) ","clsdashboard",3,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("websocket_disconnected")) return __ref.runUserSub(false, "clsdashboard","websocket_disconnected", __ref);
 BA.debugLineNum = 19;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}