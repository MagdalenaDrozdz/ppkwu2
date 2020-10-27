# ppkwu2

String API - API, które będzie sprawdzało jaki string został przekazany.

Podajemy:

**/api/check/Test123-Test123**

Podajemy /api/check/ i dalej w parametrze podajemy nasz tekst, w którym chcemy sprawdzić jaki string został przekazany.

Otrzymujemy:

**{"numbers":6,"upperLetters":2,"lowerLetters":6,"others":1}**

Zwracana nam zostaje mapa, w której mamy do danej kategorii znaków : numbers, upperLetters, lowerLetters, others przypisaną liczbę wystąpień znaku danej kategorii.
Np. w tekście "Test123-Test123" mielismy dwie duż litery dlatego mamy "upperLetters":2.
