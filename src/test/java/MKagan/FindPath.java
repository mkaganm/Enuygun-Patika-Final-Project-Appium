package MKagan;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FindPath {

    public static String returnAppPath(){
        String path;
        Path resourceDirectory = Paths.get("src","test","resources","apps", "patikaappium.apk");
        path = resourceDirectory.toFile().getAbsolutePath();
        return path;
    }

    public static String returnOreoJsonPath(){
        String path;
        Path resourceDirectory = Paths.get("src","test","resources","config", "android-oreo.json");
        path = resourceDirectory.toFile().getAbsolutePath();
        return path;
    }
}
