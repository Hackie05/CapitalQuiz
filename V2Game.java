// Capital Quiz game
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("                 Welcome to Capital Quiz !! \n\nIf you wanna know how well do you know India then say 'Yes',\notherwise say 'No'\n");
		//For taking input - yes or no
		String a = sc.next();
		int score = 0;

		//if a is "yes'' -
		if (a.equals("Yes") || a.equals("yes")) {

			System.out.println("\nGreat choice!! so let's have fun together" + "\n\n                       INSTRUCTIONS\n" +
							   "\nYou will get a state and you have to write its capital ,pls don't misspell " +
							   "\nIf you get even one wrong then you will loose" +
							   "\n\nBest Of Luck!! \n");

			String n, m, p;
			boolean lose = false;//To make a loop

			while (!lose) { // while lose is not equal to true(lose == true, loop will stop)

				int b = (int)(Math.random() * (28 - 1) + 1);//random number between 1-28

				Scanner in = new Scanner(System.in);

				switch (b) {

				case 1:
					System.out.println("\nGujrat\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();//capital- IP
					p = "Gandhinagar";
					m = "gandhinagar";
					//if n == p || n == m
					if (n.equals(p) || n.equals(m)) {
						lose = false;//player does not lose
						score++;//update the score
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;//player lose
					}
					break;

				case 2:
					System.out.println("\nMaharashtra\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Mumbai";
					m = "mumbai";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 3:
					System.out.println("\nGoa\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p =  "panaji";
					m = "Panaji";

					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 4:
					System.out.println("\nKarnataka\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Bengaluru";
					m = "bengaluru";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 5:
					System.out.println("\nKerala\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Thiruvananthapuram";
					m = "thiruvananthapuram";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 6:
					System.out.println("\nTamil Nadu\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Chennai";
					m = "chennai";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 7:
					System.out.println("\nAndhra Pradesh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Amaravati";
					m = "amaravati";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 8:
					System.out.println("\nOdisha\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Bhubaneswar";
					m = "bhubaneswar";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 9:
					System.out.println("\nWest Bengal\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Kolkata";
					m = "kolkata";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 10:
					System.out.println("\nTelangana\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Hyderabad";
					m = "hyderabad";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 11:
					System.out.println("\nChhattisgarh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Raipur";
					m = "raipur";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 12:
					System.out.println("\nMadhya Pradesh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Bhopal";
					m = "bhopal";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 13:
					System.out.println("\nJharkhand\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Ranchi";
					m = "ranchi";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 14:
					System.out.println("\nSikkim\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Gangtok";
					m = "gangtok";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 15:
					System.out.println("\nAssam\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Dispur";
					m = "dispur";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 16:
					System.out.println("\nMeghalaya\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Shillong";
					m = "shillong";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 17:
					System.out.println("\nTripura\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Agartala";
					m = "agartala";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 18:
					System.out.println("\nMizoram\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "aizawl";
					m = "Aizawl";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 19:
					System.out.println("\nNagaland\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Kohima";
					m = "kohima";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 20:
					System.out.println("\nArunachal Pradesh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Itanagar";
					m = "itanagar";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 21:
					System.out.println("\nRajasthan\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Jaipur";
					m = "jaipur";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 22:
					System.out.println("\nUttar Pradesh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Lucknow";
					m = "lucknow";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 23:
					System.out.println("\nBihar\n");
					System.out.print("Enter Capital : ");

					n = in.nextLine();
					p = "Patna";
					m = "patna";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 24:
					System.out.println("\nHaryana\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Chandigarh";
					m = "chandigarh";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 25:
					System.out.println("\nUttarakhand\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Dehradun";
					m = "dehradun";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 26:
					System.out.println("\nPunjab\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Chandigarh";
					m = "chandigarh";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 27:
					System.out.println("\nHimachal Pradesh\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Shimla";
					m = "shimla";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				case 28:
					System.out.println("\nManipur\n");
					System.out.print("Enter Capital : ");
					n = in.nextLine();
					p = "Imphal";
					m = "imphal";
					if (n.equals(p) || n.equals(m)) {
						lose = false;
						score++;
					} else {
						System.out.println("Wrong guess , its : " + p);
						lose = true;
					}
					break;

				default:
					System.out.println("Invalid number");
				}

			}
			//Total Score
			System.out.println("\nYour score is : " + score);
			// If a == "No" || a == "no"
		} else if (a.equals("No") || a.equals("no")) {

			System.out.println("Its ok!! We will have fun some other time");

		} else {

			System.out.println("Answer in 'Yes' or 'No'");

		}

	}

}
