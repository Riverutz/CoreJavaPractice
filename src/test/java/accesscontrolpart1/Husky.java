package accesscontrolpart1;

public class Husky {

    public void testMethod(){
        Dog dog = new Dog();
        dog.defaultMethod();
        dog.publicMethod();
        dog.protectedMethod();
    }
}
