package statickeyword;

import org.testng.annotations.Test;

public class StaticTest {
    @Test
    public void testMethod(){
        System.out.println();
        Student ion = new Student("Popescu","Ion",15);
        ion.presentation();
        System.out.println();
        Student mihai = new Student("Balan", "Mihai", 17);
        mihai.presentation();
    }
}
