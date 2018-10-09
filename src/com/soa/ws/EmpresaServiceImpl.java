package com.soa.ws;

import java.util.ArrayList;
import java.util.List;

public class EmpresaServiceImpl implements EmpresaService {

    List<Empresa> empresas = new ArrayList<Empresa>();

    @Override
    public void registrarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public List<Empresa> listarEmpresas() {
        return(empresas);
    }

    @Override
    public Empresa encontrarEmpresaPorEmail(String email) {
        Empresa empReturn = new Empresa();
        for (Empresa empresa : empresas) {
            System.out.println(empresas);
            if(empresa.getEmail()==email) {
                empReturn=empresa;
                break;
            }
        }
        return(empReturn);
    }

}
