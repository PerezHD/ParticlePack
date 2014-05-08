package me.McKiller5252.particlepack.allparticles;


import org.bukkit.Location;
import org.bukkit.entity.Player;

import me.McKiller5252.particlepack.particleeffects.ParticleEffects;
import me.McKiller5252.particlepack.utility.Particle;

public class SlimeParticle implements Particle {

	public String getName() 
    {
        return "Slime";
    }

    public void preformEffect(Player player) 
    {
        Location loc = player.getLocation();
        ParticleEffects eff = ParticleEffects.SLIME;
            try {
                for (int i = 0; i < 25; i++)
                {
                    float x = (float) Math.random();
                    float y = (float) Math.random();
                    float z = (float) Math.random();
                    eff.display(loc, x, y, z, 1, 1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    @Override
    public boolean canUse(Player player) 
    {
        if (player.hasPermission("particlepack.slime"))
            return true;
        return false;
    }

    @Override
    public void setValue(String str) {
        // TODO Auto-generated method stub
        
    }

}
