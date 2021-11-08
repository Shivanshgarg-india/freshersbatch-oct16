public class Contacts {
    private String name;
    private long phonenumber;
    private String email;
    private Gender gender;

    public Contacts(String name, long phonenumber, String email, Gender gender) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
