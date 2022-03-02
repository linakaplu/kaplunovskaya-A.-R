package zadan4;

public class zadan4 {
	public static void main(String arg[]){
		String login = "Marusya";
		String parol = "1234";
		if((arg[0].equals(login))&(arg[1].equals(parol)))
	    {
			System.out.println("You have been recognized. Welcome");
	    }
	    else
	    {
	    	System.out.println("login and password are not recognized. Access is denied");
	    }
	}
}