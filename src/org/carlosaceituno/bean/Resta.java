package org.carlosaceituno.bean;

/**
 *
 * @author Carlos Josué Levy Aceituno Pocasangre
 * @date 8/04/2021
 * @time 13:26:45
 *
 */
public class Resta extends Operaciones {
    public Resta(){
    }
    @Override
    public float operar(float numero1, float numero2) {
        this.setNumero1(numero1);
        this.setNumero2(numero2);
        this.setOperador("-");
        this.setResultado(this.getNumero1() - this.getNumero2());
        return this.getResultado();
    }

}
