/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author gabir
 */
public class Cuenta {
    private int saldo;
    private String nCuenta;
    
    public Cuenta(int dineroIni, String cuenta){
        this.saldo=dineroIni;
        this.nCuenta=cuenta;
    }
    
    public void retirar(int dinero){
        
    }
    
    public void ingresar(int dinero){
        
    }
    
    public int getSaldo(){
        return 0;
    }
    
    public String getCuenta(){
        return "0";
    }
}
