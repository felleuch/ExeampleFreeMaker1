<@pp.dropOutputFile />
<#list events as event>
<@pp.changeOutputFile name=event.entityName+"Event.java" />
package org.zenithar.app.service.events;
ffff
import org.zenithar.app.service.events.AbstractEvent;
import org.zenithar.app.service.dto.${event.payloadType};

import org.springframework.context.ApplicationEvent;

public final class ${event.entityName}${event.name}Event extends AbstractEvent<${event.payloadType}> {
  private static final long serialVersionUID = 1L;

  public ${event.entityName}${event.name}Event(Object source, ${event.payloadType} payload) {
    super(source, payload);
  }
}
</#list>
