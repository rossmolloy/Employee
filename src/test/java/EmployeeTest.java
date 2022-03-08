import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @Test
    public void testValidEmployee() {
        new Employee("Mr", "John Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testValidEmployeeWithTitleOfMrs() {
        new Employee("Mrs", "Jane Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testValidEmployeeWithTitleOfMs() {
        new Employee("Ms", "Jane Doe", "1234567A", 123456789, "Full-time", 20);
    }

    @Test
    public void testValidEmployeeWithPartTimeEmploymentType() {
        new Employee("Mr", "John Doe", "1234567A", 123456789, "Part-time", 20);
    }

    @Test
    public void testValidEmployeeWithContractEmploymentType() {
        new Employee("Mr", "John Doe", "1234567A", 123456789, "Contract", 20);
    }

    @Test
    public void testInvalidTitleThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Invalid", "John Doe", "1234567A", 123456789, "Full-time", 20); });
        assertEquals("Invalid title, must be 'Mr', 'Mrs', or 'Ms'", exception.getMessage());
    }

    @Test
    public void testEmployeeWithShortNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Mr", "Jo", "1234567A", 123456789, "Full-time", 20); });
        assertEquals("Name provided is not valid, must be between 3-25 characters in length", exception.getMessage());
    }

    @Test
    public void testEmployeeWithLongNameThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Mr", "John Doooooooooooooooooooe", "1234567A", 123456789, "Full-time", 20); });
        assertEquals("Name provided is not valid, must be between 3-25 characters in length", exception.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidPpsIdThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Mr", "John Doe", "123", 123456789, "Full-time", 20); });
        assertEquals("Invalid PPS ID, must be 8 characters in length", exception.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidPhoneThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Mr", "John Doe", "1234567A", 12345678, "Full-time", 20); });
        assertEquals("Invalid phone, must be a nine digit number", exception.getMessage());
    }

    @Test
    public void testEmployeeWithInvalidEmploymentTypeThrowsException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> { new Employee("Mr", "John Doe", "1234567A", 123456789, "None", 20); });
        assertEquals("Invalid employment type, must be 'full-time', 'part-time', or 'contract'", exception.getMessage());
    }
}
