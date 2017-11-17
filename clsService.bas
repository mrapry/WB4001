Type=Class
Version=5.9
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Class module
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub


'===================SERVICE LOGIN===================
Sub doLogin(a As String, username As String,password As String) As ResumableSub
	Dim result As String
	Dim job As HttpJob
	job.Initialize("",Me)
	job.PostString(Main.url_api & "/login",a)
	job.GetRequest.Timeout = 10000*60
	
	Wait For(job) JobDone(job As HttpJob)
	result = job.GetString
	If job.Success = False Then
		job.Release
		Return Null
	End If
	job.Release
	
	Dim js As  JSONParser
	Dim json As JSONGenerator
	js.Initialize(result)
	Dim mp As Map = js.NextObject
	If mp.Get("success")="1" Then
		json.Initialize(mp.Get("profile"))
		Return json.ToString
	Else
		Return "XX"
	End If
End Sub

Sub doLogout()As ResumableSub
	Dim job As HttpJob
	job.Initialize("",Me)
	job.PostString(Main.url_api & "/logout",Null)
	job.GetRequest.Timeout = 10000*60
	Wait For(job) JobDone(job As HttpJob)
	If job.Success = False Then
		job.Release
		Return Null
	End If
	job.Release
	Return "Login Sukses"
End Sub

'===================SERVICE DASHBOARD===================
Sub getUnit() As ResumableSub
	Dim result As String
	Dim job As HttpJob
	
	job.Initialize("",Me)
	job.PostString(Main.url_api & "/mobile/instansi",Null)
	job.GetRequest.Timeout = 1000*10
	
	Wait For(job) JobDone(job As HttpJob)
	result = job.GetString
	If job.Success = False Then
		job.Release
		Return Null
	End If
	job.Release
	
	Dim js As  JSONParser
	js.Initialize(result)
	Dim mp As Map = js.NextArray
	Dim list As List = mp
	Return list2json(list)
End Sub

Sub list2json(list As List) As String
	Dim js As JSONGenerator
	js.Initialize2(list)
	Return js.ToString
End Sub
