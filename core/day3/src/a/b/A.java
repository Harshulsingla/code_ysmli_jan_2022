package a.b;

public class A {
	private int i = 1;
	public int j = 2;
	protected int k = 3;

	public void fooA() {

		System.out.println("foo of class A");

	}

	void fooDefault() {
		System.out.println("fooDefault is a method of class A");
	}

	protected void fooDeProtected() {
		System.out.println("protected is a method of class A");
	}

	private void fooPrivate() {
		System.out.println("fooPrivate is a method of class A");
	}
}
