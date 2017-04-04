public class DequeTester {

    //For testing purposes
    public static void main(String[] args){

	Deque<String> bigThings = new ALDeque<String>();//Modify if necessary
	
	System.out.println("\nnow enqueuing from front end...");
	bigThings.addFirst("pool");
	bigThings.addFirst("school");
	bigThings.addFirst("tool");

	System.out.println("\nnow enqueuing from back end...");
	bigThings.addLast("building");
	bigThings.addLast("car");
	bigThings.addLast("plane");

	System.out.println("\nnow testing toString()...");
	System.out.println( bigThings );

	System.out.println("\nnow testing peek methods...");
	System.out.println( bigThings.peekFirst() );
	System.out.println( bigThings.peekLast() );
	
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );

	System.out.println("\nnow dequeuing from back end...");
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );

	System.out.println("\nnow peeking from empty deque...");
	System.out.println( bigThings.peekFirst() );

	//-----------------------------------------------------------

	System.out.println("\nnow adding from the front end");
	bigThings.addFirst("one");
	bigThings.addFirst("two");
	bigThings.addFirst("three");
	bigThings.addFirst("four");
	bigThings.addFirst("five");

	System.out.println("\nnow removing from the back end");
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );

	//Will throw an exception
	System.out.println("\nnow dequeuing from empty deque...");
	System.out.println( bigThings.removeFirst() );
	
    }
}
