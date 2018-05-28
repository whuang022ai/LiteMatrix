/*
 * Copyright 2018 minghanyang.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.whuang022.ai.litematrix.compute;

/**
 *
 * @author minghanyang
 */
public class ComputeCellInteger < T extends Number>implements ComputeCell{
    private static class ComputeCellIntegerHolder {  
        private static final ComputeCellInteger  INSTANCE = new ComputeCellInteger<>();  
    }  
    private ComputeCellInteger (){}  
        public static final ComputeCellInteger getInstance() {  
        return ComputeCellIntegerHolder.INSTANCE;  
    } 
        
    public final static int typeID=1;
    
    @Override
    public Number sum(Number arg0, Number arg1) {
        Integer argA=arg0.intValue();
        Integer argB=arg1.intValue();
        return (argA+argB);
    }

    @Override
    public Number sub(Number arg0, Number arg1) {
        Integer argA=arg0.intValue();
        Integer argB=arg1.intValue();
        return (argA-argB);
    }

    @Override
    public Number mul(Number arg0, Number arg1) {
        Integer argA=arg0.intValue();
        Integer argB=arg1.intValue();
        return (argA*argB);
    }

    @Override
    public Number div(Number arg0, Number arg1) {
        Integer argA=arg0.intValue();
        Integer argB=arg1.intValue();
        return (argA/argB);
    }

    @Override
    public Number mod(Number arg0, Number arg1) {
        Integer argA=arg0.intValue();
        Integer argB=arg1.intValue();
        return (argA%argB);
    }
}
