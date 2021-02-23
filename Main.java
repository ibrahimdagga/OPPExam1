package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cloth cloth = new Cloth(1,"Ajwa","Red",12.5,12, Cloth.size.medium);

//        cloth.printProperties();

        List<Cloth> cartList = new ArrayList<Cloth>();
        cartList.add(new Cloth(0,"Ajwa","Red",12.5,12, Cloth.size.medium));
        cartList.add(new Cloth(1,"Ajwa","Red",12.5,12, Cloth.size.medium));
        cartList.add(new Cloth(2,"Ajwa","Red",12.5,12, Cloth.size.medium));

        Cart cart = new Cart(cartList);
        cart.addToCart(new Cloth(3,"Ibrahem","Blue",15,20, Cloth.size.small));
//        cart.totalPriceValue();
        cart.removeFromCart(3);
        cart.printAllInCart();
        cart.Count();
    }


}
