import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����빤�ʣ�");
		double m = input.nextDouble() - 3500;
		if (m <= 0) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + 0 + "Ԫ");
		} else if (m <= 1500) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + m * 0.03 + "Ԫ");
		} else if (m <= 4500) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (45 + (m - 1500) * 0.1) + "Ԫ");
		} else if (m <= 9000) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (345 + (m - 4500) * 0.2) + "Ԫ");
		} else if (m <= 35000) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (1245 + (m - 9000) * 0.25) + "Ԫ");
		} else if (m <= 55000) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (6445 + (m - 35000) * 0.3) + "Ԫ");
		} else if (m <= 80000) {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (12445 + (m - 55000) * 0.35) + "Ԫ");
		} else {
			System.out.println("����Ҫ���ɵ�˰��Ϊ:" + (21195 + (m - 80000) * 0.45) + "Ԫ");
		}
	}
}
