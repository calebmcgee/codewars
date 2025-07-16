package humanReadableTime;
/*
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

HH = hours, padded to 2 digits, range: 00 - 99
MM = minutes, padded to 2 digits, range: 00 - 59
SS = seconds, padded to 2 digits, range: 00 - 59
The maximum time never exceeds 359999 (99:59:59)
 */
public class Main {
    static String makeReadable(int seconds){
            int hrs = seconds/3600;
            seconds %= (hrs*3600);

            int mins = (seconds/60);
            seconds %= (mins*60);

        return String.format("%02d",(seconds/ 3600)) + ":" + String.format("%02d",mins) + ":" + String.format("%02d",seconds);
    }
    public static void main(String[] args){
        System.out.println(makeReadable(5415));
    }
}
