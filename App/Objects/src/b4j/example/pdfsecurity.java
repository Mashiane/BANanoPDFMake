package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfsecurity extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfsecurity", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfsecurity.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _userpassword = "";
public String _ownerpassword = "";
public boolean _printinghr = false;
public boolean _printinglr = false;
public boolean _modifying = false;
public boolean _copying = false;
public boolean _annotating = false;
public boolean _fillingforms = false;
public boolean _contentaccessibility = false;
public boolean _documentassembly = false;
public anywheresoftware.b4a.objects.collections.Map _permissions = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.pdf _pdf = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public userPassword As String";
_userpassword = "";
 //BA.debugLineNum = 3;BA.debugLine="Public ownerPassword As String";
_ownerpassword = "";
 //BA.debugLineNum = 4;BA.debugLine="Public printingHR As Boolean";
_printinghr = false;
 //BA.debugLineNum = 5;BA.debugLine="Public printingLR As Boolean";
_printinglr = false;
 //BA.debugLineNum = 6;BA.debugLine="Public modifying As Boolean";
_modifying = false;
 //BA.debugLineNum = 7;BA.debugLine="Public copying As Boolean";
_copying = false;
 //BA.debugLineNum = 8;BA.debugLine="Public annotating As Boolean";
_annotating = false;
 //BA.debugLineNum = 9;BA.debugLine="Public fillingForms As Boolean";
_fillingforms = false;
 //BA.debugLineNum = 10;BA.debugLine="Public contentAccessibility As Boolean";
_contentaccessibility = false;
 //BA.debugLineNum = 11;BA.debugLine="Public documentAssembly As Boolean";
_documentassembly = false;
 //BA.debugLineNum = 12;BA.debugLine="Private permissions As Map";
_permissions = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 30;BA.debugLine="If printingHR Then permissions.Put(\"printing\", \"h";
if (_printinghr) { 
_permissions.Put((Object)("printing"),(Object)("highResolution"));};
 //BA.debugLineNum = 31;BA.debugLine="If printingLR Then permissions.Put(\"printing\", \"l";
if (_printinglr) { 
_permissions.Put((Object)("printing"),(Object)("lowResolution"));};
 //BA.debugLineNum = 32;BA.debugLine="permissions.Put(\"modifying\", modifying)";
_permissions.Put((Object)("modifying"),(Object)(_modifying));
 //BA.debugLineNum = 33;BA.debugLine="permissions.Put(\"copying\", copying)";
_permissions.Put((Object)("copying"),(Object)(_copying));
 //BA.debugLineNum = 34;BA.debugLine="permissions.Put(\"annotating\", annotating)";
_permissions.Put((Object)("annotating"),(Object)(_annotating));
 //BA.debugLineNum = 35;BA.debugLine="permissions.Put(\"fillingForms\", fillingForms)";
_permissions.Put((Object)("fillingForms"),(Object)(_fillingforms));
 //BA.debugLineNum = 36;BA.debugLine="permissions.Put(\"contentAccessibility\", contentAc";
_permissions.Put((Object)("contentAccessibility"),(Object)(_contentaccessibility));
 //BA.debugLineNum = 37;BA.debugLine="permissions.Put(\"documentAssembly\", documentAssem";
_permissions.Put((Object)("documentAssembly"),(Object)(_documentassembly));
 //BA.debugLineNum = 38;BA.debugLine="Return permissions";
if (true) return _permissions;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 17;BA.debugLine="permissions.Initialize";
_permissions.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="printingHR = True";
_printinghr = __c.True;
 //BA.debugLineNum = 19;BA.debugLine="printingLR = False";
_printinglr = __c.False;
 //BA.debugLineNum = 20;BA.debugLine="copying = True";
_copying = __c.True;
 //BA.debugLineNum = 21;BA.debugLine="annotating = True";
_annotating = __c.True;
 //BA.debugLineNum = 22;BA.debugLine="fillingForms = True";
_fillingforms = __c.True;
 //BA.debugLineNum = 23;BA.debugLine="contentAccessibility = True";
_contentaccessibility = __c.True;
 //BA.debugLineNum = 24;BA.debugLine="documentAssembly = True";
_documentassembly = __c.True;
 //BA.debugLineNum = 25;BA.debugLine="userPassword = Null";
_userpassword = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 26;BA.debugLine="ownerPassword = Null";
_ownerpassword = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
