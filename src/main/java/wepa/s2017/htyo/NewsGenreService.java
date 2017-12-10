
package wepa.k2017.htyo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.Discussion;
import wepa.k2017.htyo.domain.DiscussionList;
import wepa.k2017.htyo.domain.DiscussionTopic;

/**
 *
 * @author THyyppä
 */
@Service
public class DiscussionTopicService {

    @Autowired
    private DiscussionTopicRepository discussionTopicRepository;
    @Autowired
    private DiscussionLiRepository discussionLiRepository;
    
    // käytetyt oliot
    private DiscussionTopic discussionTopic;
    private Discussion discussion;

    //Discussion of the Topic
    public void createDiscussion(Model model, Integer initiatedBy, Integer topic, String header) {
        discussion = new Discussion(initiatedBy, topic, header); //CREATE
        addDiscussionToTopic(model, discussion);
    }      
    public void addDiscussionToTopic(Model model, Discussion discussion) {
        discussionTopic.addDiscussion(discussion);
        discussionTopicRepository.save(discussionTopic);
        model.addAttribute("discussionsPerTopic", discussionTopic.getDiscussions());
    }
    public void delDiscussionfromTopic(Model model, Discussion discussion) {
        discussionTopic.delDiscussion(discussion);
        discussionTopicRepository.save(discussionTopic);
        model.addAttribute("discussionsPerTopic", discussionTopic.getDiscussions());
    }
    public void findDiscussionsPerTopic(Model model, DiscussionTopic discussionTopic) {
        model.addAttribute("discussionsPerTopic", discussionTopic.getDiscussions());
    }

    //Dicussion Topic
    public void createDiscussionTopic(Model model, Integer topic, String writer, String header) {
        discussionTopic = new DiscussionTopic(topic, writer, header); //CREATE
        discussionTopicRepository.save(discussionTopic);
        model.addAttribute("discussionTopic", discussionTopic);
    }
    
    public void deleteDiscussionTopic(Long discussionTopicId) {
        discussionTopicRepository.delete(discussionTopicId);
    }

    public DiscussionTopic getOneDiscussionTopic(Model model, Long discussionTopicId) {
        DiscussionTopic discussionTopic = discussionTopicRepository.findOne(discussionTopicId);
        //Do update here !
        //discussionTopicRepository.save(discussionTopic); //UPDATE/WRITE
        model.addAttribute("discussionTopic", discussionTopicRepository.findOne(discussionTopicId));
        return discussionTopic;
    }   

    public void getAllDiscussionTopics(Model model) {
        model.addAttribute("discussionTopics", discussionTopicRepository.findAll());
    }
}
