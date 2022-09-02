/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package degree;

/**
 *
 * @author ajee
 */
    /**
     */

class degree{
    public void  getdegree()
    {
        System.out.println("I got a degree");
    }
}
    class Undergraduate extends degree
    {
 
    public void degree()
    {
        System.out.println("I am an undergraduate ");
    }
    }
    class Postgraduate extends degree
    {
    public void degree()
    {
        System.out.println("I am an postgraduate");
    }
    }     
public class ans{
    public static void main(String[] args) {
        // TODO code application logic here
        Undergraduate a = new Undergraduate();
        Postgraduate b = new Postgraduate();
       
        a.degree();
        b.degree();
    }

   
