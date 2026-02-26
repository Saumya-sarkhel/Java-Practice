/*
class Alien {

    private final int age;
    private final String name;

    public Alien(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Alien [age=" + age + ", name=" + name + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alien other = (Alien) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
*/


/*
    Data career class.
    Everything done above in Alien class is simply done here.

    all the variables(id, name) here are private and final by default, so its immutable.
    this cannot any extend any other class, but can implement an interface.

    here you can create methods as well. normal methods,static methods, and static variables as well.
    but can't declare instance variable inside.
*/
record Alien (int age, String name) { }


public class Record {
    public static void main(String[] args) {

        Alien a1 = new Alien(18, "David");
        Alien a2 = new Alien(18, "David");
        Alien a3 = new Alien(21, "John");

        System.out.println(a1.equals(a2));

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
