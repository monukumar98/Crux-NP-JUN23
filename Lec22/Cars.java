package Lec22;

public class Cars {
	private String color = "Red";
	private int price = 189;
	private int speed = 14;

	public Cars(String color, int price, int speed) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.price = price;
		this.speed = speed;

	}

//	public void setPrice(int p) {
//		this.price = p;
//	}

//	public int getPrice() {
//		return this.price;
//	}

	public void Display() {
		System.out.println("c " + this.color + " P " + this.price + " s " + this.speed);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

//	public void setPrice(int price) throws Exception{
//		if (price < 0) {
//    	throw new Exception("Bklol price -ve nhi hota hai");
//		}
//		this.price = price;
//	}

	public void setPrice(int price) {
		try {
			if (price < 0) {
				throw new Exception("Bklol price -ve nhi hota hai");

			}

			this.price = price;
		}

		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally blocks");
		}

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
