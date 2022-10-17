import java.io.*;

public class decrypt {
    public static void main(String[] args) throws IOException {
        File filepath = new File("output/output.hsn");
        FileInputStream fileinput = new FileInputStream(filepath);

        byte[] bytes = new byte[(int)filepath.length()];
        fileinput.read(bytes);
        fileinput.close();

        int arr[] = new int[bytes.length];
        byte[] bytes2 = new byte[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = bytes[i] - 23;
            bytes2[i] = (byte)arr[i];
            // appended because annoying
            // System.out.println(arr[i]);
        }

        FileOutputStream output = new FileOutputStream("output/output2.png");
        output.write(bytes2);
        output.close();
    }
}
