package pojobeans;

import java.util.Date;

public class Account {
    private  long id;
    private  String owername;
    private double balance;
    private Date accessTime;
    private  boolean locked;

    public Account() {
        return;
    }

    public Account(long id,String owername,double balance,Date accessTime,boolean locked) {
        this.id=id;
        this.owername=owername;
        this.balance=balance;
        this.accessTime=accessTime;
        this.locked=locked;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwername() {
        return owername;
    }

    public void setOwername(String owername) {
        this.owername = owername;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
