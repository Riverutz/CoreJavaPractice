package abstractionandinterfaces;

public class AngajatStudent extends Person implements AngajatInterface, StudentInterface {
    public AngajatStudent(String lastName, String firstName, Integer age, Double height, Character sex) {
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
    public void mergeLaFacultate() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void daExamene() {

    }

    @Override
    public void primesteNote() {

    }

    @Override
    public void mergeLaRestante() {

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
