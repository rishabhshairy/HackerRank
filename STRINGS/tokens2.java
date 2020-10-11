import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
					StringTokenizer tk=new StringTokenizer(s,"!,.@?' ");
					System.out.println(tk.countTokens());
					while(tk.hasMoreTokens()){
						System.out.println(tk.nextToken());
					}
	        scan.close();



}
}
