B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private options As Map
	Public style As PDFStyle
	Public svg As String
	Public width As Int
	Public height As Int
	Public pageBreakAfter As Boolean
	Public pageBreakBefore As Boolean
End Sub

'Initializes the stack: a collection of paragraphs
Public Sub Initialize As PDFSvg
	options.Initialize
	style.Initialize
	svg = Null
	width = Null
	height = Null
	pageBreakAfter = Null
	pageBreakBefore = Null
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As PDFSvg
	width = w
	Return Me
End Sub

'set height
Sub SetHeight(h As Int) As PDFSvg
	height = h
	Return Me
End Sub

'set image key
Sub SetSvg(imgKey As String) As PDFSvg
	svg = imgKey
	Return Me
End Sub

'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFSvg
	style.SetMargin(l,t,r,b)
	Return Me
End Sub

'set alignment center
Sub SetAlignmentCenter As PDFSvg
	style.alignmentCenter = True
	Return Me
End Sub

'set alignment right
Sub SetAlignmentRight As PDFSvg
	style.alignmentRight = True
	Return Me
End Sub

'set alignment justify
Sub SetAlignmentJustify As PDFSvg
	style.alignmentJustify = True
	Return Me
End Sub


'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFSvg
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	options.Put("absolutePosition", opt)
	Return Me
End Sub

'make it fit
Sub SetFit(w As Int, h As Int) As PDFSvg
	Dim lst As List
	lst.Initialize
	lst.Add(w)
	lst.Add(h)
	options.Put("fit", lst)
	Return Me
End Sub

'set page break before
Sub SetPageBreakBefore As PDFSvg
	options.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFSvg
	options.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the stack
Sub getContent As Map
	If svg <> Null Then options.Put("svg", svg)
	If width <> Null Then options.Put("width", width)
	If height <> Null Then options.Put("height", height)
	If pageBreakAfter <> Null Then options.Put("pageBreak", "after")
	If pageBreakBefore <> Null Then options.Put("pageBreak", "before")
	style.Include(options)
	Return options
End Sub
