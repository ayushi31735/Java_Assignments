package com.techlabs.arrays;

import java.util.Random;
import java.util.Scanner;

public class WordGuesserGame {
    private String wordToGuess;
    private char[] guessedLetters;

    public WordGuesserGame(String wordToGuess) {
        this.wordToGuess = wordToGuess.toLowerCase();
        this.guessedLetters = new char[wordToGuess.length()];

        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }
    }
    
    public static String generateRandomWords() {
        Random random = new Random();
        char[] word = new char[random.nextInt(8)+3]; 
        for(int i = 0; i < word.length; i++)
        {
            word[i] = (char)('a' + random.nextInt(26));
        }
        String randomString = new String(word);
        return randomString;
	}

    public void play() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int hints = 2;
        for(int i=0;i<hints;i++)
        {
        	int index = random.nextInt(wordToGuess.length());
        	guessedLetters[index] = wordToGuess.charAt(index);
        }
        System.out.println("Your Hints are: " + String.valueOf(guessedLetters));
        int tries = 10;
        while (tries > 0) {
            System.out.println("Current progress: " + String.valueOf(guessedLetters));

            System.out.print("Enter a letter: ");
            char letter = scanner.nextLine().toLowerCase().charAt(0);

            guessLetter(letter);

            if (wordGuessed()) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                System.exit(0);
            }
            tries--;
        }
        if(tries == 0)
        {
        	System.out.println("You can try only 10 times.... Game Over...");
        }
    }

	private void guessLetter(char letter) {
    	int count = 0;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter && guessedLetters[i] == '_') {
                guessedLetters[i] = letter;
                count++;
                break;
            }
        }
        if(count == 0)
        {
        	System.out.println("You guessed the wrong letter.. Try Again...");
        }
    }

    private boolean wordGuessed() {
        for (char letter : guessedLetters) {
            if (letter == '_') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String wordToGuess = generateRandomWords();
        System.out.println(wordToGuess);
        WordGuesserGame game = new WordGuesserGame(wordToGuess);
        game.play();
    }
}
