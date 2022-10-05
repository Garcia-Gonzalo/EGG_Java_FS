/*
 * An object that contains fraccional numbers. Manage integer numbers and zero.
 * It has a reduce() method.
 */
package Entities;
import java.util.Scanner;

import javax.swing.event.DocumentEvent;

public class Fraccion {

    private int num, den;

    private void filterAndSet(int num, int den){
        if (num == 0 || den == 0){
            this.num = 0;
            this.den = 0;
        } else{
            this.num = num;
            this.den = den;
        }
    }
    public Fraccion(int num, int den) {
        this.filterAndSet(num, den);
    }

    public Fraccion(int num) {
        this.filterAndSet(num, 1);
    }

    public Fraccion() {
        Scanner read = new Scanner(System.in);
        int num,den;
        System.out.print("Ingrese el numerador: ");
        num = read.nextInt();
        System.out.print("Ingrese el denominador: ");
        den = read.nextInt();
        //read.close();
        this.filterAndSet(num, den);
    }

    @Override
    public String toString() {
        if (this.den ==0 || this.den==1) return this.num+"";
        else return this.num + "/" + this.den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    private int commonFactor() {
        int result=0;
        int[] primes = new int[] {2,3,5,7,11,13,17,19,23,29,31};

        for (int i=0; i<primes.length; i++){
            if (this.num % primes[i]==0 && this.den % primes[i]==0 ){
                result = primes[i];
                break;
            }
        }
        return result;
        
    }
    public void reduce() {
        int common;
        if (this.num !=0 && this.den !=1){
            if (this.num % this.den ==0){
                this.num = this.num /this.den;
                this.den = 1;
            } else{
                do {
                    common = this.commonFactor();
                    if (common!=0){
                        this.num = this.num / common;
                        this.den = this.den / common;
                        } 
                } while (common!=0);
            }
        }
    }
    // for testing
    public static void main(String[] args) {
        Fraccion f1, f2;
        f1 = new Fraccion();
        f2 = new Fraccion(3);
        System.out.println(f1);
        System.out.println(f2);
        
        //f1.reduce();
        //System.out.println(f1);
    }
    
    
}
