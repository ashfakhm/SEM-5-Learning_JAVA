# Algorithms for Java Programs

## 1. Check whether a number is odd or even

1. Start the program.
2. Read an integer from the user.
3. If number % 2 == 0, print "Even".
4. Else, print "Odd".
5. Stop.

## 2. Find the largest of three numbers

1. Start the program.
2. Read three integers from the user.
3. If a > b and a > c, print "a is the largest".
4. Else if b > a and b > c, print "b is the largest".
5. Else, print "c is the largest".
6. Stop.

## 3. Print the prime numbers within a range

1. Start the program.
2. Read start and end values from the user.
3. Loop num from start to end:
   a. If num <= 1, skip.
   b. Set flag = 0.
   c. Loop i from 2 to num/2:
   - If num % i == 0, set flag = 1 and break.
     d. If flag == 0, print num.
4. Stop.

## 4. Print the Fibonacci series within a limit

1. Start the program.
2. Read the limit from the user.
3. Initialize a = 0, b = 1.
4. While a <= limit:
   a. Print a.
   b. next = a + b.
   c. a = b, b = next.
5. Stop.

## 5. Check whether a three-digit number is Armstrong or not

1. Start the program.
2. Read a 3-digit number from the user.
3. Store original number.
4. Initialize sum = 0.
5. While number > 0:
   a. digit = number % 10.
   b. sum += digit^3.
   c. number /= 10.
6. If sum == original, print "Armstrong number".
7. Else, print "Not Armstrong".
8. Stop.

## 6. Read 3 marks, find average and provide grades

1. Start the program.
2. Read 3 marks from the user.
3. Calculate average = (m1 + m2 + m3) / 3.
4. Calculate gradeIndex = average / 10.
5. Use switch(gradeIndex):
   - Case 10: O Grade
   - Case 9: A Grade
   - Case 8: B Grade
   - Case 7: C Grade
   - Case 6: D Grade
   - Case 5: E Grade
   - Default: Failed
6. Stop.

## 7. Find the factorial of a number using recursion

1. Start the program.
2. Define a recursive method fact(n):
   - If n == 1, return 1.
   - Else, return n \* fact(n - 1).
3. Read integer n.
4. Call fact(n) and print result.
5. Stop.

## 8. Sort an array

1. Start the program.
2. Read array size and elements from the user.
3. Use nested loops to compare and swap elements (bubble sort).
4. Print sorted array.
5. Stop.

## 9. Find the transpose of a matrix

1. Start the program.
2. Read number of rows and columns from the user.
3. Read matrix elements.
4. Print original matrix.
5. Print transpose by swapping rows and columns.
6. Stop.

## 10. Average of three numbers using the command-line argument

1. Start the program.
2. Pass three numbers as command line arguments.
3. Parse arguments to float.
4. Calculate average and print.
5. Stop.

## 11. Area of triangles using method overloading

1. Start the program.
2. Create class AreaTriangle with overloaded area methods:
   - area(a): Equilateral triangle.
   - area(base, height): Isosceles/general triangle.
   - area(a, b, c): Scalene triangle (Heron's formula).
3. In main, create object and call methods.
4. Stop.

## 12. Compare the area of rectangles using objects as parameters

1. Start the program.
2. Create class Rectangle with length and breadth.
3. area() returns area.
4. compareArea(Rectangle other) compares and prints which rectangle is larger or if equal.
5. In main, create two Rectangle objects and call compareArea.
6. Stop.

## 13. Add two complex numbers

1. Start the program.
2. Create class Complex with real and imag.
3. add(Complex c) returns new Complex with summed real and imag.
4. In main, create two Complex objects, add, and display result.
5. Stop.

## 14. Inheritance - Employee and Programmer

1. Start the program.
2. Create class Employee with name, age, basicPay.
3. Create subclass Programmers with department, bonus.
4. totalSalary() prints name, age, department, and total salary.
5. In main, create Programmers objects and call totalSalary().
6. Stop.

## 15. Array of objects (Student)

1. Start the program.
2. Create class student with roll, name, m1, m2, m3.
3. display() prints roll, name, total, and average.
4. In main, create array of student objects, initialize, and call display for each.
5. Stop.

## 16. Override method 'greatest()'

1. Start the program.
2. Create class GreatestOfTwo with method greatest() for two numbers.
3. Create class GreatestOfThree extending GreatestOfTwo, override greatest() for three numbers using if-else.
4. In main, create objects and print results.
5. Stop.

## 17. Area of circle and sphere using interfaces

1. Start the program.
2. Define interface Shape with area() method.
3. Create Circle and Sphere classes implementing Shape.
4. area() in Circle: 3.14 _ radius^2; area() in Sphere: 4 _ 3.14 \* radius^2.
5. In main, read radius, create objects, and call area().
6. Stop.

## 18. Print 'Hai' and 'Hello' using threads

1. Start the program.
2. Create HaiThread and HelloThread classes extending Thread.
3. run() prints "Hai" or "Hello" 6 times with pause.
4. In main, create and start both threads.
5. Stop.

## 19. ArithmeticException if 'k' < 10

1. Start the program.
2. Read integer k from user.
3. If k < 10, throw ArithmeticException with message.
4. Catch exception and print message.
5. Stop.

## 20. Implement Packages

1. Start the program.
2. Create package p1 with class Prime and method isPrime(n).
3. In main class, import p1.\* and use Prime to check for prime.
4. Stop.

## 21. Simple client server application

### Server

1. Start the program.
2. Create ServerSocket on port 8013.
3. Wait for client connection (accept()).
4. When client connects, print message.
5. Read message from client and print.
6. Close server socket.
7. Stop.

### Client

1. Start the program.
2. Create Socket connecting to 127.0.0.1:8013.
3. Send message to server.
4. Print confirmation.
5. Close socket.
6. Stop.
