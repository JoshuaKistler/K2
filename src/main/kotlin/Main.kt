package org.example

fun main() {
    println("Pemba: Willkomen im Basecamp, mein name ist Pemba. Ich bin auf dieser Expedition dein engster Begleiter. Wie heisst du eigentlich?")
    Thread.sleep(750)
    println("Gib Pemba deinen Namen:")
    var meinName = readLine()
    Thread.sleep(750)
    println("Pemba: Freut mich dich kennenzulernen $meinName.")
    Thread.sleep(750)
    println("Pemba: Morgen werden die anderen Expeditionsteilnehmer eintreffen. Wir werden die ersten sein die die Ostseite des K2 besteigen werden. Bist du Nervös?")
    println("Gebe bei Ja und Nein fragen Y oder N ein. Y steht für Yes und N für No ")
    var nervoes = readLine()
    Thread.sleep(750)
    if (nervoes.equals("N", ignoreCase = true)) {
        println("Pemba: Ich bin ehrlich gesagt schon ein bischen nervös. Wollen wir mal deine Ausrüstung besprechen?")
    } else {
        println("Pemba: Kann ich verstehen, geht mir genau gleich. Wollen wir mal deine Ausrüstung besprechen?")
    }
    Thread.sleep(750)
    var ausruestungsFrage = readLine()
    if (ausruestungsFrage.equals("Y", ignoreCase = true)) {
        println("Pemba: Perfekt, dann können wir nacher sorglos schlafen gehen. Beim Einpacken der Sachen ist es Wichtig, das man Darauf schaut wie das Gewicht ist. Ich werde dir jeweils ein Gegenstand zeigen und du sagst Ja oder Nein.")
    } else {
        println("Pemba: Ich weiss das du müde von der hinreise bist, aber morgen kommen deine Expeditionskollegen und dann wäre es zu viel Stress. Machen wir es jetzt kurz. Beim Einpacken der Sachen ist es Wichtig, das man Darauf schaut wie das Gewicht ist. Ich werde dir jeweils ein Gegenstand zeigen und du sagst Ja oder Nein.")
    }
    Thread.sleep(750)
    var ausruestungsGewicht = 0
    println("Pemba: Also fangen wir an, willst du eine Flasche zusätzlichen Sauerstoff mitnehen? Das würde deinem Ausrüstungsgewicht 7kg hinzufügen.")
    var sauerstoffEntscheidung = readLine()
    if (sauerstoffEntscheidung.equals("Y", ignoreCase = true)) {
        ausruestungsGewicht += 7
    } else {
        println("Pemba: Hast Recht nur dumme unerfahrene Touristen nehmen das mit hahaha.")
    }
    Thread.sleep(750)
    println("Pemba: Ich hätte noch ein Paar Essensrationen, willst du noch 5 zusätzlich mitnehmen? Du hast aktuell 10 Packungen Essen. Eine Packung ist je 200g.")
    var essensRationen = 10
    var essensEntscheidung = readLine()
    if (essensEntscheidung.equals("Y", ignoreCase = true)) {
        essensRationen += 1
        ausruestungsGewicht += 1
    } else {
        println("Pemba: Bist du dir Sicher? Du musst selbst wissen...")
    }
    Thread.sleep(750)
    println("Pemba: Gut, wir haben heute morgen noch gesehen das ein Seil liegen geblieben ist. Es ist ein altes Leichts seil nur 2kg. Du kannst aber auch ein Neues nehmen das ist aber 5kg. Willst du das Alte(Y) oder das neue(N)?")
    var neuesSeil = 0
    var altesSeil = 0
    var seilEntscheidung = readLine()
    if (seilEntscheidung.equals("Y", ignoreCase = true)) {
        altesSeil += 1
    } else {
        neuesSeil += 1
    }
    println("Pemba: Gut dann gehen wir mal Schlafen, morgen kommen die anderen. Gute Nacht $meinName.")
    Thread.sleep(2000)
    println("Pemba: Guten morgen $meinName, deine Kollegen sind gerade eingetroffen. Komm wir sagen ihnnen Hallo.")
    Thread.sleep(750)
    println("Pemba: Hallo Kameraden, mein Name ist Pemba. Ich bin euer Sherpa für diese Expedition. Stellt euch bitte mal vor!")
    println("Pemba: Fangen wir bei $meinName an, erzähl was über dich.")
    var vorstellungsRunde = readLine()
    Thread.sleep(750)
    println("¨$meinName: $vorstellungsRunde")
    Thread.sleep(750)
    println("Pemba: Ich kenne $meinName schon von gestern, er ist schon früher ins Basislager gegangen. Nun, kann bitte Madox sich vorstellen?")
    Thread.sleep(750)
    println("Adam: Guten Morgen zussamen, ich bin Adam. Mein Alter ist 30 und ich verbringe meine Freizeit mit Klettern, mein Beruf ist Wirtschaftsinformtaiker. Meine Stärken sind gute Ausdauer. Was sind deine attribute $meinName.")
    var staerke = 0
    var intelligenz = 0
    var charisma = 0
    println("Wähle deine Attribute aus")
    println("[-------------------------------]")
    println("[ Stärke ------------------ $staerke --]")
    println("[ Intelligenz ------------- $intelligenz --]")
    println("[ Charisma ---------------- $charisma --]")
    println("[-------------------------------]")
    println("Wähle Stärke mit [S], Intelligenz mit [I] und Charisma mit [C] aus.")

    while (true) {
        print("Gib dein Attribut ein: ")
        val input = readLine()?.uppercase()

        when (input) {
            "S" -> {
                staerke++
                println("Stärke erhöht: $staerke")
            }
            "I" -> {
                intelligenz++
                println("Intelligenz erhöht: $intelligenz")
            }
            "C" -> {
                charisma++
                println("Charisma erhöht: $charisma")
            }
            else -> println("Ungültige Eingabe, bitte wähle S, I oder C.")
        }

        // Aktualisiere die Anzeige
        println("[-------------------------------]")
        println("[ Stärke ------------------ $staerke --]")
        println("[ Intelligenz ------------- $intelligenz --]")
        println("[ Charisma ---------------- $charisma --]")
        println("[-------------------------------]")
    }

}

