public class Medic extends Hero implements HavingSuperAbility{
int HealPoints;



 void increaseExperience(){
     if (HealPoints<0){
         HealPoints = (HealPoints+=10);
         System.out.println("Heal points:"+HealPoints);

     }
    }


    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность лечение");
    }

}
