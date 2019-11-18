package b4j.example;


import anywheresoftware.b4a.BA;

public class pgindex extends Object{
public static pgindex mostCurrent = new pgindex();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pgindex", null);
		ba.loadHtSubs(pgindex.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.pgindex", ba);
		}
	}
    public static Class<?> getObject() {
		return pgindex.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static com.ab.banano.BANanoElement _body = null;
public static b4j.example.main _main = null;
public static String  _init() throws Exception{
b4j.example.pdfview _view = null;
 //BA.debugLineNum = 7;BA.debugLine="Sub Init";
 //BA.debugLineNum = 9;BA.debugLine="body = BANano.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
 //BA.debugLineNum = 11;BA.debugLine="body.Empty";
_body.Empty();
 //BA.debugLineNum = 13;BA.debugLine="body.Append($\"<div id=\"basic\"></div>\"$)";
_body.Append(("<div id=\"basic\"></div>"));
 //BA.debugLineNum = 15;BA.debugLine="Dim view As PDFView";
_view = new b4j.example.pdfview();
 //BA.debugLineNum = 17;BA.debugLine="view.Initialize(\"basic\")";
_view._initialize /*b4j.example.pdfview*/ (ba,"basic");
 //BA.debugLineNum = 19;BA.debugLine="view.SetHREF(\"./assets/themash.pdf\")";
_view._sethref /*b4j.example.pdfview*/ ("./assets/themash.pdf");
 //BA.debugLineNum = 21;BA.debugLine="view.SetHeight(800)";
_view._setheight /*b4j.example.pdfview*/ ((int) (800));
 //BA.debugLineNum = 23;BA.debugLine="view.SetWidth(800)";
_view._setwidth /*b4j.example.pdfview*/ ((int) (800));
 //BA.debugLineNum = 25;BA.debugLine="view.View";
_view._view /*String*/ ();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Private body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
}
