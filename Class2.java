package tadasIvanauskas;

/**
 * Created by hamekas on 10/9/16 @HKR ivanauskas15@gmail.com
 */
public class Class2  extends Class1{
    private String personnumer;
    public Class2(){
        this("000000-0000",0,"","");
    }
    public Class2(String number,double money,String name, String lastName){
        super(money,name,lastName);
    }
    public String getPersonnumer(){
        return personnumer;
    }
    public String toString(){
        return String.format("%s %s %s %.2f",getName(),getLastName(),getPersonnumer(),getMoney());
    }

}
