package testjackson;

public class JacksonUserInfo {
    public String name;
    public int age;

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}