package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clssecman_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
clssecman._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",clssecman._ws);
 //BA.debugLineNum = 4;BA.debugLine="Dim cls As clsService";
clssecman._cls = RemoteObject.createNew ("b4j.example.clsservice");__ref.setField("_cls",clssecman._cls);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clssecman) ","clssecman",4,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clssecman","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="cls.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 9;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _logout_click(RemoteObject __ref,RemoteObject _params) throws Exception{
ResumableSub_logout_Click rsub = new ResumableSub_logout_Click(null,__ref,_params);
rsub.resume(null, null);
}
public static class ResumableSub_logout_Click extends BA.ResumableSub {
public ResumableSub_logout_Click(b4j.example.clssecman parent,RemoteObject __ref,RemoteObject _params) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clssecman parent;
RemoteObject _params;
RemoteObject _a = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("logout_Click (clssecman) ","clssecman",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("logout_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Params", _params);
 BA.debugLineNum = 16;BA.debugLine="Wait For(cls.doLogout()) COMPLETE(a As String)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_dologout").getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_a = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("a", _a);
;
 BA.debugLineNum = 17;BA.debugLine="ws.RunFunction(\"doLogout\",Null)";
Debug.ShouldStop(65536);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("doLogout")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 18;BA.debugLine="ws.Flush";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _a) throws Exception{
}
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (clssecman) ","clssecman",4,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("websocket_connected")) return __ref.runUserSub(false, "clssecman","websocket_connected", __ref, _websocket1);
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 11;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(2048);
__ref.setField ("_ws",_websocket1);
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
public static RemoteObject  _websocket_disconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Disconnected (clssecman) ","clssecman",4,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("websocket_disconnected")) return __ref.runUserSub(false, "clssecman","websocket_disconnected", __ref);
 BA.debugLineNum = 21;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}