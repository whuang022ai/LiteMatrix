
package com.whuang022.ai.litematrix.mat;

/**
 * MatrixArrayIterator 
 * @author whuang022ai
 * @param <T> The MatrixArray Type
 */

public class MatrixElement <T>{
    public T value;
    public int row=0;
    public int col=0;
    @Override
    public String toString() { 
        return "M"+"["+row+"]"+"["+col+"]"+"="+value;
    } 
}