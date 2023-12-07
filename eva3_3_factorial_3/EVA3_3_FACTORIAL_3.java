/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_factorial_3;

/**
 *
 * @author invitado
 */
public class EVA3_3_FACTORIAL_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("el factorial de 5= "+calcularFactorial(5));
        System.out.println("3 elevado a la 2 "+calcularpotencia(2,5));
    }
    
    public static int calcularFactorial(int num){
    //factorial de 5: 1 x 2 x 3 x 4 x 5= 20
        //usar ciclos
        //regresar el valor calaculado
    int resu = 1;
        for (int i = 1; i <= num; i++) {
          resu*= i;   
        }
        return resu;
}
    
    public static int calcularpotencia(int base, int exp){
        int resu =1;
        for (int i = 0; i <= exp; i++) {
            resu *= base;
        }
        
        return resu;
        
    }
