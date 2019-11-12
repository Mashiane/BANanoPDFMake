package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdflist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdflist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdflist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.Map _listx = null;
public String _ltype = "";
public b4j.example.pdfstyle _style = null;
public boolean _reversed = false;
public int _start = 0;
public boolean _square = false;
public boolean _circle = false;
public String _color = "";
public String _markercolor = "";
public boolean _loweralpha = false;
public boolean _upperalpha = false;
public boolean _upperroman = false;
public boolean _lowerroman = false;
public boolean _none = false;
public String _separator = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public String  _additems(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
Object _item = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub AddItems(lst As List)";
 //BA.debugLineNum = 49;BA.debugLine="For Each item As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = group1.Get(index1);
 //BA.debugLineNum = 50;BA.debugLine="items.Add(item)";
_items.Add(_item);
 }
};
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdflist  _addtext(b4j.example.pdftext _txt) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub AddText(txt As PDFText) As PDFList";
 //BA.debugLineNum = 43;BA.debugLine="items.Add(txt.Content)";
_items.Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3;BA.debugLine="Private listX As Map";
_listx = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private lType As String";
_ltype = "";
 //BA.debugLineNum = 5;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 6;BA.debugLine="Public reversed As Boolean";
_reversed = false;
 //BA.debugLineNum = 7;BA.debugLine="Public start As Int";
_start = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public square As Boolean";
_square = false;
 //BA.debugLineNum = 9;BA.debugLine="Public circle As Boolean";
_circle = false;
 //BA.debugLineNum = 10;BA.debugLine="Public color As String";
_color = "";
 //BA.debugLineNum = 11;BA.debugLine="Public markerColor As String";
_markercolor = "";
 //BA.debugLineNum = 12;BA.debugLine="Public lowerAlpha As Boolean";
_loweralpha = false;
 //BA.debugLineNum = 13;BA.debugLine="Public upperAlpha As Boolean";
_upperalpha = false;
 //BA.debugLineNum = 14;BA.debugLine="Public upperRoman As Boolean";
_upperroman = false;
 //BA.debugLineNum = 15;BA.debugLine="Public lowerRoman As Boolean";
_lowerroman = false;
 //BA.debugLineNum = 16;BA.debugLine="Public none As Boolean";
_none = false;
 //BA.debugLineNum = 17;BA.debugLine="Public separator As String";
_separator = "";
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 56;BA.debugLine="If reversed <> Null Then listX.Put(\"reversed\", re";
if (_reversed!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("reversed"),(Object)(_reversed));};
 //BA.debugLineNum = 57;BA.debugLine="If start <> Null Then listX.Put(\"start\", start)";
if (_start!=(double)(BA.ObjectToNumber(__c.Null))) { 
_listx.Put((Object)("start"),(Object)(_start));};
 //BA.debugLineNum = 58;BA.debugLine="If square <> Null Then listX.Put(\"type\", \"square\"";
if (_square!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("square"));};
 //BA.debugLineNum = 59;BA.debugLine="If circle <> Null Then listX.Put(\"type\", \"circle\"";
if (_circle!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("circle"));};
 //BA.debugLineNum = 60;BA.debugLine="If color <> Null Then listX.Put(\"color\", color)";
if (_color!= null) { 
_listx.Put((Object)("color"),(Object)(_color));};
 //BA.debugLineNum = 61;BA.debugLine="If markerColor <> Null Then listX.Put(\"markerColo";
if (_markercolor!= null) { 
_listx.Put((Object)("markerColor"),(Object)(_markercolor));};
 //BA.debugLineNum = 62;BA.debugLine="If lowerAlpha <> Null Then listX.Put(\"type\", \"low";
if (_loweralpha!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("lower-alpha"));};
 //BA.debugLineNum = 63;BA.debugLine="If upperAlpha <> Null Then listX.Put(\"type\", \"upp";
if (_upperalpha!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("upper-alpha"));};
 //BA.debugLineNum = 64;BA.debugLine="If upperRoman <> Null Then listX.Put(\"type\", \"upp";
if (_upperroman!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("upper-roman"));};
 //BA.debugLineNum = 65;BA.debugLine="If lowerRoman <> Null Then listX.Put(\"type\", \"low";
if (_lowerroman!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("lower-roman"));};
 //BA.debugLineNum = 66;BA.debugLine="If none <> Null Then listX.Put(\"type\", \"none\")";
if (_none!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("type"),(Object)("none"));};
 //BA.debugLineNum = 67;BA.debugLine="If separator <> Null Then listX.Put(\"type\", \"sepa";
if (_separator!= null) { 
_listx.Put((Object)("type"),(Object)("separator"));};
 //BA.debugLineNum = 69;BA.debugLine="listX.Put(lType, items)";
_listx.Put((Object)(_ltype),(Object)(_items.getObject()));
 //BA.debugLineNum = 70;BA.debugLine="style.Include(listX)";
_style._include /*String*/ (_listx);
 //BA.debugLineNum = 71;BA.debugLine="Return listX";
if (true) return _listx;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _initialize(anywheresoftware.b4a.BA _ba,String _typeof) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(typeOf As String) As PDFList";
 //BA.debugLineNum = 22;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="listX.Initialize";
_listx.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="lType = typeOf";
_ltype = _typeof;
 //BA.debugLineNum = 25;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 26;BA.debugLine="reversed = Null";
_reversed = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 27;BA.debugLine="start = Null";
_start = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 28;BA.debugLine="square = Null";
_square = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="circle = Null";
_circle = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 30;BA.debugLine="color = Null";
_color = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 31;BA.debugLine="markerColor = Null";
_markercolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 32;BA.debugLine="lowerAlpha = Null";
_loweralpha = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 33;BA.debugLine="upperAlpha = Null";
_upperalpha = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 34;BA.debugLine="upperRoman = Null";
_upperroman = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 35;BA.debugLine="lowerRoman = Null";
_lowerroman = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 36;BA.debugLine="none = Null";
_none = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 37;BA.debugLine="separator = Null";
_separator = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
