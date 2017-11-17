Type=Class
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Dim cls As clsService
End Sub

Public Sub Initialize
	cls.Initialize
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
End Sub

private Sub logout_Click (Params As Object)
	Log("LOGOUT DI HIT")
	Wait For(cls.doLogout()) COMPLETE(a As String)
	ws.RunFunction("doLogout",Null)
	ws.Flush
End Sub

Private Sub WebSocket_Disconnected

End Sub