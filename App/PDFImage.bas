B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private options As Map
	Public style As PDFStyle
	Public image As String
	Public width As Int
	Public height As Int
	Public pageBreakAfter As Boolean
	Public pageBreakBefore As Boolean
End Sub

'Initializes the stack: a collection of paragraphs
Public Sub Initialize As PDFImage
	options.Initialize
	style.Initialize
	image = Null
	width = Null
	height = Null
	pageBreakAfter = Null
	pageBreakBefore = Null
	Return Me
End Sub

'set opacity
Sub SetOpacity(opacity As Double) As PDFImage
	options.Put("opacity", opacity)
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFImage
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	options.Put("absolutePosition", opt)
	Return Me
End Sub


'make it fit
Sub SetFit(w As Int, h As Int) As PDFImage
	Dim lst As List
	lst.Initialize 
	lst.Add(w)
	lst.Add(h)
	options.Put("fit", lst)
	Return Me
End Sub

'get the contents of the stack
Sub getContent As Map
	If image <> Null Then options.Put("image", image)
	If width <> Null Then options.Put("width", width)
	If height <> Null Then options.Put("height", height)
	If pageBreakAfter <> Null Then options.Put("pageBreak", "after")
	If pageBreakBefore <> Null Then options.Put("pageBreak", "before")
	style.Include(options)
	Return options
End Sub