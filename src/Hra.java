import java.util.Scanner;

public class Hra {
    static Scanner sc = new Scanner(System.in);



    //zacatek
    public int item1;
    public int cesta1;

    //posedle mestecko
    public int item2;
    public int posedlemesteckodum;

        //rozpadla chata
        public int rozpadlachata;
        public int kouzla;
        public int kouzlo;

        //zabedneny dum
        public int zabednenydum;
        public int mladymuz;
        public int unlockstaryhrad;
        public String jmeno;

        //tajemna jeskyne
        public int tajemnajeskyne;
        public int skret;

        //hospoda
        public int hospoda;
        public int rytir;

        //bonusove lokace
        public int staryhrad;

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
    }//hotovo



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
            this.hustyLes();
        }
        if (cesta1 == 3){
            this.zmrzlePlaniny();
        }
    }//hotovo



    //posedle mestecko
    public void posedleMestecko(){
        System.out.println(" ");
        System.out.println("Před tebou se objevilo prázdné městečko vypadá, jako by bylo posedlé.");
        System.out.println(" ");
        System.out.println("Před tebou leží tři předměty.");
        System.out.println("Vybírej s rozumen.");
        System.out.println(" ");
        System.out.println("1. Kouzelná hůlka");
        System.out.println("2. Neviditelný plášť");
        System.out.println("3. Tajemný kámen");
        System.out.println(" ");
        item2 = sc.nextInt();
        sc.nextLine();
        switch (item2) {
            case 1:
                System.out.println("Vybral jsi si Kouzelnou hůlku.");
                System.out.println("(Prozkoumej městečko a zjisti o ní víc informací)");
                break;
                case 2:
                    System.out.println("Vybral jsi si Neviditelný plášť.");
                    System.out.println("(Prozkoumej městečko a zjisti o něm víc informací)");
                    break;
                    case 3:
                        System.out.println("Vybral jsi si Kámen vzkříšení.");
                        System.out.println("(Prozkoumej městečko a zjisti o něm víc informací)");
                        break;
        }
        this.posedleMesteckoNamesti();
    }//hotovo
    public void posedleMesteckoNamesti(){
        System.out.println("Došel jsi na náměstí.");
        System.out.println("Spatřil jsi 4 domy.");
        System.out.println(" ");
        System.out.println("Který prozkoumáš?.");
        System.out.println(" ");
        if (rozpadlachata == 1 && zabednenydum == 1 && tajemnajeskyne == 1 && hospoda == 1){
            System.out.println("1. Rozpadlá Chata");
            System.out.println("2. Zabedněný dům");
            System.out.println("3. Tajemná jeskyně");
            System.out.println("4. Hospoda");
            System.out.println("5. Cesta do lesa");
            System.out.println(" ");
            posedlemesteckodum = sc.nextInt();
            sc.nextLine();
            switch (posedlemesteckodum) {
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
                case 5:
                    this.cestaDoLesa();
                    break;

            }
        }else if(unlockstaryhrad == 2){
            System.out.println("1. Rozpadlá Chata");
            System.out.println("2. Zabedněný dům");
            System.out.println("3. Tajemná jeskyně");
            System.out.println("4. Hospoda");
            System.out.println("5. Cesta do lesa");
            System.out.println("6. Starý hrad");
            System.out.println(" ");
            posedlemesteckodum = sc.nextInt();
            sc.nextLine();
            switch (posedlemesteckodum) {
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
                case 5:
                    this.cestaDoLesa();
                    break;
                case 6:
                    this.posedleMesteckoStaryHrad();
                    break;
            }
        }else{
            System.out.println("1. Rozpadlá Chata");
            System.out.println("2. Zabedněný dům");
            System.out.println("3. Tajemná jeskyně");
            System.out.println("4. Hospoda");
            System.out.println(" ");
            posedlemesteckodum = sc.nextInt();
            sc.nextLine();
            switch (posedlemesteckodum) {
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

    }//hotovo


    public void posedleMesteckoRozpadlaChata(){
        rozpadlachata = 1;
        System.out.println(" ");
        System.out.println("Vešel jsi do rozpadlé chaty.");
        System.out.println("V rohu místnosti stojí stará čarodějnice.");
        System.out.println(" ");
        if (item2 == 1){
            System.out.println("Otočila se a zeptala se tě: 'Máš kouzelnou hůlku? Ano? S hůlkou se můžeš naučit mnoho kouzel. A stím ti můžu pomoct.'");

            System.out.println("Jaké kouzlo se chceš naučit?");
            System.out.println(" ");
            System.out.println("1. Silné kouzlo");
            System.out.println("(Kouzlo je silné ale nejde rychle vyslovit.)");
            System.out.println("2. Rychlé kouzlo");
            System.out.println("(Kouzlo jde rychle vyslovit ale není tak silné.) ");
            System.out.println("3. Kouzlo zpomalení");
            System.out.println("(Kouzlo zpomalí útočníka a dává ti čas na útěk.) ");
            kouzla = sc.nextInt();
            sc.nextLine();
            switch (kouzla) {
                case 1:
                    System.out.println("Naučil jsi se silné kouzlo.");
                    kouzlo = 1;
                    break;
                case 2:
                    System.out.println("Naučil jsi se rychlé kouzlo.");
                    kouzlo = 2;
                    break;
                case 3:
                    System.out.println("Naučil jsi se kouzlo zpomalení. ");
                    kouzlo = 3;
                    break;
            }
            this.posedleMesteckoNamesti();
        }else{
            System.out.println(" ");
            System.out.println("Otočila se a zeptala se tě: 'Máš kouzelnou hůlku? Ne? Tak to ti nemám s čím pomoct. Možná ti pomůžou jíní obyvatelé našeho městečka.'");
            System.out.println(" ");
            System.out.println("Vrátil jsi se na náměstí.");
            System.out.println(" ");
            this.posedleMesteckoNamesti();
        }
    }//hotovo
    public void posedleMesteckoZabednenyDum(){
        zabednenydum = 1;
        System.out.println(" ");
        System.out.println("Vešel jsi do zabedněného domu.");
        System.out.println("U stolu sedí mladý muž s jehou dcerou.");
        System.out.println("Řekl ti: 'Ahoj, jmenuji se Petr. Jak se jmenuješ ty?'");
        jmeno = sc.nextLine();
        System.out.println(jmeno+", pěkné jméno. Přisedni si.");
        System.out.println("Sedneš si s nimi ke stolu?");
        System.out.println("  ");
        System.out.println("1. Ano");
        System.out.println("2. Ne");
        System.out.println("  ");
        mladymuz = sc.nextInt();
        sc.nextLine();
        switch (mladymuz) {
            case 1:
                if (item2 == 2){
                    System.out.println("  ");
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: 'Co to tam máš? Neviditelný plášť? A kde jsi ho našel? Na zemi? " +
                            "Plášť patřil totiž starému čaroději. Bydlel s čarodějnicí v rozpadlé chatě. Když naše městečko napadli zlí duchové, musel s nimi jít bojovat a při boji ho ztratil." +
                            "Kde asi teď je? Jestli ho unesli duchové, tak je určitě na Starém hradě na konci městečka, ale nedoporučuju ti tam chodit bez kouzelné hůlky." +
                            "No nic o tom si můžeme popovídat jindy, ale te ti řeknu něco o neviditelném plášti. Je to velmi vzácná věc a jsou jen 3 na světě. Ve krajních situací ti může pomoci utéct.'");
                    System.out.println("  ");
                    System.out.println("Odešel jsi ze zabedněného domu.");
                    this.posedleMesteckoNamesti();
                }else if (item2 == 1){
                    unlockstaryhrad = 1;
                    System.out.println("  ");
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: 'Máš kouzelnou hůlku? Ano? Tak to už můžeš bez problémů zachránit starého čaroděje. Unesli ho duchové. A k jeho vysvobození jí potřebuješ.'");
                    System.out.println("  ");
                    System.out.println("Odešel jsi ze zabedněného domu.");
                }else{
                    System.out.println("  ");
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: 'Máš neviditelný plášť? Ne? Tak to ti nemůžu pomoci.'");
                    System.out.println("  ");
                    System.out.println("Odešel jsi ze zabedněného domu.");
                }
                break;
            case 2:
                System.out.println("  ");
                System.out.println("Odešel jsi ze zabedněného domu.");
                System.out.println("  ");
                this.posedleMesteckoNamesti();
                break;

        }

    }//hotovo
    public void posedleMesteckoTajemnaJeskyne(){
        tajemnajeskyne = 1;
        System.out.println(" ");
        System.out.println("Vešel jsi do tajemné jeskyně.");
        System.out.println("Na zemi sedí malý skřet.");
        System.out.println("Chceš s ním mluvit?");
        System.out.println(" ");
        System.out.println("1. Ano");
        System.out.println("2. Ne");
        skret = sc.nextInt();
        sc.nextLine();
        switch (skret) {
            case 1:
                System.out.println(" ");
                System.out.println("Promluvi jsi na skřeta a on na tebe vyskočil.");
                System.out.println("Setřásl jsi ho ze sebe a on říká: 'Pardón pane já nerchtěl. Za to moho ti duchové , kteří posedli naše městečko." +
                        "Moc se jich bojím a myslel jsem že jste duch. Co to držíte v ruce? Káme, který jste našel, když jsi vešel do městečka? Zajímavé." +
                        "Já ten kámen znám! To je kámen vzkřísení. Můžeš jím oživit kohokoliv, kdo zemřel. Použij ho dobře.'");
                System.out.println(" ");
                System.out.println("Skřeta jsi po tomto rozhovoru nechal být a odešel jsi z jeskyně.");
                this.posedleMesteckoNamesti();
                break;
            case 2:
                System.out.println("Skřeta jsi nechal být a odešel jsi z jeskyně.");
                this.posedleMesteckoNamesti();
                break;
        }

    }
    public void posedleMesteckoHospoda(){
        hospoda = 1;
        System.out.println("  ");
        System.out.println("Vešel jsi do hospody.");
        System.out.println("U stolu sedí mladý rytíř.");
        System.out.println("Chceš k němu jít?");
        System.out.println("  ");
        System.out.println("1. Ano");
        System.out.println("2. Ne");
        System.out.println("  ");
        rytir = sc.nextInt();
        sc.nextLine();
        switch (rytir) {
            case 1:
                System.out.println("  ");
                System.out.println("Přišel jsi k rytíři a ten ti řekl: 'Ahoj, už jsi si všiml že je toto městečko posedlé? Ano? Tak co tu děláš? " +
                        "Chceš se dostat z lesa? Tak s tim ti nepomůžu, ale přijď zpátky až se z něho dostaneš. Možná ti pomůžou jíní obyvatelé našeho městečka.'");
                System.out.println("  ");
                this.posedleMesteckoNamesti();
                break;
            case 2:
                System.out.println("  ");
                System.out.println("Odešel jsi z hospody.");
                System.out.println("  ");
                this.posedleMesteckoNamesti();
                break;
        }

    }//hotovo (v end gamu se rozšíří)
    //bonusova lokace (posedle mestecko)
    public void posedleMesteckoStaryHrad(){}//

    //zarostla bazina
    public void hustyLes(){

    }
    //zmrzle planiny
    public void zmrzlePlaniny(){

    }
    public void cestaDoLesa(){}
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
                System.out.println("Ztratil jsi všechny svoje životy a přišel jsi o myšlenky.");
                this.prolog();
                }
        }
    }
    public void pocetZivotu(){
        System.out.println("Máš "+zivoty+" životů.");
    }
}