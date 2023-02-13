import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pokemon{
    public static int count = 0;
    private String owner;
    private String[] skills;
    private String name;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(String owner, String skills){
        this.owner = owner;
        count = count + 1;
        this.skills = skills.split("/");


    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    public void info(){
        int idx = 0;
        System.out.printf("%s의 포켓몬이 사용 가능한 스킬\n", this.getOwner());
        for(String skill : skills){
            System.out.println(++idx + " : " + skill);
        }
    }

    public void attack(int idx){
        System.out.printf("%s 공격 시전!", getSkills()[idx]);
    }

}  // end of class Pokemon

class Pikachu extends Pokemon{
    public Pikachu(String owner, String skills){
        super(owner, skills);
        this.setName("피카츄") ;
        System.out.println(this.getName());
    }

    public void attack(int idx){
        System.out.printf("[피카피카] %s의 %s가 %s 공격(전기) 시전!\n", this.getOwner(), this.getName(), getSkills()[idx]);
    }
}  // end of class Pikachu

class Ggoboogi extends Pokemon{
    public Ggoboogi(String owner, String skills){
        super(owner, skills);
        this.setName("꼬부기") ;
        System.out.println(this.getName());
    }

    public void attack(int idx){
        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격(물) 시전!\n", this.getOwner(), this.getName(), this.getSkills()[idx]);
    }
}  // end of class Ggoboogi

class Pairi extends Pokemon{
    public Pairi(String owner, String skills){
        super(owner, skills);
        this.setName("파이리") ;
        System.out.println(this.getName());
    }

    public void attack(int idx){
        System.out.printf("[파일파일] %s의 %s가 %s 공격(불) 시전!\n", this.getOwner(), this.getName(), this.getSkills()[idx]);
    }
}  // end of class Ggoboogi



public class FIRST {
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Pokemon user ;
        while (true){
            System.out.printf("총 %d마리의 포켓몬이 생성되었습니다.\n", Pokemon.count);
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료  : ");
            String choice = sc.nextLine();
            if (choice.equals("2")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (choice.equals("1")) {
                System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 : ");
                String pokemon = sc.nextLine();
                System.out.print("플레이어 이름 입력 : ");
                String name = sc.nextLine();
                System.out.print("사용 가능한 기술 입력 (/로 구분하여 입력) : ");
                String skills = sc.nextLine();
                if (pokemon.equals("1"))
                    user = new Pikachu(name, skills);
                else if (pokemon.equals("2"))
                    user = new Ggoboogi(name, skills);
                else if (pokemon.equals("3"))
                    user = new Pairi(name, skills);
                else {
                    System.out.println("메뉴에서 골라주세요.");
                    continue;
                }
                user.info();
                System.out.print("공격 번호 선택 : ");
                int attackMenu = sc.nextInt();
                sc.nextLine();
                user.attack(attackMenu - 1);
            }
            else
                System.out.println("메뉴에서 골라주세요");

        }  //while

    }
}