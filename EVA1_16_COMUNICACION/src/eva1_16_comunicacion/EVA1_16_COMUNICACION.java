/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_comunicacion;

/**
 *
 * @author HP1000
 */
public class EVA1_16_COMUNICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(0);
        objB.setValorB(objA.getValorA());
        
        System.out.println("Valor A " + objA.getValorA());
         System.out.println("Valor B " + objB.getValorB());
    }
    
}
class ClaseA{
    private int valorA;
    //Interfaz/Mensajes
    public int getValorA(){
        return valorA;
    }
    public void setValorA(int ValorA){
       this.valorA = valorA;
    }
}
class ClaseB{
    private int valorB;
    //Interfaz/Mensajes
    public int getValorB(){
        return valorB;
    }
    public void setValorB(int ValorB){
        this.valorB = valorB;
    } 
}
