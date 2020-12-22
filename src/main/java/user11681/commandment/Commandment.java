package user11681.commandment;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import user11681.commandment.config.CommandmentConfiguration;

public class Commandment implements ModInitializer {
    @Override
    public void onInitialize() {
        CommandmentConfiguration.instance = AutoConfig.register(CommandmentConfiguration.class, JanksonConfigSerializer::new).get();
    }
}
