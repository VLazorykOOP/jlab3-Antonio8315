public class OilAndGasCompany extends Organization {
    public OilAndGasCompany(String name, String owner) {
        super(name, owner, 200, 2010, 3, 15, 1_000_000F);
    }

    @Override
    public float getProfit() {
        return super.getProfit();
    }

    @Override
    public void show() {
        System.out.println("Нафтогазова компанія: ");
        super.show();
    }
}