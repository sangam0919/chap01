package chap01;

public class VarEx01 {

	public static void main(String[] args) {
		 int year = 0;  //변수 선언과 동시에 초기화(변수 저장 공간 생선 ->사용가능)
		 int age  = 14; //변수 선언과 동시에 초기화(변수 저장 공간 생선 ->사용가능)
		 int tempVar	;   //변수 선언한(실제로 변수 저장 공간 메모리에 생성 안됨. 사용불가)
		 
		 System.out.println(year);
		 System.out.println(age);
		 //age = tempVar + 10//초기화 안된 상태에서 사용 불가 오류)
		 year = age + 2000;  //변수 age의 값에 2000을 더해서 변수 year에 저장
		 age  = age + 1;     //변수 age 에 저장된 값으 1증가시킨다
		 tempVar = age;      //변수의 값을 복사할 수 있다(변수 초기화되면서 생성됨)

		 System.out.println(year);
		 System.out.println(age);
		 System.out.println(tempVar); //변수가 생성되었으므로 사용가능
		 // TODO Auto-generated method stub
        
	}

}
