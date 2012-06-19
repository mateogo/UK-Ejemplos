/*
 * WordSort.java
 *
 * Created on 5 de mayo de 2001, 11:02
 */

package kennedy.ar.colecciones.wordSort;

import java.io.*;
import java.util.*;

/**
 * 
 * @author mateo
 * @version
 */
public class WordSort extends Object {
	public String inputFile;
	public String outputFile;
	Map<String, Integer> map = new TreeMap<String, Integer>();
	List<String> keys = new ArrayList<String>(map.keySet());

	/** Creates new WordSort */
	public WordSort() {
		this.init();
	}

	public void init() {
		this.setInputFile("kennedy.ar.colecciones.wordSortInput");
		this.setOutputFile("kennedy.ar.colecciones.wordSortOutput");
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws IOException {
		WordSort ws = new WordSort();
		// get the command-line arguments
		if (args.length > 0) {
			ws.setInputFile(args[0]);
			ws.setOutputFile(args[1]);
		} else {
			System.out.println("Optional Usage: WordSort inputfile outputfile");
		}
		ws.sortContentFile();
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String ouputFile) {
		this.outputFile = ouputFile;
	}

	public void sortContentFile() throws IOException {
		// Cual es el directorio corriente?
		File appBase = new File("."); // current directory
		String path = appBase.getAbsolutePath();
		System.out.println(path);
		System.out.println("Procesando: "+getInputFile());
		System.out.println("OutputFile: "+getOutputFile());
		System.out.println("....");
		this.map = new TreeMap<String, Integer>();
		this.buildMapFromFile(this.map, getInputFile());
		//sort Map
		this.keys = new ArrayList<String>(map.keySet());
		Collections.sort(this.keys);
		// write the results to the output file
		this.writeSortedMapToFile(getOutputFile());
	}

	public void buildMapFromFile(Map<String, Integer> wMap, String wFile) throws IOException {
		// read every line of the imput file
		BufferedReader in = new BufferedReader(new FileReader(wFile));
		String line;
		while ((line = in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				String word = st.nextToken();
				Integer count = wMap.get(word);
				if (count == null) count = new Integer(0);
				wMap.put(word, new Integer(count.intValue() + 1));
			}
		}
		in.close();		
	}
	public void writeSortedMapToFile(String outputFile) throws IOException{
		PrintWriter outBound = new PrintWriter(new FileWriter(outputFile));
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key + " :" + map.get(key));
			outBound.print(key + " :" + map.get(key)+"\n");
		}
		outBound.flush();
		outBound.close();
	}

}
