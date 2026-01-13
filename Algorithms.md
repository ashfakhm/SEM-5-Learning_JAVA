# Algorithms for Java Programs

## 1. Check whether a number is odd or even

1. Start the program.
2. Read an integer `n` from the user.
3. Check if `n % 2 == 0`.
4. If true, print "Even".
5. Else, print "Odd".
6. Stop.

## 2. Find the largest of three numbers

1. Start the program.
2. Read three integers `a`, `b`, and `c`.
3. If `a > b` and `a > c`, print "`a` is largest".
4. Else if `b > a` and `b > c`, print "`b` is largest".
5. Else, print "`c` is largest".
6. Stop.

## 3. Print the prime numbers within a range

1. Start the program.
2. Read `start` and `end` of the range.
3. Loop `num` from `start` to `end`.
4. For each `num`, initialize `flag = 0`.
5. Loop `i` from 2 to `num/2`.
6. If `num % i == 0`, set `flag = 1` and break.
7. If `flag == 0` and `num > 1`, print `num`.
8. Repeat until the loop finishes.
9. Stop.

## 4. Print the Fibonacci series within a limit

1. Start the program.
2. Read the limit `n`.
3. Initialize `a = 0`, `b = 1`.
4. While `a <= n`:
   a. Print `a`.
   b. Calculate `next = a + b`.
   c. Set `a = b` and `b = next`.
5. Stop.

## 5. Check whether a three-digit number is Armstrong or not

1. Start the program.
2. Read a 3-digit number `n`.
3. Store `n` in `temp`.
4. Initialize `sum = 0`.
5. While `n > 0`:
   a. Extract last digit: `rem = n % 10`.
   b. Add cube of digit to sum: `sum = sum + (rem * rem * rem)`.
   c. Remove last digit: `n = n / 10`.
6. If `sum == temp`, print "Armstrong Number".
7. Else, print "Not Armstrong".
8. Stop.

## 6. Read 3 marks, find average and provide grades

1. Start the program.
2. Read 3 marks `m1`, `m2`, `m3`.
3. Calculate `average = (m1 + m2 + m3) / 3`.
4. Calculate `index = average / 10`.
5. Use `switch(index)`:
   - Case 10, 9: Print "A Grade".
   - Case 8: Print "B Grade".
   - Case 7: Print "C Grade".
   - Case 6: Print "D Grade".
   - Case 5: Print "E Grade".
   - Default: Print "Failed".
6. Stop.

## 7. Find the factorial of a number using recursion

1. Start the program.
2. Define a method `fact(n)`.
   - If `n == 1` return 1.
   - Else return `n * fact(n - 1)`.
3. Read integer `n`.
4. Call `fact(n)` and print the result.
5. Stop.

## 8. Sort an array

1. Start the program.
2. Read the size `n` and elements of the array `A`.
3. Start loop `i` from 0 to `n-1`.
4. Start nested loop `j` from 0 to `n-1`.
5. If `A[j] > A[j+1]`:
   - Swap `A[j]` and `A[j+1]`.
6. Repeat until sorted.
7. Print the sorted array.
8. Stop.

## 9. Find the transpose of a matrix

1. Start the program.
2. Read rows `r` and columns `c`.
3. Read matrix elements `A[r][c]`.
4. Print original matrix.
5. Initialize transpose matrix `T[c][r]`.
6. Loop `i` from 0 to `r-1` and `j` from 0 to `c-1`.
   - Set `T[j][i] = A[i][j]`.
7. Print `T` matrix.
8. Stop.

## 10. Average of three numbers using the command-line argument

1. Start the program.
2. Pass three numbers as command line arguments.
3. Parse arguments: `a = Float.parseFloat(args[0])`, etc.
4. Calculate `avg = (a + b + c) / 3`.
5. Print `avg`.
6. Stop.

## 11. Area of triangles using method overloading

