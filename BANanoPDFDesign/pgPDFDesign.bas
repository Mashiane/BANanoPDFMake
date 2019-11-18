B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private BANano As BANano
	Private vm As BANanoVM
	Private prop As VMProperty
	Private tree As VMTree
	Private grd As VMGrid
	Private doc As VMProperty
	Private fName As String
	Private vpdf As VMPDF
	Private style As VMProperty
	Private AllStyles As Map
	Private defStyle As VMProperty
	Private mTabs As VMTabs
	Private pcode As VMPrism
	Private maker As PDFMaker
	Private newText As VMProperty
	Private Contents As Map
	Private newTable As VMProperty
	Private newString As VMProperty
End Sub

Sub ReadContents
	Contents.Initialize
	Dim jsonContent As String = BANano.GetLocalStorage("bananopdf_content")
	If jsonContent = Null Then Return
	Contents = BANano.FromJson(jsonContent)
End Sub

Sub ReadStyles
	AllStyles.Initialize
	Dim jsonStyles As String = BANano.GetLocalStorage("bananopdf_styles")
	If jsonStyles = Null Then Return
	AllStyles = BANano.FromJson(jsonStyles) 
End Sub

Sub Init
	vm.Initialize(Me, "BANanoPDFDesign - WYSIWYG PDFMake")
	vm.SetFontFamily("'Roboto', Arial, sans-serif")
	vm.Drawer.SetVisible(False)
	vm.NavBar.SetPrimary(True)
	vm.SetNavBarFixed(True)
	vm.NavBar.SetHasBackButton(False)
	vm.NavBar.SetHasMenuButton(False)
	vm.NavBar.AddIcon("add","add", Me, "onAdd", "btnAdd")
	'
	'set fields to nothing
	vm.SetStateSingle("btnAdd", True)
	vm.SetStateSingle("expandProp", True)
	vm.SetStateSingle("template_doc", True)
	'
	'create a grid for the designer
	grd = vm.CreateGrid("design","")
	grd.AddRows(1)
	grd.AddColumnOSMP(1,0,0,0,0,2,2,2,2,"","","")
	grd.AddColumnOSMP(1,0,0,0,0,8,8,8,8,"","","")
	grd.AddColumnOSMP(1,0,0,0,0,2,2,2,2,"","","")
	grd.SetStyle(1,0,"bottom","10px !important")
	grd.SetStyle(1,0,"height","100% !important")
	'grd.SetStyle(1,2,"border", "1px solid")
	'grd.SetStyle(1,1,"border", "1px solid")
	'grd.SetStyle(1,3,"border", "1px solid")
	
	'1.1
	tree = vm.CreateTree(Me, "treev")
	tree.SetPrimaryKey("id")
	tree.SetStyle(CreateMap("height":"90vh !important"))
	grd.AddComponent(1,1, tree.ToString)
	
	'1.2
	mTabs = vm.CreateTabs("tabs1")
	mTabs.SetSwipeable(True)
	Dim code As VMTabsItem = vm.CreateTabsItem("code").SetLabel("Code")
	code.SetIcon("code")
	pcode = vm.CreatePrism("pdfcode", "json")
	code.SetText(pcode.ToString)
	'
	Dim preview As VMTabsItem = vm.CreateTabsItem("preview").SetLabel("Preview")
	preview.SetIcon("picture_as_pdf")
	vpdf = vm.CreatePDF("pdf_design", "")
	preview.SetText(vpdf.ToString)
	mTabs.SetAlignmentLeft(True)
	mTabs.AddTab(preview) 
	mTabs.AddTab(code)
	mTabs.ChangeTab("code")
	grd.AddComponent(1,2, mTabs.ToString)
	
	'1.3 - add document
	Template_Document
	Template_Style
	Template_DefaultStyle
	Template_Text
	Template_Table
	Template_String
	
'	prop = vm.CreateProperty(Me, "propBag")
'	Dim options As Map = CreateMap()
'	options.Put("f", "Father")
'	options.Put("m", "Mother")
'	options.Put("b", "Brother")
'	options.Put("s", "Son")
'	options.put("d", "Daughter")
'	prop.AddLabel("", "Details")
'	prop.AddSelect("", "relationships", "Relationships", "relations", options, "title", "description")
'	prop.AddDatePicker("", "dateregistered", "Date Registered", "")
'	prop.AddTextArea("","txta", "Text Area", "")
'	prop.AddCheck("","static", "Static",True)
'	prop.AddSwitch("", "talk", "Talk Now", True)
'	prop.AddButton("","btnSave", "Save", "onSave")
'	prop.AddEmail("","email","Email","","")
'	prop.AddNumber("","num", "Number","","")
'	prop.AddPassword("","pass","Password","")
'	prop.AddTel("","telx","Telephone","","")
'	prop.AddText("","txt","Text","","")
'	prop.AddIconButton("","icon", "menu", "onIcon")
'	prop.AddSlider("","sliderx", "Progress", 0, 100,5)
'	prop.AddRadioGroup("","gender", "Gender", CreateMap("M":"Male","F":"Female"))
'	grd.AddComponent(1,3,prop.ToString)
	
	'
	grd.Build
	grd.Pop(vm.Content)
	vm.ux
		
	'create the tree view
	tree.refresh
	tree.AddNode("","1", "Document", "","chrome_reader_mode", CreateMap())
	tree.AddNode("1", "newstring", "Add String", "", "add_circle_outline",CreateMap())
	tree.AddNode("1", "newtext", "Add Text", "", "add_circle_outline",CreateMap())
	tree.AddNode("1", "newtable", "Add Table", "", "add_circle_outline",CreateMap())
	tree.AddNode("1","content", "Content", "","book", CreateMap())
	tree.AddNode("1","default_style", "Default Syle", "","style", CreateMap())
	tree.AddNode("1", "4", "Styles", "", "style",CreateMap())
	tree.AddNode("4", "newstyle", "New Style", "", "add_circle_outline",CreateMap())
	
	'read and load existing styles
	ReadStyles
	LoadStyles
	ReadContents
	LoadContents
