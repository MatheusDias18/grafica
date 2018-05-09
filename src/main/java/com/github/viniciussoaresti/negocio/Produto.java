/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author pronatec
 */
@Entity
public class Produto {
    @Id
    @GeneratedValue
    private String codigo;
    @Column(length = 20)
    private int quantidade;
    @Column(length = 20)
    private String tipo;
    @Column (length = 20)
    private double altura;
    @Column (length = 20)
    private double largura;
    @Column (length = 20)
    private double areaTotal;
    @Column (length = 20)
    private String tamanho;
    @Column (length = 20)
    private double valor;
    
    

    public Produto(String codigo, int quantidade, String tipo, double altura, double largura, double areaTotal, String tamanho, double valor) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
        this.areaTotal = areaTotal;
        this.tamanho = tamanho;
        this.valor = valor;
        
    }
    public Produto(){}

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public boolean equals (Object obj){
        if(obj == null){
            return false;
        }
        return codigo == ((Produto)obj).getCodigo();
    }
    
    
    
}
