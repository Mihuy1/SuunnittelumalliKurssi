package Adapter;


public class Main {
    public static void main(String[] args) {
        CalendarToNewDateAdapter adapter = new CalendarToNewDateAdapter();

        adapter.setDay(30);
        adapter.setMonth(10);
        adapter.setYear(2024);

        System.out.println(adapter.getDay() + "." + adapter.getMonth() + "." + adapter.getYear());

        adapter.advanceDays(5);

        System.out.println(adapter.getDay() + "." + adapter.getMonth() + "." + adapter.getYear());
    } 
}
