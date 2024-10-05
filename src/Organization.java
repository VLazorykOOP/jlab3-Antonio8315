import java.util.Date;
import java.util.GregorianCalendar;

public class Organization {
    private String name;
    private String owner;
    private int numEmployees;
    private Date creationDate;
    public float profit;

    // Блок ініціалізації
    {
        name = "Noname N.";
        profit = 1005.01F;
        creationDate = (new GregorianCalendar()).getTime();
    }

    public Organization(String n, String o, int ne, int year, int month, int day, float p) {
        name = n;
        owner = o;
        numEmployees = ne;
        creationDate = (new GregorianCalendar(year, month - 1, day)).getTime();
        profit = p;
    }

    public Organization(String in_name) {
        name = in_name;
    }

    public void show() {
        System.out.println("Назва компанії: " + name + "\nВласник: " + owner + "\nКількість працівників: " + numEmployees +
                "\nДата створенeня: " + creationDate + "\nПрибуток: " + profit);
}

public String getName() { return name; }
public String getOwner() { return owner; }
public int getNumEmployes() { return numEmployees; }
    public Date getCreationDate() { return creationDate; }
    public float getProfit() { return profit; }
}