package HotelQuestion;

public class RoomTest {

	 public static String solution(String[] floors)
	    {
	        int[] map = new int[260];
	        int max = 0;
	        String currentMax = floors[0];

	        for (int i = 0; i < floors.length; i++)
	        {
	            String currentRoom = floors[i];
	            if (currentRoom.charAt(0) == '-') continue;
	            int idx = (1 + currentRoom.charAt(1) - '0') * (1 + currentRoom.charAt(2) - 'A') - 1;
	            map[idx]++;
	            if (map[idx] > max)
	            {
	                max = map[idx];
	                currentMax = currentRoom;
	            }
	            else if (map[idx] == max)
	            {
	                currentMax = currentMax.compareTo(currentRoom) < 0 ? currentMax : currentRoom;
	            }
	        }

	        return currentMax.substring(1);
	    }
	 
	public static void main(String[] args) {
		
		String[] f={"-2D","+1A","+3E","-1A","+1A"};
		System.out.println(new RoomTest().solution(f));

	}

}
