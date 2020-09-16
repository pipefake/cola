/**
 * El tipo de cola que haremos es de Usuario, tiene atributos edad y tiempo de transaccion …
 *
 * @author Jonathan.rojas@uao.edu.co Jonathan Rojas Ibanez 2190039
 * @author andrea.perez@uao.edu.co Andrea Lucia Perez Marquinez 2190527
 * @author juan_felipe.jimenez@uao.edu.co Juan Felipe Jimenez Salazar 2190038
 * @date 03 Septiembre 2020si
 * @version 1.0
 */
package dato;

import core.Base;

/**
 *
 * @author Universidad Felipe
 */
public class Usuario extends Base {

    private int edad;
    private int tiempoespera;

    /**
     * Usuario
     *
     * @param edad, tiempoespera
     * @return
     */
    public Usuario(int edad, int tiempoespera) {
        this.edad = edad;
        this.tiempoespera = tiempoespera;
    }

    /**
     * getTiempoesperahola
     *
     * @param
     * @return tiempoespera
     */
    public int getTiempoespera() {
        return tiempoespera;
    }

    /**
     * setTiempoespera
     *
     * @param tiempoespera
     * @return
     */
    public void setTiempoespera(int tiempoespera) {
        this.tiempoespera = tiempoespera;
    }

    /**
     * getEdad
     *
     * @param
     * @return edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * setEdad
     *
     * @param edad
     * @return
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * copy
     *
     * @param
     * @return Usuario
     */
    @Override
    public Base copy() {
        return new Usuario(edad, tiempoespera);
    }

    /**
     * Usuario
     *
     * @param
     * @return
     */
    public Usuario() {
    }

    /**
     * toString
     *
     * @param
     * @return "Usuario{" + "edad=" + edad + ", tiempoespera=" + tiempoespera +
     * '}'
     */
    @Override
    public String toString() {
        return "Usuario{" + "edad=" + edad + ", tiempoespera=" + tiempoespera + '}';
    }

}
