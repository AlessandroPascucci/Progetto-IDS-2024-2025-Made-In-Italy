package it.cs.unicam.progettomadeinitaly.api.contents.products.productpackage;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;
import it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts.SingleProduct;

import java.util.List;

// TODO List<Product> e vietare la possibilità di aggiungere prodotti in vendita
public class ProductPackage extends Product {

    private String name;

    private String description;

    private List<SingleProduct> products;

    public ProductPackage(String name, String description, List<SingleProduct> products, String author, boolean status) {
        super(author);
        this.name = name;
        this.description = description;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Product> getProducts() {
        return products;
    }

}
