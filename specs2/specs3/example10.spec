# Specification Heading

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run

    gauge specs


* Vowels in English language are "aeiou".
* something here 4

## Vowel counts in single word

tags: single word

* The word "gauge" has "3" vowels.
* something here 4


## Vowel counts in multiple word

This is the second scenario in this specification

Here's a step that takes a table

* Almost all words have vowels
     |Word  |Vowel Count|
     |------|-----------|
     |Gauge |3          |
     |Mingle|2          |
     |Snap  |1          |
     |GoCD  |1          |
     |Rhythm|0          |
* something here 4
