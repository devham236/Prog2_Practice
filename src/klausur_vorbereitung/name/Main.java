package klausur_vorbereitung.name;

public class Main{
    public static void main(String[] args){
        KlasseA ka1 = new KlasseA();
        ka1.setName("Hamza");

        KlasseA ka2 = new KlasseA();
        ka2.setName("Max");

        KlasseA[] classA = new KlasseA[2];
        classA[0] = ka1;
        classA[1] = ka2;

        System.out.println("Klasse A: ");
        for(int i = 0; i < classA.length; i++){
            System.out.println(classA[i].getName());
        }

        KlasseB kb1 = new KlasseB();
        kb1.setName("Ahmed");

        KlasseB kb2 = new KlasseB();
        kb2.setName("Neslihan");

        KlasseB[] classB = new KlasseB[2];
        classB[0] = kb1;
        classB[1] = kb2;

        System.out.println("Klasse B: ");
        for(int i = 0; i < classB.length; i++){
            System.out.println(classB[i].getName());
        }

        System.out.println("Klasse C: ");
        Nameable[] classC = new Nameable[4];
        classC[0] = ka1;
        classC[1] = ka2;
        classC[2] = kb1;
        classC[3] = kb2;

        for (int i = 0; i < classC.length; i++) {
            System.out.println(classC[i].getName());
        }
    }
}