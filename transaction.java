public class transaction {
    private int month;
    private int day;
    private double amount;

//functions
public transaction(int mymonth, int myday, double myamount){
    month=mymonth;
    day=myday;
    amount=myamount;
}
public int getMonth(){
    return month;
}
public int getDay(){

    return day;

}
public double getAmount(){
    return amount;
}


//toString
public String toString(){

    return(month + "/" + day +", amount: $"+amount);


}



}