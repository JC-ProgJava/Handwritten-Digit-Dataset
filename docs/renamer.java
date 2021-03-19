import java.io.File;

public class renamer {
  public static void main(String[] args) {
    File file = new File("/Users/JC/Desktop/datadown");
    String filepath = file.getAbsolutePath();
    String destination = "/Users/JC/Desktop/dataset";
    for (int digit = 0; digit < 10; digit++) {
      if (!new File(filepath + File.separator + digit).exists()) {
        System.out.println("Folder for " + digit + " doesn't exist.");
        continue;
      }
      int renameStart = 2025;
      File[] files = new File(filepath + File.separator + digit).listFiles();
      assert files != null;
      for (File fil : files) {
        File newFile = new File(destination + File.separator + digit + File.separator + digit + "\\" + renameStart + ".png");
        if(!fil.renameTo(newFile)) {
          System.out.println("Error renaming");
        }
        renameStart++;
      }
    }
  }
}
