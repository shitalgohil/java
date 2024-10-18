import java.util.Scanner;
public class username{
	public static void main(String args[]){
		Scanner myobj = new Scanner(System.in);
		System.out.println("enter your full name without space:");
		String name = myobj.nextLine();
		System.out.println("@"+name+name.length());
		myobj.close();
	}
}