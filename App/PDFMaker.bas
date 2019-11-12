B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private styles As Map
	Private docDefinition As Map
	Private content As List
	Public defaultStyle As PDFStyle
	Private pdfMake As BANanoObject
	Private BANano As BANano
	Public pageSize As String
	Public pageOrientation As String
	Public title As String
	Public author As String
	Public subject As String
	Public keywords As String
	Public creator As String
	Public producer As String
	Private info As Map
	Private compress As Boolean
	Public security As PDFSecurity
End Sub

'Initializes the maker
Public Sub Initialize As PDFMaker
	styles.Initialize 
	docDefinition.Initialize 
	content.Initialize 
	defaultStyle.Initialize
	defaultStyle.name = "defaultStyle"
	pageSize = Null
	pageOrientation = Null
	title = Null
	author = Null
	subject = Null
	keywords = Null
	creator = Null
	producer = Null
	info.Initialize
	compress = Null 
	security.Initialize 
	Return Me
End Sub

'set the margins
Sub SetPageMargins(l As Int, t As Int, r As Int, b As Int) As PDFMaker
	Dim margin As List
	margin.Initialize
	margin.AddAll(Array(l,t,r,b))
	docDefinition.Put("pageMargins", margin)
	Return Me
End Sub

'create a row
Sub CreateRow As PDFRow
	Dim row As PDFRow
	row.Initialize 
	Return row
End Sub

'create a table
Sub CreateTable As PDFTable
	Dim tbl As PDFTable
	tbl.Initialize
	Return tbl 
End Sub

'create an image
Sub CreateImage As PDFImage
	Dim img As PDFImage
	img.Initialize 
	Return img
End Sub

'add an image
Sub AddImage(img As PDFImage) As PDFMaker
	content.Add(img.Content)
	Return Me
End Sub

'add a table
Sub AddTable(tbl As PDFTable) As PDFMaker
	content.Add(tbl.Content)
	Return Me
End Sub

Sub SetWaterMark(wm As PDFText) As PDFMaker
	docDefinition.Put("watermark", wm.Content)
	Return Me
End Sub

Sub SetToC(toc As PDFText) As PDFMaker
	Dim tocm As Map = CreateMap()
	tocm.Put("title", toc.Content)
	Dim toct As Map = CreateMap()
	toct.Put("toc", tocm)
	content.Add(toct)
	Return Me
End Sub

'set background to appear on every page
Sub SetBackground(wm As PDFText) As PDFMaker
	docDefinition.Put("background", wm.Content)
	Return Me
End Sub

'set header
Sub SetHeader(hdr As PDFText) As PDFMaker
	docDefinition.Put("header", hdr.content)
	Return Me
End Sub

'add columns to the page
Sub AddColumns(cols As PDFColumns) As PDFMaker
	content.Add(cols.content)
	Return Me
End Sub

'add a footer to the page
Sub AddFooter(ftr As PDFFooter) As PDFMaker
	docDefinition.Put("footer", ftr.content)
	Return Me
End Sub

'add a stack
Sub AddStack(stack As PDFStack) As PDFMaker
	content.Add(stack.Content)
	Return Me
End Sub

'add a qr code
Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker
	content.Add(qrCode.Content)
	Return Me
End Sub

'add a paragraph
Sub AddParagraphs(stack As PDFParagraphs) As PDFMaker
	content.Add(stack.Content)
	Return Me
End Sub

'add string
Sub AddString(txt As String) As PDFMaker
	content.Add(txt)
	Return Me
End Sub

'create a qr code
Sub CreateQRCode As PDFQRCode
	Dim qrcode As PDFQRCode
	qrcode.Initialize 
	Return qrcode
End Sub

'create a stack
Sub CreateStack As PDFStack
	Dim stack As PDFStack
	stack.Initialize
	Return stack
End Sub

'create paragraphs
Sub CreateParagraphs As PDFParagraphs
	Dim stack As PDFParagraphs
	stack.Initialize
	Return stack
End Sub

'create a footer
Sub CreateFooter As PDFFooter
	Dim ftr As PDFFooter
	ftr.Initialize
	Return ftr 
