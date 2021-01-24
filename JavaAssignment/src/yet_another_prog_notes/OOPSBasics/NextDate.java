package YetAnotherProgNotes.OOPSBasics;

import java.util.*;

public class NextDate {

	static boolean isLeap(int y) {
		if (y % 100 != 0 && y % 4 == 0 || y % 400 == 0)
			return true;

		return false;
	}

	// number of days passed from the beginning of the current year
	static int offsetDays(int date, int month, int year) {
		int offset = date;

		if (month - 1 == 11)
			offset += 335;
		if (month - 1 == 10)
			offset += 304;
		if (month - 1 == 9)
			offset += 273;
		if (month - 1 == 8)
			offset += 243;
		if (month - 1 == 7)
			offset += 212;
		if (month - 1 == 6)
			offset += 181;
		if (month - 1 == 5)
			offset += 151;
		if (month - 1 == 4)
			offset += 120;
		if (month - 1 == 3)
			offset += 90;
		if (month - 1 == 2)
			offset += 59;
		if (month - 1 == 1)
			offset += 31;

		// adding extra one day of leap year to offset value
		if (isLeap(year) && month > 2)
			offset += 1;

		return offset;
	}

	static int[] findDateAndMonth(int resultOffset, int year) {
		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (isLeap(year))
			month[2] = 29;

		int i;
		for (i = 1; i <= 12; i++) {
			if (resultOffset <= month[i])
				break;
			resultOffset = resultOffset - month[i];
		}

		int dateMonth[] = new int[2];
		dateMonth[0] = resultOffset;
		dateMonth[1]= i;
		return dateMonth;
	}

	static void addDays(int date, int month, int year, int numOfDays) {
		int offset = offsetDays(date, month, year);
		int remainingDays = isLeap(year) ? (366 - offset) : (365 - offset);

		int resultYear, resultOffset = 0;
		if (numOfDays <= remainingDays) {
			resultYear = year;
			resultOffset = offset + numOfDays;
		}

		else {
			numOfDays -= remainingDays;
			resultYear = year + 1;
			int resultYear_days = isLeap(resultYear) ? 366 : 365;
			while (numOfDays >= resultYear_days) {
				numOfDays -= resultYear_days;
				resultYear++;
				resultYear_days = isLeap(resultYear) ? 366 : 365;
			}
			resultOffset = numOfDays - 1;
		}
		int dateMonth[] =findDateAndMonth(resultOffset, resultYear);
		printDate(dateMonth[0], dateMonth[1], resultYear);
	}

	public static void printDate(int date, int month, int year) {
		System.out.println("New Date: " + date + "-" + month + "-" + year);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// user input
		System.out.println("Enter date below:");
		System.out.print("dd: ");
		int date = sc.nextInt();
		System.out.print("mm: ");
		int month = sc.nextInt();
		System.out.print("yyyy: ");
		int year = sc.nextInt();
		System.out.println("Entered date= " + date + "-" + month + "-" + year);
		System.out.print("Enter number of days to be added: ");
		int numOfDays = sc.nextInt();

		// calling function
		addDays(date, month, year, numOfDays);

		sc.close();
	}
}
