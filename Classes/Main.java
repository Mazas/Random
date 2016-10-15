package tadasIvanauskas;

import static javax.swing.JOptionPane.*;

public class Main {

    public static void main(String[] args) {
        String name;
        String number;
        String lastName;
        String money;
        double moneyy=0;
        boolean isSet=false;
        Class2 myClass = new Class2();
        showMessageDialog(null,"Welcome");
        while (!isSet){
            name=showInputDialog(null,"Enter your name");
            lastName= showInputDialog(null,"Enter your last name");
            number= showInputDialog(null,"Enter your personal number");
            money = showInputDialog(null,"Enter the base amount");
            if (money.isEmpty()){
                continue;
            }
            if (Class1.isNumber(money)){
                moneyy=Double.parseDouble(money);
        }else{
                showMessageDialog(null,"Invalid input");
            }
            if ( YES_OPTION == showConfirmDialog(null,String.format("Name: %s\n" +
                    "Last name: %s\nPersonal number: %s\nBalance: %.2f", name,lastName,number,moneyy))){
                myClass=new Class2(number,moneyy,name,lastName);
                isSet=true;
        }
        }
        showMessageDialog(null,myClass.toString());

    }
}
