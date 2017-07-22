package wepa.k2017.htyo.domain;

/**
 *
 * @author THyyppä
 */
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.data.jpa.domain.AbstractPersistable;


@Entity
@Table(name = "Discussion_User")
public class Discussion_User extends AbstractPersistable<Long> {
    
    @Column(name = "user_Name")
    private String user_Name;
    @Column(name = "password")
    private String password;
    
    
    @OneToMany
    private List<DiscussionTopic> discussionTopics;
    
    @OneToMany
    private List<Discussion> discussions;
    
//    @OneToMany
//    private List<DiscussionMessage> messages;
    
      
    public Discussion_User() {
    }

    public Discussion_User(String user_Name) {
        this.user_Name = user_Name;
        this.password = "";
    }
    
        public Discussion_User(String user_Name, String password) {
        this.user_Name = user_Name;
        this.password = password;
    }
    public String getUserName() {
        return user_Name;
    }    
    public List<DiscussionTopic> getDiscussionsTopics() {
        if (this.discussionTopics == null) {
            this.discussionTopics = new ArrayList<>();
        }
        return this.discussionTopics;
    }
    public List<Discussion> getDiscussions() {
        if (this.discussions == null) {
            this.discussions = new ArrayList<>();
        }
        return this.discussions;
    }
//    
//        public List<DiscussionMessage> getMessages() {
//        if (this.messages == null) {
//            this.messages = new ArrayList<>();
//        }
//
//        return this.messages;
//    }
    
}
