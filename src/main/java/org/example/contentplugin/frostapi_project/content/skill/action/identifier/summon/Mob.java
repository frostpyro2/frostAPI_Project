package org.example.contentplugin.frostapi_project.content.skill.action.identifier.summon;

import org.bukkit.entity.Entity;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.example.contentplugin.frostapi_project.content.entity.StatProvider;
import org.example.contentplugin.frostapi_project.content.skill.action.Inner;

import java.util.Map;

public class Mob implements Inner {
    private Entity target;

    private EquipmentSlot slot;

    private Map<EquipmentSlot, ItemStack> holding;

    private StatProvider uploaded;

    private String[] tokens;

    public Mob(String[] tokens){
        this.tokens = tokens;
    }



    public Map<EquipmentSlot, ItemStack> getHolding(){
        return holding;
    }

    private void setHolding(){
        for(String token : tokens){

        }
    }
}
