import org.apache.commons.io.FileUtils;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("###### Starting #####");
        var list = FileUtils.readLines(new File("build.gradle"));
        list.stream().forEach(System.out::println);
    }
}
