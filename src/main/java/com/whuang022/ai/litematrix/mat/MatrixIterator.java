
package com.whuang022.ai.litematrix.mat;

/**
 * MatrixIterator abstract
 * @author whuang022ai
 * @param <M> MatrixElementType
 */

public interface MatrixIterator <M>{  
   public boolean hasNextRow();
   public boolean hasNextColumn();
   public boolean hasNextElement();
   public M getNextElement();
}
