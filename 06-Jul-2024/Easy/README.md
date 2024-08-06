# Morse Code To English
## Easy Problem Statement
You are given a string of length N representing the morse code(s). You have to convert this code into the corresponding alphanumeric code containing the small-case English alphabets [a-z] and digits [0-9].  

For your convenience, the full table for the 26 letters of the English alphabet and 10 numeric digits is given below:  

list = [ ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----." ]      

Where list[0] represents the Morse code for 'a,' list[1] represents the Morse code for ‘b,’ and list[35] represents the Morse code for ‘9’. Similarly, each letter and numeric character is mapped with a Morse code given in the list.

### Detailed explanation ( Input/output format, Notes, Images )
**Constraints:**
- 1 <= T <= 10
- 1 <= N <= 5 * (10^5)
- Time Limit: 1sec

#### Sample Input 1 :
2  
-.-. --- -.. .. -. --.  
-. .. -. .--- .- ...

#### Sample Output 1 :
coding  
ninjas

#### Explanation For Sample Input 1 :  
In the first test case, On splitting the given string on the basis of space, the list we get is :  [ "-.-.", "---", "-..", "..",  "-.", "--." ]  
where “-.-.” is morse code for ‘c’ and similarly further in the string.

In the second case, on splitting the given string on the basis of space, the list we get is :  [ "-.", "..", "-.", ".---", ".-", "..." ], 
where “-.” is Morse code for ‘n’ and similarly further in the string.  

#### Sample Input 2 :
2  
----. ---.. ....- ..... -----  
-.. .... --- -. .. --... --...

#### Sample Output 2 :  
98450  
dhoni77

