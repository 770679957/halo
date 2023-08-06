package run.halo.app.extension.store;

import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Table;
import java.time.LocalDateTime;
@Data
@Table(name = "user_history")
public class UserHistory {
    @Id
    private Integer id;
    private String ip;
    private String pageUrl;
    private LocalDateTime visitTime;
}