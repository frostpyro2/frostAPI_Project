package org.example.contentplugin.frostapi_project.content.skill.action.identifier.direction;

import org.example.contentplugin.frostapi_project.content.skill.action.Outer;
import org.example.contentplugin.frostapi_project.system.strToken.skillYml.CustomToken;

public class Direction implements Outer {
    private CustomToken input;

    public Direction(CustomToken input){
        this.input = input;
    }


}
