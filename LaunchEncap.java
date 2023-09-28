
class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        if(age>0){
            this.age = age;
        }else{
            System.out.println("age negative is not valid");
        }
    }
    public int getAge(){
        return age;
    }
}

public class LaunchEncap {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Danish");
        st.setAge(-20);
        System.out.println(st.getName());
        System.out.println(st.getAge());
        
    }
}
