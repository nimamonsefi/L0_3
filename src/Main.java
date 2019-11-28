/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author nimamonsefi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.print("Enter The Number : ");
        int number=scanner.nextInt();
        System.out.println("\n");
        
        int i,j;
        int[][]  array=new int[number][number];
        
        for(i=0;i<number;i++){
            for(j=0;j<number;j++){
                array[i][j]=(i+1)*(j+1);
                System.out.print(array[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
    
}
