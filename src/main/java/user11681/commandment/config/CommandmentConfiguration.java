package user11681.commandment.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config.Gui.Background;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry.Gui.CollapsibleObject;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry.Gui.Excluded;
import user11681.commandment.config.category.EffectConfiguration;
import user11681.commandment.config.category.EnchantConfiguration;
import user11681.commandment.config.category.FillConfiguration;

@Config(name = "commandment")
@Background("minecraft:textures/block/andesite.png")
public class CommandmentConfiguration implements ConfigData {
    @Excluded
    public static transient CommandmentConfiguration instance;

    @CollapsibleObject
    public EffectConfiguration effect = new EffectConfiguration();

    @CollapsibleObject
    public EnchantConfiguration enchant = new EnchantConfiguration();

    @CollapsibleObject
    public FillConfiguration fill = new FillConfiguration();
}
