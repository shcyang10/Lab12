package co.grandcircus;

public class Car {

		private String make;
		private String model;
		private int year;
		private double price;
		
		public Car() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Car(String make, String model, int year, double price) {
			super();
			this.make = make;
			this.model = model;
			this.year = year;
			this.price = price;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public String toString() {
			String format = "Make: %-15s Model: %-15s Year: %-10s Price: $%-15s";
			return String.format(format, make, model, year, price);
		}
		
		
		
		
}
