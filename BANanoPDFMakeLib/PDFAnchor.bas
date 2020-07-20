B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7
@EndOfDesignText@
'Custom BANano View class


#DesignerProperty: Key: Text, DisplayName: Text, FieldType: String, DefaultValue: , Description: Text on the element
#DesignerProperty: Key: Classes, DisplayName: Classes, FieldType: String, DefaultValue: , Description: Classes added to the HTML tag.
#DesignerProperty: Key: Style, DisplayName: Style, FieldType: String, DefaultValue: , Description: Styles added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Attributes, DisplayName: Attributes, FieldType: String, DefaultValue: , Description: Attributes added to the HTML tag. Must be a json String.
#DesignerProperty: Key: Href, DisplayName: Href, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: BackgroundColor, DisplayName: BackgroundColor, FieldType: String, DefaultValue: none , Description: , List: amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|green|grey|indigo|light-blue|light-green|lime|orange|pink|purple|red|teal|transparent|white|yellow|primary|secondary|accent|error|info|success|warning|none
#DesignerProperty: Key: Border, DisplayName: Border, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: Color, DisplayName: Color, FieldType: String, DefaultValue: none , Description: , List: amber|black|blue|blue-grey|brown|cyan|deep-orange|deep-purple|green|grey|indigo|light-blue|light-green|lime|orange|pink|purple|red|teal|transparent|white|yellow|primary|secondary|accent|error|info|success|warning|none
#DesignerProperty: Key: FontFamily, DisplayName: FontFamily, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: FontSize, DisplayName: FontSize, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: FontStyle, DisplayName: FontStyle, FieldType: String, DefaultValue:  , Description: , List: normal|italic|oblique|initial|inherit
#DesignerProperty: Key: FontWeight, DisplayName: FontWeight, FieldType: String, DefaultValue:  , Description: , List: normal|bold|bolder|lighter|initial|inherit
#DesignerProperty: Key: Height, DisplayName: Height, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: Margin, DisplayName: Margin, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: TextAlign, DisplayName: TextAlign, FieldType: String, DefaultValue:  , Description: , List: left|center|right|justify
#DesignerProperty: Key: TextDecoration, DisplayName: TextDecoration, FieldType: String, DefaultValue:  , Description: 
#DesignerProperty: Key: Width, DisplayName: Width, FieldType: String, DefaultValue:  , Description: 

Sub Class_Globals
Private BANano As BANano 'ignore
Private mName As String 'ignore
Private mEventName As String 'ignore
Private mCallBack As Object 'ignore
Private mTarget As BANanoElement 'ignore
Private mElement As BANanoElement 'ignore
Private mClasses As String = ""
Private mStyle As String = ""
Private mAttributes As String = ""
Private mText As String = ""
Private classList As Map
Private styleList As Map
Private attributeList As Map
Private mTagName As String = "a"
Private mHref As String = ""
Private mBackgroundColor As String = "none"
Private mBorder As String = ""
Private mColor As String = "none"
Private mFontFamily As String = ""
Private mFontSize As String = ""
Private mFontStyle As String = ""
Private mFontWeight As String = ""
Private mHeight As String = ""
Private mMargin As String = ""
Private mTextAlign As String = ""
Private mTextDecoration As String = ""
Private mWidth As String = ""
End Sub

'initialize the custom view
Public Sub Initialize (CallBack As Object, Name As String, EventName As String)
mName = Name.ToLowerCase
mEventName = EventName.ToLowerCase
mCallBack = CallBack
classList.Initialize
styleList.Initialize
attributeList.Initialize
End Sub

'Create view in the designer
Public Sub DesignerCreateView (Target As BANanoElement, Props As Map)
mTarget = Target
If Props <> Null Then
mClasses = Props.Get("Classes")
mAttributes = Props.Get("Attributes")
mStyle = Props.Get("Style")
mText = Props.Get("Text")
mHref = Props.Get("Href")
mBackgroundColor = Props.Get("BackgroundColor")
mBorder = Props.Get("Border")
mColor = Props.Get("Color")
mFontFamily = Props.Get("FontFamily")
mFontSize = Props.Get("FontSize")
mFontStyle = Props.Get("FontStyle")
mFontWeight = Props.Get("FontWeight")
mHeight = Props.Get("Height")
mMargin = Props.Get("Margin")
mTextAlign = Props.Get("TextAlign")
mTextDecoration = Props.Get("TextDecoration")
mWidth = Props.Get("Width")
End If

