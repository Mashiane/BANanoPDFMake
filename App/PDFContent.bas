B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private contentInt As Map
	Private textInt As StringBuilder
	Private styles As List
	Public fontSize As Int
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As PDFContent
	contentInt.Initialize 
	styles.Initialize
	textInt.Initialize 
	fontSize = Null
	Return Me 
End Sub

Sub Append(txt As String) As PDFContent
	textInt.Append(txt)
	Return Me
End Sub

Sub AppendLine(txt As String) As PDFContent
	textInt.Append(txt)
	textInt.Append(CRLF)
	Return Me
End Sub

'add a style only if it exists
Sub AddStyle(styleName As String) As PDFContent
	styles.Add(styleName)
	Return Me
End Sub

Sub getContent As Map
	Dim outcome As String = textInt.tostring
	contentInt.Put("text", outcome)
	If fontSize <> Null Then contentInt.Put("fontSize", fontSize)
	If styles.Size > 0 Then
		contentInt.Put("style", styles)
	End If
	Return contentInt
End Sub

Sub getText As String
	Dim outcome As String = textInt.tostring
	Return outcome
End Sub