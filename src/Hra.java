import java.util.Scanner;

public class Hra {
    static Scanner sc = new Scanner(System.in);
    //zacatek
    public int item1;
    public int cesta1;
    //posedle mestecko
    public int item2;
    public int posedlemesteckodum;
    public int kouzla;
    public boolean kouzlo1;
    public boolean kouzlo2;
    public boolean kouzlo3;

    //machaniky
    public int zivoty;
    public boolean klicodbrany;



    public void prolog(){
        System.out.println(" ");
        System.out.println("Ahoj poutníku.");
        System.out.println(" ");
        System.out.println("Ocitl jsi se v temném lese a musíš se dostat ven.");
        System.out.println("V lese se nachází mnoho nebezpečí, proto jsem ti na začátek dal tři životy. V nebezpečném lese se nacházejí i ty, které vám seberou životy všechny. ");
        System.out.println(" ");
        System.out.println("A teď si představíme mechaniku výběru.");
        System.out.println("Před tebou leží tři předměty.");
        System.out.println("Vyber si pečlivě.");
        System.out.println(" ");
        System.out.println("1. Lampa");
        System.out.println("2. Meč");
        System.out.println("3. Teplý kabát");
        System.out.println(" ");
        item1 = sc.nextInt();
        sc.nextLine();
        if (item1 == 1) {
            System.out.println("Vybral jsi si Lampu.");
        }
        if (item1 == 2) {
            System.out.println("Vybral jsi si Meč.");
        }
        if (item1 == 3) {
            System.out.println("Vybral jsi si Teplý kabát.");
        }
        System.out.println(" ");
        System.out.println("Teď už znáš mechaniky a dobrodružství začíná.");
    }



    public void core(){
        zivoty = 3;
        System.out.println(" ");
        System.out.println("Ocitl jsi se na rozcestí.");
        System.out.println("Rozhodni se kam půjdeš.");
        System.out.println("Pamatuj, tvoje předešlé rozhodnutí mohou ovlivnit odvíjeni příběhu.");
        System.out.println(" ");
        System.out.println("1. Cesta vlevo, která vede do mlhy.");
        System.out.println("2. Cesta přímo, která je zarostlá keři.");
        System.out.println("3. Cesta vpravo, která je zamrzlá.");
        System.out.println(" ");
        cesta1 = sc.nextInt();
        sc.nextLine();
        switch (cesta1) {
            case 1:
                if (item1 == 1) {
                    System.out.println("Mlhou jsi prošel bez problémů, díky tvé lampě.");
                    System.out.println(" ");
                }
                if (item1 == 2) {
                    System.out.println("V mlze jsi se ztratil a noc byla studená .");
                    System.out.println("Skoro jsi umrzl.");
                    System.out.println(" ");
                    zivoty = 1;
                }
                if (item1 == 3) {
                    System.out.println("V mlze jsi se ztratil a noc byla studená.");
                    System.out.println("Díky málem jsi jí nepřežil ale teplý kabát ti pomohl.");
                    System.out.println("Ztratil jsi jeden život.");
                    System.out.println(" ");
                    zivoty = 2;
                }
                this.konecHry();
                break;
                case 2:
                    if (item1 == 1) {
                        System.out.println("Keře jsi ohněm z lampy spálil, ale v procesu jsi se spálil.");
                        System.out.println("Ztratil jsi jeden život.");
                        System.out.println(" ");
                        zivoty = 2;
                    }
                    if (item1 == 2) {
                        System.out.println("Mečem jsi keře posekal a dostal jsi se na druhou stranu.");
                        System.out.println(" ");
                    }
                    if (item1 == 3) {
                        System.out.println("Snažíš se přes keře dostat, ale zasekneš se a umíráš");
                        System.out.println(" ");
                        zivoty = 0;
                    }
                    this.konecHry();
                    break;
                    case 3:
                        if (item1 == 1) {
                            System.out.println("Ohněm z lampy jsi se na cestě ohřál ale zima byla silná.");
                            System.out.println("Ztratil jsi jeden život.");
                            System.out.println(" ");
                            zivoty = 2;
                        }
                        if (item1 == 2) {
                            System.out.println("Meč ti na cestě nepomáhá a umíráš.");
                            System.out.println("Umrzl jsi");
                            System.out.println(" ");
                        }
                        if (item1 == 3) {
                            System.out.println("Kabát tě na cestě ochránil a prošel jsi zamrzlou krajinou bez problémů.");
                            System.out.println(" ");
                        }
                        this.konecHry();
                        break;
        }
        if (cesta1 == 1){
            this.posedleMestecko();
        }
        if (cesta1 == 2){
            this.zarostlaBazina();
        }
        if (cesta1 == 3){
            this.zmrzlePlaniny();
        }
    }




