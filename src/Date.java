import java.util.Objects;

public class Date {

    private int day;
    private int month;
    private int year;
    Date(int day,int month,int year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return   String.format("%d/%d/%d",this.day,this.month,this.year);
    }
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Date other = (Date)obj;
        return Objects.equals(this.day,other.day)&&Objects.equals(this.month,other.month)&&Objects.equals(this.year,other.year);

    }
}
