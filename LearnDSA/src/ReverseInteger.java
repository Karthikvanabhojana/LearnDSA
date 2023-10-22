
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=-908;
		int temp=num;
		int rev=0;
		int rem=0;
		num=Math.abs(num);
		while(num>0) {
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
	if(temp>0) {
		System.out.println(rev);
	}
	else {
		System.out.println(Math.negateExact(rev));
	}
	}

}
