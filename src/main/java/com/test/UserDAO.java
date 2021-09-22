package com.test;

import lombok.Data;

/**
 * @author: zhiyang
 * @description: 用户
 * @create: 2021-09-20 18:49
 **/

@Data
public class UserDAO {
    String name;
    Long id;

    Long getIdByName(String name){
        return this.id;
    }

    void create(UserDO userDO){

    }

    void modify(UserDO userDO){

    }
}
