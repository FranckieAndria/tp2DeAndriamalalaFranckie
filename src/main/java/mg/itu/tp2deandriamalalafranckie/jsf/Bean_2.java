/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package mg.itu.tp2deandriamalalafranckie.jsf;

import jakarta.inject.Named;
import jakarta.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Backing Bean pour les pages JSF formulaire__4.xhtml et affichage__4.xhtml
 *
 * @author andriamalala
 */
@Named(value = "bean_2")
@RequestScoped
public class Bean_2 {

    private int nombre;

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNombresSuivants() {
        int nb = 5;
        List<Integer> l = new ArrayList<>(nb);
        for (int i = nombre; i < nombre + nb; i++) {
            l.add(i);
        }
        return l;
    }

    public String afficher() {
        return "affichage__4?nb=" + nombre + "&amp;faces-redirect=true";
    }

    /**
     * Creates a new instance of Bean
     */
    public Bean_2() {
    }

}
