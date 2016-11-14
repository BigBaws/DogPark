package grp27.dogpark.Controllers;

import java.util.Date;

import grp27.dogpark.Controllers.Interfaces.INewsfeed;

/**
 * Created by BigBaws on 14/11/2016.
 */

public class Newsfeed implements INewsfeed {


    public INewsfeed createNewsfeed(String username) {
        return null;
    }

    @Override
    public Newsfeed createNewsfeed() {
        return null;
    }

    @Override
    public Newsfeed getNewsfeed() {
        return null;
    }

    @Override
    public void like(int userid) {

    }

    @Override
    public void unlike(int userid) {

    }

    @Override
    public void comment(int userid, String message, Date date) {

    }
}
