B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private options As Map
	Public layout As String
	Public lightHorizontalLines As Boolean
	Public noBorders As Boolean
	Public headerLineOnly As Boolean
	Public headerRows As Int
	Private table As Map
	Private widths As List
	Private heights As List
	Private hdr As List
	Private body As List
	Private rows As List
	Public style As PDFStyle
End Sub

'Initializes the table
Public Sub Initialize As PDFTable
	options.Initialize 
	lightHorizontalLines = Null
	headerLineOnly = Null
	noBorders = Null
	headerRows = Null
	table.Initialize 
	widths.Initialize 
	hdr.Initialize 
	body.Initialize 
	rows.Initialize 
	style.Initialize 
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFTable
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	options.Put("absolutePosition", opt)
	Return Me
End Sub


'set widths for each column
Sub SetWidths(w As List) As PDFTable
	For Each k As String In w
		widths.Add(k)
	Next
	Return Me
End Sub

'set heights for each column
Sub SetHeights(h As List) As PDFTable
	For Each k As String In h
		heights.Add(k)
	Next
	Return Me
End Sub

'set column names
Sub SetColumnNames(names As List) As PDFTable
	For Each k As String In names
		hdr.Add(k)
	Next
	Return Me
End Sub

'add a column to the table
Sub AddColumn(colName As String, colWidth As Object, colHeight As Object) As PDFTable
	hdr.Add(colName)
	If colWidth <> Null Then widths.Add(colWidth)
	If colHeight <> Null Then heights.Add(colHeight)
	Return Me
End Sub

'add a row
Sub AddRow(rowData As List) As PDFTable
	rows.Add(rowData)
	Return Me
End Sub

'add a row using pdf row
Sub AddRow1(row As PDFRow) As PDFTable
	rows.Add(row.Content)
	Return Me
End Sub

'get the contents of the table
Sub getContent As Map
	If lightHorizontalLines <> Null Then options.Put("layout", "lightHorizontalLines")
	If noBorders <> Null Then options.Put("layout", "noBorders")
	If headerLineOnly <> Null Then options.Put("layout", "headerLineOnly")
	'
	If headerRows <> Null Then table.Put("headerRows", headerRows)
	If widths.Size > 0 Then table.Put("widths", widths)
	If heights.Size > 0 Then table.Put("heights", heights)
	'add the headers
	If hdr.Size > 0 Then body.Add(hdr)
	For Each lst As List In rows
		body.Add(lst)
	Next
	table.Put("body", body)
	options.Put("table", table)
	style.Include(options)
	Return options
End Sub