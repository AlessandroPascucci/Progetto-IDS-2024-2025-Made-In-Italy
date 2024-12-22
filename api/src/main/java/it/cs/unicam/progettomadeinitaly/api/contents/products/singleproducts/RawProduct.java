package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

public class RawProduct extends SingleProduct {

    private String productionMethod;

    // TODO productionMethod NullPointerException
    public RawProduct(String name , String description ,String certification, String variety, String productionMethod, String author) {
        super(author, name, description , certification , variety);
        this.productionMethod = productionMethod;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public String getProductionMethod() {
        return this.productionMethod;
    }

}