End Sub

Sub Template_DefaultStyle
	vm.SetStateSingle("default_style", False)
	defStyle = vm.CreateProperty(Me, "defStyle")
	defStyle.SetVIf("default_style")
	'
	defStyle.AddHeading("d", "Details")
	AddStyleProperties(defStyle)
	'
	defStyle.AddButton("","btnSaveDefStyle", "Save", "onSaveDefStyle")
	defStyle.AddDoubles(Array("opacity"))
	grd.AddComponent(1,3,defStyle.ToString)
End Sub

Sub AddStyleProperties(pb As VMProperty)
	pb.AddCheck("d","bold","Bold",False)
	pb.AddCheck("d","italics","Italics",False)
	pb.AddRadioGroup("align", "alignment","Alignment", CreateMap("alignmentRight":"Right","alignmentCenter":"Center","alignmentJustify":"Justify"))
	pb.AddTel("d","fontSize","Font Size","","")
	pb.AddHeading("m", "Margins")
	pb.AddTel("m","marginleft","Margin Left","","")
	pb.AddTel("m","margintop","Margin Top","","")
	pb.AddTel("m","marginright","Margin Right","","")
	pb.AddTel("m","marginbottom","Margin Bottom","","")
	pb.AddHeading("b", "Border")
	pb.AddCheck("b","noborder","No Border",False)
	pb.AddCheck("b","borderleft","Border Left",False)
	pb.AddCheck("b","bordertop","Border Top",False)
	pb.AddCheck("b","borderright","Border Right",False)
	pb.AddCheck("b","borderbottom","Border Bottom",False)
	pb.AddTel("d","width","Width","","")
	pb.AddTel("d","height","Height","","")
	pb.AddText("d","color","Color","","")
	pb.AddText("d","fillColor","Fill Color","","")
	pb.AddText("d","background","Background","","")
	pb.AddTel("d","opacity","Opacity","","")
	pb.AddTel("d","angle","Angle","","")
	pb.AddTel("d","columnGap","Column Gap","","")
	pb.AddHeading("dec", "Decoration")
	pb.AddSelect("dec","decoration","Decoration","decoNames", _
	CreateMap("underline":"Underline","overline":"Overline","lineThrough":"Line Through","none":"None"), "id", "text")
	pb.AddSelect("dec","decorationStyle","Decoration Style","decoStyle", _
	CreateMap("solid":"Solid","double":"Double","dashed":"Dashed","dotted":"Dotted","wavy":"Wavy","none":"None"),"id","text")
	pb.AddText("dec","decorationColor","Decoration Color","","")
End Sub

Sub onSaveDefStyle(e As BANanoEvent)
	Dim rec As Map = defStyle.Properties
	BANano.SetLocalStorage("defStyle", rec)
	PreviewStyle("defaultStyle", rec)
End Sub

Sub LoadStyles
	'remove children
	tree.RemoveChildren("4")
	tree.AddNode("4", "newstyle", "New Style", "", "add_circle_outline",CreateMap())
	For Each k As String In AllStyles.Keys
		tree.AddNode("4", k, k, "", "graphic_eq", CreateMap("type":"style"))
	Next
End Sub

Sub LoadContents
	'remove children
	tree.RemoveChildren("content")
	For Each k As String In Contents.Keys
		Dim rec As Map = Contents.Get(k)
		Dim typeof As String = rec.Get("typeof")
		tree.AddNode("content", k, k, "", "graphic_eq", CreateMap("type":typeof))
	Next
End Sub


'show only this template
Sub ShowOnly(showThis As String)
	vpdf.SetVisible(False)
	pcode.setvisible(False)
	showThis = showThis.tolowercase
	'hid the document
	pcode.SetText("")
	Dim lstT As List
	lstT.Initialize 
	lstT.Add("template_doc")
	lstT.Add("template_pages")
	lstT.Add("template_newpage")
	lstT.Add("template_newstyle")
	lstT.Add("template_styles")
	lstT.Add("default_style")
	lstT.Add("newtext")
	lstT.Add("newtable")
	lstT.add("newstring")
	
	For Each strT As String In lstT
		If strT = showThis Then
			vm.SetStateSingle(strT, True)
		Else
			vm.SetStateSingle(strT, False)
		End If
	Next
End Sub


