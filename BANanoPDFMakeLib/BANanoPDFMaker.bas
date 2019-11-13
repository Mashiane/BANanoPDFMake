B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private styles As Map
	Private docDefinition As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	styles.Initialize 
	docDefinition.Initialize 
End Sub

'create a new style
Sub CreateStyle(name As String) As PDFStyle
	Dim style As PDFStyle
	style.Initialize(name)
	Return style
End Sub

'add a style for the collection
Sub AddStyle(style As PDFStyle)
	Dim name As String = style.name
	Dim content As Map = style.Style
	styles.Put(name, content)
End Sub

'prepare the document
Sub Prepare
	docDefinition.Put("styles", styles)
End Sub