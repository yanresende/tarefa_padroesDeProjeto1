public class Customer {

    private String gradeRequest;
    private boolean hasCnpjPerson;

    public Customer(String gradeRequest, boolean hasCnpjPerson){
        this.gradeRequest = gradeRequest;
        this.hasCnpjPerson = hasCnpjPerson;
    }

    public boolean hasCnpjPerson(){
        return hasCnpjPerson;
    }

    public String getGradeRequest(){
        return gradeRequest;
    }
}