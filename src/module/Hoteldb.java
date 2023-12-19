package module;

import java.util.ArrayList;
import java.util.List;

public class Hoteldb {
	
	private List<Hotel> noCancellationHotelsList = new ArrayList<>();
	private List<Hotel> noServiceChargeHotelsList = new ArrayList<>();
	private List<Hotel> noWorryOnlyHurryHotelsList = new ArrayList<>();
	
	
	
	//adding data to noCancellationHotelsList
	
	public List<Hotel> getNoCancellationHotelsList() {
		return noCancellationHotelsList;
	}
	
	
	//return data from noCancellationHotelsList
	public void addDataToNoCancellationHotelsList(Hotel hotel) {
		noCancellationHotelsList.add(hotel);
	}
	
	
	//adding data to NoServiceChargeHotelsList
	public List<Hotel> getNoServiceChargeHotelsList() {
		return noServiceChargeHotelsList;
	}
	
	//return data from NoServiceChargeHotelsList
	public void addDataToNoServiceChargeHotelsList(Hotel hotel) {
		noServiceChargeHotelsList.add(hotel);
	}
	
	//adding data to NoWorryOnlyHurryHotelsList
	public List<Hotel> getNoWorryOnlyHurryHotelsList() {
		return noWorryOnlyHurryHotelsList;
	}
	
	
	//return data from NoWorryOnlyHurryHotelsList
	public void addDataToNoWorryOnlyHurryHotelsList(Hotel hotel) {
		noWorryOnlyHurryHotelsList.add(hotel);
	}
	
	
	
	
	
	
	
}
