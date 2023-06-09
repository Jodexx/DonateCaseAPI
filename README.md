# DonateCaseAPI ![GitHub tag (latest by date)](https://img.shields.io/github/v/tag/Jodexx/DonateCaseAPI?label=version)
[JavaDocs](https://repo.jodexindustries.space/javadoc/releases/com/jodexindustries/donatecase/api/DonateCaseAPI/1.0) <br>
[MavenRepo](https://repo.jodexindustries.space/#/releases/com/jodexindustries/donatecase/api/DonateCaseAPI/1.0)
# Install
Maven
```xml
<repository>
  <id>Jodexindustries</id>
  <name>JodexIndustries Repo</name>
  <url>https://repo.jodexindustries.space/<repository></url>
</repository>

<dependency>
  <groupId>com.jodexindustries.donatecase.api</groupId>
  <artifactId>DonateCaseAPI</artifactId>
  <version>1.0</version>
</dependency>
```
Gradle
```gradle
maven {
    name "JodexIndustrie"
    url "https://repo.jodexindustries.space/releases"
}

compileOnly("com.jodexindustries.donatecase.api:DonateCaseAPI:1.0")
```
# Example
```java
import com.jodexindustries.donatecase.api.Case;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestDonateCaseAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(String.valueOf(Case.getKeys("case", "_Jodex__"))); // get player keys
    }

}
```
