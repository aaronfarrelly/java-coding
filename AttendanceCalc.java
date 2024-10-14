package Calculator;
import java.util.*;

public class AttendanceCalc {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Read the attendance record input from the user
        String attendanceRecord = scan.nextLine();

        // Call the checkAttendance method to evaluate the record
        String result = checkAttendance(attendanceRecord);

        // Print the result
        System.out.println("Output: " + result);
    }

    // Method to check the attendance record and determine if the student passes or fails
    public static String checkAttendance(String record) {
        // Base case: If the record is empty, the student passes
        if (record.isEmpty()) {
            return "PASS";
        }

        // Check if the student has missed fewer than 2 labs
        int absentCount = 0;
        for (char c : record.toCharArray()) {
            if (c == 'A') {
                absentCount++;
            }
            // If the student has missed 2 or more labs, the student fails
            if (absentCount >= 2) {
                return "FAIL";
            }
        }

        // Check if the student was never late for 3 consecutive labs
        for (int i = 0; i < record.length() - 2; i++) {
            if (record.charAt(i) == 'L' && record.charAt(i + 1) == 'L' && record.charAt(i + 2) == 'L') {
                return "FAIL";
            }
        }

        // If neither condition is violated, the student passes
        return "PASS";
    }
}
