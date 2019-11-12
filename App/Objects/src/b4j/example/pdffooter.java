package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdffooter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdffooter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdffooter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.pdftext _leftpart = null;
public b4j.example.pdftext _rightpart = null;
public anywheresoftware.b4a.objects.collections.List _cols = null;
public anywheresoftware.b4a.objects.collections.Map _ftr = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public LeftPart As PDFText";
_leftpart = new b4j.example.pdftext();
 //BA.debugLineNum = 3;BA.debugLine="Public RightPart As PDFText";
_rightpart = new b4j.example.pdftext();
 //BA.debugLineNum = 4;BA.debugLine="Private cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 5;BA.debugLine="Dim ftr As Map";
_ftr = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 6;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 20;BA.debugLine="cols.Add(LeftPart.Content)";
_cols.Add((Object)(_leftpart._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 21;BA.debugLine="cols.Add(RightPart.Content)";
_cols.Add((Object)(_rightpart._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 22;BA.debugLine="ftr.Put(\"columns\", cols)";
_ftr.Put((Object)("columns"),(Object)(_cols.getObject()));
 //BA.debugLineNum = 23;BA.debugLine="style.Include(ftr)";
_style._include /*String*/ (_ftr);
 //BA.debugLineNum = 24;BA.debugLine="Return ftr";
if (true) return _ftr;
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="cols.Initialize";
_cols.Initialize();
 //BA.debugLineNum = 12;BA.debugLine="LeftPart.Initialize";
_leftpart._initialize /*b4j.example.pdftext*/ (ba);
 //BA.debugLineNum = 13;BA.debugLine="RightPart.Initialize";
_rightpart._initialize /*b4j.example.pdftext*/ (ba);
 //BA.debugLineNum = 14;BA.debugLine="ftr.Initialize";
_ftr.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
