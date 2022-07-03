package testjackson;

import java.util.List;

public class JacksonCompany {
	public String name;
	public List<JacksonUserInfo> userInfos;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", userInfos=" + userInfos +
                '}';
    }
}