package TugasPraktikum08;

class Titan extends Character {
    public Titan(){
        setHP(200);
        setAttack(45);
    }
 
 @Override
    public boolean attack() {
        int randValue = (int) (Math.random() * 100) + 1;
        if(randValue <= 40){
            return true;
        }else{
            return false;
        }
    }
 
 @Override
    public void info() {
        super.info();
        System.out.println("Role\t: Titan");
        System.out.println("HP\t: " + getHP());
        System.out.println("Attack\t: " + getAttack());
        System.out.println("Defense\t: " + getDefense());
    }
}
