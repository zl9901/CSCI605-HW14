import java.util.*;

public class X_4 {

    protected String  left;
    protected String  right;

    static final Comparator nameC = new Comparator() {
            public int compare(Object o1, Object o2) {
				X_4 n1 = (X_4)o1;	// cast execption
				X_4 n2 = (X_4)o2;	// cast execption
				return n1.right.compareTo(n2.right);
	    }
    };

    public X_4(String left, String right) {
        this.left = left;
        this.right  = right;
    }

    public boolean equals(Object o) {
	// your code here
    	if(!(o instanceof X_4)) 
    		return false;
    	
    	 	X_4 n = (X_4)o;
            return (n.left.equals(left) && n.right.equals(right));
    	
//    	 return super.equals(o);
    }

   public String toString() {
	   return left + "; " + right;
   }

   public int compareTo(Object o) {
        X_4 n = (X_4)o;       // cast execption
        return n.right.compareTo(right);
                
    }

    public static void main(String args[]) {
    	
        X_4 n[] = {
            new X_4("one", 	"two"),
            new X_4("two", 	"one"),
            new X_4("three", "two"),
            new X_4("four", "five"),
            new X_4("six", 	"one")
        };
        TreeSet l = new TreeSet(nameC);
	    System.out.println(n[0].equals(n[2]));
		for ( int i = 0; i < n.length; i ++ )	{
			l.add(n[i]);
		}
	        System.out.println("the TreeSet: " + l);
	}
}
