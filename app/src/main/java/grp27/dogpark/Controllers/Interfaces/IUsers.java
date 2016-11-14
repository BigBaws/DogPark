package grp27.dogpark.Controllers.Interfaces;

import grp27.dogpark.Controllers.Dog;
import grp27.dogpark.Controllers.User;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface IUsers {
    Dog getDogs();
    User getFriends();
    String changeName();

}
