import java.util.*;

public class paysystem {
    
    ArrayList<student> students;

    public paysystem(){
        students = new ArrayList<student>();
    }

    public String transactionsByDay(int month, int day){
        String s = "";
        for(student st : students){
            ArrayList<transaction> timeByDay = st.getTransactionsByDate(month, day);
            if(timeByDay != null){
                s += timeByDay.toString() + " by: " + st.getName() + " ID: " + st.getId();
                s += "\n";
            }
        }
        return s;
    }

    public void logMeal(int month, int day, int id){
       for(student t : students){
        if(t.getId()==id){
            t.chargeLunch(month,day);
        }
       }
    }
    public void logDeposit(int month, int day, int id, int money){
        for(student t : students){
            if(t.getId()==id){
                t.addBalance(month,day,money);
            }
        }
    }
    public void negativeBalance(){
        for(student t : students){
            if(t.getBalance()<0){
                System.out.println(t.toString());
            }
    }
}
public void addStudent(String myName){
    students.add(new student(myName));

}
public String toString(){
    return students.toString();
}
}

        