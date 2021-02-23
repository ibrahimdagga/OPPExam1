package com.company;

public class Cloth {

    private int id;
    private String model;
    private String color;
    private double price;
    private int quantity ;
    private String sizeV;

    public enum size{
        small("small"),
        medium("medium"),
        large("large"),
        xl("xl"),
        xxl("xxl"),
        xxxl("xxxl");

        public String sizeValue;

        size(String sizeValue) {
            this.sizeValue = sizeValue;
        }

        public String getSizeValue() {
            return sizeValue;
        }
    }
    private double totalPrice(){
        double total = quantity * price;

        if (quantity>10) {
            total = total - (quantity * 0.02);
            return total;
        }
        else
            return total;
    }



    public void printProperties() {
        System.out.println("Cloth{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", size='" + sizeV + '\'' +
                '}');
    }

    public Cloth() {
    }

    public Cloth(int id, String model, String color, double price, int quantity,size size) {
        this.id = id;
        this.model = model;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.sizeV = size.getSizeValue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSizeV() {
        return sizeV;
    }

    public void setSizeV(String sizeV) {
        this.sizeV = sizeV;
    }
}
