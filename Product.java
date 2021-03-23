package Entities;

public class Product {
	
	public String Name;
	public double Price;
	public String Description;
	public int Quantity;
	public String Category;
	
	public Product() {
		
	}
	
	public Product(String name, double price, int quantity, String description, String category) {
		this.Name = name;
		this.Price = price;
		this.Quantity = quantity;
		this.Description = description;
		this.Category = category;
		}
	
	
	public double totalValueInStock() {
		return Price * Quantity;
		}
		public void addProducts(int quantity) {
		this.Quantity += quantity;
		}
		public void removeProducts(int quantity) {
		this.Quantity -= quantity;
		}
		
	

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
	
	
		public String toString() {
		return Name
		+ ", $ "
		+ String.format("%.2f", Price)
		+ ", "
		//+ Description
		+ " description: "
		+ String.format(Description)
		+ ", "
		//+ Category
		+ " category: "
		+ String.format(Category)
		+ ", "
		+ Quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
		}
		
}


