public class Malfunction extends TechnicalService {
    private String nameOfMalfunction;
    private String CompletedWork;

    public Malfunction(String nameOfStation, String adress, String nameOfAuto, String typeOfRepair, String dateOfReceipt, String dateOfIssue, String repairResult, String surname, int amountOfRepair, String nameOfMalfunction, String CompletedWork )
    {
        super(nameOfStation, adress, nameOfAuto, typeOfRepair, dateOfReceipt, dateOfIssue, repairResult, surname, amountOfRepair);
        this.nameOfMalfunction = nameOfMalfunction;
        this.CompletedWork = CompletedWork;
    }

    public void setNameOfMalfunction(String nameOfMalfunction) { this.nameOfMalfunction = nameOfMalfunction; }
    public String getNameOfMalfunction() { return nameOfMalfunction; }

    public void setCompletedWork(String completedWork) { this.CompletedWork = completedWork; }
    public String getCompletedWork() { return CompletedWork; }

    public String toString()
    {
        return super.toString() + "\nВид поломки - " + nameOfMalfunction + "\nВыполненная работа - " + CompletedWork ;
    }

}
