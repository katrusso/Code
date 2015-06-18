/* enums
 - a type of constant
 - an enumeration is a list of constant integer values.
*/

enum boolean { NO, YES }; //values = 0 and 1

/* Names in dif enumerations must be distinct.
 - values don't need to be distinct in an enum set
 - enums are an alternate to #define; 
    -- they allow you to associate constant values with names
 - if you don't specify all the values, unspecified values continue the progression from the last specified value
*/

enum months{ JAN = 1, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }; //FEB is 2, MAR is 3, etc.
