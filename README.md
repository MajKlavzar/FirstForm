##First Form##
Aplikacija FirstForm je mobilna aplikacija v jeziku Java, razvita v okolju Android Studio v okviru predmeta Razvoj mobilnih aplikacij.
📌 Opis projekta
Aplikacija vsebuje registracijski obrazec za zajem osnovnih uporabniških podatkov. Obrazec je prilagojen za prikaz na različnih velikostih zaslonov z uporabo gradnika ScrollView. Ob kliku na gumb za oddajo se vneseni podatki preberejo in prikažejo v večvrstičnem pogovornem oknu (AlertDialog).
🚀 Funkcionalnosti
•
Uporabniški vmesnik ( activity_main.xml):
◦
Naslov: Registration Form
◦
Vnosna polja (EditText):
▪
Username
▪
Full Name
▪
Country
▪
Email
▪
Phone Number
▪
Password (z maskiranjem vnesenih znakov textPassword in navodilom hint)
◦
Izbira spola (RadioGroup & RadioButton):
▪
Možnosti Male in Female razporejeni vodoravno v eni vrstici.
◦
Potrditveno polje (CheckBox):
▪
Vodoravno osredinjeno potrditveno polje za pogoje uporabe.
◦
Gumb za oddajo (Button):
▪
Vodoravno osredinjen gumb nastavljen na 50 % širine zaslona.
◦
Odzivnost: Uporaba ScrollView zagotavlja dostopnost celotne vsebine tudi na manjših zaslonih.
•
Logika delovanja ( MainActivity.java):
◦
Ob kliku na gumb se preberejo vrednosti iz vseh vnosnih polj.
◦
Ugotovi se izbrana možnost spola (Male, Female ali Not specified).
◦
Preveri se stanje potrditvenega polja.
◦
Prikaže se pogovorno okno z naslovom Registration Details, ki vsebuje pregleden večvrstični izpis vseh podatkov ter jasen status pogojev uporabe (Terms Accepted: Yes oz. Terms Accepted: No).
🛠️ Tehnologije
•
Programski jezik: Java
•
Gradnji sistem: Gradle
•
Uporabniški vmesnik: Android XML (ConstraintLayout, ScrollView, LinearLayout, AlertDialog)
💻 Navodila za zagon
1.
Odprite mapo projekta FirstForm v Android Studio.
2.
Počakajte, da se zaključi sinhronizacija Gradle projekta (Gradle Sync).
3.
Zaženite aplikacijo na Android emulatorju ali fizični napravi z ukazom Run 'app' (Shift + F10).
4.
Izpolnite polja obrazca in kliknite gumb za oddajo, da preizkusite delovanje pogovornega okna.
