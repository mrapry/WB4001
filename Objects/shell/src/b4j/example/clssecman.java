
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class clssecman {
    public static RemoteObject myClass;
	public clssecman() {
	}
    public static PCBA staticBA = new PCBA(null, clssecman.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _ws = RemoteObject.declareNull("anywheresoftware.b4j.object.WebSocket");
public static RemoteObject _httputils2service = RemoteObject.declareNull("b4j.example.httputils2service");
public static b4j.example.main _main = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"HttpUtils2Service",_ref.getField(false, "_httputils2service"),"ws",_ref.getField(false, "_ws")};
}
}