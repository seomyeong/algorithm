package task;

import java.util.Scanner;

/**
 * 값을 입력받는대로 계산해주는 게산기
 * 숫자 2개랑 연산기호 입력받아서 계산 결과 출력 (ex: 2, 2, + 입력 받으면 4 출력) 
 * @author 82108
 *
 */
public class Calculator {
	public static void main(String[] args) {
		Calculator car = new Calculator();
		car.calculator_process();
	}
	
	
	int num1, num2;
	String operator;
	int result;
	
	public void calculator_process() {
		System.out.println("----계산기를 실행합니다----");
		System.out.println("이 계산기는 두개의 값만을 받아 계산을 실행합니다.");
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("계산할 숫자를 입력하세요. >");
		num1=s1.nextInt();
		
		Scanner op = new Scanner(System.in);
		System.out.print("+, -, *, / 중 원하는 연산자를 입력하세요.");
		operator=op.nextLine();
//		if(operator != "+") {
//			System.out.println("잘못 입력하셨습니다. 계산기를 다시 실행하세요.");
//			return;
//		}
		
		System.out.print("계산할 숫자를 입력하세요. >");
		
		Scanner s2 = new Scanner(System.in);
		num2=s2.nextInt();
		
		System.out.println("----계산을 수행합니다----");
		
		switch(operator) {
		case "+":
			operator = "+";
			result = (int)(num1+num2);
			
			break;
		case "-":
			operator = "-";
			result = (int)(num1-num2);
			break;
		case "*":
			operator="*";
			result = (int)(num1*num2);
			break;
		case "/":
			operator="/";
			result = (int)(num1/num2);
		}
		
		System.out.println(num1+" "+operator+" "+num2+" = "+result);
		
	}
}
