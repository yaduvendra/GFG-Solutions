import java.util.*;
import java.lang.*;
import java.io.*;

class Armstrong {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m = 0 , n = 0 , sum = 0;
		
		while(t-- > 0){
		    m = sc.nextInt();
		    n=m;
		    if(n<=100 || n>=1000){
		        System.out.println("No"); 
		        continue;
		    }
		    for(int i = 0 ; n!=0 ; i++)
		    {
		        sum += Math.pow((n%10) , 3);
		        n /= 10;
		    }
		    
		    if(sum == m){
		       System.out.println("Yes"); 
		    }
		    else{
		       System.out.println("No"); 
		    }
		    
		}
		//System.out.println(t);
	}
}
