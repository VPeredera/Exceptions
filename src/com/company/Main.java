package com.company;

public class Main {
    public static void main(String[] args) throws Throwable /*String*/ {
//        try{
//        } catch (Throwable t) {}

//        try{
//        } catch (String s) {}

//        throw new Error();

//        throw new String("Hello!");

//        throw null;

//        Error ref = new Error(); // создаём экземпляр
//        throw ref;               // "бросаем" его

//        f(null);
//    }
//    public static void f(NullPointerException e){
//        try{
//            throw e;
//        } catch (NullPointerException npe) {
//            f(npe);
//        }
//    }

//        System.out.println("sout");
//        throw new Error();

//        System.err.println("sout");
//        throw new Error();

//    {
//        public static double sqrt(double arg){ // надо double
//        return arg * arg;                      // double * double - это double
//    }

//    }
//    public static double sqrt(double arg){ // надо double
//        int k = 1;                         // есть int
//        return  /*(double) - явное преобразование int в double*/ k; // можно неявно преобразовать int в double
//    }

//    }
//    public static double sqrt(double arg){
//        return "hello!";
//    }

//    }
//    public static double sqrt(double arg){
//    }

//    }
//    public static double sqrt(double arg){
//        if(System.currentTimeMillis() % 2 == 0){
//            return arg * arg; // если currentTimeMillis() - четное число, то все ОК
//        }
//            // если не чётное, нечего возвращать
//    }

//        double d = sqrt(10.0); // неизвестно чему равно d
//        System.out.println(d);
//    }
//    public static double sqrt(double arg){
//        // nothing
//    }

//    }
//    public static double sqr(double arg) {
//        while (true); // Удивительно, но КОМПИЛИРУЕТСЯ!
//    }

//        double d = sqr(10.0);  // sqr - навсегда "повиснет", и
//        System.out.println(d); // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//    }
//    public static double sqr(double arg) {
//        while (true); // Вот тут мы на века "повисли" "бескончный цикл (постоянное выполняющееся условие, тело цикла отсутствует)"
//    }

//    }
//    public static double sqr(double arg) {
//        if (System.currentTimeMillis() % 2 == 0) {
//            return arg * arg; // ну ладно, вот твой double
//        } else {
//            while (true);     // а тут "виснем" навсегда
//        }
//    }

//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException();
//    }

//    }
//    public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
//        long time = System.currentTimeMillis();
//        if (time % 2 == 0) {
//            return arg * arg;             // ок, вот твой double
//        } else if (time % 2 == 1) {
//                while (true) ;                 // не, я решил "повиснуть"
//            } else {
//                throw new RuntimeException(); // или бросить исключение
//            }
//    }

//        // sqr - "сломается" (из него "выскочит" исключение),
//        double d = sqr(10.0);  // выполнение метода main() прервется в этой строчке и
//        // d - НИКОГДА НИЧЕГО НЕ БУДЕТ ПРИСВОЕНО!
//        System.out.println(d); // и печатать нам ничего не придется!
//    }
//    public static double sqr(double arg) {
//        throw new RuntimeException(); // "бросаем" исключение
//    }

//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.out.println("Bad ..."); // у вас плохие аргументы, извините
//        } else {
//            return width * height;
//        }
//    }

//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            return -1; // специальное "неправильное" значение площади
//        }
//        return width * height;
//    }

//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            System.exit(0);
//        }
//        return width * height;
//    }

//    }
//    public static int area(int width, int height) {
//        if (width < 0 || height < 0) {
//            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
//        }
//        return width * height;
//    }

//        // Пример: ОПЕРАТОР ПОСЛЕДОВАТЕЛЬНОСТИ
//        int x = 42;    // первый шаг
//        int y = x * x; // второй шаг
//        x = x * y;     // третий шаг

//        // Пример: ОПЕРАТОР ВЕТВЛЕНИЯ
//        if (args.length > 2) { //первый шаг
//            // второй шаг или тут
//            ...
//        } else {
//            // или тут
//            ...
//        }
//        // третий шаг

//        // Пример: ОПЕРАТОР ЦИКЛА do..while
//        int x = 1;
//        do {
//            ...
//        } while (x++ < 10);

//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out");  //вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // вернулись
//    } // выходим из текущего фрейма, кончились инструкции
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.RETURN");
//            return; // выходим из текущего фрейма по 'return'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСКАЕМ
//    }

//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }

//        System.err.println("#1.in");
//        try {
//            f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println("#1.CATCH");  // и работаем
//        }
//        System.err.println("#1.out");  // работаем дальше
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }

//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись и работаем
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        try {
//            g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println(".   #2.CATCH");  // и работаем
//        }
//        System.err.println(".   #2.out");  // работаем дальше
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   .   #3.out"); // ПРОПУСТИЛИ!
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }

//        System.err.println("#1.in");
//        f(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println("#1.out"); // вернулись и работаем
//    }
//
//    public static void f() {
//        System.err.println(".   #2.in");
//        g(); // создаем фрейм, помещаем в стек, передаем в него управление
//        System.err.println(".   #2.out"); // вернулись и работаем
//    }
//
//    public static void g() {
//        System.err.println(".   .   #3.in");
//        try {
//            h(); // создаем фрейм, помещаем в стек, передаем в него управление
//        } catch (Error e) { // "перехватили" "летящее" исключение
//            System.err.println(".   .   #3.CATCH");  // и работаем
//        }
//        System.err.println(".   .   #3.out");  // работаем дальше
//    }
//
//    public static void h() {
//        System.err.println(".   .   .   #4.in");
//        if (true) {
//            System.err.println(".   .   .   #4.THROW");
//            throw new Error(); // выходим со всей пачки фреймов ("раскрутка стека") по 'throw'
//        }
//        System.err.println(".   .   .   #4.out"); // ПРОПУСТИЛИ!
//    }

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (Exception e) { // catch по Exception ПЕРЕХВАТЫВАЕТ RuntimeException
//            System.err.print(" 2");
//        }
//        System.err.println(" 3");

//        try {
//            throw new RuntimeException();
//        } catch (Exception e) {
//            if (e instanceof RuntimeException) {
//                RuntimeException re = (RuntimeException) e;
//                System.err.print("Это RuntimeException на самом деле!!!");
//            } else {
//                System.err.print("В каком смысле не RuntimeException???");
//            }
//        }

//        try {
//            System.err.print(" 0");
//            if (true) {throw new Exception();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");

//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch (Exception e) {
//            System.err.print(" 2");
//        }
//        System.err.print(" 3");

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // но бросили Error
//        }
//        System.err.println(" 3");          // пропускаем - уже летит Error

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw e;}       // и бросили ВТОРОЙ раз ЕГО ЖЕ
//        }
//        System.err.println(" 3");      // пропускаем - опять летит RuntimeException

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) {     // перехватили RuntimeException
//            System.err.print(" 2");
//            if (true) {throw new Error();} // и бросили новый Error
//        } catch (Error e) { // хотя есть catch по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch (RuntimeException e) { // перехватили RuntimeException
//            System.err.print(" 2.1");
//            try {
//                System.err.print(" 2.2");
//                if (true) {throw new Error();} // и бросили новый Error
//                System.err.print(" 2.3");
//            } catch (Throwable t) {            // перехватили Error
//                System.err.print(" 2.4");
//            }
//            System.err.print(" 2.5");
//        } catch (Error e) { // хотя есть catch по Error "ниже", но мы в него не попадаем
//            System.err.print(" 3");
//        }
//        System.err.println(" 4");

//        try {
//        } catch (Exception e) {
//        } catch (RuntimeException e) {
//        }

//        try {
//        } catch (Error e) {
//        } catch (RuntimeException e) {
//        }

//        try {
//            throw new Exception();
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");

//        try {
//            Throwable t = new Exception(); // ссылка типа Throwable указывает на объект типа Exception
//            throw t;
//        } catch (RuntimeException e) {
//            System.err.println("catch RuntimeException");
//        } catch (Exception e) {
//            System.err.println("catch Exception");
//        } catch (Throwable e) {
//            System.err.println("catch Throwable");
//        }
//        System.err.println("next statement");

//        try {
//            System.err.println("try");
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            return;
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            Runtime.getRuntime().exit(42); // синоним System.exit(42);
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            Runtime.getRuntime().halt(42);
//        } finally {
//            System.err.println("finally");
//        }

//        try {
//            System.err.println("try");
//            if (true) {throw new RuntimeException();}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");

//        try {
//            System.err.println("try");
//            throw new RuntimeException();
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");

//        try {
//            System.err.println("try");
//            if (true) {return;}
//        } finally {
//            System.err.println("finally");
//        }
//        System.err.println("more");

//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            return 1;
//        }
//    }

//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new RuntimeException();
//        } finally {
//            return 1;
//        }
//    }

//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            return 0;
//        } finally {
//            throw new RuntimeException();
//        }
//    }

//        System.err.println(f());
//    }
//    public static int f() {
//        try {
//            throw new Error();
//        } finally {
//            throw new RuntimeException();
//        }
//    }

//        Lock lock = new ReentrantLock(); // освобождение блокировки
//        ...
//        lock.lock();
//        try {
//            // some code
//        } finally {
//            lock.unlock();
//        }

//        InputStream input = new FileInputStream("..."); // закрытие открытого файлового потока
//        try {
//            // some code
//        } finally {
//            input.close();
//        }

//        try {
//            System.err.print(" 0");
//            // nothing
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");

//        try {
//            System.err.print(" 0");
//            if (true) {throw new Error();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");

//        try {
//            System.err.print(" 0");
//            if (true) {throw new RuntimeException();}
//            System.err.print(" 1");
//        } catch(Error e) {
//            System.err.print(" 2");
//        } finally {
//            System.err.print(" 3");
//        }
//        System.err.print(" 4");

//        try {
//            try {
//                try {
//                    ...
//                } catch (Exception e) {
//                } finally {}
//            } catch (Exception e) {
//            } finally {}
//        } catch (Exception e) {
//        } finally {}

//        try {
//            try {
//                ...
//            } catch (Exception e) {
//                ...
//            } finally {
//                ...
//            }
//        } catch (Exception e) {
//            try {
//                ...
//            } catch (Exception e) {
//                ...
//            } finally {
//                ...
//            }
//        } finally {
//            try {
//                ...
//            } catch (Exception e) {
//                ...
//            } finally {
//                ...
//            }
//        }

//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                // НИЧЕГО
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - нет исключения
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // НЕ заходим - нет исключения
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение в норме

//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new RuntimeException();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // ЗАХОДИМ - есть исключение
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // заходим - выполнение УЖЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - нет исключения, УЖЕ перехвачено
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме

//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Exception();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // не заходим - выполнение НЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // ЗАХОДИМ - есть подходящее исключение
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // заходим - выполнение УЖЕ в норме

//        try {
//            System.err.print(" 0");
//            try {
//                System.err.print(" 1");
//                if (true) {throw new Error();}
//                System.err.print(" 2");
//            } catch (RuntimeException e) {
//                System.err.print(" 3"); // НЕ заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//            } finally {
//                System.err.print(" 4"); // заходим всегда
//            }
//            System.err.print(" 5");     // НЕ заходим - выполнение НЕ в норме
//        } catch (Exception e) {
//            System.err.print(" 6");     // не заходим - есть исключение, но НЕПОДХОДЯЩЕГО ТИПА
//        } finally {
//            System.err.print(" 7");     // заходим всегда
//        }
//        System.err.print(" 8");         // не заходим - выполнение НЕ в норме


    }
}