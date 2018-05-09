package com.github.viniciussoaresti.infraestrutura.repositorios.imlementacoes;


import com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.negocio.Produto;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


import com.github.viniciussoaresti.negocio.Produto;

/**
 *
 * @author pronatec
 */
public class RepositorioProduto implements RepositorioGenerico<Produto, Integer> {
    
    private List<Produto> produtos=null;
    
    public RepositorioProduto(){
        this.produtos = new ArrayList<Produto>();
    }

    public void inserir(Produto t) {
        this.produtos.add(t);

        }

    public void alterar(Produto t) {
        for (Produto e: this.produtos){
            if(e.getCodigo ()==t.getCodigo()){
                e.setAltura(t.getAltura());
                e.setLargura(t.getLargura());
                e.setAreaTotal(t.getAreaTotal());
                e.setQuantidade(t.getQuantidade());
                e.setTipo(t.getTipo());
                e.setTamanho(t.getTamanho());
                e.setValor(e.getValor());
                return;
                
                
            }
                    
        }

    }

   public Produto recuperar (Integer codigo){
        for(Produto e : this.produtos){
            if(e.getTipo().equals(codigo)){
                return e;
            }
        }
        return null;
    }

    public void deletar(Produto t) {
        this.produtos.remove(t);
    }
    

    public List<Produto> recuperarTodos() {
        return this.produtos;
    }
    
    
    
    
    
    
    
    
    
}
