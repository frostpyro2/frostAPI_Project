package org.example.contentplugin.frostapi_project.system.strToken.skillYml;


import org.example.contentplugin.frostapi_project.system.strToken.Token;

public class CustomToken implements Token {
    private TokenTemp tmp;
    private String str;

    public CustomToken(TokenTemp tmp, String str){
        this.tmp = tmp;
        this.str = str;
    }

    public TokenTemp getType(){
        return tmp;
    }

    public String token(){
        return str;
    }
}
