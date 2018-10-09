package com.soa.ws;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class EmpresaServiceImplTest extends TestCase {

    @Test
    public void test() {
        System.out.println("registrarEmpresa");
        Empresa empresa1 = new Empresa("empresa 1", "empresa1@email.com", "urlempresa1","tipo","1111");
        EmpresaServiceImpl instance = new EmpresaServiceImpl();
        instance.registrarEmpresa(empresa1);
        // TODO review the generated test code and remove the default call to fail.
        Empresa empresa2 = new Empresa("empresa 2", "empresa2@email.com", "urlempresa2","tipo","2222");
        List<Empresa> result = instance.listarEmpresas();
        for (Empresa emp : result) {
            System.out.println(emp);
        }
        String email = "empresa1@email.com";
        Empresa eemail = instance.encontrarEmpresaPorEmail(email);
        assertEquals(eemail, empresa1);
    }

}