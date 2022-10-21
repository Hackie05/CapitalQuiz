import java.util;
class Game{
	public static void main(String[] args) {
		
		System.out.println("Welcome to Capital Quiz !! \nLet's see how well do you know India\n\nYou will get a State and you have to write its capital \nPlease don't misspell\n");
		
		Scanner sc = new Scanner(System.in);
		String n , m , p;
		int a = (int)(Math.random()*(28-1)+1);
		switch(a){
		
		     case 1:
		     System.out.println("Gujrat");
		     n = sc.next();
		     p = "Gandhinagar";
		     m = "gandhinagar";
		     if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 2:
		     System.out.println("Maharashtra");
		     n = sc.nextLine();
		     p = "Mumbai";
		     m = "mumbai";
		      if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 3:
		     System.out.println("Goa");
		     n = sc.nextLine();
		     p=  "panaji";
		     m= "Panaji";
	
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     
		     break;
		     
		     case 4:
		     System.out.println("Karnataka");
		     n = sc.nextLine();
		     p= "Bengaluru";
		     m= "bengaluru";
		     if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 5:
		     System.out.println("Kerala");
		      n = sc.nextLine();
		      p="Thiruvananthapuram";
		      m="thiruvananthapuram";
		     if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 6:
		     System.out.println("Tamil Nadu");
		     n = sc.nextLine();
		     p= "Chennai";
		     m= "chennai";
		     if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 7:
		     System.out.println("Andhra Pradesh");
		      n = sc.nextLine();
		      p= "Amaravati";
		      m="amaravati";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 8:
		     System.out.println("Odisha");
		     n = sc.nextLine();
		     p="Bhubaneswar";
		     m="bhubaneswar";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 9:
		     System.out.println("West Bengal");
		     n = sc.nextLine();
		     p= "Kolkata";
		     m="kolkata";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 10:
		     System.out.println("Telangana");
		        n = sc.nextLine();
		        p= "Hyderabad";
		        m="hyderabad";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 11:
		     System.out.println("Chhattisgarh");
		        n = sc.nextLine();
		        p= "Raipur";
		        m="raipur";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 12:
		     System.out.println("Madhya Pradesh");
		        n = sc.nextLine();
		        p="Bhopal";
		        m="bhopal";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 13:
		     System.out.println("Jharkhand");
		        n = sc.nextLine();
		        p= "Ranchi";
		        m="ranchi";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 14:
		     System.out.println("Sikkim");
		        n = sc.nextLine();
		        p="Gangtok";
		        m="gangtok";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 15:
		     System.out.println("Assam");
		        n = sc.nextLine();
		        p= "Dispur";
		        m="dispur";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 16:
		     System.out.println("Meghalaya");
		        n = sc.nextLine();
		        p= "Shillong";
		        m="shillong";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 17:
		     System.out.println("Tripura");
		        n = sc.nextLine();
		        p= "Agartala";
		        m= "agartala";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 18:
		     System.out.println("Mizoram");
		        n = sc.nextLine();
		        p="aizawl";
		        m="Aizawl";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 19:
		     System.out.println("Nagaland");
		        n = sc.nextLine();
		        p="Kohima";
		        m="kohima";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 20:
		     System.out.println("Arunachal Pradesh");
		        n = sc.nextLine();
		        p = "Itanagar";
		        m ="itanagar";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 21:
		     System.out.println("Rajasthan");
		        n = sc.nextLine();
		        p= "Jaipur";
		        m="jaipur";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 22:
		     System.out.println("Uttar Pradesh");
		        n = sc.nextLine();
		        p="Lucknow";
		        m="lucknow";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 23:
		     System.out.println("Bihar");
		        n = sc.nextLine();
		        p= "Patna";
		        m="patna";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 24:
		     System.out.println("Haryana");
		        n = sc.nextLine();
		        p="Chandigarh";
		        m="chandigarh";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 25:
		     System.out.println("Uttarakhand");
		        n = sc.nextLine();
		        p= "Dehradun";
		        m="dehradun";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 26:
		     System.out.println("Punjab");
		        n = sc.nextLine();
		        p="Chandigarh";
		        m="chandigarh";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 27:
		     System.out.println("Himachal Pradesh");
		        n = sc.nextLine();
		        p= "Shimla";
		        m="shimla";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     case 28:
		     System.out.println("Manipur");
		        n = sc.nextLine();
		        p= "Imphal";
		        m="imphal";
		    if(n.equals(p) || n.equals(m)){
		     		 System.out.println("Correct , You really love your Nation");
		     }else{
		          	System.out.println("Wrong guess , its : " + p);
		     }
		     break;
		     
		     default:
		     System.out.println("Invalid number");
		}
	}
}
