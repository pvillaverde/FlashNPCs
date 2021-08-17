package flash.npcmod.init;

import flash.npcmod.Main;
import flash.npcmod.item.NpcEditorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

  public static final RegistryObject<Item> NPC_EDITOR = ITEMS.register("npc_editor",
      () -> new NpcEditorItem()
      );

}