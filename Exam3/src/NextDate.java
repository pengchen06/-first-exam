import java.util.Scanner;

public class NextDate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入日期(格式YYYY-MM-DD)：");
		String str = input.nextLine();
		if (isValidDate(str)) {
			System.out.println("日期正确");
			System.out.println("下一天为：" + nextday(str));
		} else {
			System.out.println("日期错误");
		}

	}

	public static String nextday(String str) {
		int year = Integer.parseInt(str.substring(0, 4));
		int month = Integer.parseInt(str.substring(5, 7));
		int day = Integer.parseInt(str.substring(8, 10));
		switch (month) {
		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:
			switch (day) {
			case 31:
				return year + "-" + (month + 1) + "-01";
			default:
				return year + "-" + month + "-" + (day + 1);
			}

		case 12:
			switch (day) {
			case 31:
				return (year + 1) + "-" + "01" + "-01";
			default:
				return year + "-" + month + "-" + (day + 1);
			}

		case 4:

		case 6:

		case 9:

		case 11:
			switch (day) {
			case 30:
				return year + "-" + (month + 1) + "-01";
			default:
				return year + "-" + month + "-" + (day + 1);
			}

		default:
			if (month == 2 && isyear(year)) {
				switch (day) {
				case 28:
					return year + "-" + (month + 1) + "-01";
				default:
					return year + "-" + month + "-" + (day + 1);
				}
			} else {
				switch (day) {
				case 29:
					return year + "-" + (month + 1) + "-01";
				default:
					return year + "-" + month + "-" + (day + 1);
				}
			}
		}

	}

	public static boolean isValidDate(String date) {

		int year;
		int month;
		int day;
		try {
			year = Integer.parseInt(date.substring(0, 4));

			month = Integer.parseInt(date.substring(5, 7));

			day = Integer.parseInt(date.substring(8, 10));
		} catch (Exception e) {
			// e.printStackTrace();
			return false;
		}
		if (year < 0) {
			return false;
		}
		if (month < 0 && month > 12) {
			return false;
		}
		if (!date.substring(4, 5).equals("-") || !date.substring(7, 8).equals("-")) {
			return false;
		}
		if (month == 2 && isyear(year) && day > 28) {
			return false;
		} else if (month == 2 && !isyear(year) && day > 29) {
			return false;
		} else if (month != 2 && day > monthday(month) && monthday(month) != -1) {
			return false;
		} else if (month != 2 && day > monthday(month) && monthday(month) == -1) {
			return false;
		} else {
			return true;
		}

	}

	public static boolean isyear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static int monthday(int month) {
		int day = 0;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return day = 31;

		case 4:
		case 6:
		case 9:
		case 11:
			return day = 30;
		default:
			return day = -1;
		}

	}
}
