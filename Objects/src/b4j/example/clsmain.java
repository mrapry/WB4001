package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class clsmain extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.clsmain", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsmain.class).invoke(this, new Object[] {null});
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
public b4j.example.clsservice _cls = null;
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.main _main = null;
public String  _class_globals(b4j.example.clsmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsmain";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim cls As clsService";
_cls = new b4j.example.clsservice();
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clsmain __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsmain";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="cls.Initialize";
__ref._cls._initialize(null,ba);
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return "";
}
public void  _logout_click(b4j.example.clsmain __ref,Object _params) throws Exception{
ResumableSub_logout_Click rsub = new ResumableSub_logout_Click(this,__ref,_params);
rsub.resume(ba, null);
}
public static class ResumableSub_logout_Click extends BA.ResumableSub {
public ResumableSub_logout_Click(b4j.example.clsmain parent,b4j.example.clsmain __ref,Object _params) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
}
b4j.example.clsmain __ref;
b4j.example.clsmain parent;
Object _params;
String _a = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsmain";
Debug.delegate(ba, "logout_click", new Object[] {_params});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Log(\"LOGOUT DI HIT\")";
parent.__c.Log("LOGOUT DI HIT");
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Wait For(cls.doLogout()) COMPLETE(a As String)";
parent.__c.WaitFor("complete", ba, this, (Object)(__ref._cls._dologout(null).getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_a = (String) result[1];
;
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="ws.RunFunction(\"doLogout\",Null)";
__ref._ws.RunFunction("doLogout",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _websocket_connected(b4j.example.clsmain __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsmain";
if (Debug.shouldDelegate(ba, "websocket_connected"))
	return (String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1});
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="ws = WebSocket1";
__ref._ws = _websocket1;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.clsmain __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsmain";
if (Debug.shouldDelegate(ba, "websocket_disconnected"))
	return (String) Debug.delegate(ba, "websocket_disconnected", null);
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
}