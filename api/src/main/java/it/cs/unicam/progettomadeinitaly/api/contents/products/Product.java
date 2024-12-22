package it.cs.unicam.progettomadeinitaly.api.contents.products;

import it.cs.unicam.progettomadeinitaly.api.contents.Contents;

// TODO possibile introduzione dei setter per snellire i parametri del costruttore

/**
 * Represents a product in the supply chain
 */
public abstract class Product implements Contents {

    private boolean status;
    // TODO review autore final???
    private final String author;

    public Product(String author) {
        if(author == null)
            throw new NullPointerException("author can not be null");
        this.author = author;
        this.status = false;
    }

    public String getAuthor() {
        return author;
    }

    // TODO review
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

}
