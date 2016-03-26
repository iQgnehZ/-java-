/*
 * 迭代器中没有下一个元素时，此异常抛出
 */
package dsa;

public class ExceptionNoSuchElement extends RuntimeException {
	public ExceptionNoSuchElement(String err) 
	{  
		super(err); 
	}
}
