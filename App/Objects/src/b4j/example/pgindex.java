package b4j.example;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoElement _body = null;
public static b4j.example.main _main = null;
public static b4j.example.pdf _pdf = null;
public static String  _init() throws Exception{
b4j.example.pdfmaker _maker = null;
b4j.example.pdftext _hdr = null;
b4j.example.pdftext _wm = null;
b4j.example.pdffooter _ftr = null;
b4j.example.pdfstyle _f15 = null;
b4j.example.pdftext _db = null;
b4j.example.pdfqrcode _qrcode = null;
b4j.example.pdftext _content1 = null;
b4j.example.pdftext _content5 = null;
b4j.example.pdftext _content2 = null;
b4j.example.pdftext _content3 = null;
b4j.example.pdftext _content4 = null;
b4j.example.pdfparagraphs _stack1 = null;
b4j.example.pdfcolumns _cols = null;
b4j.example.pdflist _ol = null;
b4j.example.pdftext _item4 = null;
b4j.example.pdflist _ul = null;
b4j.example.pdfstack _stack = null;
b4j.example.pdftext _pgtext = null;
b4j.example.pdftext _pgtext1 = null;
b4j.example.pdftext _pgtext2 = null;
b4j.example.pdftable _tbl = null;
b4j.example.pdftext _r2c1 = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="body = BANano.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
 //BA.debugLineNum = 11;BA.debugLine="body.Empty";
_body.Empty();
 //BA.debugLineNum = 22;BA.debugLine="Dim maker As PDFMaker";
_maker = new b4j.example.pdfmaker();
 //BA.debugLineNum = 23;BA.debugLine="maker.Initialize";
_maker._initialize /*b4j.example.pdfmaker*/ (ba);
 //BA.debugLineNum = 24;BA.debugLine="maker.defaultStyle.fontSize = 11";
_maker._defaultstyle /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = (int) (11);
 //BA.debugLineNum = 25;BA.debugLine="maker.pageSize = \"A3\"";
_maker._pagesize /*String*/  = "A3";
 //BA.debugLineNum = 26;BA.debugLine="maker.pageOrientation = \"landscape\"  '/potrait";
_maker._pageorientation /*String*/  = "landscape";
 //BA.debugLineNum = 27;BA.debugLine="maker.SetPageMargins(40, 60, 40, 60)";
_maker._setpagemargins /*b4j.example.pdfmaker*/ ((int) (40),(int) (60),(int) (40),(int) (60));
 //BA.debugLineNum = 28;BA.debugLine="maker.title = \"A PDF Document done with BANanoMak";
_maker._title /*String*/  = "A PDF Document done with BANanoMake";
 //BA.debugLineNum = 29;BA.debugLine="maker.author = \"TheMash\"";
_maker._author /*String*/  = "TheMash";
 //BA.debugLineNum = 32;BA.debugLine="maker.security.copying = False";
_maker._security /*b4j.example.pdfsecurity*/ ._copying /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 39;BA.debugLine="Dim hdr As PDFText = maker.CreateText(\"Creating c";
_hdr = _maker._createtext /*b4j.example.pdftext*/ ("Creating client side PDF documents with BANanoPDFMake");
 //BA.debugLineNum = 40;BA.debugLine="hdr.style.alignmentCenter = True";
_hdr._style /*b4j.example.pdfstyle*/ ._alignmentcenter /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 41;BA.debugLine="hdr.tocItem = True";
_hdr._tocitem /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 42;BA.debugLine="maker.SetHeader(hdr)";
_maker._setheader /*b4j.example.pdfmaker*/ (_hdr);
 //BA.debugLineNum = 45;BA.debugLine="Dim wm As PDFText = maker.CreateText(\"BANano 4.07";
_wm = _maker._createtext /*b4j.example.pdftext*/ ("BANano 4.07+");
 //BA.debugLineNum = 46;BA.debugLine="wm.style.color = \"lightblue\"";
_wm._style /*b4j.example.pdfstyle*/ ._color /*String*/  = "lightblue";
 //BA.debugLineNum = 47;BA.debugLine="wm.style.opacity = 0.3";
_wm._style /*b4j.example.pdfstyle*/ ._opacity /*double*/  = 0.3;
 //BA.debugLineNum = 48;BA.debugLine="wm.style.bold = True";
_wm._style /*b4j.example.pdfstyle*/ ._bold /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 49;BA.debugLine="wm.style.italics = False";
_wm._style /*b4j.example.pdfstyle*/ ._italics /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 50;BA.debugLine="wm.style.angle = 70";
_wm._style /*b4j.example.pdfstyle*/ ._angle /*double*/  = 70;
 //BA.debugLineNum = 51;BA.debugLine="wm.style.fontsize = 70";
_wm._style /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = (int) (70);
 //BA.debugLineNum = 52;BA.debugLine="maker.SetWaterMark(wm)";
_maker._setwatermark /*b4j.example.pdfmaker*/ (_wm);
 //BA.debugLineNum = 55;BA.debugLine="Dim ftr As PDFFooter = maker.CreateFooter";
_ftr = _maker._createfooter /*b4j.example.pdffooter*/ ();
 //BA.debugLineNum = 56;BA.debugLine="ftr.LeftPart.Append(\"Footer Left Part\")";
_ftr._leftpart /*b4j.example.pdftext*/ ._append /*b4j.example.pdftext*/ ("Footer Left Part");
 //BA.debugLineNum = 57;BA.debugLine="ftr.LeftPart.style.bold = True";
_ftr._leftpart /*b4j.example.pdftext*/ ._style /*b4j.example.pdfstyle*/ ._bold /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 58;BA.debugLine="ftr.RightPart.Append(\"Footer Right Part\")";
_ftr._rightpart /*b4j.example.pdftext*/ ._append /*b4j.example.pdftext*/ ("Footer Right Part");
 //BA.debugLineNum = 59;BA.debugLine="ftr.RightPart.style.alignmentRight = True";
_ftr._rightpart /*b4j.example.pdftext*/ ._style /*b4j.example.pdfstyle*/ ._alignmentright /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 60;BA.debugLine="maker.AddFooter(ftr)";
_maker._addfooter /*b4j.example.pdfmaker*/ (_ftr);
 //BA.debugLineNum = 63;BA.debugLine="Dim f15 As PDFStyle = maker.CreateStyle(\"f15\")";
_f15 = _maker._createstyle /*b4j.example.pdfstyle*/ ("f15");
 //BA.debugLineNum = 64;BA.debugLine="f15.fontSize = 15";
_f15._fontsize /*int*/  = (int) (15);
 //BA.debugLineNum = 65;BA.debugLine="maker.AddStyle(f15)";
_maker._addstyle /*String*/ (_f15);
 //BA.debugLineNum = 67;BA.debugLine="Dim db As PDFText = maker.CreateText(\"Download BA";
_db = _maker._createtext /*b4j.example.pdftext*/ ("Download BANano 4.07+");
 //BA.debugLineNum = 68;BA.debugLine="db.link = \"https://www.b4x.com/android/forum/thre";
_db._link /*String*/  = "https://www.b4x.com/android/forum/threads/banano-website-app-wpa-library-with-abstract-designer-support.99740/#content";
 //BA.debugLineNum = 69;BA.debugLine="db.decoration = \"underline\"";
_db._decoration /*String*/  = "underline";
 //BA.debugLineNum = 70;BA.debugLine="db.style.SetMargin(20,20,20,20)";
_db._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ ((int) (20),(int) (20),(int) (20),(int) (20));
 //BA.debugLineNum = 71;BA.debugLine="db.tocItem = True";
_db._tocitem /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 72;BA.debugLine="maker.AddText(db)";
_maker._addtext /*String*/ (_db);
 //BA.debugLineNum = 75;BA.debugLine="Dim qrcode As PDFQRCode = maker.CreateQRCode";
_qrcode = _maker._createqrcode /*b4j.example.pdfqrcode*/ ();
 //BA.debugLineNum = 76;BA.debugLine="qrcode.Initialize";
_qrcode._initialize /*b4j.example.pdfqrcode*/ (ba);
 //BA.debugLineNum = 77;BA.debugLine="qrcode.qr = \"BANanoPDFMake\"";
_qrcode._qr /*String*/  = "BANanoPDFMake";
 //BA.debugLineNum = 78;BA.debugLine="qrcode.foreground = \"black\"";
_qrcode._foreground /*String*/  = "black";
 //BA.debugLineNum = 79;BA.debugLine="qrcode.fit = \"80\"";
_qrcode._fit /*String*/  = "80";
 //BA.debugLineNum = 81;BA.debugLine="qrcode.modeAlphanumeric = True";
_qrcode._modealphanumeric /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 82;BA.debugLine="qrcode.style.setmargin(20,20,20,20)";
_qrcode._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ ((int) (20),(int) (20),(int) (20),(int) (20));
 //BA.debugLineNum = 83;BA.debugLine="maker.AddQRCode(qrcode)";
_maker._addqrcode /*b4j.example.pdfmaker*/ (_qrcode);
 //BA.debugLineNum = 86;BA.debugLine="Dim content1 As PDFText = maker.CreateText(\"This";
_content1 = _maker._createtext /*b4j.example.pdftext*/ ("This is a standard paragraph, using default style");
 //BA.debugLineNum = 87;BA.debugLine="content1.style.SetMargin(5,10,5,10)";
_content1._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ ((int) (5),(int) (10),(int) (5),(int) (10));
 //BA.debugLineNum = 88;BA.debugLine="maker.AddText(content1)";
_maker._addtext /*String*/ (_content1);
 //BA.debugLineNum = 90;BA.debugLine="Dim content5 As PDFText = maker.CreateText(\"This";
_content5 = _maker._createtext /*b4j.example.pdftext*/ ("This paragraph will have a bigger font");
 //BA.debugLineNum = 91;BA.debugLine="content5.style.fontSize = 15";
_content5._style /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = (int) (15);
 //BA.debugLineNum = 92;BA.debugLine="maker.AddText(content5)";
_maker._addtext /*String*/ (_content5);
 //BA.debugLineNum = 94;BA.debugLine="Dim content2 As PDFText = maker.CreateText(\"This";
_content2 = _maker._createtext /*b4j.example.pdftext*/ ("This paragraph is defined as an array of elements to make it possible to ");
 //BA.debugLineNum = 95;BA.debugLine="Dim content3 As PDFText = maker.CreateText(\"resty";
_content3 = _maker._createtext /*b4j.example.pdftext*/ ("restyle part of it and make it bigger ");
 //BA.debugLineNum = 96;BA.debugLine="content3.style.fontSize = 15";
_content3._style /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = (int) (15);
 //BA.debugLineNum = 97;BA.debugLine="Dim content4 As PDFText = maker.CreateText(\"than";
_content4 = _maker._createtext /*b4j.example.pdftext*/ ("than the rest.");
 //BA.debugLineNum = 99;BA.debugLine="Dim stack1 As PDFParagraphs = maker.CreateParagra";
_stack1 = _maker._createparagraphs /*b4j.example.pdfparagraphs*/ ();
 //BA.debugLineNum = 100;BA.debugLine="stack1.AddText(content2)";
_stack1._addtext /*b4j.example.pdfparagraphs*/ (_content2);
 //BA.debugLineNum = 101;BA.debugLine="stack1.AddText(content3)";
_stack1._addtext /*b4j.example.pdfparagraphs*/ (_content3);
 //BA.debugLineNum = 102;BA.debugLine="stack1.AddText(content4)";
_stack1._addtext /*b4j.example.pdfparagraphs*/ (_content4);
 //BA.debugLineNum = 103;BA.debugLine="stack1.AddString(\"I'm loving this!\")";
_stack1._addstring /*b4j.example.pdfparagraphs*/ ("I'm loving this!");
 //BA.debugLineNum = 104;BA.debugLine="maker.AddParagraphs(stack1)";
_maker._addparagraphs /*b4j.example.pdfmaker*/ (_stack1);
 //BA.debugLineNum = 107;BA.debugLine="Dim cols As PDFColumns = maker.CreateColumns";
_cols = _maker._createcolumns /*b4j.example.pdfcolumns*/ ();
 //BA.debugLineNum = 108;BA.debugLine="cols.AddText(maker.CreateText(\"Column 1\").SetWidt";
_cols._addtext /*b4j.example.pdfcolumns*/ (_maker._createtext /*b4j.example.pdftext*/ ("Column 1")._setwidth /*b4j.example.pdftext*/ ("auto"));
 //BA.debugLineNum = 109;BA.debugLine="cols.AddText(maker.CreateText(\"Column 2\").SetWidt";
_cols._addtext /*b4j.example.pdfcolumns*/ (_maker._createtext /*b4j.example.pdftext*/ ("Column 2")._setwidth /*b4j.example.pdftext*/ ("*"));
 //BA.debugLineNum = 110;BA.debugLine="cols.AddText(maker.CreateText(\"Column 3\").SetWidt";
_cols._addtext /*b4j.example.pdfcolumns*/ (_maker._createtext /*b4j.example.pdftext*/ ("Column 3")._setwidth /*b4j.example.pdftext*/ (BA.NumberToString(100)));
 //BA.debugLineNum = 111;BA.debugLine="cols.AddText(maker.CreateText(\"Column 4\").SetWidt";
_cols._addtext /*b4j.example.pdfcolumns*/ (_maker._createtext /*b4j.example.pdftext*/ ("Column 4")._setwidth /*b4j.example.pdftext*/ ("20%"));
 //BA.debugLineNum = 112;BA.debugLine="cols.style.SetMargin(10,10,10,10)";
_cols._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ ((int) (10),(int) (10),(int) (10),(int) (10));
 //BA.debugLineNum = 113;BA.debugLine="maker.AddColumns(cols)";
_maker._addcolumns /*b4j.example.pdfmaker*/ (_cols);
 //BA.debugLineNum = 115;BA.debugLine="Dim ol As PDFList = maker.CreateList(\"ol\")";
_ol = _maker._createlist /*b4j.example.pdflist*/ ("ol");
 //BA.debugLineNum = 116;BA.debugLine="ol.AddItems(Array(\"Item 1\", \"Item 2\", \"Item 3\"))";
_ol._additems /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Item 1"),(Object)("Item 2"),(Object)("Item 3")}));
 //BA.debugLineNum = 118;BA.debugLine="Dim item4 As PDFText = maker.CreateText(\"Item 4\")";
_item4 = _maker._createtext /*b4j.example.pdftext*/ ("Item 4");
 //BA.debugLineNum = 119;BA.debugLine="item4.style.bold = True";
_item4._style /*b4j.example.pdfstyle*/ ._bold /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 120;BA.debugLine="ol.AddText(item4)";
_ol._addtext /*b4j.example.pdflist*/ (_item4);
 //BA.debugLineNum = 121;BA.debugLine="maker.AddList(ol)";
_maker._addlist /*b4j.example.pdfmaker*/ (_ol);
 //BA.debugLineNum = 123;BA.debugLine="Dim ul As PDFList = maker.CreateList(\"ul\")";
_ul = _maker._createlist /*b4j.example.pdflist*/ ("ul");
 //BA.debugLineNum = 124;BA.debugLine="ul.AddItems(Array(\"Item 1\", \"Item 2\", \"Item 3\"))";
_ul._additems /*String*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Item 1"),(Object)("Item 2"),(Object)("Item 3")}));
 //BA.debugLineNum = 125;BA.debugLine="ul.style.SetMargin(0,10,0,10)";
_ul._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ ((int) (0),(int) (10),(int) (0),(int) (10));
 //BA.debugLineNum = 126;BA.debugLine="maker.AddList(ul)";
_maker._addlist /*b4j.example.pdfmaker*/ (_ul);
 //BA.debugLineNum = 129;BA.debugLine="Dim stack As PDFStack = maker.CreateStack";
_stack = _maker._createstack /*b4j.example.pdfstack*/ ();
 //BA.debugLineNum = 130;BA.debugLine="stack.style.fontSize = 15";
_stack._style /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = (int) (15);
 //BA.debugLineNum = 131;BA.debugLine="stack.AddString(\"paragraph A\")";
_stack._addstring /*b4j.example.pdfstack*/ ("paragraph A");
 //BA.debugLineNum = 132;BA.debugLine="stack.AddString(\"paragraph B\")";
_stack._addstring /*b4j.example.pdfstack*/ ("paragraph B");
 //BA.debugLineNum = 133;BA.debugLine="stack.AddString(\"these paragraphs will be rendere";
_stack._addstring /*b4j.example.pdfstack*/ ("these paragraphs will be rendered one below another inside the column");
 //BA.debugLineNum = 134;BA.debugLine="maker.AddStack(stack)";
_maker._addstack /*b4j.example.pdfmaker*/ (_stack);
 //BA.debugLineNum = 137;BA.debugLine="Dim pgText As PDFText = maker.CreateText(\"This te";
_pgtext = _maker._createtext /*b4j.example.pdftext*/ ("This text is in Potrait Mode");
 //BA.debugLineNum = 138;BA.debugLine="pgText.pageOrientation = \"potrait\"";
_pgtext._pageorientation /*String*/  = "potrait";
 //BA.debugLineNum = 139;BA.debugLine="pgText.pageBreakBefore = True";
_pgtext._pagebreakbefore /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 140;BA.debugLine="maker.AddText(pgText)";
_maker._addtext /*String*/ (_pgtext);
 //BA.debugLineNum = 144;BA.debugLine="Dim pgText1 As PDFText = maker.CreateText(\"This t";
_pgtext1 = _maker._createtext /*b4j.example.pdftext*/ ("This text is in LandScape Mode");
 //BA.debugLineNum = 145;BA.debugLine="pgText1.pageOrientation = \"landscape\"";
_pgtext1._pageorientation /*String*/  = "landscape";
 //BA.debugLineNum = 146;BA.debugLine="pgText1.pageBreakAfter = True";
_pgtext1._pagebreakafter /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 147;BA.debugLine="maker.AddText(pgText1)";
_maker._addtext /*String*/ (_pgtext1);
 //BA.debugLineNum = 150;BA.debugLine="Dim pgText2 As PDFText = maker.CreateText(\"Anothe";
_pgtext2 = _maker._createtext /*b4j.example.pdftext*/ ("Another Page...");
 //BA.debugLineNum = 151;BA.debugLine="maker.AddText(pgText2)";
_maker._addtext /*String*/ (_pgtext2);
 //BA.debugLineNum = 154;BA.debugLine="Dim tbl As PDFTable = maker.CreateTable";
_tbl = _maker._createtable /*b4j.example.pdftable*/ ();
 //BA.debugLineNum = 155;BA.debugLine="tbl.lightHorizontalLines = True";
_tbl._lighthorizontallines /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 156;BA.debugLine="tbl.headerRows = 1";
_tbl._headerrows /*int*/  = (int) (1);
 //BA.debugLineNum = 157;BA.debugLine="tbl.AddColumn(\"1st\", \"*\", Null)";
_tbl._addcolumn /*b4j.example.pdftable*/ ("1st",(Object)("*"),anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 158;BA.debugLine="tbl.AddColumn(\"2nd\", \"auto\", Null)";
_tbl._addcolumn /*b4j.example.pdftable*/ ("2nd",(Object)("auto"),anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 159;BA.debugLine="tbl.AddColumn(\"3rd\", 100, Null)";
_tbl._addcolumn /*b4j.example.pdftable*/ ("3rd",(Object)(100),anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 160;BA.debugLine="tbl.AddColumn(\"4rth\", \"*\", Null)";
_tbl._addcolumn /*b4j.example.pdftable*/ ("4rth",(Object)("*"),anywheresoftware.b4a.keywords.Common.Null);
 //BA.debugLineNum = 162;BA.debugLine="tbl.AddRow(Array(\"Value 1\", \"Value 2\", \"Value 3\",";
_tbl._addrow /*b4j.example.pdftable*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Value 1"),(Object)("Value 2"),(Object)("Value 3"),(Object)("Value 4")}));
 //BA.debugLineNum = 163;BA.debugLine="tbl.AddRow(Array(\"Value 5\", \"Value 6\", \"Value 7\",";
_tbl._addrow /*b4j.example.pdftable*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("Value 5"),(Object)("Value 6"),(Object)("Value 7"),(Object)("Value 8")}));
 //BA.debugLineNum = 165;BA.debugLine="Dim r2c1 As PDFText = maker.CreateText(\"Bold Valu";
_r2c1 = _maker._createtext /*b4j.example.pdftext*/ ("Bold Value");
 //BA.debugLineNum = 166;BA.debugLine="r2c1.style.bold = True";
_r2c1._style /*b4j.example.pdfstyle*/ ._bold /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 167;BA.debugLine="tbl.AddRow(Array(r2c1.content, \"Value 10\", \"Value";
_tbl._addrow /*b4j.example.pdftable*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_r2c1._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()),(Object)("Value 10"),(Object)("Value 11"),(Object)("Value 12")}));
 //BA.debugLineNum = 169;BA.debugLine="maker.AddTable(tbl)";
_maker._addtable /*b4j.example.pdfmaker*/ (_tbl);
 //BA.debugLineNum = 172;BA.debugLine="maker.Download";
_maker._download /*String*/ ();
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Private body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
