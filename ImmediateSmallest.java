import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
		//Scanner sc = new Scanner(System.in);
		try{
        int t = Integer.parseInt(br.readLine()); 
		int n = 0 , i = 0;
		while(t-- > 0){
		    
            n = Integer.parseInt(br.readLine()); 
            
            // Declaring array 
            int arr[] = new int[n]; 
            
		    String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
  
            // array elements input 
            for(i = 0; i < n; i++) 
                {arr[i] = Integer.parseInt(strs[i]);} 
  
		    for(i = 0; i<n-1; i++){
		       if(arr[i] > arr[i+1])
		        System.out.print(arr[i+1]+" ");
		    
		          else 
		            System.out.print(-1 + " "); 
		        }System.out.print(-1+"\n");
		    }
		}
		catch(Exception e){}
	}
}
