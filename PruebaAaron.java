import com.bramepar.practiva_depurando_1.CuentaBancaria;

public class PruebaAaron {

    public static void main(String[] args) {
        CuentaBancaria prueba1 = new CuentaBancaria(1, "prueba");
        /* prueba para deposito siendo negativo */
        prueba1.deposito(-2);
        /* da error y es de tipo caja blanca*/

        /* prueba para deposito siendo positivo */
        prueba1.deposito(4);
        /* funciona y es de tipo blanca */

        /* prueba para deposito siendo 0 */

        prueba1.deposito(0);
        /* da error y es de tipo blanca */

    }
}
