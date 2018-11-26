public class driver {
	public static void main(String[]args) {
		MyString deeble = new MyString("String");
		System.out.println(deeble.charAt(0));
		System.out.println(deeble.charAt(1));
		System.out.println(deeble.charAt(2));
		System.out.println(deeble.charAt(3));
		System.out.println(deeble.charAt(4));
		System.out.println(deeble.charAt(5));
		System.out.println(deeble.length());
		System.out.println(deeble.subSequence(0,6));
		System.out.println(deeble.subSequence(0,10));
	}
}