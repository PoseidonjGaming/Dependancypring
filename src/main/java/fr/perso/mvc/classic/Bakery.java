package fr.perso.mvc.classic;

import java.util.List;

public class Bakery {
    private String name;
    private List<String> products;
    private final Address address;

    public Bakery(Address address) {
        this.address = address;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public Address getAddress() {
        return address;
    }
}
