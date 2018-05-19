package com.another.protector.repository;

import com.another.protector.model.User;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * {@link User} {@link org.springframework.stereotype.Repository}
 *
 */
@Repository
public class UserRepository {

    /**
     * 采用内存型存储方式
     */
    private final ConcurrentMap<Integer, User> repository = new ConcurrentHashMap<>();

    private final static AtomicInteger idGenerator = new AtomicInteger();
    /**
     * 保存用户对象
     * @param user {@link User}
     * @return 如果保存成功，返回<code>true</code>,
     *                   否则，返回<code>false</code>
     */
    public boolean save(User user){
        boolean success = false;

        //ID从1开始
        Integer id = idGenerator.incrementAndGet();
        //设置ID
        user.setId(id);
        return repository.put(id, user) == null;

//        return success;
    }

}
