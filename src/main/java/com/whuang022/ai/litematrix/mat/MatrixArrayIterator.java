
package com.whuang022.ai.litematrix.mat;


public class MatrixArrayIterator <T> implements MatrixIterator{
    private int i=0;int j=0;
    private boolean hasNetElement=true;
    private int rowSize=0;
    private int colSize=0;
    private final T[][] mat;
    public MatrixArrayIterator (T [][] mat){
        rowSize=mat.length;
        colSize=mat[0].length;
        this.mat=mat;
    }
    @Override
    public boolean hasNextRow(){
        return i+1<rowSize;
    }
    @Override
    public boolean hasNextColumn(){
        return j+1<colSize;
    }
    @Override
    public boolean hasNextElement() {
        if(!hasNetElement){
            return false;
        }
        else{
            return i+1<rowSize||j<colSize;
        }
    }
    
    /**
     * getNextElement()
     * @return MatrixElement
     */
    @Override
    public MatrixElement getNextElement(){
        T o=mat[i][j];
        MatrixElement <T> element=new MatrixElement<>(i,j,o);
        if(hasNextColumn()){
            j++;
        }
        else{
            if(hasNextRow()){
                j=0;
                i++;
            }
            else{
                hasNetElement=false;
            }
        }
        return  element;
    }  
}
