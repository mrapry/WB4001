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

Sub login(a As String)As ResumableSub
	Dim result As String
	Dim job As HttpJob
	
	job.Initialize("",Me)
	job.PostString(  Main.base_url & "/login"  ,a )
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
	Dim mp As Map = js.NextObject
	Log(mp)
	If mp.Get("kode")="1" Then
'		Dim list As List = mp.Get("data")
'		Return list2json(list)
	Else
		Return "XX" & mp.Get("pesan")
	End If
	
	Return result
End Sub

Sub getUnit(a As String) As ResumableSub
	
End Sub