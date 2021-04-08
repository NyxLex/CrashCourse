import java.util.*;

class Dog implements  Comparable<Dog>{


    Enum<breed> breeds;
    private String name, breed;
    private int age;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public void unicue(String name){
        if(name.equals(this.name)){
            System.out.println("not unicue name");
        }
        else {
            System.out.println("unicue name");
        }
    }
    public Dog(String name,  String br, int age) {
        this.name = name;
        this.breed = br;
        this.age = age;
        if (this.age<0) {
            throw new IllegalArgumentException("Age " + this.age
                    + " cannot be negative");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }


    public static  void main(String[] args) {
        Dog first = new Dog("Dasha", "Akita",2);
        System.out.println(first.getAge());
        List<Dog> list = new ArrayList<Dog>();

        list.add(new Dog("Barsik", "Akita",7));
        list.add(new Dog("Musya", "Auggie",5));
        list.add(new Dog("Wilgard", "Labrador",6));
        list.add(new Dog("Wilgard", "Labrador",-2));

        Collections.sort(list, Comparator.comparing(s -> s.getAge()));

        System.out.println(list.get(list.size() - 1));

    }


    @Override
    public int compareTo(Dog o) {
        return name.compareTo(((Dog) o).name);
    }
}
