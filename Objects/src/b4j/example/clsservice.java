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
public String  _initialize(b4j.example.clsservice __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clsservice";
if (Debug.shouldDelegate(ba, "initialize"))
	return (String) Debug.delegate(ba, "initialize", new Object[] {_ba});
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.clsservice __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clsservice";
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _getunit(b4j.example.clsservice __ref,String _a) throws Exception{
ResumableSub_getUnit rsub = new ResumableSub_getUnit(this,__ref,_a);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_getUnit extends BA.ResumableSub {
public ResumableSub_getUnit(b4j.example.clsservice parent,b4j.example.clsservice __ref,String _a) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
}
b4j.example.clsservice __ref;
b4j.example.clsservice parent;
String _a;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsservice";
Debug.delegate(ba, "getunit", new Object[] {_a});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _login(b4j.example.clsservice __ref,String _a) throws Exception{
ResumableSub_login rsub = new ResumableSub_login(this,__ref,_a);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_login extends BA.ResumableSub {
public ResumableSub_login(b4j.example.clsservice parent,b4j.example.clsservice __ref,String _a) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
}
b4j.example.clsservice __ref;
b4j.example.clsservice parent;
String _a;
String _result = "";
b4j.example.httpjob _job = null;
anywheresoftware.b4j.objects.collections.JSONParser _js = null;
anywheresoftware.b4a.objects.collections.Map _mp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clsservice";
Debug.delegate(ba, "login", new Object[] {_a});
if (true) return;
    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Dim job As HttpJob";
_job = new b4j.example.httpjob();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="job.Initialize(\"\",Me)";
_job._initialize(ba,"",parent);
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="job.PostString(  Main.base_url & \"/login\"  ,a )";
_job._poststring(parent._main._base_url+"/login",_a);
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="job.GetRequest.Timeout = 1000*10";
_job._getrequest().setTimeout((int) (1000*10));
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (b4j.example.httpjob) result[1];
;
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="result = job.GetString";
_result = _job._getstring();
RDebugUtils.currentLine=655371;
 //BA.debugLineNum = 655371;BA.debugLine="If job.Success = False Then";
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
RDebugUtils.currentLine=655372;
 //BA.debugLineNum = 655372;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Return Null";
if (true) {
parent.__c.ReturnFromResumableSub(this,parent.__c.Null);return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="job.Release";
_job._release();
RDebugUtils.currentLine=655377;
 //BA.debugLineNum = 655377;BA.debugLine="Dim js As  JSONParser";
_js = new anywheresoftware.b4j.objects.collections.JSONParser();
RDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="js.Initialize(result)";
_js.Initialize(_result);
RDebugUtils.currentLine=655379;
 //BA.debugLineNum = 655379;BA.debugLine="Dim mp As Map = js.NextObject";
_mp = new anywheresoftware.b4a.objects.collections.Map();
_mp = _js.NextObject();
RDebugUtils.currentLine=655380;
 //BA.debugLineNum = 655380;BA.debugLine="Log(mp)";
parent.__c.Log(BA.ObjectToString(_mp));
RDebugUtils.currentLine=655381;
 //BA.debugLineNum = 655381;BA.debugLine="If mp.Get(\"kode\")=\"1\" Then";
if (true) break;

case 5:
//if
this.state = 10;
if ((_mp.Get((Object)("kode"))).equals((Object)("1"))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="Return \"XX\" & mp.Get(\"pesan\")";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)("XX"+BA.ObjectToString(_mp.Get((Object)("pesan")))));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=655388;
 //BA.debugLineNum = 655388;BA.debugLine="Return result";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result));return;};
RDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}