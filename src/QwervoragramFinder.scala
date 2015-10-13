class QwervoragramFinder(words: Set[String]) {
  val qwertyKeys = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:\"ZXCVBNM<>?"
  val dvorakKeys = "`1234567890[]',.pyfgcrl/=\\aoeuidhtns-;qjkxbmwvz~!@#$%^&*(){}\"<>PYFGCRL?+|AOEUIDHTNS_:QJKXBMWVZ"

  val qwertyKeypressToDvorakKeypress = qwertyKeys zip dvorakKeys toMap
  
  val sanitizedWords = words.filter(word => word.forall(c => qwertyKeys contains c ))

  def find =
    sanitizedWords
      .filter(wordHasQwervoragram)
      .toList.sortBy(-_.length)
      .map(word => new Pair(word, qwertyWordToDvorakWord(word)))

  private def wordHasQwervoragram(word: String): Boolean = {
    words.contains(qwertyWordToDvorakWord(word))
  }

  private def qwertyWordToDvorakWord(word: String): String = word.map(qwertyKeypressToDvorakKeypress)
}
