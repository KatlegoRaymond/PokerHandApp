@echo off
chcp 65001

mkdir bin
 
rem Compile main and test classes
javac -d bin -cp "lib/*" src/PokerHandCardGame/*.java
if %errorlevel% neq 0 (
    echo Compilation failed. See compilation_errors.log for details.
    pause
    exit /b %errorlevel%
)
  
rem Run JUnit tests
java -cp "bin;lib/*" org.junit.platform.console.ConsoleLauncher --scan-class-path
 
rem Run the application
java -cp "bin/;lib/*" PokerHandCardGame.PokerHandsApp
pause