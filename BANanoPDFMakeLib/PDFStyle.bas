B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public fontSize As Int
	Public bold As Boolean
	Public italics As Boolean
	Public alignmentRight As Boolean
	Public alignmentCenter As Boolean
	Public alignmentJustify As Boolean
	Public color As String
	Public name As String
	Public width As String
	Public opacity As Double
	Public angle As Double
	Private m As Map
	Private styles As List
	Public columnGap As Int
	Public decoration As String
	Public decorationStyle As String
	Public decorationColor As String
	Public fillColor As String
	Public background As String
End Sub

'Initializes the object.
Public Sub Initialize As PDFStyle
	m.Initialize 
	name = Null
	fillColor = Null
	background = Null
	fontSize = Null
	bold = Null
	italics = Null
	alignmentRight = Null
	alignmentCenter = Null
	alignmentJustify = Null
	color = Null
	width = Null
	opacity = Null
	angle = Null
	styles.Initialize 
	columnGap = Null
	decoration = Null
	decorationStyle = Null
	decorationColor = Null
	Return Me
End Sub

'set columnGap
Sub SetColumnGap(icolumnGap As Int) As PDFStyle
	columnGap = icolumnGap
	Return Me
End Sub

'set angle
Sub SetAngle(dangle As Double) As PDFStyle
	angle = dangle
	Return Me
End Sub

'set opacity
Sub SetOpacity(o As Double) As PDFStyle
	opacity = o
	Return Me
End Sub

'set width
Sub SetWidth(w As Int) As PDFStyle
	width = w
	Return Me
End Sub

'set color
Sub SetColor(scolor As String) As PDFStyle
	color = scolor
	Return Me
End Sub

'set alignment
Sub SetAlignment(alignment As String) As PDFStyle
	m.Put("alignment", alignment)
	Return Me	
End Sub

'set italics
Sub SetItalics(b As Boolean) As PDFStyle
	italics = b
	Return Me
End Sub

'set bold
Sub SetBold(b As Boolean) As PDFStyle
	bold = b
	Return Me
End Sub

'set the fontSize
Sub SetFontSize(ifontSize As Int) As PDFStyle
	fontSize = ifontSize
	Return Me
End Sub


'add a predefined style
Sub AddStyle(styleName As String) As PDFStyle
	styles.Add(styleName)
	Return Me
End Sub

'set margins for the text
Sub SetMargin(l As Int, t As Int, r As Int, b As Int) As PDFStyle
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	m.Put("margin", margin)
	Return Me
End Sub

'set decoration
Sub SetDecoration(dec As String) As PDFStyle
	decoration = dec
	Return Me
End Sub


'set fill color
Sub SetFillColor(fc As Object) As PDFStyle
	fillColor = fc
	Return Me
End Sub


'get the contents of the style
Sub getContent As Map
	If fontSize <> Null Then m.put("fontSize", fontSize)
	If bold <> Null Then m.Put("bold", bold)
	If italics <> Null Then m.Put("italics", italics)
	If alignmentRight <> Null Then m.Put("alignment", "right")
	If alignmentCenter <> Null Then m.Put("alignment", "center")
	If alignmentJustify <> Null Then m.Put("alignment", "justify")
	If color <> Null Then m.Put("color", color)
	If opacity <> Null Then m.Put("opacity", opacity)
	If angle <> Null Then m.Put("angle", angle)
	If width <> Null Then m.Put("width", width)
	If columnGap <> Null Then m.Put("columnGap", columnGap)
	If decoration <> Null Then m.Put("decoration", decoration)
	If fillColor <> Null Then m.Put("fillColor", fillColor)
	If decoration <> Null Then m.Put("decoration", decoration)
	If background <> Null Then m.Put("background", background)
	If decorationStyle <> Null Then m.Put("decorationStyle", decorationStyle)
	If decorationColor <> Null Then m.Put("decorationColor", decorationColor)
	If styles.Size > 0 Then
		m.Put("style", styles)
	End If
	Return m
End Sub

'include this style to another object
Sub Include(target As Map)
	Dim source As Map = getContent
	For Each k As String In source.Keys
		Dim v As Object = source.Get(k)
		target.Put(k, v)
	Next
End Sub