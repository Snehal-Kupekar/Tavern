package module;

import java.util.ArrayList;
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
	}



	



	public List<String> searchHotel(int combination , int bed ) {
		
		//searching in website 1
		for(Hotel h : hotelList1) {
			if(h.getRoom_type()==bed)
				searchList.add(h.getHotel());
		}
		
		
		//searching in website 2
		for(Hotel h : hotelList2) {
			if(h.getRoom_type()==bed)
				searchList.add(h.getHotel());
		}
		
		//searching in website 3
		for(Hotel h : hotelList3) {
			if(h.getRoom_type()==bed)
				searchList.add(h.getHotel());
		}
		return searchList;
	}
}
