import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入工资：");
		double m = input.nextDouble() - 3500;
		if (m <= 0) {
			System.out.println("所需要缴纳的税费为:" + 0 + "元");
		} else if (m <= 1500) {
			System.out.println("所需要缴纳的税费为:" + m * 0.03 + "元");
		} else if (m <= 4500) {
			System.out.println("所需要缴纳的税费为:" + (45 + (m - 1500) * 0.1) + "元");
		} else if (m <= 9000) {
			System.out.println("所需要缴纳的税费为:" + (345 + (m - 4500) * 0.2) + "元");
		} else if (m <= 35000) {
			System.out.println("所需要缴纳的税费为:" + (1245 + (m - 9000) * 0.25) + "元");
		} else if (m <= 55000) {
			System.out.println("所需要缴纳的税费为:" + (6445 + (m - 35000) * 0.3) + "元");
		} else if (m <= 80000) {
			System.out.println("所需要缴纳的税费为:" + (12445 + (m - 55000) * 0.35) + "元");
		} else {
			System.out.println("所需要缴纳的税费为:" + (21195 + (m - 80000) * 0.45) + "元");
		}
	}
}
