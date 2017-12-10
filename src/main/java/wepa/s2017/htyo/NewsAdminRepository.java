
package wepa.k2017.htyo;

import org.springframework.data.jpa.repository.JpaRepository;
import wepa.k2017.htyo.domain.DiscussionUser;

/**
 *
 * @author THyyppä
 */

public interface DiscussionAdminRepository extends JpaRepository<DiscussionUser, Long> {
}
