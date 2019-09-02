import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {

		//boolean validate;
		UserDetails details = new UserDetails();
		
		System.out.println("Please enter your details:");
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Firstname: ");
        String Fname = input.nextLine();
        details.setFirstname(Fname);
		
        System.out.print("Middlename: ");
        String Mname = input.nextLine();
        details.setMiddlename(Mname);
        
        System.out.print("LastName: ");
        String Lname = input.nextLine();
        details.setLastname(Lname);
        
        System.out.print("Address: ");
        String address = input.nextLine();
        details.setAddress(address);
        
        System.out.print("Age: ");
        int Age = input.nextInt();
        details.setAge(Age);   
        
        Scanner ch =new Scanner(System.in);
        
        System.out.println("What brand of vehicle do you prefer?");
		System.out.println("1 - BMW");
		System.out.println("2 - toyota");
		System.out.println("3 - suzuki");
		System.out.println("4 - subaru");
		System.out.println("5 - Mazda");
		System.out.print("Enter number:");
		int num = ch.nextInt();
		System.out.println("do you wanna:");
		System.out.println("1-buy");
		System.out.println("2-repair");
		System.out.println("3-decorate");
		System.out.println("Enter number: ");
		int ans = ch.nextInt();
		String answer = ch.nextLine();
		Scanner driver = new Scanner(System.in);
		String license = "N";
		
		switch(ans) {
		case 1: 
		do {	
			buy buys = new buy();
			System.out.print("Monthly Salary: ");
			String salary = ch.nextLine();
			System.out.println("1. cash  2. installment");
			System.out.print("Enter number:");
			int payment = ch.nextInt();
			
			if(payment == 1) {
				System.out.println("Discount amounts for cash:");
				System.out.println("BMW = " + buys.getBMW() * .15);
				System.out.println("toyota = " + buys.getToyota() * .15);
				System.out.println("suzuki = " + buys.getSuzuki() * .15);
				System.out.println("subaru = " + buys.getSubaru() * .15);
				System.out.println("mazda = " + buys.getMazda() * .15);
				System.out.println("We'll do a process, thank you for choosing our service :)");
			}else if(payment == 2) {
				System.out.println("Term of payment: 1). 3yrs, 2). 5yrs, 3). 10yrs");
				System.out.print("Enter number: ");
				int term = ch.nextInt();
				if(term == 1) {
					System.out.println("Amounts for installment within 3 years: ");
					System.out.println("BMW = " + buys.getBMW() / 36 * .05);
					System.out.println("toyota = " + buys.getToyota() / 36 * .05);
					System.out.println("suzuki = " + buys.getSuzuki() / 36 * .05);
					System.out.println("subaru = " + buys.getSubaru() / 36 * .05);
					System.out.println("mazda = " + buys.getMazda() / 36 * .05);
					System.out.println("We'll do a process, thank you for choosing our service :)");
				}else if(term == 2) {
					System.out.println("Amounts for installment within 5 years: ");
					System.out.println("BMW = " + buys.getBMW() / 60 * .05);
					System.out.println("toyota = " + buys.getToyota() / 60 * .05);
					System.out.println("suzuki = " + buys.getSuzuki() / 60 * .05);
					System.out.println("subaru = " + buys.getSubaru() / 60 * .05);
					System.out.println("mazda = " + buys.getMazda() / 60 * .05);
					System.out.println("We'll do a process, thank you for choosing our service :)");
				}else if(term == 3) {
					System.out.println("Amounts for installment within 10 years: ");
					System.out.println("BMW = " + buys.getBMW() / 120 * .05);
					System.out.println("toyota = " + buys.getToyota() / 120 * .05);
					System.out.println("suzuki = " + buys.getSuzuki() / 120 * .05);
					System.out.println("subaru = " + buys.getSubaru() / 120 * .05);
					System.out.println("mazda = " + buys.getMazda() / 120 * .05);
					System.out.println("We'll do a process, thank you for choosing our service :)");
				}else
					System.out.println("invalid input, please try again...");
			}else {
				
			}
				
			System.out.println("do you have a drivers license? Y/N");
			String drivers = driver.nextLine();
			
		}while(answer.equals("N") ||answer.equals("n"));	
				System.out.println("Transaction History:");
				System.out.println(Fname + " " + Mname + " " + Lname);
				System.out.println(Age + " years old");
				System.out.println("Adress: " + address);
				System.out.println("What brand of vehicle do you prefer?");
				System.out.println("1 - BMW");
				System.out.println("2 - toyota");
				System.out.println("3 - suzuki");
				System.out.println("4 - subaru");
				System.out.println("5 - Mazda");
				System.out.println("You chose: " +num);
				System.out.println("do you wanna:");
				System.out.println("1-buy");
				System.out.println("2-repair");
				System.out.println("3-decorate");
				System.out.println("You chose: "+ans);
			break;
			
		case 2:
		do {	
			System.out.println("Do you want to: ");
			System.out.println("1. fully repair  2.individual parts");
			int rep = ch.nextInt();
			if(rep==2) {
				System.out.print("What part do you want to repair? ");
				Scanner part = new Scanner(System.in);
				String parts = part.nextLine(); 
				System.out.print("Do you want to add parts to be repaired? 1 - yes  2 - no ");
				int partss = ch.nextInt();
				if(partss == 1) {
					System.out.print("Which part do you want to add? ");
					parts = part.nextLine();
					System.out.println("We'll do a process, thank you for choosing our service :)");
				}else
					System.out.println("Thank you " + Fname + " " + "Lname,");
			}
			System.out.println("do you have a drivers license? Y/N");
			String drivers = driver.nextLine();
			
		}while(answer.equals("N") ||answer.equals("n"));	
				System.out.println("Transaction History:");
				System.out.println(Fname + " " + Mname + " " + Lname);
				System.out.println(Age + " years old");
				System.out.println("Adress: " + address);
				System.out.println("What brand of vehicle do you prefer?");
				System.out.println("1 - BMW");
				System.out.println("2 - toyota");
				System.out.println("3 - suzuki");
				System.out.println("4 - subaru");
				System.out.println("5 - Mazda");
				System.out.println("You chose: " +num);
				System.out.println("do you wanna:");
				System.out.println("1-buy");
				System.out.println("2-repair");
				System.out.println("3-decorate");
				System.out.println("You chose: "+ans);
			
			break;
			
		case 3: 
		do {
			Decorate dc = new Decorate();
			System.out.println("please provide your desired color for:");
			String color = ch.nextLine();
			dc.setBumperColor(color);
			dc.setHoodColor(color);
			dc.setMugsColor(color);
			System.out.println("We'll do a process, thank you for choosing our service :)");
			
			System.out.println("do you have a drivers license? Y/N");
			String drivers = driver.nextLine();
			
		}while(answer.equals("N") ||answer.equals("n"));	
				System.out.println("Transaction History:");
				System.out.println(Fname + " " + Mname + " " + Lname);
				System.out.println(Age + " years old");
				System.out.println("Adress: " + address);
				System.out.println("What brand of vehicle do you prefer?");
				System.out.println("1 - BMW");
				System.out.println("2 - toyota");
				System.out.println("3 - suzuki");
				System.out.println("4 - subaru");
				System.out.println("5 - Mazda");
				System.out.println("You chose: " +num);
				System.out.println("do you wanna:");
				System.out.println("1-buy");
				System.out.println("2-repair");
				System.out.println("3-decorate");
				System.out.println("You chose: "+ans);	
			break;
			
		default:
			System.out.println("invalid input");
			}
		System.out.println("do you have a drivers license? Y/N");
		String drivers = driver.nextLine();
			
		}
	
		
	}
    

/**Scanner sc = new Scanner(System.in);
int number;
do {
    System.out.println("Please enter a positive number!");
    while (!sc.hasNextInt()) {
        System.out.println("That's not a number!");
        sc.next(); // this is important!
    }
    number = sc.nextInt();
} while (number <= 0);
System.out.println("Thank you! Got " + number);**/

/**Scanner sc = new Scanner(System.in);
System.out.println("Please enter a vowel, lowercase!");
while (!sc.hasNext("[aeiou]")) {
    System.out.println("That's not a vowel!");
    sc.next();
}
String vowel = sc.next();
System.out.println("Thank you! Got " + vowel);**/