AddAttr("href", mHref)
AddStyle("background-color", mBackgroundColor)
AddStyle("border", mBorder)
AddStyle("color", mColor)
AddStyle("font-family", mFontFamily)
AddStyle("font-size", mFontSize)
AddStyle("font-style", mFontStyle)
AddStyle("font-weight", mFontWeight)
AddStyle("height", mHeight)
AddStyle("margin", mMargin)
AddStyle("text-align", mTextAlign)
AddStyle("text-decoration", mTextDecoration)
AddStyle("width", mWidth)
AddClass(mClasses)
setAttributes(mAttributes)
setStyles(mStyle)

'build and get the element
Dim strHTML As String = ToString
mElement = mTarget.Append(strHTML).Get("#" & mName)
'add events for the custom view, if any

End Sub

'return the generated html
Sub ToString As String
'build the 'class' attribute
Dim className As String = BANanoShared.JoinMapKeys(classList, " ")
AddAttr("class", className)
'build the 'style' attribute
Dim styleName As String = BANanoShared.BuildStyle(styleList)
AddAttr("style", styleName)
'build element internal structure
Dim iStructure As String = BANanoShared.BuildAttributes(attributeList)
Dim rslt As String = $"<${mTagName} id="${mName}" ${iStructure}>${mText}</${mTagName}>"$
Return rslt
End Sub

'returns the BANanoElement
public Sub getElement() As BANanoElement
Return mElement
End Sub

'returns the tag id
public Sub getID() As String
Return mName
End Sub

'add the element to the parent
public Sub AddToParent(targetID As String)
mTarget = BANano.GetElement("#" & targetID.ToLowerCase)
DesignerCreateView(mTarget, Null)
End Sub

'remove the component
public Sub Remove()
mElement.Remove
BANano.SetMeToNull
End Sub

'trigger an event
public Sub Trigger(event As String, params() As String)
If mElement <> Null Then
mElement.Trigger(event, params)
End If
End Sub

'add a class
public Sub AddClass(varClass As String)
If BANano.IsUndefined(varClass) Or BANano.IsNull(varClass) Then Return
If BANano.IsNumber(varClass) Then varClass = BANanoShared.CStr(varClass)
varClass = varClass.trim
if varClass = "" Then Return
If mElement <> Null Then mElement.AddClass(varClass)
Dim mItems As List = BANanoShared.StrParse(" ", varClass)
For Each mt As String In mItems
classList.put(mt, mt)
Next
End Sub

'add a class on condition
public Sub AddClassOnCondition(varClass As String, varCondition As Boolean, varShouldBe As Boolean)
If BANano.IsUndefined(varCondition) Or BANano.IsNull(varCondition) Then Return
If varShouldBe <> varCondition Then Return
If BANano.IsUndefined(varClass) Or BANano.IsNull(varClass) Then Return
If BANano.IsNumber(varClass) Then varClass = BANanoShared.CStr(varClass)
varClass = varClass.trim
If varClass = "" Then Return
If mElement <> Null Then mElement.AddClass(varClass)
Dim mItems As List = BANanoShared.StrParse(" ", varClass)
For Each mt As String In mItems
classList.put(mt, mt)
Next
End Sub

'add a style
public Sub AddStyle(varProp As String, varStyle As String)
If BANano.IsUndefined(varStyle) Or BANano.IsNull(varStyle) Then Return
If BANano.IsNumber(varStyle) Then varStyle = BANanoShared.CStr(varStyle)
If varProp = "background-color" And varStyle = "none" Then Return
If varProp = "color" And varStyle = "none" Then Return
If mElement <> Null Then
Dim aStyle As Map = CreateMap()
aStyle.put(varProp, varStyle)
Dim sStyle As String = BANano.ToJSON(aStyle)
mElement.SetStyle(sStyle)
End If
styleList.put(varProp, varStyle)
End Sub

'add an attribute
public Sub AddAttr(varProp As String, varValue As String)
If BANano.IsUndefined(varValue) Or BANano.IsNull(varValue) Then Return
If BANano.IsNumber(varValue) Then varValue = BANanoShared.CStr(varValue)
If mElement <> Null Then mElement.SetAttr(varProp, varValue)
attributeList.put(varProp, varValue)
End Sub

'returns the class names
Public Sub getClasses() As String
Dim sbClass As StringBuilder
sbClass.Initialize
For each k As String in classList.Keys
sbClass.Append(k).Append(" ")
Next
mClasses = sbClass.ToString
Return mClasses
End Sub

