package comp1110.homework.O02;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 25/2/2024 9:42 pm
 */
public enum Element {
    H(1, 1, 1),
    He(2, 18, 1),
    Li(3, 1, 2),
    Be(4, 2, 2),
    B(5, 13, 2);

    private int[] facts;

    Element(int weight, int group, int period) {
        facts = new int[3];
        facts[0] = weight;
        facts[1] = group;
        facts[2] = period;
    }

    public int[] getFacts() {
        return facts;
    }

    public static void main(String[] args) {
        Element h = Element.He;
        System.out.println(h.getFacts()[0] + " " + h.getFacts()[1] + " " + h.getFacts()[2]);
    }
}
