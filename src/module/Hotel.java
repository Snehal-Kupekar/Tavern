package module;

public class Hotel {
	private String hotel ;
	private int room_type;
	private int available_rooms;
	private int price;
	
	public Hotel() {
		super();
	}

	public Hotel(String hotel, int room_type, int available_rooms, int price) {
		super();
		this.hotel = hotel;
		this.room_type = room_type;
		this.available_rooms = available_rooms;
		this.price = price;
	}

	public String getHotel() {
		return hotel;
	}

	public void setHotel(String hotel) {
		this.hotel = hotel;
	}

	public int getRoom_type() {
		return room_type;
	}

	public void setRoom_type(int room_type) {
		this.room_type = room_type;
	}

	public int getAvailable_rooms() {
		return available_rooms;
	}

	public void setAvailable_rooms(int available_rooms) {
		this.available_rooms = available_rooms;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "HotelWebsite [hotel=" + hotel + ", room_type=" + room_type + ", available_rooms=" + available_rooms
				+ ", price=" + price + "]";
	}
	
	
	
}