'set the style use a valid JSON string with {}
public Sub setStyle(varStyle As String)
If mElement <> Null Then
mElement.SetStyle(varStyle)
End If
Dim mres as Map = BANano.FromJSON(varStyle)
For each k As String in mres.Keys
Dim v As String = mres.Get(k)
styleList.put(k, v)
Next
End Sub

'returns the style as JSON
public Sub getStyle() As String
Dim sbStyle As StringBuilder
sbStyle.Initialize
sbStyle.Append("{")
For each k As String in styleList.Keys
Dim v As String = styleList.Get(k)
sbStyle.Append(k).Append(":").Append(v).Append(",")
Next
sbStyle.Append("}")
mStyle = sbStyle.ToString
Return mStyle
End Sub

'sets the attributes
public Sub setAttributes(varAttributes As String)
Dim mItems As List = BANanoShared.StrParse(";", varAttributes)
For Each mt As String In mItems
Dim k As String = BANanoShared.MvField(mt,1,"=")
Dim v As String = BANanoShared.MvField(mt,2,"=")
If mElement <> Null Then mElement.SetAttr(k, v)
attributeList.put(k, v)
Next
End Sub

'sets the styles from the designer
public Sub setStyles(varStyles As String)
Dim mItems As List = BANanoShared.StrParse(",", varStyles)
For Each mt As String In mItems
Dim k As String = BANanoShared.MvField(mt,1,":")
Dim v As String = BANanoShared.MvField(mt,2,":")
AddStyle(k, v)
Next
End Sub

'returns the attributes
public Sub getAttributes() As String
Dim sbAttr As StringBuilder
sbAttr.Initialize
For each k As String in attributeList.Keys
Dim v As String = attributeList.Get(k)
sbAttr.Append(k).Append("=").Append(v).Append(";")
Next
mAttributes = sbAttr.ToString
Return mAttributes
End Sub

'sets the text
public Sub setText(varText As String)
If mElement <> Null Then
mElement.SetHTML(BANano.SF(varText))
End If
mText = varText
End Sub

'returns the text
public Sub getText() As String
Return mText
End Sub

public Sub setHref(varHref As String)
AddAttr("href", varHref)
mHref = varHref
End Sub

public Sub getHref() As String
Return mHref
End Sub

public Sub setBackgroundColor(varBackgroundColor As String)
AddStyle("background-color", varBackgroundColor)
mBackgroundColor = varBackgroundColor
End Sub

public Sub getBackgroundColor() As String
Return mBackgroundColor
End Sub

public Sub setBorder(varBorder As String)
AddStyle("border", varBorder)
mBorder = varBorder
End Sub

public Sub getBorder() As String
Return mBorder
End Sub

public Sub setColor(varColor As String)
AddStyle("color", varColor)
mColor = varColor
End Sub

public Sub getColor() As String
Return mColor
End Sub

public Sub setFontFamily(varFontFamily As String)
AddStyle("font-family", varFontFamily)
mFontFamily = varFontFamily
End Sub

public Sub getFontFamily() As String
Return mFontFamily
End Sub

public Sub setFontSize(varFontSize As String)
AddStyle("font-size", varFontSize)
mFontSize = varFontSize
End Sub

public Sub getFontSize() As String
Return mFontSize
End Sub

public Sub setFontStyle(varFontStyle As String)
AddStyle("font-style", varFontStyle)
mFontStyle = varFontStyle
End Sub

public Sub getFontStyle() As String
Return mFontStyle
End Sub

public Sub setFontWeight(varFontWeight As String)
AddStyle("font-weight", varFontWeight)
mFontWeight = varFontWeight
End Sub

public Sub getFontWeight() As String
Return mFontWeight
End Sub

public Sub setHeight(varHeight As String)
AddStyle("height", varHeight)
mHeight = varHeight
End Sub

public Sub getHeight() As String
Return mHeight
End Sub

public Sub setMargin(varMargin As String)
AddStyle("margin", varMargin)
mMargin = varMargin
End Sub

public Sub getMargin() As String
Return mMargin
End Sub

public Sub setTextAlign(varTextAlign As String)
AddStyle("text-align", varTextAlign)
mTextAlign = varTextAlign
End Sub

public Sub getTextAlign() As String
Return mTextAlign
End Sub

public Sub setTextDecoration(varTextDecoration As String)
AddStyle("text-decoration", varTextDecoration)
mTextDecoration = varTextDecoration
End Sub

public Sub getTextDecoration() As String
Return mTextDecoration
End Sub

public Sub setWidth(varWidth As String)
AddStyle("width", varWidth)
mWidth = varWidth
End Sub

public Sub getWidth() As String
Return mWidth
End Sub


