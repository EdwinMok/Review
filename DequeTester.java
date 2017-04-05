public class DequeTester {

    //For testing purposes
    /*Depending on your implementation, switch:
      addFirst(e) -> offerFirst(e)
      removeFirst() -> pollFirst()
      peekFirst() -> getFirst()
      addLast(e) -> offerLast(e)
      removeLast() -> pollLast()
      peekLast() -> getLast()
    */
    public static void main(String[] args){

	Deque<String> bigThings = new ALDeque<String>();//Modify if necessary

	//Will test adding strings pool, school and tool to the front of the deque
	System.out.println("\nnow enqueuing from front end...");
	bigThings.addFirst("pool");
	bigThings.addFirst("school");
	bigThings.addFirst("tool");

	//Will test adding strings building, car and plane to the back of the deque
	System.out.println("\nnow enqueuing from back end...");
	bigThings.addLast("building");
	bigThings.addLast("car");
	bigThings.addLast("plane");

	//Will test printing the deque using the overwritten toString()
	System.out.println("\nnow testing toString()...");
	System.out.println( bigThings );

	//Will test returning the values at the front and back ends of the deque
	System.out.println("\nnow testing peek methods...");
	System.out.println( bigThings.peekFirst() );
	System.out.println( bigThings.peekLast() );

	//Will test removing strings from the front end of the deque. Expects strings pool, school and tool to be printed in that order
	System.out.println("\nnow dequeuing from front end...");
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );
	System.out.println( bigThings.removeFirst() );

	//Will test removing strings from the back end of the deque. Expects strings plane, car and building to be printed in that order
	System.out.println("\nnow dequeuing from back end...");
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );

	//Will test returning the value of an empty deque which is null
	System.out.println("\nnow peeking from empty deque...");
	System.out.println( bigThings.peekFirst() );

	//-----------------------------------------------------------

	//Will test adding to the front end of the deque again
	System.out.println("\nnow adding from the front end");
	bigThings.addFirst("one");
	bigThings.addFirst("two");
	bigThings.addFirst("three");
	bigThings.addFirst("four");
	bigThings.addFirst("five");

	//Will test removing from the back end of the deque. Expects strings five, four, three, two and one to be printed in that order
	System.out.println("\nnow removing from the back end");
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );
	System.out.println( bigThings.removeLast() );

	//Will test throwing an exception if removing from an empty deque
	System.out.println("\nnow dequeuing from empty deque...");
	System.out.println( bigThings.removeFirst() );
	
    }
}
