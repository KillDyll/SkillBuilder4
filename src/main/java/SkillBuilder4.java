
/**
 * SkillBuilder5 is a class for completing the Skill
 * Builder 5 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder4 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        int firstT = -1;
        int firstY = -1;
        // for i in range(0,len(s),1):
        for (int i =0; i< s.length(); i++){
            if ((s.charAt(i) == 't' || s.charAt(i) == 'T' )&& firstT == -1){
                firstT = i;
            }
            if ((s.charAt(i) == 'y' || s.charAt(i) == 'Y') && firstT != -1  && firstY == -1 ){
                firstY= i;
            }
        }
        if (-1 == firstT || -1 == firstY){
            return "";

        }
        return s.substring(firstT,firstY +1);
    }
}
