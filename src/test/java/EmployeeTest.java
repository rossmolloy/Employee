import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testValidEmployee() {
        Employee employee = new Employee("Mr", "John Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testValidEmployeeWithTitleOfMrs() {
        Employee employee = new Employee("Mrs", "Jane Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testValidEmployeeWithTitleOfMs() {
        Employee employee = new Employee("Ms", "Jane Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testInvalidTitleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Invalid", "John Doe", "1234567A", 123456789, "Full-time", 20); });
        assertEquals("Invalid title, must be 'Mr', 'Mrs', or 'Ms'", exception.getMessage());
    }
}
