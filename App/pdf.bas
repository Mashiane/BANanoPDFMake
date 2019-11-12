B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private fx As JFX
End Sub

Sub basic
	Dim maker As PDFMaker
	maker.Initialize
	maker.AddString("First paragraph")
	maker.AddString("Another paragraph, this time a little bit longer to make sure, this line will be divided into at least two lines")
	maker.Open
End Sub

Sub tables
	Dim maker As PDFMaker
	maker.Initialize
	
	Dim hdr As PDFStyle = maker.CreateStyle("header")
	hdr.fontSize = 18
	hdr.bold = True
	hdr.setmargin(0,0,0,10)
	maker.AddStyle(hdr)
	
	'
	Dim sh As PDFStyle = maker.CreateStyle("subheader")
	sh.fontSize = 16
	sh.bold = True
	sh.SetMargin(0, 10, 0, 5)
	maker.AddStyle(sh)
	'
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
				
	
	maker.AddTable(tblD)
	maker.open
End Sub

Sub margins
	Dim maker As PDFMaker
	maker.Initialize
	'
	Dim hdr As PDFStyle = maker.CreateStyle("header")
	hdr.fontSize = 18
	hdr.bold = True
	hdr.alignmentRight = True
	hdr.SetMargin(0, 190, 0, 80)
	maker.AddStyle(hdr)
	'
	Dim sh As PDFStyle = maker.CreateStyle("subheader")
	sh.fontSize = 14
	maker.AddStyle(sh)
	'
	Dim sm As PDFStyle = maker.CreateStyle("superMargin")
	sm.SetMargin(20, 0, 40, 0)
	sm.fontSize = 15
	maker.AddStyle(sm)
	'
	Dim stack As PDFStack = maker.CreateStack
	stack.AddString("This header has both top and bottom margins defined")
	stack.AddText(maker.CreateText("This is a subheader").SetStyle("subheader"))
	stack.style.AddStyle("header")
	'
	maker.AddStack(stack)
	'
	maker.open
End Sub

Sub inlineStyles
	Dim maker As PDFMaker
	maker.Initialize
	'create styles to use globally
	Dim s1 As PDFStyle = maker.CreateStyle("header")
	s1.fontSize = 18
	s1.bold = True
	maker.AddStyle(s1)
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
	 
	maker.open
End Sub

'Sub images
'	Dim maker As PDFMaker
'	maker.Initialize
'	maker.AddString("if no width/height is specified, the actual size of the image is used")
'	Dim img1 As PDFImage = maker.CreateImage
'	img1.image = "./assets/yuna.jpg"
'	maker.AddImage(img1)
'	 
'	maker.open
'End Sub

Sub columns
	Dim maker As PDFMaker
	maker.Initialize
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
	'
	maker.Open
End Sub