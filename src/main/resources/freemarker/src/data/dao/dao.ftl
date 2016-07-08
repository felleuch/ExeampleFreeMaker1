<@pp.dropOutputFile />
<#list events as event>
    <@pp.changeOutputFile name=event.entityName+"Dao.java" />
/**
* Name        : org.sixaxe.model.dao.${event.entityName}DAO.java
* Author      : FELLEUCH
*
* Description : DAO for ${event.entityName} Details
*
*/
package org.sixaxe.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.sixaxe.model.mapper.${event.entityName}Mapper;
import org.sixaxe.model.entity.${event.entityName};

/**
* DAO for ${event.entityName} Details
*
* @author FELLEUCH
*/
@Service
@Qualifier("${event.name}DAO")
public class ${event.entityName}DAO extends BaseDAO implements ${event.entityName}Mapper{

        /**
        * ${event.entityName} MyBatis Mapper
        */
        private Class<${event.entityName}Mapper> 	 mapperClazz = EmployeeMapper.class;






            @Override
            public List<${event.entityName}> getAll${event.entityName}() {
                try {
                return super.getMapper(mapperClazz).getAll${event.entityName}();
                } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
                }
                }

                @Override
                public List<${event.entityName}> get${event.entityName}ByCode(Integer ${event.name}Code) {
                    try {
                    return super.getMapper(mapperClazz).get${event.entityName}ByProjectId(projectId);
                    } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                    }
                    }





                                                @Override
                                                public int deleteByPrimaryKey(Integer ${event.name}_id) {
                                                try {
                                                return super.getMapper(mapperClazz).deleteByPrimaryKey(${event.name}_id);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }



                                                @Override
                                                public int insert(${event.entityName} record) {
                                                try {
                                                int row = super.getMapper(mapperClazz).insert(record);
                                                try {
                                                Object identity = record.get${event.name}_id();
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
                                                public int updateByPrimaryKey(${event.entityName} record) {
                                                try {
                                                return super.getMapper(mapperClazz).updateByPrimaryKey(record);
                                                } catch (Exception e) {
                                                throw new RuntimeException(e.getMessage());
                                                }
                                                }
                                                }








</#list>