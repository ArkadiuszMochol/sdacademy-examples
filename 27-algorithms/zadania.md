### Warmup
1. Napisz metodę, która sprawdza pełnoletność danej osoby. Zastanów się nad sygnaturą metody, następnie ją zaimplementuj i uruchom dla kilku wartości.
2. Napisz program, który rysuje choinkę ze znaczków '*', tj. trójkąt równoramienny a pod nim prostokąt.
### Tablice
1. Dana jest tablica liczb całkowitych, wypisz:
    - wszystkie po kolei
    - wszystkie od końca
    - wszystkie na nieparzystych pozycjach
    - wszystkie podzielne przez 3
    - sumę wszystkich
    - sumę pierwszych 4
    - sumę ostatnich 5 większych od 2
    - ilość liczb idąc od początku tablicy, by ich suma przekroczyła 10
2. Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X,
3. Zrób to samo używając pętli while oraz do while
4. Utwórz klasę MatrixFactory, która dla zadanego N zwróci tablicę dwuwymiarową o rozmiarze N x N elementów typu int.
5. Do powyższej klasy dodaj metodę getIdentityMatrix, która zwróci macierz jednostkową (powinna mieć wszędzie zera, ale na przekątnej jedynki)
### Pętle i warunki
1. Napisz program, który wylosuje liczbę z przedziału 0-10. Następnie pytaj użytkownika o podanie liczby. Jeśli podana liczba jest większa niż wylosowana, wyświetl komunikat "Nie zgadłeś, spróbuj z mniejszą liczbą", podobnie jeśli podana liczba jest mniejsza od wylosowanej. Jeśli użytkownik poda prawidłową liczbę, wyświetl "Gratulacje! Zgadłeś!"
2. Napisz program, który zapyta o 4 liczby:
    - x - początek prostokąta w poziomie (odległość od początku linii w spacjach)
    - y - początek prostokąta w pionie (ilość nowych linii od góry)
    - w (width) - szerokość prostokąta (ile 'x' narysować w poziomie)
    - h (height) - wysokość prostąta (ile 'x' narysować w pionie)
    Dla (2,3,4,5) powinien narysować:
  ```bash
>__
>__
>__
>__xxxx
>__xxxx
>__xxxx
>__xxxx
>__xxxx
```                  
3. Napisz program, który dla podanej przez użytkownika liczby sprawdzi, czy liczba ta jest liczbą pierwszą.                                                                                                                                                                                                                                                                    
                                                                                                                                                                                                                                                                                                                                                                                   
### String
1. Dana jest tablica napisów (String):
    - napisz metodę, która zwróci losowy z nich (użyj Random.nextInt())
    - napisz metodę, która sprawdzi, który ze stringów jest adresem email (załóżmy, że musi jedynie zawierać znak '@'), zwróć tablicę, która zawiera jedynie adresy email. Niech tablica ma stałą wielkość - 5
    - Napisz metodę, która sprawdzi, czy podane imię jest imieniem żeńskim - Zaczna się z wielkiej litery, ma co najmniej 3 znaki i kończy się na A, lub należy do podanej tablicy wyjątków - np {"Jess", "El"}
2. Napisz metodę, która sprawdza, czy dwa podane napisy są palindromem - tzn. czyta się je tak samo od tyłu jak od przodu. __UWAGA! ZADANIE REKRUTACYJNE__
3. Napisz metodę, która sprawdza, czy dwa podane napisy są anagramami - tzn. czy pierwszy składa się dokładnie z liter drugiego. __UWAGA! ZADANIE REKRUTACYJNE__
4. Napisz metodę, która przyjmuje String i zwraca jego "odwróconą" wartość, np. dla "Ala ma kota" zwróci "atok am alA'. Spróbuj to zrobić bez StringBuildera, a potem z.
### Metody
1. Napisz metodę, która zwraca Twoje imię
2. Napisz metodę, która zwraca Twój wiek
3. Napisz metodę, która przyjmuje w argumencie dwie liczby (int) i zwraca ich sumę.
4. Napisz metodę, która przyjmie w argumencie tablicę liczb (int) i wypisze je na ekranie w formie [1,2,3,4,5]
5. Napisz metodę, która przyjmie w argumencie liczbę i zwróci `true` jeśli liczba jest parzysta.
6. Napisz metodę, która przyjmie w argumencie liczbę i zwróci `true` jeśli liczba jest podzielna przez 3 i przez 5.
7. Napisz metodę, która przyjmie w argumencie liczbę zmiennoprzecinkową (double) i zwróci jej pierwiastek kwadratowy. Znajdź w internecie, jak to zrobić korzystając klasy `Math`
8. *Napisz metodę, która dla podanej liczby (int) zwróci napis z jej reprezentacją rzymską, np. 15 -> XV