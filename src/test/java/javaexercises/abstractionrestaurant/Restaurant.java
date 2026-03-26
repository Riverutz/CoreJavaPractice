package javaexercises.abstractionrestaurant;

public class Restaurant {
    private String restaurantName;
    private String address;
    private String menu;
    private Boolean delivery;
    private String restaurantType;

    public Restaurant(String restaurantName, String address, String menu, Boolean delivery, String restaurantType) {
        this.restaurantName = restaurantName;
        this.address = address;
        this.menu = menu;
        this.delivery = delivery;
        this.restaurantType = restaurantType;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeniu() {
        return menu;
    }

    public void setMeniu(String meniu) {
        this.menu = meniu;
    }

    public Boolean getDelivery() {
        return delivery;
    }

    public void setDelivery(Boolean delivery) {
        this.delivery = delivery;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }
}
