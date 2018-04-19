# Procedurally generated fonts for alien languages

This project is a proof of concept to generate "fonts" for alien languages (e.g. for a sci-fi game).

Each font consists of the glyph images for 26 letters, 10 digits and a few punctuation characters.

Obviously alien languages would probably not follow these rules, this is an arbitrary decision to make them easy to compare visually.
The algorithm could easily create hundreds of letters. Together with a (probably n-gram based) procedural sequence of these letters very different looking alien languages could be generated.

The following examples are automatically generated with the first 9 random seeds.

Each example has fairly consistent rules used to generate the glyphs for this language.
The rules for digits vary slightly from the rules for letters.
Punctuation glyphs are much simpler than normal letters but still follow similar construction rules.

Each glyph is guaranteed to be distinct from all the other glyphs in the same font by pre-rendering and comparing pixel-wise during construction of the font. Unfortunately this can still produce visually very similar glyphs to us humans, but rest assured - the aliens have much more accurate visual perception and laugh at our problems to distinguish them.

## Enhancement Ideas

* variable width glyph (proportional instead of monospaced fonts)
* add rule for closed loops
* add rule to avoid crossing lines
* add rule to prefer going forward
* add probability to move next stroke in the same (similar) direction
* optionally create upper/lower case variants of letters
* create bracket glyphs (optionally symmetrical, special baseline handling)
* diacritic glyphs
* support subsets (e.g. vowels) to follow separate rules (e.g. to be diacritics)
* create TTF font
* generate example fonts for "reference" rulesets (e.g. latin-looking glyphs) to verify quality of rules

## Examples

### Example 1

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example1/example.html).

#### Letters

![a](docs/fonts/example1/a.png "a")
![b](docs/fonts/example1/b.png "b")
![c](docs/fonts/example1/c.png "c")
![d](docs/fonts/example1/d.png "d")
![e](docs/fonts/example1/e.png "e")
![f](docs/fonts/example1/f.png "f")
![g](docs/fonts/example1/g.png "g")
![h](docs/fonts/example1/h.png "h")
![i](docs/fonts/example1/i.png "i")
![j](docs/fonts/example1/j.png "j")
![k](docs/fonts/example1/k.png "k")
![l](docs/fonts/example1/l.png "l")
![m](docs/fonts/example1/m.png "m")
![n](docs/fonts/example1/n.png "n")
![o](docs/fonts/example1/o.png "o")
![p](docs/fonts/example1/p.png "p")
![q](docs/fonts/example1/q.png "q")
![r](docs/fonts/example1/r.png "r")
![s](docs/fonts/example1/s.png "s")
![t](docs/fonts/example1/t.png "t")
![u](docs/fonts/example1/u.png "u")
![v](docs/fonts/example1/v.png "v")
![w](docs/fonts/example1/w.png "w")
![x](docs/fonts/example1/x.png "x")
![y](docs/fonts/example1/y.png "y")
![z](docs/fonts/example1/z.png "z")

#### Digits

![0](docs/fonts/example1/0.png "0")
![1](docs/fonts/example1/1.png "1")
![2](docs/fonts/example1/2.png "2")
![3](docs/fonts/example1/3.png "3")
![4](docs/fonts/example1/4.png "4")
![5](docs/fonts/example1/5.png "5")
![6](docs/fonts/example1/6.png "6")
![7](docs/fonts/example1/7.png "7")
![8](docs/fonts/example1/8.png "8")
![9](docs/fonts/example1/9.png "9")

#### Punctuation

![point](docs/fonts/example1/_point.png "point")
![comma](docs/fonts/example1/_comma.png "comma")
![colon](docs/fonts/example1/_colon.png "colon")
![semicolon](docs/fonts/example1/_semicolon.png "semicolon")
![exclamation](docs/fonts/example1/_exclamation.png "exclamation")
![question](docs/fonts/example1/_question.png "question")
![plus](docs/fonts/example1/_plus.png "plus")
![minus](docs/fonts/example1/_minus.png "minus")
![mult](docs/fonts/example1/_mult.png "mult")
![div](docs/fonts/example1/_div.png "div")
![equal](docs/fonts/example1/_equal.png "equal")
![open_square_bracket](docs/fonts/example1/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example1/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example1/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example1/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example1/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example1/_close_curly_bracket.png "close_curly_bracket")


### Example 2

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example2/example.html).

#### Letters

