package basic.examples;

/*
Primitive number types are divided into two groups:

Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

Floating point types represents numbers with a fractional part, containing one or more decimals.
There are two types: float and double.
 */

public class Numbers {
    public static void main(String[] args) {

        System.out.println("******* INTEGER TYPES *********");
        System.out.println("*** Byte ***");
        /*
        The byte data type can store whole numbers from -128 to 127.
        This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
         */
        byte myNum = 100;
        System.out.println("Byte: " + myNum);


    }
}
