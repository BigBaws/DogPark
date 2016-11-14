package grp27.dogpark.Controllers.Interfaces;

import grp27.dogpark.Controllers.Dog;
import grp27.dogpark.Controllers.Profile;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface IProfile {
    Profile createProfile();
    Dog createDog(int id);
    Dog createPuppie(int id);
}
