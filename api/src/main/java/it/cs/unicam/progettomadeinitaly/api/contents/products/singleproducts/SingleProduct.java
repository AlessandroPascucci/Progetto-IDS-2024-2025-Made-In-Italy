package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.products.Product;

/**
 * Represents a unitary product
 */
public  abstract class SingleProduct extends Product {

    private String name;

    private String description;

    private String certification;

    private String variety;

    public SingleProduct(String author, String name, String description, String certification, String variety) {
        super(author);
        if (name == null)
            throw new NullPointerException("A single product must have a name");
        if (description == null)
            throw new NullPointerException("A single product must have a description");
        if (certification == null)
            throw new NullPointerException("A single product must have a certification");
        if (variety == null)
            throw new NullPointerException("A single product must have a variety");
        this.name = name;
        this.description = description;
        this.certification = certification;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCertification() {
        return certification;
    }

    public String getVariety() {
        return variety;
    }

}
