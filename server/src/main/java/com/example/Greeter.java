package com.example;

/**
* Ceci est une class.
*/
public class Greeter {

  /**
  * Ceci est un constructeur.
  */
  public Greeter() {

  }

  /**
  * @param someone = nom de la personne
  * @return greeting string
  */
  public final String greet(final String someone) {
    return String.format("Hello Oscar, %s!", someone);
  }
}
