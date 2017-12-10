package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import wepa.k2017.htyo.domain.DiscussionTopic;

/**
 *
 * @author THyyppä
 */
@Controller
public class DiscussionTopicController {

    @Autowired
    private DiscussionTopicService discussionTopicService;
        @Autowired
    private DiscussionLiService discussionLiService;

    public DiscussionTopicController() {
    }
    
    // Tämä POST luo ja tallettaa uuden keskustelun
    @RequestMapping(value = "/crtTopicDiscussion", method = RequestMethod.POST)
    public String createDiscussionTopicDiscussion(Model model, @RequestParam Integer initiatedBy, @RequestParam Integer topic, @RequestParam String header) {
        discussionTopicService.createDiscussion(model, initiatedBy, topic, header);
        return "/discussionsPerTopic";
    }

    // Tämä POST luo ja tallettaa uuden keskustelualueen
    @RequestMapping(value = "/crtDiscussionTopic", method = RequestMethod.GET)
    public String createDiscussionTopic(Model model, @RequestParam Integer topic, @RequestParam String writer, @RequestParam String header) {
        discussionTopicService.createDiscussionTopic(model, topic, writer, header);
        return "/discussionTopic";
    }
    
    // Tämä POST poistaa keskustelualueen
    @RequestMapping(value = "/delDiscussionTopic", method = RequestMethod.GET)
    public String deleteDiscussionTopic(@RequestParam Long discussionTopicId) {
        discussionTopicService.deleteDiscussionTopic(discussionTopicId);
        return "/discussionTopics";
    }
    
    // Tämä GET näyttää tietyn keskustelualueen tiedot
    @RequestMapping("/oneDiscussionTopic")
    public String getOneDiscussionTopic(Model model, @RequestParam Long discussionTopicId) {
       DiscussionTopic topic = discussionTopicService.getOneDiscussionTopic(model, discussionTopicId);
        getAllDiscussionsPerTopic(model, topic);
        return "/discussionsPerTopic";
    }
    
    // Tämä GET näyttää kaikki keskustelualueet
    @RequestMapping("/allDiscussionTopics")
    public String getAllDiscussionTopics(Model model) {
        discussionTopicService.getAllDiscussionTopics(model);
        return "/discussionTopics";
    }

    // Tämä GET näyttää kaikki tietyn keskustelualueen keskustelut
    @RequestMapping("/discussionsPerTopic")
    public String getAllDiscussionsPerTopic(Model model, DiscussionTopic discussionTopic) {
        discussionTopicService.findDiscussionsPerTopic(model, discussionTopic);      
        return "/discussionsPerTopic";
    }   
}