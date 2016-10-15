package tadasIvanauskas;
/**
 * Created by hamekas on 10/9/16 @HKR ivanauskas15@gmail.com
 */
class Class1 {
    private double money;
    private String name;
    private String lastName;
    public Class1(){
        this(0,"","");
    }
    public Class1(double money, String name, String lastName){
        this.lastName=lastName;
        this.name=name;
        if (money<0){
            throw new IllegalArgumentException("money cannot be negative");
        }
    }
    public static boolean isNumber(String string){
        int counter=0;
        char[] chars=string.trim().toCharArray();
        char[] digits={'0','1','2','3','4','5','6','7','8','9','-','+'};
        for (char achar:chars){
            for (char digit:digits){
                if (achar==digit){
                    counter++;
                }
            }
        }
        return counter==chars.length;
    }
    public double getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }


}
