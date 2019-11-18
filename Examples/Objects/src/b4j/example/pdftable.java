package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdftable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _layout = "";
public boolean _lighthorizontallines = false;
public boolean _noborders = false;
public boolean _headerlineonly = false;
public int _headerrows = 0;
public anywheresoftware.b4a.objects.collections.Map _table = null;
public anywheresoftware.b4a.objects.collections.List _widths = null;
public anywheresoftware.b4a.objects.collections.List _heights = null;
public anywheresoftware.b4a.objects.collections.List _hdr = null;
public anywheresoftware.b4a.objects.collections.List _body = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public b4j.example.pdfstyle _style = null;
public String _pageorientation = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdftable  _addcolumn(String _colname,Object _colwidth,Object _colheight) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Sub AddColumn(colName As String, colWidth As Objec";
 //BA.debugLineNum = 78;BA.debugLine="hdr.Add(colName)";
_hdr.Add((Object)(_colname));
 //BA.debugLineNum = 79;BA.debugLine="If colWidth <> Null Then widths.Add(colWidth)";
if (_colwidth!= null) { 
_widths.Add(_colwidth);};
 //BA.debugLineNum = 80;BA.debugLine="If colHeight <> Null Then heights.Add(colHeight)";
if (_colheight!= null) { 
_heights.Add(_colheight);};
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrow(anywheresoftware.b4a.objects.collections.List _rowdata) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub AddRow(rowData As List) As PDFTable";
 //BA.debugLineNum = 86;BA.debugLine="rows.Add(rowData)";
_rows.Add((Object)(_rowdata.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrow1(b4j.example.pdfrow _row) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub AddRow1(row As PDFRow) As PDFTable";
 //BA.debugLineNum = 92;BA.debugLine="rows.Add(row.Content)";
_rows.Add((Object)(_row._getcontent /*anywheresoftware.b4a.objects.collections.List*/ ().getObject()));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrowtexts(anywheresoftware.b4a.objects.collections.List _rowdata) throws Exception{
b4j.example.pdfrow _trow = null;
b4j.example.pdftext _txt = null;
 //BA.debugLineNum = 97;BA.debugLine="Sub AddRowTexts(rowData As List) As PDFTable";
 //BA.debugLineNum = 98;BA.debugLine="Dim trow As PDFRow";
_trow = new b4j.example.pdfrow();
 //BA.debugLineNum = 99;BA.debugLine="trow.Initialize";
_trow._initialize /*b4j.example.pdfrow*/ (ba);
 //BA.debugLineNum = 100;BA.debugLine="For Each txt As PDFText In rowData";
{
final anywheresoftware.b4a.BA.IterableList group3 = _rowdata;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_txt = (b4j.example.pdftext)(group3.Get(index3));
 //BA.debugLineNum = 101;BA.debugLine="trow.AddText(txt)";
_trow._addtext /*b4j.example.pdfrow*/ (_txt);
 }
};
 //BA.debugLineNum = 103;BA.debugLine="AddRow1(trow)";
_addrow1(_trow);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private layout As String";
_layout = "";
 //BA.debugLineNum = 5;BA.debugLine="Public lightHorizontalLines As Boolean";
_lighthorizontallines = false;
 //BA.debugLineNum = 6;BA.debugLine="Public noBorders As Boolean";
_noborders = false;
 //BA.debugLineNum = 7;BA.debugLine="Public headerLineOnly As Boolean";
_headerlineonly = false;
 //BA.debugLineNum = 8;BA.debugLine="Public headerRows As Int";
_headerrows = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private table As Map";
_table = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private widths As List";
_widths = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Private heights As List";
_heights = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private hdr As List";
_hdr = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Private body As List";
_body = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Private rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 16;BA.debugLine="Private pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 133;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 134;BA.debugLine="If lightHorizontalLines <> Null Then options.Put(";
if (_lighthorizontallines!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("layout"),(Object)("lightHorizontalLines"));};
 //BA.debugLineNum = 135;BA.debugLine="If noBorders <> Null Then options.Put(\"layout\", \"";
if (_noborders!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("layout"),(Object)("noBorders"));};
 //BA.debugLineNum = 136;BA.debugLine="If headerLineOnly <> Null Then options.Put(\"layou";
if (_headerlineonly!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("layout"),(Object)("headerLineOnly"));};
 //BA.debugLineNum = 138;BA.debugLine="If headerRows <> Null Then table.Put(\"headerRows\"";
if (_headerrows!=(double)(BA.ObjectToNumber(__c.Null))) { 
_table.Put((Object)("headerRows"),(Object)(_headerrows));};
 //BA.debugLineNum = 139;BA.debugLine="If widths.Size > 0 Then table.Put(\"widths\", width";
if (_widths.getSize()>0) { 
_table.Put((Object)("widths"),(Object)(_widths.getObject()));};
 //BA.debugLineNum = 140;BA.debugLine="If heights.Size > 0 Then table.Put(\"heights\", hei";
if (_heights.getSize()>0) { 
_table.Put((Object)("heights"),(Object)(_heights.getObject()));};
 //BA.debugLineNum = 142;BA.debugLine="If hdr.Size > 0 Then body.Add(hdr)";
if (_hdr.getSize()>0) { 
_body.Add((Object)(_hdr.getObject()));};
 //BA.debugLineNum = 143;BA.debugLine="For Each lst As List In rows";
_lst = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group8 = _rows;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_lst.setObject((java.util.List)(group8.Get(index8)));
 //BA.debugLineNum = 144;BA.debugLine="body.Add(lst)";
_body.Add((Object)(_lst.getObject()));
 }
};
 //BA.debugLineNum = 146;BA.debugLine="table.Put(\"body\", body)";
