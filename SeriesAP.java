import java.util.*;
import java.lang.*;
import java.io.*;

class SeriesAP {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		//input
		int A = sc.nextInt();
		int B = sc.nextInt();
		int N = sc.nextInt();
		int n = 0,j;
		int diff = 0;
		
		if(B >= A ){
		    diff = Math.abs(B-A);
		    for(j = A; n<N-1 ; j += diff , ++n ) {
	
		        }System.out.println(j);
		    }
		   
		else if(A > B ){
		    
		    diff = Math.abs(A-B);
		    for(j = A; n<N-1 ; j -= diff , ++n ) {
	
		        }System.out.println(j);
		    }
		} 
	}
}
