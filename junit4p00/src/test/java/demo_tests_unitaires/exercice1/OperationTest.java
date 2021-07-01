package demo_tests_unitaires.exercice1;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class OperationTest {
    @Test
    public void testDiv1() {
        Operation op = new Operation();
        double resultat = op.div(3, 2);
        assertEquals(resultat, 1.5, 1);
    }


    @Test
    public void testDiv2() {
        Operation op = new Operation();
        try {
            double resultat = op.div(3.0, 0.0);
            fail("Exception non gérée");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("Division par zéro"));
        }
    }
        @Test(expected=Exception.class)
        public void testDiv3() throws  Exception {
            Operation op = new Operation();
            double resultat = op.div(3.0, 0.0);
        }

    }