_table.Put((Object)("body"),(Object)(_body.getObject()));
 //BA.debugLineNum = 147;BA.debugLine="options.Put(\"table\", table)";
_options.Put((Object)("table"),(Object)(_table.getObject()));
 //BA.debugLineNum = 148;BA.debugLine="style.Include(options)";
_style._include /*String*/ (_options);
 //BA.debugLineNum = 149;BA.debugLine="Return options";
if (true) return _options;
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize As PDFTable";
 //BA.debugLineNum = 21;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="lightHorizontalLines = Null";
_lighthorizontallines = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 23;BA.debugLine="headerLineOnly = Null";
_headerlineonly = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 24;BA.debugLine="noBorders = Null";
_noborders = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="headerRows = Null";
_headerrows = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 26;BA.debugLine="pageOrientation = \"\"";
_pageorientation = "";
 //BA.debugLineNum = 27;BA.debugLine="table.Initialize";
_table.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="widths.Initialize";
_widths.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="hdr.Initialize";
_hdr.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="body.Initialize";
_body.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 43;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 44;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 45;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 46;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 47;BA.debugLine="options.Put(\"absolutePosition\", opt)";
_options.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setcolumnnames(anywheresoftware.b4a.objects.collections.List _names) throws Exception{
String _k = "";
 //BA.debugLineNum = 69;BA.debugLine="Sub SetColumnNames(names As List) As PDFTable";
 //BA.debugLineNum = 70;BA.debugLine="For Each k As String In names";
{
final anywheresoftware.b4a.BA.IterableList group1 = _names;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 71;BA.debugLine="hdr.Add(k)";
_hdr.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setheaderrows(int _iheaderrows) throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Sub SetHeaderRows(iheaderRows As Int) As PDFTable";
 //BA.debugLineNum = 37;BA.debugLine="If iheaderRows = 0 Then Return Me";
if (_iheaderrows==0) { 
if (true) return (b4j.example.pdftable)(this);};
 //BA.debugLineNum = 38;BA.debugLine="headerRows = iheaderRows";
_headerrows = _iheaderrows;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setheights(anywheresoftware.b4a.objects.collections.List _h) throws Exception{
String _k = "";
 //BA.debugLineNum = 61;BA.debugLine="Sub SetHeights(h As List) As PDFTable";
 //BA.debugLineNum = 62;BA.debugLine="For Each k As String In h";
{
final anywheresoftware.b4a.BA.IterableList group1 = _h;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 63;BA.debugLine="heights.Add(k)";
_heights.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setid(String _sid) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetID(sid As String) As PDFTable";
 //BA.debugLineNum = 120;BA.debugLine="options.Put(\"id\", sid)";
_options.Put((Object)("id"),(Object)(_sid));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub SetPageBreakAfter As PDFTable";
 //BA.debugLineNum = 115;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
_options.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetPageBreakBefore As PDFTable";
 //BA.debugLineNum = 109;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
_options.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 126;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdftable)(this);};
 //BA.debugLineNum = 127;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setwidths(anywheresoftware.b4a.objects.collections.List _w) throws Exception{
String _k = "";
 //BA.debugLineNum = 53;BA.debugLine="Sub SetWidths(w As List) As PDFTable";
 //BA.debugLineNum = 54;BA.debugLine="For Each k As String In w";
{
final anywheresoftware.b4a.BA.IterableList group1 = _w;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 55;BA.debugLine="widths.Add(k)";
_widths.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
