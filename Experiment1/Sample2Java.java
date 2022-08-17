/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author ajee
 */
public class Sample2Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner obj=new Scanner(System.in);
         System.out.println("how many rows");
         int rows=obj.nextInt();
         System.out.println("here is your pattern");
         for(int i=rows;i>=1;i--)
 { 
   for(int j=rows;j>=i;j--)
{
  System.out.print(j+" ");
}  
   System.out.println();
    }
    
    }
}
