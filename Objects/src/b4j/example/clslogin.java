package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class clslogin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.clslogin", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clslogin.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.WebSocket _ws = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _username = null;
public anywheresoftware.b4j.object.WebSocket.JQueryElement _password = null;
public b4j.example.clsservice _cls = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.main _main = null;
public String  _btn_login_click(b4j.example.clslogin __ref,Object _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "btn_login_click"))
	return (String) Debug.delegate(ba, "btn_login_click", new Object[] {_a});
String _user = "";
String _pass = "";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub btn_login_click(a As Object)";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Dim user As String = username.GetVal.Value";
_user = BA.ObjectToString(__ref._username.GetVal().getValue());
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim pass As String = password.GetVal.Value";
_pass = BA.ObjectToString(__ref._password.GetVal().getValue());
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="Log(user&\"---\"&pass)";
__c.Log(_user+"---"+_pass);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clslogin __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim username As JQueryElement";
_username = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="Dim password As JQueryElement";
_password = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=196612;
 //BA.debugLineNum = 196612;BA.debugLine="Dim cls As clsService";
_cls = new b4j.example.clsservice();
RDebugUtils.currentLine=196614;
 //BA.debugLineNum = 196614;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clslogin __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="cls.Initialize";
__ref._cls._initialize(null,ba);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.clslogin __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "websocket_connected"))
	return (String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1});
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="ws = WebSocket1";
__ref._ws = _websocket1;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.clslogin __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "websocket_disconnected"))
	return (String) Debug.delegate(ba, "websocket_disconnected", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
}