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
public com.ab.banano.BANanoObject _pdf = null;
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
public String _parentid = "";
public String _fname = "";
public anywheresoftware.b4a.objects.collections.Map _blobs = null;
public int _numfiles = 0;
public anywheresoftware.b4a.objects.collections.Map _files = null;
public anywheresoftware.b4a.objects.collections.Map _images = null;
public anywheresoftware.b4a.objects.collections.Map _filekeys = null;
public String _action = "";
public Object _eventhandler = null;
public String _eventmethod = "";
public String _mjson = "";
public String _mjsonpretty = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdfmaker  _addcolumns(b4j.example.pdfcolumns _cols) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub AddColumns(cols As PDFColumns) As PDFMaker";
 //BA.debugLineNum = 338;BA.debugLine="Log(\"PDFMaker.AddColumns\")";
__c.Log("PDFMaker.AddColumns");
 //BA.debugLineNum = 339;BA.debugLine="content.Add(cols.content)";
_content.Add((Object)(_cols._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addfooter(b4j.example.pdffooter _ftr) throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub AddFooter(ftr As PDFFooter) As PDFMaker";
 //BA.debugLineNum = 345;BA.debugLine="Log(\"PDFMaker.AddFooter\")";
__c.Log("PDFMaker.AddFooter");
 //BA.debugLineNum = 346;BA.debugLine="docDefinition.Put(\"footer\", ftr.content)";
_docdefinition.Put((Object)("footer"),(Object)(_ftr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 347;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addimage(b4j.example.pdfimage _img) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub AddImage(img As PDFImage) As PDFMaker";
 //BA.debugLineNum = 304;BA.debugLine="Log(\"PDFMaker.AddImage\")";
__c.Log("PDFMaker.AddImage");
 //BA.debugLineNum = 305;BA.debugLine="content.Add(img.Content)";
_content.Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addlist(b4j.example.pdflist _lstof) throws Exception{
 //BA.debugLineNum = 419;BA.debugLine="Sub AddList(lstOf As PDFList) As PDFMaker";
 //BA.debugLineNum = 420;BA.debugLine="Log(\"PDFMaker.AddList\")";
__c.Log("PDFMaker.AddList");
 //BA.debugLineNum = 421;BA.debugLine="content.Add(lstOf.Content)";
_content.Add((Object)(_lstof._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addparagraphs(b4j.example.pdfparagraphs _stack) throws Exception{
 //BA.debugLineNum = 365;BA.debugLine="Sub AddParagraphs(stack As PDFParagraphs) As PDFMa";
 //BA.debugLineNum = 366;BA.debugLine="Log(\"PDFMaker.AddParagraphs\")";
__c.Log("PDFMaker.AddParagraphs");
 //BA.debugLineNum = 367;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 368;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 369;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addqrcode(b4j.example.pdfqrcode _qrcode) throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker";
 //BA.debugLineNum = 359;BA.debugLine="Log(\"PDFMaker.AddQRCode\")";
__c.Log("PDFMaker.AddQRCode");
 //BA.debugLineNum = 360;BA.debugLine="content.Add(qrCode.Content)";
_content.Add((Object)(_qrcode._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstack(b4j.example.pdfstack _stack) throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFMaker";
 //BA.debugLineNum = 352;BA.debugLine="Log(\"PDFMaker.AddStack\")";
__c.Log("PDFMaker.AddStack");
 //BA.debugLineNum = 353;BA.debugLine="content.Add(stack.Content)";
_content.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 372;BA.debugLine="Sub AddString(txt As String) As PDFMaker";
 //BA.debugLineNum = 373;BA.debugLine="Log(\"PDFMaker.AddString\")";
__c.Log("PDFMaker.AddString");
 //BA.debugLineNum = 374;BA.debugLine="content.Add(txt)";
_content.Add((Object)(_txt));
 //BA.debugLineNum = 375;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 376;BA.debugLine="End Sub";
return null;
}
public String  _addstyle(b4j.example.pdfstyle _style) throws Exception{
String _name = "";
anywheresoftware.b4a.objects.collections.Map _stylecontent = null;
 //BA.debugLineNum = 460;BA.debugLine="Sub AddStyle(style As PDFStyle)";
 //BA.debugLineNum = 461;BA.debugLine="Log(\"PDFMaker.AddStyle\")";
__c.Log("PDFMaker.AddStyle");
 //BA.debugLineNum = 462;BA.debugLine="Dim name As String = style.name";
_name = _style._name /*String*/ ;
 //BA.debugLineNum = 463;BA.debugLine="Dim stylecontent As Map = style.content";
_stylecontent = new anywheresoftware.b4a.objects.collections.Map();
_stylecontent = _style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 464;BA.debugLine="styles.Put(name, stylecontent)";
_styles.Put((Object)(_name),(Object)(_stylecontent.getObject()));
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtable(b4j.example.pdftable _tbl) throws Exception{
 //BA.debugLineNum = 310;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFMaker";
 //BA.debugLineNum = 311;BA.debugLine="Log(\"PDFMaker.AddTable\")";
__c.Log("PDFMaker.AddTable");
 //BA.debugLineNum = 312;BA.debugLine="content.Add(tbl.Content)";
_content.Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public String  _addtext(b4j.example.pdftext _currentcontent) throws Exception{
anywheresoftware.b4a.objects.collections.Map _text = null;
 //BA.debugLineNum = 468;BA.debugLine="Sub AddText(currentContent As PDFText)";
 //BA.debugLineNum = 469;BA.debugLine="Log(\"PDFMaker.AddText\")";
__c.Log("PDFMaker.AddText");
 //BA.debugLineNum = 470;BA.debugLine="Dim text As Map = currentContent.Content";
_text = new anywheresoftware.b4a.objects.collections.Map();
_text = _currentcontent._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ();
 //BA.debugLineNum = 471;BA.debugLine="content.Add(text)";
_content.Add((Object)(_text.getObject()));
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _addtoc(b4j.example.pdftoc _toc) throws Exception{
 //BA.debugLineNum = 253;BA.debugLine="Sub AddToC(toc As PDFToC) As PDFMaker";
 //BA.debugLineNum = 254;BA.debugLine="Log(\"PDFMaker.AddToC\")";
__c.Log("PDFMaker.AddToC");
 //BA.debugLineNum = 255;BA.debugLine="content.Add(toc.Content)";
_content.Add((Object)(_toc._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 256;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return null;
}
public String  _build() throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 493;BA.debugLine="private Sub Build";
 //BA.debugLineNum = 494;BA.debugLine="Log(\"PDFMaker.Build\")";
__c.Log("PDFMaker.Build");
 //BA.debugLineNum = 495;BA.debugLine="If pageSize <> Null Then docDefinition.Put(\"pageS";
if (_pagesize!= null) { 
_docdefinition.Put((Object)("pageSize"),(Object)(_pagesize));};
 //BA.debugLineNum = 496;BA.debugLine="If pageOrientation <> Null Then docDefinition.Put";
if (_pageorientation!= null) { 
_docdefinition.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 497;BA.debugLine="docDefinition.Put(\"content\", content)";
_docdefinition.Put((Object)("content"),(Object)(_content.getObject()));
 //BA.debugLineNum = 498;BA.debugLine="docDefinition.Put(\"styles\", styles)";
_docdefinition.Put((Object)("styles"),(Object)(_styles.getObject()));
 //BA.debugLineNum = 499;BA.debugLine="If title <> Null Then info.Put(\"Title\", title)";
if (_title!= null) { 
_info.Put((Object)("Title"),(Object)(_title));};
 //BA.debugLineNum = 500;BA.debugLine="If author <> Null Then info.Put(\"Author\", author)";
if (_author!= null) { 
_info.Put((Object)("Author"),(Object)(_author));};
 //BA.debugLineNum = 501;BA.debugLine="If subject <> Null Then info.Put(\"Subject\", subje";
if (_subject!= null) { 
_info.Put((Object)("Subject"),(Object)(_subject));};
 //BA.debugLineNum = 502;BA.debugLine="If keywords <> Null Then info.Put(\"Keywords\", key";
if (_keywords!= null) { 
_info.Put((Object)("Keywords"),(Object)(_keywords));};
 //BA.debugLineNum = 503;BA.debugLine="If creator <> Null Then info.Put(\"Creator\", creat";
if (_creator!= null) { 
_info.Put((Object)("Creator"),(Object)(_creator));};
 //BA.debugLineNum = 504;BA.debugLine="If producer <> Null Then info.Put(\"Producer\", pro";
if (_producer!= null) { 
_info.Put((Object)("Producer"),(Object)(_producer));};
 //BA.debugLineNum = 505;BA.debugLine="If info.Size > 0 Then docDefinition.Put(\"info\", i";
if (_info.getSize()>0) { 
_docdefinition.Put((Object)("info"),(Object)(_info.getObject()));};
 //BA.debugLineNum = 506;BA.debugLine="If compress <> Null Then docDefinition.Put(\"compr";
if (_compress!=BA.ObjectToBoolean(__c.Null)) { 
_docdefinition.Put((Object)("compress"),(Object)(_compress));};
 //BA.debugLineNum = 507;BA.debugLine="If security.userPassword <> Null Then docDefiniti";
if (_security._userpassword /*String*/ != null) { 
_docdefinition.Put((Object)("userPassword"),(Object)(_security._userpassword /*String*/ ));};
 //BA.debugLineNum = 508;BA.debugLine="If security.ownerPassword <> Null Then docDefinit";
if (_security._ownerpassword /*String*/ != null) { 
_docdefinition.Put((Object)("ownerPassword"),(Object)(_security._ownerpassword /*String*/ ));};
 //BA.debugLineNum = 509;BA.debugLine="docDefinition.Put(\"permissions\", security.content";
_docdefinition.Put((Object)("permissions"),(Object)(_security._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 510;BA.debugLine="docDefinition.Put(\"defaultStyle\", defaultStyle.co";
_docdefinition.Put((Object)("defaultStyle"),(Object)(_defaultstyle._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 511;BA.debugLine="If files.Size > 0 Then";
if (_files.getSize()>0) { 
 //BA.debugLineNum = 512;BA.debugLine="For Each k As String In files.Keys";
{
final anywheresoftware.b4a.BA.IterableList group19 = _files.Keys();
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_k = BA.ObjectToString(group19.Get(index19));
 //BA.debugLineNum = 514;BA.debugLine="Dim v As String = files.Get(k)";
_v = BA.ObjectToString(_files.Get((Object)(_k)));
 //BA.debugLineNum = 515;BA.debugLine="GetFileFromServer(v)";
_getfilefromserver(_v);
 }
};
 }else {
 //BA.debugLineNum = 518;BA.debugLine="FilesAreReady";
_filesareready();
 };
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private styles As Map";
_styles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private docDefinition As Map";
_docdefinition = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="Private content As List";
_content = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Public defaultStyle As PDFStyle";
_defaultstyle = new b4j.example.pdfstyle();
 //BA.debugLineNum = 7;BA.debugLine="Private pdf As BANanoObject";
_pdf = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 9;BA.debugLine="Public pageSize As String";
_pagesize = "";
 //BA.debugLineNum = 10;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 11;BA.debugLine="Public title As String";
_title = "";
 //BA.debugLineNum = 12;BA.debugLine="Public author As String";
_author = "";
 //BA.debugLineNum = 13;BA.debugLine="Public subject As String";
_subject = "";
 //BA.debugLineNum = 14;BA.debugLine="Public keywords As String";
_keywords = "";
 //BA.debugLineNum = 15;BA.debugLine="Public creator As String";
_creator = "";
 //BA.debugLineNum = 16;BA.debugLine="Public producer As String";
_producer = "";
 //BA.debugLineNum = 17;BA.debugLine="Private info As Map";
_info = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Private compress As Boolean";
_compress = false;
 //BA.debugLineNum = 19;BA.debugLine="Public security As PDFSecurity";
_security = new b4j.example.pdfsecurity();
 //BA.debugLineNum = 20;BA.debugLine="Private parentID As String";
_parentid = "";
 //BA.debugLineNum = 21;BA.debugLine="Private fName As String";
_fname = "";
 //BA.debugLineNum = 22;BA.debugLine="Private Blobs As Map";
_blobs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Private NumFiles As Int";
_numfiles = 0;
 //BA.debugLineNum = 24;BA.debugLine="Private files As Map";
_files = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="Private images As Map";
_images = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 26;BA.debugLine="Private fileKeys As Map";
_filekeys = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Private action As String";
_action = "";
 //BA.debugLineNum = 28;BA.debugLine="Private eventHandler As Object";
_eventhandler = new Object();
 //BA.debugLineNum = 29;BA.debugLine="Private eventMethod As String";
_eventmethod = "";
 //BA.debugLineNum = 30;BA.debugLine="Private mJSON As String";
_mjson = "";
 //BA.debugLineNum = 31;BA.debugLine="Private mJSONPretty As String";
_mjsonpretty = "";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfcolumns  _createcolumns() throws Exception{
b4j.example.pdfcolumns _col = null;
 //BA.debugLineNum = 426;BA.debugLine="Sub CreateColumns As PDFColumns";
 //BA.debugLineNum = 427;BA.debugLine="Log(\"PDFMaker.CreateColumns\")";
__c.Log("PDFMaker.CreateColumns");
 //BA.debugLineNum = 428;BA.debugLine="Dim col As PDFColumns";
_col = new b4j.example.pdfcolumns();
 //BA.debugLineNum = 429;BA.debugLine="col.Initialize";
_col._initialize /*b4j.example.pdfcolumns*/ (ba);
 //BA.debugLineNum = 430;BA.debugLine="Return col";
if (true) return _col;
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdffooter  _createfooter() throws Exception{
b4j.example.pdffooter _ftr = null;
 //BA.debugLineNum = 403;BA.debugLine="Sub CreateFooter As PDFFooter";
 //BA.debugLineNum = 404;BA.debugLine="Log(\"PDFMaker.CreateFooter\")";
__c.Log("PDFMaker.CreateFooter");
 //BA.debugLineNum = 405;BA.debugLine="Dim ftr As PDFFooter";
_ftr = new b4j.example.pdffooter();
 //BA.debugLineNum = 406;BA.debugLine="ftr.Initialize";
_ftr._initialize /*String*/ (ba);
 //BA.debugLineNum = 407;BA.debugLine="Return ftr";
if (true) return _ftr;
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _createimage(String _imgkey) throws Exception{
b4j.example.pdfimage _img = null;
 //BA.debugLineNum = 294;BA.debugLine="Sub CreateImage(imgKey As String) As PDFImage";
 //BA.debugLineNum = 295;BA.debugLine="Log(\"PDFMaker.CreateImage\")";
__c.Log("PDFMaker.CreateImage");
 //BA.debugLineNum = 296;BA.debugLine="Dim img As PDFImage";
_img = new b4j.example.pdfimage();
 //BA.debugLineNum = 297;BA.debugLine="img.Initialize";
_img._initialize /*b4j.example.pdfimage*/ (ba);
 //BA.debugLineNum = 298;BA.debugLine="img.SetImage(imgKey)";
_img._setimage /*b4j.example.pdfimage*/ (_imgkey);
 //BA.debugLineNum = 299;BA.debugLine="Return img";
if (true) return _img;
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _createlist(String _typeof) throws Exception{
b4j.example.pdflist _lstof = null;
 //BA.debugLineNum = 411;BA.debugLine="Sub CreateList(typeOf As String) As PDFList";
 //BA.debugLineNum = 412;BA.debugLine="Log(\"PDFMaker.CreateList\")";
__c.Log("PDFMaker.CreateList");
 //BA.debugLineNum = 413;BA.debugLine="Dim lstOf As PDFList";
_lstof = new b4j.example.pdflist();
 //BA.debugLineNum = 414;BA.debugLine="lstOf.Initialize(typeOf)";
_lstof._initialize /*b4j.example.pdflist*/ (ba,_typeof);
 //BA.debugLineNum = 415;BA.debugLine="Return lstOf";
if (true) return _lstof;
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _createparagraphs() throws Exception{
b4j.example.pdfparagraphs _stack = null;
 //BA.debugLineNum = 395;BA.debugLine="Sub CreateParagraphs As PDFParagraphs";
 //BA.debugLineNum = 396;BA.debugLine="Log(\"PDFMaker.CreateParagraphs\")";
__c.Log("PDFMaker.CreateParagraphs");
 //BA.debugLineNum = 397;BA.debugLine="Dim stack As PDFParagraphs";
_stack = new b4j.example.pdfparagraphs();
 //BA.debugLineNum = 398;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfparagraphs*/ (ba);
 //BA.debugLineNum = 399;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _createqrcode() throws Exception{
b4j.example.pdfqrcode _qrcode = null;
 //BA.debugLineNum = 379;BA.debugLine="Sub CreateQRCode As PDFQRCode";
 //BA.debugLineNum = 380;BA.debugLine="Log(\"PDFMaker.CreateQRCode\")";
__c.Log("PDFMaker.CreateQRCode");
 //BA.debugLineNum = 381;BA.debugLine="Dim qrcode As PDFQRCode";
_qrcode = new b4j.example.pdfqrcode();
 //BA.debugLineNum = 382;BA.debugLine="qrcode.Initialize";
_qrcode._initialize /*b4j.example.pdfqrcode*/ (ba);
 //BA.debugLineNum = 383;BA.debugLine="Return qrcode";
if (true) return _qrcode;
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _createrow() throws Exception{
b4j.example.pdfrow _row = null;
 //BA.debugLineNum = 278;BA.debugLine="Sub CreateRow As PDFRow";
 //BA.debugLineNum = 279;BA.debugLine="Log(\"PDFMaker.CreateRow\")";
__c.Log("PDFMaker.CreateRow");
 //BA.debugLineNum = 280;BA.debugLine="Dim row As PDFRow";
_row = new b4j.example.pdfrow();
 //BA.debugLineNum = 281;BA.debugLine="row.Initialize";
_row._initialize /*b4j.example.pdfrow*/ (ba);
 //BA.debugLineNum = 282;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 283;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _createstack() throws Exception{
b4j.example.pdfstack _stack = null;
 //BA.debugLineNum = 387;BA.debugLine="Sub CreateStack As PDFStack";
 //BA.debugLineNum = 388;BA.debugLine="Log(\"PDFMaker.CreateStack\")";
__c.Log("PDFMaker.CreateStack");
 //BA.debugLineNum = 389;BA.debugLine="Dim stack As PDFStack";
_stack = new b4j.example.pdfstack();
 //BA.debugLineNum = 390;BA.debugLine="stack.Initialize";
_stack._initialize /*b4j.example.pdfstack*/ (ba);
 //BA.debugLineNum = 391;BA.debugLine="Return stack";
if (true) return _stack;
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyle(String _name) throws Exception{
b4j.example.pdfstyle _style = null;
 //BA.debugLineNum = 434;BA.debugLine="Sub CreateStyle(name As String) As PDFStyle";
 //BA.debugLineNum = 435;BA.debugLine="Log(\"PDFMaker.CreateStyle\")";
__c.Log("PDFMaker.CreateStyle");
 //BA.debugLineNum = 436;BA.debugLine="Dim Style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 437;BA.debugLine="Style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 438;BA.debugLine="Style.name = name";
_style._name /*String*/  = _name;
 //BA.debugLineNum = 439;BA.debugLine="Return Style";
if (true) return _style;
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _createstyleonly() throws Exception{
b4j.example.pdfstyle _stl = null;
 //BA.debugLineNum = 443;BA.debugLine="Sub CreateStyleOnly As PDFStyle";
 //BA.debugLineNum = 444;BA.debugLine="Log(\"PDFMaker.CreateStyleOnly\")";
__c.Log("PDFMaker.CreateStyleOnly");
 //BA.debugLineNum = 445;BA.debugLine="Dim stl As PDFStyle";
_stl = new b4j.example.pdfstyle();
 //BA.debugLineNum = 446;BA.debugLine="stl.Initialize";
_stl._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 447;BA.debugLine="Return stl";
if (true) return _stl;
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _createtable() throws Exception{
b4j.example.pdftable _tbl = null;
 //BA.debugLineNum = 286;BA.debugLine="Sub CreateTable As PDFTable";
 //BA.debugLineNum = 287;BA.debugLine="Log(\"PDFMaker.CreateTable\")";
__c.Log("PDFMaker.CreateTable");
 //BA.debugLineNum = 288;BA.debugLine="Dim tbl As PDFTable";
_tbl = new b4j.example.pdftable();
 //BA.debugLineNum = 289;BA.debugLine="tbl.Initialize";
_tbl._initialize /*b4j.example.pdftable*/ (ba);
 //BA.debugLineNum = 290;BA.debugLine="Return tbl";
if (true) return _tbl;
 //BA.debugLineNum = 291;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _createtext(String _txt) throws Exception{
b4j.example.pdftext _cnt = null;
 //BA.debugLineNum = 451;BA.debugLine="Sub CreateText(txt As String) As PDFText";
 //BA.debugLineNum = 452;BA.debugLine="Log(\"PDFMaker.CreateText\")";
__c.Log("PDFMaker.CreateText");
 //BA.debugLineNum = 453;BA.debugLine="Dim cnt As PDFText";
_cnt = new b4j.example.pdftext();
 //BA.debugLineNum = 454;BA.debugLine="cnt.Initialize";
_cnt._initialize /*b4j.example.pdftext*/ (ba);
 //BA.debugLineNum = 455;BA.debugLine="cnt.Append(txt)";
_cnt._append /*b4j.example.pdftext*/ (_txt);
 //BA.debugLineNum = 456;BA.debugLine="Return cnt";
if (true) return _cnt;
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _createtoc() throws Exception{
b4j.example.pdftoc _toc = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub CreateToC As PDFToC";
 //BA.debugLineNum = 261;BA.debugLine="Log(\"PDFMaker.CreateToC\")";
__c.Log("PDFMaker.CreateToC");
 //BA.debugLineNum = 262;BA.debugLine="Dim toc As PDFToC";
_toc = new b4j.example.pdftoc();
 //BA.debugLineNum = 263;BA.debugLine="toc.Initialize";
_toc._initialize /*b4j.example.pdftoc*/ (ba);
 //BA.debugLineNum = 264;BA.debugLine="Return toc";
if (true) return _toc;
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public String  _download(String _filename) throws Exception{
 //BA.debugLineNum = 485;BA.debugLine="Sub Download(fileName As String)";
 //BA.debugLineNum = 486;BA.debugLine="Log(\"PDFMaker.Download\")";
__c.Log("PDFMaker.Download");
 //BA.debugLineNum = 487;BA.debugLine="fName = fileName";
_fname = _filename;
 //BA.debugLineNum = 488;BA.debugLine="action = \"download\"";
_action = "download";
 //BA.debugLineNum = 489;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return "";
}
public String  _filesareready() throws Exception{
String _k = "";
String _v = "";
String _dataurl = "";
Object _data = null;
com.ab.banano.BANanoObject _res = null;
com.ab.banano.BANanoPromise _prom = null;
 //BA.debugLineNum = 588;BA.debugLine="private Sub FilesAreReady()";
 //BA.debugLineNum = 589;BA.debugLine="Log(\"PDFMaker.FilesAreReady\")";
__c.Log("PDFMaker.FilesAreReady");
 //BA.debugLineNum = 590;BA.debugLine="If files.Size > 0 Then";
if (_files.getSize()>0) { 
 //BA.debugLineNum = 592;BA.debugLine="For Each k As String In Blobs.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _blobs.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 594;BA.debugLine="Dim v As String = fileKeys.Get(k)";
_v = BA.ObjectToString(_filekeys.Get((Object)(_k)));
 //BA.debugLineNum = 595;BA.debugLine="Dim DataUrl As String = Blobs.Get(k)";
_dataurl = BA.ObjectToString(_blobs.Get((Object)(_k)));
 //BA.debugLineNum = 596;BA.debugLine="images.Put(v, DataUrl)";
_images.Put((Object)(_v),(Object)(_dataurl));
 }
};
 //BA.debugLineNum = 598;BA.debugLine="If images.Size > 0 Then docDefinition.Put(\"ima";
if (_images.getSize()>0) { 
_docdefinition.Put((Object)("images"),(Object)(_images.getObject()));};
 };
 //BA.debugLineNum = 601;BA.debugLine="mJSON = BANano.ToJson(docDefinition)";
_mjson = BA.ObjectToString(_banano.ToJson((Object)(_docdefinition.getObject())));
 //BA.debugLineNum = 602;BA.debugLine="mJSONPretty = BANano.RunJavascriptMethod(\"JSON.st";
_mjsonpretty = BA.ObjectToString(_banano.RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_docdefinition.getObject()),__c.Null,(Object)(4)})));
 //BA.debugLineNum = 604;BA.debugLine="Dim data As Object";
_data = new Object();
 //BA.debugLineNum = 605;BA.debugLine="Dim res As BANanoObject";
_res = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 606;BA.debugLine="Dim prom As BANanoPromise";
_prom = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 607;BA.debugLine="Select Case action";
switch (BA.switchObjectToInt(_action,"download","print","open","upload","getDataUrl","getBlob","getBuffer","getBase64")) {
case 0: {
 //BA.debugLineNum = 609;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("download",(Object)(_fname));
 break; }
case 1: {
 //BA.debugLineNum = 611;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("print",__c.Null);
 break; }
case 2: {
 //BA.debugLineNum = 613;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
_pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject())).RunMethod("open",__c.Null);
 break; }
case 3: {
 //BA.debugLineNum = 615;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = _pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject()));
 //BA.debugLineNum = 616;BA.debugLine="prom = res.RunMethod(\"getBlob\", data)";
_prom.setObject((java.lang.Object)(_res.RunMethod("getBlob",_data).getObject()));
 //BA.debugLineNum = 617;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
 //BA.debugLineNum = 618;BA.debugLine="BANano.CallSub(Me, \"forUpload\", data)";
_banano.CallSub(this,"forUpload",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 619;BA.debugLine="prom.End";
_prom.End();
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
 //BA.debugLineNum = 621;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
_res = _pdf.RunMethod("createPdf",(Object)(_docdefinition.getObject()));
 //BA.debugLineNum = 622;BA.debugLine="prom = res.RunMethod(action, data)";
_prom.setObject((java.lang.Object)(_res.RunMethod(_action,_data).getObject()));
 //BA.debugLineNum = 623;BA.debugLine="prom.Then(data)";
_prom.Then(_data);
 //BA.debugLineNum = 624;BA.debugLine="BANano.CallSub(Me, \"forReading\", data)";
_banano.CallSub(this,"forReading",(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 625;BA.debugLine="prom.End";
_prom.End();
 break; }
}
;
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return "";
}
public String  _forreading(Object _data) throws Exception{
 //BA.debugLineNum = 573;BA.debugLine="private Sub forReading(data As Object)";
 //BA.debugLineNum = 574;BA.debugLine="Log(\"PDFMaker.forReading\")";
__c.Log("PDFMaker.forReading");
 //BA.debugLineNum = 575;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, data)";
_banano.CallSub(_eventhandler,_eventmethod,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_data)));
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return "";
}
public String  _forupload(Object _data) throws Exception{
com.ab.banano.BANanoObject _formdata = null;
 //BA.debugLineNum = 579;BA.debugLine="private Sub forUpload(data As Object)";
 //BA.debugLineNum = 580;BA.debugLine="Log(\"PDFMaker.forUpload\")";
__c.Log("PDFMaker.forUpload");
 //BA.debugLineNum = 581;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 582;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 583;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(_fname)}));
 //BA.debugLineNum = 584;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, formDat";
_banano.CallSub(_eventhandler,_eventmethod,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_formdata.getObject())));
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _getbase64(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 658;BA.debugLine="Sub GetBase64(module As Object, methodName As Stri";
 //BA.debugLineNum = 659;BA.debugLine="Log(\"PDFMaker.GetNase64\")";
__c.Log("PDFMaker.GetNase64");
 //BA.debugLineNum = 660;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 661;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 662;BA.debugLine="action = \"getBase64\"";
_action = "getBase64";
 //BA.debugLineNum = 663;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 664;BA.debugLine="End Sub";
return "";
}
public String  _getblob(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 640;BA.debugLine="Sub GetBlob(module As Object, methodName As String";
 //BA.debugLineNum = 641;BA.debugLine="Log(\"PDFMaker.GetBlob\")";
__c.Log("PDFMaker.GetBlob");
 //BA.debugLineNum = 642;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 643;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 644;BA.debugLine="action = \"getBlob\"";
_action = "getBlob";
 //BA.debugLineNum = 645;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public String  _getbuffer(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 649;BA.debugLine="Sub GetBuffer(module As Object, methodName As Stri";
 //BA.debugLineNum = 650;BA.debugLine="Log(\"PDFMaker.GetBuffer\")";
__c.Log("PDFMaker.GetBuffer");
 //BA.debugLineNum = 651;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 652;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 653;BA.debugLine="action = \"getBuffer\"";
_action = "getBuffer";
 //BA.debugLineNum = 654;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 655;BA.debugLine="End Sub";
return "";
}
public String  _getdataurl(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Sub GetDataURL(module As Object, methodName As Str";
 //BA.debugLineNum = 632;BA.debugLine="Log(\"PDFMaker.GetDataURL\")";
__c.Log("PDFMaker.GetDataURL");
 //BA.debugLineNum = 633;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 634;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 635;BA.debugLine="action = \"getDataUrl\"";
_action = "getDataUrl";
 //BA.debugLineNum = 636;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return "";
}
public String  _getfilefromserver(String _filename) throws Exception{
com.ab.banano.BANanoFetchResponse _response = null;
com.ab.banano.BANanoObject _blob = null;
com.ab.banano.BANanoFetch _fetch1 = null;
com.ab.banano.BANanoObject _filereader = null;
com.ab.banano.BANanoEvent _event = null;
com.ab.banano.BANanoObject _target = null;
String _dataurl = "";
 //BA.debugLineNum = 538;BA.debugLine="private Sub GetFileFromServer(FileName As String)";
 //BA.debugLineNum = 539;BA.debugLine="Log(\"PDFMaker.GetFileFromServer\")";
__c.Log("PDFMaker.GetFileFromServer");
 //BA.debugLineNum = 540;BA.debugLine="Dim Response As BANanoFetchResponse";
_response = new com.ab.banano.BANanoFetchResponse();
 //BA.debugLineNum = 541;BA.debugLine="Dim Blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 544;BA.debugLine="Dim fetch1 As BANanoFetch";
_fetch1 = new com.ab.banano.BANanoFetch();
 //BA.debugLineNum = 545;BA.debugLine="fetch1.Initialize(FileName, Null)";
_fetch1.Initialize(_filename,(com.ab.banano.BANanoFetchOptions)(__c.Null));
 //BA.debugLineNum = 546;BA.debugLine="fetch1.Then(Response)";
_fetch1.Then((Object)(_response));
 //BA.debugLineNum = 548;BA.debugLine="fetch1.Return(Response.Blob)";
_fetch1.Return(_response.Blob());
 //BA.debugLineNum = 549;BA.debugLine="fetch1.Then(Blob)";
_fetch1.Then((Object)(_blob.getObject()));
 //BA.debugLineNum = 551;BA.debugLine="Dim FileReader As BANanoObject";
_filereader = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 552;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
_filereader.Initialize2("FileReader",__c.Null);
 //BA.debugLineNum = 553;BA.debugLine="Dim event As BANanoEvent";
_event = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 555;BA.debugLine="FileReader.AddEventListenerOpen(\"onload\", Array(e";
_filereader.AddEventListenerOpen("onload",(Object)(new Object[]{(Object)(_event)}));
 //BA.debugLineNum = 557;BA.debugLine="Dim Target As BANanoObject = event.OtherField(\"ta";
_target = new com.ab.banano.BANanoObject();
_target = _event.OtherField("target");
 //BA.debugLineNum = 558;BA.debugLine="Dim DataUrl As String = Target.GetField(\"result\")";
_dataurl = BA.ObjectToString(_target.GetField("result").Result());
 //BA.debugLineNum = 560;BA.debugLine="Blobs.Put(FileName, DataUrl)";
_blobs.Put((Object)(_filename),(Object)(_dataurl));
 //BA.debugLineNum = 562;BA.debugLine="If Blobs.Size = NumFiles Then";
if (_blobs.getSize()==_numfiles) { 
 //BA.debugLineNum = 563;BA.debugLine="FilesAreReady";
_filesareready();
 };
 //BA.debugLineNum = 566;BA.debugLine="FileReader.CloseEventListener";
_filereader.CloseEventListener();
 //BA.debugLineNum = 568;BA.debugLine="FileReader.RunMethod(\"readAsDataURL\", Blob)";
_filereader.RunMethod("readAsDataURL",(Object)(_blob.getObject()));
 //BA.debugLineNum = 569;BA.debugLine="fetch1.End ' always end a fetch with this!";
_fetch1.End();
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _getformdata(Object _data,String _filename) throws Exception{
com.ab.banano.BANanoObject _formdata = null;
 //BA.debugLineNum = 677;BA.debugLine="Sub GetFormData(data As Object, fileName As String";
 //BA.debugLineNum = 678;BA.debugLine="Log(\"PDFMaker.GetFormData\")";
__c.Log("PDFMaker.GetFormData");
 //BA.debugLineNum = 679;BA.debugLine="Dim formData As BANanoObject";
_formdata = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 680;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
_formdata.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 681;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
_formdata.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_data,(Object)(_filename)}));
 //BA.debugLineNum = 682;BA.debugLine="Return formData";
if (true) return _formdata;
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public String  _getjson() throws Exception{
 //BA.debugLineNum = 475;BA.debugLine="Sub getJSON As String";
 //BA.debugLineNum = 476;BA.debugLine="Log(\"PDFMaker.getJSON\")";
__c.Log("PDFMaker.getJSON");
 //BA.debugLineNum = 477;BA.debugLine="Return mJSON";
if (true) return _mjson;
 //BA.debugLineNum = 478;BA.debugLine="End Sub";
return "";
}
public String  _getjsonpretty() throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub getJSONPretty As String";
 //BA.debugLineNum = 481;BA.debugLine="Return mJSONPretty";
if (true) return _mjsonpretty;
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _getstyle(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
String _name = "";
boolean _bold = false;
boolean _italics = false;
String _alignment = "";
int _fontsize = 0;
int _marginleft = 0;
int _margintop = 0;
int _marginright = 0;
int _marginbottom = 0;
boolean _noborder = false;
boolean _borderleft = false;
boolean _bordertop = false;
boolean _borderright = false;
boolean _borderbottom = false;
int _width = 0;
int _height = 0;
String _color = "";
String _fillcolor = "";
String _background = "";
double _opacity = 0;
int _angle = 0;
int _columngap = 0;
String _decoration = "";
String _decorationstyle = "";
String _decorationcolor = "";
boolean _applymargins = false;
boolean _applyborders = false;
b4j.example.pdfstyle _st = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub GetStyle(rec As Map) As PDFStyle";
 //BA.debugLineNum = 110;BA.debugLine="Log(\"PDFMaker.GetStyle\")";
__c.Log("PDFMaker.GetStyle");
 //BA.debugLineNum = 111;BA.debugLine="Dim name As String = rec.Get(\"name\")";
_name = BA.ObjectToString(_rec.Get((Object)("name")));
 //BA.debugLineNum = 112;BA.debugLine="Dim bold As Boolean = rec.get(\"bold\")";
_bold = BA.ObjectToBoolean(_rec.Get((Object)("bold")));
 //BA.debugLineNum = 113;BA.debugLine="Dim italics As Boolean = rec.Get(\"italics\")";
_italics = BA.ObjectToBoolean(_rec.Get((Object)("italics")));
 //BA.debugLineNum = 114;BA.debugLine="Dim alignment As String = rec.Get(\"alignment\")";
_alignment = BA.ObjectToString(_rec.Get((Object)("alignment")));
 //BA.debugLineNum = 115;BA.debugLine="Dim fontSize As Int = rec.Get(\"fontSize\")";
_fontsize = (int)(BA.ObjectToNumber(_rec.Get((Object)("fontSize"))));
 //BA.debugLineNum = 116;BA.debugLine="Dim marginleft As Int = rec.Get(\"marginleft\")";
_marginleft = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginleft"))));
 //BA.debugLineNum = 117;BA.debugLine="Dim margintop As Int = rec.Get(\"margintop\")";
_margintop = (int)(BA.ObjectToNumber(_rec.Get((Object)("margintop"))));
 //BA.debugLineNum = 118;BA.debugLine="Dim marginright As Int = rec.Get(\"marginright\")";
_marginright = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginright"))));
 //BA.debugLineNum = 119;BA.debugLine="Dim marginbottom As Int = rec.Get(\"marginbottom\")";
_marginbottom = (int)(BA.ObjectToNumber(_rec.Get((Object)("marginbottom"))));
 //BA.debugLineNum = 120;BA.debugLine="Dim noborder As Boolean = rec.Get(\"noborder\")";
_noborder = BA.ObjectToBoolean(_rec.Get((Object)("noborder")));
 //BA.debugLineNum = 121;BA.debugLine="Dim borderleft As Boolean = rec.get(\"borderleft\")";
_borderleft = BA.ObjectToBoolean(_rec.Get((Object)("borderleft")));
 //BA.debugLineNum = 122;BA.debugLine="Dim bordertop As Boolean = rec.get(\"bordertop\")";
_bordertop = BA.ObjectToBoolean(_rec.Get((Object)("bordertop")));
 //BA.debugLineNum = 123;BA.debugLine="Dim borderright As Boolean = rec.get(\"borderright";
_borderright = BA.ObjectToBoolean(_rec.Get((Object)("borderright")));
 //BA.debugLineNum = 124;BA.debugLine="Dim borderbottom As Boolean = rec.get(\"borderbott";
_borderbottom = BA.ObjectToBoolean(_rec.Get((Object)("borderbottom")));
 //BA.debugLineNum = 125;BA.debugLine="Dim width As Int = rec.Get(\"width\")";
_width = (int)(BA.ObjectToNumber(_rec.Get((Object)("width"))));
 //BA.debugLineNum = 126;BA.debugLine="Dim height As Int = rec.get(\"height\")";
_height = (int)(BA.ObjectToNumber(_rec.Get((Object)("height"))));
 //BA.debugLineNum = 127;BA.debugLine="Dim color As String = rec.Get(\"color\")";
_color = BA.ObjectToString(_rec.Get((Object)("color")));
 //BA.debugLineNum = 128;BA.debugLine="Dim fillColor As String = rec.get(\"fillColor\")";
_fillcolor = BA.ObjectToString(_rec.Get((Object)("fillColor")));
 //BA.debugLineNum = 129;BA.debugLine="Dim background As String = rec.Get(\"background\")";
_background = BA.ObjectToString(_rec.Get((Object)("background")));
 //BA.debugLineNum = 130;BA.debugLine="Dim opacity As Double = rec.Get(\"opacity\")";
_opacity = (double)(BA.ObjectToNumber(_rec.Get((Object)("opacity"))));
 //BA.debugLineNum = 131;BA.debugLine="Dim angle As Int = rec.get(\"angle\")";
_angle = (int)(BA.ObjectToNumber(_rec.Get((Object)("angle"))));
 //BA.debugLineNum = 132;BA.debugLine="Dim columnGap As Int = rec.get(\"columnGap\")";
_columngap = (int)(BA.ObjectToNumber(_rec.Get((Object)("columnGap"))));
 //BA.debugLineNum = 133;BA.debugLine="Dim decoration As String = rec.Get(\"decoration\")";
_decoration = BA.ObjectToString(_rec.Get((Object)("decoration")));
 //BA.debugLineNum = 134;BA.debugLine="If decoration = \"none\" Then decoration = \"\"";
if ((_decoration).equals("none")) { 
_decoration = "";};
 //BA.debugLineNum = 135;BA.debugLine="Dim decorationStyle As String = rec.Get(\"decorati";
_decorationstyle = BA.ObjectToString(_rec.Get((Object)("decorationStyle")));
 //BA.debugLineNum = 136;BA.debugLine="If decorationStyle = \"none\" Then decorationStyle";
if ((_decorationstyle).equals("none")) { 
_decorationstyle = "";};
 //BA.debugLineNum = 137;BA.debugLine="Dim decorationColor As String = rec.Get(\"decorati";
_decorationcolor = BA.ObjectToString(_rec.Get((Object)("decorationColor")));
 //BA.debugLineNum = 138;BA.debugLine="Dim applymargins As Boolean = rec.Get(\"applymargi";
_applymargins = BA.ObjectToBoolean(_rec.Get((Object)("applymargins")));
 //BA.debugLineNum = 139;BA.debugLine="Dim applyborders As Boolean = rec.Get(\"applyborde";
_applyborders = BA.ObjectToBoolean(_rec.Get((Object)("applyborders")));
 //BA.debugLineNum = 141;BA.debugLine="Dim st As PDFStyle";
_st = new b4j.example.pdfstyle();
 //BA.debugLineNum = 142;BA.debugLine="st.Initialize";
_st._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 143;BA.debugLine="st.SetName(name)";
_st._setname /*b4j.example.pdfstyle*/ (_name);
 //BA.debugLineNum = 144;BA.debugLine="st.SetBold(bold)";
_st._setbold /*b4j.example.pdfstyle*/ (_bold);
 //BA.debugLineNum = 145;BA.debugLine="st.SetItalics(italics)";
_st._setitalics /*b4j.example.pdfstyle*/ (_italics);
 //BA.debugLineNum = 146;BA.debugLine="Select Case alignment";
switch (BA.switchObjectToInt(_alignment,"alignmentRight","alignmentCenter","alignmentJustify")) {
case 0: {
 //BA.debugLineNum = 148;BA.debugLine="st.alignmentRight = True";
_st._alignmentright /*boolean*/  = __c.True;
 break; }
case 1: {
 //BA.debugLineNum = 150;BA.debugLine="st.alignmentCenter = True";
_st._alignmentcenter /*boolean*/  = __c.True;
 break; }
case 2: {
 //BA.debugLineNum = 152;BA.debugLine="st.alignmentJustify = True";
_st._alignmentjustify /*boolean*/  = __c.True;
 break; }
}
;
 //BA.debugLineNum = 154;BA.debugLine="st.SetFontSize(fontSize)";
_st._setfontsize /*b4j.example.pdfstyle*/ (_fontsize);
 //BA.debugLineNum = 155;BA.debugLine="If applymargins Then";
if (_applymargins) { 
 //BA.debugLineNum = 156;BA.debugLine="st.SetMargin(marginleft, margintop, marginright,";
_st._setmargin /*b4j.example.pdfstyle*/ (_marginleft,_margintop,_marginright,_marginbottom);
 };
 //BA.debugLineNum = 158;BA.debugLine="If noborder Then";
if (_noborder) { 
 //BA.debugLineNum = 159;BA.debugLine="st.NoBorder";
_st._noborder /*b4j.example.pdfstyle*/ ();
 }else {
 //BA.debugLineNum = 161;BA.debugLine="If applyborders Then";
if (_applyborders) { 
 //BA.debugLineNum = 162;BA.debugLine="st.SetBorder(borderleft, bordertop, borderright";
_st._setborder /*b4j.example.pdfstyle*/ (_borderleft,_bordertop,_borderright,_borderbottom);
 };
 };
 //BA.debugLineNum = 165;BA.debugLine="st.SetWidth(width)";
_st._setwidth /*b4j.example.pdfstyle*/ (_width);
 //BA.debugLineNum = 166;BA.debugLine="st.setheight(height)";
_st._setheight /*b4j.example.pdfstyle*/ (_height);
 //BA.debugLineNum = 167;BA.debugLine="st.SetColor(color)";
_st._setcolor /*b4j.example.pdfstyle*/ (_color);
 //BA.debugLineNum = 168;BA.debugLine="st.SetFillColor(fillColor)";
_st._setfillcolor /*b4j.example.pdfstyle*/ (_fillcolor);
 //BA.debugLineNum = 169;BA.debugLine="st.setbackground(background)";
_st._setbackground /*b4j.example.pdfstyle*/ (_background);
 //BA.debugLineNum = 170;BA.debugLine="st.SetOpacity(opacity)";
_st._setopacity /*b4j.example.pdfstyle*/ (_opacity);
 //BA.debugLineNum = 171;BA.debugLine="st.SetAngle(angle)";
_st._setangle /*b4j.example.pdfstyle*/ (_angle);
 //BA.debugLineNum = 172;BA.debugLine="st.SetColumnGap(columnGap)";
_st._setcolumngap /*b4j.example.pdfstyle*/ (_columngap);
 //BA.debugLineNum = 173;BA.debugLine="st.SetDecoration(decoration)";
_st._setdecoration /*b4j.example.pdfstyle*/ (_decoration);
 //BA.debugLineNum = 174;BA.debugLine="st.SetDecorationStyle(decorationStyle)";
_st._setdecorationstyle /*b4j.example.pdfstyle*/ (_decorationstyle);
 //BA.debugLineNum = 175;BA.debugLine="st.SetDecorationColor(decorationColor)";
_st._setdecorationcolor /*b4j.example.pdfstyle*/ (_decorationcolor);
 //BA.debugLineNum = 176;BA.debugLine="Return st";
if (true) return _st;
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize As PDFMaker";
 //BA.debugLineNum = 36;BA.debugLine="Log(\"PDFMaker.Initialize\")";
__c.Log("PDFMaker.Initialize");
 //BA.debugLineNum = 37;BA.debugLine="pdf.Initialize(\"pdfMake\")";
_pdf.Initialize((Object)("pdfMake"));
 //BA.debugLineNum = 38;BA.debugLine="Blobs.Initialize";
_blobs.Initialize();
 //BA.debugLineNum = 39;BA.debugLine="styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 40;BA.debugLine="docDefinition.Initialize";
_docdefinition.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="content.Initialize";
_content.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="defaultStyle.Initialize";
_defaultstyle._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 43;BA.debugLine="defaultStyle.name = \"defaultStyle\"";
_defaultstyle._name /*String*/  = "defaultStyle";
 //BA.debugLineNum = 44;BA.debugLine="pageSize = Null";
_pagesize = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 45;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 46;BA.debugLine="title = Null";
_title = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 47;BA.debugLine="author = Null";
_author = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 48;BA.debugLine="subject = Null";
_subject = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 49;BA.debugLine="keywords = Null";
_keywords = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 50;BA.debugLine="creator = Null";
_creator = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 51;BA.debugLine="producer = Null";
_producer = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 52;BA.debugLine="info.Initialize";
_info.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="compress = Null";
_compress = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 54;BA.debugLine="security.Initialize";
_security._initialize /*String*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="files.Initialize";
_files.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="images.Initialize";
_images.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="fileKeys.Initialize";
_filekeys.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="mJSON = \"\"";
_mjson = "";
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public String  _open() throws Exception{
 //BA.debugLineNum = 530;BA.debugLine="Sub Open";
 //BA.debugLineNum = 531;BA.debugLine="Log(\"PDFMaker.Open\")";
__c.Log("PDFMaker.Open");
 //BA.debugLineNum = 532;BA.debugLine="action = \"open\"";
_action = "open";
 //BA.debugLineNum = 533;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 534;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _preload(String _key,String _url) throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="Sub Preload(key As String, url As String) As PDFMa";
 //BA.debugLineNum = 244;BA.debugLine="Log(\"PDFMaker.Preload\")";
__c.Log("PDFMaker.Preload");
 //BA.debugLineNum = 245;BA.debugLine="files.Put(key, url)";
_files.Put((Object)(_key),(Object)(_url));
 //BA.debugLineNum = 246;BA.debugLine="fileKeys.Put(url, key)";
_filekeys.Put((Object)(_url),(Object)(_key));
 //BA.debugLineNum = 248;BA.debugLine="NumFiles = files.size";
_numfiles = _files.getSize();
 //BA.debugLineNum = 249;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public String  _print() throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Sub Print";
 //BA.debugLineNum = 524;BA.debugLine="Log(\"PDFMaker.Print\")";
__c.Log("PDFMaker.Print");
 //BA.debugLineNum = 525;BA.debugLine="action = \"print\"";
_action = "print";
 //BA.debugLineNum = 526;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 527;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setauthor(String _sauthor) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetAuthor(sauthor As String) As PDFMaker";
 //BA.debugLineNum = 215;BA.debugLine="Log(\"PDFMaker.SetAuthor\")";
__c.Log("PDFMaker.SetAuthor");
 //BA.debugLineNum = 216;BA.debugLine="If sauthor = \"\" Then Return Me";
if ((_sauthor).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 217;BA.debugLine="author = sauthor";
_author = _sauthor;
 //BA.debugLineNum = 218;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setbackground(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub SetBackground(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 324;BA.debugLine="Log(\"PDFMaker.SetBackground\")";
__c.Log("PDFMaker.SetBackground");
 //BA.debugLineNum = 325;BA.debugLine="docDefinition.Put(\"background\", wm.Content)";
_docdefinition.Put((Object)("background"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcompress(boolean _bcompress) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetCompress(bcompress As Boolean) As PDFMaker";
 //BA.debugLineNum = 188;BA.debugLine="Log(\"PDFMaker.SetCompress\")";
__c.Log("PDFMaker.SetCompress");
 //BA.debugLineNum = 189;BA.debugLine="compress = bcompress";
_compress = _bcompress;
 //BA.debugLineNum = 190;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 191;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setcreator(String _screator) throws Exception{
 //BA.debugLineNum = 193;BA.debugLine="Sub SetCreator(screator As String) As PDFMaker";
 //BA.debugLineNum = 194;BA.debugLine="Log(\"PDFMaker.SetCreator\")";
__c.Log("PDFMaker.SetCreator");
 //BA.debugLineNum = 195;BA.debugLine="If screator = \"\" Then Return Me";
if ((_screator).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 196;BA.debugLine="creator = screator";
_creator = _screator;
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public String  _setdefaultstyle(anywheresoftware.b4a.objects.collections.Map _ds) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetDefaultStyle(ds As Map)";
 //BA.debugLineNum = 92;BA.debugLine="Log(\"PDFMaker.SetDefaultStyle\")";
__c.Log("PDFMaker.SetDefaultStyle");
 //BA.debugLineNum = 93;BA.debugLine="If ds.IsInitialized Then";
if (_ds.IsInitialized()) { 
 //BA.debugLineNum = 94;BA.debugLine="ds.Put(\"name\", \"defaultStyle\")";
_ds.Put((Object)("name"),(Object)("defaultStyle"));
 //BA.debugLineNum = 95;BA.debugLine="defaultStyle = GetStyle(ds)";
_defaultstyle = _getstyle(_ds);
 };
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _setdocumentproperties(anywheresoftware.b4a.objects.collections.Map _docprops) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetDocumentProperties(docprops As Map)";
 //BA.debugLineNum = 64;BA.debugLine="Log(\"PDFMaker.SetDocumentProperties\")";
__c.Log("PDFMaker.SetDocumentProperties");
 //BA.debugLineNum = 65;BA.debugLine="SetAuthor(docprops.Get(\"author\"))";
_setauthor(BA.ObjectToString(_docprops.Get((Object)("author"))));
 //BA.debugLineNum = 66;BA.debugLine="SetTitle(docprops.Get(\"title\"))";
_settitle(BA.ObjectToString(_docprops.Get((Object)("title"))));
 //BA.debugLineNum = 67;BA.debugLine="SetSubject(docprops.Get(\"subject\"))";
_setsubject(BA.ObjectToString(_docprops.Get((Object)("subject"))));
 //BA.debugLineNum = 68;BA.debugLine="SetKeywords(docprops.Get(\"keywords\"))";
_setkeywords(BA.ObjectToString(_docprops.Get((Object)("keywords"))));
 //BA.debugLineNum = 69;BA.debugLine="SetCreator(docprops.Get(\"creator\"))";
_setcreator(BA.ObjectToString(_docprops.Get((Object)("creator"))));
 //BA.debugLineNum = 70;BA.debugLine="SetProducer(docprops.Get(\"producer\"))";
_setproducer(BA.ObjectToString(_docprops.Get((Object)("producer"))));
 //BA.debugLineNum = 71;BA.debugLine="SetCompress(docprops.Get(\"compress\"))";
_setcompress(BA.ObjectToBoolean(_docprops.Get((Object)("compress"))));
 //BA.debugLineNum = 72;BA.debugLine="security.Set(\"userPassword\", docprops.Get(\"userPa";
_security._set /*String*/ ("userPassword",_docprops.Get((Object)("userPassword")));
 //BA.debugLineNum = 73;BA.debugLine="security.Set(\"ownerPassword\", docprops.Get(\"owner";
_security._set /*String*/ ("ownerPassword",_docprops.Get((Object)("ownerPassword")));
 //BA.debugLineNum = 74;BA.debugLine="security.Set(\"modifying\", docprops.Get(\"modifying";
_security._set /*String*/ ("modifying",_docprops.Get((Object)("modifying")));
 //BA.debugLineNum = 75;BA.debugLine="security.Set(\"copying\", docprops.Get(\"copying\"))";
_security._set /*String*/ ("copying",_docprops.Get((Object)("copying")));
 //BA.debugLineNum = 76;BA.debugLine="security.Set(\"annotating\", docprops.Get(\"annotati";
_security._set /*String*/ ("annotating",_docprops.Get((Object)("annotating")));
 //BA.debugLineNum = 77;BA.debugLine="security.Set(\"fillingForms\", docprops.Get(\"fillin";
_security._set /*String*/ ("fillingForms",_docprops.Get((Object)("fillingForms")));
 //BA.debugLineNum = 78;BA.debugLine="security.Set(\"contentAccessibility\", docprops.Get";
_security._set /*String*/ ("contentAccessibility",_docprops.Get((Object)("contentAccessibility")));
 //BA.debugLineNum = 79;BA.debugLine="security.Set(\"documentAssembly\", docprops.Get(\"do";
_security._set /*String*/ ("documentAssembly",_docprops.Get((Object)("documentAssembly")));
 //BA.debugLineNum = 80;BA.debugLine="security.Set(\"printing\", docprops.Get(\"printing\")";
_security._set /*String*/ ("printing",_docprops.Get((Object)("printing")));
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setheader(b4j.example.pdftext _hdr) throws Exception{
 //BA.debugLineNum = 330;BA.debugLine="Sub SetHeader(hdr As PDFText) As PDFMaker";
 //BA.debugLineNum = 331;BA.debugLine="Log(\"PDFMaker.SetHeader\")";
__c.Log("PDFMaker.SetHeader");
 //BA.debugLineNum = 332;BA.debugLine="docDefinition.Put(\"header\", hdr.content)";
_docdefinition.Put((Object)("header"),(Object)(_hdr._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 333;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setkeywords(String _skeywords) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetKeywords(skeywords As String) As PDFMaker";
 //BA.debugLineNum = 201;BA.debugLine="Log(\"PDFMaker.SetKeywords\")";
__c.Log("PDFMaker.SetKeywords");
 //BA.debugLineNum = 202;BA.debugLine="If skeywords = \"\" Then Return Me";
if ((_skeywords).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 203;BA.debugLine="keywords = skeywords";
_keywords = _skeywords;
 //BA.debugLineNum = 204;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagemargins(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 268;BA.debugLine="Sub SetPageMargins(l As Int, t As Int, r As Int, b";
 //BA.debugLineNum = 269;BA.debugLine="Log(\"PDFMaker.SetPageMargins\")";
__c.Log("PDFMaker.SetPageMargins");
 //BA.debugLineNum = 270;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 271;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 272;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 273;BA.debugLine="docDefinition.Put(\"pageMargins\", margin)";
_docdefinition.Put((Object)("pageMargins"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 274;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 235;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 236;BA.debugLine="Log(\"PDFMaker.SetPageOrientation\")";
__c.Log("PDFMaker.SetPageOrientation");
 //BA.debugLineNum = 237;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 238;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setpagesize(String _spagesize) throws Exception{
 //BA.debugLineNum = 228;BA.debugLine="Sub SetPageSize(spageSize As String) As PDFMaker";
 //BA.debugLineNum = 229;BA.debugLine="Log(\"PDFMaker.SetPageSize\")";
__c.Log("PDFMaker.SetPageSize");
 //BA.debugLineNum = 230;BA.debugLine="If spageSize = \"\" Then Return Me";
if ((_spagesize).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 231;BA.debugLine="pageSize = spageSize";
_pagesize = _spagesize;
 //BA.debugLineNum = 232;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setproducer(String _sproducer) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetProducer(sproducer As String) As PDFMaker";
 //BA.debugLineNum = 181;BA.debugLine="Log(\"PDFMaker.SetProducer\")";
__c.Log("PDFMaker.SetProducer");
 //BA.debugLineNum = 182;BA.debugLine="If sproducer = \"\" Then Return Me";
if ((_sproducer).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 183;BA.debugLine="producer = sproducer";
_producer = _sproducer;
 //BA.debugLineNum = 184;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setprogresscallback(Object _module,String _methodname,anywheresoftware.b4a.objects.collections.List _params) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 84;BA.debugLine="Sub SetProgressCallback(module As Object, methodNa";
 //BA.debugLineNum = 85;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,_params)));
 //BA.debugLineNum = 86;BA.debugLine="docDefinition.Put(\"progressCallback\", cb)";
_docdefinition.Put((Object)("progressCallback"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public String  _setstyles(anywheresoftware.b4a.objects.collections.Map _allstyles) throws Exception{
String _sk = "";
anywheresoftware.b4a.objects.collections.Map _sv = null;
b4j.example.pdfstyle _ts = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub SetStyles(allStyles As Map)";
 //BA.debugLineNum = 100;BA.debugLine="Log(\"PDFMaker.SetStyles\")";
__c.Log("PDFMaker.SetStyles");
 //BA.debugLineNum = 101;BA.debugLine="For Each sk As String In allStyles.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _allstyles.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_sk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 102;BA.debugLine="Dim sv As Map = allStyles.Get(sk)";
_sv = new anywheresoftware.b4a.objects.collections.Map();
_sv.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_allstyles.Get((Object)(_sk))));
 //BA.debugLineNum = 103;BA.debugLine="Dim ts As PDFStyle = GetStyle(sv)";
_ts = _getstyle(_sv);
 //BA.debugLineNum = 104;BA.debugLine="AddStyle(ts)";
_addstyle(_ts);
 }
};
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfmaker  _setsubject(String _ssubject) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub SetSubject(ssubject As String) As PDFMaker";
 //BA.debugLineNum = 208;BA.debugLine="Log(\"PDFMaker.SetSubject\")";
__c.Log("PDFMaker.SetSubject");
 //BA.debugLineNum = 209;BA.debugLine="If ssubject = \"\" Then Return Me";
if ((_ssubject).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 210;BA.debugLine="subject = ssubject";
_subject = _ssubject;
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _settitle(String _stitle) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetTitle(stitle As String) As PDFMaker";
 //BA.debugLineNum = 222;BA.debugLine="Log(\"PDFMaker.SetTitle\")";
__c.Log("PDFMaker.SetTitle");
 //BA.debugLineNum = 223;BA.debugLine="If stitle = \"\" Then Return Me";
if ((_stitle).equals("")) { 
if (true) return (b4j.example.pdfmaker)(this);};
 //BA.debugLineNum = 224;BA.debugLine="title = stitle";
_title = _stitle;
 //BA.debugLineNum = 225;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 226;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfmaker  _setwatermark(b4j.example.pdftext _wm) throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetWaterMark(wm As PDFText) As PDFMaker";
 //BA.debugLineNum = 317;BA.debugLine="Log(\"PDFMaker.SetWaterMark\")";
__c.Log("PDFMaker.SetWaterMark");
 //BA.debugLineNum = 318;BA.debugLine="docDefinition.Put(\"watermark\", wm.Content)";
_docdefinition.Put((Object)("watermark"),(Object)(_wm._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 319;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfmaker)(this);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public String  _upload(Object _module,String _methodname,String _filename) throws Exception{
 //BA.debugLineNum = 667;BA.debugLine="Sub Upload(module As Object, methodName As String,";
 //BA.debugLineNum = 668;BA.debugLine="Log(\"PDFMaker.Upload\")";
__c.Log("PDFMaker.Upload");
 //BA.debugLineNum = 669;BA.debugLine="eventHandler = module";
_eventhandler = _module;
 //BA.debugLineNum = 670;BA.debugLine="eventMethod = methodName.tolowercase";
_eventmethod = _methodname.toLowerCase();
 //BA.debugLineNum = 671;BA.debugLine="fName = fileName";
_fname = _filename;
 //BA.debugLineNum = 672;BA.debugLine="action = \"upload\"";
_action = "upload";
 //BA.debugLineNum = 673;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 674;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "FORREADING"))
	return _forreading((Object) args[0]);
if (BA.fastSubCompare(sub, "FORUPLOAD"))
	return _forupload((Object) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
