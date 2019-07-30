package patterns;

public class FighterFactoryPattern {

    public Fighter getFighter(String fighterName, JumpBehavior jumpBehavior,KickBehavior kickBehavior){
        if(fighterName.equals("Ken"))
            return Ken.getInstance(kickBehavior,jumpBehavior);
        if(fighterName.equals("ChunLi"))
            return new ChunLi(kickBehavior,jumpBehavior);
        if(fighterName.equals("Ryu"))
            return new Ryu(kickBehavior,jumpBehavior);
        return null;
    }
}
