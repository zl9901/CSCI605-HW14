 import java.util.*;


		class MyComparator implements Comparator {
		
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				Id s1 = (Id)o1;
				Id s2 = (Id)o2;
				//return s1.a.compareTo(s2.a);
				return -1*s1.compareTo(s2);
			}
}
		
		class Id implements Comparable {
			String a;
			
		 	Id(String a)	{
		    	this.a = a;
		    }

		    
		    public String toString()	{
				//return "-"+ a + "-" ;
		    	return a;
		    }
		    

			@Override
			public int compareTo(Object o) {
				// TODO Auto-generated method stub
				Id anId = (Id)o;	
//				int lastcmp=anId.a.compareTo(a);
//				return lastcmp;
				return -1*a.compareTo(anId.a);
			}
	}
		
	
	
public class X_2 {
    public static void main(String args[]) {
        List<Id> myIntList = new ArrayList<Id>();
		myIntList.add( new Id ("a"));
		myIntList.add( new Id ("b"));
		myIntList.add( new Id ("c"));
        Collections.sort(myIntList);
        System.out.println(myIntList);
        Collections.sort(myIntList, new MyComparator() );
        System.out.println(myIntList);
    }
}