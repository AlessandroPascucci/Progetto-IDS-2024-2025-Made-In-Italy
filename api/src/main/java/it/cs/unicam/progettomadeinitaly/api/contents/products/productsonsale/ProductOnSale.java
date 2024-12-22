package it.cs.unicam.progettomadeinitaly.api.contents.products.productsonsale;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

public abstract class ProductOnSale extends Product {

    protected Product product;

    private float price;

    private int quantity;

    public ProductOnSale(Product product, float price, int quantity, String author) {
        super(product.getAuthor());
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return this.product.getName();
    }

    @Override
    public String getDescription() {
        return this.product.getDescription();
    }

    @Override
    public String getAuthor() {
        return this.product.getAuthor();
    }

    @Override
    public boolean getStatus() {
        return this.product.getStatus();
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

}
