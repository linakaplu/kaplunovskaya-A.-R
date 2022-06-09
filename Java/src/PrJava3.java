package PrJava3;
public class prjava3 {
    private String nameOfStation;
    private String adress;
    private String nameOfAuto;
    private String typeOfRepair;
    private int dateOfReceipt;
    private int dateOfIssue;
    private String repairResult;
    private String surname;
    private int amountOfRepair;

    public prjava3(String nameOfStation, String adress, String nameOfAuto, String typeOfRepair, int dateOfReceipt, int dateOfIssue, String repairResult, String surname, int amountOfRepair) {
        this.nameOfStation = nameOfStation;
        this.adress = adress;
        this.nameOfAuto = nameOfAuto;
        this.typeOfRepair =typeOfRepair;
        this.dateOfReceipt = dateOfReceipt;
        this.dateOfIssue = dateOfIssue;
        this.repairResult = repairResult;
        this.surname = surname;
        this.amountOfRepair = amountOfRepair;
    }

    public String getnameOfStation() {   //имя станции
        return nameOfStation;
    }

    public void setnameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public String getadress() {     //адрес
        return adress;
    }

    public void setadress(String adress) {
        this.adress = adress;
    }

    public String getnameOfAuto() {      //название машины
        return nameOfAuto;
    }

    public void setnameOfAuto(String nameOfAuto) {
        this.nameOfAuto = nameOfAuto;
    }

    public String gettypeOfRepair() {    //тип починки
        return typeOfRepair;
    }

    public void settypeOfRepair(String typeOfRepair) {
        this.typeOfRepair = typeOfRepair;
    }

    public Integer getdateOfReceipt() {     //дата принятия
        return dateOfReceipt;
    }

    public void setdateOfReceipt(Integer dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public int getdateOfIssue() {       //дата выдачи
        return dateOfIssue;
    }

    public void setdateOfIssue(int dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getrepairResult() {     //Результат починки
        return repairResult;
    }

    public void setrepairResult(String repairResult) {
        this.repairResult = repairResult;
    }

    public String getsurname() {     //фамилия работника
        return surname;
    }

    public void setsurname(String surname) {
        this.surname = surname;
    }

    public int getamountOfRepair() {       //сумма починки
        return amountOfRepair;
    }

    public void setamountOfRepair(int amountOfRepair) {
        this.amountOfRepair = amountOfRepair;
    }

    public String toString() {
        return "На станции техобслуживания "+ nameOfStation +", расположенной по адресу "+ adress +" была организована услуга "+ typeOfRepair +" для автомобиля "+ nameOfAuto +". \nПоступил автомобиль "+ dateOfReceipt +", был выдан "+ dateOfIssue +". \nРезультат ремонта: " + repairResult + ". Ответственный сотрудник " + surname + " рассчитал стоимость ремонта в сумме: " + amountOfRepair;

    }
}