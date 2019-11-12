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

Sub Init
	'get the body of the page
	body = BANano.GetElement("#body")
	'empty the element
	body.Empty
	'
	'pdf.basic
	'pdf.columns
	'pdf.images
	'pdf.inlineStyles
	'pdf.margins
	'pdf.tables
	'Return
	
	'
	Dim maker As PDFMaker
	maker.Initialize
	maker.defaultStyle.fontSize = 11
	maker.pageSize = "A3"
	maker.pageOrientation = "landscape"  '/potrait
	maker.SetPageMargins(40, 60, 40, 60)
	maker.title = "A PDF Document done with BANanoMake"
	maker.author = "TheMash"
	'maker.security.userPassword = "UOE"
	'maker.security.ownerPassword = "UOE"
	maker.security.copying = False
	
	'create toc
	'Dim toc As PDFText = maker.CreateText("My TOC")
	'maker.SetToC(toc)
		
	'add a header
	Dim hdr As PDFText = maker.CreateText("Creating client side PDF documents with BANanoPDFMake")
	hdr.style.alignmentCenter = True
	hdr.tocItem = True
	maker.SetHeader(hdr)
	
	'watermark
	Dim wm As PDFText = maker.CreateText("BANano 4.07+")
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
	Dim db As PDFText = maker.CreateText("Download BANano 4.07+")
	db.link = "https://www.b4x.com/android/forum/threads/banano-website-app-wpa-library-with-abstract-designer-support.99740/#content"
	db.decoration = "underline"
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
	maker.AddText(pgText1)
	'
	'another page
	Dim pgText2 As PDFText = maker.CreateText("Another Page...")
	maker.AddText(pgText2)
	
	'
	Dim tbl As PDFTable = maker.CreateTable
	tbl.lightHorizontalLines = True
	tbl.headerRows = 1
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
	
	'Log(maker.DD)
	maker.Download("bananopdfmake.pdf")
	
	
End Sub

