package bll;

/**
 * @author Andrei Baraian
 */

import dao.MessageDAO;
import service.Message;

public class MessageBLL extends ServiceBLL<Message> {

	public MessageBLL(){
		super(new MessageDAO());
	}

}
