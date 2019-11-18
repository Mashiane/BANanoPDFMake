package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfstyle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfstyle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfstyle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _fontsize = 0;
public boolean _bold = false;
public boolean _italics = false;
public boolean _alignmentright = false;
public boolean _alignmentcenter = false;
public boolean _alignmentjustify = false;
public String _color = "";
public String _name = "";
public String _width = "";
public String _height = "";
public double _opacity = 0;
public double _angle = 0;
public anywheresoftware.b4a.objects.collections.Map _m = null;
public anywheresoftware.b4a.objects.collections.List _styles = null;
public int _columngap = 0;
public String _decoration = "";
public String _decorationstyle = "";
public String _decorationcolor = "";
public String _fillcolor = "";
public String _background = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdfstyle  _addstyle(String _stylename) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddStyle(styleName As String) As PDFStyle";
 //BA.debugLineNum = 140;BA.debugLine="styles.Add(styleName)";
_styles.Add((Object)(_stylename));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public fontSize As Int";
_fontsize = 0;
 //BA.debugLineNum = 4;BA.debugLine="Public bold As Boolean";
_bold = false;
 //BA.debugLineNum = 5;BA.debugLine="Public italics As Boolean";
_italics = false;
 //BA.debugLineNum = 6;BA.debugLine="Public alignmentRight As Boolean";
_alignmentright = false;
 //BA.debugLineNum = 7;BA.debugLine="Public alignmentCenter As Boolean";
_alignmentcenter = false;
 //BA.debugLineNum = 8;BA.debugLine="Public alignmentJustify As Boolean";
_alignmentjustify = false;
 //BA.debugLineNum = 9;BA.debugLine="Public color As String";
_color = "";
 //BA.debugLineNum = 10;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 11;BA.debugLine="Public width As String";
_width = "";
 //BA.debugLineNum = 12;BA.debugLine="Public height As String";
_height = "";
 //BA.debugLineNum = 13;BA.debugLine="Public opacity As Double";
_opacity = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public angle As Double";
_angle = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private styles As List";
_styles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Public columnGap As Int";
_columngap = 0;
 //BA.debugLineNum = 18;BA.debugLine="Public decoration As String";
_decoration = "";
 //BA.debugLineNum = 19;BA.debugLine="Public decorationStyle As String";
_decorationstyle = "";
 //BA.debugLineNum = 20;BA.debugLine="Public decorationColor As String";
_decorationcolor = "";
 //BA.debugLineNum = 21;BA.debugLine="Public fillColor As String";
_fillcolor = "";
 //BA.debugLineNum = 22;BA.debugLine="Public background As String";
_background = "";
 //BA.debugLineNum = 23;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 206;BA.debugLine="If fontSize <> Null Then m.put(\"fontSize\", fontSi";
if (_fontsize!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("fontSize"),(Object)(_fontsize));};
 //BA.debugLineNum = 207;BA.debugLine="If bold <> Null Then m.Put(\"bold\", bold)";
if (_bold!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("bold"),(Object)(_bold));};
 //BA.debugLineNum = 208;BA.debugLine="If italics <> Null Then m.Put(\"italics\", italics)";
if (_italics!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("italics"),(Object)(_italics));};
 //BA.debugLineNum = 209;BA.debugLine="If alignmentRight <> Null Then m.Put(\"alignment\",";
if (_alignmentright!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("right"));};
 //BA.debugLineNum = 210;BA.debugLine="If alignmentCenter <> Null Then m.Put(\"alignment\"";
if (_alignmentcenter!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("center"));};
 //BA.debugLineNum = 211;BA.debugLine="If alignmentJustify <> Null Then m.Put(\"alignment";
if (_alignmentjustify!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("justify"));};
 //BA.debugLineNum = 212;BA.debugLine="If color <> Null Then m.Put(\"color\", color)";
if (_color!= null) { 
_m.Put((Object)("color"),(Object)(_color));};
 //BA.debugLineNum = 213;BA.debugLine="If opacity <> Null Then m.Put(\"opacity\", opacity)";
if (_opacity!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("opacity"),(Object)(_opacity));};
 //BA.debugLineNum = 214;BA.debugLine="If angle <> Null Then m.Put(\"angle\", angle)";
if (_angle!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("angle"),(Object)(_angle));};
 //BA.debugLineNum = 215;BA.debugLine="If width <> Null Then m.Put(\"width\", width)";
if (_width!= null) { 
_m.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 216;BA.debugLine="If height <> Null Then m.Put(\"height\", height)";
if (_height!= null) { 
_m.Put((Object)("height"),(Object)(_height));};
 //BA.debugLineNum = 217;BA.debugLine="If columnGap <> Null Then m.Put(\"columnGap\", colu";
if (_columngap!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("columnGap"),(Object)(_columngap));};
 //BA.debugLineNum = 218;BA.debugLine="If decoration <> Null Then m.Put(\"decoration\", de";
