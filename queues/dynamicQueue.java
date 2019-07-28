package queues;

public class dynamicQueue extends queueimplementation {
	public void enqueue(int value) throws Exception
	{ if(this.size()==this.data.length)
	{
		int arr[]=new int[2*data.length];
		for(int i=0;i<=data.length;i++)
		{
			arr[i] = this.data[(this.front + i) % this.data.length];
		}
		data=arr;front=0;
	}
super.enqueue(value);
	
	}

	public static void main(String[] args)throws Exception {
		queueimplementation q=new dynamicQueue();
		for(int i=0;i<20;i++)
		{
			q.enqueue(i*1);
		}
q.display();
	}

}
