package module;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Services {
	private List<Hotel> hotelList1;
	private List<Hotel> hotelList2;
	private List<Hotel> hotelList3;
	
	List<String> searchList = new ArrayList<>();
	
	
	public Services(List<Hotel> hotelList1, List<Hotel> hotelList2, List<Hotel> hotelList3) {
		super();
		this.hotelList1 = hotelList1;
		this.hotelList2 = hotelList2;
		this.hotelList3 = hotelList3;
		
		
		//sorting all the list of hotels as per increasing price of rooms
		Collections.sort(hotelList1, Comparator.comparing(Hotel::getPrice));
		Collections.sort(hotelList2, Comparator.comparing(Hotel::getPrice));
		Collections.sort(hotelList3, Comparator.comparing(Hotel::getPrice));
	}



	



	public List<String> searchHotel(int combination , int bed ) {
		
		boolean flag1 = false;
		boolean flag2 = false;
		boolean flag3 = false;
		
		
		//searching in website 1
		for(Hotel h : hotelList1) {
			if(h.getRoom_type()==bed && flag1==false) {
				flag1 = true;
				searchList.add(h.getHotel());
			}
				
		}
		
		
		//searching in website 2
		for(Hotel h : hotelList2) {
			if(h.getRoom_type()==bed && flag2==false) {
				flag2=true;
				searchList.add(h.getHotel());
			}
		}
		
		//searching in website 3
		for(Hotel h : hotelList3) {
			if(h.getRoom_type()==bed && flag3==false) {
				flag3 =true;
				searchList.add(h.getHotel());
			}
		}
		
		
		return searchList;
	}
}
