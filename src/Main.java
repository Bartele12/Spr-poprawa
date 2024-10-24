
class Person {
    private String name;
    private String lastName;
    private int age;
    private String sex;

    public Person(String name, String lastName, int age, String sex) {

        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;

    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getSex(){
        return sex;
    }
    public void intro() {
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Sex: " + sex);
    }
}
    class Employee extends Person{

     private  String position;
        private  int earn;
        private  int iD;
        private  boolean working;

        public Employee(String name, String lastName, int age,String sex, String position, int earn,int iD) {
            super(name, lastName, age, sex);

           this.position = position;
           this.earn = earn;
           this.iD = iD;
           this.working = true;

        }
        public String getPosition() {
            return position;
        }
        public int getEarn() {
            return earn;
        }
        public int getID() {
            return iD;
        }
        public boolean isWorking() {
            return working;
        }

        public void startWorking() {
            System.out.println("Starting working");
        }
        public void stopWorking() {
            System.out.println("Stopping working");
        }
        public void earnMore() {
            System.out.println("I want to earn more");
        }
    }
class Manager extends Employee {

    private String workers;
    private String department;

 public Manager(String name, String lastName, int age,String sex, String position, int earn,int iD){
     super(name, lastName, age, sex,position,earn,iD);

        this.workers = workers;
        this.department = department;
 }
 public void giveTasks() {
     System.out.println("Giving tasks");
 }
 public void changeDepartment() {
     System.out.println("Changing department");
 }
}
public class  Main {
    public static void main(String[] args) {
        Manager tak = new Manager("Jakub","Rokicki",25,"male","low",50000,158);
        tak.intro();
        tak.changeDepartment();
        tak.giveTasks();
        tak.stopWorking();
        tak.startWorking();
        tak.earnMore();
        System.out.println(tak.getLastName());
        System.out.println(tak.getSex());
        System.out.println(tak.getPosition());
        System.out.println(tak.getEarn());
        System.out.println(tak.getName());
        System.out.println(tak.getID());
        System.out.println(tak.getAge());




    }
}