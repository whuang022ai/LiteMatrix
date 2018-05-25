# LiteMatrix

# About

A pure java object-oriented matrix computing and numerical analysis lib.

# Maven

If you use Maven to manage the dependencies in your Java project, 
you do not need to download; just place the following into your POM's <dependencies> section:
```
	<dependencies>
        <dependency>
            <groupId>com.github.whuang022ai</groupId>
            <artifactId>LiteMatrix</artifactId>
            <version>4.2.1</version>
        </dependency>
	</dependencies>
```
# Example

Creat MatrixTest.java and add the following code :

```Java
package your_package //remember to change to your package

import com.whuang022.ai.litematrix.mat.*;

public class MatrixTest {

    public static void main(String[] args) {
		Matrix <Double> m1=new  MatrixArray<Double>(3,3);
		m1.fill(3.0);
		Matrix <Integer> m2=new  MatrixArray<Integer>(3,3);
		m2.fill(2);
		Matrix <Double> m3=m1.sum(m2);
		m3.print();
    }
} 

```
And You will get :

```
5.0 5.0 5.0 
5.0 5.0 5.0 
5.0 5.0 5.0 
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------

```

# Status

## Do not have Stable Release Sorry.
LiteMatrix now is still in development. 