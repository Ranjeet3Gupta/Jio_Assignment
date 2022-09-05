
	import java.util.*; 
	public class Attandance {
	    public static boolean employeeSheet(String s) {
	    int abs=0, late=0;
	    for(int i=0;i<s.length();i++) {
	        if(s.charAt(i)=='A') {
	            abs= abs +1;
	        }
	        if(s.charAt(i)=='L') { 
	        	late=late +1;
	        }
	        else {
	        	late=0;
	        }
	        if(abs>=2||late>2) {
	        	return false;
	        
	        }
	    }
	    return true; 
	    }
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
	        String att =sc.next(); 
	        boolean ans=employeeSheet(att); 
	        System.out.println(ans);
	  }
	}


