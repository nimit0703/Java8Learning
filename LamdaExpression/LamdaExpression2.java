package Java8;

public class LamdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LamdaExpression lamda1 = new LamdaExpression() {

			@Override
			public void sum(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("lamda1 result :" + (a + b));
			}
		};

		lamda1.sum(10, 10);
		
		// after java 8
		LamdaExpression lamda2 = ( a, b)->System.out.println("lamda2 result :"+ (a+b));
		lamda2.sum(10,15);
	}

	
}
