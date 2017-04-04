public interface Deque<Card>
{
    /*
      Add an item at the front end of the deque
      precondition: x is of the same type as ALDeque
      postcondition: x is added to the front of the deque
    */
    public void addFirst( Card card );

    /*
      Add an item at the back end of the deque
      precondition: x is of the same type as ALDeque
      postcondition: x is added to the back of the deque
    */
    public void addLast( Card card );
   
    /*
      Remove the item at the front end of the deque
      precondition: none
      postcondition: returns the item at the front end of the deque
                     NoSuchElementException if this deque is empty
    */
    public Card removeFirst();

    /*
      Remove the item at the back end of the deque
      precondition: none
      postcondition: returns the item at the back end of the deque
                     NoSuchElementException if this deque is empty
    */
    public Card removeLast();

    /*
      Return the item at the front end of the deque
      precondition: none
      postcondition: returns the item at the front end of the deque
                     returns null if this deque is empty
    */
    public Card peekFirst();

    /*
      Return the item at the back end of the deque
      precondition: none
      postcondition: returns the item at the back end of the deque
                     returns null if this deque is empty
    */
    public Card peekLast();

    /*
      Check to see if the deque is empty
      precondition: none
      postcondition: returns true if the deque is empty
                     returns false if the deque isn't empty
    */
    public boolean isEmpty();

    /*
      Accessor for the size of the deque
      precondition: none
      postcondition: returns the size of the deque
    */
    public int size();

    /*
      Checks to see if deque contains the specified element
      precondition: x is of the same type as ALDeque
      postcondition: returns true if the deque contains x
                     retuns false if the deque doesn't contain x
    */
    public boolean contains(Card card);

}
