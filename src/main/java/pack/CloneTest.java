package pack;

class Test1 implements Cloneable {
    int a, b;

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Test2 implements Cloneable {

    int c, d;
    Test1 test1;

    public Test2(int c, int d, Test1 test1) {
        this.c = c;
        this.d = d;
        this.test1 = test1;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Test2 test2 = (Test2) super.clone(); //shallow copy
        test2.test1 = (Test1) test1.clone(); //deep copy
        return test2;
    }
}


public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test1 test1 = new Test1(1, 2);
        Test2 test2 = new Test2(3, 4, test1);
        test1.a = 11;
        test1.b = 22;
        Test1 cloneTest1 = (Test1) test1.clone();
//        System.out.println(cloneTest1.a);
//        System.out.println(cloneTest1.b);
//        System.out.println(test1.a);
//        System.out.println(test1.b);

        test1.a = 111;
        Test2 cloneTest2 = (Test2) test2.clone();
        System.out.println(test2.test1.toString() + " " + test2.test1.a);
        System.out.println(cloneTest2.test1.toString() + " " + cloneTest2.test1.a);
    }
}