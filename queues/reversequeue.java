package queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversequeue {
	public static void reversequeue(Queue<Integer> q)
	{
		Stack<Integer> s=new Stack<>();
		while(!q.isEmpty())
		{
			s.push(q.remove());
		}
		while(!s.isEmpty())
		{
			q.add(s.pop());
		}
	
	}

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		reversequeue(q);
		
		while(!q.isEmpty())
		{
			System.out.print(q.remove()+"->");
		}
		System.out.println("End");

	}

}