![a](docs/fonts/example2/a.png "a")
![b](docs/fonts/example2/b.png "b")
![c](docs/fonts/example2/c.png "c")
![d](docs/fonts/example2/d.png "d")
![e](docs/fonts/example2/e.png "e")
![f](docs/fonts/example2/f.png "f")
![g](docs/fonts/example2/g.png "g")
![h](docs/fonts/example2/h.png "h")
![i](docs/fonts/example2/i.png "i")
![j](docs/fonts/example2/j.png "j")
![k](docs/fonts/example2/k.png "k")
![l](docs/fonts/example2/l.png "l")
![m](docs/fonts/example2/m.png "m")
![n](docs/fonts/example2/n.png "n")
![o](docs/fonts/example2/o.png "o")
![p](docs/fonts/example2/p.png "p")
![q](docs/fonts/example2/q.png "q")
![r](docs/fonts/example2/r.png "r")
![s](docs/fonts/example2/s.png "s")
![t](docs/fonts/example2/t.png "t")
![u](docs/fonts/example2/u.png "u")
![v](docs/fonts/example2/v.png "v")
![w](docs/fonts/example2/w.png "w")
![x](docs/fonts/example2/x.png "x")
![y](docs/fonts/example2/y.png "y")
![z](docs/fonts/example2/z.png "z")

#### Digits

![0](docs/fonts/example2/0.png "0")
![1](docs/fonts/example2/1.png "1")
![2](docs/fonts/example2/2.png "2")
![3](docs/fonts/example2/3.png "3")
![4](docs/fonts/example2/4.png "4")
![5](docs/fonts/example2/5.png "5")
![6](docs/fonts/example2/6.png "6")
![7](docs/fonts/example2/7.png "7")
![8](docs/fonts/example2/8.png "8")
![9](docs/fonts/example2/9.png "9")

#### Punctuation

![point](docs/fonts/example2/_point.png "point")
![comma](docs/fonts/example2/_comma.png "comma")
![colon](docs/fonts/example2/_colon.png "colon")
![semicolon](docs/fonts/example2/_semicolon.png "semicolon")
![exclamation](docs/fonts/example2/_exclamation.png "exclamation")
![question](docs/fonts/example2/_question.png "question")
![plus](docs/fonts/example2/_plus.png "plus")
![minus](docs/fonts/example2/_minus.png "minus")
![mult](docs/fonts/example2/_mult.png "mult")
![div](docs/fonts/example2/_div.png "div")
![equal](docs/fonts/example2/_equal.png "equal")
![open_square_bracket](docs/fonts/example2/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example2/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example2/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example2/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example2/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example2/_close_curly_bracket.png "close_curly_bracket")


### Example 3

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example3/example.html).

#### Letters

![a](docs/fonts/example3/a.png "a")
![b](docs/fonts/example3/b.png "b")
![c](docs/fonts/example3/c.png "c")
![d](docs/fonts/example3/d.png "d")
![e](docs/fonts/example3/e.png "e")
![f](docs/fonts/example3/f.png "f")
![g](docs/fonts/example3/g.png "g")
![h](docs/fonts/example3/h.png "h")
![i](docs/fonts/example3/i.png "i")
![j](docs/fonts/example3/j.png "j")
![k](docs/fonts/example3/k.png "k")
![l](docs/fonts/example3/l.png "l")
![m](docs/fonts/example3/m.png "m")
![n](docs/fonts/example3/n.png "n")
![o](docs/fonts/example3/o.png "o")
![p](docs/fonts/example3/p.png "p")
![q](docs/fonts/example3/q.png "q")
![r](docs/fonts/example3/r.png "r")
![s](docs/fonts/example3/s.png "s")
![t](docs/fonts/example3/t.png "t")
![u](docs/fonts/example3/u.png "u")
![v](docs/fonts/example3/v.png "v")
![w](docs/fonts/example3/w.png "w")
![x](docs/fonts/example3/x.png "x")
![y](docs/fonts/example3/y.png "y")
![z](docs/fonts/example3/z.png "z")

#### Digits

![0](docs/fonts/example3/0.png "0")
![1](docs/fonts/example3/1.png "1")
![2](docs/fonts/example3/2.png "2")
![3](docs/fonts/example3/3.png "3")
![4](docs/fonts/example3/4.png "4")
![5](docs/fonts/example3/5.png "5")
![6](docs/fonts/example3/6.png "6")
![7](docs/fonts/example3/7.png "7")
![8](docs/fonts/example3/8.png "8")
![9](docs/fonts/example3/9.png "9")

