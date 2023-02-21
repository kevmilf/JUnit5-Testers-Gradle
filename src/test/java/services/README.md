## JUnit basics

#### Task 1 - annotations
1. Create class AnnotationTest in `basics` package.
2. Create `@Test` annotation and test method
3. Create more annotations and methods (let each method print something distinct, make sure the order of methods in class is random)
   - @BeforeEach
   - @AfterEach
   - @BeforeAll
   - @AfterAll
4. Run test, what order was executed?

#### Task 2 - services
1. Check in `src/main/java/services` class `Calculator`
2. Write tests that will cover 100% of the code (not 100% of test cases).
3. Don't forget about assertions.


#### Task 3 - assertJ
1. In NamesTest you can create Names object by passing as many strings in parameters as you want.
2. `.getNames()` should return list of names in alphabetical order (A-Z).
3. Write some test (or tests) that will prove that the code doesn't work as expected.
4. Fix the code to return names in alphabetical order.
5. Run tests again to validate that it works.

#### Task 4 - services
1. Create proper text file with data in `resources` folder. With numbers separated with comma.
```java
1,1,2
2,3,5
4,2,6
```
2. Use Parameters to drive tests for Calculator `.add()`. (1+1=2, 2+3=5 and so on)
3. Run tests.


#### Task 5 - WeirdStuff
1. Some mad developer wrote function `public static String isItTheAnswerToUltimateQuestionOfLife(int n)` in `WeirdStuf.java`.
2. The function should **never** return string `That should not happen at all` no matter what value has `n`
3. Can you write test that will prove that the function is ok or not? There should be one number that will fail the test (think about Range).