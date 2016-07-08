/**
* Name        : org.sixaxe.model.dao.NatureDAO.java
* Author      : FELLEUCH
*
* Description : DAO for Nature Details
*
*/
package org.sixaxe.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.sixaxe.model.mapper.NatureMapper;
import org.sixaxe.model.entity.Nature;

/**
* DAO for Nature Details
*
* @author FELLEUCH
*/
@Service
@Qualifier("natureDAO")
public class NatureDAO extends BaseDAO implements NatureMapper{

        /**
        * Nature MyBatis Mapper
        */
        private Class<NatureMapper> 	 mapperClazz = EmployeeMapper.class;






            @Override
            public List<Nature> getAllNature() {
                try {
                return super.getMapper(mapperClazz).getAllNature();
                } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
                }
                }

                @Override
                public List<Nature> getNatureByCode(Integer natureCode) {
                    try {
                    return super.getMapper(mapperClazz).getNatureByProjectId(projectId);
                    } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                    }
                    }





                                                @Override
                                                public int deleteByPrimaryKey(Integer nature_id) {
                                                try {
                                                return super.getMapper(mapperClazz).deleteByPrimaryKey(nature_id);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }



                                                @Override
                                                public int insert(Nature record) {
                                                try {
                                                int row = super.getMapper(mapperClazz).insert(record);
                                                try {
                                                Object identity = record.getnature_id();
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
                                                public int updateByPrimaryKey(Nature record) {
                                                try {
                                                return super.getMapper(mapperClazz).updateByPrimaryKey(record);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }
                                                }








