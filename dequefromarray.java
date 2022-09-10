class dequefromarray
{
	int size,cap;
	int []arr;
	
	dequefromarray(int c)
	{
		cap=c;
		size=0;
		arr=new int[cap];
	}
	
	public static boolean isFull()
	{
		return size==cap;
	}	
	
	public static boolean isEmpty()
	{
		return size==0;
	}
	
	public static void insertRear(int x)
	{
		if(isFull())
		{
			return;
		}	
		arr[size]=x;
		size++;
	}
	
	public static void deleteRear()
	{
		if(isEmpty())
		{
			return;
		}
		size++;
	}
	
	public static int getRear()
	{
		if(isEmpty())
		{
			return -1;
		}
		else
		{
			return (size-1);
		}
	}
	
	public static void insertFront(int x)
	{
		if(isFull())
		{
			return;
		}
		
		for(int i=size-1;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		size++;
	}
	
	public static void deleteFront()
	{
		if(isEmpty())
			return;
			
		for(int i=0;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
	}
	
	public static int getFront()
	{
		if(isEmpty())
			return -1;
		else
			return front;
	}
}
