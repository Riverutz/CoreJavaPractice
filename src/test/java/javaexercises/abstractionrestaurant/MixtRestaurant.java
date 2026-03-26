package javaexercises.abstractionrestaurant;

public class MixtRestaurant extends Restaurant implements VeganInterface, NonVeganInterface {
    public MixtRestaurant(String restaurantName, String address, String menu, Boolean delivery, String restaurantType) {
        super(restaurantName, address, menu, delivery, restaurantType);
    }

    @Override
    public void cooksNonVeganFood() {
    }

    @Override
    public void cooksVeganFood() {
    }

    @Override
    public void menuPresentation() {
    }
}
