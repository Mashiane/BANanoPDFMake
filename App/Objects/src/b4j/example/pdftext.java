package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdftext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _contentint = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _textint = null;
public String _link = "";
public int _linktopage = 0;
public boolean _tocitem = false;
public String _pageorientation = "";
public boolean _pagebreakbefore = false;
public boolean _pagebreakafter = false;
public b4j.example.pdfstyle _style = null;
public int _colspan = 0;
public int _rowspan = 0;
public String _fillcolor = "";
public String _decoration = "";
public String _linktodestination = "";
public String _id = "";
public String _listtype = "";
public String _pagereference = "";
public String _textreference = "";
public boolean _preserveleadingspaces = false;
public String _background = "";
public String _decorationstyle = "";
public String _decorationcolor = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public b4j.example.pdftext  _append(String _txt) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub Append(txt As String) As PDFText";
 //BA.debugLineNum = 150;BA.debugLine="textInt.Append(txt)";
_textint.Append(_txt);
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _appendline(String _txt) throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub AppendLine(txt As String) As PDFText";
 //BA.debugLineNum = 156;BA.debugLine="textInt.Append(txt)";
_textint.Append(_txt);
 //BA.debugLineNum = 157;BA.debugLine="textInt.Append(CRLF)";
_textint.Append(__c.CRLF);
 //BA.debugLineNum = 158;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 3;BA.debugLine="Private textInt As StringBuilder";
_textint = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Public link As String";
_link = "";
 //BA.debugLineNum = 5;BA.debugLine="Public linkToPage As Int";
_linktopage = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public tocItem As Boolean";
_tocitem = false;
 //BA.debugLineNum = 7;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 8;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
 //BA.debugLineNum = 9;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
 //BA.debugLineNum = 10;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 11;BA.debugLine="Public colSpan As Int";
_colspan = 0;
 //BA.debugLineNum = 12;BA.debugLine="Public rowSpan As Int";
_rowspan = 0;
 //BA.debugLineNum = 13;BA.debugLine="Public fillColor As String";
_fillcolor = "";
 //BA.debugLineNum = 14;BA.debugLine="Public decoration As String";
_decoration = "";
 //BA.debugLineNum = 15;BA.debugLine="Public linkToDestination As String";
_linktodestination = "";
 //BA.debugLineNum = 16;BA.debugLine="Public id As String";
_id = "";
 //BA.debugLineNum = 17;BA.debugLine="Public listType As String";
_listtype = "";
 //BA.debugLineNum = 18;BA.debugLine="Public pageReference As String";
_pagereference = "";
 //BA.debugLineNum = 19;BA.debugLine="Public textReference As String";
_textreference = "";
 //BA.debugLineNum = 20;BA.debugLine="Public preserveLeadingSpaces As Boolean";
_preserveleadingspaces = false;
 //BA.debugLineNum = 21;BA.debugLine="Public background As String";
_background = "";
 //BA.debugLineNum = 22;BA.debugLine="Public decorationStyle As String";
_decorationstyle = "";
 //BA.debugLineNum = 23;BA.debugLine="Public decorationColor As String";
_decorationcolor = "";
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
String _outcome = "";
 //BA.debugLineNum = 162;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 163;BA.debugLine="Dim outcome As String = textInt.tostring";
_outcome = _textint.ToString();
 //BA.debugLineNum = 164;BA.debugLine="contentInt.Put(\"text\", outcome)";
_contentint.Put((Object)("text"),(Object)(_outcome));
 //BA.debugLineNum = 165;BA.debugLine="If linkToPage <> Null Then contentInt.Put(\"linkTo";
if (_linktopage!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("linkToPage"),(Object)(_linktopage));};
 //BA.debugLineNum = 166;BA.debugLine="If link <> Null Then contentInt.Put(\"link\", link)";
if (_link!= null) { 
_contentint.Put((Object)("link"),(Object)(_link));};
 //BA.debugLineNum = 167;BA.debugLine="If tocItem <> Null Then contentInt.Put(\"tocItem\",";
if (_tocitem!=BA.ObjectToBoolean(__c.Null)) { 
_contentint.Put((Object)("tocItem"),(Object)(_tocitem));};
 //BA.debugLineNum = 168;BA.debugLine="If pageOrientation <> Null Then contentInt.Put(\"p";
