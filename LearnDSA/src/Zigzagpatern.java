
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zigzagpatern {

	
	
	public static String convert(String s, int numRows) {
		char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[numRows];
	    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
	    
	    int index = 0;
	    while (index < len) {
	        for (int i = 0; i < numRows && index < len; i++) //  downwards
	            sb[i].append(c[index++]);
	        for (int j = numRows-2; j >= 1 && index < len; j--) //  upwards
	            sb[j].append(c[index++]);
	    }
	    for (int i = 1; i < sb.length; i++)
	        sb[0].append(sb[i]);
	    return sb[0].toString();
		
			}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String read="KARTHIK";
		int row=3;
String covert=convert(read, row);
System.out.println(covert);

	}

}
