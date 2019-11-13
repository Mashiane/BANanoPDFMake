B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private contentInt As Map
	Private textInt As StringBuilder
	Public link As String
	Public linkToPage As Int
	Public tocItem As Boolean
	Public pageOrientation As String
	Public pageBreakBefore As Boolean
	Public pageBreakAfter As Boolean
	Public style As PDFStyle
	Public colSpan As Int
	Public rowSpan As Int
	Public linkToDestination As String
	Public id As String 
	Public listType As String
	Public pageReference As String
	Public textReference As String
	Public preserveLeadingSpaces As Boolean
End Sub

'Initializes the text
Public Sub Initialize As PDFText
	contentInt.Initialize 
	textInt.Initialize 
	style.Initialize 
	link = Null
	linkToPage = Null
	tocItem = Null
	pageBreakBefore = Null
	pageBreakAfter = Null
	pageOrientation = Null
	colSpan = Null
	rowSpan = Null
	linkToDestination = Null
	listType = Null
	id = Null
	pageReference = Null
	textReference = Null
	preserveLeadingSpaces = Null
	Return Me 
End Sub

'set tocNumberStyle
Sub SetTocNumberStyle(ts As PDFStyle) As PDFText
	contentInt.Put("tocNumberStyle", ts)
	Return Me
End Sub

'set tocStyle
Sub SetTocStyle(ts As PDFStyle) As PDFText
	contentInt.Put("tocStyle", ts)
	Return Me
End Sub

'set margins for the toc
Sub SetTocMargin(l As Int, t As Int, r As Int, b As Int) As PDFText
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	contentInt.Put("tocMargin", margin)
	Return Me
End Sub

'set tocItem
Sub SetTocItem(ti As Boolean) As PDFText
	tocItem = ti
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFText
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	contentInt.Put("absolutePosition", opt)
	Return Me
End Sub

'set border color for the text
Sub SetBorderColor(l As Int, t As Int, r As Int, b As Int) As PDFText
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	contentInt.Put("borderColor", margin)
	Return Me
End Sub

'set relativePosition
Sub SetRelativePosition(x As Int, y As Int) As PDFText
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	contentInt.Put("relativePosition", opt)
	Return Me
End Sub

'set fill color
Sub SetFillColor(fc As Object) As PDFText
	style.fillColor = fc
	Return Me
End Sub

'set alignment center
Sub SetAlignmentCenter As PDFText
	style.alignmentCenter = True
	Return Me
End Sub

'set alignment right
Sub SetAlignmentRight As PDFText
	style.alignmentRight = True
	Return Me	
End Sub

'set alignment justify
Sub SetAlignmentJustify As PDFText
	style.alignmentJustify = True
	Return Me
End Sub

'set the row Span
Sub SetRowSpan(rs As Int) As PDFText
	rowSpan = rs
	Return Me
End Sub

'set col Span
Sub SetColSpan(cs As Int) As PDFText
	colSpan = cs
	Return Me
End Sub

'set style
Sub SetStyle(styleName As String) As PDFText
	style.AddStyle(styleName)
	Return Me
End Sub

'set the width
Sub SetWidth(sWidth As String) As PDFText
	style.width = sWidth
	Return Me
End Sub

Sub SetBold(b As Boolean) As PDFText
	style.bold = b
	Return Me
End Sub

Sub SetItalics(b As Boolean) As PDFText
	style.italics = b
	Return Me
End Sub

Sub SetFontSize(fs As Int) As PDFText
	style.fontSize = fs
	Return Me
End Sub

Sub SetColor(colour As String) As PDFText
	style.color = colour
	Return Me
End Sub

'append text to contents
Sub Append(txt As String) As PDFText
	textInt.Append(txt)
	Return Me
End Sub

'append text with a newline
Sub AppendLine(txt As String) As PDFText
	textInt.Append(txt)
	textInt.Append(CRLF)
	Return Me
End Sub

'set page break before
Sub SetPageBreakBefore As PDFText
	contentInt.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFText
	contentInt.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the ext
Sub getContent As Map
	Dim outcome As String = textInt.tostring
	contentInt.Put("text", outcome)
	If linkToPage <> Null Then contentInt.Put("linkToPage", linkToPage)
	If link <> Null Then contentInt.Put("link", link)
	If tocItem <> Null Then contentInt.Put("tocItem", tocItem)
	If pageOrientation <> Null Then contentInt.Put("pageOrientation", pageOrientation)
	If pageBreakBefore Then contentInt.Put("pageBreak", "before")
	If pageBreakAfter Then contentInt.Put("pageBreak", "after")
	If colSpan <> Null Then contentInt.Put("colSpan", colSpan)
	If rowSpan <> Null Then contentInt.Put("rowSpan", rowSpan)
	If linkToDestination <> Null Then contentInt.Put("linkToDestination", linkToDestination)
	If id <> Null Then contentInt.Put("id", id)
	If listType <> Null Then contentInt.Put("listType", listType)
	If pageReference <> Null Then contentInt.Put("pageReference", pageReference)
	If textReference <> Null Then contentInt.Put("textReference", textReference)
	If preserveLeadingSpaces <> Null Then contentInt.Put("preserveLeadingSpaces", preserveLeadingSpaces)
	style.Include(contentInt)
	Return contentInt
End Sub
