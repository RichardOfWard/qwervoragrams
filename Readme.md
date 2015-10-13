Qwervoragrams
=============
Qwervoragrams are (I have decided) sets of word that can be typed on
(at least) two different keyboard layouts using the same keystrokes.

The word is a portmanteau of 'qwerty', 'Dvorak', and 'anagram'.

This repo contains a scala application that finds qwervoragrams from a
file containing a list of words. It only finds qwerty-Dvorak qwervoragrams.


Findings
--------
Here are some of the better qwervoragrams (of the form "qwerty word,
Dvorak word"):

* flossy, unroof
* kodak, treat
* hoard, drape
* maid, mace
* raid, pace
* malt, many
* lard, nape
* goal, iran
* Noah, Brad
* boat, xray
* Isis, Coco
* maud, mage
* idol, cern
* roam, pram
* paid, lace
* sods, oreo
* soap, oral
* slid, once
* card, jape

There are also a few examples where the Dvorak word is the same as
the qwerty word:

* mama
* mmmm

These are called Homoqwervoragrams.

Full output from the application can be found in the file `output/qwerverograms.txt`.


Future research
---------------
Investigation into qwervoragram phrases or sentences, or
even runnable source code may be interesting.

Or pointless.


Contributions
-------------
Thanks to [SCOWL and friends][scowl] for the word list. See `res/README`
and `res/README_SCOWL` for more info.

Thanks to [wikipedia][wiki-dvorak-encoding] for the qwerty-Dvorak conversion.


[scowl]: http://wordlist.aspell.net/
[wiki-dvorak-encoding]: https://en.wikipedia.org/wiki/Dvorak_encoding
