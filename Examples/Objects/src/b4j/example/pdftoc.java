package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftoc extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdftoc", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftoc.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public anywheresoftware.b4a.objects.collections.Map _toc = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private toc As Map";
_toc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 28;BA.debugLine="toc.Put(\"toc\", options)";
_toc.Put((Object)("toc"),(Object)(_options.getObject()));
 //BA.debugLineNum = 29;BA.debugLine="Return toc";
if (true) return _toc;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize As PDFToC";
 //BA.debugLineNum = 9;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 10;BA.debugLine="toc.Initialize";
_toc.Initialize();
 //BA.debugLineNum = 11;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _setnumberstyle(b4j.example.pdfstyle _style) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetNumberStyle(style As PDFStyle) As PDFToC";
 //BA.debugLineNum = 22;BA.debugLine="options.Put(\"numberStyle\", style.Content)";
_options.Put((Object)("numberStyle"),(Object)(_style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _settitle(b4j.example.pdftext _text) throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub SetTitle(text As PDFText) As PDFToC";
 //BA.debugLineNum = 16;BA.debugLine="options.Put(\"title\", text.Content)";
_options.Put((Object)("title"),(Object)(_text._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
