package furniture;

public class FurnitureServiceImpl implements IFurniture{

    @Override
    public double calculateDiscountedPrice(Furniture furniture) {
       double discountPercent=0;
       if(furniture.getFurnitureType().equals(FurnitureType.Home)){
        discountPercent=5;
       }
       if(furniture.getFurnitureType().equals(FurnitureType.Office)){
          discountPercent=10;
       }

        double discountedPrice=furniture.getPrice()-(discountPercent*furniture.getPrice()/100);
        return discountedPrice;


    }

    public Sofa createSofa(FurnitureType furnitureType, double price){
        Sofa sofa=new Sofa(furnitureType, price);
        double discountedPrice= calculateDiscountedPrice(sofa);
        sofa.setDiscountedPrice(discountedPrice);
        return sofa;
    }

}
