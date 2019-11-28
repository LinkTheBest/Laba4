public class SalaryNullException extends RuntimeException {
    private float sal;

    public float getSalary(){return sal;}

    public SalaryNullException(String message, float salary) {
        super(message);
        sal = salary;
    }

}
