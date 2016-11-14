package grp27.dogpark.Controllers.Interfaces;

import java.util.Date;

import grp27.dogpark.Controllers.Newsfeed;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface INewsfeed {
    Newsfeed createNewsfeed();
    Newsfeed getNewsfeed();
    void like(int userid);
    void unlike(int userid);
    void comment(int userid, String message, Date date);
}