'tree select statement
Sub treev_select(e As BANanoObject, node As Object, id As String)
	Log(id)
	
	Select Case id
	Case "newstring"
		ShowOnly("newString")
		newString.Clear
		Dim nDate As String = DateTime.Now
		vm.SetStateSingle("id", nDate)
		vm.SetStateSingle("tabindex", nDate)
	Case "newtext"
		ShowOnly("newText")
		newText.Clear
		Dim nDate As String = DateTime.Now
		vm.SetStateSingle("id", nDate)
		vm.SetStateSingle("tabindex", nDate)
	Case "newtable"
		ShowOnly("newTable")
		newTable.Clear
		Dim nDate As String = DateTime.Now
		vm.SetStateSingle("id", nDate)
		vm.SetStateSingle("tabindex", nDate)
	Case "1"
		ShowOnly("template_doc")
		doc.clear
		'document
		Dim rec As Map = BANano.GetLocalStorage("pdfdoc")
		If rec.IsInitialized Then 
			doc.Properties = rec
			CompileDoc
		End If
	Case "content"
		'pages
		ShowOnly("template_pages")
		ReadContents
	Case "3"
		'new page
		ShowOnly("template_newpage")
	Case "4"
		'styles
		ShowOnly("template_styles")
		ReadStyles
	Case "newstyle"
		'new style
		ShowOnly("template_newstyle")
		style.Clear
	Case "default_style"
		ShowOnly("default_style")
		defStyle.clear
		Dim rec As Map = BANano.GetLocalStorage("defStyle")
		If rec.IsInitialized Then 
			defStyle.Properties = rec
			PreviewStyle("defaultStyle", rec)
		End If
	Case Else
		Dim data As Map = tree.GetDataById(id)
		Dim strType As String = data.GetDefault("type","")
		
		Select Case strType
		Case "style"	
			'show the right property bag
			ShowOnly("template_newstyle")
			style.clear
			Dim rec As Map = ReadStyle(id)
			style.Properties = rec
			PreviewStyle(id, rec)
		Case "text"
			ShowOnly("newText")
			newText.Clear
			Dim rec As Map = ReadContent(id)
			newText.Properties = rec
			PreviewText(id, rec)
		Case "table"
			ShowOnly("newTable")
			newTable.Clear
			Dim rec As Map = ReadContent(id)
			newTable.Properties = rec
			PreviewTable(id, rec)
		Case "string"
			ShowOnly("newString")
			newString.Clear
			Dim rec As Map = ReadContent(id)
			newString.Properties = rec
			PreviewText(id, rec)
		End Select
	End Select
End Sub

Sub PreviewStyle(sid As String, smap As Map)
	vpdf.SetVisible(True)
	pcode.setvisible(True)
	pcode.SetText("")
	mTabs.ChangeTab("preview")
	mTabs.ChangeTab("code")
	mTabs.ChangeTab("preview")
	'define file name
	fName = $"${sid}.pdf"$
	'read the default styles
	Dim dstyle As Map = BANano.GetLocalStorage("defStyle")
	'read all styles
	ReadStyles
	'start the document
	maker.Initialize
	maker.SetDefaultStyle(dstyle)
	maker.SetStyles(AllStyles)
	Dim pText As PDFText = maker.CreateText("This is how the '" & sid & "' style will display on the document.")
	pText.SetStyle(sid)
	maker.AddText(pText)
	maker.Upload(Me, "doUpload", fName)
End Sub

Sub ReadContent(contentName As String) As Map
	ReadContents
	Dim rec As Map = Contents.Get(contentName)
	Return rec
End Sub

Sub ReadStyle(styleName As String) As Map
	ReadStyles
	Dim rec As Map = AllStyles.Get(styleName)
	Return rec
End Sub

Sub Template_Table
	newTable = vm.CreateProperty(Me, "newTable")
	newTable.SetVIf("newTable")
	newTable.AddButton("","btnSaveTable", "Save", "saveTable")
	'
	newTable.AddHeading("d", "Details")
	newTable.AddText("d","id","ID","","")
	newTable.AddText("d","tabindex","Tab Index","","")
	newTable.AddRadioGroup("layout", "layout","Layout", _
	CreateMap("lightHorizontalLines":"Light Horizontal Lines","noBorders":"No Borders","headerLineOnly":"Header Line Only", _
	"none": "None"))
	newTable.AddTel("d", "headerRows", "Header Rows", "","")
	newTable.AddTextArea("d", "widths", "Widths", "")
	newTable.AddTextArea("d", "heights", "Heights", "")
	newTable.AddTextArea("d", "hdr", "Column Names", "")
	'
	newTable.AddHeading("margings", "Margins")
	newTable.AddTel("margings","stylemarginleft","Margin Left","","")
	newTable.AddTel("margings","stylemargintop","Margin Top","","")
	newTable.AddTel("margings","stylemarginright","Margin Right","","")
	newTable.AddTel("margings","stylemarginbottom","Margin Bottom","","")
	newTable.AddCheck("margings","styleapplymargins","Apply Margins",False)
	'	
	newTable.AddHeading("absolutePosition", "Absolute Position")
	newTable.AddTel("absolutePosition","absolutePositionx","X","","")
	newTable.AddTel("absolutePosition","absolutePositiony","Y","","")
	newTable.AddCheck("absolutePosition","applyabsolutePosition","Apply",False)
	'
	newTable.AddRadioGroup("pageOrientation", "pageOrientation","Page Orientation", _
	CreateMap("potrait":"Potrait","landscape":"Landscape"))
	'
	newTable.AddRadioGroup("pageBreak", "pageBreak","Page Break", _
	CreateMap("pageBreakBefore":"Before","pageBreakAfter":"After","none":"None"))
	
	grd.AddComponent(1,3, newTable.ToString)
