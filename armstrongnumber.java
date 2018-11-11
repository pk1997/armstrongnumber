

import static java.lang.Math.pow;
//import java.util.*;
public class Armstrong{
    public static void main(String args[]){
        //int i=0;
        
        int m=0;
        // double p=0;
         int n=1;
         
         for(int k=1;k<1000000;k++){
             double a[]=new double[10000000];
            int i=0;
            int l=k;
             while(l>0){
                 a[i] =l%10;
                 l=l/10;
                 i++;
             }
             
           int p=i;
            int q=0;
            //System.out.println(p);
            for(int j=0;j<p;j++){
                q=(int) (q+pow(a[j],p));           
            }
            if(q==k)
            System.out.println(k);
            
             
         }
    }
}
