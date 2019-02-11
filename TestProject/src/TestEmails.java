import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class TestEmails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createEmail(100);
		ArrayList<String> emailList=createEmailAL(10);
		createFile(emailList);

	}
	
	public static void createEmail(int n){
		String padded;
		for(int i=1; i<n+1; i++){
			 	padded = String.format("%04d", i);
				System.out.println("test"+padded+"@email.com");
		}
	}
	
	public static ArrayList<String> createEmailAL(int n){
		String padded;
		ArrayList<String> emailList = new ArrayList<String>(n);
		for(int i=1; i<n+1; i++){
			 	padded = String.format("%04d", i);
			 	emailList.add("test"+padded+"@email.com");
				//System.out.println("test"+padded+"@email.com");
		}
		return emailList;
	}
	
	/**
	 * Not being used.
	public static String getDateTime(){
		LocalDateTime now = LocalDateTime.now();		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formatDateTime = now.format(formatter);
		return formatDateTime;
	}*/
	
	public static void createFile(ArrayList<String> al){
		try{
			//String date = getDateTime();
			String userHomeFolder = System.getProperty("user.home");
			String date = new SimpleDateFormat("yyyy-MM-dd-HHmm").format(new Date());
			File textFile = new File(userHomeFolder+"\\desktop", "TestEmails"+date+".txt");
			PrintWriter writer = new PrintWriter(textFile, "UTF-8");
			
			for(int i=0; i<al.size();i++){
				//System.out.println(al.get(i));
				writer.println(al.get(i));
			}

			writer.close();
		}catch(Exception e){
			System.out.println("Something when wrong!");
		}
	}
}
