import java.util.Scanner;

public class Hra {
    static Scanner sc = new Scanner(System.in);
    public int item1;
    public int rozhodnuti1;
    public int zivoty;
    public boolean klic;
    public void prolog(){
        System.out.println("Ahoj poutníku.");
        System.out.println("Ocitl jsi se v temném lese a musíš se dostat ven.");
        System.out.println("V lese se nachází mnoho nebezpečí, proto jsem ti na začátek dal tři životy. V lese se nacházejí i rozhodnutí, které vám seberou životy všechny. ");
        System.out.println("A teď si představíme mechaniku výběru.");
        System.out.println("Před tebou leží tři předměty.");
        System.out.println("Vyber si pečlivě.");
        System.out.println("1. Lampa");
        System.out.println("2. Meč");
        System.out.println("3. Teplý kabát");
        item1 = sc.nextInt();
        sc.nextLine();
        if (item1 == 1) {
            System.out.println("Vybral jsi si lampu.");
        }
        if (item1 == 2) {
            System.out.println("Vybral jsi si meč.");
        }
        if (item1 == 3) {
            System.out.println("Vybral jsi si mteplý kabát.");
        }
        System.out.println("Teď už znáš mechaniky a hra začíná.");
    }
    public void core(){
        zivoty = 3;
        System.out.println("Ocitl jsi se na rozcestí.");
        System.out.println("Rozhodni se kam půjdeš.");
        System.out.println("Pamatuj, tvoje předešlé rozhodnutí mohou ovlivnit odvíjeni příběhu.");
        System.out.println("1. Cesta vlevo, která vede do mlhy.");
        System.out.println("2. Cesta přímo, která je zarostlá keři.");
        System.out.println("3. Cesta vpravo, která je zamrzlá.");
        rozhodnuti1 = sc.nextInt();
        sc.nextLine();
        switch (rozhodnuti1) {
            case 1:
                if (item1 == 1) {
                    System.out.println("Mlhou jsi prošel bez problémů, díky tvé lampě.");
                }
                if (item1 == 2) {
                    System.out.println("V mlze jsi se ztratil a noc byla studená .");
                    System.out.println("Umrzl jsi");
                    zivoty = 0;
                }
                if (item1 == 3) {
                    System.out.println("V mlze jsi se ztratil a noc byla studená.");
                    System.out.println("Díky málem jsi jí nepřežil ale teplý kabát ti pomohl.");
                    System.out.println("Ztratil jsi jeden život.");
                    zivoty = 2;
                }
                this.konecHry();
                break;
                case 2:
                    if (item1 == 1) {
                        System.out.println("Keře jsi ohněm z lampy spálil, ale v procesu jsi se spálil.");
                        System.out.println("Ztratil jsi jeden život.");
                        zivoty = 2;
                    }
                    if (item1 == 2) {
                        System.out.println("Mečem jsi keře posekal a dostal jsi se na druhou stranu.");
                    }
                    if (item1 == 3) {
                        System.out.println("Snažíš se přes keře dostat, ale zasekneš se a umíráš");
                        zivoty = 0;
                    }
                    this.konecHry();
                    break;
                    case 3:
                        if (item1 == 1) {
                            System.out.println("Ohněm z lampy jsi se na cestě ohřál ale zima byla silná.");
                            System.out.println("Ztratil jsi jeden život.");
                            zivoty = 2;
                        }
                        if (item1 == 2) {
                            System.out.println("Meč ti na cestě nepomáhá a umíráš.");
                            System.out.println("Umrzl jsi");
                        }
                        if (item1 == 3) {
                            System.out.println("Kabát tě na cestě ochránil a prošel jsi zamrzlou krajinou bez problémů.");
                        }
                        this.konecHry();
                        break;
        }
        if (rozhodnuti1 == 1){
            this.posedleMestecko();
        }
        if (rozhodnuti1 == 2){
            this.hustaTrsina();
        }
        if (rozhodnuti1 == 3){
            this.zmrzlePlaniny();
        }
    }
    public void zmrzlePlaniny(){

    }
    public void posedleMestecko(){

    }
    public void hustaTrsina(){

    }
    public void zniceneMesto(){

    }
    public void dobryKonec(){
        System.out.println("Došel jsi k velké bráně.");
        if (klic){
            System.out.println("Máš u sebe klíč a dostal jsi se z lesa.");
        }else{
            System.out.println("Nemáš u sebe klíč a nemůžeš se dostat z lesa.");
            System.out.println("Na zemi jsi našel mapu a nebral jsi jí.");
        }
    }
    public void konecHry(){
        if (zivoty == 0) {
            System.out.println("Ztratil jsi všechny svoje životy a hra končí.");
            this.prolog();
            this.core();
            this.dobryKonec();
        }
    }


}