#### Punctuation

![point](docs/fonts/example3/_point.png "point")
![comma](docs/fonts/example3/_comma.png "comma")
![colon](docs/fonts/example3/_colon.png "colon")
![semicolon](docs/fonts/example3/_semicolon.png "semicolon")
![exclamation](docs/fonts/example3/_exclamation.png "exclamation")
![question](docs/fonts/example3/_question.png "question")
![plus](docs/fonts/example3/_plus.png "plus")
![minus](docs/fonts/example3/_minus.png "minus")
![mult](docs/fonts/example3/_mult.png "mult")
![div](docs/fonts/example3/_div.png "div")
![equal](docs/fonts/example3/_equal.png "equal")
![open_square_bracket](docs/fonts/example3/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example3/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example3/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example3/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example3/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example3/_close_curly_bracket.png "close_curly_bracket")


### Example 4

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example4/example.html).

#### Letters

![a](docs/fonts/example4/a.png "a")
![b](docs/fonts/example4/b.png "b")
![c](docs/fonts/example4/c.png "c")
![d](docs/fonts/example4/d.png "d")
![e](docs/fonts/example4/e.png "e")
![f](docs/fonts/example4/f.png "f")
![g](docs/fonts/example4/g.png "g")
![h](docs/fonts/example4/h.png "h")
![i](docs/fonts/example4/i.png "i")
![j](docs/fonts/example4/j.png "j")
![k](docs/fonts/example4/k.png "k")
![l](docs/fonts/example4/l.png "l")
![m](docs/fonts/example4/m.png "m")
![n](docs/fonts/example4/n.png "n")
![o](docs/fonts/example4/o.png "o")
![p](docs/fonts/example4/p.png "p")
![q](docs/fonts/example4/q.png "q")
![r](docs/fonts/example4/r.png "r")
![s](docs/fonts/example4/s.png "s")
![t](docs/fonts/example4/t.png "t")
![u](docs/fonts/example4/u.png "u")
![v](docs/fonts/example4/v.png "v")
![w](docs/fonts/example4/w.png "w")
![x](docs/fonts/example4/x.png "x")
![y](docs/fonts/example4/y.png "y")
![z](docs/fonts/example4/z.png "z")

#### Digits

![0](docs/fonts/example4/0.png "0")
![1](docs/fonts/example4/1.png "1")
![2](docs/fonts/example4/2.png "2")
![3](docs/fonts/example4/3.png "3")
![4](docs/fonts/example4/4.png "4")
![5](docs/fonts/example4/5.png "5")
![6](docs/fonts/example4/6.png "6")
![7](docs/fonts/example4/7.png "7")
![8](docs/fonts/example4/8.png "8")
![9](docs/fonts/example4/9.png "9")

#### Punctuation

![point](docs/fonts/example4/_point.png "point")
![comma](docs/fonts/example4/_comma.png "comma")
![colon](docs/fonts/example4/_colon.png "colon")
![semicolon](docs/fonts/example4/_semicolon.png "semicolon")
![exclamation](docs/fonts/example4/_exclamation.png "exclamation")
![question](docs/fonts/example4/_question.png "question")
![plus](docs/fonts/example4/_plus.png "plus")
![minus](docs/fonts/example4/_minus.png "minus")
![mult](docs/fonts/example4/_mult.png "mult")
![div](docs/fonts/example4/_div.png "div")
![equal](docs/fonts/example4/_equal.png "equal")
![open_square_bracket](docs/fonts/example4/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example4/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example4/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example4/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example4/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example4/_close_curly_bracket.png "close_curly_bracket")


### Example 5

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example5/example.html).

#### Letters

![a](docs/fonts/example5/a.png "a")
![b](docs/fonts/example5/b.png "b")
![c](docs/fonts/example5/c.png "c")
![d](docs/fonts/example5/d.png "d")
![e](docs/fonts/example5/e.png "e")
![f](docs/fonts/example5/f.png "f")
![g](docs/fonts/example5/g.png "g")
![h](docs/fonts/example5/h.png "h")
![i](docs/fonts/example5/i.png "i")
![j](docs/fonts/example5/j.png "j")
![k](docs/fonts/example5/k.png "k")
![l](docs/fonts/example5/l.png "l")
![m](docs/fonts/example5/m.png "m")
![n](docs/fonts/example5/n.png "n")
![o](docs/fonts/example5/o.png "o")
![p](docs/fonts/example5/p.png "p")
![q](docs/fonts/example5/q.png "q")
![r](docs/fonts/example5/r.png "r")
![s](docs/fonts/example5/s.png "s")
![t](docs/fonts/example5/t.png "t")
![u](docs/fonts/example5/u.png "u")
![v](docs/fonts/example5/v.png "v")
![w](docs/fonts/example5/w.png "w")
![x](docs/fonts/example5/x.png "x")
![y](docs/fonts/example5/y.png "y")
![z](docs/fonts/example5/z.png "z")

