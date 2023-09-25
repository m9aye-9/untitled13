import java.util.Objects;

public class Singer {

    private String name;
    private String gender;
    private String nationality;
    private Date dateOfBirth;
    Singer(String name,String gender,String nationality,Date dateOfBirth){
        this.setName(name);
        this.setGender(gender);
        this.setNationality(nationality);
        this.setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public  String toString(){
        return String.format("%12s%12s%12s%12s",this.name,this.gender,this.nationality,this.dateOfBirth);
    }
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Singer other = (Singer)obj;
        return Objects.equals(this.name,other.name)&&Objects.equals(this.gender,other.gender)&&Objects.equals(this.nationality,other.nationality)&&Objects.equals(this.dateOfBirth,other.dateOfBirth);

    }

}
