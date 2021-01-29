package org.dis.ExamenFinalAR;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    Customer customer;
    Customer customer2;


    @BeforeEach
    void setUp() {
        customer = new Customer(192, 192,"12","madrid","madrid","madrid",12.2,12,"28","24");
        customer2 = new Customer();
    }
//Dato no facilitado
    //@Test
    //void getIp() {
     //   assertNull(customer.getIp_from());
      //  assertNull(customer.getIp_to());

    //}
//
    //@Test
    //void getArriba() {
    //    assertTrue(255<customer.getIp_to());
   // }

    //@Test
    //void getAbajo() {
     //   assertTrue(000<customer.getIp_from());
    //}




}
