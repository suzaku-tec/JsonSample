package testgson;

public class GsonUserInfo {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "UserInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}