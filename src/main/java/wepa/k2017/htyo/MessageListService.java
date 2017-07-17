
package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.DiscussionList;

/**
 *
 * @author THyyppä
 */
@Service
public class MessageListService {

    @Autowired
    private MessageListRepository messageListRepository;

    public void findMessagesPerDiscussion(Model model) {
        model.addAttribute("messagesPerDiscussion", DiscussionList.class);
    }
}
