package zadaci_06_03_2017;

public class MyStringBuilder1 {
	private String s;

	public MyStringBuilder1(String s) {
		this.s = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		this.s = this.s + s;
		return new MyStringBuilder1(this.s );
	}

	public MyStringBuilder1 append(int i) {
		String temp = "";
		temp += i + "";
		temp = this.s + temp;
		return new MyStringBuilder1(temp);
	}

	public int length() {
		return s.length();
	}

	public char charAt(int index) {
		return s.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				newStr += (char)(s.charAt(i) + 32) + "";
			}
		}
		return new MyStringBuilder1(newStr);
	}

	public MyStringBuilder1 substring(int begin, int end) {
		String newStr = "";
		for (int i = begin; i < end; i ++) {
			newStr += s.charAt(i) + "";
		}
		return new MyStringBuilder1(newStr);
	}

	public String toString() {
		return s;
	}
}