if (_pageorientation!= null) { 
_contentint.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 169;BA.debugLine="If pageBreakBefore Then contentInt.Put(\"pageBreak";
if (_pagebreakbefore) { 
_contentint.Put((Object)("pageBreak"),(Object)("before"));};
 //BA.debugLineNum = 170;BA.debugLine="If pageBreakAfter Then contentInt.Put(\"pageBreak\"";
if (_pagebreakafter) { 
_contentint.Put((Object)("pageBreak"),(Object)("after"));};
 //BA.debugLineNum = 171;BA.debugLine="If colSpan <> Null Then contentInt.Put(\"colSpan\",";
if (_colspan!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("colSpan"),(Object)(_colspan));};
 //BA.debugLineNum = 172;BA.debugLine="If rowSpan <> Null Then contentInt.Put(\"rowSpan\",";
if (_rowspan!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("rowSpan"),(Object)(_rowspan));};
 //BA.debugLineNum = 173;BA.debugLine="If fillColor <> Null Then contentInt.Put(\"fillCol";
if (_fillcolor!= null) { 
_contentint.Put((Object)("fillColor"),(Object)(_fillcolor));};
 //BA.debugLineNum = 174;BA.debugLine="If decoration <> Null Then contentInt.Put(\"decora";
if (_decoration!= null) { 
_contentint.Put((Object)("decoration"),(Object)(_decoration));};
 //BA.debugLineNum = 175;BA.debugLine="If linkToDestination <> Null Then contentInt.Put(";
if (_linktodestination!= null) { 
_contentint.Put((Object)("linkToDestination"),(Object)(_linktodestination));};
 //BA.debugLineNum = 176;BA.debugLine="If id <> Null Then contentInt.Put(\"id\", id)";
if (_id!= null) { 
_contentint.Put((Object)("id"),(Object)(_id));};
 //BA.debugLineNum = 177;BA.debugLine="If listType <> Null Then contentInt.Put(\"listType";
if (_listtype!= null) { 
_contentint.Put((Object)("listType"),(Object)(_listtype));};
 //BA.debugLineNum = 178;BA.debugLine="If pageReference <> Null Then contentInt.Put(\"pag";
if (_pagereference!= null) { 
_contentint.Put((Object)("pageReference"),(Object)(_pagereference));};
 //BA.debugLineNum = 179;BA.debugLine="If textReference <> Null Then contentInt.Put(\"tex";
if (_textreference!= null) { 
_contentint.Put((Object)("textReference"),(Object)(_textreference));};
 //BA.debugLineNum = 180;BA.debugLine="If preserveLeadingSpaces <> Null Then contentInt.";
if (_preserveleadingspaces!=BA.ObjectToBoolean(__c.Null)) { 
_contentint.Put((Object)("preserveLeadingSpaces"),(Object)(_preserveleadingspaces));};
 //BA.debugLineNum = 181;BA.debugLine="If background <> Null Then contentInt.Put(\"backgr";
if (_background!= null) { 
_contentint.Put((Object)("background"),(Object)(_background));};
 //BA.debugLineNum = 182;BA.debugLine="If decorationStyle <> Null Then contentInt.Put(\"d";
if (_decorationstyle!= null) { 
_contentint.Put((Object)("decorationStyle"),(Object)(_decorationstyle));};
 //BA.debugLineNum = 183;BA.debugLine="if decorationColor <> null then contentInt.Put(\"d";
if (_decorationcolor!= null) { 
_contentint.Put((Object)("decorationColor"),(Object)(_decorationcolor));};
 //BA.debugLineNum = 184;BA.debugLine="style.Include(contentInt)";
_style._include /*String*/ (_contentint);
 //BA.debugLineNum = 185;BA.debugLine="Return contentInt";
if (true) return _contentint;
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize As PDFText";
 //BA.debugLineNum = 28;BA.debugLine="contentInt.Initialize";
