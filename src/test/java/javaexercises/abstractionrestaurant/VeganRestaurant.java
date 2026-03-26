package javaexercises.abstractionrestaurant;

public class VeganRestaurant extends Restaurant implements VeganInterface {
    public VeganRestaurant(String restaurantName, String address, String menu, Boolean delivery, String restaurantType) {
        super(restaurantName, address, menu, delivery, restaurantType);
    }

    @Override
    public void cooksVeganFood() {
    }

    @Override
    public void menuPresentation() {
    }
}
