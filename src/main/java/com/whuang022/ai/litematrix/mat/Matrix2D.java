
package com.whuang022.ai.litematrix.mat;

/**
 * Matrix2D (interface)
 * @author whuang022ai
 * @param <T>
 */
public interface Matrix2D <T> extends  Matrix{
    public abstract MatrixElement<T> getMatrixElement(int row,int col);
    public MatrixIterator getMatrixIterator();
}
