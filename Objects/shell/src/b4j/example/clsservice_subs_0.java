package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getunit(RemoteObject __ref,RemoteObject _a) throws Exception{
ResumableSub_getUnit rsub = new ResumableSub_getUnit(null,__ref,_a);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_getUnit extends BA.ResumableSub {
public ResumableSub_getUnit(b4j.example.clsservice parent,RemoteObject __ref,RemoteObject _a) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsservice parent;
RemoteObject _a;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getUnit (clsservice) ","clsservice",2,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("getunit")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("a", _a);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clsservice) ","clsservice",2,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) return __ref.runUserSub(false, "clsservice","initialize", __ref, _ba);
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(64);
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
public static RemoteObject  _login(RemoteObject __ref,RemoteObject _a) throws Exception{
ResumableSub_login rsub = new ResumableSub_login(null,__ref,_a);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_login extends BA.ResumableSub {
public ResumableSub_login(b4j.example.clsservice parent,RemoteObject __ref,RemoteObject _a) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsservice parent;
RemoteObject _a;
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _js = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("login (clsservice) ","clsservice",2,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("login")) return ;
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("a", _a);
 BA.debugLineNum = 12;BA.debugLine="Dim result As String";
Debug.ShouldStop(2048);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 13;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(4096);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 15;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 16;BA.debugLine="job.PostString(  Main.base_url & \"/login\"  ,a )";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(parent._main._base_url,RemoteObject.createImmutable("/login"))),(Object)(_a));
 BA.debugLineNum = 17;BA.debugLine="job.GetRequest.Timeout = 1000*10";
Debug.ShouldStop(65536);
_job.runMethod(false,"_getrequest").runMethod(true,"setTimeout",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(10)}, "*",0, 1));
 BA.debugLineNum = 19;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 20;BA.debugLine="result = job.GetString";
Debug.ShouldStop(524288);
_result = _job.runMethod(true,"_getstring");Debug.locals.put("result", _result);
 BA.debugLineNum = 22;BA.debugLine="If job.Success = False Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success"),parent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 23;BA.debugLine="job.Release";
Debug.ShouldStop(4194304);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 24;BA.debugLine="Return Null";
Debug.ShouldStop(8388608);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 BA.debugLineNum = 26;BA.debugLine="job.Release";
Debug.ShouldStop(33554432);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 28;BA.debugLine="Dim js As  JSONParser";
Debug.ShouldStop(134217728);
_js = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("js", _js);
 BA.debugLineNum = 29;BA.debugLine="js.Initialize(result)";
Debug.ShouldStop(268435456);
_js.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 30;BA.debugLine="Dim mp As Map = js.NextObject";
Debug.ShouldStop(536870912);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp = _js.runMethod(false,"NextObject");Debug.locals.put("mp", _mp);Debug.locals.put("mp", _mp);
 BA.debugLineNum = 31;BA.debugLine="Log(mp)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(_mp)));
 BA.debugLineNum = 32;BA.debugLine="If mp.Get(\"kode\")=\"1\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_mp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("kode")))),RemoteObject.createImmutable(("1")))) { 
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
 BA.debugLineNum = 36;BA.debugLine="Return \"XX\" & mp.Get(\"pesan\")";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(RemoteObject.concat(RemoteObject.createImmutable("XX"),_mp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pesan")))))));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 39;BA.debugLine="Return result";
Debug.ShouldStop(64);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_result));return;};
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _job) throws Exception{
}
}