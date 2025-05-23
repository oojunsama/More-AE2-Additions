package com.easterfg.mae2a.datagen.providers.models;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;

import com.easterfg.mae2a.MoreAE2Additions;
import com.easterfg.mae2a.api.definition.ItemDefinition;
import com.easterfg.mae2a.common.definition.MAE2AItems;

/**
 * @author EasterFG on 2025/4/2
 */
@SuppressWarnings("UnusedReturnValue")
public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreAE2Additions.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        flatSingleLayer(MAE2AItems.PACKAGES_ITEM, "item/item_package");
        flatSingleLayer(MAE2AItems.PATTERN_MODIFY_TOOL, "item/pattern_modify_tool");
        flatSingleLayer(MAE2AItems.INFINITE_DYES_CELL, "item/infinite_dyes_cell");
        flatSingleLayer(MAE2AItems.FAKE_CRAFT_CARD, "item/fake_crafting_card");
        flatSingleLayer(MAE2AItems.PATTERN_REFILL_CARD, "item/pattern_refill_card");

        flatSingleLayer(MAE2AItems.CABLE_PLACE_TOOL, "item/cable_place_tools");
        flatSingleLayer(MAE2AItems.PATTERN_PROVIDER_UPGRADE, "item/pattern_provider_upgrade");
    }

    private ItemModelBuilder flatSingleLayer(ItemDefinition<?> item, String texture) {
        String id = item.id().getPath();
        return singleTexture(
                id,
                mcLoc("item/generated"),
                "layer0",
                MoreAE2Additions.id(texture));
    }
}
