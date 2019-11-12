B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.8
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public MyScene As PhaserScene
	Public po1 As PhaserObject
End Sub

'the game title
Sub Initialize(game As BANanoPhaser)
	MyScene = game.CreateScene("MyScene")
	MyScene.SetOnPreload(Me, "onPreLoad")
	MyScene.SetOnCreate(Me, "onCreate")
	MyScene.SetOnUpdate(Me, "onUpdate")
End Sub

Sub onPreload
End Sub

Sub onCreate
End Sub

Sub onUpdate
End Sub