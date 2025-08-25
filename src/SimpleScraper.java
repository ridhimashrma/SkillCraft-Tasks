import java.io.FileWriter;
import java.io.IOException;

public class SimpleScraper {
    public static void main(String[] args) {
        String html = "<div class='product'>"
                + "<h2 class='name'>Laptop</h2>"
                + "<span class='price'>$800</span>"
                + "<span class='rating'>4.5</span>"
                + "</div>"
                + "<div class='product'>"
                + "<h2 class='name'>Phone</h2>"
                + "<span class='price'>$500</span>"
                + "<span class='rating'>4.2</span>"
                + "</div>";

        String[] products = html.split("<div class='product'>");

        StringBuilder csvData = new StringBuilder("Name,Price,Rating\n");

        for (String product : products) {
            if (product.contains("name")) {
                String name = getTagValue(product, "h2 class='name'>", "</h2>");
                String price = getTagValue(product, "span class='price'>", "</span>");
                String rating = getTagValue(product, "span class='rating'>", "</span>");
                csvData.append(name).append(",").append(price).append(",").append(rating).append("\n");
            }
        }
        try (FileWriter writer = new FileWriter("products.csv")) {
            writer.write(csvData.toString());
            System.out.println("Data saved to products.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getTagValue(String text, String startTag, String endTag) {
        int start = text.indexOf(startTag) + startTag.length();
        int end = text.indexOf(endTag, start);
        return text.substring(start, end);
    }
}
