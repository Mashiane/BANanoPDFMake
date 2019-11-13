B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private items As List
	Private listX As Map
	Private lType As String
	Public style As PDFStyle
	Public reversed As Boolean
	Public start As Int
	Public square As Boolean
	Public circle As Boolean
	Public color As String
	Public markerColor As String
	Public lowerAlpha As Boolean
	Public upperAlpha As Boolean
	Public upperRoman As Boolean
	Public lowerRoman As Boolean
	Public none As Boolean
	Public separator As String
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(typeOf As String) As PDFList
	items.Initialize 
	listX.Initialize
	lType = typeOf
	style.Initialize 
	reversed = Null
	start = Null
	square = Null
	circle = Null
	color = Null
	markerColor = Null
	lowerAlpha = Null
	upperAlpha = Null
	upperRoman = Null
	lowerRoman = Null
	none = Null
	separator = Null
	Return Me
End Sub

'add text
Sub AddText(txt As PDFText) As PDFList
	items.Add(txt.Content)
	Return Me
End Sub

'add items
Sub AddItems(lst As List)
	For Each item As Object In lst
		items.Add(item)
	Next
End Sub


'set page break before
Sub SetPageBreakBefore As PDFList
	listX.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFList
	listX.Put("pageBreak", "after")
	Return Me
End Sub

'get the list content
Sub getContent As Map
	If reversed <> Null Then listX.Put("reversed", reversed)
	If start <> Null Then listX.Put("start", start)
	If square <> Null Then listX.Put("type", "square")
	If circle <> Null Then listX.Put("type", "circle")
	If color <> Null Then listX.Put("color", color)
	If markerColor <> Null Then listX.Put("markerColor", markerColor)
	If lowerAlpha <> Null Then listX.Put("type", "lower-alpha")
	If upperAlpha <> Null Then listX.Put("type", "upper-alpha")
	If upperRoman <> Null Then listX.Put("type", "upper-roman")
	If lowerRoman <> Null Then listX.Put("type", "lower-roman")
	If none <> Null Then listX.Put("type", "none")
	If separator <> Null Then listX.Put("type", "separator")
	
	listX.Put(lType, items)
	style.Include(listX)
	Return listX
End Sub
