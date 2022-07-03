package testMoshi;

import java.util.List;

public class MoshiCompany {
	public String name;
	public List<MoshiUserInfo> userInfos;

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", userInfos=" + userInfos +
                '}';
    }
}