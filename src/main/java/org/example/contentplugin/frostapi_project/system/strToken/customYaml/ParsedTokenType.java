package org.example.contentplugin.frostapi_project.system.strToken.customYaml;

import java.util.HashMap;
import java.util.Map;

public enum ParsedTokenType {
    DAMAGE("damage"),
    VAR("var"),
    RADIUS("rad"),
    SPEED("spd"),
    VALUE("val");

    private String type;
    ParsedTokenType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    private static Map<String, ParsedTokenType> BY_STRING = new HashMap<>();

    static{
        for(ParsedTokenType t : values()){
            BY_STRING.put(t.type, t);
        }
    }
    public ParsedTokenType search(String type){
        return BY_STRING.get(type);
    }

}
