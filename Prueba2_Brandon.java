import com.bramepar.practiva_depurando_1.CuentaBancaria;

public class Prueba2_Brandon {




/* Prueba para retirar 0.
 * Ocurre  error de transacción.
 * Prueba de Caja Blanca de subtipo condición
 * 
 */




public static void main(String[] args) {
    

 CuentaBancaria prueba2 = new CuentaBancaria(0, "Cuenta2");
        
    prueba2.retirar(0);







}




    
}
