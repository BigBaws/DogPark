package grp27.dogpark.Controllers;

import grp27.dogpark.Controllers.Interfaces.IUsers;

/**
 * Created by BigBaws on 14/11/2016.
 */
public class User implements IUsers {

    private String name;

    @Override
    public Dog getDogs() {
        return null;
    }

    @Override
    public User getFriends() {
        return null;
    }

    @Override
    public String changeName() {
        return null;
    }
}
