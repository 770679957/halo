package run.halo.app.extension.store;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class UserHistoryServiceImpl implements UserHistoryService {

    private UserHistoryCrudRepository userHistoryCrudRepository;

    @Autowired
    public void setUserReactiveCrudRepository(UserHistoryCrudRepository userHistoryCrudRepository) {
        this.userHistoryCrudRepository = userHistoryCrudRepository;
    }

    @Override
    public Mono<Integer> saveUserInfo(UserHistory userHistory) {
        return userHistoryCrudRepository.saveUserHistory(userHistory);
    }
}

