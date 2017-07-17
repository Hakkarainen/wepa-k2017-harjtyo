
package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.Discussion;
import wepa.k2017.htyo.domain.DiscussionTopic;
import wepa.k2017.htyo.domain.DiscussionMessage;
import wepa.k2017.htyo.domain.DiscussionUser;

/**
 *
 * @author THyyppä
 */
@Service
public class DiscussionAdminService {
        
    @Autowired
    private DiscussionAdminRepository discussionAdminRepository;
    @Autowired
    private DiscussionLiRepository discussionLiRepository;
    @Autowired
    private DiscussionTopicRepository discussionTopicRepository;
    @Autowired
    private DiscussionMessageRepository discussionMessageRepository;
    @Autowired
    private DiscussionUserRepository discussionUserRepository;

    // käytetyt oliot
    private Discussion discussion;
    private DiscussionTopic discussionTopic;
    private DiscussionMessage discussionMessage;
    private DiscussionUser discussionUser;
    
    //******** Discussion Database initialization ********
    //Amount of persistent objects to be created into DiscussionDB
    Integer numberOfDiscussions = 3;
    Integer numberOfDiscussionTopics = 5;
    Integer numberOfMessages = 3;
    Integer numberOfUsers = 3;

    public String initDiscussionDB(Model model) {
        
        for (Integer i = 1; i <= numberOfDiscussions; i++) {
            //2, 1, 'Otsikko_a'
            this.createDiscussion(model,2,1,"aihe_1."  + Integer.toString(i));
            this.createDiscussion(model,3,1,"aihe_2."  + Integer.toString(i));
            this.createDiscussion(model,1,2,"aihe_3."  + Integer.toString(i));
        }
        for (Integer i = 1; i <= numberOfDiscussionTopics; i++) {
            this.createDiscussionTopic(model,i, "kirjoittaja" + Integer.toString(i), "keskustelualue" + Integer.toString(i));
            this.createDiscussionTopic(model,i, "kirjoittaja" + Integer.toString(i), "keskustelualue" + Integer.toString(i));
            this.createDiscussionTopic(model,i, "kirjoittaja" + Integer.toString(i), "keskustelualue" + Integer.toString(i));
        }
        for (Integer i = 1; i <= numberOfMessages; i++) {
            this.createMessage(model,"kirjoittaja" + Integer.toString(i), "sisalto" + Integer.toString(i));
            this.createMessage(model,"kirjoittaja" + Integer.toString(i), "sisalto" + Integer.toString(i));
            this.createMessage(model,"kirjoittaja" + Integer.toString(i), "sisalto" + Integer.toString(i));
        }
        for (Integer i = 1; i <= numberOfUsers; i++) {
            this.createUser(model,"kirjoittaja" + Integer.toString(i));
            this.createUser(model,"kirjoittaja" + Integer.toString(i));
            this.createUser(model,"kirjoittaja" + Integer.toString(i));
        }

        this.getAllDiscussions(model);
        this.getAllDiscussionTopics(model);
        this.getAllMessages(model);
        this.getAllUsers(model);
        return "adminsIndex";
    }
    
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
        discussionLiRepository.save(discussion); //UPDATE/WRITE
        model.addAttribute("discussion", discussionLiRepository.findOne(discussionId));
    }

    public void getAllDiscussions(Model model) {
        model.addAttribute("discussions", discussionLiRepository.findAll());
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

    public void getOneDiscussionTopic(Model model, Long discussionTopicId) {
        //discussionTopic = discussionTopicRepository.findOne(discussionTopicId);
        //Do update here !
        //discussionTopicRepository.save(discussionTopic); //UPDATE/WRITE
        model.addAttribute("discussionTopic", discussionTopicRepository.findOne(discussionTopicId));
    }

    public void getAllDiscussionTopics(Model model) {
        model.addAttribute("discussionTopics", discussionTopicRepository.findAll());
    }

    //Messages
    public void createMessage(Model model, String writer, String content) {
        discussionMessage = new DiscussionMessage(writer, content); //CREATE
        discussionMessageRepository.save(discussionMessage);
        model.addAttribute("message", discussionMessage);
    }

    public void deleteMessage(Long discussionMessageId) {
        discussionMessageRepository.delete(discussionMessageId);
    }

    public void getOneMessage(Model model, Long discussionMessageId) {
        //discussionMessage = discussionMessageRepository.findOne(discussionMessageId);
        //Do update here !
        //discussionRepository.save(discussionMessage); //UPDATE/WRITE
        model.addAttribute("message", discussionMessageRepository.findOne(discussionMessageId));
    }

    public void getAllMessages(Model model) {
        model.addAttribute("messages", discussionMessageRepository.findAll());
    }
    
    //Users
    public void createUser(Model model, String name) {
       discussionUser = new DiscussionUser(name); //CREATE
       discussionUserRepository.save(discussionUser);
       model.addAttribute("user", discussionUser);
    }

    public void deleteUser(Long discussionUserId) {
        discussionUserRepository.delete(discussionUserId);
    }

    public void getOneUser(Model model, Long discussionUserId) {
       //discussionUser = discussionUserRepository.findOne(discussionUserId);
        //Do update here !
        //discussionRepository.save(discussionUser); //UPDATE/WRITE
        model.addAttribute("user", discussionUserRepository.findOne(discussionUserId));
    }

    public void getAllUsers(Model model) {
        model.addAttribute("users", discussionUserRepository.findAll());
    }
}
