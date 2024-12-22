package it.cs.unicam.progettomadeinitaly.api.users.roles;

public interface Seller<T extends SupplyChainOperator> {

    boolean sellProduct();

}
