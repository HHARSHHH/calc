import org.junit.Assert;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    public void testSum() {
        // Given
        Add calculator = new Add(2,2);
        // When
        int result = calculator.summ();
        // Then
        if (result != 2+2) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

}