#### Digits

![0](docs/fonts/example5/0.png "0")
![1](docs/fonts/example5/1.png "1")
![2](docs/fonts/example5/2.png "2")
![3](docs/fonts/example5/3.png "3")
![4](docs/fonts/example5/4.png "4")
![5](docs/fonts/example5/5.png "5")
![6](docs/fonts/example5/6.png "6")
![7](docs/fonts/example5/7.png "7")
![8](docs/fonts/example5/8.png "8")
![9](docs/fonts/example5/9.png "9")

#### Punctuation

![point](docs/fonts/example5/_point.png "point")
![comma](docs/fonts/example5/_comma.png "comma")
![colon](docs/fonts/example5/_colon.png "colon")
![semicolon](docs/fonts/example5/_semicolon.png "semicolon")
![exclamation](docs/fonts/example5/_exclamation.png "exclamation")
![question](docs/fonts/example5/_question.png "question")
![plus](docs/fonts/example5/_plus.png "plus")
![minus](docs/fonts/example5/_minus.png "minus")
![mult](docs/fonts/example5/_mult.png "mult")
![div](docs/fonts/example5/_div.png "div")
![equal](docs/fonts/example5/_equal.png "equal")
![open_square_bracket](docs/fonts/example5/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example5/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example5/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example5/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example5/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example5/_close_curly_bracket.png "close_curly_bracket")


### Example 6

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example6/example.html).

#### Letters

![a](docs/fonts/example6/a.png "a")
![b](docs/fonts/example6/b.png "b")
![c](docs/fonts/example6/c.png "c")
![d](docs/fonts/example6/d.png "d")
![e](docs/fonts/example6/e.png "e")
![f](docs/fonts/example6/f.png "f")
![g](docs/fonts/example6/g.png "g")
![h](docs/fonts/example6/h.png "h")
![i](docs/fonts/example6/i.png "i")
![j](docs/fonts/example6/j.png "j")
![k](docs/fonts/example6/k.png "k")
![l](docs/fonts/example6/l.png "l")
![m](docs/fonts/example6/m.png "m")
![n](docs/fonts/example6/n.png "n")
![o](docs/fonts/example6/o.png "o")
![p](docs/fonts/example6/p.png "p")
![q](docs/fonts/example6/q.png "q")
![r](docs/fonts/example6/r.png "r")
![s](docs/fonts/example6/s.png "s")
![t](docs/fonts/example6/t.png "t")
![u](docs/fonts/example6/u.png "u")
![v](docs/fonts/example6/v.png "v")
![w](docs/fonts/example6/w.png "w")
![x](docs/fonts/example6/x.png "x")
![y](docs/fonts/example6/y.png "y")
![z](docs/fonts/example6/z.png "z")


#### Digits

![0](docs/fonts/example6/0.png "0")
![1](docs/fonts/example6/1.png "1")
![2](docs/fonts/example6/2.png "2")
![3](docs/fonts/example6/3.png "3")
![4](docs/fonts/example6/4.png "4")
![5](docs/fonts/example6/5.png "5")
![6](docs/fonts/example6/6.png "6")
![7](docs/fonts/example6/7.png "7")
![8](docs/fonts/example6/8.png "8")
![9](docs/fonts/example6/9.png "9")

#### Punctuation

![point](docs/fonts/example6/_point.png "point")
![comma](docs/fonts/example6/_comma.png "comma")
![colon](docs/fonts/example6/_colon.png "colon")
![semicolon](docs/fonts/example6/_semicolon.png "semicolon")
![exclamation](docs/fonts/example6/_exclamation.png "exclamation")
![question](docs/fonts/example6/_question.png "question")
![plus](docs/fonts/example6/_plus.png "plus")
![minus](docs/fonts/example6/_minus.png "minus")
![mult](docs/fonts/example6/_mult.png "mult")
![div](docs/fonts/example6/_div.png "div")
![equal](docs/fonts/example6/_equal.png "equal")
![open_square_bracket](docs/fonts/example6/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example6/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example6/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example6/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example6/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example6/_close_curly_bracket.png "close_curly_bracket")