End Sub

Sub saveTable(e As BANanoEvent)
	Dim rec As Map = newTable.Properties
	'the type of record this is
	rec.Put("typeof", "table")
	Dim sid As String = rec.Get("id")
	If sid = "" Then
		vm.ShowSnackBar("Please enter a unique ID for the table!")
		Return
	End If
	ReadContents
	Contents.Put(sid, rec)
	'save to localstorage
	Dim contentJSON As String = BANano.ToJson(Contents)
	BANano.SetLocalStorage("bananopdf_content", contentJSON)
	ReadContents
	'load
	LoadContents
	PreviewTable(sid, rec)
End Sub

Sub PreviewTable(sid As String, smap As Map)
	vpdf.SetVisible(True)
	pcode.setvisible(True)
	pcode.SetText("")
	'hide the document
	mTabs.ChangeTab("preview")
	mTabs.ChangeTab("code")
	mTabs.ChangeTab("preview")
	'define file name
	fName = $"${sid}.pdf"$
	'read the default styles
	Dim dstyle As Map = BANano.GetLocalStorage("defStyle")
	'read all styles
	ReadStyles
	'start the document
	maker.Initialize
	maker.SetDefaultStyle(dstyle)
	maker.SetStyles(AllStyles)
	Dim pTable As PDFTable = GetTable(smap)
	maker.AddTable(pTable)
	maker.Upload(Me, "doUpload", fName)
End Sub

Sub Template_String
	newString = vm.CreateProperty(Me, "newString")
	newString.SetVIf("newstring")
	newString.AddButton("","btnSaveString", "Save", "saveString")
	'
	newString.AddText("","id","ID","","")
	newString.AddText("","tabindex","Tab Index","","")
	newString.AddTextArea("", "text", "Text", "")
		
	grd.AddComponent(1,3, newString.ToString)

End Sub

Sub Template_Text
	newText = vm.CreateProperty(Me, "newText")
	newText.SetVIf("newText")
	newText.AddButton("","btnSaveText", "Save", "saveText")
	'
	newText.AddHeading("d", "Details")
	newText.AddText("d","id","ID","","")
	newText.AddText("d","tabindex","Tab Index","","")
	newText.AddTextArea("d", "text", "Text", "")
	newText.AddCheck("d", "preserveLeadingSpaces", "Preserve Leading Spaces", False)
	newText.AddSelect("d", "listType", "List Type", "listTypeNames", CreateMap("ul":"UL", "ol":"OL", "none":"None"), "id", "text")
	'
	newText.AddHeading("style", "Style")
	newText.AddCheck("style","stylebold","Bold",False)
	newText.AddCheck("style","styleitalics","Italics",False)
	newText.AddRadioGroup("align", "alignment","Alignment", CreateMap("alignmentRight":"Right","alignmentCenter":"Center","alignmentJustify":"Justify"))
	newText.AddTel("style","stylefontSize","Font Size","","")
	newText.AddHeading("margings", "Margins")
	newText.AddTel("margings","stylemarginleft","Margin Left","","")
	newText.AddTel("margings","stylemargintop","Margin Top","","")
	newText.AddTel("margings","stylemarginright","Margin Right","","")
	newText.AddTel("margings","stylemarginbottom","Margin Bottom","","")
	newText.AddCheck("margings","styleapplymargins","Apply Margins",False)
	newText.AddTel("style","stylewidth","Width","","")
	newText.AddTel("style","styleheight","Height","","")
	newText.AddText("style","stylecolor","Color","","")
	newText.AddText("style","stylefillColor","Fill Color","","")
	newText.AddText("style","stylebackground","Background","","")
	newText.AddTel("style","styleopacity","Opacity","","")
	newText.AddTel("style","styleangle","Angle","","")
	newText.AddTel("style","stylecolumnGap","Column Gap","","")
	newText.AddHeading("dec", "Decoration")
	newText.AddSelect("dec","decoration","Decoration","decoNames", _
	CreateMap("underline":"Underline","overline":"Overline","lineThrough":"Line Through","none":"None"), "id", "text")
	newText.AddSelect("dec","decorationStyle","Decoration Style","decoStyle", _
	CreateMap("solid":"Solid","double":"Double","dashed":"Dashed","dotted":"Dotted","wavy":"Wavy","none":"None"),"id","text")
	newText.AddText("dec","styledecorationColor","Decoration Color","","")
		
	newText.AddHeading("absolutePosition", "Absolute Position")
	newText.AddTel("absolutePosition","absolutePositionx","X","","")
	newText.AddTel("absolutePosition","absolutePositiony","Y","","")
	newText.AddCheck("absolutePosition","applyabsolutePosition","Apply",False)
	
	'
	newText.AddHeading("relativePosition", "Relative Position")
	newText.AddTel("relativePosition","relativePositionx","X","","")
	newText.AddTel("relativePosition","relativePositiony","Y","","")
	newText.AddCheck("relativePosition","applyrelativePosition","Apply",False)
	
	'
	newText.AddRadioGroup("pageOrientation", "pageOrientation","Page Orientation", _
	CreateMap("potrait":"Potrait","landscape":"Landscape"))
	'
	newText.AddRadioGroup("pageBreak", "pageBreak","Page Break", _
	CreateMap("pageBreakBefore":"Before","pageBreakAfter":"After","none":"None"))
	'
	newText.AddHeading("toc", "Table of Contents")
	newText.AddCheck("toc", "tocItem", "ToC Item", False)
	newText.AddSelect("toc", "tocStyle", "Toc Style", "tocStyleNames", CreateMap("style1":"Style1"), "id", "text")
	newText.AddSelect("toc", "tocNumberStyle", "Toc Number Style", "tocNumberStyleNames", CreateMap("style1":"Style1"), "id", "text")
	'
	newText.AddHeading("tocMargin", "Toc Margin")
	newText.AddTel("tocMargin","marginleft","Left","","")
	newText.AddTel("tocMargin","margintop","Top","","")
	newText.AddTel("tocMargin","marginright","Right","","")
	newText.AddTel("tocMargin","marginbottom","Bottom","","")
	newText.AddCheck("tocMargin","applytocMargin","Apply",False)
	
	'
	newText.AddHeading("table", "Table")
	newText.AddTel("table","colSpan", "Col Span", "","")
	newText.AddTel("table", "rowSpan","Row Span","","")
	'
	newText.AddHeading("borders", "Borders")
	newText.AddCheck("borders","stylenoborder","No Border",False)
	newText.AddCheck("borders","styleborderleft","Border Left",False)
	newText.AddCheck("borders","stylebordertop","Border Top",False)
	newText.AddCheck("borders","styleborderright","Border Right",False)
	newText.AddCheck("borders","styleborderbottom","Border Bottom",False)
	newText.AddCheck("borders","styleapplyborders","Apply Borders",False)
	
	newText.AddHeading("borderColor", "Border Color")
	newText.AddText("borderColor","borderColorleft","Left","","")
	newText.AddText("borderColor","borderColortop","Top","","")
	newText.AddText("borderColor","borderColorright","Right","","")
	newText.AddText("borderColor","borderColorbottom","Bottom","","")
	newText.AddCheck("borderColor","applyborderColor","Apply",False)
	
	'
	newText.AddHeading("link", "Link")
	newText.AddText("link", "link", "Link", "", "")
	newText.AddText("link","linkToPage", "Link To Page", "", "")
	newText.AddText("link", "linkToDestination", "Link To Destination", "","")
	newText.AddText("link", "pageReference", "Page Reference", "","")
	newText.AddText("link", "textReference", "Text Reference","","")
	'
	
	grd.AddComponent(1,3, newText.ToString)
