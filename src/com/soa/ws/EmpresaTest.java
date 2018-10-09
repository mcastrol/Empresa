package com.soa.ws;

import junit.framework.TestCase;
import org.junit.Test;

public class EmpresaTest extends TestCase {


    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "MARCELA";
        Empresa instance = new Empresa();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(instance);
        System.out.println(instance.getNombre());
    }

    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "mcastrol@gmail.com";
        Empresa instance = new Empresa();
        instance.setEmail(email);
        System.out.println(instance);
        String email2=instance.getEmail();
        System.out.println(email2);
        assertEquals(email, email2);
    }
}