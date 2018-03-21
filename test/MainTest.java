import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 3/20/18.
 */
class MainTest {

        private Main main = new Main();

        @Test
        void test_4_works()
        {
            int result = this.main.test(4);
            Assertions.assertEquals(4, result);
        }

        @Test
        void test_12_works()
        {
            int result = this.main.test(12);

            Assertions.assertEquals(7, result);
        }

        @Test
        void test_prime_number()
        {
            int result = this.main.test(13);
            Assertions.assertEquals(14, result);
        }

        @Test
        void test_12345_works()
        {
            int result = this.main.test(12345);
            Assertions.assertEquals(838, result);
        }
}