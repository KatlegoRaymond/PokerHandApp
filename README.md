# Poker Hand Application

Five Card Draw Poker is a console-based Java application that deals and evaluates poker hands for a simplified version of the five-card draw variant. In this variant, each player receives a hand of 5 cards and competes against each other based on the standard 5 card poker hand strength.

## Features

- Simulates shuffling a standard deck of 52 cards.
- Deals a single hand of 5 cards to the player.
- Evaluates the player’s hand, informing them of the highest ranked poker hand that matches their hand of 5 cards.

## Poker Hand Strengths

The standard 5 card poker hand strengths applied in this application, listed in decreasing rank, are as follows:

1. Straight Flush
2. Four of a Kind
3. Full House
4. Flush
5. Straight
6. Three of a Kind
7. Two Pair
8. One Pair
9. High Cards

##Project Structure
 
```
PokerHandApp/
│
├── FiveCardPoker/
│   ├── src/
│   │   └── PokerHandCardGame/
│   │       ├── Card.java
│   │       ├── CardTest.java
│   │       ├── CardUtilities.java
│   │       ├── CardUtilitiesTest.java
│   │       ├── Deck.java
│   │       ├── DeckTest.java
│   │       ├── package-info.java
│   │       └── PokerHandsApp.java
│   ├── bin/
│   ├── lib/
│   └── compile_and_run.bat
├── .project
├── .classpath
└── README.md

```


### FiveCardPoker/
 
### src

The `src` directory contains the Java source files organized under the `PokerHandCardGame` package.
 
This folder contains the main source code, binaries, dependencies, and scripts related to the poker hand application.

- **`src/`:** This directory holds the source code of the application.
  - **`PokerHandCardGame/`:** This package contains the Java classes related to the poker game implementation.
    - `Card.java`: Defines the `Card` class representing a playing card.
    - `CardTest.java`: Contains unit tests for the `Card` class.
    - `CardUtilities.java`: Contains utility methods for evaluating poker hands.
    - `CardUtilitiesTest.java`: Contains unit tests for the `CardUtilities` class.
    - `Deck.java`: Defines the `Deck` class representing a deck of cards.
    - `DeckTest.java`: Contains unit tests for the `Deck` class.
    - `package-info.java`: Provides package-level documentation.
    - `PokerHandsApp.java`: Main class to run the poker hand simulation.

- **`bin/`:** This directory is intended to hold compiled binary files, but it's currently empty.

- **`lib/`:** This directory can be used to store external libraries or dependencies. It's currently empty.

- **`compile_and_run.bat`:** This batch file contains commands to compile and run the application.

- **`README.md`:** This markdown file provides documentation for the project.

### `.project` and `.classpath`

These files are specific to Eclipse IDE and define project settings and classpath configurations, respectively.


## Prerequisites
- Java Development Kit (JDK) installed on your machine. 

## Getting Started
1. Clone or download this repository to your local machine
   ```
   git clone https://github.com/KatlegoRaymond/PokerHandApp.git
   ```   

## Running the Application
### Run using Batch file
**To run the application using compile_and_run.bat batch file**
To run the application by double-clicking the `compile_and_run.bat` file, follow these instructions:

1. Navigate to the Project Directory:
   - Locate the `compile_and_run.bat` file in the project directory. Directory: PokerHandApp/FiveCardPoker

2. Double-click the Batch File:
   - Double-click the `compile_and_run.bat` file.
   - This will execute the batch file, which will compile the Java files (if not compiled already) and then run the main class.

3. Observe the Output:
   - The batch file will execute, and you will see the output of the application.
   - Output messages may include "Shuffling... Shuffling... Shuffling..." and the cards dealt for the hand.

4. (Optional) Run Unit Tests:
   - If there are unit tests available, they may be run after compiling the Java files.
   - Review the batch file or project documentation for instructions on running tests.

By following these instructions, you should be able to run the `compile_and_run.bat` file by double-clicking it, allowing you to execute the application without using the command prompt.


### Run using command prompt
**To run the application using command prompt, follow these instructions:**
1. Navigate to the Project Directory: PokerHandApp/FiveCardPoker
   - Open a command prompt (or terminal) on your system.
   - Use the `cd` command to navigate to the directory where the `compile_and_run.bat` file is located.
   - For example:
     ```
     cd path/to/PokerHandApp/FiveCardPoker/
     ```

2. Run the Batch File:
   - Once you are in the correct directory, you can run the batch file by typing its name and pressing Enter.
   - Use the following command:
     ```
     compile_and_run.bat
     ```

3. Observe the Output:
   - The batch file will execute, which will compile the Java files (if not compiled already) and then run the main class.
   - You will see the output of the application in the command prompt.
   - The output will include messages such as "Shuffling... Shuffling... Shuffling..." and the cards dealt for the hand.

4. (Optional) Run Unit Tests:
   - If there are unit tests available for the application, you can run them using the batch file as well.
   - The batch file may include commands to run unit tests after compiling the Java files.
   - Look for additional instructions in the batch file or consult the project documentation for running tests.

By following these instructions, you should be able to run the `compile_and_run.bat` file using the command prompt on your system. 
If you encounter any errors or issues during the execution, review the error messages displayed in the command prompt for troubleshooting.


### Run using an IDE
**To run the application using an IDE, follow these instructions:**
1. Open the Project in Your IDE:
   - First, ensure that you have the Java Development Kit (JDK) installed on your system.
   - Download the source code of the PokerHandCardGame application and extract it to a directory of your choice.
   - Open your preferred Integrated Development Environment (IDE), such as IntelliJ IDEA, Eclipse, or NetBeans.
   - Import the extracted project into your IDE. The exact steps for importing a project may vary depending on your IDE.

2. Navigate to the Main Class:
   - Once the project is imported, navigate to the main class of the application. In this case, the main class is `PokerHandsApp.java`.
   - This class contains the `main` method, which serves as the entry point for the application.

3. Run the Main Class:
   - Right-click on the `PokerHandsApp.java` file or the `main` method within the file.
   - Choose the option to run the main class. This action will execute the `main` method and start the application.

4. Observe the Output:
   - The application will execute, and you will see the output in the console window of your IDE.
   - The output will include messages such as "Shuffling... Shuffling... Shuffling..." and the cards dealt for the hand.

5. (Optional) Run Unit Tests:
   - If you want to run the unit tests for the application, locate the test classes within the project.
   - Right-click on the test class file (e.g., `CardUtilitiesTest.java` or `DeckTest.java`).
   - Choose the option to run the tests. The IDE will execute the tests and display the results.

6. Explore the Code:
   - Feel free to explore the source code of the application to understand how it works.
   - You can examine the classes, methods, and comments to gain insight into the functionality of each component.

By following these steps, you should be able to run the PokerHandCardGame application using your IDE and observe its behavior. 
If you encounter any errors or issues during the execution, review the error messages in the console and check for potential 
issues in the code.