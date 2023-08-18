package project;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Project {

	public static void main(String[] args){
		System.out.println("====================================");
		System.out.println("1. 한식	     2. 중식 	3. 일식" );
		System.out.println("4. 양식 	     5. 해장  	6. 간편식");
		System.out.println("7. 탕,찌개     8. 기타 	9. 2개 입력");
		System.out.println("원하는 메뉴(1~9)를 선택하세요.(종료:0)");
		System.out.println("====================================");
		
		Scanner scanner = new Scanner(System.in);
		// Pr 객체 생성
		Pr menu2 = new Pr();
		// 9 입력 받았을 때 사용할 1차원 배열 생성
		String[] choice = new String[2];
		String a,b;
		
		// 0~8 입력 받았을 때 사용할 2차원 배열 생성
		String[][] menu = new String[][] {	
			{"종료합니다."},
			{"불고기", "오징어 두루치기", "닭볶음탕", "쌈밥", "비빔밥", "생선구이",
		     "낙지볶음", "게장", "떡갈비"},
			{"짜장면", "짬뽕", "볶음밥", "탕수육", "마파두부", 
			 "양장피", "깐풍기", "유린기", "고추잡채"},
			{"초밥", "라멘", "낫또", "오니기리", "덮밥", "우동",
			 "야키니쿠", "메밀소바", "돈카츠"},
			{"토마토 스파게티", "봉골레", "크림 파스타", "피자",
			 "함박 스테이크", "리조또", "스테이크", "햄버거", "시저 샐러드"},
			{"북엇국", "콩나물국밥", "순대국", "뼈해장국", "우거지국", 
	         "선지해장국", "올갱이국", "라면", "물냉면"},
			{"편의점 도시락", "샌드위치", "토스트", "샐러드", "김밥",
			 "떡볶이", "핫도그", "밥버거", "시리얼"},
			{"김치찌개", "순두부찌개", "된장찌개", "부대찌개", "청국장",
		     "동태찌개", "갈비탕", "추어탕", "삼계탕"},
			{"쌀국수", "회", "카레", "찜닭", "닭발", "칼국수",
			 "아구찜", "닭갈비", "월남쌈"}
		};
		
		try {
			//사용자들로부터 입력 받을 변수 num
			int num = scanner.nextInt();  
	        Random rand = new Random();
	        scanner.nextLine();
	        
	        if(num == 0) {				 
	        	System.out.println("종료합니다.");
	        	return;
	        }else if(num == 9){
	        	System.out.println("메뉴 2가지를 입력해주세요.");
	        	a = scanner.nextLine();
	    		b = scanner.nextLine();
	    		// choice 배열에 인덱스 값 할당
	    		choice[0] = a;			
	    		choice[1] = b;
	    		String result = choice[rand.nextInt(choice.length)];
	        	menu2.menu1();
	        	System.out.println();
	        	System.out.println("<오늘 메뉴는 " + result+ "(이)다!>");
	        	return;
	        }else {
	        	menu2.menu1();
	        	System.out.println();
	        	// 행 인덱스에 입력 받은 값, 입력 받은 값에 따른 열 인덱스에서 값 추출 
	        	String result2 = menu[num][rand.nextInt(menu[num].length)];
	        	System.out.println("<오늘 메뉴는 " + result2+ "(이)다!>");
	        	return;
		    }
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("0~9번까지 입력해주세요.");
		} catch(InputMismatchException e) {
			System.out.println("숫자로 입력해주세요.");
		} catch(Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
			System.out.println("원인 : " + e.getMessage());
		} 
		scanner.close();
	}
}
