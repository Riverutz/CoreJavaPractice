package javaexercises.abstractionrestaurant;

public class NonVeganRestaurant extends Restaurant implements NonVeganInterface {
    public NonVeganRestaurant(String restaurantName, String address, String menu, Boolean delivery, String restaurantType) {
        super(restaurantName, address, menu, delivery, restaurantType);
    }

    @Override
    public void cooksNonVeganFood() {
    }

    @Override
    public void menuPresentation() {
    }
}
