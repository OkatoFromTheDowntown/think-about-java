package test.java.alarm;

import main.java.alarm.Alarm;
import main.java.alarm.WorldClock;

public class AlarmTest {
    public static void main(String[] args) throws ClassCastException {

        WorldClock clock = new WorldClock();

        Alarm alarm1 = new Alarm(clock);
        Alarm alarm2 = new Alarm(clock);
        Alarm alarm3 = new Alarm(clock);

        clock.alarm();

        AlarmTest test = new AlarmTest();

        // try to testing the superclass and subclass
        A a = test.new A();
        B b = test.new B();
        A c = test.new A();
        B d = test.new B();
        A e = test.new B();

        a.name = "nameA";
        a.age = "1";

        b.setName("nameB");
        b.setAge("2");

        e.setName("nameE");
        e.setAge("3");

        c = b;

//        d = (B) a; // ERROR!
        d = (B) e;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public class A {
       private String name;
       private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + ", " + this.age;
        }
    }

    public class B extends A {}

}

