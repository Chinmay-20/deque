import java.util.*;

class datastructurewithminmaxoperation
{
	//insert minimum we insert in front of deque and insert max insert at rear of deque
	//for minimum getfront and for max getrear
	//delete minimum simply delete first item and delete maximum delete the rear 
	
	Deque<Integer> dq;
	
	datastructurewithminmaxoperation()
	{
		dq=new LinkedList<Integer>();
	}
	
	void insertMin(int x)
	{
		dq.offerFirst(x);
	}
	
	void insertMax(int x)
	{
		dq.offerLast(x);
	}
	
	int getMin()
	{
		return dq.peekFirst();
	}
	
	int getMax()
	{
		return dq.peekLast();
	}
	
	int extractMin()
	{
		return dq.pollFirst();
	}
	
	int extractMax()
	{
		return dq.pollLast();
	}

	public static void main(String args[])
	{
		datastructurewithminmaxoperation dobj=new datastructurewithminmaxoperation();
		
		dobj.insertMin(10);
		dobj.insertMax(15);
		dobj.insertMin(5);
		System.out.println(dobj.extractMin());
		System.out.println(dobj.extractMax());
		dobj.insertMin(8);
	}
}
