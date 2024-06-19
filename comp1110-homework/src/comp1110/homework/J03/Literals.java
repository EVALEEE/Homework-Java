package comp1110.homework.J03;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 2:38 pm
 */
public class Literals {

    public static void main(String[] args) {
        float f = 3.14f;
        System.out.println(f);

        String hex = "0xaff";
        int i = Integer.parseInt(hex.substring(2), 16);
        System.out.println(i);

        boolean b = false;
        System.out.println(b);

        char c = 65;
        System.out.println(c);

        long l = 65L;
        System.out.println(l);
    }
}
