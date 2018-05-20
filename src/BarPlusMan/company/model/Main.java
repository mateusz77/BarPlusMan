package BarPlusMan.company.model;


public class Main {
    public static void main(String[] args) {
        Dieta dieta = new Dieta("wysokobialkowa", "bółka z bananem", "shake wysokobiałkowy ", "Ryż z kurczakiem", "serek wiejski z owocem", "bółka z bananem");
        Dieta dieta1 = new Dieta("na dziś", "płatki z mlekiem", "shake", "kotlet z ziemniakami","zupa pomidorowa + brownie", "makaron z serem");
        Statystyka statystyka = new Statystyka();
        Czat czat = new Czat("CZACIK");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////Cwiczenia
        Cwiczenie pompki_diamentowe = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(40)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Pompki Diamentowe")
                .jakWykonacToCwiczenie("ułórz dłonie razem na wysokości klatki piersiowej tak aby raem utworzyly kształt rąbu. Skup się na użyciu klatki i tricepsa")
                .build();
        Cwiczenie pompki_szerokie = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(35)
                .iloscPowtorzen(8)
                .jakSieNazywaCwiczenie("Pompki Szerokie")
                .jakWykonacToCwiczenie("ułórz dłonie na lini barków w odległości około 20 cm od każdego z nich")
                .build();
        Cwiczenie pompki_hindu = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(59)
                .iloscPowtorzen(6)
                .jakSieNazywaCwiczenie("Pompki hinduskie")
                .jakWykonacToCwiczenie("Dłonie na wydokoścni brzucha pozycja startowa - wyglądasz jak odwrócone ''V'' następnie przechodzisz do pompki - klatka 2cm nad ziemią a następnie foczka następnie powtór tą samą drogą.  ")
                .build();
        Cwiczenie pompki_na_kolanach = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(30)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Pompki na kolanach")
                .jakWykonacToCwiczenie("przystąp do klęku podpartego Ułóż dłonie na szerokości barków i śmigaj")
                .build();
        Cwiczenie pompki_z_wysokosci = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(44)
                .iloscPowtorzen(8)
                .jakSieNazywaCwiczenie("Pompki z wysokośći")
                .jakWykonacToCwiczenie("znajdź jakąś rzecz wyższą niż 30 cm przystąp do podparcia a następnie wyłóż nogi na tą rzecz. Ułóż dłonie szeroko")
                .build();
        Cwiczenie pompki_sparta = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(30)
                .iloscPowtorzen(10)
                .jakSieNazywaCwiczenie("Pompki spartańskie")
                .jakWykonacToCwiczenie("Przystąp do podparcia. Ułóż jedną dłoń przed sobą na wysokośći głowy a drugą na wysokości klatki. W trakcie wyprostu zmieniaj stan dłoni na przeciwny")
                .build();
        Cwiczenie pompki_spiderman = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(59)
                .iloscPowtorzen(10)
                .jakSieNazywaCwiczenie("Pompki Spidermana")
                .jakWykonacToCwiczenie("Przy opuszczaniu przyciągaj zgiętą nogę do łokcia. Zmieniaj stronę co  pompkę ")
                .build();
        Cwiczenie pompki_waskie = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(35)
                .iloscPowtorzen(8)
                .jakSieNazywaCwiczenie("Pompki Wąskie")
                .jakWykonacToCwiczenie("ułórz dłonie na lini barków wąsko to znaczy w odległości dłoni od każdego z barków do środka")
                .build();
        Cwiczenie dipy_z_krzesla = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Dipy z krzesła")
                .jakWykonacToCwiczenie("stań tyłem do krzesła bądz innej TRWAłEJ rzeczy. Oprzyj dłonie na tej rzeczy. Nogi wyprostowane - ciałem tworzysz mniej więcej L-kę. opuszczaj się do ziemi tak aby tyłek prawie jej dotknął i z powrotem do góry")
                .build();
        Cwiczenie dipy_na2_krzesla = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Dipy na2 krzesła bądź poręcze")
                .jakWykonacToCwiczenie("stań między krzesłami bądz poręczami. Oprzyj dłonie na nich. Nogi zgięte. opuszczaj się tyle ile możesz + - 90 stopni  w łokciu i z powrotem do góry")
                .build();


        Cwiczenie pompki_pik = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(28)
                .iloscPowtorzen(6)
                .jakSieNazywaCwiczenie("Pompki pikowe")
                .jakWykonacToCwiczenie("Dłonie na wydokoścni brzucha pozycja startowa - wyglądasz jak odwrócone ''V'' następnie przechodzisz do pompki")
                .build();


        Cwiczenie podciaganie_przemiana = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie z przemianą")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go wąsko jedną ręką nachwytem a drugą podchwytem zmieniaj w połowie")
                .build();
        Cwiczenie podciaganie_zwykle = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie zwykłe")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go na wysokości swoich barków nachwytem")
                .build();
        Cwiczenie podciaganie_wąskim_podchwytem = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie wąskim podchwytem")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go podchwytem na wąsko dłonie w odległości mniej niż 3cm")
                .build();
        Cwiczenie podciaganie_wąskim_nach = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie wąskim nachwytem")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go nachwytem na wąsko dłonie w odległości mniej niż 3cm")
                .build();
        Cwiczenie podciaganie_zwyklym_podchwytem = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie zwykłe podchwytem")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go na wysokości swoich barków podchwytem")
                .build();
        Cwiczenie podciaganie_szerokie = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie szerokie nachwytem")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go szeroko nachwytem w odległości ramienia do łokcia od barków na zewnątrz")
                .build();
        Cwiczenie podciaganie_szerokie_podchwyt = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(55)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Podciąganie szerokie podchwytem")
                .jakWykonacToCwiczenie("Stań na przeciw drążka do ćwiczeń. Chwyć go szeroko podchwytem w odległości ramienia do łokcia od barków na zewnątrz")
                .build();

        Cwiczenie wyrzut_nog = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("Wyrzut nóg")
                .jakWykonacToCwiczenie("przystąp do siadu podpartego następnie wyrzucaj obie nogi na raz")
                .build();
        Cwiczenie wyrzut_nog_na_przemian = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("Naprzemienny wyrzut nóg")
                .jakWykonacToCwiczenie("przystąp do podparcia następnie zegnij nogę pod brzych przysiądź na niej  wyrzucaj nogi na przemian")
                .build();
        Cwiczenie pajacyki = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(59)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("Pajacyki")
                .jakWykonacToCwiczenie("Pajacykuj ile wlezie! :D ")
                .build();
        Cwiczenie wyskok_z_przysiadu = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("wyskok z przysiadu")
                .jakWykonacToCwiczenie("przystąp do przysiadu następnie wyskocz jak najwyżej powracając do przysiadu")
                .build();
        Cwiczenie BARPIS = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("Burpees")
                .jakWykonacToCwiczenie("przystąp do półprzysiadu następnie wyrzuć nogi w tył przechodząc do pompki a teraz pompka.postaraj się zrobić ją jak najdynamiczniej żeby od razy przejść do półprzysiadu wyskocz jak najwyżej powracając do przysiadu")
                .build();
        Cwiczenie skiping_A = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("skiping A")
                .jakWykonacToCwiczenie("Skipinguj A :P kolana wysoko! ")
                .build();
        Cwiczenie brzuszki = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("Brzuszki klasik")
                .jakWykonacToCwiczenie("brzuszkuj brzuszkuj brzuszkuj!")
                .build();
        Cwiczenie brzuszki_rownowazne = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(25)
                .jakSieNazywaCwiczenie("Brzuszki w siadzie równoważnym")
                .jakWykonacToCwiczenie("usiądż w siadzie równoważnym i przekładaj ręce z jednej na drugą strone!")
                .build();
        Cwiczenie deska = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(80)
                .jakSieNazywaCwiczenie("deska")
                .jakWykonacToCwiczenie("przystąp do podparcia, nie wspieraj się na dłoniach tylko na przedramionach utrzymuj postawę przez tyle sekund ile jest powtórzeń")
                .build();
        Cwiczenie brzuszki_pistol = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(18)
                .jakSieNazywaCwiczenie("Brzoszki pistol")
                .jakWykonacToCwiczenie("leżąc na plecach unieś wyprostowane nogi tak aby tworzyły kąt prosty z podłożem. Podnosząc tłowie dotykaj stóp")
                .build();
        Cwiczenie brzuszek_lodka = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(15)
                .jakSieNazywaCwiczenie("łódeczka")
                .jakWykonacToCwiczenie("przystąp do siadu równoważnego opuszczając nogi opuszczaj tłów tam i z powrotem")
                .build();
        Cwiczenie brzuszek_krokodyl = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(20)
                .jakSieNazywaCwiczenie("Brzuszek KROKODYL")
                .jakWykonacToCwiczenie("przystąp do siadu równoważnego z wyprostowanymi rękoma nad głową opuszczając nogi opuszczaj tłów tam i z powrotem")
                .build();

        Cwiczenie przysiad = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(12)
                .jakSieNazywaCwiczenie("przysiad")
                .jakWykonacToCwiczenie("zwykczajnie rób przysiad :D utrzymuj równowagę i schodź tyłkiem do ziemi a nie do połowy")
                .build();

        Cwiczenie przysiad_jednonogi = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(8)
                .jakSieNazywaCwiczenie("przysiad na jednej nodze")
                .jakWykonacToCwiczenie("przystąp do przysiadu na jednej nodze, jak nie dajesz rady to półprzysiad")
                .build();
        Cwiczenie sprint = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(30)
                .jakSieNazywaCwiczenie("Sprint")
                .jakWykonacToCwiczenie("przystąp do sprintu przez tyle sekund ile wynosi liczba powtórzeń")
                .build();

        Cwiczenie przysiad_podparty = new Cwiczenie.Builder()
                .czasWykonaniaCwiczenia(50)
                .iloscPowtorzen(30)
                .jakSieNazywaCwiczenie("Przysiad podparty")
                .jakWykonacToCwiczenie("przystąp do przysiadu trzymając się czegoś aby zachować maksymalną poprawność ćwiczenia. Skup się na mięśniach. PROSTE PLECY!")
                .build();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////Zestaw
        Zestaw klatka1 = new Zestaw();
        klatka1.utworz("KOMANDOS", 6);

        Zestaw klatka2 = new Zestaw();
        klatka2.utworz("RoboKOP", 6);

        Zestaw klatka3 = new Zestaw();
        klatka3.utworz("CHESTBURN", 6);


        Zestaw barki1 = new Zestaw();
        barki1.utworz("BarkoŁamacz", 4);

        Zestaw barki2 = new Zestaw();
        barki2.utworz("Kamienne BARY", 5);

        Zestaw barki3 = new Zestaw();
        barki3.utworz("Dwayne Johnson", 2);


        Zestaw plecy1 = new Zestaw();
        plecy1.utworz("PUDZIANA PLERY", 5);

        Zestaw plecy2 = new Zestaw();
        plecy2.utworz("STALOWE PLERY", 5);

        Zestaw plecy3 = new Zestaw();
        plecy3.utworz("RZEŹNIA", 5);


        Zestaw cardio1 = new Zestaw();
        cardio1.utworz("SPALACZ", 5);

        Zestaw cardio2 = new Zestaw();
        cardio2.utworz("ŻOŁNIERZ PŁAKAŁ JAK WYPRAWIAŁ", 5);

        Zestaw cardio3 = new Zestaw();
        cardio3.utworz("CZYSTE SZALEŃSTWO", 5);


        Zestaw nogi1 = new Zestaw();
        nogi1.utworz("NOGOŁAMACZ", 5);

        Zestaw nogi2 = new Zestaw();
        nogi2.utworz("POWALACZ", 5);

        Zestaw nogi3 = new Zestaw();
        nogi3.utworz("TYLKO WARIAT TO ZROBI", 5);


        Zestaw brzuch1 = new Zestaw();
        brzuch1.utworz("6PAK", 5);

        Zestaw brzuch2 = new Zestaw();
        brzuch2.utworz("8PAK", 5);

        Zestaw brzuch3 = new Zestaw();
        brzuch3.utworz("DIAMOND PAK", 5);

        try {
            klatka1.dodajCwiczenieDoZestawu(pompki_z_wysokosci);
            klatka1.dodajCwiczenieDoZestawu(pompki_diamentowe);
            klatka1.dodajCwiczenieDoZestawu(pompki_sparta);
            klatka1.dodajCwiczenieDoZestawu(pompki_na_kolanach);
            klatka1.dodajCwiczenieDoZestawu(pompki_spiderman);
            klatka1.dodajCwiczenieDoZestawu(pompki_hindu);
            klatka1.dodajCwiczenieDoZestawu(dipy_z_krzesla);

            klatka2.dodajCwiczenieDoZestawu(pompki_szerokie);
            klatka2.dodajCwiczenieDoZestawu(pompki_diamentowe);
            klatka2.dodajCwiczenieDoZestawu(pompki_z_wysokosci);
            klatka2.dodajCwiczenieDoZestawu(pompki_waskie);
            klatka2.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            klatka2.dodajCwiczenieDoZestawu(pompki_hindu);
            klatka2.dodajCwiczenieDoZestawu(pompki_spiderman);

            klatka3.dodajCwiczenieDoZestawu(pompki_z_wysokosci);
            klatka3.dodajCwiczenieDoZestawu(pompki_hindu);
            klatka3.dodajCwiczenieDoZestawu(pompki_diamentowe);
            klatka3.dodajCwiczenieDoZestawu(pompki_na_kolanach);
            klatka3.dodajCwiczenieDoZestawu(pompki_sparta);
            klatka3.dodajCwiczenieDoZestawu(pompki_spiderman);
            klatka3.dodajCwiczenieDoZestawu(dipy_z_krzesla);

            plecy1.dodajCwiczenieDoZestawu(pompki_diamentowe);

            barki1.dodajCwiczenieDoZestawu(dipy_na2_krzesla);
            barki1.dodajCwiczenieDoZestawu(pompki_hindu);
            barki1.dodajCwiczenieDoZestawu(pompki_z_wysokosci);
            barki1.dodajCwiczenieDoZestawu(pompki_pik);
            barki1.dodajCwiczenieDoZestawu(pompki_diamentowe);
            barki1.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            barki1.dodajCwiczenieDoZestawu(pompki_szerokie);

            barki2.dodajCwiczenieDoZestawu(pompki_z_wysokosci);
            barki2.dodajCwiczenieDoZestawu(pompki_pik);
            barki2.dodajCwiczenieDoZestawu(dipy_na2_krzesla);
            barki2.dodajCwiczenieDoZestawu(pompki_hindu);
            barki2.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            barki2.dodajCwiczenieDoZestawu(pompki_szerokie);
            barki2.dodajCwiczenieDoZestawu(pompki_diamentowe);


            barki3.dodajCwiczenieDoZestawu(podciaganie_szerokie);
            barki3.dodajCwiczenieDoZestawu(podciaganie_wąskim_nach);
            barki3.dodajCwiczenieDoZestawu(podciaganie_wąskim_podchwytem);
            barki3.dodajCwiczenieDoZestawu(podciaganie_przemiana);
            barki3.dodajCwiczenieDoZestawu(podciaganie_zwyklym_podchwytem);
            barki3.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            barki3.dodajCwiczenieDoZestawu(pompki_hindu);

            plecy1.dodajCwiczenieDoZestawu(podciaganie_szerokie_podchwyt);
            plecy1.dodajCwiczenieDoZestawu(podciaganie_zwykle);
            plecy1.dodajCwiczenieDoZestawu(dipy_na2_krzesla);
            plecy1.dodajCwiczenieDoZestawu(podciaganie_wąskim_podchwytem);
            plecy1.dodajCwiczenieDoZestawu(podciaganie_szerokie);
            plecy1.dodajCwiczenieDoZestawu(pompki_waskie);
            plecy1.dodajCwiczenieDoZestawu(pompki_sparta);

            plecy2.dodajCwiczenieDoZestawu(pompki_spiderman);
            plecy2.dodajCwiczenieDoZestawu(pompki_hindu);
            plecy2.dodajCwiczenieDoZestawu(dipy_na2_krzesla);
            plecy2.dodajCwiczenieDoZestawu(pompki_pik);
            plecy2.dodajCwiczenieDoZestawu(pompki_diamentowe);
            plecy2.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            plecy2.dodajCwiczenieDoZestawu(pompki_sparta);

            plecy3.dodajCwiczenieDoZestawu(podciaganie_zwykle);
            plecy3.dodajCwiczenieDoZestawu(podciaganie_zwyklym_podchwytem);
            plecy3.dodajCwiczenieDoZestawu(podciaganie_przemiana);
            plecy3.dodajCwiczenieDoZestawu(pompki_pik);
            plecy3.dodajCwiczenieDoZestawu(podciaganie_wąskim_podchwytem);
            plecy3.dodajCwiczenieDoZestawu(dipy_z_krzesla);
            plecy3.dodajCwiczenieDoZestawu(podciaganie_szerokie);

            cardio1.dodajCwiczenieDoZestawu(BARPIS);
            cardio1.dodajCwiczenieDoZestawu(wyrzut_nog);
            cardio1.dodajCwiczenieDoZestawu(skiping_A);
            cardio1.dodajCwiczenieDoZestawu(pajacyki);
            cardio1.dodajCwiczenieDoZestawu(wyskok_z_przysiadu);
            cardio1.dodajCwiczenieDoZestawu(wyrzut_nog_na_przemian);
            cardio1.dodajCwiczenieDoZestawu(pompki_sparta);


            cardio2.dodajCwiczenieDoZestawu(brzuszki);
            cardio2.dodajCwiczenieDoZestawu(wyrzut_nog);
            cardio2.dodajCwiczenieDoZestawu(BARPIS);
            cardio2.dodajCwiczenieDoZestawu(pompki_sparta);
            cardio2.dodajCwiczenieDoZestawu(skiping_A);
            cardio2.dodajCwiczenieDoZestawu(pajacyki);
            cardio2.dodajCwiczenieDoZestawu(wyrzut_nog_na_przemian);

            cardio3.dodajCwiczenieDoZestawu(brzuszki);
            cardio3.dodajCwiczenieDoZestawu(wyrzut_nog);
            cardio3.dodajCwiczenieDoZestawu(wyskok_z_przysiadu);
            cardio3.dodajCwiczenieDoZestawu(wyrzut_nog_na_przemian);
            cardio3.dodajCwiczenieDoZestawu(pompki_sparta);
            cardio3.dodajCwiczenieDoZestawu(skiping_A);
            cardio3.dodajCwiczenieDoZestawu(pajacyki);


            nogi1.dodajCwiczenieDoZestawu(BARPIS);
            nogi1.dodajCwiczenieDoZestawu(wyskok_z_przysiadu);
            nogi1.dodajCwiczenieDoZestawu(sprint);
            nogi1.dodajCwiczenieDoZestawu(przysiad_jednonogi);
            nogi1.dodajCwiczenieDoZestawu(przysiad_podparty);
            nogi1.dodajCwiczenieDoZestawu(przysiad);
            nogi1.dodajCwiczenieDoZestawu(pajacyki);

            nogi2.dodajCwiczenieDoZestawu(BARPIS);
            nogi2.dodajCwiczenieDoZestawu(wyskok_z_przysiadu);
            nogi2.dodajCwiczenieDoZestawu(przysiad_podparty);
            nogi2.dodajCwiczenieDoZestawu(przysiad);
            nogi2.dodajCwiczenieDoZestawu(pajacyki);
            nogi2.dodajCwiczenieDoZestawu(sprint);
            nogi2.dodajCwiczenieDoZestawu(przysiad_jednonogi);
            nogi2.dodajCwiczenieDoZestawu(przysiad_podparty);


            nogi3.dodajCwiczenieDoZestawu(sprint);
            nogi3.dodajCwiczenieDoZestawu(przysiad_jednonogi);
            nogi3.dodajCwiczenieDoZestawu(BARPIS);
            nogi3.dodajCwiczenieDoZestawu(przysiad_podparty);
            nogi3.dodajCwiczenieDoZestawu(przysiad);
            nogi3.dodajCwiczenieDoZestawu(wyskok_z_przysiadu);
            nogi3.dodajCwiczenieDoZestawu(pajacyki);


            brzuch1.dodajCwiczenieDoZestawu(brzuszki);
            brzuch1.dodajCwiczenieDoZestawu(wyrzut_nog);
            brzuch1.dodajCwiczenieDoZestawu(BARPIS);
            brzuch1.dodajCwiczenieDoZestawu(wyrzut_nog_na_przemian);
            brzuch1.dodajCwiczenieDoZestawu(pompki_sparta);
            brzuch1.dodajCwiczenieDoZestawu(brzuszek_krokodyl);
            brzuch1.dodajCwiczenieDoZestawu(brzuszki_rownowazne);


            brzuch2.dodajCwiczenieDoZestawu(brzuszki);
            brzuch2.dodajCwiczenieDoZestawu(wyrzut_nog);
            brzuch2.dodajCwiczenieDoZestawu(pompki_sparta);
            brzuch2.dodajCwiczenieDoZestawu(brzuszek_krokodyl);
            brzuch2.dodajCwiczenieDoZestawu(brzuszki_rownowazne);
            brzuch2.dodajCwiczenieDoZestawu(BARPIS);
            brzuch2.dodajCwiczenieDoZestawu(wyrzut_nog_na_przemian);


            brzuch3.dodajCwiczenieDoZestawu(brzuszki_pistol);
            brzuch3.dodajCwiczenieDoZestawu(wyrzut_nog);
            brzuch3.dodajCwiczenieDoZestawu(BARPIS);
            brzuch3.dodajCwiczenieDoZestawu(deska);
            brzuch3.dodajCwiczenieDoZestawu(pompki_sparta);
            brzuch3.dodajCwiczenieDoZestawu(brzuszek_krokodyl);
            brzuch3.dodajCwiczenieDoZestawu(brzuszek_lodka);


        } catch (WyjatekDodaniaObiektu wyjatekDodaniaObiektu) {
            wyjatekDodaniaObiektu.getMessage();
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////PARTIE
        Partia klatka = new Partia("KLATKA");
        Partia barki = new Partia("BARKI");
        Partia plecy = new Partia("PLECY");
        Partia cardio = new Partia("CARDIO");
        Partia nogi = new Partia("NOGI");
        Partia brzuch = new Partia("BRZUCH");

        try {
            klatka.dodajZestawDoPartii(klatka1);
            klatka.dodajZestawDoPartii(klatka2);
            klatka.dodajZestawDoPartii(klatka3);

            barki.dodajZestawDoPartii(barki1);
            barki.dodajZestawDoPartii(barki2);
            barki.dodajZestawDoPartii(barki3);

            plecy.dodajZestawDoPartii(plecy1);
            plecy.dodajZestawDoPartii(plecy2);
            plecy.dodajZestawDoPartii(plecy3);

            cardio.dodajZestawDoPartii(cardio1);
            cardio.dodajZestawDoPartii(cardio2);
            cardio.dodajZestawDoPartii(cardio3);

            nogi.dodajZestawDoPartii(cardio1);
            nogi.dodajZestawDoPartii(cardio2);
            nogi.dodajZestawDoPartii(cardio3);

            brzuch.dodajZestawDoPartii(cardio1);
            brzuch.dodajZestawDoPartii(cardio2);
            brzuch.dodajZestawDoPartii(cardio3);

        } catch (WyjatekDodaniaObiektu wyjatekDodaniaObiektu) {
            wyjatekDodaniaObiektu.printStackTrace();
        }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////treningi
        Trening trening1 = new Trening("trening1");
        try {
            trening1.dodajPartieDoTreningu(plecy);
            trening1.dodajPartieDoTreningu(barki);
            trening1.dodajPartieDoTreningu(klatka);
            trening1.dodajPartieDoTreningu(brzuch);
            trening1.dodajPartieDoTreningu(cardio);
            trening1.dodajPartieDoTreningu(nogi);


        } catch (WyjatekDodaniaObiektu wyjatekDodaniaObiektu) {
            System.out.println(wyjatekDodaniaObiektu.getMessage());
        }


/********************************************************************************STOPER*/


// tworzymy obiekt klasy Stoper
        Stoper stoper = new Stoper("Test");
// uruchamiamy stoper
        stoper.start();

// tutaj instrukcje, których czas wykonania chcemy zmierzyć

// zatrzymujemy stoper
        stoper.stop();
// wyświetlamy na ekranie uzyskany czas

        // pompki.wypisz();
        Stoper stopere = new Stoper();

        PlanTreningowy plan  = new PlanTreningowy("plan",trening1, dieta, statystyka, czat, stopere );

        plan.dodajDiete(dieta1);


////////////////////////////////////////////////////////////////////////////////////serialized
        IO zapis = new IO("TrenujMiTu");
        zapis.writePlanTreningowy(plan);

////////////////////////////////////////////////////////////////////////////////////////desserialized

        IO odczyt = new IO("TrenujMiTu");
        PlanTreningowy nowy = new PlanTreningowy();
        nowy = odczyt.readPlanTreningowy();
        nowy.getTrening().wypiszPartie();





    }


}
