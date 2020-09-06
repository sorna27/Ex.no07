/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Bill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f,s=0,a;
        ArrayList<Float> bill=new ArrayList<>(12);
        Scanner o=new Scanner(System.in);
        System.out.println("enter the bill amount:");
        for(int i=0;i<12;i++)
        {
            f=o.nextFloat();
            bill.add(f);
        }
        for(float i: bill)
        {
            s=s+i;
        }
        a=s/12;
        System.out.println("Average:"+a);
        System.out.println("Least bill:"+Collections.min(bill));
        System.out.println("Maximum bill:"+Collections.max(bill));
    }
    
}
