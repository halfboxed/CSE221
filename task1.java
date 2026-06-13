import java.util.*;
import java.io.*;
public class task1 {
    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        for( int i = 0; i< T;i++){
            int n = Integer.parseInt(br.readLine());

            if ( n%2 == 0){
                System.out.println(n+ " is an Even number.");
            }
            else{ 
                System.out.println(n+ " is an Odd number.");
            }
        }

        
        
    }
    
}
