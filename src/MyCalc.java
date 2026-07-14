
public class MyCalc {
	
	public static void main(String[] args) {
		MathOperation o = new MathOperation();
		o.add(10, 20);
		o.sub(100, 50); // providing incorrect value//
		o.getFactorial(); 
		o.multi(2, 3);
		o.divide(10, 2);
		o.power(2, 8);
		o.square(2);
		o.cube(3);
	}

}
