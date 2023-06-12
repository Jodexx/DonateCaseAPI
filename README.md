# DonateCaseAPI ![GitHub tag (latest by date)](https://repo.jodexindustries.space/api/badge/latest/releases/com/jodexindustries/donatecase/DonateCaseAPI?color=40c14a&name=DonateCaseAPI&prefix=v) ![Spiget Downloads](https://img.shields.io/spiget/downloads/106701?label=Spigot%20downloads) ![Spiget Version](https://img.shields.io/spiget/version/106701?label=DonateCase) ![Spiget Download Size](https://img.shields.io/spiget/download-size/106701) ![Spiget tested server versions](https://img.shields.io/spiget/tested-versions/106701)
[JavaDocs](https://repo.jodexindustries.space/javadoc/releases/com/jodexindustries/donatecase/DonateCaseAPI/1.0.3) <br>
[MavenRepo](https://repo.jodexindustries.space/#/releases/com/jodexindustries/donatecase/DonateCaseAPI/1.0.3)
# Install
Maven
```xml
<repository>
    <id>JodexIndustries</id>
    <name>JodexIndustries Repo</name>
    <url>https://repo.jodexindustries.space/releases</url>
</repository>

<dependency>
  <groupId>com.jodexindustries.donatecase</groupId>
  <artifactId>DonateCaseAPI</artifactId>
  <version>1.0.3</version>
</dependency>
```
Gradle
```gradle
maven {
    name "JodexIndustries"
    url "https://repo.jodexindustries.space/releases"
}

compileOnly("com.jodexindustries.donatecase:DonateCaseAPI:1.0.3")
```
# Example
Code
```java
import com.jodexindustries.donatecase.api.Case;
import com.jodexindustries.donatecase.api.events.CaseInteractEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestDonateCaseAPI extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info(String.valueOf(Case.getKeys("case", "_Jodex__")));
        getServer().getPluginManager().registerEvents(this, this);
    }
    @EventHandler
    public void onCaseInteract(CaseInteractEvent e) {
        Player p = e.getPlayer();
        p.sendMessage(e.getClickedBlock().getLocation().toString());
    }
}

```

plugin.yml
```yaml
depend:
  - DonateCase
loadbefore:
  - DonateCase
```