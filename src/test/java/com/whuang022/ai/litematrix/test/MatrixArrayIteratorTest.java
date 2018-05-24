
package com.whuang022.ai.litematrix.test;

import com.whuang022.ai.litematrix.mat.Matrix;
import com.whuang022.ai.litematrix.mat.MatrixArray;
import com.whuang022.ai.litematrix.mat.MatrixArrayIterator;
import com.whuang022.ai.litematrix.mat.MatrixElement;
import com.whuang022.ai.litematrix.mat.MatrixIterator;


/**
 * MatrixArrayIteratorTest 
 * @author whuang022.ai
 */
public class MatrixArrayIteratorTest {

    public static void main(String[] args) {/*
        Double [][] mat={{1.5,1.2,1.3,1.0},{1.1,1.0,1.0,1.0}};
        MatrixArrayIterator<Double> it = new MatrixArrayIterator<>(mat);
        while(it.hasNextElement()){
            MatrixElement element=it.getNextElement();
            System.out.println(element);
        }
        */
         Matrix <Double> m1=new  MatrixArray<>(3,3);
         m1.fill(3.0);
         Matrix <Integer> m2=new  MatrixArray<>(3,3);
         m2.fill(2);
         Matrix <Double> m3=m1.sum(m2);
         m3.print();
         
         MatrixArray m4= (MatrixArray) m3;
         MatrixIterator it=m4.getMatrixIterator();
         while(it.hasNextElement()){
            MatrixElement element=(MatrixElement) it.getNextElement();
            System.out.println(element);
        }
         
    }
    
}
