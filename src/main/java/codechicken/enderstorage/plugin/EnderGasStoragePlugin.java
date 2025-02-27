package codechicken.enderstorage.plugin;

import codechicken.enderstorage.api.AbstractEnderStorage;
import codechicken.enderstorage.api.EnderStoragePlugin;
import codechicken.enderstorage.api.Frequency;
import codechicken.enderstorage.manager.EnderStorageManager;
import codechicken.enderstorage.storage.EnderGasStorage;
import codechicken.lib.config.ConfigTag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public class EnderGasStoragePlugin implements EnderStoragePlugin {

    @Override
    public AbstractEnderStorage createEnderStorage(EnderStorageManager manager, Frequency freq) {
        return new EnderGasStorage(manager, freq);
    }

    @Override
    public AbstractEnderStorage createEnderStorage(EnderStorageManager manager, ItemStack stack) {
        return new EnderGasStorage(manager, stack);
    }

    @Override
    public String identifier() {
        return "gas";
    }

    public void loadConfig(ConfigTag config) {
    }

    @Override
    public void sendClientInfo(EntityPlayer player, List<AbstractEnderStorage> list) {
    }
}
