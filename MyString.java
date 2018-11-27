//Ethan helped me brainstorm on planning out the structure of compareTo before I began writing code for it;
public class MyString implements CharSequence, Comparable<CharSequence>{
	private char[]data;
	//the mighty constructor;
	public MyString(CharSequence s) {
		int length = s.length();
		data = new char[length];
		for (int i = 0; i < length; i++) {
			data[i] = s.charAt(i);
		} 
	}
	//returns the length;
	public int length() {
		return data.length;
	}
	//returns character at specified index;
	public char charAt(int i) {
		try {
			return data[i];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		}
	}
	//returns sequence of chars in given MyString from start to end, inclusve and exclusive respectively;
	public CharSequence subSequence(int start, int end) {
		String sequence = "";
		try {
			for (int i = start; i < end; i++ ) {
				sequence += data[i];
			}
			return sequence;
		}
		catch (ArrayIndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		}
	}
	//returns a direct string copy of MyString;
	public String toString() {
		String s = "";
		for (int i = 0; i < data.length; i++) {
			s += data[i];
		}
		return s;
	}

	//compares each sequence to determine which is greater or lesser (if either) in terms of each's character's ASCII values
	public int compareTo(CharSequence s) {
		if (s == null) {
			throw new NullPointerException();
		}
		int dis = this.length();
		int dat = s.length();
		if (s.toString().equals(this.toString())) {
			return 0;
		}
		if (dis == dat) {
			for (int i = 0; i < dis; i++) {
				if (this.charAt(i) != s.charAt(i)) {
					return this.charAt(i) - s.charAt(i);
				}
			}
			return this.charAt(dis-1) - s.charAt(dis-1);
		}

		if (dis > dat) {
			for (int i = 0; i < dat; i++) {
				if (this.charAt(i) != s.charAt(i)) {
					return this.charAt(i) - s.charAt(i);
				}
			}
		}

		else {
			for (int i = 0; i < dis; i++) {
				if (this.charAt(i) != s.charAt(i)) {
					return this.charAt(i) - s.charAt(i);
				}
			}
		}
		//if one string is part of the other string, return the difference in length between this and s
		return this.length() - s.length();
	}

}