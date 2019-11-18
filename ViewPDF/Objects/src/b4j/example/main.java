package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 500, 500);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static com.ab.banano.BANano _banano = null;
public static String _appname = "";
public static String _publish = "";
public static b4j.example.bananopostprocessor _bp = null;
public static b4j.example.pgindex _pgindex = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 46;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return false;
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
long _version = 0L;
String _appfile = "";
 //BA.debugLineNum = 12;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 14;BA.debugLine="BP.Initialize";
_bp._initialize(ba);
 //BA.debugLineNum = 15;BA.debugLine="BP.RedirectOutput(File.DirApp,\"log.txt\")";
_bp._redirectoutput(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 16;BA.debugLine="Publish = \"C:\\laragon\\www\"";
_publish = "C:\\laragon\\www";
 //BA.debugLineNum = 18;BA.debugLine="Dim Version As Long = DateTime.now";
_version = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 19;BA.debugLine="Dim appFile As String = $\"app${Version}.js\"$";
_appfile = ("app"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_version))+".js");
 //BA.debugLineNum = 22;BA.debugLine="BANano.Initialize(\"BANano\", AppName, Version)";
_banano.Initialize("BANano",_appname,_version);
 //BA.debugLineNum = 23;BA.debugLine="BANano.HTML_NAME = \"index.html\"";
_banano.HTML_NAME = "index.html";
 //BA.debugLineNum = 24;BA.debugLine="BANano.Header.Title = AppName";
_banano.Header.Title = _appname;
 //BA.debugLineNum = 25;BA.debugLine="BANano.JAVASCRIPT_NAME = appFile";
_banano.JAVASCRIPT_NAME = _appfile;
 //BA.debugLineNum = 26;BA.debugLine="BANano.TranspilerOptions.UseServiceWorker = False";
_banano.TranspilerOptions.setUseServiceWorker(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 28;BA.debugLine="BANano.Header.AddJavascriptFile(\"jquery-3.4.1.min";
_banano.Header.AddJavascriptFile("jquery-3.4.1.min.js");
 //BA.debugLineNum = 29;BA.debugLine="BANano.Header.AddJavascriptFile(\"jquery.media.js\"";
_banano.Header.AddJavascriptFile("jquery.media.js");
 //BA.debugLineNum = 31;BA.debugLine="BANano.Build(Publish)";
_banano.Build(_publish);
 //BA.debugLineNum = 32;BA.debugLine="BP.OpenLog(File.DirApp, \"log.txt\")";
_bp._openlog(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"log.txt");
 //BA.debugLineNum = 34;BA.debugLine="BP.PublishPath = Publish";
_bp._publishpath = _publish;
 //BA.debugLineNum = 35;BA.debugLine="BP.ShortName = AppName";
_bp._shortname = _appname;
 //BA.debugLineNum = 36;BA.debugLine="BP.AssetsPath = BANano.ASSETS_FOLDER";
_bp._assetspath = _banano.ASSETS_FOLDER;
 //BA.debugLineNum = 37;BA.debugLine="BP.ScriptsPath = BANano.SCRIPTS_FOLDER";
_bp._scriptspath = _banano.SCRIPTS_FOLDER;
 //BA.debugLineNum = 38;BA.debugLine="BP.StylesPath = BANano.STYLES_FOLDER";
_bp._stylespath = _banano.STYLES_FOLDER;
 //BA.debugLineNum = 39;BA.debugLine="BP.ScriptFile = BANano.JAVASCRIPT_NAME";
_bp._scriptfile = _banano.JAVASCRIPT_NAME;
 //BA.debugLineNum = 40;BA.debugLine="BP.Open(True)";
_bp._open(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 41;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public static String  _banano_ready() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub BANano_Ready";
 //BA.debugLineNum = 50;BA.debugLine="pgIndex.Init";
_pgindex._init /*String*/ ();
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
pgindex._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 5;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Public BANano As BANano 'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public AppName As String = \"viewpdf\"";
_appname = "viewpdf";
 //BA.debugLineNum = 8;BA.debugLine="Private Publish As String";
_publish = "";
 //BA.debugLineNum = 9;BA.debugLine="Private BP As BANanoPostProcessor";
_bp = new b4j.example.bananopostprocessor();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
}
