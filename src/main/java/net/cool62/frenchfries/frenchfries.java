package net.cool62.frenchfries;

import net.cool62.frenchfries.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod("frenchfries")
public class frenchfries {

    public frenchfries() {
        //  Get the mod-specific event bus
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        //  Register a method to the mod event bus (minimum requirement to load)
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::addCreative);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.FRENCH_FRIES);
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Minimum necessary code to prevent crash/log warning
    }
}
