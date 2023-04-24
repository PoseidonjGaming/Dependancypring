package fr.perso.mvc.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Bakery {

    @Value("${bakery.name}")
    private String name;
    private List<String> products;
    private final Address address;

    @Autowired
    public Bakery(Address address) {
        this.address = address;
        System.out.println(address.getCity());
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

    public void fetch() {
        System.out.println("Mail delivered at " + address.getCity());
    }
}
