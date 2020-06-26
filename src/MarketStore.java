public class MarketStore {
    public static void main(String[] args) {
        try {
            Card bronze = new Bronze("Minhco", 0, 150);
            Card silver = new Silver("Kiro", 600, 850);
            Card gold = new Gold("Paci", 1500, 1300);

            System.out.println(bronze.print());
            System.out.println();
            System.out.println(silver.print());
            System.out.println();
            System.out.println(gold.print());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
