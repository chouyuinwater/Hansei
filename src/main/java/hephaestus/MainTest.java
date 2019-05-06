package hephaestus;

import java.util.regex.Pattern;

public class MainTest {
    public static void main(String[] args) {

        String value = "0.2";
//        String parrten = "^[1-9][0-9]{0,7}(.[0-9]{1,3})?$";
        String parrten = "^(0|[1-9][0-9]{0,7})(.[0-9]{1,3})?$";
//        String parrten = "^?:(0|[1-9][0-9]{1,7})(\\.[0-9]{1,3})?$";
//        String parrten = "^?:(0|[1-9][0-9]{1,7})(\\.[0-9]{1,3})?$";
//        String parrten = "^?:(0|[1-9][0-9]{1,7})(\\.[0-9]{1,3})?$";
        //"^(0|[1-9][0-9]{0,7})(.[0-9]{1,3})?$";

        boolean result = Pattern.matches(parrten, value);
        System.out.println(result);

    }
}
