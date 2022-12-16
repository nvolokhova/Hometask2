package string;

public class hometask {

	public static void main(String[] args) {
		//Declaring the String Variables
		String  MyUserId = "nik";
		String MyPassword = "abc123";	
	
		
		boolean bAuthorization = MyUserId.equals("nik")&&MyPassword.equals("abc123");
		
		if(bAuthorization) {
		System.out.println("authentication passed");
		}else{
		System.out.println("authentication failed");
		}

		
		
		
			
		}
		

	}


