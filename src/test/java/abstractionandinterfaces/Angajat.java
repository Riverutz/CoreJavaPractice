package abstractionandinterfaces;

public class Angajat extends Person implements AngajatInterface{

    public Angajat(String lastName, String firstName, Integer age, Double height, Character sex) {
        super(lastName, firstName, age, height, sex);
    }

    @Override
    public void mergeLaServiciu() {

    }

    @Override
    public void desfasoaraActivitatea() {

    }

    @Override
    public void beaCafea() {

    }

    @Override
    public void incheieActivitatea() {

    }

    @Override
    public void mananca() {

    }

    @Override
    public void doarme() {

    }

    @Override
    public void iaPauza() {

    }

    @Override
    public void iaSalar() {

    }
}
