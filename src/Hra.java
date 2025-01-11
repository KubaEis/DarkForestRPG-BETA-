import java.util.Scanner;
public class Hra {
    static Scanner sc = new Scanner(System.in);



    //zacatek
    public int item1;

    //posedle mestecko
    public int item2;
    public int posedlemesteckodum;
    public int zlodej;

        //rozpadla chata
        public int rozpadlachata;
            public int carodejnice;
                public int kouzlo;

        //zabedneny dum
        public int zabednenydum;
            public int mladymuz;
            public String jmeno;

        //tajemna jeskyne
        public int tajemnajeskyne;
            public int skret;

        //hospoda
        public int hospoda;
            public int rytir;

        //bonusove lokace
        public int staryhrad;
            public int staryhraddvere;
            public int chodba = 1;
                public int dvere;
                    public int knihovna;
                    public int zbrojnice;
                    public int sklep;
                    public int zlycarodej;
                        public String getZlycarodejtext;


    //machaniky
    public int zivoty;
    public int zlataky;
    public int klicodbrany;


    //začátek
    public void prolog(){
        System.out.println(" ");
        System.out.println("Ahoj poutníku.");
        System.out.println(" ");
        System.out.println("Ocitl jsi se v temném lese a musíš se dostat ven.");
        System.out.println("V lese se nachází mnoho nebezpečí, proto jsem ti na začátek dal tři životy.");
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
        this.core();
    }//hotovo
    public void core(){
        zivoty = 3;
        System.out.println(" ");
        System.out.println("Ocitl jsi se na lesní cestě.");
        System.out.println("Před tebou je cesta, která vede do mlhy.");
        System.out.println(" ");
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
            System.out.println("Málem jsi jí nepřežil ale teplý kabát ti pomohl.");
            System.out.println("Ztratil jsi jeden život.");
            System.out.println(" ");
            zivoty = 2;
        }
        this.kontrolaZivotu();
        this.posedleMestecko();
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
                    this.posedleMesteckoCestaDoLesa();
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
        System.out.println("Chceš k ní jít?");
        System.out.println("  ");
        System.out.println("1. Ano");
        System.out.println("2. Ne");
        System.out.println("  ");
        carodejnice = sc.nextInt();
        sc.nextLine();
        switch (carodejnice) {
            case 1:
                if (item2 == 3 && skret == 1){
                    System.out.println("Otočila se a zeptala se tě: Máš kouzelnou hůlku? Ne? A máš alespoň kámen vzkřísení? Ano? Tak to by jsi mi mohl s něčím pomoct.");
                    System.out.println("Mého manžela odtáhli duchové na starý hrad. Od tamdud se všichni ti duchové vzali. Kámen budeš potřebovat, jen v největší nouzi.");
                    System.out.println("Byl by jsi tak hodný a šel ho zachránit?");
                    System.out.println("  ");
                    System.out.println("1. Ano");
                    System.out.println("2. Ne");
                    System.out.println("  ");
                    staryhrad = sc.nextInt();
                    sc.nextLine();
                    switch (staryhrad) {
                        case 1:
                            this.posedleMesteckoStaryHrad();
                            break;
                            case 2:

                                break;
                    }
                }
                if (item2 == 1){
                    System.out.println("Otočila se a zeptala se tě: Máš kouzelnou hůlku? Ano? S hůlkou se můžeš naučit mnoho kouzel. A stím ti můžu pomoct.");
                    System.out.println("Chceš naučit kouzlo?");
                    System.out.println("  ");
                    System.out.println("1. Ano");
                    System.out.println("2. Ne");
                    System.out.println("  ");
                    /*System.out.println("1. Silné kouzlo");
                    System.out.println("(Kouzlo je silné ale nejde rychle vyslovit.)");
                    System.out.println("2. Rychlé kouzlo");
                    System.out.println("(Kouzlo jde rychle vyslovit ale není tak silné.) ");
                    System.out.println("3. Kouzlo zpomalení");
                    System.out.println("(Kouzlo zpomalí útočníka a dává ti čas na útěk.) ");*/
                    kouzlo = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Naučil jsi se útočné kouzlo.");
                    System.out.println("  ");
                    /*switch (kouzla) {
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
                    }*/
                    this.posedleMesteckoNamesti();
                }else{
                    System.out.println(" ");
                    System.out.println("Otočila se a zeptala se tě: Máš kouzelnou hůlku? Ne? Tak to ti nemám jak pomoct. Možná ti pomůžou jíní obyvatelé našeho městečka.");
                    System.out.println("Přijď ke mě až zjistíš víc informací o tvém předmětu.");
                    System.out.println(" ");
                    System.out.println("Vrátil jsi se na náměstí.");
                    System.out.println(" ");
                    this.posedleMesteckoNamesti();
                }
                break;
            case 2:
                System.out.println("  ");
                System.out.println("Odešel jsi z rozpadlé chaty.");
                System.out.println("  ");
                this.posedleMesteckoNamesti();
                break;
        }
    }//hotovo
    public void posedleMesteckoZabednenyDum(){
        zabednenydum = 1;
        System.out.println(" ");
        System.out.println("Vešel jsi do zabedněného domu.");
        System.out.println("U stolu sedí mladý muž s jehou dcerou.");
        System.out.println("Řekl ti: Ahoj, jmenuji se Petr a tohle je moje dcera Alžběta. Jak se jmenuješ ty?");
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
                if (item2 == 1 && kouzlo == 1){
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: Co to máš v kapse? Kouzelnou hůlu? Ano? Tak to tě musím o něco poprosit. ");
                    System.out.println("Mojí dceru Marii unesli duchové a ty se máš, proti nim, čím bránit. ");
                    System.out.println("Byl by jsi tak hodný a vysvobodil Marii?");
                    System.out.println("  ");
                    System.out.println("1. Ano");
                    System.out.println("2. Ne");
                    System.out.println("  ");
                    staryhrad = sc.nextInt();
                    sc.nextLine();
                    switch (staryhrad) {
                        case 1:
                            this.posedleMesteckoStaryHrad();
                            break;
                            case 2:
                                System.out.println("Tak někdy jindy.");
                                System.out.println("  ");
                                System.out.println("Odešel jsi ze zabedněného domu.");
                                this.posedleMesteckoNamesti();
                                break;
                    }
                }
                if (item2 == 2){
                    System.out.println("  ");
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: Co to tam máš? Neviditelný plášť? A kde jsi ho našel? Na zemi? ");
                    System.out.println("Plášť patřil totiž starému čaroději. Bydlel s čarodějnicí v rozpadlé chatě. Když naše městečko napadli zlí duchové, musel s nimi jít bojovat a při boji ho ztratil.");
                    System.out.println("Kde asi teď je? Jestli ho unesli duchové, tak je určitě na Starém hradě.");
                    System.out.println("No nic o tom si můžeme popovídat jindy, ale teď ti řeknu něco o neviditelném plášti. Je to velmi vzácná věc a jsou jen 3 na světě. Ve krajních situací ti může pomoci utéct.");
                    System.out.println("  ");
                    System.out.println("Odešel jsi ze zabedněného domu.");
                    this.posedleMesteckoNamesti();
                }else{
                    System.out.println("  ");
                    System.out.println("Přišel jsi ke stolu a Petr ti řekl: Máš neviditelný plášť? Ne? Tak to ti nemůžu pomoci. Možná ti pomůžou jíní obyvatelé našeho městečka.");
                    System.out.println("Přijď ke mě až zjistíš víc informací o tvém předmětu.");
                    System.out.println("Odešel jsi ze zabedněného domu.");
                    this.posedleMesteckoNamesti();
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
                if (item2 == 2 && mladymuz == 1 ){
                    System.out.println(" ");
                    System.out.println("Promluvi jsi na skřeta a on na tebe vyskočil.");
                    System.out.println("Setřásl jsi ho ze sebe a on říká: Pardón pane já nechtěl. Za to mohou ti duchové.");
                    System.out.println("Moc se jich bojím a myslel jsem že jste duch. Co to máte na sobě? Neviditelný plášť, který jste našel, když jsi vešel do městečka? Zajímavé.");
                    System.out.println("Tak to by jsi mi mohl s něčím pomoct.");
                    System.out.println("Mého bratra unesli duchové, když se dostali do naší jeskyně. Já se stihl schovat ale on neměl takové Štěstí.");
                    System.out.println("Myslíš že by jsi ho mohl vysvobodit ze starého hradu?");
                    System.out.println(" ");
                    System.out.println("1. Ano");
                    System.out.println("2. Ne");
                    staryhrad = sc.nextInt();
                    sc.nextLine();
                    switch (staryhrad) {
                        case 1:
                            this.posedleMesteckoStaryHrad();
                            break;
                            case 2:
                                System.out.println("Škoda.");
                                this.posedleMesteckoNamesti();
                                break;
                    }

                }
                if (item2 == 3){
                    System.out.println(" ");
                    System.out.println("Promluvi jsi na skřeta a on na tebe vyskočil.");
                    System.out.println("Setřásl jsi ho ze sebe a on říká: 'Pardón pane já nechtěl. Za to mohou ti duchové , kteří posedli naše městečko.");
                    System.out.println("Moc se jich bojím a myslel jsem že jste duch. Co to držíte v ruce? Káme, který jste našel, když jsi vešel do městečka? Zajímavé.");System.out.println("Já ten kámen znám! To je kámen vzkřísení. Můžeš jím oživit kohokoliv, kdo zemřel. Použij ho dobře.'");
                    System.out.println(" ");
                    System.out.println("Skřeta jsi po tomto rozhovoru nechal být a odešel jsi z jeskyně.");
                    this.posedleMesteckoNamesti();
                }else{
                    System.out.println(" ");
                    System.out.println("Promluvi jsi na skřeta a on na tebe vyskočil.");
                    System.out.println("Setřásl jsi ho ze sebe a on říká: 'Pardón pane já nerchtěl. Za to moho ti duchové , kteří posedli naše městečko.");
                    System.out.println("Moc se jich bojím a myslel jsem že jste duch.");
                    System.out.println("Máš tajemný kámen? Ne? Tak to ti nemám jak pomoct. Možná ti pomůžou jíní obyvatelé našeho městečka.'");
                    System.out.println("Přijď ke mě až zjistíš víc informací o tvém předmětu.");
                    System.out.println(" ");
                    System.out.println("Skřeta jsi po tomto rozhovoru nechal být a odešel jsi z jeskyně.");
                    this.posedleMesteckoNamesti();
                }
                break;
            case 2:
                System.out.println(" ");
                System.out.println("Skřeta jsi nechal být a odešel jsi z jeskyně.");
                this.posedleMesteckoNamesti();
                break;
        }

    }//hotovo
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
                System.out.println("Přišel jsi k rytíři a ten ti řekl: 'Ahoj, už jsi si všiml že je toto městečko posedlé? Ano? Tak co tu děláš? ");
                System.out.println("Chceš se dostat z lesa? Tak s tim ti nepomůžu, ale přijď zpátky až se z něho dostaneš. Možná ti pomůžou jíní obyvatelé našeho městečka.'");
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

    }//hotovo
    public void posedleMesteckoStaryHrad(){
        switch (item2) {
            case 1:
                System.out.println("Oběvil jsi se na starém hradě.");
                System.out.println("Dveře od hradu jsou ale zavřené. Co uděláš?");
                System.out.println(" ");
                System.out.println("1. Zkusíš vyrazit dveře.");
                System.out.println("2. Prohledáš okolí");
                System.out.println("  ");
                staryhraddvere = sc.nextInt();
                sc.nextLine();
                switch (staryhraddvere) {
                    case 1:
                        System.out.println("Tveře jsi vyrazil a ooprišel jsi o jeden život.");
                        zivoty--;
                        break;
                        case 2:
                            System.out.println("Našel jsi klíč od dveří a dostal jsi se dovnitř");
                            break;
                }
                while(chodba == 1){
                    System.out.println(" ");
                    System.out.println("Jsi uvnitř hradu a před tebou je dlouhá chodba.");
                    System.out.println("Podél chodby jsou 3 dveře. ");
                    System.out.println("Jaké chceš prozkoumat?");
                    System.out.println(" ");
                    if (knihovna == 1){
                        System.out.println("1. Knihovna");
                    }else{
                        System.out.println("1. Dveře 1");
                    }
                    if (zbrojnice == 1){
                        System.out.println("2. Zbrojnice");
                    }else{
                        System.out.println("2. Dveře 2");
                    }
                    if (sklep == 1){
                        System.out.println("3. Sklep");
                    }else{
                        System.out.println("3. Dveře 3");
                    }
                    dvere = sc.nextInt();
                    sc.nextLine();
                    switch (dvere) {
                        case 1:
                            knihovna = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi v knihovně.");
                            System.out.println("Knihovnu jsi prozkoumal a v jedné z knih jsi našel velký zlatý klíč.");
                            System.out.println(" ");
                            klicodbrany = 1;
                            break;
                        case 2:
                            zbrojnice = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi ve zbrojnici.");
                            System.out.println("Zbrojnici jsi prozkoumal a vzal jsi si brnění. Přidalo ti jeden život.");
                            System.out.println(" ");
                            zivoty++;
                            this.pocetZivotu();
                            break;
                        case 3:
                            sklep = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Sešel jsi dulu do sklepa a našel jsi starého muže, který je zavřený ve vězení.");
                            System.out.println("Použil jsi kouzlo, aby jsi ho vysvobodil. ");
                            System.out.println("Starý muž ti poděkoval a dal ti 50 zlaťáků. ");
                            System.out.println(" ");
                            zlataky = 50;
                            this.pocetZlataku();
                            break;
                    }
                    if (knihovna == 1 && sklep == 1 && zbrojnice == 1){
                        chodba = 0;
                    }
                }
                zlycarodej = 1;
                System.out.println(" ");
                System.out.println("Na konci chodby jsi našel další dveře.");
                System.out.println("Otevřel jsi je a před sebou vidíš obrovskou místnost.");
                System.out.println("Na konci místnosti je trůn ve kterém sedí zlý čaroděj.");
                System.out.println("Před ním ležím na zemi Petrova dcera.");
                System.out.println("Kolem ní stojí několik duchů.");
                System.out.println(" ");
                System.out.println("S duchy jsi bojoval ale při boji jsi ztratil 1 život");
                System.out.println(" ");
                zivoty--;
                this.pocetZivotu();
                kontrolaZivotu();
                kontrolaZivotu();
                System.out.println(" ");
                System.out.println("Došel jsi ke zlému čaroději");
                System.out.println("On říká: Kdo jsi? "+jmeno+". O tobě jsem nikdy neslišel.");
                System.out.println("Co mu řekneš?");
                System.out.println(" ");
                this.getZlycarodejtext = sc.nextLine();
                System.out.println(getZlycarodejtext);
                System.out.println(" ");
                System.out.println("Začal jsi s ním bojovat a vyhrál jsi.");
                System.out.println("Zachránil jsi Marii");
                System.out.println(" ");
                System.out.println("Vrátil jsi se za Petrem a vrátil jsi mu jeho dceru živou a zdravou.");
                System.out.println("Petr říká: Moc ti děkuju za záchranu mojí dcery. Tady máš 50 zlaťáků na oplátku.");
                System.out.println(" ");
                zlataky = 100;
                pocetZlataku();
                System.out.println(" ");
                System.out.println("Odešel jsi ze zabedněného domu.");
                System.out.println(" ");
                this.posedleMesteckoNamesti();
                break;
            case 2:
                System.out.println("Oběvil jsi se na starém hradě.");
                System.out.println("Dveře od hradu jsou ale zavřené. Co uděláš?");
                System.out.println(" ");
                System.out.println("1. Zkusíš vyrazit dveře.");
                System.out.println("2. Prohledáš okolí");
                System.out.println("  ");
                staryhraddvere = sc.nextInt();
                sc.nextLine();
                switch (staryhraddvere) {
                    case 1:
                        System.out.println("Tveře jsi vyrazil a ooprišel jsi o jeden život.");
                        zivoty--;
                        break;
                    case 2:
                        System.out.println("Našel jsi klíč od dveří a dostal jsi se dovnitř");
                        break;
                }
                while(chodba == 1) {
                    System.out.println(" ");
                    System.out.println("Jsi uvnitř hradu a před tebou je dlouhá chodba.");
                    System.out.println("Podél chodby jsou 3 dveře. ");
                    System.out.println("Jaké chceš prozkoumat?");
                    System.out.println(" ");
                    if (knihovna == 1) {
                        System.out.println("1. Knihovna");
                    } else {
                        System.out.println("1. Dveře 1");
                    }
                    if (zbrojnice == 1) {
                        System.out.println("2. Zbrojnice");
                    } else {
                        System.out.println("2. Dveře 2");
                    }
                    if (sklep == 1) {
                        System.out.println("3. Sklep");
                    } else {
                        System.out.println("3. Dveře 3");
                    }
                    dvere = sc.nextInt();
                    sc.nextLine();
                    switch (dvere) {
                        case 1:
                            knihovna = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi v knihovně.");
                            System.out.println("Knihovnu jsi prozkoumal a v jedné z knih jsi našel velký zlatý klíč.");
                            System.out.println(" ");
                            klicodbrany = 1;
                            break;
                        case 2:
                            zbrojnice = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi ve zbrojnici.");
                            System.out.println("Zbrojnici jsi prozkoumal a vzal jsi si brnění. Přidalo ti jeden život.");
                            System.out.println(" ");
                            zivoty++;
                            this.pocetZivotu();
                            break;
                        case 3:
                            sklep = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Sešel jsi dulu do sklepa a našel jsi starého muže, který je zavřený ve vězení.");
                            System.out.println("Na zemi vedle cely jsi našel palici. ");
                            System.out.println("Palicí jsi rozbil zámek na cele a vysvobodil jsi ho.");
                            System.out.println("Starý muž ti poděkoval, dal ti 50 zlaťáků a dál prozkoumával hrad s tebou.");
                            System.out.println(" ");
                            zlataky = 50;
                            this.pocetZlataku();
                            break;
                    }
                    if (knihovna == 1 && sklep == 1 && zbrojnice == 1) {
                        chodba = 0;
                    }
                }
                zlycarodej = 1;
                System.out.println(" ");
                System.out.println("Na konci chodby jsi našel další dveře.");
                System.out.println("Otevřel jsi je a před sebou vidíš obrovskou místnost.");
                System.out.println("Na konci místnosti je trůn ve kterém sedí zlý čaroděj.");
                System.out.println("Vedle něho stojí skřětův bratr v okovech.");
                System.out.println("Kolem nich stojí několik duchů.");
                System.out.println(" ");
                System.out.println("S duchy začal bojovat starý muž a povedlo se mu je zahnat na chodbu hradu.");
                kontrolaZivotu();
                System.out.println(" ");
                System.out.println("Došel jsi ke zlému čaroději");
                System.out.println("On říká: Kdo jsi? "+jmeno+". O tobě jsem nikdy neslišel.");
                System.out.println("Co mu řekneš?");
                System.out.println(" ");
                this.getZlycarodejtext = sc.nextLine();
                System.out.println(getZlycarodejtext);
                System.out.println(" ");
                System.out.println("Začali jste s ním bojovat a vyhrály jste.");
                System.out.println("Při boji jsi ale ztratil jeden život.");
                System.out.println(" ");
                zivoty--;
                this.pocetZivotu();
                kontrolaZivotu();
                System.out.println(" ");
                System.out.println("Zachránily jste skřetova bratra");
                System.out.println("Pomocí neviditelného pláště jste se všichni dostali ven z hradu");
                System.out.println(" ");
                System.out.println("Vrátil jsi se za skřetem a vrátil jsi mu jeho bratra živého a zdravého.");
                System.out.println("Skřet říká: Moc ti děkuju za záchranu mého bratra. Tady máš 50 zlaťáků na oplátku.");
                System.out.println(" ");
                pocetZlataku();
                System.out.println(" ");
                System.out.println("Odešel jsi z tajemné jeskyně.");
                System.out.println(" ");
                this.posedleMesteckoNamesti();
                break;
            case 3:
                System.out.println("Oběvil jsi se na starém hradě.");
                System.out.println("Dveře od hradu jsou ale zavřené. Co uděláš?");
                System.out.println(" ");
                System.out.println("1. Zkusíš vyrazit dveře.");
                System.out.println("2. Prohledáš okolí");
                System.out.println("  ");
                staryhraddvere = sc.nextInt();
                sc.nextLine();
                switch (staryhraddvere) {
                    case 1:
                        System.out.println("Tveře jsi vyrazil a ooprišel jsi o jeden život.");
                        zivoty--;
                        break;
                    case 2:
                        System.out.println("Našel jsi klíč od dveří a dostal jsi se dovnitř");
                        break;
                }
                while(chodba == 1) {
                    System.out.println(" ");
                    System.out.println("Jsi uvnitř hradu a před tebou je dlouhá chodba.");
                    System.out.println("Podél chodby jsou 3 dveře. ");
                    System.out.println("Jaké chceš prozkoumat?");
                    System.out.println(" ");
                    if (knihovna == 1) {
                        System.out.println("1. Knihovna");
                    } else {
                        System.out.println("1. Dveře 1");
                    }
                    if (zbrojnice == 1) {
                        System.out.println("2. Zbrojnice");
                    } else {
                        System.out.println("2. Dveře 2");
                    }
                    if (sklep == 1) {
                        System.out.println("3. Sklep");
                    } else {
                        System.out.println("3. Dveře 3");
                    }
                    dvere = sc.nextInt();
                    sc.nextLine();
                    switch (dvere) {
                        case 1:
                            knihovna = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi v knihovně.");
                            System.out.println("Knihovnu jsi prozkoumal a v jedné z knih jsi našel velký zlatý klíč.");
                            System.out.println(" ");
                            klicodbrany = 1;
                            break;
                        case 2:
                            zbrojnice = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Jsi ve zbrojnici.");
                            System.out.println("Zbrojnici jsi prozkoumal a vzal jsi si brnění. Přidalo ti jeden život.");
                            System.out.println(" ");
                            zivoty++;
                            this.pocetZivotu();
                            break;
                        case 3:
                            sklep = 1;
                            System.out.println(" ");
                            System.out.println("Otevřel jsi dveře.");
                            System.out.println("Sešel jsi dulu do sklepa a našel jsi starého muže, který je zavřený ve vězení.");
                            System.out.println("Na zemi vedle cely jsi našel palici. ");
                            System.out.println("Palicí jsi rozbil zámek na cele a vysvobodil jsi ho.");
                            System.out.println("Starý muž ti poděkoval, dal ti 50 zlaťáků a dál prozkoumával hrad s tebou.");
                            System.out.println(" ");
                            zlataky = 50;
                            this.pocetZlataku();
                            break;
                    }
                    if (knihovna == 1 && sklep == 1 && zbrojnice == 1) {
                        chodba = 0;
                    }
                }
                zlycarodej = 1;
                System.out.println(" ");
                System.out.println("Na konci chodby jsi našel další dveře.");
                System.out.println("Otevřel jsi je a před sebou vidíš obrovskou místnost.");
                System.out.println("Na konci místnosti je trůn ve kterém sedí zlý čaroděj.");
                System.out.println("Kolem něho stojí několik duchů.");
                System.out.println("V rohu místnosti leží na zemi starý čaroděj a nehýbe se.");
                System.out.println(" ");
                System.out.println("S duchy začal bojovat starý muž a povedlo se mu je zahnat na chodbu hradu.");
                kontrolaZivotu();
                System.out.println(" ");
                System.out.println("Došel jsi ke zlému čaroději");
                System.out.println("On říká: Kdo jsi? "+jmeno+". O tobě jsem nikdy neslišel.");
                System.out.println("Co mu řekneš?");
                System.out.println(" ");
                this.getZlycarodejtext = sc.nextLine();
                System.out.println(getZlycarodejtext);
                System.out.println(" ");
                System.out.println("Začali jste s ním bojovat a vyhrály jste.");
                System.out.println("Při boji jsi ale ztratil jeden život.");
                System.out.println(" ");
                zivoty--;
                this.pocetZivotu();
                kontrolaZivotu();
                System.out.println(" ");
                System.out.println("Přisli jste ke starému čaroději a zjistili jste ž není naživu.");
                System.out.println("Pomocí kamene vzkřísení jsi čaroděje oživil.");
                System.out.println(" ");
                System.out.println("Vrátil jsi se za starou čarodějnicí a vrátil jsi jí jejího manžela živého a zdravého.");
                System.out.println("Stará čarodějnice říká: Moc ti děkuju za záchranu mého manžela. Tady máš 50 zlaťáků na oplátku.");
                System.out.println(" ");
                pocetZlataku();
                System.out.println(" ");
                System.out.println("Odešel jsi z rozpadlé chaty.");
                System.out.println(" ");
                this.posedleMesteckoNamesti();
                break;
        }
    }//nedokončeno

    //cesta do lesa (posedleMestecko)
    public void posedleMesteckoCestaDoLesa(){
        if (zlodej == 1){
            this.dobryKonec();
        }
        if (zlataky == 100){
            System.out.println(" ");
            System.out.println("Pocestě lesem potkáš zloděje.");
            System.out.println("On říká: Jestli mi teď hned nedáš 100 zlaťáků tak tě nepustím dál. Ty je máš? Tak to tě můžu pustit dál.");
            zlodej = 1;
            System.out.println("Dal jsi mu 100 zlaťáků a šel jsi dál.");
            System.out.println(" ");
            this.dobryKonec();
        }else{
            System.out.println(" ");
            System.out.println("Pocestě lesem potkáš zloděje.");
            System.out.println("On říká: Jestli mi teď hned nedáš 100 zlaťáků tak tě nepustím dál. Ty je nemáš? Tak to máš blbý.");
            System.out.println(" ");
            System.out.println("Vrátil jsi se zpátky do Posedlého městečka.");
            System.out.println(" ");
            this.posedleMesteckoNamesti();
        }
    }

    public void dobryKonec(){
        System.out.println("Došel jsi k velké bráně.");
        if (klicodbrany == 1){
            System.out.println("Máš u sebe klíč a dostal jsi se z lesa.");
        }else{
            System.out.println("Nemáš u sebe klíč a nemůžeš se dostat z lesa.");
            this.konec();
        }
    }
    public void kontrolaZivotu(){
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
    public void pocetZlataku(){
        System.out.println("Máš "+zlataky+" zlaťáků.");
    }
    public void konec(){}
}