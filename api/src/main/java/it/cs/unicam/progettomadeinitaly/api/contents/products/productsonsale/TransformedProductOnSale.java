package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.TransformedProduct;

public class TransformedProductOnSale extends ProductOnSale {

    public TransformedProductOnSale(TransformedProduct transformedProduct, float price, int quantity, String author, boolean status) {
        super(transformedProduct, price, quantity, author, status);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.getAuthor() + ", " + this.getPrice() + ", " + this.getQuantity();
    }
}
