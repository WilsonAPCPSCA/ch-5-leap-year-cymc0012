//Marshal Chen Period 1
import java.util.Scanner;
public class leapYearReturn {
	public static boolean isLeapYear(int year) {
		if((year%4==0)||(year%400==0)) {
			if(year%100 != 0) {
				return true;
			}
			else if(year%100==0 && year%400!= 0) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner abx = new Scanner(System.in);
		System.out.print("Enter a year to see if it is leap year: ");
		int yr = abx.nextInt();
		if (isLeapYear(yr)==true) {
			System.out.println("It is a leap year.");
		}
		else { 
			System.out.println("It is not a leap year.");
		}
	}
}
