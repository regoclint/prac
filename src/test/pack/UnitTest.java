package pack;

import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Test;

public class UnitTest {

    @Test
    void testing(){
//        Test t=new Test();
        Interval t=new Interval();
        Interval t2=new Interval(3,2);
        Assert.check(t.print(5)==2);
//        Assert.check(t.print(6)==5);
//        Assert.check(t.print(7)==5);
        Assert.check(t.print(1)==1);

    }
}
