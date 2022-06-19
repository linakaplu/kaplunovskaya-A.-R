public class TechnicalService {
    private String nameOfStation;
    private String adress;
    private String nameOfAuto;
    private String typeOfRepair;
    private String dateOfReceipt;
    private String dateOfIssue;
    private String repairResult;
    private String surname;
    private int amountOfRepair;

    public TechnicalService(String nameOfStation, String adress, String nameOfAuto, String typeOfRepair, String dateOfReceipt, String dateOfIssue, String repairResult, String surname, int amountOfRepair) {
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

    public String getNameOfStation() {   //имя станции
        return nameOfStation;
    }

    public void setNameOfStation(String nameOfStation) {
        this.nameOfStation = nameOfStation;
    }

    public String getAdress() {     //адрес
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNameOfAuto() {      //название машины
        return nameOfAuto;
    }

    public void setNameOfAuto(String nameOfAuto) {
        this.nameOfAuto = nameOfAuto;
    }

    public String getTypeOfRepair() {    //тип починки
        return typeOfRepair;
    }

    public void setTypeOfRepair(String typeOfRepair) {
        this.typeOfRepair = typeOfRepair;
    }

    public String getDateOfReceipt() {     //дата принятия
        return dateOfReceipt;
    }

    public void setDateOfReceipt(String dateOfReceipt) {
        this.dateOfReceipt = dateOfReceipt;
    }

    public String getDateOfIssue() {       //дата выдачи
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getRepairResult() {     //Результат починки
        return repairResult;
    }

    public void setRepairResult(String repairResult) {
        this.repairResult = repairResult;
    }

    public String getSurname() {     //фамилия работника
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAmountOfRepair() {       //сумма починки
        return amountOfRepair;
    }

    public void setAmountOfRepair(int amountOfRepair) {
        this.amountOfRepair = amountOfRepair;
    }

    public String toString() {
        return "На станции техобслуживания "+ nameOfStation +", расположенной по адресу "+ adress +" была организована услуга "+ typeOfRepair +" для автомобиля "+ nameOfAuto +". \nПоступил автомобиль "+ dateOfReceipt +", был выдан "+ dateOfIssue +". \nРезультат ремонта: " + repairResult + ". Ответственный сотрудник " + surname + " рассчитал стоимость ремонта в сумме: " + amountOfRepair;

    }
}