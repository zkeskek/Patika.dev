import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out
                .println("Dikkatli ol ! Burada " + obsNumber + " tane " + this.getObstacle().getName() + " yaşıyor !");
        System.out.print("<S> Savaş <K> Kaç");
        System.out.print("Bir seçim yapınız : ");
        String selectionCase = input.nextLine().toUpperCase();

        if (selectionCase.equals("S")) {
            if (combat(obsNumber)) {
                System.out.println(this.getName() + " Tüm düşmanları yendiniz.");
                return true;
            }
        }
        if (this.getPlayer().getHealth() <=0) {
            System.out.println(" Öldünüz !");
            return false;
        }

        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealt());
            playerStats();
            obstacleStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                System.out.println();
                System.out.println("<V>ur veya <K>aç : ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("siz vurdunuz !");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDemage());
                    afterHit();
                    if (this.getObstacle().getHealth() > 0) {
                        System.out.println();
                        System.out.print("Canavar size vurdu !");
                        int obstacleDamage = this.getObstacle().getDamage()
                                - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamage < 0) {
                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if(this.getObstacle().getHealth()<this.getPlayer().getHealth()){
                System.out.println("Düşmanı yendiniz");
                System.out.println(this.getObstacle().getAward()+" Para kazandınız.");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                System.out.println("Güncel paranız : "+this.getPlayer().getMoney());
                
            }else{
                return false;
            }
        }
        return true;
    }

    private void afterHit() {
        System.out.println("Canınız : " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " canı " + this.getObstacle().getHealth());
        
        
    }

    private void obstacleStats(int i) {
        System.out.println();
        System.out.println(i + ".ci " + this.getObstacle().getName() + " değerleri.");
        System.out.println("------------------------------");
        System.out.print("Sağlık : " + this.getObstacle().getHealth());
        System.out.print(" Hasar : " + this.getObstacle().getDamage());
        System.out.print(" Ödül : " + this.getObstacle().getAward());

    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri ");
        System.out.println("------------------------------");
        System.out.print("Sağlık : " + this.getPlayer().getHealth());
        System.out.print(" Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.print(" Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.print(" Bloklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.print(" Hasar : " + this.getPlayer().getTotalDemage());
        System.out.print(" Para : " + this.getPlayer().getMoney());

    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

}
