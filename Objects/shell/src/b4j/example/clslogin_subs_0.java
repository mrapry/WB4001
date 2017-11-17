package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clslogin_subs_0 {


public static void  _btn_login_click(RemoteObject __ref,RemoteObject _s) throws Exception{
ResumableSub_btn_login_Click rsub = new ResumableSub_btn_login_Click(null,__ref,_s);
rsub.resume(null, null);
}
public static class ResumableSub_btn_login_Click extends BA.ResumableSub {
public ResumableSub_btn_login_Click(b4j.example.clslogin parent,RemoteObject __ref,RemoteObject _s) {
this.parent = parent;
this.__ref = __ref;
this._s = _s;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clslogin parent;
RemoteObject _s;
RemoteObject _user = RemoteObject.createImmutable("");
RemoteObject _pass = RemoteObject.createImmutable("");
RemoteObject _pesan = RemoteObject.createImmutable("");
RemoteObject _senduserpass = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_login_Click (clslogin) ","clslogin",2,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("btn_login_click")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("s", _s);
 BA.debugLineNum = 15;BA.debugLine="Dim user As String = username.GetVal.Value";
Debug.ShouldStop(16384);
_user = BA.ObjectToString(__ref.getField(false,"_username").runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("user", _user);Debug.locals.put("user", _user);
 BA.debugLineNum = 16;BA.debugLine="Dim pass As String = password.GetVal.Value";
Debug.ShouldStop(32768);
_pass = BA.ObjectToString(__ref.getField(false,"_password").runMethod(false,"GetVal").runMethod(false,"getValue"));Debug.locals.put("pass", _pass);Debug.locals.put("pass", _pass);
 BA.debugLineNum = 17;BA.debugLine="Dim pesan As String";
Debug.ShouldStop(65536);
_pesan = RemoteObject.createImmutable("");Debug.locals.put("pesan", _pesan);
 BA.debugLineNum = 18;BA.debugLine="ws.Flush";
Debug.ShouldStop(131072);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 BA.debugLineNum = 19;BA.debugLine="If user=\"\" Or pass=\"\" Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",_user,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_pass,BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
 BA.debugLineNum = 20;BA.debugLine="pesan = \"USERNAME DAN PASSWORD TIDAK BOLEH KOSON";
Debug.ShouldStop(524288);
_pesan = BA.ObjectToString("USERNAME DAN PASSWORD TIDAK BOLEH KOSONG");Debug.locals.put("pesan", _pesan);
 BA.debugLineNum = 21;BA.debugLine="ws.RunFunction(\"show_notif\",Array(pesan))";
Debug.ShouldStop(1048576);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("show_notif")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pesan)})))));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 23;BA.debugLine="Dim sendUserPass As String= \"username=\"&user&\"&p";
Debug.ShouldStop(4194304);
_senduserpass = RemoteObject.concat(RemoteObject.createImmutable("username="),_user,RemoteObject.createImmutable("&password="),_pass);Debug.locals.put("sendUserPass", _senduserpass);Debug.locals.put("sendUserPass", _senduserpass);
 BA.debugLineNum = 24;BA.debugLine="Wait For(cls.doLogin(sendUserPass,user,pass)) CO";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (__ref.getField(false,"_cls").runClassMethod (b4j.example.clsservice.class, "_dologin",(Object)(_senduserpass),(Object)(_user),(Object)(_pass)).getObject()));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 25;BA.debugLine="If result.SubString2(0,2)=\"XX\" Then";
Debug.ShouldStop(16777216);
if (true) break;

case 6:
//if
this.state = 11;
if (RemoteObject.solveBoolean("=",_result.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))),BA.ObjectToString("XX"))) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 BA.debugLineNum = 26;BA.debugLine="pesan = \"GAGAL LOGIN - SILAHKAN CEK USERNAME DA";
Debug.ShouldStop(33554432);
_pesan = BA.ObjectToString("GAGAL LOGIN - SILAHKAN CEK USERNAME DAN PASSWORD ANDA");Debug.locals.put("pesan", _pesan);
 BA.debugLineNum = 27;BA.debugLine="ws.RunFunction(\"show_notif\",Array(pesan))";
Debug.ShouldStop(67108864);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("show_notif")),(Object)(parent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pesan)})))));
 if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 29;BA.debugLine="pesan = result";
Debug.ShouldStop(268435456);
_pesan = _result;Debug.locals.put("pesan", _pesan);
 BA.debugLineNum = 30;BA.debugLine="ws.RunFunction(\"login\",Null)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_ws").runVoidMethod ("RunFunction",(Object)(BA.ObjectToString("login")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), parent.__c.getField(false,"Null")));
 BA.debugLineNum = 31;BA.debugLine="ws.Flush";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 if (true) break;

case 11:
//C
this.state = 12;
;
 BA.debugLineNum = 33;BA.debugLine="ws.Flush";
Debug.ShouldStop(1);
__ref.getField(false,"_ws").runVoidMethod ("Flush");
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
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
		Debug.PushSubsStack("Initialize (clslogin) ","clslogin",2,__ref.getField(false, "ba"),__ref,10);
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
		Debug.PushSubsStack("WebSocket_Connected (clslogin) ","clslogin",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("websocket_connected")) return __ref.runUserSub(false, "clslogin","websocket_connected", __ref, _websocket1);
Debug.locals.put("WebSocket1", _websocket1);
 BA.debugLineNum = 40;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="ws = WebSocket1";
Debug.ShouldStop(256);
__ref.setField ("_ws",_websocket1);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("WebSocket_Disconnected (clslogin) ","clslogin",2,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("websocket_disconnected")) return __ref.runUserSub(false, "clslogin","websocket_disconnected", __ref);
 BA.debugLineNum = 44;BA.debugLine="Private Sub WebSocket_Disconnected";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}