

public class Main {

    public static void main(String[] args) {
        Music m1=new Music("punjabi songs","1980-1985","classical",new Date(3,4,2021),new Singer("Ahad","male","pakistani",new Date(2,4,1912)));
        Music m2=new Music("punjabi songs","1980-1985","classical",new Date(3,4,2020),new Singer("Ahad","male","pakistani",new Date(2,4,1912)));
        System.out.println(m1.toString());
        System.out.println(m2.toString());


  System.out.println(m1.equals(m2));}
}

