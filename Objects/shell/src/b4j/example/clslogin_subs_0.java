package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clslogin_subs_0 {


public static RemoteObject  _btn_login_click(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("btn_login_click (clslogin) ","clslogin",1,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("btn_login_click")) return __ref.runUserSub(false, "clslogin","btn_login_click", __ref, _a);
RemoteObject _user = RemoteObject.createImmutable("");
RemoteObject _pass = RemoteObject.createImmutable("");
Debug.locals.put("a", _a);
 BA.debugLineNum = 14;BA.debugLine="Sub btn_login_click(a As Object)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 15;BA.debugLine="Dim user As String = username.GetVal.Value";
Debug.ShouldStop(16384);
_user = BA.ObjectToString(__ref.getField(false,"_username").runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("user", _user);Debug.locals.put("user", _user);
 BA.debugLineNum = 16;BA.debugLine="ws.Flush";
Debug.ShouldStop(32768);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 17;BA.debugLine="Dim pass As String = password.GetVal.Value";
Debug.ShouldStop(65536);
_pass = BA.ObjectToString(__ref.getField(false,"_password").runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("pass", _pass);Debug.locals.put("pass", _pass);
 BA.debugLineNum = 18;BA.debugLine="ws.Flush";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 19;BA.debugLine="Log(user&\"---\"&pass)";
Debug.ShouldStop(262144);
clslogin.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(_user,RemoteObject.createImmutable("---"),_pass)));
 BA.debugLineNum = 21;BA.debugLine="ws.Flush";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
clslogin._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",clslogin._ws);
 //BA.debugLineNum = 4;BA.debugLine="Dim username As JQueryElement";
clslogin._username = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_username",clslogin._username);
 //BA.debugLineNum = 5;BA.debugLine="Dim password As JQueryElement";
clslogin._password = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket.JQueryElement");__ref.setField("_password",clslogin._password);
 //BA.debugLineNum = 6;BA.debugLine="Dim cls As clsService";
clslogin._cls = RemoteObject.createNew ("b4j.example.clsservice");__ref.setField("_cls",clslogin._cls);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clslogin) ","clslogin",1,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clslogin","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="cls.Initialize";
Debug.ShouldStop(1024);
__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("WebSocket_Connected (clslogin) ","clslogin",1,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("websocket_connected")) return __ref.runUserSub(false, "clslogin","websocket_connected", __ref, _websocket1);
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 38;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(64);
__ref.setField ("_ws",_websocket1);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("WebSocket_Disconnected (clslogin) ","clslogin",1,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("websocket_disconnected")) return __ref.runUserSub(false, "clslogin","websocket_disconnected", __ref);
 BA.debugLineNum = 42;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}