public class InspecOfPassengersCars extends TechnicalService {
    private String typeOfInspection;
    private int year;
    private int mileagge;
    private String period;

    public InspecOfPassengersCars(String nameOfStation, String adress, String nameOfAuto, String typeOfRepair, String dateOfReceipt, String dateOfIssue, String repairResult, String surname, int amountOfRepair, String typeOfInspection, int year, int mileagge, String period)
    {
        super(nameOfStation, adress, nameOfAuto, typeOfRepair, dateOfReceipt, dateOfIssue, repairResult, surname, amountOfRepair);
        this.typeOfInspection = typeOfInspection;
        this.year = year;
        this.mileagge = mileagge;
        this.period = period;
    }

    public void setTypeOfInspection(String typeOfInspection) {
        this.typeOfInspection = typeOfInspection;
    }
    public String getTypeOfInspection() {
        return typeOfInspection;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int year() { return year; }

    public void setMileagge(int mileagge) {
        this.mileagge = mileagge;
    }
    public int getMileagge() {
        return mileagge;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    public String getPeriod() {
        return period;
    }

    public String toString()
    {
        return super.toString() + "\nКол-во секунд до набора скорости - " + typeOfInspection + "\nОбъем двигателя - " + year + "\nМощность - " + mileagge + "\nПериод ";
    }

}
