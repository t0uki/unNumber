# unNumber
Javaで作成した数当てゲーム

	ランダムに決められた数字3桁をuserが入力して当てるゲーム


開発環境

	⁃Eclipse 4.6 Neon for Mac OS X / Java version 1.8.0_111


コメント

	・Javaの練習に作成してみました参考にどうぞ
	・もっとシンプルにできると思いますが今の技量ではこれが限界でした。

仕様

	⁃	CUI型の数当てゲーム
	⁃	数字は3桁
	⁃	数字はゲームを始めるたびに毎回異なる(各桁0～9の範囲)
	⁃	userが桁ごとの数字を入力
	⁃	桁も数字も当たればHIT,数字のみ当たり桁が違う場合はBROW
	⁃	全部HITならクリア
	⁃	数字の表示は”■　■　■”HITした場所のみ数字が表示される
	⁃	現在の数字3桁、userが入力した3桁、ターン数、HIT,BROWの数を毎回表示する
	⁃	20回でクリアできない場合はuserの負け


パッケージ構成 unNumber directory

	|-main
	|   |_ Main.java
	|
	|-proccess
	|   |_ UnNumberSys.java
	|   |_ JudgNum.java
	|   |_ Action.java
	|   |_ FormatError.java
	|
	|-state
	    |_ Number.java

	    
説明

	・main.java
		開始時と終了時にテキスト出力。
		処理はUnNumberSys.java

	・UnNumberSys.java
		入力
		ターン数カウント、表示
		判定はJudgNum.java
		現在の数字3桁、userが入力した数字3桁、HIT,BROWの数表示
		途中終了処理(Action.java)
		
	・JudgNum.java
		コンストラクタでNumberインスタンス化
		HIT,BROW判定
		現在のHIT,BROWとそれに基づく数字表示
		
	・Action.java
		入力なし、文字数オーバー(1桁ごと1文字)、数値以外の入力判定
		途中終了処理
	
	・FormatError.java
		入力された文字を数値変換
		例外(NumberFormatException)が発生した場合true,正常はfalse
	
	・Number.java
		コンストラクタ呼び出しでランダムな数字3桁を作成
