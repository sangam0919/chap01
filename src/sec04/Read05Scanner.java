package sec04;


 import java.util.Scanner;
public class Read05Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scanner = new Scanner(System.in);
         
         System.out.printf("첫번쨰 수:");
         String strNum1 =scanner.nextLine();
         
         System.out.printf("두번쨰 수:");
        
         String strNum2 = scanner.nextLine();
         //읽어들인 문자열을 숫자를 변환
         int num1 = Integer.parseInt(strNum1);		
         int num2 = Integer.parseInt(strNum2);		
		int result = num1 + num2;
		System.out.println("덧셈 결과:"+ result);
	}

}
