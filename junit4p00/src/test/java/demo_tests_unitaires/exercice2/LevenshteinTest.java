package demo_tests_unitaires.exercice2;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import org.junit.Before;



public class LevenshteinTest {

    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void levenshteinDistanceChien() throws Exception {
        int result = Levenshtein.levenshteinDistance("chien", "chine");

        assertEquals(2, result);

    }

    @Test
    public void levenshteinDistanceChat() throws Exception {
        int result = Levenshtein.levenshteinDistance("chat", "chats");

        assertEquals(1, result);
    }

    @Test
    public void levenshteinDistanceJava() throws Exception {
        int result = Levenshtein.levenshteinDistance("jva", "java");

        assertEquals(1, result);
    }

    @Test
    public void levenshteinDistanceDistance() throws Exception {
        int result = Levenshtein.levenshteinDistance("distance", "instance");

        assertEquals(2, result);

    }

    @Test
    public void levenshteinDistanceNull() {
        try {
            int result = Levenshtein.levenshteinDistance(null, null);
            fail("Exception non gérée");
        } catch (Exception e) {
            assertThat(e.getMessage(), is("la variable ne peut etre null"));

        }
    }

    @Test(expected = Exception.class)
    public void levenshteinDistanceNull2() throws Exception {
        int result = Levenshtein.levenshteinDistance("jva", null);
    }
}



