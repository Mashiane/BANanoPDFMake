package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfrow.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _row = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdfrow  _addempty() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub AddEmpty As PDFRow";
 //BA.debugLineNum = 20;BA.debugLine="row.Add(CreateMap())";
_row.Add((Object)(__c.createMap(new Object[] {}).getObject()));
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addimage(b4j.example.pdfimage _img) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub AddImage(img As PDFImage) As PDFRow";
 //BA.debugLineNum = 14;BA.debugLine="row.Add(img.Content)";
_row.Add((Object)(_img._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addlist(b4j.example.pdflist _lst) throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub AddList(lst As PDFList) As PDFRow";
 //BA.debugLineNum = 26;BA.debugLine="row.Add(lst.Content)";
_row.Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub AddString(txt As String) As PDFRow";
 //BA.debugLineNum = 44;BA.debugLine="row.Add(txt)";
_row.Add((Object)(_txt));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addtable(b4j.example.pdftable _tbl) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFRow";
 //BA.debugLineNum = 38;BA.debugLine="row.Add(tbl.Content)";
_row.Add((Object)(_tbl._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _addtext(b4j.example.pdftext _txt) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub AddText(txt As PDFText) As PDFRow";
 //BA.debugLineNum = 32;BA.debugLine="row.Add(txt.Content)";
_row.Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 33;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private row As List";
_row = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getcontent() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub getContent As List";
 //BA.debugLineNum = 50;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfrow  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize As PDFRow";
 //BA.debugLineNum = 8;BA.debugLine="row.Initialize";
_row.Initialize();
 //BA.debugLineNum = 9;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfrow)(this);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
