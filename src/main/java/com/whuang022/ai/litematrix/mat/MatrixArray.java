
package com.whuang022.ai.litematrix.mat;

import com.whuang022.ai.litematrix.compute.ComputeCell;
import com.whuang022.ai.litematrix.compute.ComputeCellDouble;
import com.whuang022.ai.litematrix.compute.ComputeCellInteger;

/**
 *
 * @author whuang022aix 
 */
public class MatrixArray <T extends Number> implements Matrix2D{
    
    private static final String[][] errorTableIndexOutofBounds={{"Success.","Column Index Out Of Bounds."},{"Row Index Out Of Bounds.","Row And Column Index Out Of Bounds."}};
    private static final String[][] errorTableMatrixDimensionsNotMatch={{"Success.","Column Dimension Not Match."},{"Row Dimension Not Match.","Row And Column Dimension Not Match."}};
    private ComputeCell  compute;
    private  int rows; //rows = up-down direction size
    private  int cols; //cols = left-right direction size
    private T[][] mat;
    
    private void initMatrixComputeCell(Number v){
        if (v instanceof Double) {
            compute=ComputeCellDouble.getInstance();
            System.out.println("A");
        } else if (v instanceof Integer) {
            compute=ComputeCellInteger.getInstance();
            System.out.println("Q");
        } else if (v instanceof Float) {
            
        } else if (v instanceof Long) {
            
        } else if (v instanceof Short) {
            
        } else if (v instanceof Byte) {
            
        }else if (v == null) {
            System.out.println("LL");
        }
        else {
            System.out.println("DDD");
            //throw new IllegalArgumentException("Type " + v.getClass() + " is not supported by this method");
        }
    }
    private  void initM(int rows,int cols,Number val){
        this.cols=cols;
        this.rows=rows;
        this.mat=(T[][]) new  Number [rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                this.mat[i][j]=(T)val;
            }
        }
        
        initMatrixComputeCell(val); 
    }

    public MatrixArray(int rows,int cols,T val){
        initM( rows, cols, val);
    }
    @Override
    public T get(int row, int col) throws IndexOutOfBoundsException {
        int rowCheck=0;
        int colCheck=0;
        boolean check=false;
        if(row<0||row>=rows){
            rowCheck=1;
            check=true;
        }
        if(col<0||col>=cols){
            colCheck=1;
            check=true;
        }
        if(check){throw new IndexOutOfBoundsException(errorTableIndexOutofBounds[rowCheck][colCheck]); 
        }else{
           return mat[row][col];
        }
    }

    @Override
    public MatrixElement getMatrixElement(int row, int col) {
        int rowCheck=0;
        int colCheck=0;
        boolean check=false;
        if(row<0||row>=rows){
            rowCheck=1;
            check=true;
        }
        if(col<0||col>=cols){
            colCheck=1;
            check=true;
        }
        if(check){throw new IndexOutOfBoundsException(errorTableIndexOutofBounds[rowCheck][colCheck]); 
        }else{
           return new  MatrixElement<T>(row,col,mat[row][col]);
        }
    }
    
    @Override
    public void set(int row, int col, Number val) throws IndexOutOfBoundsException {
        int rowCheck=0;
        int colCheck=0;
        boolean check=false;
        if(row<0||row>=rows){
            rowCheck=1;
            check=true;
        }
        if(col<0||col>=cols){
            colCheck=1;
            check=true;
        }
        if(check){throw new IndexOutOfBoundsException(errorTableIndexOutofBounds[rowCheck][colCheck]); 
        }else{
            T v=(T) val;
            mat[row][col]=v;
        }
    }

    @Override
    public int rowSize() {
        return rows;
    }

    @Override
    public int colSize() {
        return cols;
    }

    @Override
    public void fill(Number val) {
        T v=(T) val;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=v;
            }
       }
    }

    @Override
    public void print() {
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println("");
       }
    }

    @Override
    public Matrix <T> sum(Matrix val) throws MatrixDimensionsNotMatchException {
        int rowCheck=0;
        int colCheck=0;
        boolean check=false;
        if(val.rowSize()!=rows){
            rowCheck=1;
            check=true;
        }
        if(val.colSize()!=cols){
            colCheck=1;
            check=true;
        }
        Matrix <T> sum=new MatrixArray(rows,cols,mat[0][0]);
        if(check){throw new IndexOutOfBoundsException(errorTableMatrixDimensionsNotMatch[rowCheck][colCheck]); 
        }else{
            
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    T v =mat[i][j];
                    T u=(T) val.get(i,j);
                    T s;
                    if (v == null || u == null) {
                        return null;
                    }
                    s =(T) compute.sum(v, u);
                    sum.set(i,j,s);
              }
            }
        }
        return sum;
    }

    @Override
    public Matrix <T> sub(Matrix val) throws MatrixDimensionsNotMatchException {
        int rowCheck=0;
        int colCheck=0;
        boolean check=false;
        if(val.rowSize()!=rows){
            rowCheck=1;
            check=true;
        }
        if(val.colSize()!=cols){
            colCheck=1;
            check=true;
        }
        Matrix <T> sub=new MatrixArray(rows,cols,mat[0][0]);
        if(check){throw new IndexOutOfBoundsException(errorTableMatrixDimensionsNotMatch[rowCheck][colCheck]); 
        }else{
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    T v =mat[i][j];
                    T u=(T) val.get(i,j);
                    T s;
                    if (v == null || u == null) {
                        return null;
                    }
                    s=(T) compute.sub(v, u);
                    sub.set(i,j,s);
              }
            }
        }
        return sub;
    }

    @Override
    public Matrix mul(Matrix val) throws MatrixDimensionsNotMatchException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Matrix mul(Number u) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Matrix <T> mul=new MatrixArray(rows,cols,mat[0][0]);
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                T v =mat[i][j];
                T s;
                if (v == null || u == null) {
                    return null;
                }
                s=(T) compute.mul(v, u);
                mul.set(i,j,s);
            }
       } 
        return mul;
        
    }
    
    /////
    @Override
    public MatrixIterator getMatrixIterator() {
        MatrixArrayIterator<T> it = new MatrixArrayIterator<>(mat);
        return it;
    }
    
}
