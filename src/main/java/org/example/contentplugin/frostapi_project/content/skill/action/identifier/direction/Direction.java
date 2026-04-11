package org.example.contentplugin.frostapi_project.content.skill.action.identifier.direction;

import org.example.contentplugin.frostapi_project.content.skill.action.Outer;
import org.example.contentplugin.frostapi_project.system.strToken.skillYml.CustomToken;

public class Direction implements Outer {
    private String[] tokens;

    private String direction;

    private double weight;

    public Direction(String[] tokens){
        this.tokens = tokens;
    }


}
