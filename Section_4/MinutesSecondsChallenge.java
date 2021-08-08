/**
 * Create a method called getDurationString with two parameters,
 * first parameter minutes and 2nd parameter seconds.
 * You should validate that the first parameter minutes is >=0.
 * You should validate that the 2nd parameter seconds is >= 0 and <=59.
 * The method should return "Invalid value" in the method if either of the above are not true.
 * If the parameters are valid then calculate how many hours minutes and seconds
 * equal the minutes and seconds passed to this method and return that value as 
 * string in format, "XXh YYm ZZs" where XX represents number of hours,
 * YY the minutes and ZZ the seconds.
 * 
 * Create a 2nd method of the same name but with only one parameter seconds.
 * Validate that it is>=0, and return "Invalid value" if it is not true.
 * If it is valid, then calculate how many minutes are in the seconds value and then call 
 * the other overloaded method passing the correct minutes and seconds calculated so
 * that it can calculate correctly.
 * Call both methods to print values to the console.
 * 
 * Tips:
 * 1. Use int or long for your number data types is probably a good idea.
 * 2. 1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
 * 3. Methods should be static as we have used previously.
 * */

package Section_4;

public class MinutesSecondsChallenge {
	public static void main(String[] args) {
		System.out.println(getDurationString(60, 0)); // minutes
		System.out.println(getDurationString(61, 0)); // minutes
		System.out.println(getDurationString(75, 0)); // minutes
		System.out.println(getDurationString(1830, 5)); // minutes
		System.out.println(getDurationString(7205)); // seconds
	}

	public static String getDurationString(long minutes, long seconds) {
		String hourString;
		String minuteString;
		String secondsString;
		if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
			long hours = minutes / 60;
			long reaminingMinutes = minutes % 60;
			hourString = hours + "h";
			if (hours < 10) {
				hourString = "0" + hours + "h";
			}
			minuteString = reaminingMinutes + "m";
			if (reaminingMinutes < 10) {
				minuteString = "0" + reaminingMinutes + "m";
			}
			secondsString = seconds + "s";
			if (seconds < 10) {
				secondsString = "0" + seconds + "s";
			}
			return (hourString + " " + minuteString + " " + secondsString);
		}
		return "Invalid Value";
	}

	public static String getDurationString(long seconds) {
		if (seconds >= 0) {
			long minutes = seconds / 60;
			long remainingSeconds = seconds % 60;
			return (getDurationString(minutes, remainingSeconds));
		}
		return "Invalid Value";
	}
}