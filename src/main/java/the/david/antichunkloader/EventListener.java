package the.david.antichunkloader;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;

public class EventListener implements Listener {
    @EventHandler
    public void onEntityPortal(EntityPortalEvent e){
        Location toLocation = e.getTo();
        if(toLocation == null || toLocation.getWorld() == null){
            return;
        }
        if(toLocation.getNearbyPlayers(e.getSearchRadius() * 16, 319).isEmpty()){
            e.setCancelled(true);
        }
    }
}
