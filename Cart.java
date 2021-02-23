package com.company;

import java.util.Arrays;
import java.util.List;

public class Cart {

    List<Cloth> cartList;

    public Cart() {
    }

    public Cart(List<Cloth> cartList) {
        this.cartList = cartList;
    }

    private double totalPrice=0;

    public void totalPriceValue(){
        for (int x=0;x<cartList.size();x++){
            double price = cartList.get(x).getPrice();
            totalPrice = totalPrice+ price;
        }
        System.out.println(totalPrice);
    }

    public void printAllInCart(){
        for (int x=0;x<cartList.size();x++){
            System.out.println("Cloth: "+x+" {" +
                    "\nid=" + cartList.get(x).getId() +
                    ", model='" + cartList.get(x).getModel() + '\'' +
                    ", color='" + cartList.get(x).getColor() + '\'' +
                    ", price=" + cartList.get(x).getPrice() +
                    ", quantity=" + cartList.get(x).getQuantity() +
                    ", size='" + cartList.get(x).getSizeV() + '\'' +
                    '}');
        }
    }

    public void addToCart(Cloth cloth){
        cartList.add(cloth);
    }
    public boolean removeFromCart(int id){
        Cloth cloth = null;
        for (int z=0;z<cartList.size();z++){
            cloth = cartList.get(z);
            if (id == cloth.getId() )
            {
                cartList.remove(id);
                System.out.println("تم حذف المنتج بنجاح");
                return true;
            }
        }
        for (int z=0;z<cartList.size();z++){
            cloth = cartList.get(z);
            if (id != cloth.getId() )
            {
                System.out.println("المنتج غير موجود");
                return false;
            }
        }
      return true;
    }

    public void Count(){
        System.out.println("count: "+cartList.size());
    }
}
