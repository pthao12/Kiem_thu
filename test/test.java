package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.InvalidInputException;
import src.Lab;

public class test {

    @Test
    public void t1() {
        var lab = new Lab();
        assertEquals(900000, lab.calculateRentalFee(2, 8));
    }
    @Test
    public void t2() {
        var lab = new Lab();
        assertThrows(InvalidInputException.class, () -> lab.calculateRentalFee(-1, 8));
    }

    @Test
    public void t3() {
        var lab = new Lab();
        assertEquals(2050000, lab.calculateRentalFee(5, 8));
    }

    @Test
    public void t4() {
        var lab = new Lab();
        assertEquals(2000000, lab.calculateRentalFee(2, 20));
    }

    @Test
    public void t5() {
        var lab = new Lab();
        assertThrows(InvalidInputException.class, () -> lab.calculateRentalFee(-1, 20));
    }

    @Test
    public void t6() {
        var lab = new Lab();
        assertEquals(3500000, lab.calculateRentalFee(5, 20));
    }

    @Test
    public void t7() {
        var lab = new Lab();
        assertThrows(InvalidInputException.class, () -> lab.calculateRentalFee(2, -1));
    }
}
