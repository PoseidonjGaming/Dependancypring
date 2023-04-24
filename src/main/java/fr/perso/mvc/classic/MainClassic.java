package fr.perso.mvc.classic;

public class MainClassic {

    public static void main(String[] args) {
        Address address=new Address("Monopoly", "Paris", 95000);
        Bakery bakery=new Bakery(address);
    }
}
