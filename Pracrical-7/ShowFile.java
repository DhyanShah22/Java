import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;
        
        if (args.length == 0) {
            System.out.println("Usage: ShowFile File");
            return;
        }
        
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Usage: ShowFile File");
            return;
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            return;
        }

        // read characters until EOF is encountered
        try {
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the file.");
            }
        }
    }
}
