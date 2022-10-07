# REFACTOR CHALLENGE

## FizzBuzz
Il FizzBuzz è un problema classico, molto spesso utilizzato durante i colloqui tecnici.
La richiesta è semplice:

> Stampare un intero da 1 a N, stampando:
> - "Fizz" se il numero è divisibile per 3;
> - "Buzz" se il numero è multiplo di 5
> - "FizzBuzz" se il numero è divisibile sia per 3 che per 5

Ci sono diverse strade per raggiungere l'obiettivo, ma alcune sono meglio di altre.
Le soluzioni migliori non si limitano a "funzionare", ma rispettano i principi della "buona programmazione", sono aperte al cambiamento e adottato i punti di forza del linguaggio utilizzato.

## Behaviour Change
Il  "behaviour" o "comportamento" è direttamente e strettamente legato al problema da risolvere. Una regola di business è un comportamento e non varia al variare dei dati.
Ad esempio, un’organizzazione può avere una politica per offrire ai clienti che spendono $5.000 in un anno solare uno sconto sugli acquisti una volta raggiunta tale soglia. La regola potrebbe essere: 

> Se un cliente spende più di <soglia_in_divisa> in un <periodo_di_tempo>, allora offrire uno sconto del <sconto_da_applicare>% su ogni elemento. 

Questa regola è sempre valida indipendentemente dal periodo e da quanto spende il cliente: quello che potrà variare sono:
- le soglie di spesa
- il periodo nel quale calcolare la soglia
- la percentuale di sconto applicata. 

La regola è il _comportamento_; soglie, periodo e percentuali di sconto sono i _dati_. Come accade nel mondo reale, anche nel nostro programma, è bene che _comportamenti_ e _dati_ siano separati. Questo perché i _dati_ possono _cambiare_, proprio come cambiano le soglie che attivano sconti diversi nell'esempio, ma il _comportamento_ resta _invariato_ rispetto ai dati. 

## Refactoring
"Refactoring" significa migliorare la struttura interna del codice di un programma esistente, preservandone il _comportamento_ esterno.

Con il termine "refactoring" si intendono pertanto  tutte quelle tecniche che hanno come obiettivo il miglioramento del design del codice esistente. Queste tecniche si applicano in passi che devono essere *piccoli abbastanza* per mantenere il _comportamento_ del codice che si sta modificando: "too small to be worth doing". 

La ristrutturazione del codice esistente in piccoli passi *riduce il rischio* d'introdurre errori e quindi di rompere il sistema. Per basi di codice di grandi dimensioni, procedere gradualmente permette di eseguire refactoring che possono durare per un lungo periodo di tempo.

Alcune delle tecniche che rispondo alla descrizione sono ad esempio l'estrazione di un metodo, eseguire un inline di una variabile, l'introduzione di un paramento in un metodo privato, etc.

"Refactoring" quindi *non* significa:
- riscrivere il codice
- risolvere bug
- migliorare parti osservabili del codice, come ad esempio le interfacce verso l'esterno

Fare "refactoring" senza _rete di protezione_ è decisamente rischioso: test unitari e di accettazione automatizzati sono indispensabili per procedere.

Alcuni benefici per i quali si fa "refactoring" sono:
- diminuire la lunghezza di metodi e classi
- rimuovere duplicazioni
- aumentare la coesione, diminuire l'accoppiamento
- ridurre la complessità ciclomatica (numero di cammini linearmente indipendenti)
- aumentare la leggibilità del codice
- favorire l'identificazione di metodi, oggetti, moduli riutilizzabili
- riconoscere problemi noti e applicare soluzioni note (design pattern)
- accrescere la manutenibilità del codice

## Struttura del repository

## Qualche smell

## Challenge

## AGENDA
* 14.30 -> 15.15 : intro + presentazione + creazione delle coppie
* 15.15 -> 15.40 : 1o pomodoro
* 15.40 -> 15.45 : breve condivisione
* 15.45 -> 16.00 : coffe break
* 16.00 -> 16.25 : 2o pomodoro
* 16.25 -> 16.30 : breve condivisione
* 16.30 -> 16.55 : 3o pomodoro o mob
* 16.55 -> 17.40 : mob o retro + discussione
* 17.40 -> 17.45 : ROI
