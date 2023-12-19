package module;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		System.out.println("Search a best hotel through TAVERN");
		
		Hoteldb hotelList1 = new Hoteldb();
		
		hotelList1.addDataToNoCancellationHotelsList(new Hotel("Hotel Hogsmeade Inn" , 2 , 20 , 2000));
		hotelList1.addDataToNoCancellationHotelsList(new Hotel("Hotel Hogsmeade Inn" , 3 , 20 , 3000));
		hotelList1.addDataToNoCancellationHotelsList(new Hotel("Hotel Joy N Jenny" , 1 , 20 , 1500));
		hotelList1.addDataToNoCancellationHotelsList(new Hotel("Hotel Hardhome" , 3 , 20 , 4500));
		
		
		Hoteldb hotelList2 = new Hoteldb();
		
		hotelList2.addDataToNoServiceChargeHotelsList(new Hotel("Hotel Kanto" , 2 , 20 , 1800));
		hotelList2.addDataToNoServiceChargeHotelsList(new Hotel("Hotel Kanto" , 3 , 20 , 3500));
		hotelList2.addDataToNoServiceChargeHotelsList(new Hotel("Hotel Imperial" , 1 , 20 , 1500));
		
		
		
		Hoteldb hotelList3 = new Hoteldb();
		
		hotelList3.addDataToNoWorryOnlyHurryHotelsList(new Hotel("Hotel Mandarin" , 3 , 20 , 3800));
		
		
		
		
		int combination = 0 ;
		int beds = 0;
		
		//Taking input from user for searching hotel
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tell the total combination of room(s) you are looking for-");
		
		combination = sc.nextInt();
		
		System.out.println("Tell the room(s) you are looking for-");
		
		beds=sc.nextInt();
		
		Services  service  = new Services(hotelList1.getNoCancellationHotelsList() , hotelList2.getNoServiceChargeHotelsList() ,hotelList3.getNoWorryOnlyHurryHotelsList());
		
		List<String> getavailableHotelList = service.searchHotel(combination,beds);
		
		if(getavailableHotelList==null)
			System.out.println("No rooms found");
		
		//printing available hotel with combination and beds
		for(String s : getavailableHotelList)
			System.out.println("-"+s);
		
		
		
		
		
		
		
	}
}
