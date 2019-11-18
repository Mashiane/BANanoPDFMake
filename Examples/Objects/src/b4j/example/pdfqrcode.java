package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfqrcode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfqrcode", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfqrcode.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _qr = "";
public String _foreground = "";
public String _background = "";
public String _fit = "";
public boolean _modenumeric = false;
public boolean _modealphanumeric = false;
public boolean _modeoctet = false;
public boolean _ecclevell = false;
public boolean _ecclevelm = false;
public boolean _ecclevelq = false;
public boolean _ecclevelh = false;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public qr As String";
_qr = "";
 //BA.debugLineNum = 5;BA.debugLine="Public foreground As String";
_foreground = "";
 //BA.debugLineNum = 6;BA.debugLine="Public background As String";
_background = "";
 //BA.debugLineNum = 7;BA.debugLine="Public fit As String";
_fit = "";
 //BA.debugLineNum = 9;BA.debugLine="Public modeNumeric As Boolean";
_modenumeric = false;
 //BA.debugLineNum = 10;BA.debugLine="Public modeAlphanumeric As Boolean";
_modealphanumeric = false;
 //BA.debugLineNum = 11;BA.debugLine="Public modeOctet As Boolean";
_modeoctet = false;
 //BA.debugLineNum = 13;BA.debugLine="Public eccLevelL As Boolean";
_ecclevell = false;
 //BA.debugLineNum = 14;BA.debugLine="Public eccLevelM As Boolean";
_ecclevelm = false;
 //BA.debugLineNum = 15;BA.debugLine="Public eccLevelQ As Boolean";
_ecclevelq = false;
 //BA.debugLineNum = 16;BA.debugLine="Public eccLevelH As Boolean";
_ecclevelh = false;
 //BA.debugLineNum = 17;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 59;BA.debugLine="If qr <> Null Then options.Put(\"qr\", qr)";
if (_qr!= null) { 
_options.Put((Object)("qr"),(Object)(_qr));};
 //BA.debugLineNum = 60;BA.debugLine="If foreground <> Null Then options.Put(\"foregroun";
if (_foreground!= null) { 
_options.Put((Object)("foreground"),(Object)(_foreground));};
 //BA.debugLineNum = 61;BA.debugLine="If background <> Null Then options.Put(\"backgroun";
if (_background!= null) { 
_options.Put((Object)("background"),(Object)(_background));};
 //BA.debugLineNum = 62;BA.debugLine="If fit <> Null Then options.Put(\"fit\", fit)";
if (_fit!= null) { 
_options.Put((Object)("fit"),(Object)(_fit));};
 //BA.debugLineNum = 65;BA.debugLine="If modeNumeric Then options.Put(\"mode\", \"numeric\"";
if (_modenumeric) { 
_options.Put((Object)("mode"),(Object)("numeric"));};
 //BA.debugLineNum = 66;BA.debugLine="If modeAlphanumeric Then options.Put(\"mode\", \"alp";
if (_modealphanumeric) { 
_options.Put((Object)("mode"),(Object)("alphanumeric"));};
 //BA.debugLineNum = 67;BA.debugLine="If modeOctet Then options.Put(\"mode\", \"octet\")";
if (_modeoctet) { 
_options.Put((Object)("mode"),(Object)("octet"));};
 //BA.debugLineNum = 68;BA.debugLine="If eccLevelL Then options.Put(\"eccLevel\", \"L\")";
if (_ecclevell) { 
_options.Put((Object)("eccLevel"),(Object)("L"));};
 //BA.debugLineNum = 69;BA.debugLine="If eccLevelM Then options.Put(\"eccLevel\", \"M\")";
if (_ecclevelm) { 
_options.Put((Object)("eccLevel"),(Object)("M"));};
 //BA.debugLineNum = 70;BA.debugLine="If eccLevelQ Then options.Put(\"eccLevel\", \"Q\")";
if (_ecclevelq) { 
_options.Put((Object)("eccLevel"),(Object)("Q"));};
 //BA.debugLineNum = 71;BA.debugLine="If eccLevelH Then options.Put(\"eccLevel\", \"H\")";
if (_ecclevelh) { 
_options.Put((Object)("eccLevel"),(Object)("H"));};
 //BA.debugLineNum = 72;BA.debugLine="style.Include(options)";
_style._include /*String*/ (_options);
 //BA.debugLineNum = 73;BA.debugLine="Return options";
if (true) return _options;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize As PDFQRCode";
 //BA.debugLineNum = 22;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="qr = Null";
_qr = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 24;BA.debugLine="foreground = Null";
_foreground = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="background = Null";
_background = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 26;BA.debugLine="fit = Null";
_fit = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 28;BA.debugLine="modeNumeric = False";
_modenumeric = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="modeAlphanumeric = False";
_modealphanumeric = __c.False;
 //BA.debugLineNum = 30;BA.debugLine="modeOctet = False";
_modeoctet = __c.False;
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 36;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 37;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 38;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 39;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 40;BA.debugLine="options.Put(\"absolutePosition\", opt)";
_options.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetPageBreakAfter As PDFQRCode";
 //BA.debugLineNum = 53;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
_options.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetPageBreakBefore As PDFQRCode";
 //BA.debugLineNum = 47;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
_options.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
