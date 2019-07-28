package queues;

public class queueimplementation {
	int []data;
	int front;
	int size;
	public static final int defcap=10;
	public queueimplementation() {
	this(defcap);
	}
	public queueimplementation(int defcap) {
	data=new int[defcap];
	front=0;
	size=0;
	}
	public int size()
	{
		return size;
	}
	public boolean isempty()
	{
		 if(size()==0);
		 {
		 return true;
		 }
	}
	public void enqueue(int value) throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("overflow");
		}
		int ai=(front+size())%data.length;
		this.data[ai]=value;
		size++;
	}
	public int dequeue() throws Exception
	{
		if(this.size()==0)
		{
			throw new Exception("underflow");
		}
		int rv=this.data[front];
		this.data[front]=0;
		front=(front+1)%data.length;
		size--;
		return rv;
	}
	public int front() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");

		}

		int rv = this.data[this.front];
		return rv;

	}
	public void display()
	{
		for(int i=0;i<size();i++)
		{ int ai=(front+i)%data.length;
			System.out.print(data[ai]+"->");
		}
		System.out.println("End");
	}
	public static void main(String[] args) throws Exception{
		queueimplementation queue=new queueimplementation();
		for(int i=0;i<10;i++)
		{
			queue.enqueue(1*i);
		}
		queue.display();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.display();
		

	}

}
