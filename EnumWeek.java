import java.util.Scanner;
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNUSDAY, THURSDAY, FRIDAY, SATUEDAY;}
public class EnumWeek{
	Day day;
	public EnumWeek(Day day){
		this.day = day;
	}
	public void dayIsLike(){
		switch(day){
			case MONDAY :
				System.out.println("monday is good to start new things");
				break;
			case TUESDAY :
				System.out.println("tuesday is nice");
				break;
			case WEDNUSDAY :
				System.out.println("i hate wednusday");
				break;
			case THURSDAY :
				System.out.println("thursday is like thunderstrom");
				break;
			case FRIDAY :
				System.out.println("yes , tommorow is holiday");
				break;
			case SATUEDAY :
				System.out.println("it's a weekend");
				break;
			case SUNDAY :
				System.out.println("today is very lazy day");
				break;
		}
	}
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		for (Day d : Day.values()){
			System.out.println(d);
		}
		System.out.println("enter your choice:");
		String ch = scanner.nextLine();
		EnumWeek d1 = new EnumWeek(Day.valueOf(ch));
		d1.dayIsLike();
	}
}