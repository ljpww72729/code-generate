package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author lipeng
 * @date 2020-02-19 00:23
 * @description
 **/
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ReplaceConfig {
    private String oldString;
    private String newString;

    public String getOldString() {
        return oldString;
    }

    public void setOldString(String oldString) {
        this.oldString = oldString;
    }

    public String getNewString() {
        return newString;
    }

    public void setNewString(String newString) {
        this.newString = newString;
    }
}
