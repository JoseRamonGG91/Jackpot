package jackpot;

import java.text.NumberFormat;
import java.util.Random;

public class tragaperras {
    public static float DEPOSITO = 1000F;
    public static final int COLUMNAS = 3;
    private static final int SIMBOLOS = 5;
    private float saldo = 0F;
    
    public static void sumDeposito(float x) {
        DEPOSITO += x;
    }
    
    public static void resDeposito(float x) {
        DEPOSITO -= x;
    }
    
    public void resetSaldo() {
        saldo = 0;
    }
  
    public float getSaldo() {
        return saldo;
    }
    
    public void resSaldo(float x){
        saldo -= x;
    }
    
    public void sumSaldo(float x){
        saldo += x;
    }
    
    int[] generarTirada() {
        int[]tirada = new int[COLUMNAS];
        Random generador = new Random();
        for (int i = 0; i < COLUMNAS; i++) 
            tirada[i] = generador.nextInt(SIMBOLOS);
        return tirada;
    }
    
    public String MostrarSaldo() {
        NumberFormat formato = NumberFormat.getCurrencyInstance();
        return formato.format(getSaldo());
    }
}
