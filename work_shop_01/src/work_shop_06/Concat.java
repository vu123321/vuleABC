package work_shop_06;

public class Concat {

    /**
     * Solution 01
     */

    private  static String solution(String s1,String s2){
        return  s1.concat(s2);
    }

    private static String solution02(String s1, String s2){

        return s1 + s2;
    }

    public static void main(String[] args) {
        String s1 = solution("le","hoang");
        System.out.println(s1);
    }
}
