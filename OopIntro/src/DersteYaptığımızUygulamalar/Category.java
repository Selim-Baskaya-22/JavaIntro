package DersteYaptýðýmýzUygulamalar;

public class Category {
	
	private int id;
	private String name;

	public Category(){

	}

	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		if (this.id<2) {
			return name+"!";
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}