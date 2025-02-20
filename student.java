import java.util.*;
public class student {
    private String name;
    private int id;
    private double balance;
    private static int idgen = 1;
    private ArrayList<transaction> transactions;
    
    public student(String myName){
        name = myName;
        balance = 0;
        id = idgen;
        idgen++;
        transactions = new ArrayList<transaction>();
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public void chargeLunch(int month, int day){
        balance -= 7;   //hard-code for lunch amount
        transaction t = new transaction(month, day, -7);
        transactions.add(t);
    }

    
    public ArrayList<transaction> getTransactionsByDate(int month, int day){
        ArrayList<transaction> givenDay = new ArrayList<transaction>();

        for(transaction t : transactions){
            if(month == t.getMonth() && day == t.getDay()){
                givenDay.add(t);
            }
        }
        if(givenDay.size() == 0){
            return null;
        } else {
            return givenDay;
        }
    }




public String toString(){
    return ("name: "+name+ " ID: " +id + " Balance: "+balance + "Transactions: " + transactions);
}
}