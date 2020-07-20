B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano
	Private body As BANanoElement
End Sub

Sub FromLayout
	Dim maker As PDFMaker
	maker.Initialize
	maker.defaultStyle.fontSize = 12
	maker.pageSize = "A4"
	maker.pageOrientation = "potrait"  '/potrait
	maker.SetPageMargins(40, 60, 40, 60)
	maker.title = "PDFMake from Layout"
	maker.author = "TheMash"
	
	BANano.LoadLayout("#body", "pdf1")
	BANano.LoadLayout("#placeholder", "pdf2")
	'
	maker.AddHTML("#body")
	'
	'we have passed a class=red in one of the components
	Dim red As PDFStyle = maker.CreateStyle("red").SetColor("red")
	maker.AddStyle(red)
	'format all <strong> elements
	Dim htmlstring As PDFStyle = maker.CreateStyle("html-strong").SetBackground("yellow")
	maker.AddStyle(htmlstring)
	
	maker.Download("bananopdfmake.pdf")
End Sub

Sub Init
	'get the body of the page
	body = BANano.GetElement("#body")
	'empty the element
	body.Empty
	body.Append($"<iframe id="basic"></iframe>"$)
	'
	'pgpdf.display
	'pdf.basic
	'pdf.columns
	'pdf.images
	'pdf.inlineStyles
	'pdf.margins
	'pdf.tables
	'pdf.images
	'pdf.toc
	'Return
	
	'
	Dim maker As PDFMaker
	maker.Initialize
	maker.defaultStyle.fontSize = 11
	maker.pageSize = "A4"
	maker.pageOrientation = "potrait"  '/potrait
	maker.SetPageMargins(40, 60, 40, 60)
	maker.title = "A PDF Document done with BANanoMake"
	maker.author = "TheMash"
	'maker.security.userPassword = "UOE"
	'maker.security.ownerPassword = "UOE"
	maker.security.copying = False
	
	'add a header
	Dim hdr As PDFText = maker.CreateText("Creating client side PDF documents with BANanoPDFMake")
	hdr.style.alignmentCenter = True
	hdr.tocItem = True
	maker.SetHeader(hdr)
	
	'watermark
	Dim wm As PDFText = maker.CreateText("BANano 5.10+")
	wm.style.color = "lightblue"
	wm.style.opacity = 0.3
	wm.style.bold = True
	wm.style.italics = False
	wm.style.angle = 70
	wm.style.fontsize = 70
	maker.SetWaterMark(wm)
	'
	'create a footer
	Dim ftr As PDFFooter = maker.CreateFooter
	ftr.LeftPart.Append("Footer Left Part")
	ftr.LeftPart.style.bold = True 
	ftr.RightPart.Append("Footer Right Part")
	ftr.RightPart.style.alignmentRight = True
	maker.AddFooter(ftr)
	
	'create a predefined style
	Dim f15 As PDFStyle = maker.CreateStyle("f15")
	f15.fontSize = 15
	maker.AddStyle(f15)
	
	'download banano
	Dim db As PDFText = maker.CreateText("Download BANano 5.10+")
	db.link = "https://www.b4x.com/android/forum/threads/banano-website-app-wpa-library-with-abstract-designer-support.99740/#content"
	db.style.decoration = "underline"
	db.style.SetMargin(20,20,20,20)
	db.tocItem = True
	maker.AddText(db)
	
	'add a qr code
	Dim qrcode As PDFQRCode = maker.CreateQRCode
	qrcode.Initialize 
	qrcode.qr = "BANanoPDFMake"
	qrcode.foreground = "black"
	qrcode.fit = "80"
	'qrcode.mask = "4.07"
	qrcode.modeAlphanumeric = True
	qrcode.style.setmargin(20,20,20,20)
	maker.AddQRCode(qrcode)
	
	'normal text
	Dim content1 As PDFText = maker.CreateText("This is a standard paragraph, using default style")
	content1.style.SetMargin(5,10,5,10)
	maker.AddText(content1)
	'text with bigger font
	Dim content5 As PDFText = maker.CreateText("This paragraph will have a bigger font")
	content5.style.fontSize = 15
	maker.AddText(content5)
	'collection of paragraphs
	Dim content2 As PDFText = maker.CreateText("This paragraph is defined as an array of elements to make it possible to ")
	Dim content3 As PDFText = maker.CreateText("restyle part of it and make it bigger ")
	content3.style.fontSize = 15
	Dim content4 As PDFText = maker.CreateText("than the rest.")
	'
	Dim stack1 As PDFParagraphs = maker.CreateParagraphs
	stack1.AddText(content2)
	stack1.AddText(content3)
	stack1.AddText(content4)
	stack1.AddString("I'm loving this!")
	maker.AddParagraphs(stack1)
	
	'columns
	Dim cols As PDFColumns = maker.CreateColumns
	cols.AddText(maker.CreateText("Column 1").SetWidth("auto"))
	cols.AddText(maker.CreateText("Column 2").SetWidth("*"))
	cols.AddText(maker.CreateText("Column 3").SetWidth(100))
	cols.AddText(maker.CreateText("Column 4").SetWidth("20%"))
	cols.style.SetMargin(10,10,10,10)
	maker.AddColumns(cols)
	
	'lists
	Dim ol As PDFList = maker.CreateList("ol")
	ol.AddItems(Array("Item 1", "Item 2", "Item 3"))
	
	Dim item4 As PDFText = maker.CreateText("Item 4")
	item4.style.bold = True
	ol.AddText(item4)
	maker.AddList(ol)
	
	Dim ul As PDFList = maker.CreateList("ul")
	ul.AddItems(Array("Item 1", "Item 2", "Item 3"))
	ul.style.SetMargin(0,10,0,10)
	maker.AddList(ul)
	'
	'stack of paragraphs
	Dim stack As PDFStack = maker.CreateStack
	stack.style.fontSize = 15
	stack.AddString("paragraph A")
	stack.AddString("paragraph B")
	stack.AddString("these paragraphs will be rendered one below another inside the column")
	maker.AddStack(stack)
	
	'add another page
	Dim pgText As PDFText = maker.CreateText("This text is in Potrait Mode")
	pgText.pageOrientation = "potrait"
	pgText.pageBreakBefore = True
	maker.AddText(pgText)
	
	'
	'another page
	Dim pgText1 As PDFText = maker.CreateText("This text is in LandScape Mode")
	pgText1.pageOrientation = "landscape"
	pgText1.pageBreakAfter = True
	pgText1.pageBreakBefore = True
	maker.AddText(pgText1)
	'
	'another page
	Dim pgText2 As PDFText = maker.CreateText("Another Page...")
	pgText2.pageBreakAfter = True
	
	maker.AddText(pgText2)
	
	'
	Dim tbl As PDFTable = maker.CreateTable
	tbl.headerRows = 1 'repeat first row
	tbl.AddColumn("1st", "*", Null)
	tbl.AddColumn("2nd", "auto", Null)
	tbl.AddColumn("3rd", 100, Null)
	tbl.AddColumn("4rth", "*", Null)
	'
	tbl.AddRow(Array("Value 1", "Value 2", "Value 3", "Value 4"))
	tbl.AddRow(Array("Value 5", "Value 6", "Value 7", "Value 8"))
	
	Dim r2c1 As PDFText = maker.CreateText("Bold Value")
	r2c1.style.bold = True
	tbl.AddRow(Array(r2c1.content, "Value 10", "Value 11", "Value 12"))
	
	maker.AddTable(tbl)
	
	'**** IMAGES
	maker.Preload("one", "./assets/1.jpg")
	maker.Preload("seven9", "./assets/79.jpg")
	maker.Preload("yuna", "./assets/yuna.jpg")
	'
	maker.AddString("Image Manipulation")
	maker.AddImage(maker.CreateImage("one").SetWidth(150).SetHeight(150))
	'
	maker.AddString("You can also fit the image inside a rectangle'")
	maker.AddImage(maker.CreateImage("yuna").SetFit(100, 100).SetPageBreakAfter)
	'
	maker.AddString("and opacity is supported")
	maker.AddImage(maker.CreateImage("seven9").SetWidth(150).SetOpacity(0.5))
	'
	maker.AddString("place image at xy")
	maker.AddImage(maker.CreateImage("seven9").SetWidth(60).SetHeight(60).SetAbsolutePosition(500, 50))
	'
	'****** HEADERS & TEXT
	'add global styles and add them to definition
	Dim header As PDFStyle = maker.CreateStyle("header").SetFontSize(18).SetBold(True)
	maker.AddStyle(header)
	'
	Dim subheader As PDFStyle = maker.CreateStyle("subheader").SetFontSize(15).SetBold(True)
	maker.AddStyle(subheader)
	'
	Dim quotex As PDFStyle = maker.CreateStyle("quote").SetItalics(True)
	maker.AddStyle(quotex)
	'
	Dim small As PDFStyle = maker.CreateStyle("small").SetFontSize(8)
	maker.AddStyle(small)

	'
	maker.AddText(maker.CreateText("This is a TOC example. Text elements marked with tocItem: true will be located in the toc. See below.").SetPageBreakAfter)
	'
	Dim tc As PDFToC = maker.CreateToc.SetTitle(maker.CreateText("TABLE OF CONTENTS").SetStyle("header"))
	tc.SetNumberStyle(maker.CreateStyleOnly.SetBold(True))
	maker.AddToc(tc)
	'
	Dim p1 As PDFText = maker.CreateText("This is a header, using header style").SetStyle("header")
	p1.SetTocItem(True)
	p1.SetPageBreakBefore
	p1.SetTocStyle(maker.CreateStyleOnly.SetItalics(True))
	p1.SetTocMargin(0, 10, 0, 0)
	p1.SetTocNumberStyle(maker.CreateStyleOnly.SetItalics(True).SetDecoration("underline"))
	maker.AddText(p1)
	'
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	
	maker.AddText(maker.CreateText("Subheader 1 - using subheader style").SetStyle("subheader").SetTocItem(True).SetPageBreakBefore)
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	'
	maker.AddText(maker.CreateText("Subheader 2 - using subheader style").SetStyle("subheader").SetTocItem(True).SetPageBreakBefore)
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	maker.AddString("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Confectum ponit legam...")
	'
	maker.AddText(maker.CreateText("You can use multiple styles").SetStyle("quote").SetStyle("small"))
	'
	'**** TABLES
	Dim tableExample As PDFStyle = maker.CreateStyle("tableExample")
	tableExample.SetMargin(0, 5, 0, 15)
	maker.AddStyle(tableExample)
	'
	Dim tableHeader As PDFStyle = maker.CreateStyle("tableHeader")
	tableHeader.bold = True
	tableHeader.fontSize = 13
	tableHeader.color = "black"
	maker.AddStyle(tableHeader)
	'
	Dim tbl As PDFTable = maker.CreateTable
	tbl.style.AddStyle("tableExample")
	tbl.AddColumn("Column 1", Null, Null)
	tbl.AddColumn("Column 2", Null, Null)
	tbl.AddColumn("Column 3", Null, Null)
	'
	tbl.AddRow(Array("One value goes here", "Another one here", "OK?"))
	maker.AddTable(tbl)
	'
	Dim tblE As PDFTable = maker.CreateTable
	tblE.style.AddStyle("tableExample")
	tblE.AddColumn("width=100", 100, Null)
	tblE.AddColumn("star-sized", "*", Null)
	tblE.AddColumn("width=200", 200, Null)
	tblE.AddColumn("star-sized", "*", Null)
	'
	Dim row As PDFRow = maker.CreateRow
	row.AddString("fixed-width cells have exactly the specified width")
	row.AddText(maker.CreateText("nothing interesting here").SetItalics(True).SetColor("gray"))
	row.AddText(maker.CreateText("nothing interesting here").SetItalics(True).SetColor("gray"))
	row.AddText(maker.CreateText("nothing interesting here").SetItalics(True).SetColor("gray"))
	tblE.AddRow1(row)
	maker.AddTable(tblE)
	'
	'another table
	Dim tblD As PDFTable = maker.CreateTable
	tblD.style.color = "#444"
	tblD.SetWidths(Array(200, "auto", "auto"))
	tblD.headerRows = 2
	'
	Dim row As PDFRow = maker.CreateRow
	row.AddText(maker.CreateText("Header with Colspan = 2").SetStyle("tableHeader").SetColSpan(2).SetAlignmentCenter)
	row.AddEmpty
	row.AddText(maker.CreateText("Header 3").SetStyle("tableHeader").SetAlignmentCenter)
	tblD.AddRow1(row)
	'
	Dim row1 As PDFRow = maker.CreateRow
	row1.AddText(maker.CreateText("Header 1").SetStyle("tableHeader").SetAlignmentCenter)
	row1.AddText(maker.CreateText("Header 2").SetStyle("tableHeader").SetAlignmentCenter)
	row1.AddText(maker.CreateText("Header 3").SetStyle("tableHeader").SetAlignmentCenter)
	tblD.AddRow1(row1)
	'
	'*** MARGINS
	Dim stack As PDFStack = maker.CreateStack
	stack.AddString("This header has both top and bottom margins defined")
	stack.AddText(maker.CreateText("This is a subheader").SetStyle("subheader"))
	stack.style.AddStyle("header")
	'
	maker.AddStack(stack)
	'
	'**** INLINE STYLE
	'create styles to use globally
	'
	Dim s2 As PDFStyle = maker.CreateStyle("bigger")
	s2.fontsize = 15
	s2.italics = True
	maker.AddStyle(s2)
	'
	Dim hdr As PDFText = maker.CreateText("This is a header").SetStyle("header")
	maker.AddText(hdr)
	'
	Dim para As PDFParagraphs = maker.CreateParagraphs
	para.AddString("It is however possible to provide an array of texts ")
	para.AddString("to the paragraph (instead of a single string) and have ")
	para.AddText(maker.CreateText("a better ").SetFontSize(15).SetBold(True))
	para.AddString("control over it. \nEach inline can be ")
	para.AddText(maker.CreateText("styled ").SetFontSize(20))
	para.AddText(maker.CreateText("independently ").SetItalics(True).SetFontSize(40))
	para.AddString("then.\n\n")
	maker.AddParagraphs(para)
	'
	' *** COLUMNS
	maker.defaultStyle.columnGap = 20
	'
	maker.AddString("Here we have 2 equal sized columns...")
	
	Dim cols As PDFColumns = maker.CreateColumns
	cols.style.alignmentjustify = True
	cols.AddText(maker.CreateText("Column 1"))
	cols.AddText(maker.CreateText("Column 2"))
	maker.AddColumns(cols)
	
	' 3 columns
	maker.AddString("Here we have 3 equal sized columns...")
	Dim cols3 As PDFColumns = maker.CreateColumns
	cols3.AddText(maker.CreateText("Column 1"))
	cols3.AddText(maker.CreateText("Column 2"))
	cols3.AddText(maker.CreateText("Column 3"))
	maker.AddColumns(cols3)
	'
	'specifying column widths
	maker.AddString("Here we specify widths for each column...")
	Dim cols4 As PDFColumns = maker.CreateColumns
	cols4.AddText(maker.CreateText("Column 1").SetWidth(90))
	cols4.AddText(maker.CreateText("Column 2").SetWidth("*"))
	cols4.AddText(maker.CreateText("Column 3").SetWidth("*"))
	cols4.AddText(maker.CreateText("Column 4").SetWidth(90))
	maker.AddColumns(cols4)
	'
	maker.AddString("Auto columns set their width depending on their content...")
	Dim cols5 As PDFColumns = maker.CreateColumns
	cols5.AddText(maker.CreateText("Column 1").SetWidth("auto"))
	cols5.AddText(maker.CreateText("Column 2").SetWidth("*"))
	cols5.AddText(maker.CreateText("Column 3").SetWidth(50))
	cols5.AddText(maker.CreateText("Column 4").SetWidth("auto"))
	cols5.AddText(maker.CreateText("Column 5").SetWidth("*"))
	maker.AddColumns(cols5)
	'
	maker.AddString("Nesting columns...")
	Dim cols6 As PDFColumns = maker.CreateColumns
	Dim txt As PDFText = maker.CreateText("This is my text for nested columns...")
	txt.style.fontSize = 9
	txt.style.width = 100
	cols6.AddText(txt)
	
	cols6.AddText(maker.CreateText("Column 2").SetWidth("auto"))
	cols6.AddText(maker.CreateText("Column 3").SetWidth("*"))
	'
	Dim col7 As PDFColumns = maker.CreateColumns
	col7.AddString("This is nested!")
	col7.AddString("This is another nested column!")
	'
	cols6.AddColumns(col7)
	maker.AddColumns(cols6)
	
	'working with styles
	Dim style1 As PDFStyle = maker.CreateStyle("bigger")
	style1.fontSize = 18
	style1.bold = True
	maker.AddStyle(style1)
	
	Dim style2 As PDFStyle = maker.CreateStyle("header")
	style2.fontSize = 15
	style2.italics = True
	maker.AddStyle(style2)
	'
	Dim colX As PDFColumns = maker.CreateColumns
	colX.style.AddStyle("bigger")
	colX.AddString("This is some column data that users the 'bigger' style!")
	colX.AddText(maker.CreateText("Some text with 20 fontsize").SetFontSize(20))
	maker.AddColumns(colX)
	
	maker.Download("bananopdfmake.pdf")
	'upload the pdf document to the server
	'maker.Upload(Me, "doUpload", "themash.pdf")
	'maker.Open 
End Sub

Sub doUpload(fd As BANanoObject)
	Dim url As String = $"$"http://${Main.ServerIP}:${Main.Port}/${Main.AppName}/assets/upload.php"$
	Dim res As Map = BANano.FromJson(BANano.CallAjaxWait(url, "POST", "application/pdf", fd, False, Null))
	Dim status As String = res.Get("status")
	Select Case status
	Case "success"
		Dim view As PDFView
		view.Initialize("basic").SetHREF("./assets/themash.pdf").SetHeight(800).SetWidth(800).Refresh
	Case "error"
	End Select	
End Sub

