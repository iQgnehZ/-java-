package dsa;
/*
 *  ���нӿ� 
 */
public interface Queue {

	//���ض�����Ԫ����Ŀ
	public int getSize();
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty();
	//ȡ����Ԫ�أ�����ɾ����
	public Object front()  throws ExceptionQueueEmpty; 
	//���
	public void enqueue (Object obj)  throws ExceptionQueueFull;
	//����  throws ExceptionQueueEmpty
	public Object dequeue(); 
	//����	
	 public void Traversal(); 	
}
