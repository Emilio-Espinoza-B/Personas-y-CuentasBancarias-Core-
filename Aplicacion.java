import clases.Persona;
import clases.CuentaBancaria;

public class Aplicacion {
    public static void main(String[] args) {
        //clase Persona
        Persona persona1 = new Persona("hector", 23);
        Persona persona2 = new Persona("matias", 19);
        Persona persona3 = new Persona("naty", 25);

        //clase CuentaBancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(100, persona1);
        CuentaBancaria cuenta2 = new CuentaBancaria(300, persona2);
        CuentaBancaria cuenta3 = new CuentaBancaria(500, persona3);

        //operaciones de depósito y retiro
        cuenta1.depositar(1000);
        cuenta1.retirar(500);

        cuenta2.depositar(500);
        cuenta2.retirar(400);

        cuenta3.depositar(200);
        cuenta3.retirar(800);

        //saldo actual de cada cuenta 
        System.out.println("---------------------------------------");
        System.out.println("Saldo actual de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo actual de la cuenta 2: " + cuenta2.getSaldo());
        System.out.println("Saldo actual de la cuenta 3: " + cuenta3.getSaldo());

        //imprimeInformacionDeTodasLasCuentas
        System.out.println("------------------------------------");
        System.out.println("Informacion de todas las cuentas:");
        System.out.println("------------------------------------");
        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }
}
