
/* Exercise 2-3 Report
 
1.For exercise 2 i'm doing the same thing with the long and the short text except i'm just using a single character and a
string generated with 80 characters. At the start of the program i put the current time in a variable.
I then have a while-loop that tells the program to keep repeat concatenations to my String and StringBuilder until it has gone one second.
I calculate the time by checking the timer i took subtracted with the current time. I have a int named counter to calculate the amount
of times i add a String. In the short methods the counter will be the same as the length as the string as i add one character each time
and add one to my counter each time. I do the same on the long methods but this time the counter wont be the same as the String im adding
each time is 80 characters long. I then have a for-loop for each test and do the test 5 times each so 20 times total.
The methods returns a string with the result as the output. I chose a string so i can return both values easily.

2. Added a .pdf file with the report. I noticed that the long StringBuilder test all got the same result. I assume this is the somewhat the
max size of bytes the StringBuilder can hold. I tried to increase the amount of time it should add String and i got an error
of "Space out of heap".


StringBuilder is faster because when you use myString += "sample text" it creates a new instance of a String and this allocates memory.
Hence the StringBuilder is built of Arrays and only need to check for available space and some other instances.







*/