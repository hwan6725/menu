package project;

public class Pr {
public void menu1(){
		
		try {
			
			Thread.sleep(200);
		} catch (Exception e) {
		}
		int j=0;
		
		// 2번 반복
		while(j<2) {
		String[] choice = {
				"         ((     ((       메",
				"  ((     ))     ))      뉴" ,
				"   ))   ((      ((        고",
				"  ((    ))      ))      르",
				"   ))  ((                는",
				"___#________________  중",
				"\\\\\\ *            /// .",
				" \\\\\\            /// .",
				"  \\\\\\  *       ///  .",
				"  --------------- "
				    };

		for(int i=0; i<choice.length; i++) {
	
			System.out.println(choice[i]);
			} j++;
	
			try {
				
				Thread.sleep(600);
			} catch (Exception e) {
		}
	 }
 }
}
