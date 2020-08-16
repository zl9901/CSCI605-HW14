
import java.util.Iterator;
import java.util.NoSuchElementException;

class MyIterator  implements Iterator {
	int indexOfHasNext=0;
	Object buffer[];
	
    MyIterator(Object buffer[])	{
    	this.buffer=buffer;
    }
    
    public boolean hasNext(){
    	//assert current<buffer.length:"out of index";
    	int index=indexOfHasNext;
    	boolean rValue=false;
    	while ((index<buffer.length)&&(buffer[index]==null)) {
    		index++;
    	}
    	if (index==buffer.length) {
    		rValue=false;
    	}else {
    		indexOfHasNext=index;
    		rValue=true;
    	}
  		return rValue;
    }
    
    public Object next(){
  		return buffer[indexOfHasNext++];
    }

}
// assume all other methods needed are present and corrctly implemented
	public class ArrayBuffer  {
	   int MAX = 10;
	
	   Object buffer[] = new Object[MAX];
	   public ArrayBuffer()	{
		   	for ( int index = 0; index < MAX; index ++ ){
			buffer[index] = null;
		}
   }
   
   
   public int max()	{
	   return MAX;
   }
   
   
   public boolean add(Object obj)	{
		boolean rValue = false;
		for ( int index = 0; index < MAX; index ++ )	{
			if ( buffer[index] == null )	{
				buffer[index] = obj;
				rValue = true;
				break;
			}
		}
		return rValue;
  }
   
   
   	boolean remove(Object o)	{
   		boolean rValue = false;
		for ( int index = 0; index < MAX; index ++ )	{
			if ( o.equals(buffer[index]) )	{
				buffer[index] = null;
				rValue = true;
			}
		}
			return rValue;
	}
   	
   Iterator iterator()	{
	   /**
	    * 返回一个实现了Iterator接口的对象
	    */
  		return new 	MyIterator(buffer);
   }
   
   public static void main(String args[] ) {
	   ArrayBuffer aArrayBuffer = new ArrayBuffer();
	   Object anObject;
	   
	for ( int index = 0; index < aArrayBuffer.max() / 2; index ++ )	
		aArrayBuffer.add( anObject = new Object() );
		Iterator anIterator = aArrayBuffer.iterator();

	for ( int index = 0; index < aArrayBuffer.max() ; index ++ ){
		if  ( anIterator.hasNext() )
			System.out.println(index + ": " + anIterator.next() );
		else
			System.out.println(index + ": null " );
	}
   }
}