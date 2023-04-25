package Day05;
public class MoneyCounter {
    public static void main(String[] args) {
        int amount = 534760;
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
        int[] counts = new int[units.length];
        
        for (int i = 0; i < units.length; i++) {
            counts[i] = amount / units[i];
            amount %= units[i];
        }
        
        for (int i = 0; i < units.length; i++) {
            System.out.println(units[i] + "원: " + counts[i] + "개");
        }
    }
}

