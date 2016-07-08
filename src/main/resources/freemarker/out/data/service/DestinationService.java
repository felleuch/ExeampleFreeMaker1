
/**
* Name        : org.sixaxe.service.IDestinationService.java
* Author      : FELLEUCH
*
* Description : Interface for Destination Service
*/
package org.sixaxe.service;

import java.util.List;

/**
* Interface for Destination Service
*
* @author FELLEUCH
*/
public interface IDestinationService {


    /**
    * Get All Destination
    *
    * @return
    */
    public List<Destination> getAllDestination();



    /**
    * Delete Destination
    *
    * @return
    */
public int deleteByPrimaryKey(Integer destination_id);


}

