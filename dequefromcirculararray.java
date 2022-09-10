class dequefromcirculararray
{
	int size,cap,front;//rear is (front+size-1)%cap 
	int []arr;
	//here front is considered at end of queue and rear is considered at front of queue
	dequefromcirculararray(int c)
	{
		cap=c;
		size=0;
		arr=new int[cap];
	}
	
	public boolean isFull()
	{
		return size==cap;
	}	
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public int getFront()
	{
		if(isEmpty())
			return -1;
		else
			return 0;
	}
	
	public int getRear()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return (front+size-1)%cap;
		}
	}
	
	public void deleteFront() 
	{
		if(isEmpty())
			return;
			
		front=(front+1)%cap;
		size--;
	}
	
	public void insertRear(int x)
	{
		if(isFull())
		{
			return;
		}	
		int new_rear=(front+size)%cap;
		arr[new_rear]=x;
		size++;
	}
	public void insertFront(int x)
	{
		if(isFull())
		{
			return;
		}
		front=(front+cap-1)%cap;
		arr[front]=x;
		size++;
	}
	
	public void deleteRear()
	{
		if(isEmpty())
		{
			return;
		}
		size--;
	}

	public static void main(String args[])
	{
		dequefromcirculararray dobj=new dequefromcirculararray(4);
		
		dobj.insertFront(10); //element gets added at end
		dobj.insertRear(20);//element gets added in front
		dobj.insertRear(30);
		dobj.deleteFront();
		dobj.deleteRear();
	}
} 
		
		
