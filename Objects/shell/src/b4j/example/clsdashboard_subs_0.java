package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsdashboard_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private ws As WebSocket";
clsdashboard._ws = RemoteObject.createNew ("anywheresoftware.b4j.object.WebSocket");__ref.setField("_ws",clsdashboard._ws);
 //BA.debugLineNum = 4;BA.debugLine="Dim cls As clsService";
clsdashboard._cls = RemoteObject.createNew ("b4j.example.clsservice");__ref.setField("_cls",clsdashboard._cls);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static void  _getunitlist(RemoteObject __ref) throws Exception{
ResumableSub_getUnitList rsub = new ResumableSub_getUnitList(null,__ref);
rsub.resume(null, null);
}
public static class ResumableSub_getUnitList extends BA.ResumableSub {
public ResumableSub_getUnitList(b4j.example.clsdashboard parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsdashboard parent;
RemoteObject _unit = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getUnitList (clsdashboard) ","clsdashboard",1,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("getunitlist")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 23;BA.debugLine="Wait For(cls.getUnit())COMPLETE(unit As String)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_getunit").getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unit = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("unit", _unit);
;
 BA.debugLineNum = 24;BA.debugLine="ws.RunFunction(\"get_unit\",Array (unit))";
Debug.ShouldStop(8388608);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("get_unit")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_unit)})))));
 BA.debugLineNum = 25;BA.debugLine="ws.Flush";
Debug.ShouldStop(16777216);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static void  _complete(RemoteObject _unit) throws Exception{
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsdashboard) ","clsdashboard",1,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clsdashboard","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
 BA.debugLineNum = 8;BA.debugLine="cls.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_initialize",__ref.getField(false, "ba"));
 BA.debugLineNum = 9;BA.debugLine="getUnitList";
Debug.ShouldStop(256);
__ref.runClassMethod (b4j.example.clsdashboard.class, "_getunitlist");
 BA.debugLineNum = 10;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public ResumableSub_logout_Click(b4j.example.clsdashboard parent,RemoteObject __ref,RemoteObject _params) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsdashboard parent;
RemoteObject _params;
RemoteObject _a = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("logout_Click (clsdashboard) ","clsdashboard",1,__ref.getField(false, "ba"),__ref,16);
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
 BA.debugLineNum = 17;BA.debugLine="Wait For(cls.doLogout()) COMPLETE(a As String)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_dologout").getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_a = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("a", _a);
;
 BA.debugLineNum = 18;BA.debugLine="ws.RunFunction(\"doLogout\",Null)";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("doLogout")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 19;BA.debugLine="ws.Flush";
Debug.ShouldStop(262144);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static RemoteObject  _websocket_connected(RemoteObject __ref,RemoteObject _websocket1) throws Exception{
try {
		Debug.PushSubsStack("WebSocket_Connected (clsdashboard) ","clsdashboard",1,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("websocket_connected")) return __ref.runUserSub(false, "clsdashboard","websocket_connected", __ref, _websocket1);
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 12;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(4096);
__ref.setField ("_ws",_websocket1);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("WebSocket_Disconnected (clsdashboard) ","clsdashboard",1,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("websocket_disconnected")) return __ref.runUserSub(false, "clsdashboard","websocket_disconnected", __ref);
 BA.debugLineNum = 28;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}