End Sub

Sub PreviewText(sid As String, smap As Map)
	vpdf.SetVisible(True)
	pcode.setvisible(True)
	pcode.SetText("")
	'hide the document
	mTabs.ChangeTab("preview")
	mTabs.ChangeTab("code")
	mTabs.ChangeTab("preview")
	'define file name
	fName = $"${sid}.pdf"$
	'read the default styles
	Dim dstyle As Map = BANano.GetLocalStorage("defStyle")
	'read all styles
	ReadStyles
	'start the document
	maker.Initialize
	maker.SetDefaultStyle(dstyle)
	maker.SetStyles(AllStyles)
	Dim pText As PDFText = GetText(smap)
	maker.AddText(pText)
	maker.Upload(Me, "doUpload", fName)
End Sub

Sub GetTable(rec As Map) As PDFTable
	Dim sid As String = rec.Get("id")
	Dim stabindex As String = rec.Get("tabindex")
	Dim iabsolutePositionx As Int = rec.Get("absolutePositionx")
	Dim iabsolutePositiony As Int = rec.Get("absolutePositiony")
	Dim spageOrientation As String = rec.Get("pageOrientation")
	Dim spageBreak As String = rec.Get("pageBreak")
	Dim sheaderRows As String = rec.Get("headerRows")
	Dim slayout As String = rec.Get("layout")
	Dim swidths As String = rec.Get("widths")
	Dim sheights As String = rec.Get("heights")
	Dim shdr As String = rec.Get("hdr")
	swidths = swidths.Replace(CRLF,"")
	sheights = sheights.Replace(CRLF,"")
	shdr = shdr.Replace(CRLF, "")
	
	If spageBreak = "none" Then spageBreak = ""
	Dim bapplyabsolutePosition As Boolean = rec.Get("applyabsolutePosition")
	Dim applymargins As Boolean = rec.Get("styleapplymargins")
	
	Dim marginleft As Int = rec.Get("stylemarginleft")
	Dim margintop As Int = rec.Get("stylemargintop")
	Dim marginright As Int = rec.Get("stylemarginright")
	Dim marginbottom As Int = rec.Get("stylemarginbottom")
	
	Dim ptext As PDFTable= maker.CreateTable
	If slayout = "none" Then slayout = ""
	If slayout = "lightHorizontalLines" Then ptext.lightHorizontalLines = True
	If slayout = "noBorders" Then ptext.noBorders = True
	If slayout = "headerLineOnly" Then ptext.headerLineOnly = True
	If bapplyabsolutePosition Then ptext.SetAbsolutePosition(iabsolutePositionx, iabsolutePositiony)
	ptext.SetPageOrientation(spageOrientation)
	If spageBreak = "pageBreakBefore" Then ptext.SetPageBreakBefore
	If spageBreak = "pageBreakAfter" Then ptext.SetPageBreakAfter
	If applymargins Then
		ptext.style.SetMargin(marginleft, margintop, marginright, marginbottom)
	End If
	ptext.SetID(sid)
	ptext.SetHeaderRows(sheaderRows)
	'
	If swidths <> "" Then
		Dim w() As String = BANano.Split(",", swidths)
		ptext.SetWidths(w)
	End If
	'
	If sheights <> "" Then
		Dim h() As String = BANano.Split(",", sheights)
		ptext.SetHeights(h)
	End If
	'
	If shdr <> "" Then
		Dim hr() As String = BANano.Split(",", shdr)
		ptext.SetColumnNames(hr)
	End If
	Return ptext
