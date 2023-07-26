package furniture;

public class Furniture {

    private FurnitureType furnitureType;
    private double price;
    private double discountedPrice;

    public Furniture(FurnitureType type, double price) {
        setFurnitureType(type);
        setPrice(price);
    }


    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }
}
