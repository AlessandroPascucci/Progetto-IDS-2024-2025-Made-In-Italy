package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage.ProductPackage;

public class ProductPackageOnSale extends ProductOnSale{

    public ProductPackageOnSale(String author, boolean status, ProductPackage productPackage, float price, int quantity) {
        super(productPackage,price,quantity, author, status);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + this.getAuthor() + ", " + this.getPrice() + ", " + this.getQuantity();
    }
}
