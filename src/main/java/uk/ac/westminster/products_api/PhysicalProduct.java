package uk.ac.westminster.products_api;

//A PhysicalProduct IS-A Product because it inherits all the core properties of the general Product class
// A Product HAS-A Order

public class PhysicalProduct extends Product{
    private double weightInKg;
    private String dimensions;

    private PhysicalProduct(){
    }

    public PhysicalProduct(Long id, String name, double price, double weightInKg, String dimensions){
        super(id,name,price);
        this.weightInKg=weightInKg;
        this.dimensions=dimensions;
    }

    public double getWeightInKg(){
        return weightInKg;
    }

    public String getDimensions(){
        return dimensions;
    }

}
