package ArraysExamples;

/*
Find read-write conflicts among given database transactions
Given a list of database transactions, find all read-write conflicts among them. Assume that there is no strict two-phase locking (Strict 2PL) protocol to prevent read-write conflicts.

Each database transaction is given in the form of a tuple. The tuple ('T', 'A', 't', 'R') indicates that a transaction T accessed a database record A at a time t, and a read operation is performed on the record.

Assume that a data conflict happens when two transactions access the same record in the database within an interval of 5 units. At least one write operation is performed on the record.


For example,

Input:

(T1, A, 0, R)
(T2, A, 2, W)
(T3, B, 4, W)
(T4, C, 5, W)
(T5, B, 7, R)
(T6, C, 8, W)
(T7, A, 9, R)

Output:

Transaction T1 and T2 are involved in RW conflict
Transaction T3 and T5 are involved in WR conflict
Transaction T4 and T6 are involved in WW conflict
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ReadWriteDatabaseTransactions {

 public static void main(String[] args){

    List<Transaction> transactionList = Arrays.asList(
            new Transaction("T1", "A", 0, 'R'),
            new Transaction("T2", "A", 2, 'W'),
            new Transaction("T3", "B", 4, 'W'),
            new Transaction("T4", "C", 5, 'W'),
            new Transaction("T5", "B", 7, 'R'),
            new Transaction("T6", "C", 8, 'W'),
            new Transaction("T7", "A", 9, 'R')
            );
     Collections.sort(transactionList,new MyComparator());
     ReadWriteDatabaseTransactions obj = new ReadWriteDatabaseTransactions();
     obj.findConflictsUsingList(transactionList);
     //System.out.println(transactionList);
    }

    public void findConflictsUsingList(List<Transaction> transactionList){

     for (int i=0 ;i<transactionList.size()-1;i++){
         if((transactionList.get(i).getData().equals(transactionList.get(i+1).getData()) ) &&
                 (( transactionList.get(i+1).getTime() - transactionList.get(i).getTime() )<5)){
             if(transactionList.get(i).getAccess().equals('W') && transactionList.get(i+1).getAccess().equals('W') ){
                 System.out.println(transactionList.get(i).getTransaction() + "and " +transactionList.get(i+1).getTransaction() + "are involved in WW conflict");
             }

             if(transactionList.get(i).getAccess().equals('W') && transactionList.get(i+1).getAccess().equals('R') ){

                 System.out.println(transactionList.get(i).getTransaction() + "and " +transactionList.get(i+1).getTransaction() + "are involved in WR conflict");
             }

             if(transactionList.get(i).getAccess().equals('R') && transactionList.get(i+1).getAccess().equals('W') ){
                 System.out.println(transactionList.get(i).getTransaction() + "and " +transactionList.get(i+1).getTransaction() + "are involved in RW conflict");
             }
         }
     }
    }


    }

class MyComparator implements Comparator<Transaction> {

    @Override
    public int compare(Transaction o1, Transaction o2) {
        if (o1.data != o2.data) {
            return o1.getData().compareTo(o2.getData());
        }
        return o1.getTime().compareTo(o2.getTime());
    }
}


class Transaction {
    String transaction;
    String data;
    Integer time;
    Character access;

    public Transaction(){ }

    public Transaction(String transaction, String data, Integer time, Character access) {
        this.transaction = transaction;
        this.data = data;
        this.time = time;
        this.access = access;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transaction='" + transaction + '\'' +
                ", data='" + data + '\'' +
                ", time=" + time +
                ", access=" + access +
                '}';
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Character getAccess() {
        return access;
    }

    public void setAccess(Character access) {
        this.access = access;
    }

}


