import java.util.*;


class inbuiltdeque
{
	public static void main(String args[])
	{
		Deque<Integer> d=new LinkedList<Integer>();
		
		//these functions does not throw exception
		d.offerFirst(10); //return true if item was successfullly added else false
		d.offerLast(20);
		d.offerFirst(5);
		d.offerLast(15);
		
		System.out.println(d.peekFirst());//gives you first and last item it gives is deque is empty
		System.out.println(d.peekLast());
		
		d.pollFirst(); //return first item returns null if deque is empty
		d.pollLast();//return last item returns null if deque is empty
		
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
	}
}
