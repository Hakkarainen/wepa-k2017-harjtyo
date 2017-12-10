
package wepa.k2017.htyo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wepa.k2017.htyo.domain.DiscussionTopic;
/**
 *
 * @author THyyppä
 */

public interface DiscussionTopicRepository extends JpaRepository<DiscussionTopic, Long> {
    List<DiscussionTopic> findByHeader(String header);
//    //@Query("SELECT * FROM DiscussionTopicList ORDER BY latest DESC")
//    @Query("SELECT * FROM DiscussionTopicList")
//    DiscussionTopic findDiscussionsInOrder();
}
