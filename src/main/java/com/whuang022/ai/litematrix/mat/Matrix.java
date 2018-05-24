/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
   public Matrix product(Matrix val) throws MatrixDimensionsNotMatchException;
   public Matrix product(java.lang.Number val) ;
   public int rowSize();
   public int colSize();
   public void set(int row,int col,T val) throws java.lang.IndexOutOfBoundsException;
   public T get(int row,int col) throws java.lang.IndexOutOfBoundsException;
   
}