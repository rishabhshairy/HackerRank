import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        // Write your code here.
	        scan.close();
	        int flag=0;
	        for(int i=0;i<s.length()-1;i++){
	              if(s.charAt(i)==' '||s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)=='@'||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='\''){
	            		  	flag++;

	              }

	        }
	        System.out.println(flag);
	        int j=0;
	        for(int i=0;i<s.length();i++){
	        	if(s.charAt(i)==' '||s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)=='@'||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='\''){
	        		System.out.println(s.substring(j,i));
	        		j=i+1;
	        	}
	        }
	}

}
