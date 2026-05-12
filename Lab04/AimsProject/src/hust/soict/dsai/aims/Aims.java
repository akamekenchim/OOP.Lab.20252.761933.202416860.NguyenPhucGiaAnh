package Lab04.AimsProject.src.hust.soict.dsai.aims;

import Lab04.AimsProject.src.hust.soict.dsai.aims.cart.Cart;
import Lab04.AimsProject.src.hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {

    //Create a new cart
    Cart anOrder = new Cart();

    //Create new dvd objects and add them to the cart
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("5cm/s",
            "Anime", "Makoto Shinkai", 19.95f);
    anOrder.addMedia(dvd1);

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("TenSura",
            "Science Fiction", "George Lucas",  24.95f);
    anOrder.addMedia(dvd2);

    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Asagao to Kase-san",
            "Yuri", "Murasaki",  18.99f);
    
    DigitalVideoDisc dvd4 = new DigitalVideoDisc("MarriageToxin",
            "Romance-Comedy", "Murasaki",  18.99f);
    anOrder.addMedia(dvd3, dvd4);
    //print total cost of the items in the cart
    System.out.println("Total Cost is: ");
    System.out.println(anOrder.totalCost());

    anOrder.removeMedia(dvd3);
    //test Search function
    anOrder.findMedia(1);
    anOrder.findMedia("TenSura");    
    anOrder.printAll();
//
}
}
