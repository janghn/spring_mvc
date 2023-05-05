
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator();
//		calc.add();
		
		
		int result =0;
		try {
			result = Calculator.add(3,4);
			
			result = Calculator.sub(3,4);
			
			
		}catch(ExceptionOver e){
			System.out.println(e.getMessage());
			
		}catch(Exception e) {
			
		}finally {
			System.out.println("입력값에 오류가 있습니다");
		}
		
		
		result = Calculator.multi(3,4);
		result = Calculator.div(3,4);

	}

}
