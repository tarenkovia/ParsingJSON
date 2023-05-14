import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class PassData {
    //Фамилия, Имя, Отчество, дата рождения, место рождения, номер паспорта, когда выдан, код подразделения
    String surname;
    String firstName;
    String secondName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dateOfBirth;
    String cityOfBirth;
    int numOfPass;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date dateOfPass;
    String divCode;

    public PassData(String surname, String firstName, String secondName, Date dateOfBirth, String cityOfBirth, int numOfPass, Date dateOfPass, String divCode){
        this.surname = surname;
        this.firstName = firstName;
        this.secondName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.cityOfBirth = cityOfBirth;
        this.numOfPass = numOfPass;
        this.dateOfPass = dateOfPass;
        this.divCode = divCode;
    }

    public PassData(){
        super();
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    public Date getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public String getCityOfBirth(){
        return cityOfBirth;
    }
    public void setCityOfBirth(String cityOfBirth){
        this.cityOfBirth = cityOfBirth;
    }

    public int getNumOfPass(){
        return numOfPass;
    }
    public void setNumOfPass(int numOfPass){
        this.numOfPass = numOfPass;
    }

    public Date getDateOfPass(){
        return dateOfPass;
    }
    public void setDateOfPass(Date dateOfPass){
        this.dateOfPass = dateOfPass;
    }

    public String getDivCode(){
        return divCode;
    }
    public void setDivCode(String divCode) {
        this.divCode = divCode;
    }

    public void printAll(){
        //System.out.format(surname + " " + firstName + " " + secondName + "%-10s" + dateOfBirth.toString()
                //+ "%-10s" + cityOfBirth + "%-10s" + numOfPass + "%-10s" + dateOfPass.toString() + "%-10s" + divCode);
        System.out.format("%-20.15s %-15.10s %-15.13s %-33.30s %-20.16s %-20.21s %-33.30s %-20.8s",
                surname, firstName, secondName, dateOfBirth.toString(), cityOfBirth, numOfPass, dateOfPass.toString(), divCode);
    }
}
