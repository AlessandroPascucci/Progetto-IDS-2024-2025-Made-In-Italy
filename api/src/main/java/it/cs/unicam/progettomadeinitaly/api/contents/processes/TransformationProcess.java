package it.cs.unicam.progettomadeinitaly.api.contents.processes;

import it.cs.unicam.progettomadeinitaly.api.contents.Contents;

import java.util.List;

public class TransformationProcess implements Contents {

    private String name;
    private String description;
    private boolean status;
    private String author;
    private List<TransformationPhase> phasesOfTransformation;

    public TransformationProcess(String name, String description, boolean status, String author, List<TransformationPhase> phasesOfTransformation) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.author = author;
        this.phasesOfTransformation = phasesOfTransformation;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean getStatus() {
        return status;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    public List<TransformationPhase> getPhasesOfTransformation() {
        return phasesOfTransformation;
    }


}