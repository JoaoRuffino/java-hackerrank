import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayweek =  calendar.get(Calendar.DAY_OF_WEEK);
        String nameday = "";
        switch(dayweek){
            case Calendar.SUNDAY:
            nameday = "SUNDAY";
            break;
            case Calendar.MONDAY:
            nameday = "MONDAY";
            break;
            case Calendar.TUESDAY:
            nameday = "TUESDAY";
            break;
            case Calendar.WEDNESDAY:
            nameday = "WEDNESDAY";
            break;
            case Calendar.THURSDAY:
            nameday = "THURSDAY";
            break;
            case Calendar.FRIDAY:
            nameday = "FRIDAY";
            break;
            case Calendar.SATURDAY:
            nameday = "SATURDAY";
            break;
        }
        return nameday;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

