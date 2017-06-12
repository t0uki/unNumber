package process;

class FormatError {
	// その他の例外エラー 随時追加可能

	protected boolean NumFormatError(String in) {
		try {
			Integer.parseInt(in);
			return false;
		} catch (NumberFormatException e) {
			return true;
		}
	}
	/*
	 * 論理値で返す。呼び出し側はif(FormatError()) trueの場合は例外発生、falseは正常
	 */
}
