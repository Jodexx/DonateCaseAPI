# DonateCaseAPI ![GitHub tag (latest by date)](https://repo.jodexindustries.space/api/badge/latest/releases/com/jodexindustries/donatecase/DonateCaseAPI?color=40c14a&name=DonateCaseAPI&prefix=v)
[JavaDocs](https://repo.jodexindustries.space/javadoc/releases/com/jodexindustries/donatecase/DonateCaseAPI/1.0.2) <br>
[MavenRepo](https://repo.jodexindustries.space/#/releases/com/jodexindustries/donatecase/DonateCaseAPI/1.0.2)
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
  <version>1.0.2</version>
</dependency>
```
Gradle
```gradle
maven {
    name "JodexIndustries"
    url "https://repo.jodexindustries.space/releases"
}

compileOnly("com.jodexindustries.donatecase:DonateCaseAPI:1.0.2")
```
# Example
Code
```java
import com.jodexindustries.donatecase.api.Case;
import org.bukkit.plugin.java.JavaPlugin;

public final class TestDonateCaseAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Case Case = new Case();
        getLogger().info(String.valueOf(Case.getKeys("case", "_Jodex__"))); // get player keys
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