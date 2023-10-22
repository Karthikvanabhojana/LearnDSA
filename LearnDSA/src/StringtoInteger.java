import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringtoInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hello -47";
//		Pattern pattern = Pattern.compile("^[A-Za-z]");
//		Matcher matcher = pattern.matcher(str);
//		if(matcher.find()) {
//			System.out.println("zero");
//
//		}
//		String temp=str;
//		if(str.startsWith("^[a-z]")) {
//			System.out.println("zero");
//		}
////		int temp=0;
//		str=str.replaceAll("\\s", "");
//		str=str.replaceAll("[^\\d.]", "");
//		
//		int num= Integer.parseInt(str);
//		if(temp.contains("-")) {
//			num=Math.negateExact(num);
//		}
		
		
		
		

		  s = s.trim();
      if (s.isEmpty()) {
System.out.println("Zero");      }
      
      int multiplier = 1;
      int index = 0;
      char firstChar = s.charAt(0);

      if (firstChar == '-' || firstChar == '+') {
          if (firstChar == '-') {
              multiplier = -1;
          }
          index++;
      }

      int num = 0;
      while (index < s.length() && Character.isDigit(s.charAt(index))) {
          int digit = s.charAt(index) - '0';
          
          // Checking for overflow and underflow
          if (multiplier == 1 && (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && digit >= 7))) {
//              return Integer.MAX_VALUE;
              System.out.println(Integer.MAX_VALUE);
          }
          if (multiplier == -1 && (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && digit >= 8))) {
//              return Integer.MIN_VALUE;
        	  System.out.println( Integer.MIN_VALUE);
          }
          
          num = num * 10 + digit * multiplier;
          index++;
      }
      
System.out.println(num);
	}

}