if (_decoration!= null) { 
_m.Put((Object)("decoration"),(Object)(_decoration));};
 //BA.debugLineNum = 219;BA.debugLine="If fillColor <> Null Then m.Put(\"fillColor\", fill";
if (_fillcolor!= null) { 
_m.Put((Object)("fillColor"),(Object)(_fillcolor));};
 //BA.debugLineNum = 220;BA.debugLine="If decoration <> Null Then m.Put(\"decoration\", de";
if (_decoration!= null) { 
_m.Put((Object)("decoration"),(Object)(_decoration));};
 //BA.debugLineNum = 221;BA.debugLine="If background <> Null Then m.Put(\"background\", ba";
if (_background!= null) { 
_m.Put((Object)("background"),(Object)(_background));};
 //BA.debugLineNum = 222;BA.debugLine="If decorationStyle <> Null Then m.Put(\"decoration";
if (_decorationstyle!= null) { 
_m.Put((Object)("decorationStyle"),(Object)(_decorationstyle));};
 //BA.debugLineNum = 223;BA.debugLine="If decorationColor <> Null Then m.Put(\"decoration";
if (_decorationcolor!= null) { 
_m.Put((Object)("decorationColor"),(Object)(_decorationcolor));};
 //BA.debugLineNum = 224;BA.debugLine="If styles.Size > 0 Then";
if (_styles.getSize()>0) { 
 //BA.debugLineNum = 225;BA.debugLine="m.Put(\"style\", styles)";
_m.Put((Object)("style"),(Object)(_styles.getObject()));
 };
 //BA.debugLineNum = 227;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public String  _include(anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _source = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub Include(target As Map)";
 //BA.debugLineNum = 232;BA.debugLine="Dim source As Map = getContent";
_source = new anywheresoftware.b4a.objects.collections.Map();
_source = _getcontent();
 //BA.debugLineNum = 233;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _source.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 234;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 235;BA.debugLine="target.Put(k, v)";
_target.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize As PDFStyle";
 //BA.debugLineNum = 28;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 29;BA.debugLine="name = Null";
_name = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 30;BA.debugLine="fillColor = Null";
_fillcolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 31;BA.debugLine="background = Null";
_background = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 32;BA.debugLine="fontSize = Null";
_fontsize = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 33;BA.debugLine="bold = Null";
_bold = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 34;BA.debugLine="italics = Null";
_italics = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 35;BA.debugLine="alignmentRight = Null";
_alignmentright = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="alignmentCenter = Null";
_alignmentcenter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 37;BA.debugLine="alignmentJustify = Null";
_alignmentjustify = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 38;BA.debugLine="color = Null";
_color = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 39;BA.debugLine="width = Null";
_width = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 40;BA.debugLine="opacity = Null";
_opacity = (double)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 41;BA.debugLine="angle = Null";
_angle = (double)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 42;BA.debugLine="styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="columnGap = Null";
_columngap = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 44;BA.debugLine="decoration = Null";
_decoration = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 45;BA.debugLine="decorationStyle = Null";
_decorationstyle = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 46;BA.debugLine="decorationColor = Null";
_decorationcolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 47;BA.debugLine="height = Null";
_height = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _noborder() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub NoBorder As PDFStyle";
 //BA.debugLineNum = 159;BA.debugLine="m.Put(\"border\", BANano.UNDEFINED)";
_m.Put((Object)("border"),_banano.UNDEFINED());
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setalignment(String _alignment) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetAlignment(alignment As String) As PDFStyle";
 //BA.debugLineNum = 103;BA.debugLine="If alignment = \"\" Then Return Me";
