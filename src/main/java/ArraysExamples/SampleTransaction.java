package ArraysExamples;

public class SampleTransaction {
    String transaction;
    String data;
    Integer time;
    Character access;

    public SampleTransaction(){ }

    public SampleTransaction(String transaction, String data, Integer time, Character access) {
        this.transaction = transaction;
        this.data = data;
        this.time = time;
        this.access = access;
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

