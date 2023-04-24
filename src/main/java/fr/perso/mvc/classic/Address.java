package fr.perso.mvc.classic;

public class Address {
    private String street;
    private String city;
    private int cp;

    public Address(String street, String city, int cp) {
        this.street = street;
        this.city = city;
        this.cp = cp;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }
}
