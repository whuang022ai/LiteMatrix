
package com.whuang022.ai.litematrix.test;

import com.whuang022.ai.litematrix.mat.MatrixArrayIterator;
import com.whuang022.ai.litematrix.mat.MatrixElement;


/**
 * MatrixArrayIteratorTest 
 * @author whuang022.ai
 */
public class MatrixArrayIteratorTest {

    public static void main(String[] args) {
        Double [][] mat={{1.5,1.2,1.3,1.0},{1.1,1.0,1.0,1.0}};
        MatrixArrayIterator<Double> it = new MatrixArrayIterator<>(mat);
        while(it.hasNextElement()){
            MatrixElement element=it.getNextElement();
            System.out.println(element);
        }
    }
    
}
