import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution3{

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{

	String ip="(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])";
	public String pattern=String.format("%s.%s.%s.%s",ip,ip,ip,ip);

}
