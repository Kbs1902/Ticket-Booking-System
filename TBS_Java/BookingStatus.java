package vinay;

public class BookingStatus {
	private int bookingStatusId;
	private String bookingStatusCode;
	private String description;
	private String displayName;
	
	
	public BookingStatus() {
		super();
	}

	public BookingStatus(int bookingStatusId, String bookingStatusCode, String description, String displayName) {
		super();
		this.bookingStatusId = bookingStatusId;
		this.bookingStatusCode = bookingStatusCode;
		this.description = description;
		this.displayName = displayName;
	}
	
	public int getBookingStatusId() {
		return bookingStatusId;
	}
	public void setBookingStatusId(int bookingStatusId) {
		this.bookingStatusId = bookingStatusId;
	}
	public String getBookingStatusCode() {
		return bookingStatusCode;
	}
	public void setBookingStatusCode(String bookingStatusCode) {
		this.bookingStatusCode = bookingStatusCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	

}