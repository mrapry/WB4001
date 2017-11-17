package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clsservice_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dologin(RemoteObject __ref,RemoteObject _a,RemoteObject _username,RemoteObject _password) throws Exception{
ResumableSub_doLogin rsub = new ResumableSub_doLogin(null,__ref,_a,_username,_password);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_doLogin extends BA.ResumableSub {
public ResumableSub_doLogin(b4j.example.clsservice parent,RemoteObject __ref,RemoteObject _a,RemoteObject _username,RemoteObject _password) {
this.parent = parent;
this.__ref = __ref;
this._a = _a;
this._username = _username;
this._password = _password;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsservice parent;
RemoteObject _a;
RemoteObject _username;
RemoteObject _password;
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _js = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("doLogin (clsservice) ","clsservice",5,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("dologin")) return ;
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
Debug.locals.put("username", _username);
Debug.locals.put("password", _password);
 BA.debugLineNum = 14;BA.debugLine="Dim result As String";
Debug.ShouldStop(8192);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 15;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16384);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 16;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(32768);
_job.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 17;BA.debugLine="job.PostString(Main.url_api & \"/login\",a)";
Debug.ShouldStop(65536);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(parent._main._url_api,RemoteObject.createImmutable("/login"))),(Object)(_a));
 BA.debugLineNum = 18;BA.debugLine="job.GetRequest.Timeout = 10000*60";
Debug.ShouldStop(131072);
_job.runMethod(false,"_getrequest").runMethod(true,"setTimeout",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10000),RemoteObject.createImmutable(60)}, "*",0, 1));
 BA.debugLineNum = 20;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_job));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 21;BA.debugLine="result = job.GetString";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 29;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(268435456);
_json = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 30;BA.debugLine="js.Initialize(result)";
Debug.ShouldStop(536870912);
_js.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 31;BA.debugLine="Dim mp As Map = js.NextObject";
Debug.ShouldStop(1073741824);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp = _js.runMethod(false,"NextObject");Debug.locals.put("mp", _mp);Debug.locals.put("mp", _mp);
 BA.debugLineNum = 32;BA.debugLine="If mp.Get(\"success\")=\"1\" Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_mp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("success")))),RemoteObject.createImmutable(("1")))) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 33;BA.debugLine="json.Initialize(mp.Get(\"profile\"))";
Debug.ShouldStop(1);
_json.runVoidMethod ("Initialize",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _mp.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("profile"))))));
 BA.debugLineNum = 34;BA.debugLine="Return json.ToString";