End Sub

Sub GetText(rec As Map) As PDFText
	Dim sid As String = rec.Get("id")
	Dim stabindex As String = rec.Get("tabindex")
	Dim stext As String = rec.Get("text")
	Dim bpreserveLeadingSpaces As Boolean = rec.Get("preserveLeadingSpaces")
	Dim slistType As String = rec.Get("listType")
	If slistType = "none" Then slistType = ""
	Dim iabsolutePositionx As Int = rec.Get("absolutePositionx")
	Dim iabsolutePositiony As Int = rec.Get("absolutePositiony")
	Dim irelativePositionx As Int = rec.Get("relativePositionx")
	Dim irelativePositiony As Int = rec.Get("relativePositiony")
	Dim spageOrientation As String = rec.Get("pageOrientation")
	Dim spageBreak As String = rec.Get("pageBreak")
	If spageBreak = "none" Then spageBreak = ""
	Dim btocItem As Boolean = rec.Get("tocItem")
	Dim stocStyle As String = rec.Get("tocStyle")
	Dim stocNumberStyle As String = rec.Get("tocNumberStyle")
	Dim imarginleft As Int = rec.Get("marginleft")
	Dim imargintop As Int = rec.Get("margintop")
	Dim imarginright As Int = rec.Get("marginright")
	Dim imarginbottom As Int = rec.Get("marginbottom")
	Dim icolSpan As Int = rec.Get("colSpan")
	Dim irowSpan As Int = rec.Get("rowSpan")
	Dim sborderColorleft As String = rec.Get("borderColorleft")
	Dim sborderColortop As String = rec.Get("borderColortop")
	Dim sborderColorright As String = rec.Get("borderColorright")
	Dim sborderColorbottom As String = rec.Get("borderColorbottom")
	Dim slink As String = rec.Get("link")
	Dim slinkToPage As String = rec.Get("linkToPage")
	Dim slinkToDestination As String = rec.Get("linkToDestination")
	Dim spageReference As String = rec.Get("pageReference")
	Dim stextReference As String = rec.Get("textReference")
	Dim bapplyabsolutePosition As Boolean = rec.Get("applyabsolutePosition")
	Dim bapplyrelativePosition As Boolean = rec.Get("applyrelativePosition")
	Dim applytocMargin As Boolean = rec.get("applytocMargin")
	Dim applyborderColor As Boolean = rec.Get("applyborderColor")
	'
	Dim bold As Boolean = rec.get("stylebold")
	Dim italics As Boolean = rec.Get("styleitalics")
	Dim alignment As String = rec.Get("alignment")
	Dim fontSize As Int = rec.Get("stylefontSize")
	Dim marginleft As Int = rec.Get("stylemarginleft")
	Dim margintop As Int = rec.Get("stylemargintop")
	Dim marginright As Int = rec.Get("stylemarginright")
	Dim marginbottom As Int = rec.Get("stylemarginbottom")
	Dim noborder As Boolean = rec.Get("stylenoborder")
	Dim borderleft As Boolean = rec.get("styleborderleft")
	Dim bordertop As Boolean = rec.get("stylebordertop")
	Dim borderright As Boolean = rec.get("styleborderright")
	Dim borderbottom As Boolean = rec.get("styleborderbottom")
	Dim width As Int = rec.Get("stylewidth")
	Dim height As Int = rec.get("styleheight")
	Dim color As String = rec.Get("stylecolor")
	Dim fillColor As String = rec.get("stylefillColor")
	Dim background As String = rec.Get("stylebackground")
	Dim opacity As Double = rec.Get("styleopacity")
	Dim angle As Int = rec.get("styleangle")
	Dim columnGap As Int = rec.get("stylecolumnGap")
	Dim decoration As String = rec.Get("styledecoration")
	If decoration = "none" Then decoration = ""
	Dim decorationStyle As String = rec.Get("styledecorationStyle")
	If decorationStyle = "none" Then decorationStyle = ""
	Dim decorationColor As String = rec.Get("styledecorationColor")
	Dim applymargins As Boolean = rec.Get("styleapplymargins")
	Dim applyborders As Boolean = rec.Get("styleapplyborders")
	'
	Dim ptext As PDFText = maker.CreateText(stext)
	ptext.settabindex(stabindex)
	If bapplyrelativePosition Then ptext.SetRelativePosition(irelativePositionx, irelativePositiony)
	If bapplyabsolutePosition Then ptext.SetAbsolutePosition(iabsolutePositionx, iabsolutePositiony)
	ptext.SetPageOrientation(spageOrientation)
	ptext.SetListType(slistType)
	If bpreserveLeadingSpaces = True Then ptext.preserveLeadingSpaces = bpreserveLeadingSpaces
	If spageBreak = "pageBreakBefore" Then ptext.SetPageBreakBefore
	If spageBreak = "pageBreakAfter" Then ptext.SetPageBreakAfter
	ptext.SetTocItem(btocItem)
	If applytocMargin Then ptext.SetTocMargin(imarginleft, imargintop, imarginright, imarginbottom)
	ptext.SetcolSpan(icolSpan)
	ptext.SetrowSpan(irowSpan)
	If applyborderColor Then ptext.SetBorderColor(sborderColorleft, sborderColortop, sborderColorright, sborderColorbottom)
	ptext.Setlink(slink)
	ptext.SetlinkToPage(slinkToPage)
	ptext.SetlinkToDestination(slinkToDestination)
	ptext.SetpageReference(spageReference)
	ptext.SettextReference(stextReference)
	ptext.Setid(sid)
	'apply style
	ptext.style.SetBold(bold)
	ptext.style.SetItalics(italics)
	Select Case alignment
		Case "alignmentRight"
			ptext.style.alignmentRight = True
		Case "alignmentCenter"
			ptext.style.alignmentCenter = True
		Case "alignmentJustify"
			ptext.style.alignmentJustify = True
	End Select
	ptext.style.SetFontSize(fontSize)
	If applymargins Then
		ptext.style.SetMargin(marginleft, margintop, marginright, marginbottom)
	End If
	If noborder Then
		ptext.style.NoBorder
	Else
		If applyborders Then
			ptext.style.SetBorder(borderleft, bordertop, borderright, borderbottom)
		End If
	End If
	ptext.style.SetWidth(width)
	ptext.style.setheight(height)
	ptext.style.SetColor(color)
	ptext.style.SetFillColor(fillColor)
	ptext.style.setbackground(background)
	ptext.style.SetOpacity(opacity)
	ptext.style.SetAngle(angle)
	ptext.style.SetColumnGap(columnGap)
	ptext.style.SetDecoration(decoration)
	ptext.style.SetDecorationStyle(decorationStyle)
	ptext.style.SetDecorationColor(decorationColor)
	Return ptext
