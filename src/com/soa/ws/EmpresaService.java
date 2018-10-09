package com.soa.ws;

import java.util.List;

public interface EmpresaService {

    public void registrarEmpresa(Empresa empresa);

    public List<Empresa> listarEmpresas();

    public Empresa encontrarEmpresaPorEmail(String email);
}
