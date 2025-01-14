package com.dreammaster.scripts;

import static gregtech.api.enums.Mods.AdvancedSolarPanel;
import static gregtech.api.enums.Mods.IndustrialCraft2;
import static gregtech.api.enums.Mods.Minecraft;
import static gregtech.api.recipe.RecipeMaps.assemblerRecipes;
import static gregtech.api.util.GTModHandler.getModItem;
import static gregtech.api.util.GTRecipeBuilder.MINUTES;
import static gregtech.api.util.GTRecipeBuilder.SECONDS;

import java.util.Arrays;
import java.util.List;

import gregtech.api.enums.GTValues;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GTOreDictUnificator;

public class ScriptAdvancedSolarPanel implements IScriptLoader {

    @Override
    public String getScriptName() {
        return "Advanced Solar Panel";
    }

    @Override
    public List<String> getDependencies() {
        return Arrays.asList(AdvancedSolarPanel.ID, IndustrialCraft2.ID);
    }

    @Override
    public void loadRecipes() {

        // AUTOGENERATED

        addShapedRecipe(
                getModItem(AdvancedSolarPanel.ID, "advanced_solar_helmet", 1, 0, missing),
                "craftingToolWrench",
                ItemList.Machine_LV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "circuitAdvanced",
                getModItem(IndustrialCraft2.ID, "itemArmorNanoHelmet", 1, wildcard, missing),
                "circuitAdvanced",
                "cableGt04Aluminium",
                ItemList.Transformer_HV_MV.get(1L),
                "cableGt04Aluminium");
        addShapedRecipe(
                getModItem(AdvancedSolarPanel.ID, "hybrid_solar_helmet", 1, 0, missing),
                "craftingToolWrench",
                ItemList.Machine_MV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "circuitMaster",
                getModItem(IndustrialCraft2.ID, "itemArmorQuantumHelmet", 1, wildcard, missing),
                "circuitMaster",
                "cableGt04Platinum",
                ItemList.Transformer_EV_HV.get(1L),
                "cableGt04Platinum");
        addShapedRecipe(
                getModItem(AdvancedSolarPanel.ID, "ultimate_solar_helmet", 1, 0, missing),
                "craftingToolWrench",
                "circuitUltimate",
                "craftingToolScrewdriver",
                ItemList.Machine_HV_SolarPanel.get(1),
                getModItem(AdvancedSolarPanel.ID, "hybrid_solar_helmet", 1, wildcard, missing),
                ItemList.Machine_HV_SolarPanel.get(1),
                "cableGt04VanadiumGallium",
                ItemList.Transformer_IV_EV.get(1L),
                "cableGt04VanadiumGallium");
        addShapedRecipe(
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 4, 5, missing),
                "glassReinforced",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 2, missing),
                "glassReinforced",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 2, missing),
                "plateGlowstone",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 2, missing),
                "glassReinforced",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 2, missing),
                "glassReinforced");
        addShapedRecipe(
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 13, missing),
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 4, missing),
                "plateNetherStar",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 4, missing),
                "plateNetherStar",
                "circuitOptical",
                "plateNetherStar",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 4, missing),
                "plateNetherStar",
                getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 4, missing));
        addShapedRecipe(
                ItemList.Cover_SolarPanel_LV.get(1L),
                "craftingToolCrowbar",
                ItemList.Machine_LV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_MV.get(1L),
                "craftingToolCrowbar",
                ItemList.Machine_MV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_HV.get(1L),
                "craftingToolCrowbar",
                ItemList.Machine_HV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");
        addShapedRecipe(
                ItemList.Cover_SolarPanel_EV.get(1L),
                "craftingToolCrowbar",
                ItemList.Machine_EV_SolarPanel.get(1),
                "craftingToolScrewdriver",
                "craftingToolWrench",
                "craftingToolHardHammer",
                "craftingToolFile");

        GTValues.RA.stdBuilder()
                .itemInputs(
                        GTOreDictUnificator.get(OrePrefixes.ingot, Materials.Uranium, 1L),
                        getModItem(Minecraft.ID, "glowstone", 4, 0, missing))
                .itemOutputs(getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 2, missing))
                .duration(30 * SECONDS).eut(1920).addTo(assemblerRecipes);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 0, missing),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 8, 2, missing))
                .itemOutputs(getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 3, missing))
                .duration(1 * MINUTES).eut(7680).addTo(assemblerRecipes);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        GTOreDictUnificator.get(OrePrefixes.plate, Materials.Sunnarium, 4L),
                        getModItem(IndustrialCraft2.ID, "itemPartIridium", 8, 0, missing))
                .itemOutputs(getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 1, missing))
                .duration(40 * SECONDS).eut(30720).addTo(assemblerRecipes);
        GTValues.RA.stdBuilder()
                .itemInputs(
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 1, missing),
                        getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 8, 3, missing))
                .itemOutputs(getModItem(AdvancedSolarPanel.ID, "asp_crafting_items", 1, 4, missing))
                .duration(1 * MINUTES + 20 * SECONDS).eut(122880).addTo(assemblerRecipes);

    }
}
