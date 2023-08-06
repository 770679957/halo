package run.halo.app.extension.store;

import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserHistoryCrudRepository extends ReactiveCrudRepository<UserHistory,Long> {


    /**
     * @Param("userHistory") 给对象参数设置别名叫userHistory,在sql中获取数据的时候要通过:#{#userHistory.ip}的方式来获取指定的属性, 其中userHistory就是别名, ip是属性名
     * 这里不能进行参数判断,所以在更新前我们需要先查询数据,然后将需要更新的内容设置到对象上面,再进行更新
     * @param userHistory
     * @return
     */
    @Modifying//声明为当前方法是更新方法
    // @Query("UPDATE `user` set name=:#{#user.name},  age=:#{#user.age},address=:#{#user.address},birth_day=:#{#user.birthDay} WHERE uid=:#{#user.uid}")
    @Query("INSERT INTO user_history (ip, page_url, visit_time) VALUES (:#{#user.ip}, :#{#user.pageUrl}, now());")
    Mono<Integer> saveUserHistory(@Param("userHistory") UserHistory userHistory);


}
