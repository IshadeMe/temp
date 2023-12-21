package project;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class JustPojo implements Plugin<Project> {

//    public static void main(String[] args) {
//        for (int i = 0;  i < 10; i++) {
//            System.out.println(null != args && args.length > i ? args[i] : "null");
//        }
//    }

    @Override
    public void apply(Project target) {
        target.task("hello")
                .doLast(task -> System.out.println("Hello Gradle!"));
    }
}
