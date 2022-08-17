/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sample4.java;

/**
 *
 * @author ajee
 */
public class Sample4Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int result=0;
        for(int i=100;i<=200;i++){
            if(i%8==0)
             result+=i;
        }
        System.out.println("output of the program"+result);
    }
    
}
