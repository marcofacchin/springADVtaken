package be.vdab.springadvtaken;

public class WoordService {
    boolean isPalindroom(String woord) {
        String invers = new StringBuilder(woord).reverse().toString();
        return woord.equals(invers);
    }
}
