
package com.whuang022.ai.litematrix.mat;

/**
 *
 * @author user
 * @param <T>
 */
public interface Matrix <T extends Number> {
   public void fill(T val);
   public void print();
   public Matrix sum(Matrix val)    throws MatrixDimensionsNotMatchException;
   public Matrix sub(Matrix val)     throws MatrixDimensionsNotMatchException;
   public Matrix mul(Matrix val) throws MatrixDimensionsNotMatchException;
   public Matrix mul(java.lang.Number val) ;
   public int rowSize();
   public int colSize();
   public void set(int row,int col,T val) throws java.lang.IndexOutOfBoundsException;
   public T get(int row,int col) throws java.lang.IndexOutOfBoundsException;
   
}
