package calculator;

public interface Calculation {
	public int addition(int n1, int n2);

	public int subtraction(int n1, int n2);

	public int multiplication(int n1, int n2);

	public int division(int n1, int n2) throws ArithmeticException;

}
