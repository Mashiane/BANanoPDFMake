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
public double _opacity = 0;
public double _angle = 0;
public anywheresoftware.b4a.objects.collections.Map _m = null;
public anywheresoftware.b4a.objects.collections.List _styles = null;
public int _columngap = 0;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public b4j.example.pdfstyle  _addstyle(String _stylename) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub AddStyle(styleName As String) As PDFStyle";
 //BA.debugLineNum = 39;BA.debugLine="styles.Add(styleName)";
_styles.Add((Object)(_stylename));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public fontSize As Int";
_fontsize = 0;
 //BA.debugLineNum = 3;BA.debugLine="Public bold As Boolean";
_bold = false;
 //BA.debugLineNum = 4;BA.debugLine="Public italics As Boolean";
_italics = false;
 //BA.debugLineNum = 5;BA.debugLine="Public alignmentRight As Boolean";
_alignmentright = false;
 //BA.debugLineNum = 6;BA.debugLine="Public alignmentCenter As Boolean";
_alignmentcenter = false;
 //BA.debugLineNum = 7;BA.debugLine="Public alignmentJustify As Boolean";
_alignmentjustify = false;
 //BA.debugLineNum = 8;BA.debugLine="Public color As String";
_color = "";
 //BA.debugLineNum = 9;BA.debugLine="Public name As String";
_name = "";
 //BA.debugLineNum = 10;BA.debugLine="Public width As String";
_width = "";
 //BA.debugLineNum = 11;BA.debugLine="Public opacity As Double";
_opacity = 0;
 //BA.debugLineNum = 12;BA.debugLine="Public angle As Double";
_angle = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 14;BA.debugLine="Private styles As List";
_styles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Public columnGap As Int";
_columngap = 0;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 54;BA.debugLine="If fontSize <> Null Then m.put(\"fontSize\", fontSi";
if (_fontsize!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("fontSize"),(Object)(_fontsize));};
 //BA.debugLineNum = 55;BA.debugLine="If bold <> Null Then m.Put(\"bold\", bold)";
if (_bold!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("bold"),(Object)(_bold));};
 //BA.debugLineNum = 56;BA.debugLine="If italics <> Null Then m.Put(\"italics\", italics)";
if (_italics!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("italics"),(Object)(_italics));};
 //BA.debugLineNum = 57;BA.debugLine="If alignmentRight <> Null Then m.Put(\"alignment\",";
if (_alignmentright!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("right"));};
 //BA.debugLineNum = 58;BA.debugLine="If alignmentCenter <> Null Then m.Put(\"alignment\"";
if (_alignmentcenter!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("center"));};
 //BA.debugLineNum = 59;BA.debugLine="If alignmentJustify <> Null Then m.Put(\"alignment";
if (_alignmentjustify!=BA.ObjectToBoolean(__c.Null)) { 
_m.Put((Object)("alignment"),(Object)("justify"));};
 //BA.debugLineNum = 60;BA.debugLine="If color <> Null Then m.Put(\"color\", color)";
if (_color!= null) { 
_m.Put((Object)("color"),(Object)(_color));};
 //BA.debugLineNum = 61;BA.debugLine="If opacity <> Null Then m.Put(\"opacity\", opacity)";
if (_opacity!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("opacity"),(Object)(_opacity));};
 //BA.debugLineNum = 62;BA.debugLine="If angle <> Null Then m.Put(\"angle\", angle)";
if (_angle!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("angle"),(Object)(_angle));};
 //BA.debugLineNum = 63;BA.debugLine="If width <> Null Then m.Put(\"width\", width)";
if (_width!= null) { 
_m.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 64;BA.debugLine="If columnGap <> Null Then m.Put(\"columnGap\", colu";
if (_columngap!=(double)(BA.ObjectToNumber(__c.Null))) { 
_m.Put((Object)("columnGap"),(Object)(_columngap));};
 //BA.debugLineNum = 65;BA.debugLine="If styles.Size > 0 Then";
if (_styles.getSize()>0) { 
 //BA.debugLineNum = 66;BA.debugLine="m.Put(\"style\", styles)";
_m.Put((Object)("style"),(Object)(_styles.getObject()));
 };
 //BA.debugLineNum = 68;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public String  _include(anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _source = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 71;BA.debugLine="Sub Include(target As Map)";
 //BA.debugLineNum = 72;BA.debugLine="Dim source As Map = getContent";
_source = new anywheresoftware.b4a.objects.collections.Map();
_source = _getcontent();
 //BA.debugLineNum = 73;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _source.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 74;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 75;BA.debugLine="target.Put(k, v)";
_target.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As PDFStyle";
 //BA.debugLineNum = 20;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 21;BA.debugLine="name = Null";
_name = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 22;BA.debugLine="fontSize = Null";
_fontsize = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 23;BA.debugLine="bold = Null";
_bold = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 24;BA.debugLine="italics = Null";
_italics = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="alignmentRight = Null";
_alignmentright = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 26;BA.debugLine="alignmentCenter = Null";
_alignmentcenter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 27;BA.debugLine="alignmentJustify = Null";
_alignmentjustify = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 28;BA.debugLine="color = Null";
_color = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="width = Null";
_width = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 30;BA.debugLine="opacity = Null";
_opacity = (double)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 31;BA.debugLine="angle = Null";
_angle = (double)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 32;BA.debugLine="styles.Initialize";
_styles.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="columnGap = Null";
_columngap = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 44;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 45;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 46;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 48;BA.debugLine="m.Put(\"margin\", margin)";
_m.Put((Object)("margin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
