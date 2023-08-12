package run.halo.app.theme.router.factories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("user_history")
public class UserHistory implements Serializable {
    @Id
    private int id;

    private String ip;
    private String pageUrl;
    private LocalDateTime visitTime;

    boolean hasId() {
        return id != 0;
    }

}
