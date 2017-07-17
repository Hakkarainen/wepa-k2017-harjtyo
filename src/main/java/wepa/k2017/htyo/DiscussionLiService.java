package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.Discussion;
import wepa.k2017.htyo.domain.DiscussionList;
import wepa.k2017.htyo.domain.DiscussionTopicList;

/**
 *
 * @author THyyppä
 */
@Service
public class DiscussionLiService {

    @Autowired
    private DiscussionLiRepository discussionLiRepository;

    // käytetyt oliot
    private Discussion discussion;
    private DiscussionTopicList discussionTopicList;

    //Discussions
    public void createDiscussion(Model model, Integer initiatedBy, Integer  topic, String header) {
        discussion = new Discussion(initiatedBy, topic, header); //CREATE
        discussionLiRepository.save(discussion);
        model.addAttribute("discussion", discussion);
    }

    public void deleteDiscussion(Long discussionId) {
        discussionLiRepository.delete(discussionId);
    }

    public void getOneDiscussion(Model model, Long discussionId) {
        //discussion = discussionLiRepository.findOne(discussionId);
        //Do update here !
        //discussionRepository.save(discussion); //UPDATE/WRITE
        model.addAttribute("discussion", discussionLiRepository.findOne(discussionId));
    }

    public void getAllDiscussions(Model model) {
        model.addAttribute("discussions", discussionLiRepository.findAll());
    }
    
    public void findMessagesPerDiscussion(Model model) {
        model.addAttribute("messagesPerDiscussion", DiscussionTopicList.class);
    }
}
