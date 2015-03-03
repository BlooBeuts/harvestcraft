package com.pam.harvestcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import com.mrcrayfish.furniture.api.IRecipeRegistry;
import com.mrcrayfish.furniture.api.RecipeVariables;

public class CrayfishCompatibility 
{
	public static void registerRecipes(IRecipeRegistry registry)
    {
		//OVEN
		RecipeVariables bread = new RecipeVariables();
		bread.addValue("input", new ItemStack(ItemRegistry.doughItem));
		bread.addValue("output", new ItemStack(Items.bread));
        registry.registerRecipe("oven", bread);
        
        RecipeVariables toast = new RecipeVariables();
        toast.addValue("input", new ItemStack(Items.bread));
        toast.addValue("output", new ItemStack(ItemRegistry.toastItem));
        registry.registerRecipe("oven", toast);
        
        RecipeVariables roastedpumpkinseeds = new RecipeVariables();
        roastedpumpkinseeds.addValue("input", new ItemStack(Items.pumpkin_seeds));
        roastedpumpkinseeds.addValue("output", new ItemStack(ItemRegistry.roastedpumpkinseedsItem));
        registry.registerRecipe("oven", roastedpumpkinseeds);
        
        RecipeVariables grilledmushroomred = new RecipeVariables();
        grilledmushroomred.addValue("input", new ItemStack(Blocks.red_mushroom));
        grilledmushroomred.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("oven", grilledmushroomred);
        
        RecipeVariables grilledmushroombrown = new RecipeVariables();
        grilledmushroombrown.addValue("input", new ItemStack(Blocks.brown_mushroom));
        grilledmushroombrown.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("oven", grilledmushroombrown);
        
        RecipeVariables mutton = new RecipeVariables();
        mutton.addValue("input", new ItemStack(ItemRegistry.muttonrawItem));
        mutton.addValue("output", new ItemStack(ItemRegistry.muttoncookedItem));
        registry.registerRecipe("oven", mutton);
        
        RecipeVariables calamari = new RecipeVariables();
        calamari.addValue("input", new ItemStack(ItemRegistry.calamarirawItem));
        calamari.addValue("output", new ItemStack(ItemRegistry.calamaricookedItem));
        registry.registerRecipe("oven", calamari);
        
        RecipeVariables grilledasparagus = new RecipeVariables();
        grilledasparagus.addValue("input", new ItemStack(ItemRegistry.asparagusItem));
        grilledasparagus.addValue("output", new ItemStack(ItemRegistry.grilledasparagusItem));
        registry.registerRecipe("oven", grilledasparagus);
        
        RecipeVariables ricecake = new RecipeVariables();
        ricecake.addValue("input", new ItemStack(ItemRegistry.riceItem));
        ricecake.addValue("output", new ItemStack(ItemRegistry.ricecakeItem));
        registry.registerRecipe("oven", ricecake);
        
        RecipeVariables tea = new RecipeVariables();
        tea.addValue("input", new ItemStack(ItemRegistry.tealeafItem));
        tea.addValue("output", new ItemStack(ItemRegistry.teaItem));
        registry.registerRecipe("oven", tea);
        
        RecipeVariables popcorn = new RecipeVariables();
        popcorn.addValue("input", new ItemStack(ItemRegistry.cornItem));
        popcorn.addValue("output", new ItemStack(ItemRegistry.popcornItem));
        registry.registerRecipe("oven", popcorn);
        
        RecipeVariables bakedsweetpotato = new RecipeVariables();
        bakedsweetpotato.addValue("input", new ItemStack(ItemRegistry.sweetpotatoItem));
        bakedsweetpotato.addValue("output", new ItemStack(ItemRegistry.bakedsweetpotatoItem));
        registry.registerRecipe("oven", bakedsweetpotato);
        
        RecipeVariables coffee = new RecipeVariables();
        coffee.addValue("input", new ItemStack(ItemRegistry.coffeebeanItem));
        coffee.addValue("output", new ItemStack(ItemRegistry.coffeeItem));
        registry.registerRecipe("oven", coffee);
        
        RecipeVariables grilledeggplant = new RecipeVariables();
        grilledeggplant.addValue("input", new ItemStack(ItemRegistry.eggplantItem));
        grilledeggplant.addValue("output", new ItemStack(ItemRegistry.grilledeggplantItem));
        registry.registerRecipe("oven", grilledeggplant);
        
        RecipeVariables raisins = new RecipeVariables();
        raisins.addValue("input", new ItemStack(ItemRegistry.grapeItem));
        raisins.addValue("output", new ItemStack(ItemRegistry.raisinsItem));
        registry.registerRecipe("oven", raisins);
        
        RecipeVariables grilledmushroom = new RecipeVariables();
        grilledmushroom.addValue("input", new ItemStack(ItemRegistry.whitemushroomItem));
        grilledmushroom.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("oven", grilledmushroom);
        
        RecipeVariables toastedcoconut = new RecipeVariables();
        toastedcoconut.addValue("input", new ItemStack(ItemRegistry.coconutItem));
        toastedcoconut.addValue("output", new ItemStack(ItemRegistry.toastedcoconutItem));
        registry.registerRecipe("oven", toastedcoconut);
        
        RecipeVariables vanilla = new RecipeVariables();
        vanilla.addValue("input", new ItemStack(ItemRegistry.vanillabeanItem));
        vanilla.addValue("output", new ItemStack(ItemRegistry.vanillaItem));
        registry.registerRecipe("oven", vanilla);
        
        RecipeVariables roastedchestnut = new RecipeVariables();
        roastedchestnut.addValue("input", new ItemStack(ItemRegistry.chestnutItem));
        roastedchestnut.addValue("output", new ItemStack(ItemRegistry.roastedchestnutItem));
        registry.registerRecipe("oven", roastedchestnut);
        
        RecipeVariables anchovy = new RecipeVariables();
        anchovy.addValue("input", new ItemStack(ItemRegistry.anchovyrawItem));
        anchovy.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", anchovy);
        
        RecipeVariables bass = new RecipeVariables();
        bass.addValue("input", new ItemStack(ItemRegistry.bassrawItem));
        bass.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", bass);
        
        RecipeVariables carp = new RecipeVariables();
        carp.addValue("input", new ItemStack(ItemRegistry.carprawItem));
        carp.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", carp);
        
        RecipeVariables catfish = new RecipeVariables();
        catfish.addValue("input", new ItemStack(ItemRegistry.catfishrawItem));
        catfish.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", catfish);
        
        RecipeVariables charr = new RecipeVariables();
        charr.addValue("input", new ItemStack(ItemRegistry.charrrawItem));
        charr.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", charr);
        
        RecipeVariables eel = new RecipeVariables();
        eel.addValue("input", new ItemStack(ItemRegistry.eelrawItem));
        eel.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", eel);
        
        RecipeVariables grouper = new RecipeVariables();
        grouper.addValue("input", new ItemStack(ItemRegistry.grouperrawItem));
        grouper.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", grouper);
        
        RecipeVariables herring = new RecipeVariables();
        herring.addValue("input", new ItemStack(ItemRegistry.herringrawItem));
        herring.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", herring);
        
        RecipeVariables mudfish = new RecipeVariables();
        mudfish.addValue("input", new ItemStack(ItemRegistry.mudfishrawItem));
        mudfish.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", mudfish);
        
        RecipeVariables perch = new RecipeVariables();
        perch.addValue("input", new ItemStack(ItemRegistry.perchrawItem));
        perch.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", perch);
        
        RecipeVariables snapper = new RecipeVariables();
        snapper.addValue("input", new ItemStack(ItemRegistry.snapperrawItem));
        snapper.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", snapper);
        
        RecipeVariables tilapia = new RecipeVariables();
        tilapia.addValue("input", new ItemStack(ItemRegistry.tilapiarawItem));
        tilapia.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", tilapia);
        
        RecipeVariables trout = new RecipeVariables();
        trout.addValue("input", new ItemStack(ItemRegistry.troutrawItem));
        trout.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", trout);
        
        RecipeVariables tuna = new RecipeVariables();
        tuna.addValue("input", new ItemStack(ItemRegistry.tunarawItem));
        tuna.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", tuna);
        
        RecipeVariables walleye = new RecipeVariables();
        walleye.addValue("input", new ItemStack(ItemRegistry.walleyerawItem));
        walleye.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("oven", walleye);
        
        RecipeVariables clam = new RecipeVariables();
        clam.addValue("input", new ItemStack(ItemRegistry.clamrawItem));
        clam.addValue("output", new ItemStack(ItemRegistry.clamcookedItem));
        registry.registerRecipe("oven", clam);
        
        RecipeVariables crab = new RecipeVariables();
        crab.addValue("input", new ItemStack(ItemRegistry.crabrawItem));
        crab.addValue("output", new ItemStack(ItemRegistry.crabcookedItem));
        registry.registerRecipe("oven", crab);
        
        RecipeVariables crayfish = new RecipeVariables();
        crayfish.addValue("input", new ItemStack(ItemRegistry.crayfishrawItem));
        crayfish.addValue("output", new ItemStack(ItemRegistry.crayfishcookedItem));
        registry.registerRecipe("oven", crayfish);
        
        RecipeVariables frog = new RecipeVariables();
        frog.addValue("input", new ItemStack(ItemRegistry.frograwItem));
        frog.addValue("output", new ItemStack(ItemRegistry.frogcookedItem));
        registry.registerRecipe("oven", frog);
        
        RecipeVariables octopus = new RecipeVariables();
        octopus.addValue("input", new ItemStack(ItemRegistry.octopusrawItem));
        octopus.addValue("output", new ItemStack(ItemRegistry.octopuscookedItem));
        registry.registerRecipe("oven", octopus);
        
        RecipeVariables scallop = new RecipeVariables();
        scallop.addValue("input", new ItemStack(ItemRegistry.scalloprawItem));
        scallop.addValue("output", new ItemStack(ItemRegistry.scallopcookedItem));
        registry.registerRecipe("oven", scallop);
        
        RecipeVariables shrimp = new RecipeVariables();
        shrimp.addValue("input", new ItemStack(ItemRegistry.shrimprawItem));
        shrimp.addValue("output", new ItemStack(ItemRegistry.shrimpcookedItem));
        registry.registerRecipe("oven", shrimp);
        
        RecipeVariables snail = new RecipeVariables();
        snail.addValue("input", new ItemStack(ItemRegistry.snailrawItem));
        snail.addValue("output", new ItemStack(ItemRegistry.snailcookedItem));
        registry.registerRecipe("oven", snail);
        
        RecipeVariables turtle = new RecipeVariables();
        turtle.addValue("input", new ItemStack(ItemRegistry.turtlerawItem));
        turtle.addValue("output", new ItemStack(ItemRegistry.turtlecookedItem));
        registry.registerRecipe("oven", turtle);
        
        //TOASTER
        RecipeVariables toastertoast = new RecipeVariables();
        toastertoast.addValue("input", new ItemStack(Items.bread));
        toastertoast.addValue("output", new ItemStack(ItemRegistry.toastItem));
        registry.registerRecipe("toaster", toastertoast);
        
        //MICROWAVE
        RecipeVariables microwavebread = new RecipeVariables();
        microwavebread.addValue("input", new ItemStack(ItemRegistry.doughItem));
        microwavebread.addValue("output", new ItemStack(Items.bread));
        registry.registerRecipe("microwave", microwavebread);
        
        RecipeVariables microwavetoast = new RecipeVariables();
        microwavetoast.addValue("input", new ItemStack(Items.bread));
        microwavetoast.addValue("output", new ItemStack(ItemRegistry.toastItem));
        registry.registerRecipe("microwave", microwavetoast);
        
        RecipeVariables microwaveroastedpumpkinseeds = new RecipeVariables();
        microwaveroastedpumpkinseeds.addValue("input", new ItemStack(Items.pumpkin_seeds));
        microwaveroastedpumpkinseeds.addValue("output", new ItemStack(ItemRegistry.roastedpumpkinseedsItem));
        registry.registerRecipe("microwave", microwaveroastedpumpkinseeds);
        
        RecipeVariables microwavegrilledmushroomred = new RecipeVariables();
        microwavegrilledmushroomred.addValue("input", new ItemStack(Blocks.red_mushroom));
        microwavegrilledmushroomred.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("microwave", microwavegrilledmushroomred);
        
        RecipeVariables microwavegrilledmushroombrown = new RecipeVariables();
        microwavegrilledmushroombrown.addValue("input", new ItemStack(Blocks.brown_mushroom));
        microwavegrilledmushroombrown.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("microwave", microwavegrilledmushroombrown);
        
        RecipeVariables microwavemutton = new RecipeVariables();
        microwavemutton.addValue("input", new ItemStack(ItemRegistry.muttonrawItem));
        microwavemutton.addValue("output", new ItemStack(ItemRegistry.muttoncookedItem));
        registry.registerRecipe("microwave", microwavemutton);
        
        RecipeVariables microwavecalamari = new RecipeVariables();
        microwavecalamari.addValue("input", new ItemStack(ItemRegistry.calamarirawItem));
        microwavecalamari.addValue("output", new ItemStack(ItemRegistry.calamaricookedItem));
        registry.registerRecipe("microwave", microwavecalamari);
        
        RecipeVariables microwavegrilledasparagus = new RecipeVariables();
        microwavegrilledasparagus.addValue("input", new ItemStack(ItemRegistry.asparagusItem));
        microwavegrilledasparagus.addValue("output", new ItemStack(ItemRegistry.grilledasparagusItem));
        registry.registerRecipe("microwave", microwavegrilledasparagus);
        
        RecipeVariables microwavericecake = new RecipeVariables();
        microwavericecake.addValue("input", new ItemStack(ItemRegistry.riceItem));
        microwavericecake.addValue("output", new ItemStack(ItemRegistry.ricecakeItem));
        registry.registerRecipe("microwave", microwavericecake);
        
        RecipeVariables microwavetea = new RecipeVariables();
        microwavetea.addValue("input", new ItemStack(ItemRegistry.tealeafItem));
        microwavetea.addValue("output", new ItemStack(ItemRegistry.teaItem));
        registry.registerRecipe("microwave", microwavetea);
        
        RecipeVariables microwavepopcorn = new RecipeVariables();
        microwavepopcorn.addValue("input", new ItemStack(ItemRegistry.cornItem));
        microwavepopcorn.addValue("output", new ItemStack(ItemRegistry.popcornItem));
        registry.registerRecipe("microwave", microwavepopcorn);
        
        RecipeVariables microwavebakedsweetpotato = new RecipeVariables();
        microwavebakedsweetpotato.addValue("input", new ItemStack(ItemRegistry.sweetpotatoItem));
        microwavebakedsweetpotato.addValue("output", new ItemStack(ItemRegistry.bakedsweetpotatoItem));
        registry.registerRecipe("microwave", microwavebakedsweetpotato);
        
        RecipeVariables microwavecoffee = new RecipeVariables();
        microwavecoffee.addValue("input", new ItemStack(ItemRegistry.coffeebeanItem));
        microwavecoffee.addValue("output", new ItemStack(ItemRegistry.coffeeItem));
        registry.registerRecipe("microwave", microwavecoffee);
        
        RecipeVariables microwavegrilledeggplant = new RecipeVariables();
        microwavegrilledeggplant.addValue("input", new ItemStack(ItemRegistry.eggplantItem));
        microwavegrilledeggplant.addValue("output", new ItemStack(ItemRegistry.grilledeggplantItem));
        registry.registerRecipe("microwave", microwavegrilledeggplant);
        
        RecipeVariables microwaveraisins = new RecipeVariables();
        microwaveraisins.addValue("input", new ItemStack(ItemRegistry.grapeItem));
        microwaveraisins.addValue("output", new ItemStack(ItemRegistry.raisinsItem));
        registry.registerRecipe("microwave", microwaveraisins);
        
        RecipeVariables microwavegrilledmushroom = new RecipeVariables();
        microwavegrilledmushroom.addValue("input", new ItemStack(ItemRegistry.whitemushroomItem));
        microwavegrilledmushroom.addValue("output", new ItemStack(ItemRegistry.grilledmushroomItem));
        registry.registerRecipe("microwave", microwavegrilledmushroom);
        
        RecipeVariables microwavetoastedcoconut = new RecipeVariables();
        microwavetoastedcoconut.addValue("input", new ItemStack(ItemRegistry.coconutItem));
        microwavetoastedcoconut.addValue("output", new ItemStack(ItemRegistry.toastedcoconutItem));
        registry.registerRecipe("microwave", microwavetoastedcoconut);
        
        RecipeVariables microwavevanilla = new RecipeVariables();
        microwavevanilla.addValue("input", new ItemStack(ItemRegistry.vanillabeanItem));
        microwavevanilla.addValue("output", new ItemStack(ItemRegistry.vanillaItem));
        registry.registerRecipe("microwave", microwavevanilla);
        
        RecipeVariables microwaveroastedchestnut = new RecipeVariables();
        microwaveroastedchestnut.addValue("input", new ItemStack(ItemRegistry.chestnutItem));
        microwaveroastedchestnut.addValue("output", new ItemStack(ItemRegistry.roastedchestnutItem));
        registry.registerRecipe("microwave", microwaveroastedchestnut);
        
        RecipeVariables microanchovy = new RecipeVariables();
        microanchovy.addValue("input", new ItemStack(ItemRegistry.anchovyrawItem));
        microanchovy.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", anchovy);
        
        RecipeVariables microbass = new RecipeVariables();
        microbass.addValue("input", new ItemStack(ItemRegistry.bassrawItem));
        microbass.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", bass);
        
        RecipeVariables microcarp = new RecipeVariables();
        microcarp.addValue("input", new ItemStack(ItemRegistry.carprawItem));
        microcarp.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", carp);
        
        RecipeVariables microcatfish = new RecipeVariables();
        microcatfish.addValue("input", new ItemStack(ItemRegistry.catfishrawItem));
        microcatfish.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", catfish);
        
        RecipeVariables microcharr = new RecipeVariables();
        microcharr.addValue("input", new ItemStack(ItemRegistry.charrrawItem));
        microcharr.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", charr);
        
        RecipeVariables microeel = new RecipeVariables();
        microeel.addValue("input", new ItemStack(ItemRegistry.eelrawItem));
        microeel.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", eel);
        
        RecipeVariables microgrouper = new RecipeVariables();
        microgrouper.addValue("input", new ItemStack(ItemRegistry.grouperrawItem));
        microgrouper.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", grouper);
        
        RecipeVariables microherring = new RecipeVariables();
        microherring.addValue("input", new ItemStack(ItemRegistry.herringrawItem));
        microherring.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", herring);
        
        RecipeVariables micromudfish = new RecipeVariables();
        micromudfish.addValue("input", new ItemStack(ItemRegistry.mudfishrawItem));
        micromudfish.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", mudfish);
        
        RecipeVariables microperch = new RecipeVariables();
        microperch.addValue("input", new ItemStack(ItemRegistry.perchrawItem));
        microperch.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", perch);
        
        RecipeVariables microsnapper = new RecipeVariables();
        microsnapper.addValue("input", new ItemStack(ItemRegistry.snapperrawItem));
        microsnapper.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", snapper);
        
        RecipeVariables microtilapia = new RecipeVariables();
        microtilapia.addValue("input", new ItemStack(ItemRegistry.tilapiarawItem));
        microtilapia.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", tilapia);
        
        RecipeVariables microtrout = new RecipeVariables();
        microtrout.addValue("input", new ItemStack(ItemRegistry.troutrawItem));
        microtrout.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", trout);
        
        RecipeVariables microtuna = new RecipeVariables();
        microtuna.addValue("input", new ItemStack(ItemRegistry.tunarawItem));
        microtuna.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", tuna);
        
        RecipeVariables microwalleye = new RecipeVariables();
        microwalleye.addValue("input", new ItemStack(ItemRegistry.walleyerawItem));
        microwalleye.addValue("output", new ItemStack(Items.cooked_fished));
        registry.registerRecipe("microwave", walleye);
        
        RecipeVariables microclam = new RecipeVariables();
        microclam.addValue("input", new ItemStack(ItemRegistry.clamrawItem));
        microclam.addValue("output", new ItemStack(ItemRegistry.clamcookedItem));
        registry.registerRecipe("microwave", microclam);
        
        RecipeVariables microcrab = new RecipeVariables();
        microcrab.addValue("input", new ItemStack(ItemRegistry.crabrawItem));
        microcrab.addValue("output", new ItemStack(ItemRegistry.crabcookedItem));
        registry.registerRecipe("microwave", microcrab);
        
        RecipeVariables microcrayfish = new RecipeVariables();
        microcrayfish.addValue("input", new ItemStack(ItemRegistry.crayfishrawItem));
        microcrayfish.addValue("output", new ItemStack(ItemRegistry.crayfishcookedItem));
        registry.registerRecipe("microwave", microcrayfish);
        
        RecipeVariables microfrog = new RecipeVariables();
        microfrog.addValue("input", new ItemStack(ItemRegistry.frograwItem));
        microfrog.addValue("output", new ItemStack(ItemRegistry.frogcookedItem));
        registry.registerRecipe("microwave", microfrog);
        
        RecipeVariables microoctopus = new RecipeVariables();
        microoctopus.addValue("input", new ItemStack(ItemRegistry.octopusrawItem));
        microoctopus.addValue("output", new ItemStack(ItemRegistry.octopuscookedItem));
        registry.registerRecipe("microwave", microoctopus);
        
        RecipeVariables microscallop = new RecipeVariables();
        microscallop.addValue("input", new ItemStack(ItemRegistry.scalloprawItem));
        microscallop.addValue("output", new ItemStack(ItemRegistry.scallopcookedItem));
        registry.registerRecipe("microwave", microscallop);
        
        RecipeVariables microshrimp = new RecipeVariables();
        microshrimp.addValue("input", new ItemStack(ItemRegistry.shrimprawItem));
        microshrimp.addValue("output", new ItemStack(ItemRegistry.shrimpcookedItem));
        registry.registerRecipe("microwave", microshrimp);
        
        RecipeVariables microsnail = new RecipeVariables();
        microsnail.addValue("input", new ItemStack(ItemRegistry.snailrawItem));
        microsnail.addValue("output", new ItemStack(ItemRegistry.snailcookedItem));
        registry.registerRecipe("microwave", microsnail);
        
        RecipeVariables microturtle = new RecipeVariables();
        microturtle.addValue("input", new ItemStack(ItemRegistry.turtlerawItem));
        microturtle.addValue("output", new ItemStack(ItemRegistry.turtlecookedItem));
        registry.registerRecipe("microwave", microturtle);
    }
}
