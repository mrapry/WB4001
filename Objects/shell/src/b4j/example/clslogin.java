
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clslogin {
    public static RemoteObject myClass;
	public clslogin() {
	}
    public static PCBA staticBA = new PCBA(null, clslogin.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _username = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _password = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket.JQueryElement");
public static RemoteObject _cls = RemoteObject.declareNull("b4j.example.clsservice");
public static RemoteObject _httputils2service = RemoteObject.declareNull("b4j.example.httputils2service");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cls",_ref.getField(false, "_cls"),"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"password",_ref.getField(false, "_password"),"username",_ref.getField(false, "_username"),"ws",_ref.getField(false, "_ws")};
}
}