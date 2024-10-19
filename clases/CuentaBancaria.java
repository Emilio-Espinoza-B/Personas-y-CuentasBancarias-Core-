package clases;
import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    //atriburos
    private double saldo;
    private Persona titular;
    private int numerocuenta;
    private static ArrayList<CuentaBancaria> listaCuentaBancarias = new ArrayList<>();

    //constructor
    public CuentaBancaria(double saldo, Persona titular){
        this.saldo = saldo;
        this.titular = titular;
        this.numerocuenta = generarnumerodecuenta();
        listaCuentaBancarias.add(this);
    }
    private int generarnumerodecuenta() {
        Random random = new Random();
        return 100000 + random.nextInt(900000); 
    }
    //getters
    public double getSaldo() {
        return saldo;
    }
    public Persona getTitular() {
        return titular;
    }
    public int getNumerocuenta() {
        return numerocuenta;
    }
    
    //setters
    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }
    public void settitular(Persona titular) {
        this.titular = titular;
    }
    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    //metodos
    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto){
        if (saldo >= monto) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes para retirar " + monto );
        }
    }

    public void despliegaInformacion(){
        System.out.println("Cuenta Numero: " + numerocuenta + ", Saldo: " + saldo);
        System.out.print("Titular: ");
        titular.despliegaInformacion();
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        for (CuentaBancaria cuenta : listaCuentaBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("------------------------------------");
        }    
    }
}
