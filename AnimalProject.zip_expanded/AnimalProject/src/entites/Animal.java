package entites;

public class Animal
{
	int id;
	String name;
	String type;
	int price;
	int farmid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getFarmid() {
		return farmid;
	}
	public void setFarmid(int farmid) {
		this.farmid = farmid;
	}

	public Animal()
	{
		
	}
}
