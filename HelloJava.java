class HelloJava
{
    public static void main(String a[])
    {
        // To print string on console
            // println will start from new line
        System.out.println("Hello World Java");
     
        // System.out.println(3+3);

        // Variable declaration
        int num = 10;
        // System.out.println(num);

        int num1=12;
        int num2=12;
        int result = num1+num2;
        // System.out.println(num1+num2);
        // System.out.println(result);

        // Data Types in Java

        // A)Primitive
        // 1.Integer , 2.Floating point, 3.Character ,4.Boolean

        // 1.Integer ->(int , long , short, byte)
        int marks  = 200 ; // 4byte
        long score = 1234l; // 8byte , put "l" explicitly to define long number
        short number = 322; // 2byte
        byte value = 126;   // 1byte (-128 to 127)
        // System.out.println(marks);
        // System.out.println(score);
        // System.out.println(number);
        // System.out.println(value);

        // 2.Floating point -> (double => 8byte ,float => 4byte)
        double val1 = 1.2344543;  // double if default in Java for floating point value
        // float val2 = 4.5;  // it will not work gives error
        float val2 = 4.5f;   // Explicitly define "f" to use float value
        // System.out.println(val1);
        // System.out.println(val2);

        // 3.Character->(char)
        char ch = 'k';  // 2byte 
        // System.out.println(ch);  //Java follows Unicode

        // 4.Boolean=> boolean
        // Note:- In Java we do not use 1 or 0 instead we use true or false.
        boolean isLoggedIn = true;
        boolean isSignIn = false;
        // System.out.println(isLoggedIn); 
        // System.out.println(isSignIn); 

        // Literal in Java
        int number1 = 10;  // literals are the values
        // System.out.println(number1);

        // To use Binary Format(0 b number)
        int biNum = 0b101;   // 101 => 5
        // System.out.println(biNum);   // 5

        // To use HexaDecimal Format (0 x number)
        int hexNum = 0x7E; // 0x7E => 126
        // System.out.println(hexNum); //126

        // To not get confuse between zeros in java we use("_")
        int bigNum = 10_00_000;
        // System.out.println(bigNum);  // 1000000


        //integer value automatically converted into double 
        double inval= 12;
        // System.out.println(inval); //12.0

        // We can epsilon for very big number
        double veryBigNum = 13e10;
        // System.out.println(veryBigNum); //1.3E11

        // Char can be treated as integer and operations can be performed.
        char c = 'a';
        c++;
        // System.out.println(c);  // b

        // Type Conversion And Casting
        byte b = 127;
        // byte b = 257;  //error  out of range from byte
        // System.out.println(b);     //127
        int valInteger=12;
        valInteger = b;
        // System.out.println(valInteger);
        int g= 10;
        // byte k =g; // //error cannot convert fron int to byte
        byte k =(byte)g; // Typecasting 
        // System.out.println(k);    //10

        // Modular operation
        int intvalnumber = 258; //out of range of byte
        byte bytevalnumber = (byte)intvalnumber;
        // System.out.println(bytevalnumber);  //2 => 258 % 127 =>remainder 2

        // float to int
        float pointVal = 12.6f;
        int t = (int)pointVal;  
        System.out.println(t); //12

        // Type Promotion 
        byte by=10;
        byte te = 20;
        int ans = by*te; // => Value will be promoted to Integer value.
        System.out.println(ans);//200
    }
}

//  To Compile java code => javac HelloJava.java  (javac fileName.java)
// To Run Java code => java HelloJava (java className)