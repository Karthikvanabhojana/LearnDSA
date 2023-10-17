
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {
	
	  public static String longestPalindrome(String s) {
		  
		  int start=0;
		  int end=0;
		  for (int i = 0; i < s.length(); i++) {
			  int length1=expandFromMiddle(s,i,i); // for odd input
			  int length2=expandFromMiddle(s,i,i+1);// for even ionput
			  int length=Math.max(length1, length2);
			  if(length >end-start) {
				  start=i-((length-1)/2); //set max value for iteration
				  end=i+length/2;
				  
			  }

			  
			
		}
		  
		  
	        
		  return s.substring(start, end+1);

	    }
	  
	  // number of paramentes passed is incremental first only 1 is passed and then 2 then 3  and so on 
	  
	  // takes the value of mid element and iterates towards both side only if elements on either side is equal
	  public static int expandFromMiddle(String s, int left, int right) {
		  if(s==null||left>right) {
			  return 0;
		  }
		  while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			  left--;
			  right++;
		  }
		  return right-left-1;
	  }
	  
	  
	
public static void main(String[] args) {
	String value=new String("babad");
	System.out.println(longestPalindrome(value));
	
}
}
