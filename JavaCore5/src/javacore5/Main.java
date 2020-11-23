package javacore5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static void CVswrite(AppData appData) throws IOException {

        try (PrintWriter out = new PrintWriter("test.cvs")) {
            for (String w : appData.getHeader()) {
                out.print(w + ";");
            }
            out.println();
            int[][] applist = appData.getData();
            for (int i = 0; i < applist.length; i++) {
                for (int j = 0; j < applist.length; j++) {
                    out.print(applist[i][j] + ";");
                }
                out.write("\r\n");

            }

        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private static void readCvs() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.cvs"));
        String[] hdr = br.readLine().split(";");
        if (hdr != null)
            System.out.println(hdr[i] + hdr[1] + hdr[hdr.length - 1]);

        int [][] rows;
        while (br.ready()) {
            rows = br.readLine().split(";");
            for (int i = 0; i < rows.length; ++i)
                (int j = 0; j < rows.length; ++j)
                System.out.print(String.format(rows[i][j]) + ";");
            rows = null;
        }
    }


    public static void main(String[] args) throws IOException {
        File file = new File("test.cvs");
        file.createNewFile();

        String[] header = {"Value1 ", " Value2 ", " Value3"};
        int[][] data = {{100, 200, 300}, {150, 250, 360}, {452, 333, 777}};
        AppData appData = new AppData(header, data);
        CVswrite(appData);
        readCvs();
    }

}




