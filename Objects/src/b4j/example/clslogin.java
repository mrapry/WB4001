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
public void  _btn_login_click(b4j.example.clslogin __ref,Object _s) throws Exception{
ResumableSub_btn_login_Click rsub = new ResumableSub_btn_login_Click(this,__ref,_s);
rsub.resume(ba, null);
}
public static class ResumableSub_btn_login_Click extends BA.ResumableSub {
public ResumableSub_btn_login_Click(b4j.example.clslogin parent,b4j.example.clslogin __ref,Object _s) {
this.parent = parent;
this.__ref = __ref;
this._s = _s;
}
b4j.example.clslogin __ref;
b4j.example.clslogin parent;
Object _s;
String _user = "";
String _pass = "";
String _pesan = "";
String _senduserpass = "";
String _result = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clslogin";
Debug.delegate(ba, "btn_login_click", new Object[] {_s});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim user As String = username.GetVal.Value";
_user = BA.ObjectToString(__ref._username.GetVal().getValue());
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim pass As String = password.GetVal.Value";
_pass = BA.ObjectToString(__ref._password.GetVal().getValue());
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Dim pesan As String";
_pesan = "";
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="ws.Flush";
__ref._ws.Flush();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="If user=\"\" Or pass=\"\" Then";
if (true) break;

case 1:
//if
this.state = 12;
if ((_user).equals("") || (_pass).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 12;
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="pesan = \"USERNAME DAN PASSWORD TIDAK BOLEH KOSON";
_pesan = "USERNAME DAN PASSWORD TIDAK BOLEH KOSONG";
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="ws.RunFunction(\"show_notif\",Array(pesan))";
__ref._ws.RunFunction("show_notif",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_pesan)}));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="Dim sendUserPass As String= \"username=\"&user&\"&p";
_senduserpass = "username="+_user+"&password="+_pass;
RDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Wait For(cls.doLogin(sendUserPass,user,pass)) CO";
parent.__c.WaitFor("complete", ba, this, (Object)(__ref._cls._dologin(null,_senduserpass,_user,_pass).getObject()));
this.state = 13;
return;
case 13:
//C
this.state = 6;
_result = (String) result[1];
;
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="If result.SubString2(0,2)=\"XX\" Then";
if (true) break;

case 6:
//if
this.state = 11;
if ((_result.substring((int) (0),(int) (2))).equals("XX")) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="pesan = \"GAGAL LOGIN - SILAHKAN CEK USERNAME DA";
_pesan = "GAGAL LOGIN - SILAHKAN CEK USERNAME DAN PASSWORD ANDA";
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="ws.RunFunction(\"show_notif\",Array(pesan))";
__ref._ws.RunFunction("show_notif",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_pesan)}));
 if (true) break;

case 10:
//C
this.state = 11;
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="pesan = result";
_pesan = _result;
RDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="ws.RunFunction(\"login\",Null)";
__ref._ws.RunFunction("login",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(parent.__c.Null)));
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="ws.Flush";
__ref._ws.Flush();
 if (true) break;

case 11:
//C
this.state = 12;
;
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="ws.Flush";
__ref._ws.Flush();
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.clslogin __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Private ws As WebSocket";
_ws = new anywheresoftware.b4j.object.WebSocket();
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Dim username As JQueryElement";
_username = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Dim password As JQueryElement";
_password = new anywheresoftware.b4j.object.WebSocket.JQueryElement();
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Dim cls As clsService";
_cls = new b4j.example.clsservice();
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.clslogin __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="cls.Initialize";
__ref._cls._initialize(null,ba);
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public String  _websocket_connected(b4j.example.clslogin __ref,anywheresoftware.b4j.object.WebSocket _websocket1) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "websocket_connected"))
	return (String) Debug.delegate(ba, "websocket_connected", new Object[] {_websocket1});
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub WebSocket_Connected (WebSocket1 As Web";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="ws = WebSocket1";
__ref._ws = _websocket1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="End Sub";
return "";
}
public String  _websocket_disconnected(b4j.example.clslogin __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clslogin";
if (Debug.shouldDelegate(ba, "websocket_disconnected"))
	return (String) Debug.delegate(ba, "websocket_disconnected", null);
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub WebSocket_Disconnected";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="End Sub";
return "";
}
}