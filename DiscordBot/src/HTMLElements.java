import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class HTMLElements {
	
	
	private String url;
	
	public HTMLElements (String url) 
	{
		this.url = url;
	}

	public String readURL(String url) {

        String fileContents = "";
        String currentLine = "";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()));
            fileContents = reader.readLine();
            while (currentLine != null) {
                currentLine = reader.readLine();
                fileContents += "\n" + currentLine;
            }
            reader.close();
            reader = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error Message", JOptionPane.OK_OPTION);
            e.printStackTrace();

        }

        return fileContents;
    }
	
	public void ImageInHtmlPage() {
		Document doc =  Jsoup.parse(readURL(this.url));
        Elements divs = doc.select("div");
        for(Element d : divs)
        {
            System.out.println("Div tag : "+d.text());
        }
	}
	
	/*public static void main (String args[]) {
		HTMLElements html_e = new HTMLElements("https://www.google.fr/search?q=winnie&safe=off&espv=2&biw=1920&bih=950&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjx-v2el_3PAhXF2xoKHYqsBDgQ_AUIBigB");
		html_e.ImageInHtmlPage();
			
	}*/

}
