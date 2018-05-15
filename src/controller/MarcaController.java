/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Marca;

/**
 *
 * @author jpescola
 */
public class MarcaController extends Controller<Marca>{

    @Override
    public boolean salvar(Marca t) {
        return super.salvar(t); 
    }

    @Override
    public boolean excluir(Marca t) {
        return super.excluir(t); 
    }
    
    public List<Marca> buscar(String campo, String valor) {
        return super.listar(Marca.class, campo, valor); 
    }

    public Marca get(int id) {
        return super.get(Marca.class, id); 
    }
    
    public List<Marca> listar() {
        return super.listar(Marca.class, "nome", ""); 
    }
}
