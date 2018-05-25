
package com.whuang022.ai.litematrix.test;

import com.whuang022.ai.litematrix.mat.*;

public class MatrixTest {

    public static void main(String[] args) {
         Matrix <Double> m1=new  MatrixArray<Double>(3,3);
         m1.fill(3.0);
         Matrix <Integer> m2=new  MatrixArray<Integer>(3,3);
         m2.fill(2);
         Matrix <Double> m3=m1.sum(m2);
         m3.print();
        }
 } 


