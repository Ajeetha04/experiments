/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sample3.java;

/**
 *
 * @author ajee
 */
public class Sample3Java {

    /**
     * @param args the command line arguments
     */
    public static void sample3java(int arr[],int first,int last,int key){
        // TODO code application logic here
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
                System.out.println("element is found at index"+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("element is not found");
        }
        
    }
    public static void main(String args[]){
        int arr[]={10,20,30,40,50};
        int key=30;
        int last=arr.length-1;
        sample3java(arr,0,last,key);
    }
    
}
