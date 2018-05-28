
package com.whuang022.ai.litematrix.test;

import com.whuang022.ai.litematrix.compute.ComputeCell;
import com.whuang022.ai.litematrix.compute.ComputeCellDouble;
import com.whuang022.ai.litematrix.compute.ComputeCellInteger;
import com.whuang022.ai.litematrix.mat.*;

public class MatrixTest {

    public static void main(String[] args) {
        
         Matrix <Double> m0=new  MatrixArray<>(3,3,4.0);
         m0.print();
         Matrix <Double> m1=new  MatrixArray<Double>(3,3,0.0);
         m1.fill(3.3);
            Matrix <Integer> m2=new  MatrixArray<Integer>(3,3,1);
         m1.fill(3.0);
         Matrix <Double> m3=m2.sum(m1);
         m3.print();
        
       
        /*
        int a=2;
        Matrix <Integer> m1=new  MatrixArray<Integer>(3,3,3);
        Matrix <Double> m3=m1.mul(5.5);
        m3.print();*/
        
    //  ComputeCell cc=ComputeCellInteger.getInstance();
    //  System.out.println(cc.sub(1.0, 3.2));
        }
} 


