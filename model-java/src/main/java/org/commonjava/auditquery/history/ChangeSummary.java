/**
 * Copyright (C) 2013~2019 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.commonjava.auditquery.history;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class ChangeSummary
{
    @JsonProperty
    private String eventId;

    @JsonProperty
    private String user;

    @JsonProperty
    private Date changeTime;

    @JsonProperty
    private String summary;

    public ChangeSummary()
    {
    }

    public ChangeSummary( String eventId, String user, Date changeTime, String summary )
    {
        this.eventId = eventId;
        this.user = user;
        this.changeTime = changeTime;
        this.summary = summary;
    }

    public String getEventId()
    {
        return eventId;
    }

    public ChangeSummary eventId( String eventId )
    {
        this.eventId = eventId;
        return this;
    }

    public String getUser()
    {
        return user;
    }

    public ChangeSummary user( String user )
    {
        this.user = user;
        return this;
    }

    public Date getChangeTime()
    {
        return changeTime;
    }

    public ChangeSummary changeTime( Date changeTime )
    {
        this.changeTime = changeTime;
        return this;
    }

    public String getSummary()
    {
        return summary;
    }

    public ChangeSummary summary( String summary )
    {
        this.summary = summary;
        return this;
    }
}
