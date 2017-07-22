package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import wepa.k2017.htyo.domain.Discussion;
import wepa.k2017.htyo.domain.DiscussionAdmin;
import wepa.k2017.htyo.domain.DiscussionList;
import wepa.k2017.htyo.domain.DiscussionMessage;
import wepa.k2017.htyo.domain.DiscussionTopic;
import wepa.k2017.htyo.domain.DiscussionTopicList;
import wepa.k2017.htyo.domain.Discussion_User;

/**
 *
 * @author THyyppä
 */
@Controller
public class DiscussionController {
    
    @Autowired
    private DiscussionTopicService discussionTopicService;

    public DiscussionController(){
       
        //CREATE DB-OBJECTS
        Discussion discussion = new Discussion();
        DiscussionAdmin discussionAdmin = new DiscussionAdmin();
        DiscussionTopic discussionTopic = new DiscussionTopic();
        DiscussionTopicList discussionTopicList = new DiscussionTopicList();
        DiscussionList discussionList = new DiscussionList();
        DiscussionMessage discussionMessage = new DiscussionMessage();
        Discussion_User discussion_User = new Discussion_User();
        
        //CREATE SERVICE-OBJECTS
        DiscussionLiService discussionLiService = new DiscussionLiService();
        DiscussionTopicService discussionTopicService = new DiscussionTopicService();
        MessageService messageService = new MessageService();
        UserService userService = new UserService();
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String discussionHome(Model model) {
        discussionTopicService.getAllDiscussionTopics(model);
        return "/index";
    }
}
