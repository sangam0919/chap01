package sec04;

/**
 *  key code를 반복적으로 입력 받는 예제
 *  @author 505-t
 */

import java.io.IOException;

public class Read03Continue {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * int keyCode; while(true) { keyCode = System.in.read();
		 * System.out.println("keyCode:" +keyCode); if(keyCode == 113) { // q = 113이면
		 * break; //keyCode가 113과 동일할 경우 실수 }
		 * 
		 * }
		 */

		int keyCode;
		char c;
		while (true) { // 계속해서 키를 입력받는다.
			System.out.println("===================================");
			System.out.println("영어 알파벳과 숫자를 입력하세요");

			// System.in.read() 변환값이 int type
			keyCode = System.in.read();
			c = (char) keyCode;
			System.in.read();         //두번쨰로 입력하는[CR]에 대응하는 13, 의미없는 숫자
			System.in.read();         //세번쨰로 입력하는[LR]에 대응하는 의미없는숫자 

			if (c >= '0' && c <= '9') { // 아스키코드 중에서 0~9 사이의 키가 눌렸는지
				System.out.printf("key- %c 에핑 문자 %d 입니다 \n", c, keyCode);
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				System.out.printf("key- %c 애핑 문자 %d 입니다. \n", c, keyCode);

			}
		}
	}

}
