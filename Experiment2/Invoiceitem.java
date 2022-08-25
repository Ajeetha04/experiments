/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoiceitem;




/**
 *
 * @author ajee
 */


public class Invoiceitem {

    
    public Invoiceitem(String ak , String pen, int q, double p) {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testmain obj= new testmain(123,"pen",100,0.01);
        double unitprice;
        double total;
        string tostring;
        int qty;
        System.out.println("id is"+obj.getid());
        System.out.println("desc is"+obj.getdesc());
        System.out.println("qty is"+obj.getqty()); 
        System.out.println("unitprice is"+obj.getunitprice()); 
        System.out.println(obj.toString());
      
        
        
       
        
        
    }
    
}
class testmain
{
   int id;
   String desc;
   int qty;
   double unitprice;
    
   testmain(int ids,String d,int q,double p)
    {
        id=ids;
        desc=d;
        qty=q;
        unitprice=p;

    }
   
   int getid()
    {
        return id;
    }
    String getdesc()
    {
       return desc;
    }
    int getqty()
    {
        return qty;
    }
    int getunitprice()
    {
     return (int) unitprice ;
    }
  
    @Override
    public String toString()
    {
        return "id..."+id+' '+"desc..."+desc+' '+"qty..."+qty+' '+"unitprice..."+unitprice;
    }
}
 
   