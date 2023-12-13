package com.company;

public class Card {

     double balance;

    public Card(double balance) {
        this.balance = balance;
    }

    public void charge(double amount){
        if(this.balance>=amount){
            System.out.println("Pocetni balance: "+this.balance);
            this.balance -= amount;
            System.out.println("Naplaceno: "+amount);
            System.out.println("Novi balance je: "+this.balance);
        } else{
            System.out.println("Nemate dovoljno sredstava");
        }

    }
}
