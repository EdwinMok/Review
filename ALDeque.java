 /*Lonely_Island: Piotr Milewski, Daniel Regassa, Edwin Mok
  APCS2 pd5
  Lab02 -- All Hands on Deque!
  2017-03-31*/

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ALDeque<T> implements Deque<T>{

    //Instance vars
    private int _size;
    private ArrayList<T> _deque;

    /*
      Default constructor
      precondition: none
      postcondition: initializes _deque and _size instance variables
    */
    public ALDeque(){
	_deque = new ArrayList<T>();
	_size = 0;
    }

    /*
      Add an item at the front end of the deque
      precondition: x is of the same type as ALDeque
      postcondition: x is added to the front of the deque
    */
    public void addFirst(T x){
	_deque.add(x);
	_size++;
    }

    /*
      Add an item at the back end of the deque
      precondition: x is of the same type as ALDeque
      postcondition: x is added to the back of the deque
     */
    public void addLast(T x){
	_deque.add(_size,x);
	_size++;
    }

    /*
      Remove the item at the front end of the deque
      precondition: none
      postcondition: returns the item at the front end of the deque
                     NoSuchElementException if this deque is empty
    */
    public T removeFirst(){
	T x = null;
	try{
	    x = _deque.remove(0);
	    _size--;
	}
	catch (NoSuchElementException e){
	    System.err.println("NoSuchElementException: " + e.getMessage());
	}
	return x;
    }

    /*
      Remove the item at the back end of the deque
      precondition: none
      postcondition: returns the item at the back end of the deque
                     NoSuchElementException if this deque is empty
    */
    public T removeLast(){
	T x = null;
	try{
	    x = _deque.remove(_size-1);
	    _size--;
	}
	catch (NoSuchElementException e){
	    System.err.println("NoSuchElementException: " + e.getMessage());
	}
	return x;
    }

    /*
      Return the item at the front end of the deque
      precondition: none
      postcondition: returns the item at the front end of the deque
                     returns null if this deque is empty
    */
    public T peekFirst(){
	if (!isEmpty()){
	    return _deque.get(0);
	}
	else{
	    return null;
	}
    }

    /*
      Return the item at the back end of the deque
      precondition: none
      postcondition: returns the item at the back end of the deque
                     returns null if this deque is empty
    */
    public T peekLast(){
	if (!isEmpty()){
	return _deque.get(_size-1);
	}
	else{
	    return null;
	}
    }

    /*
      Check to see if the deque is empty
      precondition: none
      postcondition: returns true if the deque is empty
                     returns false if the deque isn't empty
    */
    public boolean isEmpty(){
	return _size == 0;
    }

    /*
      Accessor for the size of the deque
      precondition: none
      postcondition: returns the size of the deque
    */
    public int size(){
	return _size;
    }

    /*
      Checks to see if deque contains the specified element
      precondition: x is of the same type as ALDeque
      postcondition: returns true if the deque contains x
                     retuns false if the deque doesn't contain x
    */
    public boolean contains(T x){
	for (int i = 0; i < _size; i++){
	    if (_deque.get(i).equals(x)){
		return true;
	    }
	}
	return false;
    }	

    /*
      Prints out the items in the deque, from front end to back end
      precondition: none
      postcondition: returns a string representation of the items in the deque beginning at the front end and ending at the back end
    */
    public String toString(){
	String s = "";
	for (int x = 0; x < _size; x++){
	    s += _deque.get(x) + ", ";
	}
	return s;
    }

    //For testing purposes
    public static void main(String[] args){
	Deque<String> bigThings = new ALDeque<String>();

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

	System.out.println("\nnow testing contains()...");
	System.out.println( bigThings.contains("plane") );
	System.out.println( bigThings.contains("building") );
	System.out.println( bigThings.contains("truck") );

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

	//Will throw an exception
	System.out.println("\nnow dequeuing from empty deque...");
	System.out.println( bigThings.removeFirst() );
    }
}
