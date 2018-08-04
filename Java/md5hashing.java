import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        MessageDigest md=MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte byteData[]=md.digest();
        
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<byteData.length;i++)
        {
           sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }
        
        System.out.println(sb);
    }
}
