/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.viniciussoaresti.conversores;

import java.lang.annotation.Annotation;
import javax.persistence.Converter;

/**
 *
 * @author pronatec
 */
@FacesConverter("produtoConverter")
public class ProdutoConverter implements Converter {
    public Object getAsObject(FacesContext fc, UIComponent uic, String value){
        if(value != null && value.trim().length()>0){
            try{
                 ProdutoController service = (ProdutoController) fc.getExternalContext().getSessionMap().get("produtoController");
                return service.recuperarProduto(Integer.parseInt(value));
            }catch (NumberFormatException e){
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
                        
            }
            
        }else{
            return null;
        }
    }
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if (object != null) {
            return String.valueOf(((Produto) object).getCodigo());
        } else {
            return null;
        }
    }

    
}
