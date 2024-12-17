
class ProjectManager extends Employee {

    private float Basic_Pay;
    private float DA;
    private float HRA;
    private float PF;
    private float StaffClubFund;
    public static final String post = "Project Manager";
    private float grossSalary;
    private float netSalary;

    // Percentage Constants
    private static final float DA_PERCENT = 0.97f;
    private static final float HRA_PERCENT = 0.10f;
    private static final float PF_PERCENT = 0.12f;
    private static final float STAFF_CLUB_PERCENT = 0.001f;

    public ProjectManager(String Emp_id, String Emp_name, String Address, String Mail_id, String Mobile_No, float Basic_Pay) {
        super(Address, Emp_id, Emp_name, Mail_id, Mobile_No);
        this.Basic_Pay = Basic_Pay;
        calculateComponents();
    }

    // Setters and Getters
    public void setBasic_Pay(float Basic_Pay) {
        this.Basic_Pay = Basic_Pay;
        calculateComponents(); // Automatically calculate dependent components
    }

    public float getBasic_Pay() {
        return Basic_Pay;
    }

    private void calculateComponents() {
        this.DA = DA_PERCENT * Basic_Pay;
        this.HRA = HRA_PERCENT * Basic_Pay;
        this.PF = PF_PERCENT * Basic_Pay;
        this.StaffClubFund = STAFF_CLUB_PERCENT * Basic_Pay;
        this.grossSalary = Basic_Pay + DA + HRA;
        this.netSalary = grossSalary - (PF + StaffClubFund);
    }

    public float getDA() {
        return DA;
    }

    public float getHRA() {
        return HRA;
    }

    public float getPF() {
        return PF;
    }

    public float getStaffClubFund() {
        return StaffClubFund;
    }

    public float getGrossSalary() {
        return grossSalary;
    }

    public float getNetSalary() {
        return netSalary;
    }

    public static String getPost() {
        return post;
    }

    // Generate Pay Slip (Unchanged)
    public void generatePaySlip() {
        System.out.println("\n\t\t\t\033[92m Pay Slip \n\033[0m");
        System.out.println("Emp_id :\t" + getEmp_id() + "\t Emp_name : \t" + getEmp_name());
        System.out.println("Address : \t" + getAddress());
        System.out.println("Mail_Id : \t" + getMail_id() + "\t Mobile_No : \t" + getMobile_No());
        System.out.println("\033[94mPost : \t\033[0m" + getPost());
        System.out.println("Baisc Salary : \t" + getBasic_Pay() + "\t HRA :\t" + getHRA());
        System.out.println("DA : \t" + getDA() + "\t PF :\t" + getPF());
        System.out.println("Staff Club Fund : \t" + getStaffClubFund());
        System.out.println("\tGross Salary : \t" + getGrossSalary());
        System.out.println("\tNet Salary : \t" + getNetSalary());
    }

}
