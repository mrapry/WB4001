Type=Class
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'WebSocket class
Sub Class_Globals
	Private ws As WebSocket
	Dim username As JQueryElement
	Dim password As JQueryElement
	Dim cls As clsService
'	Dim js As JSONGenerator
End Sub

Public Sub Initialize
	cls.Initialize
End Sub

Sub btn_login_click(a As Object)
	Dim user As String = username.GetVal.Value
	ws.Flush
	Dim pass As String = password.GetVal.Value
	ws.Flush
	Log(user&"---"&pass)
'	ws.RunFunction("login",Null)
	ws.Flush

'	js.Initialize(CreateMap("username":user,"password":pass))
'	Wait For(cls.login) COMPLETE (json As String)
'	Log("HASIL LOGIN " &json)

'	Dim pesan As String
'	If json.SubString2(0,2)="XX" Then
'		pesan   = json.SubString2(2,json.Length)
''		ws.RunFunction("show_notif",Array(pesan))
'	Else
'		pesan = json
''		ws.RunFunction("getInvoice",Array(pesan))
'	End If
'	ws.Flush
End Sub

Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
End Sub

Private Sub WebSocket_Disconnected

End Sub