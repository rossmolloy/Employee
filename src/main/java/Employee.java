public class Employee {
    private String title;
    private String name;
    private String ppsId;
    private Integer phone;
    private String employmentType;
    private Integer age;

    public Employee(String title, String name, String ppsId, Integer phone, String employmentType, Integer age) {
        if (title.equalsIgnoreCase("mr") || title.equalsIgnoreCase("mrs") || title.equalsIgnoreCase("ms")) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Invalid title, must be 'Mr', 'Mrs', or 'Ms'");
        }

        if (name.length() <= 25 && name.length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name provided is not valid, must be between 3-25 characters in length");
        }

        if (ppsId.length() == 8) {
            this.ppsId = ppsId;
        } else {
            throw new IllegalArgumentException("Invalid PPS ID, must be 8 characters in length");
        }

        if (phone.toString().length() == 9) {
            this.phone = phone;
        } else {
            throw new IllegalArgumentException("Invalid phone, must be a nine digit number");
        }

        if (employmentType.equalsIgnoreCase("full-time") || employmentType.equalsIgnoreCase("part-time") || employmentType.equalsIgnoreCase("contract")) {
            this.employmentType = employmentType;
        } else {
            throw new IllegalArgumentException("Invalid employment type, must be 'full-time', 'part-time', or 'contract'");
        }

        this.age = age;
    }
}
