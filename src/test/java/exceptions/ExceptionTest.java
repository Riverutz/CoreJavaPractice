package exceptions;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptionTest {

    @Test
    public void exceptionTest() throws FileNotFoundException {
        ExceptionsConcept exceptionsConcept = new ExceptionsConcept();
        //exceptionsConcept.checkedException();
        //exceptionsConcept.uncheckedException();
//        exceptionsConcept.throwExceptionExample(20);
//        exceptionsConcept.throwExceptionExample(15);
        exceptionsConcept.throwsExceptionExample();

    }
}
