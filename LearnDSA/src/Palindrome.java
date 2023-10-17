
public class Palindrome {
	 public static boolean isPalindrome(int x) {
	        int rem=0;
	        int div=0;
	        int sum=0;
	        if(x>=0) {
	            div=x; 
	            while(div>0) {
	                rem=div%10;
	                sum=(sum*10)+(rem);
	                div=div/10;

	            }
	            if(sum==x) {
	                return true;
	            }
	            else {
	                return false;
	            }
	        }
	        else{
	            return false;
	        }
	    }
	public static void main(String[] args) {
		int num=565; 
		System.out.println(isPalindrome(num));
		// TODO Auto-generated method stub

	}

}