### Example 7

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example7/example.html).

#### Letters

![a](docs/fonts/example7/a.png "a")
![b](docs/fonts/example7/b.png "b")
![c](docs/fonts/example7/c.png "c")
![d](docs/fonts/example7/d.png "d")
![e](docs/fonts/example7/e.png "e")
![f](docs/fonts/example7/f.png "f")
![g](docs/fonts/example7/g.png "g")
![h](docs/fonts/example7/h.png "h")
![i](docs/fonts/example7/i.png "i")
![j](docs/fonts/example7/j.png "j")
![k](docs/fonts/example7/k.png "k")
![l](docs/fonts/example7/l.png "l")
![m](docs/fonts/example7/m.png "m")
![n](docs/fonts/example7/n.png "n")
![o](docs/fonts/example7/o.png "o")
![p](docs/fonts/example7/p.png "p")
![q](docs/fonts/example7/q.png "q")
![r](docs/fonts/example7/r.png "r")
![s](docs/fonts/example7/s.png "s")
![t](docs/fonts/example7/t.png "t")
![u](docs/fonts/example7/u.png "u")
![v](docs/fonts/example7/v.png "v")
![w](docs/fonts/example7/w.png "w")
![x](docs/fonts/example7/x.png "x")
![y](docs/fonts/example7/y.png "y")
![z](docs/fonts/example7/z.png "z")


#### Digits

![0](docs/fonts/example7/0.png "0")
![1](docs/fonts/example7/1.png "1")
![2](docs/fonts/example7/2.png "2")
![3](docs/fonts/example7/3.png "3")
![4](docs/fonts/example7/4.png "4")
![5](docs/fonts/example7/5.png "5")
![6](docs/fonts/example7/6.png "6")
![7](docs/fonts/example7/7.png "7")
![8](docs/fonts/example7/8.png "8")
![9](docs/fonts/example7/9.png "9")

#### Punctuation

![point](docs/fonts/example7/_point.png "point")
![comma](docs/fonts/example7/_comma.png "comma")
![colon](docs/fonts/example7/_colon.png "colon")
![semicolon](docs/fonts/example7/_semicolon.png "semicolon")
![exclamation](docs/fonts/example7/_exclamation.png "exclamation")
![question](docs/fonts/example7/_question.png "question")
![plus](docs/fonts/example7/_plus.png "plus")
![minus](docs/fonts/example7/_minus.png "minus")
![mult](docs/fonts/example7/_mult.png "mult")
![div](docs/fonts/example7/_div.png "div")
![equal](docs/fonts/example7/_equal.png "equal")
![open_square_bracket](docs/fonts/example7/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example7/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example7/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example7/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example7/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example7/_close_curly_bracket.png "close_curly_bracket")

### Example 8

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example8/example.html).

#### Letters

![a](docs/fonts/example8/a.png "a")
![b](docs/fonts/example8/b.png "b")
![c](docs/fonts/example8/c.png "c")
![d](docs/fonts/example8/d.png "d")
![e](docs/fonts/example8/e.png "e")
![f](docs/fonts/example8/f.png "f")
![g](docs/fonts/example8/g.png "g")
![h](docs/fonts/example8/h.png "h")
![i](docs/fonts/example8/i.png "i")
![j](docs/fonts/example8/j.png "j")
![k](docs/fonts/example8/k.png "k")
![l](docs/fonts/example8/l.png "l")
![m](docs/fonts/example8/m.png "m")
![n](docs/fonts/example8/n.png "n")
![o](docs/fonts/example8/o.png "o")
![p](docs/fonts/example8/p.png "p")
![q](docs/fonts/example8/q.png "q")
![r](docs/fonts/example8/r.png "r")
![s](docs/fonts/example8/s.png "s")
![t](docs/fonts/example8/t.png "t")
![u](docs/fonts/example8/u.png "u")
![v](docs/fonts/example8/v.png "v")
![w](docs/fonts/example8/w.png "w")
![x](docs/fonts/example8/x.png "x")
![y](docs/fonts/example8/y.png "y")
![z](docs/fonts/example8/z.png "z")


#### Digits

