/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author usuario
 */
public class Cuenta {
    private int saldo;
    private String nCuenta;
    
    public Cuenta(int saldo, String cuenta){
        this.saldo=saldo;
        this.nCuenta=cuenta;
    }
    
    public void retirar(int dinero) throws ExcepcionDinero{
        if(saldo>dinero || dinero<=0){
            this.saldo=this.saldo-dinero;
        }
        else{
            throw new ExcepcionDinero("No hay suficiente dinero en la cuenta.");
        }
    }
    
    public void ingresar(int dinero)throws ExcepcionDinero{
        if(dinero>0){
            this.saldo=this.saldo+dinero;
        }
        else{
            throw new ExcepcionDinero("La cantidad a ingresar es incorrecta.");
        }
    }
    
    public int getSaldo(){
        return this.saldo;
    }
    
    public String getCuenta(){
        return nCuenta;
    }
    
    public class ExcepcionDinero extends Exception{
        public ExcepcionDinero(String msg){
            super(msg);
        }
    }
}
