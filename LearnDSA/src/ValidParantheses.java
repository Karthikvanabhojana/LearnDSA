import java.util.Stack;

public class ValidParantheses {
	
	 public static boolean isValid(String s) {
		 Stack<Character> variable= new Stack<Character>();
		 for(char c: s.toCharArray()) {
			 if(c=='(') {
				 variable.push(')');
				 
			 }
			 else if(c=='{') {
				 variable.push('}');
				 
			 }
			 else if(c=='[') {
				 variable.push(']');
				 
			 }
			 else if(variable.isEmpty() || variable.pop()!=c) { //check the top most variable of the stack
				 return false;
			 }
		 }
		 
		 return variable.isEmpty();
	}
public static void main(String[] args) {
	String s="(()[]{})";
	System.out.println(isValid(s));
	
}
}
