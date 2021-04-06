import java.util.Objects;

public class TelegramProfile {
    private  String username;
    private String phone_number;
    private  String name;


    public String getUsername() {
        return username;
    }
    public TelegramProfile() {}
    public TelegramProfile(String username, String number, String name) {
        this.username = username;
        this.phone_number = number;
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString() {
        return "TelegramProfile{" +
                "username='" + username + '\'' +
                ", phone_number=" + phone_number +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelegramProfile that = (TelegramProfile) o;
        return phone_number == that.phone_number && Objects.equals(username, that.username) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, phone_number, name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public void checkLenght(){
        if (this.phone_number.length()!=10){
            System.out.println("This is not common number!! ");
        }
        else System.out.println("Number is valid");
    }
    public void UsedUsername(String name) {
        if (this.username == name){
            System.out.println("This username is already using");
        }
        else System.out.println("This username isn't used");
    }


}
