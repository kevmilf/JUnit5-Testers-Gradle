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

#### Task 2 - calculator
1. Check in `src/main/java/calculator` class `Calculator`
2. Write tests that will cover 100% of the code.
3. Maybe try to use parameters.
4. Don't forget about assertions.

#### Task 3 - calculator
1. Use `@CsvFileSource` to drive tests for .add() method from Calculator
2. Create proper text file with data in `resources` folder.
3. Run tests.

#### Task 4 - Browser
1. There is existing Enum in `/src/main/java/parametrize` called Browser.
2. Write test (in /src/test/java/parametrize` that will just print the browser name.

#### Task 5 - WeirdStuff
1. Some mad developer wrote function `public static String isItTheAnswerToUltimateQuestionOfLife(int n)` in `WeirdStuf.java`.
2. Can you write test that will prove that the function is ok or not?
3. The function should **never** return string `That should not happen at all` no matter what value has `n`