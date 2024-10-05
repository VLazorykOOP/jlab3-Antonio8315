public class InsuranceCompany extends Organization {
    public InsuranceCompany(String name, String owner) {
        super(name, owner, 100, 2020, 5, 10, 500_000F);
    }

    @Override
    public float getProfit() {
        return super.getProfit();
    }

    @Override
    public void show() {
        System.out.println("Страхова компанія: ");
        super.show();
    }
}