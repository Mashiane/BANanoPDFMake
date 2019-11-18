package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfstack extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfstack", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfstack.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _contentint = null;
public anywheresoftware.b4a.objects.collections.List _contents = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdfstack  _addlist(b4j.example.pdflist _lst) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub AddList(lst As PDFList) As PDFStack";
 //BA.debugLineNum = 18;BA.debugLine="contents.Add(lst.Content)";
_contents.Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddString(txt As String) As PDFStack";
 //BA.debugLineNum = 53;BA.debugLine="contents.Add(txt)";
_contents.Add((Object)(_txt));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _addtext(b4j.example.pdftext _txt) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub AddText(txt As PDFText) As PDFStack";
 //BA.debugLineNum = 34;BA.debugLine="contents.Add(txt.Content)";
_contents.Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 59;BA.debugLine="contentInt.Put(\"stack\", contents)";
_contentint.Put((Object)("stack"),(Object)(_contents.getObject()));
 //BA.debugLineNum = 60;BA.debugLine="style.Include(contentInt)";
_style._include /*String*/ (_contentint);
 //BA.debugLineNum = 61;BA.debugLine="Return contentInt";
if (true) return _contentint;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As PDFStack";
 //BA.debugLineNum = 10;BA.debugLine="contentInt.Initialize";
_contentint.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="contents.Initialize";
_contents.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 23;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 24;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 25;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 26;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 27;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
_contentint.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetPageBreakAfter As PDFStack";
 //BA.debugLineNum = 47;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
_contentint.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetPageBreakBefore As PDFStack";
 //BA.debugLineNum = 41;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
_contentint.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
