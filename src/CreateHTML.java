import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class CreateHTML {
    private static ArrayList<String[]> parseInput(String string) {
        String delimiters = "\s+|,|:";
        String[] splitString = string.split(";");
        ArrayList<String[]> parsedOutput = new ArrayList<>();
        for (String s : splitString) {
            parsedOutput.add(s.split(delimiters));
        }

        return parsedOutput;
    }

    private static String createHTMLTable(String string) {
        StringBuilder html = new StringBuilder();
        List<String[]> parsedInput = parseInput(string);
        html.append("<table>");
        for (String[] strings : parsedInput) {
            html.append("<tr>");
            for (String word : strings) {
                html.append("<td>").append(word).append("</td>");
            }
            html.append("</tr>");
        }
        html.append("</table>");
        return html.toString();
    }

    public static void createHTMLFile(String string) {
        File htmlFile = new File("Table.html");
        String html = "<html><head><title>Table</title></head><body>" + createHTMLTable(string) + "</body></html>";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(htmlFile));
            bufferedWriter.write(html);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String string = "This,is,a,string;This,is,a,second,string;Another,string";
        CreateHTML.createHTMLFile(string);
    }

}
