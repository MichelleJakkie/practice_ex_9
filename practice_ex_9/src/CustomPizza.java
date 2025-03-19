
public class CustomPizza {
private String toppings;
private double price;
    
    public CustomPizza(String toppings, double price) {
     this.toppings = toppings;
 this.price = price;
}
    
    public String getToppings() {
     return this.toppings;
    }
    
    public void setToppings(String toppings) {
     this.toppings = toppings;
    }
    
    public double getPrice() {
     return this.price;
    }
    
    public void setPrice(double price) {
     this.price = price;
    }
    
    public String toString() {
 return "Custom Pizza with " + this.toppings + ": €" + this.price;
}
    }
    public class CustomPizza {
private String toppings;
private double price;
    
public CustomPizza(String toppings, double price) {
 this.toppings = toppings;
 this.price = price;
}
    
public String getToppings() {
 return this.toppings;
}
    
public void setToppings(String toppings) {
 this.toppings = toppings;
    }
    
    public double getPrice() {
 return this.price;
}
    
    public void setPrice(double price) {
 this.price = price;
}
    
    public String toString() {
     return "Custom Pizza with " + this.toppings + ": €" + this.price;
}
    }
    