1. Start the program.
2. Create class `AreaTriangle` with overloaded methods:
   - `Area(a)`: Calculate `sqrt(3)/4 * a * a` (Equilateral).
   - `Area(b, h)`: Calculate `0.5 * b * h` (General).
   - `Area(a, b, c)`: Calculate using Heron's formula (Scalene).
3. In main, create object and call methods with different parameters.
4. Stop.

## 12. Compare the area of rectangles using objects as parameters

1. Start the program.
2. Create class `Rectangle` with `length`, `breadth`.
3. Define `area()` to return `length * breadth`.
4. Define `compare(Rectangle r2)`:
   - Calculate area of current object `a1`.
   - Calculate area of `r2` as `a2`.
   - Compare `a1` and `a2` and print larger one.
5. In main, create two `Rectangle` objects.
6. Call `r1.compare(r2)`.
7. Stop.

## 13. Add two complex numbers

1. Start the program.
2. Create class `Complex` with `real`, `imag`.
3. Define method `add(Complex c2)`:
   - Create `temp` object.
   - `temp.real = this.real + c2.real`.
   - `temp.imag = this.imag + c2.imag`.
   - Return `temp`.
4. In main, create two `Complex` objects.
5. Call `c3 = c1.add(c2)`.
6. Print `c3`.
7. Stop.

## 14. Inheritance - Employee and Programmer

1. Start the program.
2. Create class `Employee` with `Name`, `Age`, `BasicPay`.
3. Create subclass `Programmer` extending `Employee` with `Department`, `Bonus`.
4. Define `TotalSalary()` in `Programmer`:
   - `total = BasicPay + Bonus`.
   - Print details and total salary.
5. In main, create object of `Programmer`.
6. Call `TotalSalary()`.
7. Stop.

## 15. Array of objects (Student)

1. Start the program.
2. Create class `Student` with `roll`, `name`, `m1`, `m2`, `m3`.
3. Define `display()` to calculate total and average.
4. In main, create array `Student s[] = new Student[n]`.
5. Initialize each object in array.
6. Loop through array and call `display()` for each student.
7. Stop.

## 16. Override method 'greatest()'

1. Start the program.
2. Create class `A` with method `greatest(a, b)` returning max of two.
3. Create class `B` extending `A`.
4. Override `greatest(a, b, c)` in `B` to return max of three.
5. In main, create object of `B`.
6. Call overridden methods using dynamic dispatch references if needed, or directly.
7. Stop.

## 17. Area of circle and sphere using interfaces

1. Start the program.
2. Define interface `Shape` with method `area()`.
3. Create class `Circle` implementing `Shape`.
   - `area()` = `3.14 * r * r`.
4. Create class `Sphere` implementing `Shape`.
   - `area()` = `4 * 3.14 * r * r`.
5. In main, create objects and call `area()`.
6. Stop.

## 18. Print 'hai' and 'hello' using threads

1. Start the program.
2. Create class `Hai` extending `Thread`. Run method prints "Hai" in loop.
3. Create class `Hello` extending `Thread`. Run method prints "Hello" in loop.
4. In main, create objects `t1` and `t2`.
5. Call `t1.start()` and `t2.start()`.
6. Stop.

## 19. ArithmeticException if 'k' < 10

1. Start the program.
2. Read integer `k`.
3. Start `try` block.
4. If `k < 10`, throw new `ArithmeticException("Value is less than 10")`.
5. Catch `ArithmeticException` and print error message.
6. Stop.

## 20. Implement Packages

1. Start the program.
2. Create package `p1`.
3. Inside `p1`, define class `Prime` with method `check(n)`.
4. Compile package.
5. Create main class outside package.
6. `import p1.Prime`.
7. Create object of `Prime` and call `check(n)`.
8. Stop.

## 21. Simple client server application

### Server

1. Start Server.
2. Create `ServerSocket` on port 8013.
3. Wait for client: `accept()`.
4. Get Input/Output streams.
5. Receive message from client.
6. Send response.
7. Stop.

### Client

1. Start Client.
2. Create `Socket` connecting to "127.0.0.1" on port 8013.
3. Get Input/Output streams.
4. Send message to server.
5. Stop.
