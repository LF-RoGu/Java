
## Problem 1
### Variables, Operators, Expressions, Statements, and Blocks 
Calculate the Volume of a sphere.
This was one by creating a class, specific to just return the values that where requested in the problem.

* get_varVolumeEarth()
*get_varVolumeSun()

This methods return a double value. The units that was done for this where mts. Intead of miles, this to make easier to corroborate with external calculators and make sure that the return value was the correct one.

## Problem 2
### Control Flow Statements
Control statement using labels, this are used specific to break the current statement, but not break the cycle. Refering as, to exit the current cycle and continue in the next step of the cycle. 

If the operation module between the 2 values is equal to ZERO. Meaning the value is not a prime number.
Then the current cycle should break, meaning we just abroutly stop current cycle to continue in the next one.

An equivalent explination logic is:

While (flag)

{

    for(parameters)
    {
        if(blah blah equals true)
        {
            /* Only exits for, but saving current value of parameters */
            break;
        }
    }
}



## Problem 3
### Object Basics and Simple Data Objects, The Life Cycle of an Object,Characters and Strings 
Count the amount of vocals, spaces and consonants are in the stored string.

For this logic a simple for cycle was suficient, where each character was checked. If it is a space a counter is increase, as well for the vowels. For the consonants a counter was made to check the total amount of letters that appear in the text. After all the letters are counter, for this variable the amount of vocals are substracted; this way the total amount of consonants are available.
## Problem 4
### Object Basics and Simple Data Objects
Order the text in alphabetical order.

A bubble sort method was implemened to arrange this words.
This was done through 2 for cycles, the outer cycle is for the selection of the word in the string array. The second one is to compare and arrange if needed.

In the bubble sort method a temporal string was made to store the current word being checked.

This kinda works this way:

a = str[i]; 

b[j] = str[j+1];

c[j+1] = a;


