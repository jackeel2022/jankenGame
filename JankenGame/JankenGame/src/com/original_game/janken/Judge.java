package com.original_game.janken;

public class Judge {
	//じゃんけんの結果のテキストを取得するメソッド
	static String getResultText(int playerHand, int computerHand) {
	//じゃんけんの結果のテキストを代入する変数を初期化	
	String resultText = "";
	//じゃんけんの結果を出すための計算
	int result = (playerHand - computerHand + 3) % 3;
	//あいこのとき
	if (result == 0) {
		resultText = "あいこです！";
	}
	//プレイヤーの負けのとき
	else if (result == 1) {
		resultText = "残念！あなたの負けです！";
	}
	
	//プレイヤーが勝ちの時
	else if (result == 2) {
		resultText = "やったね！あなたの勝ちです！";
	}
	//結果のテキストを返す
    return resultText;
   }
}
