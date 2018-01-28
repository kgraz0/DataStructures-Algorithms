import java.util.*;
import java.io.*;

class SetsFile {
	
	public static void main (String args[]) throws IOException {

		Set<String> hashSet = new HashSet<String>(); // create a new hashSet
		Scanner scan = new Scanner(new File("file.txt")); // set the file to open (file.txt)

		int numOfWords = 0; // initialize number of words in the file to 0
		String word = ""; // initialize word to empty

		do {
			word = scan.next(); // go through each word in the file and store it in the word variable

			StringTokenizer tokenizer = new StringTokenizer(word, "?![]',;:"); // create a String Tokenizer for the word variable with the punctuation to be removed from that word
            
			while (tokenizer.hasMoreTokens()) { // as long as there is tokens in the word, this condition is true
            String token = tokenizer.nextToken().toLowerCase();

            if (!hashSet.contains(token)) { // if the word isn't already in the hashSet, increase the number of different words by one
            	numOfWords++;
            }
            hashSet.add(token); // add the word (with now removed punctuation) into the next linkedList position

		}
		} while (scan.hasNext()); // scan the whole file word by word. This condition will be false when end of file is reached

        System.out.println(hashSet);
		System.out.println("Number of different words in the file: " + numOfWords);
	}
}