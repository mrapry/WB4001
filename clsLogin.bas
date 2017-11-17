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

public Sub btn_login_Click (s As Object)
	Dim user As String = username.GetVal.Value
	Dim pass As String = password.GetVal.Value
	Dim pesan As String
	ws.Flush
	If user="" Or pass="" Then
		pesan = "USERNAME DAN PASSWORD TIDAK BOLEH KOSONG"
		ws.RunFunction("show_notif",Array(pesan))
	Else
		Dim sendUserPass As String= "username="&user&"&password="&pass
		Wait For(cls.doLogin(sendUserPass,user,pass)) COMPLETE (result As String)
		If result.SubString2(0,2)="XX" Then
			pesan = "GAGAL LOGIN - SILAHKAN CEK USERNAME DAN PASSWORD ANDA"
			ws.RunFunction("show_notif",Array(pesan))
		Else
			pesan = result
			ws.RunFunction("login",Null)
			ws.Flush
		End If
		ws.Flush
	End If
	
	
End Sub


Private Sub WebSocket_Connected (WebSocket1 As WebSocket)
	ws = WebSocket1
End Sub

Private Sub WebSocket_Disconnected

End Sub