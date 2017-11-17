package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class clsservice extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.clsservice", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.clsservice.class).invoke(this, new Object[] {null});
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
public b4j.example.httputils2service _httputils2service = null;
public b4j.example.main _main = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getunit(b4j.example.clsservice __ref) throws Exception{
ResumableSub_getUnit rsub = new ResumableSub_getUnit(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_getUnit extends BA.ResumableSub {
public ResumableSub_getUnit(b4j.example.clsservice parent,b4j.example.clsservice __ref) {
this.parent = parent;
this.__ref = __ref;
}
b4j.example.clsservice __ref;
b4j.example.clsservice parent;
String _result = "";
b4j.example.httpjob _job = null;
anywheresoftware.b4j.objects.collections.JSONParser _js = null;
anywheresoftware.b4a.objects.collections.Map _mp = null;
anywheresoftware.b4a.objects.collections.List _list = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsservice";
Debug.delegate(ba, "getunit", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize(ba,"",parent);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="job.PostString(Main.url_api & \"/mobile/instansi\",";
_job._poststring(parent._main._url_api+"/mobile/instansi",BA.ObjectToString(parent.__c.Null));
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="job.GetRequest.Timeout = 1000*10";
_job._getrequest().setTimeout((int) (1000*10));
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="result = job.GetString";
_result = _job._getstring();
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="If job.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="Dim js As  JSONParser";
_js = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="js.Initialize(result)";
_js.Initialize(_result);
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="Dim mp As Map = js.NextArray";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_js.NextArray().getObject()));
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="Dim list As List = mp";
_list = new anywheresoftware.b4a.objects.collections.List();
_list.setObject((java.util.List)(_mp.getObject()));
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="Return list2json(list)";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(__ref._list2json(null,_list)));return;};
RDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4j.example.clsservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsservice";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _dologout(b4j.example.clsservice __ref) throws Exception{
ResumableSub_doLogout rsub = new ResumableSub_doLogout(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_doLogout extends BA.ResumableSub {
public ResumableSub_doLogout(b4j.example.clsservice parent,b4j.example.clsservice __ref) {
this.parent = parent;
this.__ref = __ref;
}
b4j.example.clsservice __ref;
b4j.example.clsservice parent;
b4j.example.httpjob _job = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsservice";
Debug.delegate(ba, "dologout", null);
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize(ba,"",parent);
RDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="job.PostString(Main.url_api & \"/logout\",Null)";
_job._poststring(parent._main._url_api+"/logout",BA.ObjectToString(parent.__c.Null));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="job.GetRequest.Timeout = 10000*60";
_job._getrequest().setTimeout((int) (10000*60));
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="If job.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="Return \"Login Sukses\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("Login Sukses"));return;};
RDebugUtils.currentLine=1703948;
 //BA.debugLineNum = 1703948;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _dologin(b4j.example.clsservice __ref,String _a,String _username,String _password) throws Exception{
ResumableSub_doLogin rsub = new ResumableSub_doLogin(this,__ref,_a,_username,_password);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_doLogin extends BA.ResumableSub {
public ResumableSub_doLogin(b4j.example.clsservice parent,b4j.example.clsservice __ref,String _a,String _username,String _password) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
this._username = _username;
this._password = _password;
}
b4j.example.clsservice __ref;
b4j.example.clsservice parent;
String _a;
String _username;
String _password;
String _result = "";
b4j.example.httpjob _job = null;
anywheresoftware.b4j.objects.collections.JSONParser _js = null;
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _mp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsservice";
Debug.delegate(ba, "dologin", new Object[] {_a,_username,_password});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize(ba,"",parent);
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="job.PostString(Main.url_api & \"/login\",a)";
_job._poststring(parent._main._url_api+"/login",_a);
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="job.GetRequest.Timeout = 10000*60";
_job._getrequest().setTimeout((int) (10000*60));
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="result = job.GetString";
_result = _job._getstring();
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="If job.Success = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_job._success==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Dim js As  JSONParser";
_js = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="js.Initialize(result)";
_js.Initialize(_result);
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Dim mp As Map = js.NextObject";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp = _js.NextObject();
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="If mp.Get(\"success\")=\"1\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((_mp.Get((Object)("success"))).equals((Object)("1"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="json.Initialize(mp.Get(\"profile\"))";
_json.Initialize((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_mp.Get((Object)("profile")))));
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="Return json.ToString";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_json.ToString()));return;};
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="Return \"XX\"";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("XX"));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=1638425;
 //BA.debugLineNum = 1638425;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4j.example.clsservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsservice";
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="End Sub";
return "";
}
public String  _list2json(b4j.example.clsservice __ref,anywheresoftware.b4a.objects.collections.List _list) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsservice";
if (Debug.shouldDelegate(ba, "list2json"))
	return (String) Debug.delegate(ba, "list2json", new Object[] {_list});
anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator _js = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub list2json(list As List) As String";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim js As JSONGenerator";
_js = new anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="js.Initialize2(list)";
_js.Initialize2(_list);
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Return js.ToString";
if (true) return _js.ToString();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return "";
}
}