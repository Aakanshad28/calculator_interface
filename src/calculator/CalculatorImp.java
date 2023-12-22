package calculator;
import java.util.List;
public class CalculatorImp implements Calculation{
	@Override
	public int addition(int n1, int n2) {
		
		return n1+n2;
	}

	@Override
	public int subtraction(int n1, int n2) {
		
		return n1-n2;
	}

	@Override
	public int multiplication(int n1, int n2) {
		
		return n1*n2;
	}

	@Override
	public int division(int n1, int n2) throws ArithmeticException {
		
		return n1/n2;
	}

}
