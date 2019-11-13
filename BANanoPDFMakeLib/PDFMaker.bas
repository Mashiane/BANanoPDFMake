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
	Private parentID As String
	Private fName As String
	Private Blobs As Map
	Private NumFiles As Int
	Private files As Map
	Private images As Map
	Private fileKeys As Map
	Private action As String
	Private eventHandler As Object
	Private eventMethod As String
End Sub

'Initializes the maker
Public Sub Initialize As PDFMaker
	pdfMake.Initialize("pdfMake")
	Blobs.Initialize
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
	files.Initialize 
	images.Initialize 
	fileKeys.Initialize 
	Return Me
End Sub

'preload images before use
Sub Preload(key As String, url As String) As PDFMaker
	files.Put(key, url)
	fileKeys.Put(url, key)
	'how many files we need
	NumFiles = files.size
	Return Me
End Sub

'add toc
Sub AddToC(toc As PDFToC) As PDFMaker
	content.Add(toc.Content)
	Return Me
End Sub

'create the TOC
Sub CreateToC As PDFToC
	Dim toc As PDFToC
	toc.Initialize 
	Return toc
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
Sub CreateImage(imgKey As String) As PDFImage
	Dim img As PDFImage
	img.Initialize 
	img.SetImage(imgKey)
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

'create style only
Sub CreateStyleOnly As PDFStyle
	Dim stl As PDFStyle
	stl.Initialize 
	Return stl
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
	docDefinition.Put("defaultStyle", defaultStyle.content)
	Return docDefinition
End Sub

'convert to json
Sub getJSON As String
	Dim ddy As Map = getDD
	Dim sJSON As String = BANano.ToJson(ddy)
	Return sJSON
End Sub

'download the pdf document
Sub Download(fileName As String)
	fName = fileName
	action = "download"
	Build
End Sub

'build the report
private Sub Build
	If files.Size > 0 Then
		For Each k As String In files.Keys
			'get the file url
			Dim v As String = files.Get(k)
			GetFileFromServer(v)
		Next
	Else
		FilesAreReady
	End If
End Sub

'print the pdf document
Sub Print
	action = "print"
	Build
End Sub

'open the pdf document
Sub Open
	action = "open"
	Build
End Sub


'code from alwaysbusy
private Sub GetFileFromServer(FileName As String)
	Dim Response As BANanoFetchResponse
	Dim Blob As BANanoObject
  
	' list (GET is default, and we do not need extra options so we pass Null for the options)
	Dim fetch1 As BANanoFetch
	fetch1.Initialize(FileName, Null)
	fetch1.Then(Response)
	' we got the response promise, so resolve it to a blob
	fetch1.Return(Response.Blob)
	fetch1.Then(Blob)
	' we got the blob, read it in a FileReader
	Dim FileReader As BANanoObject
	FileReader.Initialize2("FileReader", Null)
	Dim event As BANanoEvent
	' when loaded...
	FileReader.AddEventListenerOpen("onload", Array(event))
	' get the data
	Dim Target As BANanoObject = event.OtherField("target")
	Dim DataUrl As String = Target.GetField("result").Result
	' save the data per filename
	Blobs.Put(FileName, DataUrl)
	' if we have them all...
	If Blobs.Size = NumFiles Then
		FilesAreReady
	End If
	' closing the 'onload' event listener function
	FileReader.CloseEventListener
	' get the DataURL, which will call the 'onload' method we've just written
	FileReader.RunMethod("readAsDataURL", Blob)
	fetch1.End ' always end a fetch with this!
End Sub

private Sub FilesAreReady()
	If files.Size > 0 Then
		' we got all the files in base64 format
		For Each k As String In Blobs.Keys
			'get the file key using URL
			Dim v As String = fileKeys.Get(k)
			Dim DataUrl As String = Blobs.Get(k)
			images.Put(v, DataUrl)
		Next
  		If images.Size > 0 Then docDefinition.Put("images", images)
	End If
	'ge the definition
	Dim ddy As Map = getDD
	Select Case action
	Case "download"
		pdfMake.RunMethod("createPdf", ddy).RunMethod("download", Array(fName))
	Case "print"
		pdfMake.RunMethod("createPdf", ddy).RunMethod("print", Null)
	Case "open"
		pdfMake.RunMethod("createPdf", ddy).RunMethod("open", Null)
	End Select
	' build the actual report
End Sub

'get the data url of the document
Sub GetDataURL(module As Object, methodName As String, data As Object)
	Dim ddy As Map = getDD
	Dim gd As BANanoObject = BANano.CallBack(module, methodName, Array(data))
	pdfMake.RunMethod("createPdf", ddy).RunMethod("getDataUrl", Array(gd))
End Sub

'get the blob of the document
Sub GetBlob(module As Object, methodName As String, data As Object)
	Dim ddy As Map = getDD
	Dim gd As BANanoObject = BANano.CallBack(module, methodName, Array(data))
	pdfMake.RunMethod("createPdf", ddy).RunMethod("getBlob", Array(gd))
End Sub

'get the buffer of the document
Sub GetBuffer(module As Object, methodName As String, data As Object)
	Dim ddy As Map = getDD
	Dim gd As BANanoObject = BANano.CallBack(module, methodName, Array(data))
	pdfMake.RunMethod("createPdf", ddy).RunMethod("getBuffer", Array(gd))
End Sub

'get the base64 of the document
Sub GetBase64(module As Object, methodName As String, data As Object)
	Dim ddy As Map = getDD
	Dim gd As BANanoObject = BANano.CallBack(module, methodName, Array(data))
	pdfMake.RunMethod("createPdf", ddy).RunMethod("getBase64", Array(gd))
End Sub

'prepare to upload, returns formData
Sub PrepareToUpload(blob As Object, fileName As String) As BANanoObject
	Dim formData As BANanoObject
	formData.Initialize2("FormData",Null)
	formData.RunMethod("append", Array("upload", blob, fileName))
	Return formData
End Sub

'upload the file
Sub Upload(module As Object, methodName As String, fileName As String)
	eventHandler = module
	eventMethod = methodName
	fName = fileName
	'get the blob
	Dim data As Object
	GetBlob(Me, "forUpload", data)
End Sub

private Sub forUpload(data As Object)
	Dim fd As BANanoObject = PrepareToUpload(data, fName)
	BANano.CallSub(eventHandler, eventMethod, fd)
End Sub
