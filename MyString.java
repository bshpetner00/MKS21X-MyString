

public class MyString implements CharSequence{
	private char[]data;
	public myString(CharSequence s) {
		int length = s.length;
		data = new char[len];
		for (int i = 0; i < length; i++) {
			data[i] = s.charAt(i);
		} 
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