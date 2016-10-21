import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by hamekas on 10/21/16 @HKR ivanauskas15@gmail.com
 */
public class File {
    private static Writer writer;
    public static void main(String[] args) throws IOException {
        ChooseFile file = new ChooseFile();
        while (file.getPath().isEmpty()) {
            //The only way I could make it to work
           try {
                Thread.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (!file.isRunning())
                file = new ChooseFile();

        }
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("Path.txt"), "utf-8"));
            writer.write("PATH:" + file.getPath() + "/");
        } catch (IOException e) {
            System.out.println("Error" + e);
        } finally {
            try {
                writer.close();
            } catch (Exception e) {/*..Ignore..*/}
        }
        System.out.println("Done");
        String path;
        List<String> lines = new ArrayList<>();
        try(Stream<String> stream = Files.lines(Paths.get("Path.txt"))){
            lines = stream.filter(line-> line.startsWith("PATH:")).collect(Collectors.toList());
        }catch (IOException e){
            e.printStackTrace();
        }
        path=lines.toString();
        path = getRealPath(path);
        System.out.println(path);
    }
    private static String getRealPath(String string){
        char[] full = string.toCharArray();
        String returning="";
        for (int i = 6;i<string.length()-1;i++){
            returning = returning+full[i];
        }
        return returning;
    }
}