_contentint.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="textInt.Initialize";
_textint.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 31;BA.debugLine="link = Null";
_link = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 32;BA.debugLine="linkToPage = Null";
_linktopage = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 33;BA.debugLine="tocItem = Null";
_tocitem = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 34;BA.debugLine="pageBreakBefore = Null";
_pagebreakbefore = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 35;BA.debugLine="pageBreakAfter = Null";
_pagebreakafter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 37;BA.debugLine="colSpan = Null";
_colspan = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 38;BA.debugLine="rowSpan = Null";
_rowspan = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 39;BA.debugLine="fillColor = Null";
_fillcolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 40;BA.debugLine="decoration = Null";
_decoration = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 41;BA.debugLine="linkToDestination = Null";
_linktodestination = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 42;BA.debugLine="listType = Null";
_listtype = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 43;BA.debugLine="id = Null";
_id = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 44;BA.debugLine="pageReference = Null";
_pagereference = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 45;BA.debugLine="textReference = Null";
_textreference = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 46;BA.debugLine="preserveLeadingSpaces = Null";
_preserveleadingspaces = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 47;BA.debugLine="background = Null";
_background = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 48;BA.debugLine="decorationStyle = Null";
_decorationstyle = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 49;BA.debugLine="decorationColor = Null";
_decorationcolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 54;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 55;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 56;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 57;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 58;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
_contentint.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentcenter() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAlignmentCenter As PDFText";
 //BA.debugLineNum = 88;BA.debugLine="style.alignmentCenter = True";
_style._alignmentcenter /*boolean*/  = __c.True;
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentjustify() throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAlignmentJustify As PDFText";
 //BA.debugLineNum = 100;BA.debugLine="style.alignmentJustify = True";
_style._alignmentjustify /*boolean*/  = __c.True;
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentright() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetAlignmentRight As PDFText";
 //BA.debugLineNum = 94;BA.debugLine="style.alignmentRight = True";
_style._alignmentright /*boolean*/  = __c.True;
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbold(boolean _b) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetBold(b As Boolean) As PDFText";
 //BA.debugLineNum = 129;BA.debugLine="style.bold = b";
_style._bold /*boolean*/  = _b;
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbordercolor(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 63;BA.debugLine="Sub SetBorderColor(l As Int, t As Int, r As Int, b";
 //BA.debugLineNum = 64;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 65;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 67;BA.debugLine="contentInt.Put(\"borderColor\", margin)";
_contentint.Put((Object)("borderColor"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolor(String _colour) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetColor(colour As String) As PDFText";
 //BA.debugLineNum = 144;BA.debugLine="style.color = colour";
_style._color /*String*/  = _colour;
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolspan(int _cs) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetColSpan(cs As Int) As PDFText";
 //BA.debugLineNum = 112;BA.debugLine="colSpan = cs";
_colspan = _cs;
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfillcolor(Object _fc) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub SetFillColor(fc As Object) As PDFText";
 //BA.debugLineNum = 82;BA.debugLine="fillColor = fc";
_fillcolor = BA.ObjectToString(_fc);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfontsize(int _fs) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetFontSize(fs As Int) As PDFText";
 //BA.debugLineNum = 139;BA.debugLine="style.fontSize = fs";
_style._fontsize /*int*/  = _fs;
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setitalics(boolean _b) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetItalics(b As Boolean) As PDFText";
 //BA.debugLineNum = 134;BA.debugLine="style.italics = b";
_style._italics /*boolean*/  = _b;
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrelativeposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub SetRelativePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 73;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 74;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 75;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 76;BA.debugLine="contentInt.Put(\"relativePosition\", opt)";
_contentint.Put((Object)("relativePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrowspan(int _rs) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetRowSpan(rs As Int) As PDFText";
 //BA.debugLineNum = 106;BA.debugLine="rowSpan = rs";
_rowspan = _rs;
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setstyle(String _stylename) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetStyle(styleName As String) As PDFText";
 //BA.debugLineNum = 118;BA.debugLine="style.AddStyle(styleName)";
_style._addstyle /*b4j.example.pdfstyle*/ (_stylename);
 //BA.debugLineNum = 119;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setwidth(String _swidth) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetWidth(sWidth As String) As PDFText";
 //BA.debugLineNum = 124;BA.debugLine="style.width = sWidth";
_style._width /*String*/  = _swidth;
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
