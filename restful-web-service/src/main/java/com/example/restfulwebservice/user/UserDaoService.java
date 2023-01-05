package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * UserDatService.java
 * Class 설명을 작성하세요.
 *
 * @author danusys
 * @since 2023.01.04
 */
@Service
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 3;

    static {
        users.add(new User(1, "Woogie1", new Date(), "11", "701010-111111"));
        users.add(new User(2, "Woogie2", new Date(), "11", "801010-211111"));
        users.add(new User(3, "Woogie3", new Date(), "11", "901010-111111"));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if(user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user : users) {
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();

            if(user.getId() == id){
                iterator.remove();
                return user;
            }
        }

        return null;
    }

}