Debug.ShouldStop(2);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_json.runMethod(true,"ToString")));return;};
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 36;BA.debugLine="Return \"XX\"";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("XX")));return;};
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static void  _jobdone(RemoteObject _job) throws Exception{
}
public static RemoteObject  _dologout(RemoteObject __ref) throws Exception{
ResumableSub_doLogout rsub = new ResumableSub_doLogout(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_doLogout extends BA.ResumableSub {
public ResumableSub_doLogout(b4j.example.clsservice parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsservice parent;
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("doLogout (clsservice) ","clsservice",5,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("dologout")) return ;
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
 BA.debugLineNum = 41;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(256);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 42;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(512);
_job.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 43;BA.debugLine="job.PostString(Main.url_api & \"/logout\",Null)";
Debug.ShouldStop(1024);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(parent._main._url_api,RemoteObject.createImmutable("/logout"))),(Object)(BA.ObjectToString(parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 44;BA.debugLine="job.GetRequest.Timeout = 10000*60";
Debug.ShouldStop(2048);
_job.runMethod(false,"_getrequest").runMethod(true,"setTimeout",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(10000),RemoteObject.createImmutable(60)}, "*",0, 1));
 BA.debugLineNum = 45;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 46;BA.debugLine="If job.Success = False Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 47;BA.debugLine="job.Release";
Debug.ShouldStop(16384);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 48;BA.debugLine="Return Null";
Debug.ShouldStop(32768);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 50;BA.debugLine="job.Release";
Debug.ShouldStop(131072);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 51;BA.debugLine="Return \"Login Sukses\"";
Debug.ShouldStop(262144);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(("Login Sukses")));return;};
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
public static RemoteObject  _getunit(RemoteObject __ref) throws Exception{
ResumableSub_getUnit rsub = new ResumableSub_getUnit(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
public static class ResumableSub_getUnit extends BA.ResumableSub {
public ResumableSub_getUnit(b4j.example.clsservice parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4j.example.clsservice parent;
RemoteObject _result = RemoteObject.createImmutable("");
RemoteObject _job = RemoteObject.declareNull("b4j.example.httpjob");
RemoteObject _js = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser");
RemoteObject _mp = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("getUnit (clsservice) ","clsservice",5,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("getunit")) return ;
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
 BA.debugLineNum = 56;BA.debugLine="Dim result As String";
Debug.ShouldStop(8388608);
_result = RemoteObject.createImmutable("");Debug.locals.put("result", _result);
 BA.debugLineNum = 57;BA.debugLine="Dim job As HttpJob";
Debug.ShouldStop(16777216);
_job = RemoteObject.createNew ("b4j.example.httpjob");Debug.locals.put("job", _job);
 BA.debugLineNum = 59;BA.debugLine="job.Initialize(\"\",Me)";
Debug.ShouldStop(67108864);
_job.runVoidMethod ("_initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 60;BA.debugLine="job.PostString(Main.url_api & \"/mobile/instansi\",";
Debug.ShouldStop(134217728);
_job.runVoidMethod ("_poststring",(Object)(RemoteObject.concat(parent._main._url_api,RemoteObject.createImmutable("/mobile/instansi"))),(Object)(BA.ObjectToString(parent.__c.getField(false,"Null"))));
 BA.debugLineNum = 61;BA.debugLine="job.GetRequest.Timeout = 1000*10";
Debug.ShouldStop(268435456);
_job.runMethod(false,"_getrequest").runMethod(true,"setTimeout",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1000),RemoteObject.createImmutable(10)}, "*",0, 1));
 BA.debugLineNum = 63;BA.debugLine="Wait For(job) JobDone(job As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this), (_job));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_job = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("job", _job);
;
 BA.debugLineNum = 64;BA.debugLine="result = job.GetString";
Debug.ShouldStop(-2147483648);
_result = _job.runMethod(true,"_getstring");Debug.locals.put("result", _result);
 BA.debugLineNum = 65;BA.debugLine="If job.Success = False Then";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 66;BA.debugLine="job.Release";
Debug.ShouldStop(2);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 67;BA.debugLine="Return Null";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,parent.__c.getField(false,"Null"));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 69;BA.debugLine="job.Release";
Debug.ShouldStop(16);
_job.runVoidMethod ("_release");
 BA.debugLineNum = 71;BA.debugLine="Dim js As  JSONParser";
Debug.ShouldStop(64);
_js = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser");Debug.locals.put("js", _js);
 BA.debugLineNum = 72;BA.debugLine="js.Initialize(result)";
Debug.ShouldStop(128);
_js.runVoidMethod ("Initialize",(Object)(_result));
 BA.debugLineNum = 73;BA.debugLine="Dim mp As Map = js.NextArray";
Debug.ShouldStop(256);
_mp = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mp.setObject(_js.runMethod(false,"NextArray").getObject());Debug.locals.put("mp", _mp);
 BA.debugLineNum = 74;BA.debugLine="Dim list As List = mp";
Debug.ShouldStop(512);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_list.setObject(_mp.getObject());Debug.locals.put("list", _list);
 BA.debugLineNum = 75;BA.debugLine="Return list2json(list)";
Debug.ShouldStop(1024);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(__ref.runClassMethod (b4j.example.clsservice.class, "_list2json",(Object)(_list))));return;};
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (clsservice) ","clsservice",5,__ref.getField(false, "ba"),__ref,7);
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
public static RemoteObject  _list2json(RemoteObject __ref,RemoteObject _list) throws Exception{
try {
		Debug.PushSubsStack("list2json (clsservice) ","clsservice",5,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("list2json")) return __ref.runUserSub(false, "clsservice","list2json", __ref, _list);
RemoteObject _js = RemoteObject.declareNull("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");
Debug.locals.put("list", _list);
 BA.debugLineNum = 78;BA.debugLine="Sub list2json(list As List) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Dim js As JSONGenerator";
Debug.ShouldStop(16384);
_js = RemoteObject.createNew ("anywheresoftware.b4j.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("js", _js);
 BA.debugLineNum = 80;BA.debugLine="js.Initialize2(list)";
Debug.ShouldStop(32768);
_js.runVoidMethod ("Initialize2",(Object)(_list));
 BA.debugLineNum = 81;BA.debugLine="Return js.ToString";
Debug.ShouldStop(65536);
if (true) return _js.runMethod(true,"ToString");
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}