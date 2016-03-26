/*
 * 列表中没有元素时，此异常抛出
 */
package dsa;

public class ExceptionListEmpty extends RuntimeException
{
	public ExceptionListEmpty(String err) 
	{  
		super(err); 
	}
}
