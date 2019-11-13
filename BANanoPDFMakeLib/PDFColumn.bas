B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public Width As String
	Public Text As String
	Private coly As Map
End Sub

'Initializes the object.
Public Sub Initialize
	Width = Null
	Text = Null
	coly.Initialize 
End Sub

'get the contents of the column
Sub getColumn As Map
	If Width <> Null Then coly.Put("width", Width)
	If Text <> Null Then coly.Put("text", Text)
	Return coly
End Sub

'set the margin for the column
Sub SetMargin(l As Int, t As Int, r As Int, b As Int)
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	coly.Put("margin", margin)
End Sub
