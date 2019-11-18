package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfimage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfimage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public b4j.example.pdfstyle _style = null;
public String _image = "";
public int _width = 0;
public int _height = 0;
public boolean _pagebreakafter = false;
public boolean _pagebreakbefore = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 5;BA.debugLine="Public image As String";
_image = "";
 //BA.debugLineNum = 6;BA.debugLine="Public width As Int";
_width = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public height As Int";
_height = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
 //BA.debugLineNum = 9;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 119;BA.debugLine="If image <> Null Then options.Put(\"image\", image)";
if (_image!= null) { 
_options.Put((Object)("image"),(Object)(_image));};
 //BA.debugLineNum = 120;BA.debugLine="If width <> Null Then options.Put(\"width\", width)";
if (_width!=(double)(BA.ObjectToNumber(__c.Null))) { 
_options.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 121;BA.debugLine="If height <> Null Then options.Put(\"height\", heig";
if (_height!=(double)(BA.ObjectToNumber(__c.Null))) { 
_options.Put((Object)("height"),(Object)(_height));};
 //BA.debugLineNum = 122;BA.debugLine="If pageBreakAfter <> Null Then options.Put(\"pageB";
if (_pagebreakafter!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("pageBreak"),(Object)("after"));};
 //BA.debugLineNum = 123;BA.debugLine="If pageBreakBefore <> Null Then options.Put(\"page";
if (_pagebreakbefore!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("pageBreak"),(Object)("before"));};
 //BA.debugLineNum = 124;BA.debugLine="style.Include(options)";
_style._include /*String*/ (_options);
 //BA.debugLineNum = 125;BA.debugLine="Return options";
if (true) return _options;
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As PDFImage";
 //BA.debugLineNum = 14;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 16;BA.debugLine="image = Null";
_image = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 17;BA.debugLine="width = Null";
_width = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 18;BA.debugLine="height = Null";
_height = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 19;BA.debugLine="pageBreakAfter = Null";
_pagebreakafter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 20;BA.debugLine="pageBreakBefore = Null";
_pagebreakbefore = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 88;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 89;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 90;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 91;BA.debugLine="options.Put(\"absolutePosition\", opt)";
_options.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setalignmentcenter() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetAlignmentCenter As PDFImage";
 //BA.debugLineNum = 69;BA.debugLine="style.alignmentCenter = True";
_style._alignmentcenter /*boolean*/  = __c.True;
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setalignmentjustify() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetAlignmentJustify As PDFImage";
 //BA.debugLineNum = 81;BA.debugLine="style.alignmentJustify = True";
_style._alignmentjustify /*boolean*/  = __c.True;
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setalignmentright() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetAlignmentRight As PDFImage";
 //BA.debugLineNum = 75;BA.debugLine="style.alignmentRight = True";
_style._alignmentright /*boolean*/  = __c.True;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setangle(double _dangle) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetAngle(dangle As Double) As PDFImage";
 //BA.debugLineNum = 56;BA.debugLine="style.angle = dangle";
_style._angle /*double*/  = _dangle;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setfillcolor(Object _fc) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetFillColor(fc As Object) As PDFImage";
 //BA.debugLineNum = 63;BA.debugLine="style.fillColor = fc";
_style._fillcolor /*String*/  = BA.ObjectToString(_fc);
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setfit(int _w,int _h) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 96;BA.debugLine="Sub SetFit(w As Int, h As Int) As PDFImage";
 //BA.debugLineNum = 97;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 98;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 99;BA.debugLine="lst.Add(w)";
_lst.Add((Object)(_w));
 //BA.debugLineNum = 100;BA.debugLine="lst.Add(h)";
_lst.Add((Object)(_h));
 //BA.debugLineNum = 101;BA.debugLine="options.Put(\"fit\", lst)";
_options.Put((Object)("fit"),(Object)(_lst.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub SetHeight(h As Int) As PDFImage";
 //BA.debugLineNum = 32;BA.debugLine="height = h";
_height = _h;
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setimage(String _imgkey) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub SetImage(imgKey As String) As PDFImage";
 //BA.debugLineNum = 38;BA.debugLine="image = imgKey";
_image = _imgkey;
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 50;BA.debugLine="style.SetMargin(l,t,r,b)";
_style._setmargin /*b4j.example.pdfstyle*/ (_l,_t,_r,_b);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setopacity(double _opacity) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetOpacity(opacity As Double) As PDFImage";
 //BA.debugLineNum = 44;BA.debugLine="options.Put(\"opacity\", opacity)";
_options.Put((Object)("opacity"),(Object)(_opacity));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetPageBreakAfter As PDFImage";
 //BA.debugLineNum = 113;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
_options.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPageBreakBefore As PDFImage";
 //BA.debugLineNum = 107;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
_options.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub SetWidth(w As Int) As PDFImage";
 //BA.debugLineNum = 26;BA.debugLine="width = w";
_width = _w;
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
