
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zigzagpatern {

	
	
	public static String convert(String s, int numRows) {
		if( s.length()<=numRows || numRows==1) {
			return s;
		}
		
		List<List<String>> str=new ArrayList<>();
		int index=0;
		int step=1;
		for(int i=0;i<s.length();i++) {
			str.get(index).add(Character.toString(s.charAt(i))) ;
			
			if(index==0) {
				step=1;
			}
			if(index==numRows-1) {
				step=-1;
			}
			index=step+index;
		}
		
//		char [] output=new char[s.length()];
//		for (char c : output) {
//			
//		}
		
		String output="";
		index=0;
		for(int i=0;i<str.size();i++) {
			while(str.get(i).size()<=0) {
				output.concat(str.get(i).get(index));
//				output=str.get(i).get(index);
				index++;

			}
			
		}
		
		

		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String read="PAYPALISHIRING";
		int row=3;
String covert=convert(read, row);

	}

}
