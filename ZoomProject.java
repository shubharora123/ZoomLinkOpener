import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.net.URL;
import java.util.ArrayList;

public class ZoomProject{
	public static ArrayList<String> listOfLinks = new ArrayList<String>();

	public static void main(String[] args) {
		while (true){
			Scanner input = new Scanner(System.in);
			System.out.print("Input file name: ");
			String fileName = input.next();
			File newFile = new File(fileName);
			try{
				analysisFile(newFile);
				break;
			}
			catch (FileNotFoundException w){
				System.out.println("File not found. Try again	");
			}
		}	 
	}

	public static void analysisFile(File fil) throws FileNotFoundException {
		Scanner input = new Scanner(fil);
		for(;;){
			if (input.hasNext()){
				String link = input.nextLine();
				listOfLinks.add(link);
			}
			else{
				break;
			}
		}
		runLoop();
	}

	public static void runLoop(){
		java.util.Date date = new java.util.Date();
		String currentString = date.toString().substring(0,3);
		LocalTime localTime1 = LocalTime.of(7, 59, 0, 0);
		LocalTime localTime2 = LocalTime.of(8, 49, 0, 0);
		LocalTime localTime3 = LocalTime.of(10, 44, 0, 0);
		LocalTime localTime4 = LocalTime.of(11, 34, 0, 0);
		LocalTime localTime5 = LocalTime.of(14, 30, 30, 0);
		LocalTime localTime6 = LocalTime.of(13, 44, 0, 0);
		while (true){
			LocalTime currentTime = LocalTime.now();
			if(currentString.equals("Mon")) {
				if(currentTime.getHour() == localTime1.getHour() && currentTime.getMinute() == localTime1.getMinute() && currentTime.getSecond() == localTime1.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(0));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(45 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime2.getHour() && currentTime.getMinute() == localTime2.getMinute() && currentTime.getSecond() == localTime2.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(1));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(110 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime3.getHour() && currentTime.getMinute() == localTime3.getMinute() && currentTime.getSecond() == localTime3.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(2));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(45 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime4.getHour() && currentTime.getMinute() == localTime4.getMinute() && currentTime.getSecond() == localTime4.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(6)); //3 for normal people but for me brucker has two links
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(75 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime5.getHour() && currentTime.getMinute() == localTime5.getMinute() && currentTime.getSecond() == localTime5.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(4));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(45 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime6.getHour() && currentTime.getMinute() == localTime6.getMinute() && currentTime.getSecond() == localTime6.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(5));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(1090 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			
			}
			if(currentString.equals("Tue") || currentString.equals("Thu")) {
				if(currentTime.getHour() == localTime1.getHour() && currentTime.getMinute() == localTime1.getMinute() && currentTime.getSecond() == localTime1.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(0));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(160 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime3.getHour() && currentTime.getMinute() == localTime3.getMinute() && currentTime.getSecond() == localTime3.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(2));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(125 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime5.getHour() && currentTime.getMinute() == localTime5.getMinute() && currentTime.getSecond() == localTime5.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(4));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(1140 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}

			
			if(currentString.equals("Wed") || currentString.equals("Fri")) {
				if(currentTime.getHour() == localTime1.getHour() && currentTime.getMinute() == localTime1.getMinute() && currentTime.getSecond() == localTime1.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(1));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(160 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime3.getHour() && currentTime.getMinute() == localTime3.getMinute() && currentTime.getSecond() == localTime3.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(3));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(125 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				if(currentTime.getHour() == localTime5.getHour() && currentTime.getMinute() == localTime5.getMinute() && currentTime.getSecond() == localTime5.getSecond()) {
					try {
						URI link = new URI(listOfLinks.get(5));
						java.awt.Desktop.getDesktop().browse(link);
						Thread.sleep(1140 * 60000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
