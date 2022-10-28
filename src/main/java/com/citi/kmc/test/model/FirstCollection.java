package com.citi.kmc.test.model;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity(noClassnameStored = true)
public class FirstCollection {
    @Id
    private String id;
    private LocalDateTime startTime;
    private String chromeId;
    private Long launchDuration;

    public FirstCollection() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public String getChromeId() {
        return chromeId;
    }

    public void setChromeId(String chromeId) {
        this.chromeId = chromeId;
    }

    public Long getLaunchDuration() {
        return launchDuration;
    }

    public void setLaunchDuration(Long launchDuration) {
        this.launchDuration = launchDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FirstCollection that = (FirstCollection) o;
        return Objects.equals(id, that.id) && Objects.equals(startTime, that.startTime) && Objects.equals(chromeId, that.chromeId) && Objects.equals(launchDuration, that.launchDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, chromeId, launchDuration);
    }


    @Override
    public String toString() {
        return "FirstCollection{"
                + "id=" + id
                + ", startTime=" + startTime
                + ", chromeId='" + chromeId + '\''
                + ", launchDuration=" + launchDuration
                + '}';
    }
}
