public class MealPayRunner {
   public static void main(String[] args) {
    
   
    paysystem m = new paysystem();

    System.out.println("Adding Students");
    m.addStudent("Noah Posin");
    m.addStudent("Ian Teigen");
    m.addStudent("Ethan Hoffman");
    m.addStudent("Nick Otamura");
    System.out.println(m);

    System.out.println("Makeing charges . . .");
    m.logDeposit(2,4,1,30);
    m.logDeposit(1,3,2,15);
    m.logDeposit(2,3,1,50);
    m.logMeal(2,4,1);
    m.logMeal(3,4,2);
    m.logMeal(2,4,2);
    m.logMeal(3,2,2);
    System.out.println(m);
    
    System.out.println("finding negative values");
    m.negativeBalance();

    System.out.println(" all trasactions on a date");
    System.out.println(m.transactionsByDay(2, 4));
   }
   
}

