import java.util.*;
public class TwoDArrays {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int rows = in.nextInt();
       int cols = in.nextInt();
       int [][] numbers = new int[rows][cols];

       for(int i =0; i<rows; i++){
        for (int j= 0 ;j < cols; j++)
           numbers[i][j]=in.nextInt();
       }
       
            
    }
    for(int i =0; i<rows; i++){
        for(int j =0; j<cols; j++){
            System.out.print(" "+numbers[i][j]);
        
        }
    }
    
}