End Sub

Sub saveString(e As BANanoEvent)
	Dim rec As Map = newString.Properties
	'the type of record this is
	rec.Put("typeof", "string")
	Dim sid As String = rec.Get("id")
	If sid = "" Then
		vm.ShowSnackBar("Please enter a unique ID for the text!")
		Return
	End If
	ReadContents
	Contents.Put(sid, rec)
	'save to localstorage
	Dim contentJSON As String = BANano.ToJson(Contents)
	BANano.SetLocalStorage("bananopdf_content", contentJSON)
	ReadContents
	'load
	LoadContents
	PreviewText(sid, rec)
End Sub

Sub saveText(e As BANanoEvent)
	Dim rec As Map = newText.Properties
	'the type of record this is
	rec.Put("typeof", "text")
	Dim sid As String = rec.Get("id")
	If sid = "" Then
		vm.ShowSnackBar("Please enter a unique ID for the text!")
		Return
	End If
	ReadContents
	Contents.Put(sid, rec)
	'save to localstorage
	Dim contentJSON As String = BANano.ToJson(Contents)
	BANano.SetLocalStorage("bananopdf_content", contentJSON)
	ReadContents
	'load
	LoadContents
	PreviewText(sid, rec)
End Sub

Sub PageSizes As Map
	Dim ps As List
	ps.Initialize
	ps.Add("4A0")
	ps.Add("2A0")
	ps.Add("A0")
	ps.Add("A1")
	ps.Add("A2")
	ps.Add("A3")
	ps.Add("A4")
	ps.Add("A5")
	ps.Add("A6")
	ps.Add("A7")
	ps.Add("A8")
	ps.Add("A9")
	ps.Add("A10")
	ps.Add("B0")
	ps.Add("B1")
	ps.Add("B2")
	ps.Add("B3")
	ps.Add("B4")
	ps.Add("B5")
	ps.Add("B6")
	ps.Add("B7")
	ps.Add("B8")
	ps.Add("B9")
	ps.Add("B10")
	ps.Add("C0")
	ps.Add("C1")
	ps.Add("C2")
	ps.Add("C3")
	ps.Add("C4")
	ps.Add("C5")
	ps.Add("C6")
	ps.Add("C7")
	ps.Add("C8")
	ps.Add("C9")
	ps.Add("C10")
	ps.Add("RA0")
	ps.Add("RA1")
	ps.Add("RA2")
	ps.Add("RA3")
	ps.Add("RA4")
	ps.Add("SRA0")
	ps.Add("SRA1")
	ps.Add("SRA2")
	ps.Add("SRA3")
	ps.Add("SRA4")
	ps.Add("EXECUTIVE")
	ps.Add("FOLIO")
	ps.Add("LEGAL")
	ps.Add("LETTER")
	ps.Add("TABLOID")
End Sub

