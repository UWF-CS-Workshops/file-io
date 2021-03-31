# File IO

# Agenda

* Types of file IO
  * reading/writing a line at a time
  * reading/writing objects
  * reading/writing a character at a time
* Tokenizing – breaking up a line into its constituent parts
* Parsing – tokenizing with syntax check

# Disclaimer

* Your instructor might want you to employ test\-driven development techniques\.
* I will not be demonstrating those techniques today as important as they are because
  * there is so much to cover on two programming languages and
  * I will demonstrate multiple types of read/write operations

# Tokenizing and Delimiters

* Delimiters are markers that indicate the boundaries of items we might want to tokenize
* Examples:
  * spaces between words
  * tab\-delimited files
  * commas \(comma\-separated value\, csv files\)
* csv files: a very important type of file \(Excel\)

# Reading/Writing files: C++

* C\+\+
  * Basic\.cpp\(read three ints\, write total to a file\)
  * mixed\.cpp\(read different data types\, implicitly tokenize the line\)
  * tokenAtATime\.cpp\(read individual strings across newline boundaries\)
  * charAtATime\.cpp\(read individual characters and conditionally process\)
  * makeNeat\.cpp\(use of formatters\, cleaning up an input file\)
  * main\.cpp/IODemo\.cpp
    * console
    * typical organization for a C\+\+ program
    * main utilizing another user\-defined class
    * processing a \.csv file

# Reading/Writing files: Java

* Java
  * Basic\.java\(read three ints\, write total to a file\)
  * LineNumberer\.java\(read and write with iterator\)
  * Tokenizer1\.java\(use of split\)
  * Tokenizer2\.java\(read data\, create instances of class Person\, and place in a container\)
  * JsonParseTest\.java\(demonstrate automatic reading and parsing of JSON data\, accessing attributes\, arrays\, and a structure\)

# Summary

Files can be processed many different ways\.

I did not review direct access files today\, but they are critical for database operations on data in secondary storage\.

Similarities and differences exist among various programming languages such as C\+\+ and Java\.

Tokenizing is breaking apart the constituent parts of a line of text\.

Some important operations are automated \(such as parsing JSON files\)

Reading from or writing to networks is similar to reading/writing local file systems\.

