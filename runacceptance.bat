cd acceptance
javac -cp .;..\build\classes\main TicTacToe.java
java -cp .;..\build\classes\main;C:\Users\sfedy_000\Documents\RobotFramework\robotframework-2.8.5.jar org.robotframework.RobotFramework TicTacToeTests.txt
cd ..