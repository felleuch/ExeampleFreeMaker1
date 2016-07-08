<@pp.dropOutputFile />
<#list events as event>
    <@pp.changeOutputFile name=event.entityName+"Service.java" />

/**
* Name        : org.sixaxe.service.I${event.entityName}Service.java
* Author      : FELLEUCH
*
* Description : Interface for ${event.entityName} Service
*/
package org.sixaxe.service;

import java.util.List;

/**
* Interface for ${event.entityName} Service
*
* @author FELLEUCH
*/
public interface I${event.entityName}Service {


    /**
    * Get All ${event.entityName}
    *
    * @return
    */
    public List<${event.entityName}> getAll${event.entityName}();



    /**
    * Delete ${event.entityName}
    *
    * @return
    */
public int deleteByPrimaryKey(Integer ${event.name}_id);


}

</#list>