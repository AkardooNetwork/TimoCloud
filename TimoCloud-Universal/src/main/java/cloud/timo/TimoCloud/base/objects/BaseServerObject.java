package cloud.timo.TimoCloud.base.objects;

import java.util.Map;

public class BaseServerObject {
    private String name;
    private String id;
    private String group;
    private int ram;
    private boolean isStatic;
    private String map;
    private Map<String, Object> templateHash;
    private Map<String, Object> mapHash;
    private Map<String, Object> globalHash;

    public BaseServerObject(String name, String id, int ram, boolean isStatic, String map, String group, Map<String, Object> templateHash, Map<String, Object> mapHash, Map<String, Object> globalHash) {
        this.name = name;
        this.id = id.replace("$", "_");
        this.group = group;
        this.ram = ram;
        this.isStatic = isStatic;
        this.map = map;
        this.templateHash = templateHash;
        this.mapHash = mapHash;
        this.globalHash = globalHash;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public int getRam() {
        return ram;
    }

    public boolean isStatic() {
        return isStatic;
    }

    public String getMap() {
        return map;
    }

    public Map<String, Object> getTemplateHash() {
        return templateHash;
    }

    public Map<String, Object> getMapHash() {
        return mapHash;
    }

    public Map<String, Object> getGlobalHash() {
        return globalHash;
    }
}
