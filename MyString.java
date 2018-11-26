public class MyString {
	private char[]data;
	public MyString(CharSequence s) {
		int length = s.length();
		data = new char[length];
		for (int i = 0; i < length; i++) {
			data[i] = s.charAt(i);
		} 
	}
	public int length() {
		return data.length;
	}
	public char charAt(int i) {
		try {
			return data[i];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		}
	}

}