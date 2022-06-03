package net.cosmicparticl.mighty_mangoes;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class mighty_mangoes implements ModInitializer {


	public static final Block mangocrate = new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS));
	public static final Item mango = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(3).saturationModifier(0.1F).build()).group(ItemGroup.FOOD));
	public static final Item gildedmango = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(6).saturationModifier(0.1F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1400, 0), 1.0F).alwaysEdible().build()).group(ItemGroup.FOOD));
	public static final Item mangogelato = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(7).saturationModifier(1.0F).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 0), 1.0F).build()).group(ItemGroup.FOOD));

	@Override
	public void onInitialize() {


		Registry.register(Registry.BLOCK, new Identifier("mighty_mangoes", "mangocrate"), mangocrate);
		Registry.register(Registry.ITEM, new Identifier("mighty_mangoes", "mangocrate"), new BlockItem(mangocrate, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
		Registry.register(Registry.ITEM, new Identifier("mighty_mangoes", "mango"), mango);
		Registry.register(Registry.ITEM, new Identifier("mighty_mangoes", "gildedmango"), gildedmango);
		Registry.register(Registry.ITEM, new Identifier("mighty_mangoes", "mangogelato"), mangogelato);
		System.out.println("Mangoes are being made mighty... Please Wait Warmly");
		CompostingChanceRegistry.INSTANCE.add(mango, 0.65f);

	}


}
