package model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * @author lipeng
 * @date 2020-02-18 23:29
 * @description
 **/
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class GenConfig {
    private String srcPath;
    private String desPath;

    public String getSrcPath() {
        return srcPath;
    }

    public void setSrcPath(String srcPath) {
        this.srcPath = srcPath;
    }

    public String getDesPath() {
        return desPath;
    }

    public void setDesPath(String desPath) {
        this.desPath = desPath;
    }
}
