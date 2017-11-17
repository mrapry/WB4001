package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class clsdashboard extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.clsdashboard", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsdashboard.class).invoke(this, new Object[] {null});
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
public String  _class_globals(b4j.example.clsdashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsdashboard";
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="Dim cls As clsService";
_cls = new b4j.example.clsservice();
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public void  _getunitlist(b4j.example.clsdashboard __ref) throws Exception{
ResumableSub_getUnitList rsub = new ResumableSub_getUnitList(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_getUnitList extends BA.ResumableSub {
public ResumableSub_getUnitList(b4j.example.clsdashboard parent,b4j.example.clsdashboard __ref) {
this.parent = parent;
this.__ref = __ref;
}
b4j.example.clsdashboard __ref;
b4j.example.clsdashboard parent;
String _unit = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsdashboard";
Debug.delegate(ba, "getunitlist", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Wait For(cls.getUnit())COMPLETE(unit As String)";
parent.__c.WaitFor("complete", ba, this, (Object)(__ref._cls._getunit(null).getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_unit = (String) result[1];
;
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="ws.RunFunction(\"get_unit\",Array (unit))";
__ref._ws.RunFunction("get_unit",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_unit)}));
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.clsdashboard __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsdashboard";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="cls.Initialize";
__ref._cls._initialize(null,ba);
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="getUnitList";
__ref._getunitlist(null);
RDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="End Sub";
return "";
}
public void  _logout_click(b4j.example.clsdashboard __ref,Object _params) throws Exception{
ResumableSub_logout_Click rsub = new ResumableSub_logout_Click(this,__ref,_params);
rsub.resume(ba, null);
}
public static class ResumableSub_logout_Click extends BA.ResumableSub {
public ResumableSub_logout_Click(b4j.example.clsdashboard parent,b4j.example.clsdashboard __ref,Object _params) {
this.parent = parent;
this.__ref = __ref;
this._params = _params;
}
b4j.example.clsdashboard __ref;
b4j.example.clsdashboard parent;
Object _params;
String _a = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsdashboard";
Debug.delegate(ba, "logout_click", new Object[] {_params});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="Wait For(cls.doLogout()) COMPLETE(a As String)";
parent.__c.WaitFor("complete", ba, this, (Object)(__ref._cls._dologout(null).getObject()));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_a = (String) result[1];
;
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="ws.RunFunction(\"doLogout\",Null)";
__ref._ws.RunFunction("doLogout",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _websocket_connected(b4j.example.clsdashboard __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsdashboard";
if (Debug.shouldDelegate(ba, "websocket_connected"))
	return (String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1});
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="ws = WebSocket1";
__ref._ws = _websocket1;
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.clsdashboard __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsdashboard";
if (Debug.shouldDelegate(ba, "websocket_disconnected"))
	return (String) Debug.delegate(ba, "websocket_disconnected", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="End Sub";
return "";
}
}