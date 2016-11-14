package grp27.dogpark.Controllers.Interfaces;

import grp27.dogpark.Controllers.Message;

/**
 * Created by BigBaws on 14/11/2016.
 */

public interface IMessage {
    Message getMessage(int userid);
    Message getMessages(int userid);
    Message sendMessage(int userid);
}
