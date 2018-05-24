
package com.whuang022.ai.litematrix.mat;

/**
 * MatrixDimensionsNotMatchException
 * 
 * @author whuang022ai
 */
public class MatrixDimensionsNotMatchException extends ArithmeticException{
    private String retCd ;
    private String msgDes; 
    
    public MatrixDimensionsNotMatchException() {  
        super();  
    }  
    public MatrixDimensionsNotMatchException(String message) {  
        super(message);  
        msgDes = message;  
    }  
    public MatrixDimensionsNotMatchException(String retCd, String msgDes) {  
        super();  
        this.retCd = retCd;  
        this.msgDes = msgDes;  
    }  
    public String getRetCd() {  
        return retCd;  
    }  
    public String getMsgDes() {  
        return msgDes;  
    }  
}
