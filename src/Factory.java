public class Factory extends Organization {
    public Factory(String name, String owner, int numEmployees, int year, int month, int day, float profit) {
        super(name, owner, numEmployees, year, month, day, profit);
    }

    @Override
    public float getProfit() {
        return super.getProfit() + 1_000_000;
    }

    @Override
    public void show() {
        System.out.println("Завод: ");
        super.show();
    }
}