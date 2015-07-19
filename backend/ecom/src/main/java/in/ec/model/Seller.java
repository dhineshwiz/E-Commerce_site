package in.ec.model;

public class Seller {

	@org.springframework.data.annotation.Id
	private String Id;
	private String Name;
	private String Address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
