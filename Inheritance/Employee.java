class Employee{
    private String Emp_name;
    private String Emp_id;
    private String Address;
    private String Mail_id;
    private String Mobile_No;

    public Employee(String Address, String Emp_id, String Emp_name, String Mail_id, String Mobile_No) {
        this.Address = Address;
        this.Emp_id = Emp_id;
        this.Emp_name = Emp_name;
        this.Mail_id = Mail_id;
        this.Mobile_No = Mobile_No;
    }

        
    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    public String getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(String Emp_id) {
        this.Emp_id = Emp_id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMail_id() {
        return Mail_id;
    }

    public void setMail_id(String Mail_id) {
        this.Mail_id = Mail_id;
    }

    public String getMobile_No() {
        return Mobile_No;
    }

    public void setMobile_No(String Mobile_No) {
        this.Mobile_No = Mobile_No;
    }

    
}