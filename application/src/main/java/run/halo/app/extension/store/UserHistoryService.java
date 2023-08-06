package run.halo.app.extension.store;

import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserHistoryService {
    //添加用户
    Mono<Integer> saveUserInfo(UserHistory userHistory);
}
