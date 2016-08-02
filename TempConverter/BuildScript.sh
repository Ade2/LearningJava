#!/bin/bash

mkdir -p src/main/java/ 
mkdir -p src/test/java/ 
echo "import static org.junit.Assert.*;
import org.junit.Ignore; 
import org.junit.Test;  
public class TempConverterTest {
    @Test
    public void number1() {
        assertEquals("I", "J");
    }
}" > src/test/java/test1.java


echo "apply plugin: 'java'
repositories {
   mavenCentral()
}
dependencies {
   testCompile 'junit:junit:[4,)'
}
test {
   testLogging {
       // Show that tests are run in the command-line output
       events 'passed', 'failed'
   }
}" > build.gradle


gradle clean build