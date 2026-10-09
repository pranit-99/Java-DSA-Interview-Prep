/*Problem 10 — Count Duplicate Elements in a List
Problem Statement

Create a Website Visitor List containing:

Chrome
Safari
Chrome
Firefox
Chrome
Edge
Safari
Chrome

Find how many times "Chrome" appears in the List.

This problem practices the fact that a List allows duplicate values. */
import java.util.ArrayList;
import java.util.List;
public class BrowsersVisitors {
    public static void main(String[] args) {
        List<String> browsers = new ArrayList<>();

        browsers.add("Chrome");
        browsers.add("Safari");
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Chrome");
        browsers.add("Edge");
        browsers.add("Safari");
        browsers.add("Chrome");

        System.out.println("Browser List:");
        System.out.println(browsers);

        int count = 0;

        for(String browser : browsers){
            if(browser.equals("Chrome")){
                count++;
            }
        }
        System.out.println("\nChrome Count: " + count);
    }
}
