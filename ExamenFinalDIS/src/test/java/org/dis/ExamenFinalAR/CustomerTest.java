package org.dis.ExamenFinalAR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    Customer customer;
    Customer customer2;


    @BeforeEach
    void setUp() {
        customer = new Customer("Diego", "Abad","Boadilla");
        customer2 = new Customer();
    }

    @Test
    void getId() {
        assertNull(customer.getId());

    }

    @Test
    void setId() {
        customer.setId(null);
        assertEquals(null,customer.getId());
    }

    @Test
    void getFirstName() {
        assertEquals("Diego", customer.getFirstName());
    }

    @Test
    void getLastName() {
        assertEquals("Abad", customer.getLastName());
    }

    @Test
    void getPlace() {
        assertEquals("Boadilla", customer.getPlace());
    }

    @Test
    void setFirstName() {
        customer.setFirstName("Diego");
        assertEquals("Diego", customer.getFirstName());
    }

    @Test
    void setLastName() {
        customer.setLastName("Abad");
        assertEquals("Abad", customer.getLastName());
    }

    @Test
    void setPlace() {
        customer.setPlace("Boadilla");
        assertEquals("Boadilla", customer.getPlace());
    }

    @Test
    void testToString() {
        assertEquals("Customer[id=null, firstName='Diego', lastName='Abad',place='Boadilla']",customer.toString());
    }

    @Test
    void testEquals() {
        assertTrue(customer.equals(customer));
    }
}
