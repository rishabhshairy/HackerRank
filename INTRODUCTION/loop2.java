import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        double sum=0;
        int a,b,n;
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
             a = in.nextInt();
             b = in.nextInt();
             n = in.nextInt();
        int pre=0
        in.close();
        for(int i=0;i<=n;i++){
            sum=pre+Math.pow(2,i)*b;
            System.out.print(sum+" ");
            pre=sum;
        }
        }
    }
}
