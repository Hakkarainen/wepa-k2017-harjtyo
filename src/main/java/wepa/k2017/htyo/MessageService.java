
package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.DiscussionMessage;
    
/**
 *
 * @author THyyppä
 */
@Service
public class MessageService {

    @Autowired
    private DiscussionMessageRepository discussionMessageRepository;
    
    // käytetyt oliot
    private DiscussionMessage discussionMessage;

    //Messages
    public void createMessage(Model model, String writer, String content) {
        discussionMessage = new DiscussionMessage(writer, content); //CREATE
        discussionMessageRepository.save(discussionMessage);
        model.addAttribute("message", discussionMessage);
    }

    public void deleteMessage(Long messageId) {
        discussionMessageRepository.delete(messageId);
    }

    public void getOneMessage(Model model, Long messageId) {
        //discussionMessage = discussionMessageRepository.findOne(messageId);
        //Do update here !
        //discussionMessageRepository.save(discussionMessage); //UPDATE/WRITE
        model.addAttribute("message", discussionMessageRepository.findOne(messageId));
    }

    public void getAllMessages(Model model) {
        model.addAttribute("messages", discussionMessageRepository.findAll());
    } 
}
