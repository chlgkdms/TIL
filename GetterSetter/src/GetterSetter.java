import java.net.PortUnreachableException;

public class GetterSetter {
    private String name;    // 필드를 private로 선언
    private int age;


    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public GetterSetter(String name, int age){
        setAge(age);
        setName(name);
    }


    void printGetterSetter(){
        System.out.println(getName()+"님");
        System.out.println(getAge()+"살");
    }
}

