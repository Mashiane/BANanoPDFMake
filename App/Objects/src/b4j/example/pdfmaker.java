package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfmaker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfmaker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfmaker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _styles = null;
public anywheresoftware.b4a.objects.collections.Map _docdefinition = null;
public anywheresoftware.b4a.objects.collections.List _content = null;
public b4j.example.pdfstyle _defaultstyle = null;
public com.ab.banano.BANanoObject _pdfmake = null;
public com.ab.banano.BANano _banano = null;
public String _pagesize = "";
public String _pageorientation = "";
public String _title = "";
public String _author = "";
public String _subject = "";
public String _keywords = "";
public String _creator = "";
public String _producer = "";
public anywheresoftware.b4a.objects.collections.Map _info = null;
public boolean _compress = false;
public b4j.example.pdfsecurity _security = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public b4j.example.pdfmaker  _addcolumns(b4j.example.pdfcolumns _cols) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub AddColumns(cols As PDFColumns) As PDFMaker";
 //BA.debugLineNum = 112;BA.debugLine="content.Add(cols.content)";
_content.Add((Object)(_cols._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addfooter(b4j.example.pdffooter _ftr) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub AddFooter(ftr As PDFFooter) As PDFMaker";
 //BA.debugLineNum = 118;BA.debugLine="docDefinition.Put(\"footer\", ftr.content)";
_docdefinition.Put((Object)("footer"),(Object)(_ftr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addimage(b4j.example.pdfimage _img) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub AddImage(img As PDFImage) As PDFMaker";
 //BA.debugLineNum = 74;BA.debugLine="content.Add(img.Content)";
_content.Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addlist(b4j.example.pdflist _lstof) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Sub AddList(lstOf As PDFList) As PDFMaker";
 //BA.debugLineNum = 183;BA.debugLine="content.Add(lstOf.Content)";
_content.Add((Object)(_lstof._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addparagraphs(b4j.example.pdfparagraphs _stack) throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Sub AddParagraphs(stack As PDFParagraphs) As PDFMa";
 //BA.debugLineNum = 136;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 137;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addqrcode(b4j.example.pdfqrcode _qrcode) throws Exception{
 //BA.debugLineNum = 129;BA.debugLine="Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker";
 //BA.debugLineNum = 130;BA.debugLine="content.Add(qrCode.Content)";
_content.Add((Object)(_qrcode._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 131;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstack(b4j.example.pdfstack _stack) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFMaker";
 //BA.debugLineNum = 124;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Sub AddString(txt As String) As PDFMaker";
 //BA.debugLineNum = 142;BA.debugLine="content.Add(txt)";
_content.Add((Object)(_txt));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public String  _addstyle(b4j.example.pdfstyle _style) throws Exception{
String _name = "";
anywheresoftware.b4a.objects.collections.Map _stylecontent = null;
 //BA.debugLineNum = 211;BA.debugLine="Sub AddStyle(style As PDFStyle)";
 //BA.debugLineNum = 212;BA.debugLine="Dim name As String = style.name";
_name = _style._name /*String*/ ;
 //BA.debugLineNum = 213;BA.debugLine="Dim stylecontent As Map = style.content";
_stylecontent = new anywheresoftware.b4a.objects.collections.Map();
_stylecontent = _style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 214;BA.debugLine="styles.Put(name, stylecontent)";
_styles.Put((Object)(_name),(Object)(_stylecontent.getObject()));
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtable(b4j.example.pdftable _tbl) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFMaker";
 //BA.debugLineNum = 80;BA.debugLine="content.Add(tbl.Content)";
_content.Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public String  _addtext(b4j.example.pdftext _currentcontent) throws Exception{
anywheresoftware.b4a.objects.collections.Map _text = null;
 //BA.debugLineNum = 218;BA.debugLine="Sub AddText(currentContent As PDFText)";
 //BA.debugLineNum = 219;BA.debugLine="Dim text As Map = currentContent.Content";
_text = new anywheresoftware.b4a.objects.collections.Map();
_text = _currentcontent._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 220;BA.debugLine="content.Add(text)";
_content.Add((Object)(_text.getObject()));
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3;BA.debugLine="Private docDefinition As Map";
_docdefinition = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private content As List";
_content = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public defaultStyle As PDFStyle";
_defaultstyle = new b4j.example.pdfstyle();
 //BA.debugLineNum = 6;BA.debugLine="Private pdfMake As BANanoObject";
_pdfmake = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 8;BA.debugLine="Public pageSize As String";
_pagesize = "";
 //BA.debugLineNum = 9;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 10;BA.debugLine="Public title As String";
_title = "";
 //BA.debugLineNum = 11;BA.debugLine="Public author As String";
_author = "";
 //BA.debugLineNum = 12;BA.debugLine="Public subject As String";
_subject = "";
 //BA.debugLineNum = 13;BA.debugLine="Public keywords As String";
_keywords = "";
 //BA.debugLineNum = 14;BA.debugLine="Public creator As String";
_creator = "";
 //BA.debugLineNum = 15;BA.debugLine="Public producer As String";
_producer = "";
 //BA.debugLineNum = 16;BA.debugLine="Private info As Map";
_info = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="Private compress As Boolean";
_compress = false;
 //BA.debugLineNum = 18;BA.debugLine="Public security As PDFSecurity";
_security = new b4j.example.pdfsecurity();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfcolumns  _createcolumns() throws Exception{
b4j.example.pdfcolumns _col = null;
 //BA.debugLineNum = 188;BA.debugLine="Sub CreateColumns As PDFColumns";
 //BA.debugLineNum = 189;BA.debugLine="Dim col As PDFColumns";
_col = new b4j.example.pdfcolumns();
 //BA.debugLineNum = 190;BA.debugLine="col.Initialize";
_col._initialize /*b4j.example.pdfcolumns*/ (ba);
 //BA.debugLineNum = 191;BA.debugLine="Return col";
if (true) return _col;
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdffooter  _createfooter() throws Exception{
b4j.example.pdffooter _ftr = null;
 //BA.debugLineNum = 168;BA.debugLine="Sub CreateFooter As PDFFooter";
 //BA.debugLineNum = 169;BA.debugLine="Dim ftr As PDFFooter";
_ftr = new b4j.example.pdffooter();
 //BA.debugLineNum = 170;BA.debugLine="ftr.Initialize";
_ftr._initialize /*String*/ (ba);
 //BA.debugLineNum = 171;BA.debugLine="Return ftr";
if (true) return _ftr;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _createimage() throws Exception{
b4j.example.pdfimage _img = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub CreateImage As PDFImage";
 //BA.debugLineNum = 67;BA.debugLine="Dim img As PDFImage";
_img = new b4j.example.pdfimage();
 //BA.debugLineNum = 68;BA.debugLine="img.Initialize";
_img._initialize /*b4j.example.pdfimage*/ (ba);
 //BA.debugLineNum = 69;BA.debugLine="Return img";
if (true) return _img;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _createlist(String _typeof) throws Exception{
b4j.example.pdflist _lstof = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub CreateList(typeOf As String) As PDFList";
 //BA.debugLineNum = 176;BA.debugLine="Dim lstOf As PDFList";
_lstof = new b4j.example.pdflist();
 //BA.debugLineNum = 177;BA.debugLine="lstOf.Initialize(typeOf)";
_lstof._initialize /*b4j.example.pdflist*/ (ba,_typeof);
 //BA.debugLineNum = 178;BA.debugLine="Return lstOf";
if (true) return _lstof;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _createparagraphs() throws Exception{
b4j.example.pdfparagraphs _stack = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub CreateParagraphs As PDFParagraphs";
 //BA.debugLineNum = 162;BA.debugLine="Dim stack As PDFParagraphs";
_stack = new b4j.example.pdfparagraphs();
 //BA.debugLineNum = 163;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfparagraphs*/ (ba);
 //BA.debugLineNum = 164;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _createqrcode() throws Exception{
b4j.example.pdfqrcode _qrcode = null;
 //BA.debugLineNum = 147;BA.debugLine="Sub CreateQRCode As PDFQRCode";
 //BA.debugLineNum = 148;BA.debugLine="Dim qrcode As PDFQRCode";
_qrcode = new b4j.example.pdfqrcode();
 //BA.debugLineNum = 149;BA.debugLine="qrcode.Initialize";
_qrcode._initialize /*b4j.example.pdfqrcode*/ (ba);
 //BA.debugLineNum = 150;BA.debugLine="Return qrcode";
if (true) return _qrcode;
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _createrow() throws Exception{
b4j.example.pdfrow _row = null;
 //BA.debugLineNum = 52;BA.debugLine="Sub CreateRow As PDFRow";
 //BA.debugLineNum = 53;BA.debugLine="Dim row As PDFRow";
_row = new b4j.example.pdfrow();
 //BA.debugLineNum = 54;BA.debugLine="row.Initialize";
_row._initialize /*b4j.example.pdfrow*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _createstack() throws Exception{
b4j.example.pdfstack _stack = null;
 //BA.debugLineNum = 154;BA.debugLine="Sub CreateStack As PDFStack";
 //BA.debugLineNum = 155;BA.debugLine="Dim stack As PDFStack";
_stack = new b4j.example.pdfstack();
 //BA.debugLineNum = 156;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfstack*/ (ba);
 //BA.debugLineNum = 157;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyle(String _name) throws Exception{
b4j.example.pdfstyle _style = null;
 //BA.debugLineNum = 195;BA.debugLine="Sub CreateStyle(name As String) As PDFStyle";
 //BA.debugLineNum = 196;BA.debugLine="Dim Style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 197;BA.debugLine="Style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 198;BA.debugLine="Style.name = name";
_style._name /*String*/  = _name;
 //BA.debugLineNum = 199;BA.debugLine="Return Style";
if (true) return _style;
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _createtable() throws Exception{
b4j.example.pdftable _tbl = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub CreateTable As PDFTable";
 //BA.debugLineNum = 60;BA.debugLine="Dim tbl As PDFTable";
_tbl = new b4j.example.pdftable();
 //BA.debugLineNum = 61;BA.debugLine="tbl.Initialize";
_tbl._initialize /*b4j.example.pdftable*/ (ba);
 //BA.debugLineNum = 62;BA.debugLine="Return tbl";
if (true) return _tbl;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _createtext(String _txt) throws Exception{
b4j.example.pdftext _cnt = null;
 //BA.debugLineNum = 203;BA.debugLine="Sub CreateText(txt As String) As PDFText";
 //BA.debugLineNum = 204;BA.debugLine="Dim cnt As PDFText";
_cnt = new b4j.example.pdftext();
 //BA.debugLineNum = 205;BA.debugLine="cnt.Initialize";
_cnt._initialize /*b4j.example.pdftext*/ (ba);
 //BA.debugLineNum = 206;BA.debugLine="cnt.Append(txt)";
_cnt._append /*b4j.example.pdftext*/ (_txt);
 //BA.debugLineNum = 207;BA.debugLine="Return cnt";
if (true) return _cnt;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public String  _download() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ddy = null;
com.ab.banano.BANanoObject _dx = null;
 //BA.debugLineNum = 252;BA.debugLine="Sub Download";
 //BA.debugLineNum = 253;BA.debugLine="Dim ddy As Map = getDD";
_ddy = new anywheresoftware.b4a.objects.collections.Map();
_ddy = _getdd();
 //BA.debugLineNum = 254;BA.debugLine="pdfMake.Initialize(\"pdfMake\")";
_pdfmake.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 255;BA.debugLine="Dim dx As BANanoObject = pdfMake.RunMethod(\"creat";
_dx = new com.ab.banano.BANanoObject();
_dx = _pdfmake.RunMethod("createPdf",(Object)(_ddy.getObject()));
 //BA.debugLineNum = 256;BA.debugLine="dx.RunMethod(\"download\", Null)";
_dx.RunMethod("download",__c.Null);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getdd() throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub getDD As Map";
 //BA.debugLineNum = 225;BA.debugLine="If pageSize <> Null Then docDefinition.Put(\"pageS";
if (_pagesize!= null) { 
_docdefinition.Put((Object)("pageSize"),(Object)(_pagesize));};
 //BA.debugLineNum = 226;BA.debugLine="If pageOrientation <> Null Then docDefinition.Put";
if (_pageorientation!= null) { 
_docdefinition.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 227;BA.debugLine="docDefinition.Put(\"content\", content)";
_docdefinition.Put((Object)("content"),(Object)(_content.getObject()));
 //BA.debugLineNum = 228;BA.debugLine="docDefinition.Put(\"styles\", styles)";
_docdefinition.Put((Object)("styles"),(Object)(_styles.getObject()));
 //BA.debugLineNum = 229;BA.debugLine="If title <> Null Then info.Put(\"title\", title)";
if (_title!= null) { 
_info.Put((Object)("title"),(Object)(_title));};
 //BA.debugLineNum = 230;BA.debugLine="If author <> Null Then info.Put(\"author\", author)";
if (_author!= null) { 
_info.Put((Object)("author"),(Object)(_author));};
 //BA.debugLineNum = 231;BA.debugLine="If subject <> Null Then info.Put(\"subject\", subje";
if (_subject!= null) { 
_info.Put((Object)("subject"),(Object)(_subject));};
 //BA.debugLineNum = 232;BA.debugLine="If keywords <> Null Then info.Put(\"keywords\", key";
if (_keywords!= null) { 
_info.Put((Object)("keywords"),(Object)(_keywords));};
 //BA.debugLineNum = 233;BA.debugLine="If creator <> Null Then info.Put(\"creator\", creat";
if (_creator!= null) { 
_info.Put((Object)("creator"),(Object)(_creator));};
 //BA.debugLineNum = 234;BA.debugLine="If producer <> Null Then info.Put(\"producer\", pro";
if (_producer!= null) { 
_info.Put((Object)("producer"),(Object)(_producer));};
 //BA.debugLineNum = 235;BA.debugLine="If info.Size > 0 Then docDefinition.Put(\"info\", i";
if (_info.getSize()>0) { 
_docdefinition.Put((Object)("info"),(Object)(_info.getObject()));};
 //BA.debugLineNum = 236;BA.debugLine="If compress <> Null Then docDefinition.Put(\"compr";
if (_compress!=BA.ObjectToBoolean(__c.Null)) { 
_docdefinition.Put((Object)("compress"),(Object)(_compress));};
 //BA.debugLineNum = 237;BA.debugLine="If security.userPassword <> Null Then docDefiniti";
if (_security._userpassword /*String*/ != null) { 
_docdefinition.Put((Object)("userPassword"),(Object)(_security._userpassword /*String*/ ));};
 //BA.debugLineNum = 238;BA.debugLine="If security.ownerPassword <> Null Then docDefinit";
if (_security._ownerpassword /*String*/ != null) { 
_docdefinition.Put((Object)("ownerPassword"),(Object)(_security._ownerpassword /*String*/ ));};
 //BA.debugLineNum = 239;BA.debugLine="docDefinition.Put(\"permissions\", security.content";
_docdefinition.Put((Object)("permissions"),(Object)(_security._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 240;BA.debugLine="docDefinition.Put(\"defaultStyle\", defaultStyle)";
_docdefinition.Put((Object)("defaultStyle"),(Object)(_defaultstyle));
 //BA.debugLineNum = 241;BA.debugLine="Return docDefinition";
if (true) return _docdefinition;
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public String  _getjson() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ddy = null;
String _sjson = "";
 //BA.debugLineNum = 245;BA.debugLine="Sub getJSON As String";
 //BA.debugLineNum = 246;BA.debugLine="Dim ddy As Map = getDD";
_ddy = new anywheresoftware.b4a.objects.collections.Map();
_ddy = _getdd();
 //BA.debugLineNum = 247;BA.debugLine="Dim sJSON As String = BANano.ToJson(ddy)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_ddy.getObject())));
 //BA.debugLineNum = 248;BA.debugLine="Return sJSON";
if (true) return _sjson;
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As PDFMaker";
 //BA.debugLineNum = 23;BA.debugLine="styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="docDefinition.Initialize";
_docdefinition.Initialize();
 //BA.debugLineNum = 25;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 26;BA.debugLine="defaultStyle.Initialize";
_defaultstyle._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 27;BA.debugLine="defaultStyle.name = \"defaultStyle\"";
_defaultstyle._name /*String*/  = "defaultStyle";
 //BA.debugLineNum = 28;BA.debugLine="pageSize = Null";
_pagesize = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 30;BA.debugLine="title = Null";
_title = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 31;BA.debugLine="author = Null";
_author = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 32;BA.debugLine="subject = Null";
_subject = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 33;BA.debugLine="keywords = Null";
_keywords = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 34;BA.debugLine="creator = Null";
_creator = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 35;BA.debugLine="producer = Null";
_producer = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="info.Initialize";
_info.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="compress = Null";
_compress = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 38;BA.debugLine="security.Initialize";
_security._initialize /*String*/ (ba);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _open() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ddy = null;
com.ab.banano.BANanoObject _dx = null;
 //BA.debugLineNum = 268;BA.debugLine="Sub Open";
 //BA.debugLineNum = 269;BA.debugLine="Dim ddy As Map = getDD";
_ddy = new anywheresoftware.b4a.objects.collections.Map();
_ddy = _getdd();
 //BA.debugLineNum = 270;BA.debugLine="pdfMake.Initialize(\"pdfMake\")";
_pdfmake.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 271;BA.debugLine="Dim dx As BANanoObject = pdfMake.RunMethod(\"creat";
_dx = new com.ab.banano.BANanoObject();
_dx = _pdfmake.RunMethod("createPdf",(Object)(_ddy.getObject()));
 //BA.debugLineNum = 272;BA.debugLine="dx.RunMethod(\"open\", Null)";
_dx.RunMethod("open",__c.Null);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _print() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ddy = null;
com.ab.banano.BANanoObject _dx = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub Print";
 //BA.debugLineNum = 261;BA.debugLine="Dim ddy As Map = getDD";
_ddy = new anywheresoftware.b4a.objects.collections.Map();
_ddy = _getdd();
 //BA.debugLineNum = 262;BA.debugLine="pdfMake.Initialize(\"pdfMake\")";
_pdfmake.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 263;BA.debugLine="Dim dx As BANanoObject = pdfMake.RunMethod(\"creat";
_dx = new com.ab.banano.BANanoObject();
_dx = _pdfmake.RunMethod("createPdf",(Object)(_ddy.getObject()));
 //BA.debugLineNum = 264;BA.debugLine="dx.RunMethod(\"print\", Null)";
_dx.RunMethod("print",__c.Null);
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setbackground(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetBackground(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 100;BA.debugLine="docDefinition.Put(\"background\", wm.Content)";
_docdefinition.Put((Object)("background"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setheader(b4j.example.pdftext _hdr) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetHeader(hdr As PDFText) As PDFMaker";
 //BA.debugLineNum = 106;BA.debugLine="docDefinition.Put(\"header\", hdr.content)";
_docdefinition.Put((Object)("header"),(Object)(_hdr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagemargins(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 43;BA.debugLine="Sub SetPageMargins(l As Int, t As Int, r As Int, b";
 //BA.debugLineNum = 44;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 45;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 47;BA.debugLine="docDefinition.Put(\"pageMargins\", margin)";
_docdefinition.Put((Object)("pageMargins"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _settoc(b4j.example.pdftext _toc) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tocm = null;
anywheresoftware.b4a.objects.collections.Map _toct = null;
 //BA.debugLineNum = 89;BA.debugLine="Sub SetToC(toc As PDFText) As PDFMaker";
 //BA.debugLineNum = 90;BA.debugLine="Dim tocm As Map = CreateMap()";
_tocm = new anywheresoftware.b4a.objects.collections.Map();
_tocm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 91;BA.debugLine="tocm.Put(\"title\", toc.Content)";
_tocm.Put((Object)("title"),(Object)(_toc._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 92;BA.debugLine="Dim toct As Map = CreateMap()";
_toct = new anywheresoftware.b4a.objects.collections.Map();
_toct = __c.createMap(new Object[] {});
 //BA.debugLineNum = 93;BA.debugLine="toct.Put(\"toc\", tocm)";
_toct.Put((Object)("toc"),(Object)(_tocm.getObject()));
 //BA.debugLineNum = 94;BA.debugLine="content.Add(toct)";
_content.Add((Object)(_toct.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setwatermark(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Sub SetWaterMark(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 85;BA.debugLine="docDefinition.Put(\"watermark\", wm.Content)";
_docdefinition.Put((Object)("watermark"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 86;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _toiframe(String _divid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _ddy = null;
com.ab.banano.BANanoObject _pdfdocgenerator = null;
Object _dataurl = null;
String _kid = "";
com.ab.banano.BANanoObject _targetelement = null;
com.ab.banano.BANanoObject _iframe = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub ToIFrame(divID As String)";
 //BA.debugLineNum = 277;BA.debugLine="Dim ddy As Map = getDD";
_ddy = new anywheresoftware.b4a.objects.collections.Map();
_ddy = _getdd();
 //BA.debugLineNum = 278;BA.debugLine="pdfMake.Initialize(\"pdfMake\")";
_pdfmake.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 279;BA.debugLine="Dim pdfDocGenerator As BANanoObject = pdfMake.Run";
_pdfdocgenerator = new com.ab.banano.BANanoObject();
_pdfdocgenerator = _pdfmake.RunMethod("createPdf",(Object)(_ddy.getObject()));
 //BA.debugLineNum = 280;BA.debugLine="Dim dataUrl As Object";
_dataurl = new Object();
 //BA.debugLineNum = 281;BA.debugLine="pdfDocGenerator.RunMethod(\"getDataUrl\",Array(data";
_pdfdocgenerator.RunMethod("getDataUrl",(Object)(new Object[]{_dataurl}));
 //BA.debugLineNum = 283;BA.debugLine="Dim kID As String = $\"#${divID}\"$";
_kid = ("#"+__c.SmartStringFormatter("",(Object)(_divid))+"");
 //BA.debugLineNum = 284;BA.debugLine="Dim targetElement As BANanoObject = BANano.Window";
_targetelement = new com.ab.banano.BANanoObject();
_targetelement = _banano.Window().GetField("document").RunMethod("querySelector",(Object)(new Object[]{(Object)(_kid)}));
 //BA.debugLineNum = 285;BA.debugLine="Dim iframe As BANanoObject = BANano.Window.GetFie";
_iframe = new com.ab.banano.BANanoObject();
_iframe = _banano.Window().GetField("document").RunMethod("createElement",(Object)(new Object[]{(Object)("iframe")}));
 //BA.debugLineNum = 286;BA.debugLine="iframe.SetField(\"src\", dataUrl)";
_iframe.SetField("src",_dataurl);
 //BA.debugLineNum = 287;BA.debugLine="targetElement.RunMethod(\"appendChild\", Array(ifra";
_targetelement.RunMethod("appendChild",(Object)(new Object[]{(Object)(_iframe.getObject())}));
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
