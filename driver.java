public class driver {
	public static void main(String[]args) {
		MyString deeble = new MyString("Stringb");
		System.out.println(deeble.charAt(0));
		System.out.println(deeble.charAt(1));
		System.out.println(deeble.charAt(2));
		System.out.println(deeble.charAt(3));
		System.out.println(deeble.charAt(4));
		System.out.println(deeble.charAt(5));
		System.out.println(deeble.length());
		System.out.println(deeble.subSequence(0,6));
		System.out.println(deeble.toString());
		System.out.println(deeble.compareTo("Stringa"));
		System.out.println(deeble.compareTo("Stringc"));
		System.out.println(deeble.compareTo("Stringb"));
		System.out.println(deeble.compareTo("Stringba"));
		System.out.println(deeble.compareTo("String"));
	}
}