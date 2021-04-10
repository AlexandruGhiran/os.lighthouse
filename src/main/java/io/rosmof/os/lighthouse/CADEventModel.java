/*
 * La la la
 */
package io.rosmof.os.lighthouse;

/**
 * <p>
 * The model that CAD uses to inform us about events
 * </p>
 */
public class CADEventModel {
    private String id;
    private String name;
    private String other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
