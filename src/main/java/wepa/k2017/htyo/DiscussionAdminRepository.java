
package wepa.k2017.htyo;

import org.springframework.data.jpa.repository.JpaRepository;
import wepa.k2017.htyo.domain.Discussion_User;

/**
 *
 * @author THyyppä
 */

public interface DiscussionAdminRepository extends JpaRepository<Discussion_User, Long> {
}
