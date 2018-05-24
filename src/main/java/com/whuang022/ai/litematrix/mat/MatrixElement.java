
package com.whuang022.ai.litematrix.mat;

/**
 * MatrixArrayIterator 
 * @author whuang022ai
 * @param <T> The MatrixArray Type
 */

public class MatrixElement <T> implements Matrix{
    private T value;
    private int row=0;
    private int col=0;
    public MatrixElement(int row,int col,T value){
        this.row=row;
        this.col=col;
        this.value=value;
    }
    public int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public T getValue(){
        return value;
    }
    @Override
    public String toString() { 
        return "M"+"["+row+"]"+"["+col+"]"+"="+value;
    } 
    @Override
    public void fill(Number val) {
        T v= (T) val;
        this.value=v;
    }
    
    @Override
    public void print() {
       System.out.print("M"+"["+row+"]"+"["+col+"]"+"="+value);
    }

    @Override
    public Matrix sum(Matrix val) throws MatrixDimensionsNotMatchException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matrix sub(Matrix val) throws MatrixDimensionsNotMatchException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matrix product(Matrix val) throws MatrixDimensionsNotMatchException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matrix product(Number val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int rowSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int colSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int row, int col, Number val) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Number get(int row, int col) throws IndexOutOfBoundsException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}