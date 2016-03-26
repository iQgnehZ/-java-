/*
 * 当队列空时，此意外抛出
 */
package dsa;

public class ExceptionQueueEmpty extends RuntimeException 
{  
	public ExceptionQueueEmpty(String err)
	{   
		super(err);
	}
} 
