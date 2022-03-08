public class Employee {
    private String title;
    private String name;
    private String ppsId;
    private Integer phone;
    private String employmentType;
    private Integer age;

    public Employee(String title, String name, String ppsId, Integer phone, String employmentType, Integer age) {
        if (title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title, must be 'Mr', 'Mrs', or 'Ms'");
        }
        this.name = name;
        this.ppsId = ppsId;
        this.phone = phone;
        this.employmentType = employmentType;
        this.age = age;
    }
}