    public void posedleMestecko(){
        System.out.println(" ");
        System.out.println("Před tebou se objevilo prázdné městečko vypadá, jako by bylo posedlé.");
        System.out.println(" ");
        System.out.println("Před tebou leží tři předměty.");
        System.out.println("Vybírej s rozumen.");
        System.out.println(" ");
        System.out.println("1. Kouzelná hůlka");
        System.out.println("2. Neviditelný plášť");
        System.out.println("3. Kámen vzkříšení");
        System.out.println(" ");
        item2 = sc.nextInt();
        sc.nextLine();
        switch (item2) {
            case 1:
                System.out.println("Vybral jsi si Kouzelnou hůlku.");
                break;
                case 2:
                    System.out.println("Vybral jsi si Neviditelný plášť.");
                    break;
                    case 3:
                        System.out.println("Vybral jsi si Kámen vzkříšení.");
                        break;
        }
        this.posedleMesteckoNamesti();
    }
    public void posedleMesteckoNamesti(){
        System.out.println("Došel jsi na náměstí.");
        System.out.println("Spatřil jsi 4 domy.");
        System.out.println(" ");
        System.out.println("Který prozkoumáš?.");
        System.out.println(" ");
        System.out.println("1. Rozpadlá Chata");
        System.out.println("2. Zabedněný dům");
        System.out.println("3. Tajemná jeskyně");
        System.out.println("4. Hospoda");
        System.out.println(" ");
        posedlemesteckodum = sc.nextInt();
        sc.nextLine();
        switch (item2) {
            case 1:
                this.posedleMesteckoRozpadlaChata();
                break;
            case 2:
                this.posedleMesteckoZabednenyDum();
                break;
            case 3:
                this.posedleMesteckoTajemnaJeskyne();
                break;
            case 4:
                this.posedleMesteckoHospoda();
                break;
        }

    }


    public void posedleMesteckoRozpadlaChata(){
        System.out.println(" ");
        System.out.println("Vešel jsi do rozpadlé chaty.");
        System.out.println("V rohu místnosti stojí stará čarodějnice.");
        System.out.println(" ");
        if (item2 == 1){
            System.out.println("Otočila se a zeptala se tě: 'Máš kouzelnou hůlku? Ano? Tak to ti můžu pomoct s učením kouzel.'");

            System.out.println("Jaké kouzlo se chceš naučit? (naučit se můžeš všechny)");
            System.out.println(" ");
            System.out.println("1. Silné kouzlo");
            System.out.println("(Kouzlo je silné ale nejde rychle vyslovit)");
            System.out.println("2. Rychlé kouzlo");
            System.out.println("(Kouzlo jde rychle vyslovit ale není tak silné) ");
            System.out.println("3. Kouzlo zpomalení");
            System.out.println("(Kouzlo zpomalí útočníka a dává ti čas na útěk) ");
            kouzla = sc.nextInt();
            sc.nextLine();
            switch (kouzla) {
                case 1:
                    System.out.println("Naučil jsi se silné kouzlo.");
                    kouzlo1 = true;
                    break;
                case 2:
                    System.out.println("Naučil jsi se rychlé kouzlo.");
                    kouzlo2 = true;
                    break;
                case 3:
                    System.out.println("Naučil jsi se kouzlo zpomalení. ");
                    kouzlo3 = true;
                    break;
            }
            this.posedleMesteckoNamesti();
        }else{
            System.out.println(" ");
            System.out.println("Otočila se a zeptala se tě: 'Máš kouzelnou hůlku? Ne? Tak to ti nemám s čím pomoct.'");
            System.out.println("Vrátil jsi se na náměstí.");
            System.out.println(" ");
            this.posedleMesteckoNamesti();
        }
    }


    public void posedleMesteckoZabednenyDum(){

    }


    public void posedleMesteckoTajemnaJeskyne(){

    }


    public void posedleMesteckoHospoda(){

    }



    public void zarostlaBazina(){

    }
    public void zmrzlePlaniny(){

    }
    public void zniceneMesto(){

    }
    public void dobryKonec(){
        System.out.println("Došel jsi k velké bráně.");
        if (klicodbrany){
            System.out.println("Máš u sebe klíč a dostal jsi se z lesa.");
        }else{
            System.out.println("Nemáš u sebe klíč a nemůžeš se dostat z lesa.");
            System.out.println("Na zemi jsi našel mapu a sebral jsi jí.");

        }
    }
    public void konecHry(){
        if (zivoty == 0) {
            if (item2 == 3){
                System.out.println("Někdo na tebe pužil kámen vzkřísení a probudil jsi se v Posedlém městečku.");
                this.posedleMestecko();
            }else{
                System.out.println("Ztratil jsi všechny svoje životy a hra končí.");
                this.core();
                this.dobryKonec();
                }
        }
    }
    public void pocetZivotu(){
        System.out.println("Máš "+zivoty+" životů.");
    }
}