End Sub

'create a list
Sub CreateList(typeOf As String) As PDFList
	Dim lstOf As PDFList
	lstOf.Initialize(typeOf)
	Return lstOf
End Sub

'add a list
Sub AddList(lstOf As PDFList) As PDFMaker
	content.Add(lstOf.Content)
	Return Me
End Sub

'create columns
Sub CreateColumns As PDFColumns
	Dim col As PDFColumns
	col.Initialize
	Return col
End Sub

'create a new style
Sub CreateStyle(name As String) As PDFStyle
	Dim Style As PDFStyle
	Style.Initialize
	Style.name = name
	Return Style
End Sub

'create new text content
Sub CreateText(txt As String) As PDFText
	Dim cnt As PDFText
	cnt.Initialize
	cnt.Append(txt)
	Return cnt
End Sub

'add a style for the collection
Sub AddStyle(style As PDFStyle)
	Dim name As String = style.name
	Dim stylecontent As Map = style.content
	styles.Put(name, stylecontent)
End Sub

'add text to the page
Sub AddText(currentContent As PDFText)
	Dim text As Map = currentContent.Content 
	content.Add(text)
End Sub

'get the contents of the doc definition
Sub getDD As Map
	If pageSize <> Null Then docDefinition.Put("pageSize", pageSize)
	If pageOrientation <> Null Then docDefinition.Put("pageOrientation", pageOrientation)
	docDefinition.Put("content", content)
	docDefinition.Put("styles", styles)
	If title <> Null Then info.Put("title", title)
	If author <> Null Then info.Put("author", author)
	If subject <> Null Then info.Put("subject", subject)
	If keywords <> Null Then info.Put("keywords", keywords)
	If creator <> Null Then info.Put("creator", creator)
	If producer <> Null Then info.Put("producer", producer)
	If info.Size > 0 Then docDefinition.Put("info", info)
	If compress <> Null Then docDefinition.Put("compress", compress)
	If security.userPassword <> Null Then docDefinition.Put("userPassword", security.userPassword)
	If security.ownerPassword <> Null Then docDefinition.Put("ownerPassword", security.ownerPassword)
	docDefinition.Put("permissions", security.content)
	docDefinition.Put("defaultStyle", defaultStyle)
	Return docDefinition
End Sub

'convert to json
Sub getJSON As String
	Dim ddy As Map = getDD
	Dim sJSON As String = BANano.ToJson(ddy)
	Return sJSON
End Sub

'download the pdf document
Sub Download
	Dim ddy As Map = getDD
	pdfMake.Initialize("pdfMake")
	Dim dx As BANanoObject = pdfMake.RunMethod("createPdf", ddy)
	dx.RunMethod("download", Null)
End Sub

'print the pdf document
Sub Print
	Dim ddy As Map = getDD
	pdfMake.Initialize("pdfMake")
	Dim dx As BANanoObject = pdfMake.RunMethod("createPdf", ddy)
	dx.RunMethod("print", Null)
End Sub

'open the pdf document
Sub Open
	Dim ddy As Map = getDD
	pdfMake.Initialize("pdfMake")
	Dim dx As BANanoObject = pdfMake.RunMethod("createPdf", ddy)
	dx.RunMethod("open", Null)
End Sub

'open in an iframe
Sub ToIFrame(divID As String)
	Dim ddy As Map = getDD
	pdfMake.Initialize("pdfMake")
	Dim pdfDocGenerator As BANanoObject = pdfMake.RunMethod("createPdf", ddy)
	Dim dataUrl As Object
	pdfDocGenerator.RunMethod("getDataUrl",Array(dataUrl))
	'
	Dim kID As String = $"#${divID}"$
	Dim targetElement As BANanoObject = BANano.Window.GetField("document").RunMethod("querySelector", Array(kID))
	Dim iframe As BANanoObject = BANano.Window.GetField("document").runmethod("createElement", Array("iframe"))
	iframe.SetField("src", dataUrl)
	targetElement.RunMethod("appendChild", Array(iframe))
End Sub