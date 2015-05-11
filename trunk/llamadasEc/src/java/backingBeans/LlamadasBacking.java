/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backingBeans;

import backingBeans.util.SoftPhone;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Oswaldo Cruz
 */
@ManagedBean
@RequestScoped
public class LlamadasBacking {

    private String numero;

    /**
     * Creates a new instance of LlamadasBacking
     */
    public LlamadasBacking() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void marcar(String num) {
        numero += num;
    }

    public void limpiar() {
        numero = null;
    }

    public void llamar() {
        System.out.println("Inicio");
        SoftPhone sf = new SoftPhone();
        sf.realizarLlamada("");
        System.out.println("Conecto");
    }

    public void colgar() {

    }

   

}
