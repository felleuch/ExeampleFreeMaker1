/**
* Name        : org.sixaxe.model.dao.DestinationDAO.java
* Author      : FELLEUCH
*
* Description : DAO for Destination Details
*
*/
package org.sixaxe.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.sixaxe.model.mapper.DestinationMapper;
import org.sixaxe.model.entity.Destination;

/**
* DAO for Destination Details
*
* @author FELLEUCH
*/
@Service
@Qualifier("destinationDAO")
public class DestinationDAO extends BaseDAO implements DestinationMapper{

        /**
        * Destination MyBatis Mapper
        */
        private Class<DestinationMapper> 	 mapperClazz = EmployeeMapper.class;






            @Override
            public List<Destination> getAllDestination() {
                try {
                return super.getMapper(mapperClazz).getAllDestination();
                } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
                }
                }

                @Override
                public List<Destination> getDestinationByCode(Integer destinationCode) {
                    try {
                    return super.getMapper(mapperClazz).getDestinationByProjectId(projectId);
                    } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                    }
                    }





                                                @Override
                                                public int deleteByPrimaryKey(Integer destination_id) {
                                                try {
                                                return super.getMapper(mapperClazz).deleteByPrimaryKey(destination_id);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }



                                                @Override
                                                public int insert(Destination record) {
                                                try {
                                                int row = super.getMapper(mapperClazz).insert(record);
                                                try {
                                                Object identity = record.getdestination_id();
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
                                                public int updateByPrimaryKey(Destination record) {
                                                try {
                                                return super.getMapper(mapperClazz).updateByPrimaryKey(record);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }
                                                }








