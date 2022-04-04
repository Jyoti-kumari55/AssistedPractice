package simpli.learn;

import java.util.ArrayList;

public class ValidationOfEmailId {
public static void main(String[] args) {
	ArrayList<String> emailId = new ArrayList<String>();
	
	emailId .add("Jyotichaudhary6500@gmail.com");
	emailId .add("Amitchaudhary6500@gmail.com");
	emailId .add("Sonu.Agrawal@gmail.com");
    emailId .add("Praveen.kumar6500@gmail.com");
    emailId .add("kamlesh_devi00@gmail.com");
    emailId .add("Titu500@gmail.com");
    emailId.add("max.neumann@gmail.com");
    emailId.add("HenrY.fiesler@gmail.com");
    emailId.add("Laura.kramm@gmail.com");
    emailId.add("Sabine.neuwirth@gmail.com");
    
    String searchElement = "max.neumann@gmail...com" ;
   
    for(int i = 0;i<emailId.size();i++) {
    	System.out.println("Email ID ->" +emailId.get(i));
    	if(searchElement == emailId.get(i)) {
    		System.out.println("$$$$$$$$$/n$$$$$$$$$$");
            System.out.println("email ID " + searchElement + "......-> found");
          break;
    	}
    }
    
    }

}

