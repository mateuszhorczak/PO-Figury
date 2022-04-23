# Zadanie7Figury
Stwórz kolekcję figur geometrycznych dziedziczących ze wspólnej klasy bazowej Figura. Klasa ta powinna posiadać chronione pole 'kolor', metody dostępowe do tego pola oraz konstruktor pobierający początkowy kolor figury.



Z klasy Figura powinny dziedziczyć 2 kolejne klasy: Trojkat (składający się z 3 linii) i Czworokat (składający się z 4 linii). Każda z nich powinna posiadać tylko jeden konstruktor pobierający kolor i 3 lub 4 punkty, z których konstruują swoje linie.



Następnie dopisz 2 klasy: Kwadrat -> Prostokat -> Czworokat -> Figura. Do skonstruowania prostokąta wystarczy podać, oprócz koloru, 2 punkty (np. lewy-górny i prawy-dolny), zaś do skonstruowania kwadratu - 1 punkt (np. lewy-górny) i długość boku. Wg tych zasad zaprojektuj odpowiednie konstruktory, pamiętając przy tym, że muszą one "wywoływać" konstruktory klasy bazowej (super, base, ...). Te klasy też powinny posiadać po tylko jednym konstruktorze.



W programie głównym wykaż, że z napisanych klas można tworzyć obiekty i korzystać z odziedziczonych pól i metod. Napisz też w klasach metody 'toString/ToString/operator<</__str__' i wywołaj je z każdego typu. Możesz też skorzystać z metody odziedziczonej.
