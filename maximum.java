/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package max;

/**
 *
 * @author acer
 */
public class Max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a={5,7,3,6,9,4,2};
        int max=a[0];
        int min =a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>=max){
                max=a[i];
            }
        }
        System.out.println("max=:"+max);
        for(int i=0;i<a.length;i++){
            if(a[i]<=min){
                min=a[i];
            }
        }
        System.out.println("min="+min);
    }
    
}
