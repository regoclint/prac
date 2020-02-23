package patterns;

interface Phone {

    String build();
}

abstract class SmartPhone implements Phone {

    private final Phone phone;

    public SmartPhone(Phone phone) {
        this.phone = phone;
    }

    public String build() {
        return phone.build();
    }
}

class BasicPhone implements Phone {
    @Override
    public String build() {
        return "Screen, Battery, Processor";
    }
}

class AndroidPhone extends SmartPhone {
    public AndroidPhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return " Android OS v6.0";
    }
}

class ApplePhone extends SmartPhone {
    public ApplePhone(Phone phone) {
        super(phone);
    }

    @Override
    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return " IOS v1.0";
    }
}

class WindowsPhone extends SmartPhone {
    public WindowsPhone(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addOS();
    }

    private String addOS() {
        return " Windows Phone v1.0";
    }

}

class NokiaPhone extends SmartPhone {
    public NokiaPhone(Phone phone) {
        super(phone);
    }

    public String build() {
        return super.build() + addBranding();
    }

    private String addBranding() {
        return " Microsoft Phone";
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {

        Phone androidPhone = new AndroidPhone(new BasicPhone());
        System.out.println(androidPhone.build());

        Phone applePhone = new ApplePhone(new BasicPhone());
        System.out.println(applePhone.build());

        Phone nokiaWindowsPhone = new NokiaPhone(new WindowsPhone(new BasicPhone()));
        System.out.println(nokiaWindowsPhone.build());

        Phone nokiaAndroidPhone = new NokiaPhone(new AndroidPhone(new BasicPhone()));
        System.out.println(nokiaAndroidPhone.build());
    }
}
