public class AyeAye {
	int i = 40;
	int j;

	public AyeAye() {
	setValue(i++);
	}

	void setValue(int inputValue) {
	int i = 20;
	j = i + 1;
	System.out.println("j = " + j);
	}
}