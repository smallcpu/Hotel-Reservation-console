import java.util.*;
import java.text.*;
public class hotelR {
	public static void main(String [] args) {
		//All Variables used in the program
		String name, dateS, hotelName=null, hotelLocation, roomAccom = null, input;
		String SRMC, StaxT, STotal, SPPD;
		int  inputS = 0, inputH = 1, index = 0, arrCounter = 6;
		double tax = 1, discount=1, pricePDay=0, dayR;
		boolean hotelB = true, roomA = true, again = true;
		
		//Parallel Arrays
		String [] finalName = new String[7];
		String [] dateArr = new String[7];
		String [] roomC = new String[7];
		String [] roomCWT = new String[7];
		String [] roomTt = new String[7];
		String [] gT = new String[7];
		
		//creates an object that will define the decimal format in STRING
		DecimalFormat df = new DecimalFormat("$#.##");
		//ability to obtain user inputs
		
		while(again == true && arrCounter > -1) {
			//resets values so when repeated will not carry over values
			name = null;
			dateS = null;
			hotelLocation = null;
			roomAccom = null;
			inputS = 0;
			inputH = 1;
			tax = 1;
			discount = 1;
			pricePDay = 0;
			dayR = 0;
			hotelB = true;
			roomA = true;
			SRMC = null;
			StaxT = null;
			STotal = null;
			SPPD = null;
			
			
			//All of the user inputs without a menu
			Scanner scan = new Scanner(System.in);
		
			System.out.println("Hello Welcome to Northwoods Hotel Reservation System!!");
			//Ask for user's name and puts in name var
			System.out.println("What is your name");
			name = scan.nextLine();
			//System.out.println(name);
			//Ask for user's name and puts in date var
			System.out.println("What is the day of your reservation, (mm-dd-yyy)");
			dateS = scan.nextLine();
			//Ask how many days they user will reserve
			System.out.println("How many days are you going to reserve");
			dayR = scan.nextInt();
			//System.out.println(dayR);
			
			//Makes sure the user chooses one of the choices
			//If not it will loop until given 
			while(hotelB == true) {
				//Ask the user what hotel they are going to stay in
				System.out.println("Please choose the hotel youre staying in\n"
						+ "1. Ritz-Carlton\n"
						+ "2. Comfort Inn\n"
						+ "3. Hyatt\n"
						+ "4. The View Hotel\n"
						+ "5. Grand Hotel\n"
						+ "6. Plaza Hotel");
				//Depending on the input variables will be initialized with values
				input = scan.next();
				//initializes the hotelName, pricePDay, Tax
				if(input.equals("1")) {
					hotelName = "Ritz-Carlton";
					pricePDay = 350;
					tax = .09;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("1");
				}
				//initializes the hotelName, pricePDay, Tax
				else if(input.equals("2")) {
					hotelName = "Comfort Inn";
					pricePDay = 141;
					tax = .07;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("2");
				}
				//initializes the hotelName, pricePDay, Tax
				else if(input.equals("3")) {
					hotelName = "Hyatt";
					pricePDay = 150;
					tax = .1;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("3");
				}
				//initializes the hotelName, pricePDay, Tax
				else if(input.equals("4")) {
					hotelName = "The View Hotel";
					pricePDay = 61;
					tax = .01;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("4");
				}
				//initializes the hotelName, pricePDay, Tax
				else if(input.equals("5")) {
					hotelName = "Grand Hotel";
					pricePDay = 380;
					tax = .06;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("5");
				}
				//initializes the hotelName, pricePDay, Tax
				else if(input.equals("6")) {		
					hotelName = "Plaza Hotel";
					pricePDay = 800;
					tax = .08;
					hotelB = false;
					//System.out.println(hotelName+" "+pricePDay+" "+tax);
					//System.out.println("6");
				}
				else {
					System.out.println("Sorry you did not choose any, try again");
					hotelB = true;
				}
			}
			
			//Ask for hotel location in switch case form
			System.out.println("What is your hotel's location?\n"
					+ "1. Chicago, IL\n"
					+ "2. Madison, WI\n"
					+ "3. Los Angeles, CA\n"
					+ "4. Sussex, UK\n"
					+ "5. Mackinac, MI\n"
					+ "6. New York, NY");
			inputH = scan.nextInt();
			switch(inputH) {
				case 1: hotelLocation = "Chicago, IL";
						break;
				case 2:	hotelLocation = "Madison, WI";
						break;
				case 3:	hotelLocation = "Los Angeles, CA";
						break;
				case 4:	hotelLocation = "Sussex, UK";
						break;
				case 5:	hotelLocation = "Mackinac, MI";
						break;
				case 6:	hotelLocation = "New York, NY";
						break;
				default: hotelLocation = "Location Unknown";
						break;
			}
			//for testing purposes
			//System.out.println(hotelLocation);
			
			//Makes sure the user chooses one of the choices
			//If not it will loop until given 
			while(roomA == true) {
				//Ask the user what is their Room Accomodation they are going to stay in
				System.out.println("What kind of Room Accomodation are you having\n"
						+ "1. Double Bed\n"
						+ "2. Single Bed\n"
						+ "3. Suite\n"
						+ "4. 10 Suites");
				input = scan.next();
				//initializes the roomAccom
				//depending on user choice
				if(input.equals("1")) {
					roomAccom = "Double Bed";
					roomA = false;
					//System.out.println(roomAccom);
					//System.out.println("1");
				}
				//initializes the roomAccom
				//depending on user choice
				else if(input.equals("2")) {
					roomAccom = "Single Bed";
					roomA = false;
					//System.out.println(roomAccom);
					//System.out.println("2");
				}
				//initializes the roomAccom
				//depending on user choice
				else if(input.equals("3")) {
					roomAccom = "Suite";
					roomA = false;
					//System.out.println(roomAccom);
					//System.out.println("3");
				}
				//initializes the roomAccom
				//depending on user choice
				else if(input.equals("4")) {
					roomAccom = "10 Suites";
					roomA = false;
					//System.out.println(roomAccom);
					//System.out.println("4");
				}
				else {
					System.out.println("Please choose correctly");
					roomA = true;
				}
			}
			
			//Switch case for discount prices on specific situations
			System.out.println("Are any of these your current situation?\n"
					+ "1. Student\n"
					+ "2. Senior (65+ age)\n"
					+ "3. Birthday Person\n"
					+ "4. Corporate\n"
					+ "5. None");
			//grabs the input from a switch input variable
			inputS = scan.nextInt();
			switch(inputS) {
			case 1: discount = .10;
					break;
			case 2: discount = .20;
					break;
			case 3: discount = .15;
					break;
			//here in case 4, the discount is only available for for Corporates with 
			//a reservation of more than 5 days
			case 4:	if(dayR > 5) {
					discount = .25;
					break;
				}
					else {
						System.out.println("Sorry stay longer than 5 days no discount.");
						break;
					}
			default: discount = 1;
					break;
			}
			
			//Outputs for testing purposes
		/*	System.out.println("Current inputs\n"
					+ name + "\n"
					+ dateS + "\n"
					+ hotelName + "\n"
					+ hotelLocation + "\n"
					+ roomAccom+ "\n"
					+ tax + "\n"
					+ discount);
		*/
			
			//runs the calculation methods and returns to a holding variable
			double RMC = roomCostCalc(pricePDay, dayR);
			double taxT = taxTotal(tax,RMC);
			double Total = grandTotal(discount, taxT);
			
			//Convert these values to strings and format to the 2nd decimal place
			 SRMC = df.format(RMC);
			 StaxT = df.format(taxT);
			 STotal = df.format(Total);
			 SPPD = df.format(pricePDay);
			 
			//Outputs the name, date of reservation, Hotel, Location, and Accomodations
			System.out.println("Summary for Single Person, pricing after all data is filled up\n");
			System.out.println(name);
			System.out.println("Date of Reservation:" + dateS);
			System.out.println("Hotel Name:"+hotelName);
			System.out.println("Hotel Location:" + hotelLocation);
			System.out.println("Accomodation:" + roomAccom);
			System.out.println("");

			//pushes all data to array to store the data
			finalName[index] = name;
			dateArr[index] = dateS;
			roomC[index] = SPPD;
			roomCWT[index] = SRMC;
			roomTt[index] = StaxT;
			gT[index] = STotal;
			
			//Ask the user to try again or not, if yes restarts the system, 
			//if anything else breaks the loop and outputs everyone
			//Subtracts the arrCounter to make show each space it taken up
			//Increments index to represent a different position in Array
			System.out.println("Would you like to try again");
			input = scan.next();
			if(input.equals("Y")||input.equals("y")) {
				again = true;
				index++;
				arrCounter--;
				System.out.println("Array Space left:"+arrCounter+"\n");
			}
			else {
				again = false;
				System.out.println("You are Done");
			}
		}
		
		
		//displays all values from the arrays
		System.out.println("\n");
		System.out.println("Welcome to Northwoods Hotel Reservation System!");
		System.out.println("Please find your name and you will see your pricing, Thank you");
		System.out.println(String.format("%-21s %-15s %-8s %-7s %-7s %-7s \n","|name|","|date|","|Cost per room|","|Total room cost|","|Total with Tax|", "|GrandTotal|"));
		for (int i=0; i<=finalName.length; i++) {
            System.out.print(String.format("%-17s %-22s %-17s %-14s %-15s %-10s\n",finalName[i] + " ",dateArr[i] + " ",roomC[i] + " ",roomCWT[i] + " ",roomTt[i],gT[i] + " "));    
            //System.out.print(roomC[i] + " ");
            //System.out.print(roomCWT[i] + " ");
           // System.out.print(roomTt[i] + " ");	
            //System.out.println(gT[i] + " "); 
		}
		
	}
	
	
	//returns the grand total of the hotel
	//a = tax, b = taxT
	public static double grandTotal(double a, double b) {
		double taxDiscount = a * b;
		if(taxDiscount == b) {
			double grandTotal = b;
			return grandTotal;
		}
		else {
			double grandTotal = b - taxDiscount;
			return grandTotal;
		}	
	}
	//returns the cost of the room per night before tax
	//a = pricePDay b = dayR
	public static double roomCostCalc(double a, double b) {
		double roomCost = a * b;
		return roomCost;
		
	}
	//returns the tax of the total
	//a = tax, b = RMC
	public static double taxTotal(double a, double b) {
		double taxPrice = a * b;
		double totalTax = taxPrice + b;
		return totalTax;
	}
}