if ((_alignment).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 104;BA.debugLine="m.Put(\"alignment\", alignment)";
_m.Put((Object)("alignment"),(Object)(_alignment));
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setangle(double _dangle) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetAngle(dangle As Double) As PDFStyle";
 //BA.debugLineNum = 60;BA.debugLine="If dangle = 0 Then Return Me";
if (_dangle==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 61;BA.debugLine="angle = dangle";
_angle = _dangle;
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setbackground(String _sbackground) throws Exception{
 //BA.debugLineNum = 94;BA.debugLine="Sub SetBackground(sbackground As String) As PDFSty";
 //BA.debugLineNum = 95;BA.debugLine="If sbackground = \"\" Then Return Me";
if ((_sbackground).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 96;BA.debugLine="background = sbackground";
_background = _sbackground;
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setbold(boolean _b) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Sub SetBold(b As Boolean) As PDFStyle";
 //BA.debugLineNum = 125;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 126;BA.debugLine="bold = b";
_bold = _b;
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setborder(boolean _l,boolean _t,boolean _r,boolean _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 164;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
 //BA.debugLineNum = 165;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==BA.ObjectToBoolean(_banano.UNDEFINED())) { 
_l = BA.ObjectToBoolean(0);};
 //BA.debugLineNum = 166;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==BA.ObjectToBoolean(_banano.UNDEFINED())) { 
_t = BA.ObjectToBoolean(0);};
 //BA.debugLineNum = 167;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==BA.ObjectToBoolean(_banano.UNDEFINED())) { 
_r = BA.ObjectToBoolean(0);};
 //BA.debugLineNum = 168;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==BA.ObjectToBoolean(_banano.UNDEFINED())) { 
_b = BA.ObjectToBoolean(0);};
 //BA.debugLineNum = 169;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 170;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 172;BA.debugLine="m.Put(\"border\", margin)";
_m.Put((Object)("border"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setcolor(String _scolor) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetColor(scolor As String) As PDFStyle";
 //BA.debugLineNum = 88;BA.debugLine="If scolor = \"\" Then Return Me";
if ((_scolor).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 89;BA.debugLine="color = scolor";
_color = _scolor;
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setcolumngap(int _icolumngap) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetColumnGap(icolumnGap As Int) As PDFStyle";
 //BA.debugLineNum = 53;BA.debugLine="If icolumnGap = 0 Then Return Me";
if (_icolumngap==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 54;BA.debugLine="columnGap = icolumnGap";
_columngap = _icolumngap;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setdecoration(String _dec) throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub SetDecoration(dec As String) As PDFStyle";
 //BA.debugLineNum = 178;BA.debugLine="If dec = \"\" Then Return Me";
if ((_dec).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 179;BA.debugLine="decoration = dec";
_decoration = _dec;
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setdecorationcolor(String _sdecorationcolor) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Sub SetDecorationColor(sdecorationColor As String)";
 //BA.debugLineNum = 199;BA.debugLine="If sdecorationColor = \"\" Then Return Me";
if ((_sdecorationcolor).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 200;BA.debugLine="decorationColor = sdecorationColor";
_decorationcolor = _sdecorationcolor;
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setdecorationstyle(String _sdecorationstyle) throws Exception{
 //BA.debugLineNum = 192;BA.debugLine="Sub SetDecorationStyle(sdecorationStyle As String)";
 //BA.debugLineNum = 193;BA.debugLine="If sdecorationStyle = \"\" Then Return Me";
if ((_sdecorationstyle).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 194;BA.debugLine="decorationStyle = sdecorationStyle";
_decorationstyle = _sdecorationstyle;
 //BA.debugLineNum = 195;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setfillcolor(String _fc) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetFillColor(fc As String) As PDFStyle";
 //BA.debugLineNum = 186;BA.debugLine="If fc = \"\" Then Return Me";
if ((_fc).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 187;BA.debugLine="fillColor = fc";
_fillcolor = _fc;
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setfontsize(int _ifontsize) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetFontSize(ifontSize As Int) As PDFStyle";
 //BA.debugLineNum = 132;BA.debugLine="If ifontSize = 0 Then Return Me";
if (_ifontsize==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 133;BA.debugLine="fontSize = ifontSize";
_fontsize = _ifontsize;
 //BA.debugLineNum = 134;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetHeight(h As Int) As PDFStyle";
 //BA.debugLineNum = 81;BA.debugLine="If h = 0 Then Return Me";
if (_h==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 82;BA.debugLine="height = h";
_height = BA.NumberToString(_h);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setitalics(boolean _b) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub SetItalics(b As Boolean) As PDFStyle";
 //BA.debugLineNum = 118;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 119;BA.debugLine="italics = b";
_italics = _b;
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 146;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_l = (int) (0);};
 //BA.debugLineNum = 147;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_t = (int) (0);};
 //BA.debugLineNum = 148;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_r = (int) (0);};
 //BA.debugLineNum = 149;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_b = (int) (0);};
 //BA.debugLineNum = 150;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 151;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 153;BA.debugLine="m.Put(\"margin\", margin)";
_m.Put((Object)("margin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 154;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setname(String _sname) throws Exception{
 //BA.debugLineNum = 109;BA.debugLine="Sub SetName(sname As String) As PDFStyle";
 //BA.debugLineNum = 110;BA.debugLine="If sname = \"\" Then Return Me";
if ((_sname).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 111;BA.debugLine="name = sname";
_name = _sname;
 //BA.debugLineNum = 112;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setopacity(double _o) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub SetOpacity(o As Double) As PDFStyle";
 //BA.debugLineNum = 67;BA.debugLine="If o = 0 Then Return Me";
if (_o==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 68;BA.debugLine="opacity = o";
_opacity = _o;
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Sub SetWidth(w As Int) As PDFStyle";
 //BA.debugLineNum = 74;BA.debugLine="If w = 0 Then Return Me";
if (_w==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
 //BA.debugLineNum = 75;BA.debugLine="width = w";
_width = BA.NumberToString(_w);
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
