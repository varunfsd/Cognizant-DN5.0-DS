package UpSkilling;

import java.util.*;

public class Pract {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        if (list.contains(2)) {
            System.out.print("Hello World");
        }
    }
}

abstract class BankService {
    abstract void transferMoney();
}

class OnlineBanking extends BankService {
    void transferMoney() {
        System.out.println("Transfer Successful");
    }
}