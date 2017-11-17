package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class clssecman extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.clssecman", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clssecman.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.clssecman __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clssecman";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim cls As clsService";
_cls = new b4j.example.clsservice();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clssecman __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clssecman";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="cls.Initialize";
__ref._cls._initialize(null,ba);
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return "";
}
public void  _logout_click(b4j.example.clssecman __ref,Object _params) throws Exception{
ResumableSub_logout_Click rsub = new ResumableSub_logout_Click(this,__ref,_params);
rsub.resume(ba, null);
}
public static class ResumableSub_logout_Click extends BA.ResumableSub {
public ResumableSub_logout_Click(b4j.example.clssecman parent,b4j.example.clssecman __ref,Object _params) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
}
b4j.example.clssecman __ref;
b4j.example.clssecman parent;
Object _params;
String _a = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clssecman";
Debug.delegate(ba, "logout_click", new Object[] {_params});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Wait For(cls.doLogout()) COMPLETE(a As String)";
parent.__c.WaitFor("complete", ba, this, (Object)(__ref._cls._dologout(null).getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_a = (String) result[1];
;
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="ws.RunFunction(\"doLogout\",Null)";
__ref._ws.RunFunction("doLogout",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _websocket_connected(b4j.example.clssecman __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="clssecman";
if (Debug.shouldDelegate(ba, "websocket_connected"))
	return (String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1});
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="ws = WebSocket1";
__ref._ws = _websocket1;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.clssecman __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clssecman";
if (Debug.shouldDelegate(ba, "websocket_disconnected"))
	return (String) Debug.delegate(ba, "websocket_disconnected", null);
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
}