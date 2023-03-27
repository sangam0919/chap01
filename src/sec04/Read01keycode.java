package sec04;

/**
 * 키보드에서 캐릭터(char)를 읽어들이는 예제
 * import 구문으로 자바 API사용
 */

import java.io.IOException;

public class Read01keycode {

	public static void main(String[] args) throws IOException { // <--문제가 생기면 처리해주는 역할을 하는것 
		int keyCode;
		
		keyCode = System.in.read();  //키를 누르면 값을 가져오는 언어 
		System.out.println("keyCode:" + keyCode);
		
		keyCode = System.in.read();  //키를 누르면 값을 가져오는 언어 
		System.out.println("keyCode:" +keyCode);
		
		keyCode = System.in.read();  //키를 누르면 값을 가져오는 언어 
		System.out.println("keyCode:" +keyCode);
				
            
	}

}
