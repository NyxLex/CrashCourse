import java.util.Scanner;

public class person {
    private String name;
    private int birthYear;
    Scanner sc = new Scanner(System.in);
    public person() {
    }
    public person(String name,int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public int age(){
    return 2021-this.birthYear;
    }
    public String input()
    {
        String name = sc.next();
        return   this.name = name;
    }
    public String output() {
        return   name;
    }



    public String Change(String name){
      return   this.name = name;
    }
}
