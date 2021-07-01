package demo_tests_unitaires;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

    public class OperationTest {
        @Test
        public void testDiv1() {
            Operation op = new Operation();
            double resultat = op.div(3, 2);
        }
    }