![0](docs/fonts/example8/0.png "0")
![1](docs/fonts/example8/1.png "1")
![2](docs/fonts/example8/2.png "2")
![3](docs/fonts/example8/3.png "3")
![4](docs/fonts/example8/4.png "4")
![5](docs/fonts/example8/5.png "5")
![6](docs/fonts/example8/6.png "6")
![7](docs/fonts/example8/7.png "7")
![8](docs/fonts/example8/8.png "8")
![9](docs/fonts/example8/9.png "9")

#### Punctuation

![point](docs/fonts/example8/_point.png "point")
![comma](docs/fonts/example8/_comma.png "comma")
![colon](docs/fonts/example8/_colon.png "colon")
![semicolon](docs/fonts/example8/_semicolon.png "semicolon")
![exclamation](docs/fonts/example8/_exclamation.png "exclamation")
![question](docs/fonts/example8/_question.png "question")
![plus](docs/fonts/example8/_plus.png "plus")
![minus](docs/fonts/example8/_minus.png "minus")
![mult](docs/fonts/example8/_mult.png "mult")
![div](docs/fonts/example8/_div.png "div")
![equal](docs/fonts/example8/_equal.png "equal")
![open_square_bracket](docs/fonts/example8/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example8/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example8/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example8/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example8/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example8/_close_curly_bracket.png "close_curly_bracket")

### Example 9

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example9/example.html).

#### Letters

![a](docs/fonts/example9/a.png "a")
![b](docs/fonts/example9/b.png "b")
![c](docs/fonts/example9/c.png "c")
![d](docs/fonts/example9/d.png "d")
![e](docs/fonts/example9/e.png "e")
![f](docs/fonts/example9/f.png "f")
![g](docs/fonts/example9/g.png "g")
![h](docs/fonts/example9/h.png "h")
![i](docs/fonts/example9/i.png "i")
![j](docs/fonts/example9/j.png "j")
![k](docs/fonts/example9/k.png "k")
![l](docs/fonts/example9/l.png "l")
![m](docs/fonts/example9/m.png "m")
![n](docs/fonts/example9/n.png "n")
![o](docs/fonts/example9/o.png "o")
![p](docs/fonts/example9/p.png "p")
![q](docs/fonts/example9/q.png "q")
![r](docs/fonts/example9/r.png "r")
![s](docs/fonts/example9/s.png "s")
![t](docs/fonts/example9/t.png "t")
![u](docs/fonts/example9/u.png "u")
![v](docs/fonts/example9/v.png "v")
![w](docs/fonts/example9/w.png "w")
![x](docs/fonts/example9/x.png "x")
![y](docs/fonts/example9/y.png "y")
![z](docs/fonts/example9/z.png "z")


#### Digits

![0](docs/fonts/example9/0.png "0")
![1](docs/fonts/example9/1.png "1")
![2](docs/fonts/example9/2.png "2")
![3](docs/fonts/example9/3.png "3")
![4](docs/fonts/example9/4.png "4")
![5](docs/fonts/example9/5.png "5")
![6](docs/fonts/example9/6.png "6")
![7](docs/fonts/example9/7.png "7")
![8](docs/fonts/example9/8.png "8")
![9](docs/fonts/example9/9.png "9")

#### Punctuation

![point](docs/fonts/example9/_point.png "point")
![comma](docs/fonts/example9/_comma.png "comma")
![colon](docs/fonts/example9/_colon.png "colon")
![semicolon](docs/fonts/example9/_semicolon.png "semicolon")
![exclamation](docs/fonts/example9/_exclamation.png "exclamation")
![question](docs/fonts/example9/_question.png "question")
![plus](docs/fonts/example9/_plus.png "plus")
![minus](docs/fonts/example9/_minus.png "minus")
![mult](docs/fonts/example9/_mult.png "mult")
![div](docs/fonts/example9/_div.png "div")
![equal](docs/fonts/example9/_equal.png "equal")
![open_square_bracket](docs/fonts/example9/_open_square_bracket.png "open_square_bracket")
![close_square_bracket](docs/fonts/example9/_close_square_bracket.png "close_square_bracket")
![open_round_bracket](docs/fonts/example9/_open_round_bracket.png "open_round_bracket")
![close_round_bracket](docs/fonts/example9/_close_round_bracket.png "close_round_bracket")
![open_curly_bracket](docs/fonts/example9/_open_curly_bracket.png "open_curly_bracket")
![close_curly_bracket](docs/fonts/example9/_close_curly_bracket.png "close_curly_bracket")

