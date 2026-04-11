package org.example.contentplugin.frostapi_project.content.skill.action.string;

import org.example.contentplugin.frostapi_project.content.skill.action.Inner;

public class OutPutString implements Inner {
    private String[] tokens;
    private String output;
    public OutPutString(String[] token){
        this.tokens = token;
    }

    public String getOutput(){
        return output;
    }
}
