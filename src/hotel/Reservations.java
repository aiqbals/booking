package hotel;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Scanner;

public class Reservations {
	static int maxRoomSize = 3;
	static int maxDays = 365;
	static int[][] roomForDays = new int[maxRoomSize][maxDays];
	static boolean bookAgain = true;

	public String reserve(int startDay, int endDay, int[][] roomForDays, int maxRoomSize) {
		int foundRoomNumber = -1;
		String request = "Decline";

		// check
		if ((startDay < 0 || 365 <= startDay) || (endDay < 0 || 365 <= endDay) || (startDay > endDay)) {
			System.out.println(request);
			return request;
		}

		outerloop: for (int i = 0; i <= maxRoomSize; i++) {
			int count = 0;
			for (int j = startDay; j <= endDay; j++) {
				if (roomForDays[i][j] == 0) {
					count++;
				}
			}
			if (count == (endDay - startDay) + 1) {
				request = "Accept";
				foundRoomNumber = i;
				if (foundRoomNumber > -1) {
					// request = "Reservation accepted for room: " + foundRoomNumber
					for (int j = startDay; j <= endDay; j++) {
						roomForDays[foundRoomNumber][j] = 1;
					}
				}
				break outerloop;
			}
		}

		System.out.println(request);
		return request;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.in is a standard input stream

		/*
		 * for (int i = 0; i < maxRoomSize; i++) { for (int j = 0; j < maxDays; j++) {
		 * roomForDays[i][j] = 0; } } for (int i = 1; i < maxRoomSize; i++) { for (int j
		 * = 0; j < maxDays; j++) { System.out.println(roomForDays[i][j]); } }
		 */

		while (bookAgain) {
			System.out.println("Provide Start-End day");
			int start = in.nextInt();
			in.nextLine();
			int end = in.nextInt();
			in.nextLine();

			Reservations rm = new Reservations();
			rm.reserve(start, end, roomForDays, maxRoomSize);

			System.out.println("Wanna book more? 'Y/N' ");
			String book = in.nextLine();
			if (book.equals("N") || book.equals("n")) {
				bookAgain = false;
			}
		}
		System.out.println("Reservation finished ");
		in.close();
	}

}
