/*class Person*/
package tp3exosYaip4;

public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
    

        public static void main(String[] args) {
            Staff staff1 = new Staff("Amin", "Vitrolles", "IUT aix-marseille", 3500.0);
            Student student1 = new Student("Bob", "456 Avenue Centrale", "Informatique", 2, 2500.0);

            System.out.println(staff1);
            System.out.println(student1);
        }
    }



