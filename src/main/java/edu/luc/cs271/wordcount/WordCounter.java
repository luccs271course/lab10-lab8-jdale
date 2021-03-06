package edu.luc.cs271.wordcount;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/** A map-based class for counting word frequencies from an iterator. */
public class WordCounter {

  /** The map for storing the word counts. */
  private final Map<String, Integer> theMap;

  /** Creates a word counter instance based on the given map. */
  public WordCounter(final Map<String, Integer> theMap) {

    // finished
    this.theMap = theMap;
  }

  /** Counts the frequencies of all words in the given iterator. */
  public void countWords(final Iterator<String> words) {

    // finished for each word in the iterator, update the corresponding frequency in the map
    while (words.hasNext()) {
      String hello = words.next();
      int bye = theMap.getOrDefault(hello, 0);
      bye++;
      theMap.put(hello, bye);
    }
  }

  /** Retrieve the frequency of a particular word. */
  public int getCount(final String word) {

    // finished
    return theMap.getOrDefault(word, 0);
  }

  /** Retrieve the map representing all word frequencies. */
  public Map<String, Integer> getCounts() {
    return Collections.unmodifiableMap(theMap);
  }
}
