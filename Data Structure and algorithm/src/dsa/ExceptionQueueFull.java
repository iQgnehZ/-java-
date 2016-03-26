/*
 * 当队列满时，此意外抛出
 */
package dsa;

public class ExceptionQueueFull extends RuntimeException 
{  
	public ExceptionQueueFull(String err)
	{   
		super(err);
	}
} 
