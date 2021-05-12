
public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Shubham";
		int size = s.length();
		
		System.out.println(size);
		
		String reverse = "";
		for (int i =size -1; i>=0; i--)
			
			reverse = reverse + s.charAt(i);
			
		{
			System.out.print(reverse);
		}
			

	}

}
