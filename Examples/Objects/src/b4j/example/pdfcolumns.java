package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfcolumns extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfcolumns", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfcolumns.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _columnsint = null;
public int _columngap = 0;
public anywheresoftware.b4a.objects.collections.Map _cols = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pgpdf _pgpdf = null;
public b4j.example.pdfcolumns  _addcolumns(b4j.example.pdfcolumns _colsx) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub AddColumns(colsx As PDFColumns) As PDFColumns";
 //BA.debugLineNum = 47;BA.debugLine="columnsInt.Add(colsx.Content)";
_columnsint.Add((Object)(_colsx._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 48;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addlist(b4j.example.pdflist _lst) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub AddList(lst As PDFList) As PDFColumns";
 //BA.debugLineNum = 29;BA.debugLine="columnsInt.Add(lst.Content)";
_columnsint.Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addstack(b4j.example.pdfstack _stack) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFColumns";
 //BA.debugLineNum = 35;BA.debugLine="columnsInt.Add(stack.Content)";
_columnsint.Add((Object)(_stack._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addstring(String _txt) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub AddString(txt As String) As PDFColumns";
 //BA.debugLineNum = 53;BA.debugLine="columnsInt.Add(txt)";
_columnsint.Add((Object)(_txt));
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _addtext(b4j.example.pdftext _text) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub AddText(text As PDFText) As PDFColumns";
 //BA.debugLineNum = 41;BA.debugLine="columnsInt.Add(text.Content)";
_columnsint.Add((Object)(_text._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private columnsInt As List";
_columnsint = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="Public columnGap As Int";
_columngap = 0;
 //BA.debugLineNum = 5;BA.debugLine="Private cols As Map";
_cols = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 71;BA.debugLine="If columnsInt.Size > 0 Then";
if (_columnsint.getSize()>0) { 
 //BA.debugLineNum = 72;BA.debugLine="cols.Put(\"columnGap\", columnGap)";
_cols.Put((Object)("columnGap"),(Object)(_columngap));
 //BA.debugLineNum = 73;BA.debugLine="cols.Put(\"columns\", columnsInt)";
_cols.Put((Object)("columns"),(Object)(_columnsint.getObject()));
 };
 //BA.debugLineNum = 75;BA.debugLine="style.Include(cols)";
_style._include /*String*/ (_cols);
 //BA.debugLineNum = 76;BA.debugLine="Return cols";
if (true) return _cols;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As PDFColumns";
 //BA.debugLineNum = 11;BA.debugLine="columnsInt.Initialize";
_columnsint.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="columnGap = 10";
_columngap = (int) (10);
 //BA.debugLineNum = 13;BA.debugLine="cols.Initialize";
_cols.Initialize();
 //BA.debugLineNum = 14;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 19;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 20;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 21;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 22;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 23;BA.debugLine="cols.Put(\"absolutePosition\", opt)";
_cols.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetPageBreakAfter As PDFColumns";
 //BA.debugLineNum = 65;BA.debugLine="cols.Put(\"pageBreak\", \"after\")";
_cols.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfcolumns  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetPageBreakBefore As PDFColumns";
 //BA.debugLineNum = 59;BA.debugLine="cols.Put(\"pageBreak\", \"before\")";
_cols.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfcolumns)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
