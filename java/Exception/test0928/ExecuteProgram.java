package test0928;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExecuteProgram {

	public static String message;

	public static int addition(int a, int b) {

		return a + b;

	}

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("숫자를 입력해주세요");
			String str1 = input.readLine();
			String str2 = input.readLine();
			ExceptionDTO dto = new ExceptionDTO();
			try {
				dto.setA(str1);
				dto.setB(str2);
				int sum = addition(dto.getA(), dto.getB());
				System.out.println("입력하신 수의 합은 : " + sum);

			} catch (CharException | PeriodException | SpacingException e) {
				System.out.println(e.getMessage() + "\n 다시 입력해주세요.");
			} finally {
				while (true) {
					System.out.println("계속 하시려면 'next' , 끝내시려면 'exit' 를 입력해주세요.");
					message = input.readLine();

					if (message.contentEquals("next")) {
						break;
					} else if (message.contentEquals("exit")) {
						System.out.println("프로그램을 종료합니다.");
						System.exit(0);
					} else {
						System.out.println("입력하신 " + message + "는 잘못된 형태입니다.");
						continue;
					}
				}
			}
		}
	}
}
