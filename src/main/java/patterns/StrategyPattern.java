package patterns;

// Encapsulated jump behaviors
interface JumpBehavior
{
    public void jump();
}
class ShortJump implements JumpBehavior
{
    public void jump()
    {
        System.out.println("Short Jump");
    }
}
class LongJump implements JumpBehavior
{
    public void jump()
    {
        System.out.println("Long Jump");
    }
}

interface KickBehavior
{
    public void kick();
}
class LightningKick implements KickBehavior
{
    public void kick()
    {
        System.out.println("Lightning Kick");
    }
}
class TornadoKick implements KickBehavior
{
    public void kick()
    {
        System.out.println("Tornado Kick");
    }
}
abstract class Fighter
{
    KickBehavior kickBehavior;
    JumpBehavior jumpBehavior;

    public Fighter(){}
    public Fighter(KickBehavior kickBehavior,
                   JumpBehavior jumpBehavior)
    {
        this.jumpBehavior = jumpBehavior;
        this.kickBehavior = kickBehavior;
    }
    public void roll()
    {
        System.out.println("Default Roll");
    }
    public void punch()
    {
        System.out.println("Default Punch");
    }
    public void kick()
    {
        // delegate to kick behavior
        kickBehavior.kick();
    }
    public void jump()
    {
        // delegate to jump behavior
        jumpBehavior.jump();
    }
    public void setKickBehavior(KickBehavior kickBehavior)
    {
        this.kickBehavior = kickBehavior;
    }
    public void setJumpBehavior(JumpBehavior jumpBehavior)
    {
        this.jumpBehavior = jumpBehavior;
    }
    public abstract void display();
}

// Characters
class Ryu extends Fighter
{

    public Ryu(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("Ryu");
    }
}

//Singleton Ken
class Ken extends Fighter
{
    static Ken obj;
    private Ken(){}

    synchronized static Ken getInstance(KickBehavior kickBehavior,
                           JumpBehavior jumpBehavior){
        if(obj==null)
            return obj=new Ken(kickBehavior,jumpBehavior);
        else
            return obj;
    }
    private Ken(KickBehavior kickBehavior,
               JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }

    public void display()
    {
        System.out.println("Ken");
    }
}

class ChunLi extends Fighter
{
    public ChunLi(KickBehavior kickBehavior,
                  JumpBehavior jumpBehavior)
    {
        super(kickBehavior,jumpBehavior);
    }
    public void display()
    {
        System.out.println("ChunLi");
    }
}

public class StrategyPattern {

    public static void main(String args[])
    {
        // let us make some behaviors first
        JumpBehavior shortJump = new ShortJump();
        JumpBehavior LongJump = new LongJump();
        KickBehavior tornadoKick = new TornadoKick();

        // Make a fighter with desired behaviors
        FighterFactoryPattern fighterFactory=new FighterFactoryPattern();
        Fighter ken = fighterFactory.getFighter("Ken",shortJump,tornadoKick);
        Fighter ken2 = fighterFactory.getFighter("Ken",shortJump,tornadoKick);
        Fighter ChunLi = fighterFactory.getFighter("ChunLi",shortJump,tornadoKick);
        ken.display();

        // Test behaviors
        ken.punch();
        ken.kick();
        ken.jump();

        // Change behavior dynamically (algorithms are
        // interchangeable)
        ken.setJumpBehavior(LongJump);
        ken.jump();

    }
}
