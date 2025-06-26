package College;

public class MyDate {
    private int dd;
    private int mm;
    private int yy;
    public MyDate() {
        this.dd = 1;
        this.mm = 1;
        this.yy = 2024;
    }
    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    public void displayDate() {
        System.out.println(this.dd+"/" +this.mm+"/"+this.yy);
    }
    public static void main(String[] args) {
        MyDate defaultDate = new MyDate();
        System.out.println("Default Date: ");
        defaultDate.displayDate();
        MyDate customDate = new MyDate(25, 12, 2024);
        System.out.println("Custom Date: ");
        customDate.displayDate();
    }
}
