
public class TestEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createEmail(100);
	}
	
	public static void createEmail(int n){
		String padded;
		for(int i=1; i<n+1; i++){
			 	padded = String.format("%04d", i);
				System.out.println("test"+padded+"@email.com");
			
		}
	}

}
