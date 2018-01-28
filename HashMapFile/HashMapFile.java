import java.util.*;
import java.io.*;

class HashMapFile {
	
	public static void main (String args[]) throws IOException {

    Map<String, Integer> hashMap = new HashMap<String, Integer>(); // create a new HashMap where key will store String and value will store Integer
    Scanner scan = new Scanner(new File("file.txt")); // set the scanner reference to file.txt

    String word = ""; // initialize the string to be empty

    do {
    	word = scan.next(); // store the currently scanned word from the file in the string

    	StringTokenizer tokenizer = new StringTokenizer(word, "?![]',;:"); // declare StringTokenizer to remove the punctuation from the word

    	while (tokenizer.hasMoreTokens()) { // as long as there is more tokens, this condition is true
    		String token = tokenizer.nextToken().toLowerCase(); // store the word with removed punctuation in a new String

        if (hashMap.containsKey(token)) { // check whether the hashMap already contains the key that contains the word
        	Integer numOfOccurences = hashMap.get(token); // get the value of the key and store it in an integer variable
    		hashMap.put(token, numOfOccurences+1); // add one to the value of that key (occurence)
        } else { // if the key (word) is not contained in the HashMap, add the word as the key and set its value to 1 (first occurence)
        	hashMap.put(token, 1);
        }
        }
    } while (scan.hasNext()); // continue scanning each word from the file until end is reached

    /*
    Use map.entry contains the key and value pair from the map
    entrySet() method to return a set that contains the map pairs and allows
    iteration over both key and value
    This allows to pair all keys and values into a set
    */
    for (Map.Entry<String, Integer> currItem : hashMap.entrySet()) {
    	System.out.println(currItem.getKey() + " = " + currItem.getValue()); // print the key (word) and the number of occurences (value)
    }
	}
}