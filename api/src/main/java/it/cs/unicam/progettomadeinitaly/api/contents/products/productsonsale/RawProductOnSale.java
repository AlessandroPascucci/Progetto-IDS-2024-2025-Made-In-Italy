package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.RawProduct;

public class RawProductOnSale extends ProductOnSale {

    public RawProductOnSale(RawProduct rawProduct, float price, int quantity, String author) {
        super(rawProduct, price, quantity, author);
    }

    public String getCertification() {
        return "";
    }

    public String getVariety() {
        return "";
    }

    public String getProductionMethod() {
        return "";
    }

}
