
import java.util.*;

public class Hotel {
	
		private String hotelName;
		
		private int totalRooms;		
		// Each hotel has rooms numbered 0, 1, 2, . . . , 
		// up to (totalRooms-1).
		
		private Reservation[ ] rooms;
		// each element corresponds to a room in the hotel; 
		// if rooms[index] is null, the room is empty;
		// otherwise, it contains a reference to the Reservathion 
		// for that room, such that
		// rooms[index].getRoomNumber() returns index.		

		private ArrayList<String> waitList;
		// A list that contains names of guests who have not yet been assigned a room because all rooms are full.
		// If there are any empty rooms (rooms with no reservation),
		// then create a reservation for an empty room for the specified guest and return the new Reservation;
		// otherwise, add the guest to the end of waitlist and return null.

		// Todo: add a static variable, totalGuests, to keep track 
		// how many guests request rooms so far.
		
		
		//Todo: given a hotel name and total number of rooms 
	        //      implement a constructor.
		public Hotel(String hName, int nRooms) {
			// Your code is here.
		}
		
		/* Todo: implement this method.
		 * Method requestRoom() attempts to reserve a room in the
		 * hotel for a given guest. If there are any empty rooms in the 
		 * hotel, one of them will be assigned to the named guest and
		 * the newly created reservation is returned. If there are no 
		 * empty rooms, the guest is added to the end of the waiting
		 * list and null is returned.
		 * And, in either case, the static variable totalGuests is 
		 * increased by one. 
                */
		public Reservation requestRoom(String guestName)
		{  
		    // Your code is here.
		}
			
		/* Todo: implement the following method.
		 * Release the room associated with parameter res, effectively 
		 * canceling the reservation;
		 * if any names are stored in waitList, remove the first name
		 * and create a Reservation for this person in the room 
		 * reserved by res; return that new Reservation;
		 * if waitList is empty, mark the room specified by res 
                 * empty and return null.
                 * And decrease the static variable totalGuests by one.
                  * 
		 * precondition: res is a valid Reservation for some room 
		 *               in this hotel.	
		 */
		public Reservation cancelAndReassign(Reservation res)
		{ 
                   //Your code is here.
		}
		
		// Todo: implment the method that returns the number 
		// of guests in the waiting list. 
		public int numWaitings() {
			//Your code is here.
		}
		
		// Todo: this method is to return a string that describes the 
		// information for each room. If the room is empty, return 
		// a string [roomNumber:null]. Otherwise, just reuse 
		// Reservation::toString() method.
		public String toString() {
                  // Your code is here.
		}

}

