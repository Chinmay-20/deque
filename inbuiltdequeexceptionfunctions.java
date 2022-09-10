import java.util.*;

//deque interface extends queue interface
//it supports functionalities provided by queue as well
//but use deque specific functions
class inbuiltdequeexceptionfunctions
{
	public static void main(String args[])
	{
		Deque<Integer> d=new LinkedList<Integer>();
		
		//these functions throws exception
		d.addFirst(10); //return true if item was successfullly added else false
		d.addLast(20);
		d.addFirst(5);
		d.addLast(15);
		
		System.out.println(d.getFirst());//gives you first and last item it gives is deque is empty
		System.out.println(d.getLast());
		
		d.removeFirst(); //return first item returns null if deque is empty
		d.removeLast();//return last item returns null if deque is empty
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		//two ways to print deque
		//1.iterattor
		Iterator it=d.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//2.for each loop
		for(int x:d)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		
		
		//iterator to traverse from last to first
		Iterator it2=d.descendingIterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next()+" ");
		}
		System.out.println();
	}
}
