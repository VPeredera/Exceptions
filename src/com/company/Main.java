package com.company;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    // они пугают целым Throwable
//    public static void main(String[] args) throws Throwable /*Exception*/ { // предупреждаем о Exception
        // предупреждаем "целом" Throwable
//        throw new Exception(); // и кидаем Exception

        // но ничего не бросаем

//        f(); // тут ошибка компиляции
//    }
//    // хотя мы пугали всего-лишь Exception
//    public static void f() throws Exception {
//    }

//        return "<html><body>Nothing! It's stub!</body></html>".getBytes();

//        f();
//    }
//
//    public static void f() throws RuntimeException {
//    }

//    }
//    public static int parseInt(String s) throws NumberFormatException {
//        return parseInt(s,10);
//    }

    // пугаем ОБОИМИ исключениями
//    public static void main(String[] args) throws EOFException, FileNotFoundException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }

//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}

    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        if (System.currentTimeMillis() % 2 == 0) {
//            throw new EOFException();
//        } else {
//            throw new FileNotFoundException();
//        }
//    }

    // пугаем ПРЕДКОМ исключений
//    public static void main(String[] args) throws IOException {
//        f0();
//        f1();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}

//    public static void main(String[] args) throws IOException, InterruptedException {
//        f0();
//        f1();
//        f2();
//    }
//    public static void f0() throws EOFException {...}
//    public static void f1() throws FileNotFoundException {...}
//    public static void f2() throws InterruptedException {...}

//    public static void main(String[] args) {
//        try {
//            throw new Exception();
//        } catch (Exception e) {
//            // ...
//        }

//        try {
//            throw new Exception();
//        } catch (Throwable e) {
//            // ...
//        }

//        try {
//            throw new Throwable();
//        } catch (Exception e) {
//            // ...
//        }

//        try {
//            throw new Exception();
//        } catch (Error e) {
//            // ...
//        }

    // EOFException перехватили catch-ом, им не пугаем
//    public static void main(String[] args)  throws FileNotFoundException {
//        try {
//            if (System.currentTimeMillis() % 2 == 0) {
//                throw new EOFException();
//            } else {
//                throw new FileNotFoundException();
//            }
//        } catch (EOFException e) {
//            // ...
//        }
//    }

//    // пугаем Exception
//    public static void main(String[] args)  throws Exception {
////        Throwable t = new Exception(); // и лететь будет Exception
////        throw t; // но тут ошибка компиляции
//
////        Object ref = "Hello!";  // ref указывает на строку
////        char c = ref.charAt(0); // но тут ошибка компиляции; компилятор ориентируется на «левый тип» (тип ссылки, а не тип ссылаемого)
////                                // и не пропускает такой код
//
//        try {
//            Throwable t = new Exception(); // и лететь будет Exception
//            throw t; // но тут ошибка компиляции
//        } catch (Exception e) {
//            System.out.println("Перехвачено!");
//        }
//    }

//    // ТЕПЕРЬ пугаем Throwable
//    public static void main(String[] args)  throws Throwable {
//        try {
//            Throwable t = new Exception(); // а лететь будет Exception
//            throw t;
//        } catch (Exception e) { // и мы перехватим Exception
//            System.out.println("Перехвачено!");
//        }
//    }

//    public class Parent {
//        // предок пугает IOException и InterruptedException
//        public void f() throws IOException, InterruptedException {}
//    }
//
//    class Child extends Parent {
//        // а потомок пугает только потомком IOException
//        @Override
//        public void f() throws FileNotFoundException {}
//    }

//    public class Parent {
//        public void f() throws IOException, InterruptedException {}
//    }
//
//    class ChildB extends Parent {
//        @Override
//        public void f() throws Exception {}
//    }

//    public class Parent {
//        // предок пугает Exception
//        public void f() throws Exception {}
//    }
//
//    // тут ошибка компиляции в Java, но, ДОПУСТИМ, ее нет
//    public class Child extends Parent {
//        // потомок расширил Exception до Throwable
//        public void f() throws Throwable {}
//    }
//
//    public class Demo {
//        public static void test(Parent ref) {
//            // тут все компилируется, Parent.f() пугает Exception и мы его ловим catch
//            try {
//                ref.f();
//            } catch(Exception e) {}
//        }
//    }
//
//    public class App {
//        public static void main(String[] args) {
//            // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
//            Demo.test(new Child());
//        }
//    }
}