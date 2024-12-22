package it.cs.unicam.progettomadeinitaly.api.contents.products.singleproducts;

import it.cs.unicam.progettomadeinitaly.api.contents.processes.TransformationProcess;

public class TransformedProduct extends SingleProduct {

    private TransformationProcess transformationProcess;

    public TransformedProduct(String name, String description, String certification, String variety, String author) {
        super(author, name, description, certification, variety);
    }

    public TransformationProcess getTransformationProcess() {
        return transformationProcess;
    }

    public void setTransformationProcess(TransformationProcess transformationProcess) {
        if (transformationProcess == null)
            throw new NullPointerException("Transformed product cannot have a null transformation process");
        this.transformationProcess = transformationProcess;
    }

}