Sub Template_Document
	doc = vm.CreateProperty(Me, "doc")
	doc.SetVIf("template_doc")
	
	doc.AddHeading("d", "Details")
	doc.AddText("d","filename","File Name","","")
	doc.AddText("d", "title", "Title", "","")
	doc.AddText("d", "author", "Author", "","")
	doc.AddText("d", "subject", "Subject", "","")
	doc.AddTextArea("d", "keywords", "Keywords", "")
	doc.AddText("d", "creator", "Creator", "","")
	doc.AddText("d", "producer", "Producer", "","")
	doc.AddCheck("d", "compress", "Compress", True)
	'
	doc.AddRadioGroup("orient", "pageOrientation","Page Orientation", _
	CreateMap("potrait":"Potrait","lanscape":"Landscape"))
	'Public pageSize As String
	'Public pageOrientation As String
	
	doc.AddHeading("sec", "Security & Permissions")
	doc.AddText("sec", "userPassword", "User Password", "","")
	doc.AddText("sec", "ownerPassword", "Owner Password", "","")
	doc.AddCheck("sec", "modifying", "Modifying", True)
	doc.AddCheck("sec", "copying", "Copying",True)
	doc.AddCheck("sec", "annotating", "Annotating",True)
	doc.AddCheck("sec", "fillingForms", "Filling Forms",True)
	doc.AddCheck("sec", "contentAccessibility", "Content Accessibility",False)
	doc.AddCheck("sec", "documentAssembly", "Document Assembly",False)
	doc.AddLabel("d","Printing")
	doc.AddRadio("d", "printing", "highResolution", "High Resolution")
	doc.AddRadio("d", "printing", "lowResolution", "Low Resolution")
	
	doc.AddButton("","btnCompile", "Compile", "onCompile")
	grd.AddComponent(1,3,doc.ToString)
End Sub

Sub Template_Style
	vm.SetStateSingle("template_newstyle", False)
	style = vm.CreateProperty(Me, "style")
	style.SetVIf("template_newstyle")
	'
	style.AddHeading("d", "Details")
	style.AddText("d","name","Name","","")
	AddStyleProperties(style)
	style.AddButton("","btnSaveStyle", "Save", "onSaveStyle")
	style.AddDoubles(Array("opacity"))
	grd.AddComponent(1,3,style.ToString)
End Sub

Sub onSaveStyle(e As BANanoEvent)
	Dim rec As Map = style.Properties
	Dim sname As String = rec.Get("name")
	If sname = "" Then 
		vm.ShowSnackBar("You must enter the name of the Style!")
		Return
	End If
	'read existing styles
	ReadStyles
	'add to existing styles
	AllStyles.Put(sname, rec)
	'save to localstorage
	Dim styleJSON As String = BANano.ToJson(AllStyles)
	BANano.SetLocalStorage("bananopdf_styles", styleJSON)
	ReadStyles
	LoadStyles
	'current style
	PreviewStyle(sname, rec)
End Sub

Sub CompileDoc
	vpdf.SetVisible(True)
	pcode.setvisible(True)
	pcode.SetText("")
	Dim docprops As Map = BANano.GetLocalStorage("pdfdoc")
	If docprops.IsInitialized Then
		fName = docprops.Get("filename")
		If fName = "" Then
			vm.ShowSnackBar("You need to specify a file name first!")
			Return
		End If
	Else
		Return
	End If
	mTabs.ChangeTab("preview")
	mTabs.ChangeTab("code")
	mTabs.ChangeTab("preview")
	'define file name
	fName = $"${fName}.pdf"$
	
	'read the default styles
	Dim dstyle As Map = BANano.GetLocalStorage("defStyle")
	'read all styles
	ReadStyles
	ReadContents
	'start the document
	maker.Initialize
	maker.SetDocumentProperties(docprops)
	maker.SetDefaultStyle(dstyle)
	maker.SetStyles(AllStyles)
	For Each k As Map In Contents.keys
		Dim rec As Map = Contents.Get(k)
		Dim typeof As String = rec.Get("typeof")
		Select Case typeof
		Case "table"
			Dim pTable As PDFTable = GetTable(rec)
			maker.AddTable(pTable)
		Case "text", "string"
			Dim pText As PDFText = GetText(rec)
			maker.addtext(pText)	
		End Select
	Next
	maker.Upload(Me, "doUpload", fName)
End Sub


Sub onCompile(e As BANanoEvent)
	'hide the document
	pcode.settext("")
	Dim docprops As Map = doc.Properties
	fName = docprops.Get("filename")
	If fName = "" Then
		vm.ShowSnackBar("You need to specify a file name first!")
		Return
	End If
	'save document properties
	BANano.SetLocalStorage("pdfdoc", docprops)
	CompileDoc
End Sub
	

	
Sub doUpload(fd As BANanoObject)
	vpdf.SetVisible(True)
	pcode.setvisible(True)
	pcode.SetText("")
	
	Dim res As Map = BANano.FromJson(BANano.CallAjaxWait("./assets/upload.php", "POST", "application/pdf", fd, False, Null))
	Dim status As String = res.Get("status")
	Select Case status
	Case "success"
		vm.ShowSnackBar("The template has been finished, ensure your browser is set to view PDF!")
		'
		pcode.SetText(maker.JSONPretty)
		pcode.Refresh
			
		Dim fPath As String = $"./assets/${fName}"$
		vpdf.SetURL(fPath)
	Case "error"
		vm.ShowSnackBar("The template could not be built!")
	End Select
End Sub

Sub onSave(e As BANanoEvent)
End Sub