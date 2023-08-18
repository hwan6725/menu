package project;

import java.util.Random;
import java.util.Scanner;

public class Toy {
	static Random random = new Random();
	static int bullet;
		
	public static void main(String[] args) {
		System.out.println("러시안룰렛 게임🔫");
		Scanner sc = new Scanner(System.in);
		int[] gun = { 0, 1, 2, 3, 4, 5 };
		int count = gun.length-1;
		bullet = random.nextInt(gun.length);
		int num=0;
		
		try {
			while (true) {
				System.out.println("1.게임 시작     2.게임 종료");
				num = sc.nextInt();
				if (num == 1) {
					System.out.println("게임을 시작하지");
					System.out.println("머리에 총을 겨냥하고 있습니다.");
					Game(num, count, gun, sc);
					break;
				} else if (num == 2) {
					System.out.println("겁쟁이!");
					continue;
				} else {
					System.out.println("1 또는 2를 눌러주세요");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력해 주세요.");
		}
	}
	
	public static void Game(int num, int count, int[] gun, Scanner sc) {
		int i = 0;
		
		try {
			while(true) {
				if(count == 0) {
					System.out.println("살았다!");
					break;
				}
				System.out.println("1.발사   2.거절");
				num = sc.nextInt();
				if (num == 1) {
					if(bullet == gun[i]) {
						System.out.println("빵! 사망.");
						break;
					} else{
						count--;
						System.out.println("한번 더?");
						System.out.println("남은 총알 : "+count+"발");
						i++;
					}
				} else if (num == 2) {
					if(i == 0) {
						System.out.println("거절을 거절");
						continue;
					}else {					
						System.out.println("쫄?");
						break;
					}
				} else {
					System.out.println("1 또는 2를 눌러주세요");
					continue;
				}
			}
		} catch (Exception e) {
			System.out.println("숫자를 입력해 주세요.");
		}
		
	}
}
