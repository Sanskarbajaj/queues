package queues;

import stacks.dynamicstack;

public class queuesusingstacks {
	public dynamicstack stack1;
	public dynamicstack stack2;
	public int size()
	{
		return this.stack1.size();
	}
	public boolean isempty()
	{
	if(this.stack1.size()==0)
		return true;
	return false;
	}
public void enqueue(int value) throws Exception
{
	while(!(stack1.isEmpty()))
	{
		stack2.push(stack1.pop());
	}
	stack1.push(value);
	while(!stack2.isEmpty())
	{
	stack1.push(stack2.pop());
	}
	
}
public int dequeue() throws Exception
{
	return stack1.pop();
}
public void display() throws Exception
{  reverseStack(stack1, stack2, 0);
	stack1.display();
	 reverseStack(stack1, stack2, 0);
}
private static void reverseStack(dynamicstack stack, dynamicstack helper, int index) throws Exception {
	if (stack.isEmpty()) {
		return;
	}
	int element = stack.pop();
	reverseStack(stack, helper, index + 1);
	helper.push(element);
	if (index == 0) {
		while (!helper.isEmpty()) {
			stack.push(helper.pop());
		}
	}
}
	public static void main(String[] args)throws Exception {
		queuesusingstacks qustk=new queuesusingstacks();
		for(int i=0;i<6;i++)
		{
			qustk.enqueue(i*1);
		}
		qustk.display();
		
		

	}

}
