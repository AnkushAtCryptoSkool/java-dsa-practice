package singleton;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton(){
        // private constructor
    }
    private static class SingletonHelper{
//        TODO :: How the Static Inner Class Ensures Thread Safety:
//        Class Loading in Java is handled by the JVM (Java Virtual Machine) and
//        is thread-safe by default. This means when a class (like our SingletonHelper) is loaded, only one thread will complete that process.
//        The SingletonHelper inner class holds the singleton instance and is only loaded once
//                when the getInstance() method is called the first time. After that, the instance is safely reused.
//        So, the JVM guarantees that only one instance is created, even if multiple threads try to access it at the same time,
//        making it thread-safe without extra synchronization.
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
//        The private keyword ensures that no other class can directly access or modify the INSTANCE variable
//        The static keyword ensures that the INSTANCE variable belongs to the class itself, not any particular object of the class.
//        The final keyword ensures that the INSTANCE variable cannot be reassigned after it is initialized.
//        This guarantees immutability, meaning the Singleton instance will always refer to the same object once it's created.
//        No other code can accidentally or intentionally change the reference to a new object, maintaining the integrity of the Singleton pattern.

    }
    public static ThreadSafeSingleton getInstance(){
       return SingletonHelper.INSTANCE;
    }
}
