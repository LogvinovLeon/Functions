package Functions;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;

/**
 * Created by Leonid Logvinov on 3/25/14.
 */
public class Main {
    final static String APP_ID = "KUXEY3-7HHR585PY6";

    public static void main(String[] args) throws IOException, DocumentException {
        Function f = new Sum(new Exponent(new Identity()), new Ln(new Identity()));
        System.out.println(f.derivative().toString());
        System.out.println(simplify(f.derivative().toString()));
    }

    private static String simplify(String s) throws IOException, DocumentException {
        Document response = getRequest(s);
        Element root = response.getRootElement();
        for (Iterator i = root.elementIterator(); i.hasNext(); ) {
            Element foo = (Element) i.next();
            String atrValue = foo.attributeValue("title");
            if ((atrValue.equals("Result")) || (atrValue.equals("Results"))) {
                for (Iterator j = foo.elementIterator(); j.hasNext(); ) {
                    Element el = (Element) j.next();
                    return el.elementIterator().next().getText();
                }
            }
        }
        return null;
    }

    private static Document getRequest(String query) throws IOException, DocumentException {
        query = URLEncoder.encode("simplify " + query, "UTF-8");
        String httpQuery = String.format("http://api.wolframalpha.com/v2/query?input=%s&appid=%s", query, APP_ID);
        URL url = new URL(httpQuery);
        return parse(url);
    }

    private static Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        return reader.read(url);
    }
}
