
/**
* Name        : org.sixaxe.service.IUserService.java
* Author      : FELLEUCH
*
* Description : Interface for User Service
*/
package org.sixaxe.service;

import java.util.List;

/**
* Interface for User Service
*
* @author FELLEUCH
*/
public interface IUserService {


    /**
    * Get All User
    *
    * @return
    */
    public List<User> getAllUser();



    /**
    * Delete User
    *
    * @return
    */
public int deleteByPrimaryKey(Integer user_id);


}

