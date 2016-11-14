package grp27.dogpark.Controllers.Interfaces;

import grp27.dogpark.Controllers.Dog;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface IDog {
    Dog createDog(int userid);
    Dog getDog(int id);
}
