/**
* Name        : org.sixaxe.model.dao.UserDAO.java
* Author      : FELLEUCH
*
* Description : DAO for User Details
*
*/
package org.sixaxe.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.sixaxe.model.mapper.UserMapper;
import org.sixaxe.model.entity.User;

/**
* DAO for User Details
*
* @author FELLEUCH
*/
@Service
@Qualifier("userDAO")
public class UserDAO extends BaseDAO implements UserMapper{

        /**
        * User MyBatis Mapper
        */
        private Class<UserMapper> 	 mapperClazz = EmployeeMapper.class;






            @Override
            public List<User> getAllUser() {
                try {
                return super.getMapper(mapperClazz).getAllUser();
                } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
                }
                }

                @Override
                public List<User> getUserByCode(Integer userCode) {
                    try {
                    return super.getMapper(mapperClazz).getUserByProjectId(projectId);
                    } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                    }
                    }





                                                @Override
                                                public int deleteByPrimaryKey(Integer user_id) {
                                                try {
                                                return super.getMapper(mapperClazz).deleteByPrimaryKey(user_id);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }



                                                @Override
                                                public int insert(User record) {
                                                try {
                                                int row = super.getMapper(mapperClazz).insert(record);
                                                try {
                                                Object identity = record.getuser_id();
                                                if (identity == null) {
                                                return row;
                                                } else {
                                                return (Integer) identity;
                                                }
                                                } catch (Exception e) {
                                                return -1;
                                                }
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }




                                                @Override
                                                public int updateByPrimaryKey(User record) {
                                                try {
                                                return super.getMapper(mapperClazz).updateByPrimaryKey(record);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }
                                                }








