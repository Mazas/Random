package tadas.ivanauskas;

/**
 * Created by hamekas on 10/8/16 @HKR ivanauskas15@gmail.com
 */
public class Checks {
    public static boolean isNumber(String string){
        int count=0;
        char[] chars=string.trim().toCharArray();
        char[] digits ={'0','1','2','3','4','5','6','7','8','9','-','+','.'};
        for (char achar:chars){
            for (char digi:digits){
                if(achar==digi){
                    count++;
                }
            }
        }
        return count==chars.length;
    }
}
