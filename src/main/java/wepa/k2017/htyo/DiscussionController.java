package wepa.k2017.htyo;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import org.h2.tools.RunScript;
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
import wepa.k2017.htyo.domain.DiscussionUser;

/**
 *
 * @author THyyppä
 */
@Controller
public class DiscussionController {
    
    @Autowired
    private DiscussionTopicService discussionTopicService;

    public DiscussionController() throws SQLException {
       
        //CREATE DB-OBJECTS
        Discussion discussion = new Discussion();
        DiscussionAdmin discussionAdmin = new DiscussionAdmin();
        DiscussionTopic discussionTopic = new DiscussionTopic();
        DiscussionTopicList discussionTopicList = new DiscussionTopicList();
        DiscussionList discussionList = new DiscussionList();
        DiscussionMessage discussionMessage = new DiscussionMessage();
        //DiscussionUser discussionUser = new DiscussionUser();
        
        //CREATE SERVICE-OBJECTS
        DiscussionLiService discussionLiService = new DiscussionLiService();
        DiscussionTopicService discussionTopicService = new DiscussionTopicService();
        MessageService messageService = new MessageService();
        //UserService userService = new UserService();
    }
    
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String discussionHome(Model model) {
        
        //discussionTopicService = new DiscussionTopicService();
        //discussionTopicService.getAllDiscussionTopics(model);
        return "/index";
    }
}
