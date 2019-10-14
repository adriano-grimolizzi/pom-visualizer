package com.grimolizzi.PomVisualizer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

public class App {

	public static void main(String[] args) throws FileNotFoundException, IOException, XmlPullParserException {
		
		MavenXpp3Reader reader = new MavenXpp3Reader();
		
        Model model = reader.read(new FileReader("pom.xml"));
        
		System.out.println("Pom Version: " + model.getVersion());
	}
}
