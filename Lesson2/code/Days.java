import java.util.Scanner;
public class Days{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number from 1 to 7 (inc):");
		int day = in.nextInt();
		switch(day){
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
			case 4:
				System.out.println("Thursday");
			case 5:
				System.out.println("Friday");
			case 6:
				System.out.println("Saturday");
			case 7:
				System.out.println("Sunday");
			default:
				System.out.println("Invalid day ...");
				break;
		}

	}
}
