package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Action extends FormatError {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 入力
	String action() {
		String in = "";
		System.out.print(" > ");

		try {
			in = br.readLine();
			// 途中終了
			if ("exit".equals(in)) {
				System.out.println("*-------------終了--------------------*");
				System.exit(1);
			}
			// 入力なしは再帰呼び出し
			if ("".equals(in)) {
				System.out.print("入力してください");
				in = action();
			} else if (in.length() > 1) {
				// 1文字のみ
				System.out.print("一文字のみ有効");
				in = action();
			} else {
				// 数値変換
				if (NumFormatError(in)) {
					// 数値変換できない場合
					System.out.print("無効な文字");
					in = action();
				}
			}
		} catch (IOException e) {
			System.out.println("入力エラー >" + e);
		}

		return in;
	}

	// user入力やり直し
	boolean enter() {
		try {
			String in = br.readLine();
			if ("".equals(in)) {
				return false;
			} else {
				return true;
			}
		} catch (IOException e) {
			System.out.println("Error" + e);
		}
		return true;
	}

}
