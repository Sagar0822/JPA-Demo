package com.platinum.jpademo1;
import javax.persistence.*;

//CHILD CLASS
@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //Auto generate P.K
    private int cardNo;
    private int dob;
    @Enumerated(EnumType.STRING)  //convert enum to varChar b'coz Mysql not know enum datatype
    private Status status;

    @JoinColumn   //Generate F.K
    @OneToOne
    User user;  //parent class

    public Card(){

    }
    public Card(int cardNo, int dob, Status status) {
        this.cardNo = cardNo;
        this.dob = dob;
        this.status = status;
    }

    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
