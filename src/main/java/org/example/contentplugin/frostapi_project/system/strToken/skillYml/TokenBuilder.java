package org.example.contentplugin.frostapi_project.system.strToken.skillYml;

import java.util.ArrayList;
import java.util.List;

public class TokenBuilder {
    private final String input;
    private int pos = 0;

    public TokenBuilder(String input){
        this.input = input;
    }

    public List<CustomToken> tokenize(){
        List<CustomToken> tokens = new ArrayList<>();
        char c = input.charAt(pos);
        while(pos < input.length()){
            if(Character.isWhitespace(c)){
                pos++;
                continue;
            }

            if(Character.isDigit(c)){
                tokens.add(number());
                continue;
            }

            if (Character.isLetter(c) || c == '@' || c == '?'){
                tokens.add(identifier());
                continue;
            }

            if (c == '"' || c == '\'') {
                tokens.add(string());
                continue;
            }

            tokens.add(new CustomToken(TokenTemp.SYMBOL, String.valueOf(c)));
        }
        tokens.add(new CustomToken(TokenTemp.EOF, ""));
        return tokens;
    }

    private CustomToken identifier(){
        StringBuilder sb = new StringBuilder();

        while (pos < input.length()) {
            char c = input.charAt(pos);
            if (Character.isLetterOrDigit(c) || c == '@' || c == '?' || c == '_') {
                sb.append(c);
                pos++;
            } else break;
        }

        return new CustomToken(TokenTemp.IDENTIFIER, sb.toString());
    }

    private CustomToken number(){
        StringBuilder sb = new StringBuilder();

        while (pos < input.length()) {
            char c = input.charAt(pos);
            if (Character.isDigit(c) || c == '.') {
                sb.append(c);
                pos++;
            } else break;
        }

        return new CustomToken(TokenTemp.NUMBER, sb.toString());
    }

    private CustomToken string(){
        char quote = input.charAt(pos);
        pos++;

        StringBuilder sb = new StringBuilder();

        while (pos < input.length()) {
            char c = input.charAt(pos);

            if (c == quote) {
                pos++;
                break;
            }

            if (c == '\\') {
                pos++;
                if (pos < input.length()) {
                    char next = input.charAt(pos);
                    sb.append(next);
                    pos++;
                }
                continue;
            }

            sb.append(c);
            pos++;
        }

        return new CustomToken(TokenTemp.STRING, sb.toString());
    }
}
