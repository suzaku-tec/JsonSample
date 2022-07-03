package testgson;

import java.util.List;

public class GsonCompany {
    private String name;
    private List<GsonUserInfo> userInfos;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", userInfos=" + userInfos +
                '}';
    }
}