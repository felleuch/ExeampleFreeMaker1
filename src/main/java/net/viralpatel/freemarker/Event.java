package net.viralpatel.freemarker;

/**
 * Created by felleuch on 05/07/2016.
 */
public class Event {

    public String name;

    public String entityName;


    public String payloadType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }
}
