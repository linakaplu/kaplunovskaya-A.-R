public class InspecOfCargoCars extends TechnicalService {
    private String species;
    private int year;
    private int mileage;
    private String period;
    private String engineCapacity;

    public InspecOfCargoCars(String nameOfStation, String adress, String nameOfAuto, String typeOfRepair, String dateOfReceipt, String dateOfIssue, String repairResult, String surname, int amountOfRepair, String species, int year, int mileage, String period, String engineCapacity)
    {
        super(nameOfStation, adress, nameOfAuto, typeOfRepair, dateOfReceipt, dateOfIssue, repairResult, surname, amountOfRepair);
        this.species = species;
        this.year = year;
        this.mileage = mileage;
        this.period = period;
        this.engineCapacity = engineCapacity;
    }

    public void setSpecies(String species) { this.species = species; }
    public String getSpecies() {
        return species;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setMileage(int mileage) { this.mileage = mileage; }
    public int getMileage() {
        return mileage;
    }

    public void setPeriod(String period) { this.period = period; }
    public String getPeriod() {
        return period;
    }

    public void setEngineCapacity(String engineCapacity) { this.engineCapacity = engineCapacity; }
    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String toString()
    {
        return super.toString() + "\nВид - " + species + "\nГод проведения - " + year + "\nПробег - " + mileage + "\nПериод" + period + "\nОбъем двигателя - " + engineCapacity;
    }
}
