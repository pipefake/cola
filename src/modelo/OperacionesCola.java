/**
 * Operaciones cola …
 *
 * @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
 * @author andrea.perez@uao.edu.co Andrea Lucia Perez Marquinez 2190527
 * @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
 * @date 03 Septiembre 2020si
 * @version 1.0
 */
package modelo;

import core.Base;
import core.Cola;
import dato.Usuario;

/**
 *
 * @author Universidad Felipe
 */
public class OperacionesCola {

    /**
     * duplicar
     *
     * @param <T>
     * @param ColaOriginal
     * @return ColaDuplicada
     */
    public static <T extends Base> Cola<T> duplicar(Cola<T> ColaOriginal) {
        Cola<T> AuxPila = new Cola<>();
        Cola<T> ColaDuplicada = new Cola<>();

        while (!ColaOriginal.estaVacia()) {
            AuxPila.encolar(ColaOriginal.desencolar());
        }
        while (!AuxPila.estaVacia()) {
            T e = AuxPila.desencolar();
            T c = (T) e.copy();
            ColaOriginal.encolar(e);
            ColaDuplicada.encolar(c);

        }

        return ColaDuplicada;
    }

    /**
     * concatenarCola
     *
     * @param <T>
     * @param c1
     * @param c2
     
     
     * @return ColaConcatenada
     */
    public static <T extends Base> Cola<T> concatenarCola(Cola<T> c1, Cola<T> c2) {

        Cola<T> ColaConcatenada = new Cola<>();

        return ColaConcatenada;
    }

    public static String generarHtml(Cola<Usuario> cola) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
