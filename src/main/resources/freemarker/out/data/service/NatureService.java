
/**
* Name        : org.sixaxe.service.INatureService.java
* Author      : FELLEUCH
*
* Description : Interface for Nature Service
*/
package org.sixaxe.service;

import java.util.List;

/**
* Interface for Nature Service
*
* @author FELLEUCH
*/
public interface INatureService {


    /**
    * Get All Nature
    *
    * @return
    */
    public List<Nature> getAllNature();



    /**
    * Delete Nature
    *
    * @return
    */
public int deleteByPrimaryKey(Integer nature_id);


}

