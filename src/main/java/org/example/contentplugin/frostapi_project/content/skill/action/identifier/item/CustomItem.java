package org.example.contentplugin.frostapi_project.content.skill.action.identifier.item;

import org.bukkit.inventory.ItemStack;
import org.example.contentplugin.frostapi_project.content.skill.action.Inner;

public class CustomItem implements Inner {
    private ItemStack stack;

    private String[] tokens;
    public CustomItem(String[] tokens){
        this.tokens = tokens;
    }


    private void setItem(){
        for(String token : tokens){

        }
    }
}
