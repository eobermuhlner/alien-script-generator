# Procedurally generated fonts for alien languages

This project is a proof of concept to generate "fonts" for alien languages (e.g. for a sci-fi game).

Each font consists of the glyph images for 26 letters, 10 digits and a few punctuation characters.

Obviously alien languages would probably not follow these rules, this is an arbitrary decision to make them easy to compare visually.
The algorithm could easily create hundreds of letters. Together with a (probably n-gram based) procedural sequence of these letters very different looking alien languages could be generated.

The following examples are automatically generated with the first 9 random seeds.

Each example has fairly consistent rules used to generate the glyphs for this language.
The rules for digits vary slightly from the rules for letters.
Punctuation glyphs are much simpler than normal letters but still follow similar construction rules.

The glyphs are guaranteed to be distinct from all the other glyphs in the same font by pre-rendering and comparing pixel-wise during construction of the font. Unfortunately this can still produce visually very similar glyphs to us humans, but rest assured - the aliens have much more accurate visual perception.

## Enhancement Ideas

* variable width glyph (proportional instead of monospaced fonts)
* add rule for closed loops
* add rule to avoid crossing lines
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

![a](docs/fonts/example1/a.png)
![b](docs/fonts/example1/b.png)
![c](docs/fonts/example1/c.png)
![d](docs/fonts/example1/d.png)
![e](docs/fonts/example1/e.png)
![f](docs/fonts/example1/f.png)
![g](docs/fonts/example1/g.png)
![h](docs/fonts/example1/h.png)
![i](docs/fonts/example1/i.png)
![j](docs/fonts/example1/j.png)
![k](docs/fonts/example1/k.png)
![l](docs/fonts/example1/l.png)
![m](docs/fonts/example1/m.png)
![n](docs/fonts/example1/n.png)
![o](docs/fonts/example1/o.png)
![p](docs/fonts/example1/p.png)
![q](docs/fonts/example1/q.png)
![r](docs/fonts/example1/r.png)
![s](docs/fonts/example1/s.png)
![t](docs/fonts/example1/t.png)
![u](docs/fonts/example1/u.png)
![v](docs/fonts/example1/v.png)
![w](docs/fonts/example1/w.png)
![x](docs/fonts/example1/x.png)
![y](docs/fonts/example1/y.png)
![z](docs/fonts/example1/z.png)

#### Digits

![0](docs/fonts/example1/0.png)
![1](docs/fonts/example1/1.png)
![2](docs/fonts/example1/2.png)
![3](docs/fonts/example1/3.png)
![4](docs/fonts/example1/4.png)
![5](docs/fonts/example1/5.png)
![6](docs/fonts/example1/6.png)
![7](docs/fonts/example1/7.png)
![8](docs/fonts/example1/8.png)
![9](docs/fonts/example1/9.png)

#### Punctuation

![point](docs/fonts/example1/_point.png)
![comma](docs/fonts/example1/_comma.png)
![colon](docs/fonts/example1/_colon.png)
![semicolon](docs/fonts/example1/_semicolon.png)
![exclamation](docs/fonts/example1/_exclamation.png)
![question](docs/fonts/example1/_question.png)
![plus](docs/fonts/example1/_plus.png)
![minus](docs/fonts/example1/_minus.png)
![mult](docs/fonts/example1/_mult.png)
![div](docs/fonts/example1/_div.png)
![equal](docs/fonts/example1/_equal.png)


### Example 2

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example2/example.html).

#### Letters

![a](docs/fonts/example2/a.png)
![b](docs/fonts/example2/b.png)
![c](docs/fonts/example2/c.png)
![d](docs/fonts/example2/d.png)
![e](docs/fonts/example2/e.png)
![f](docs/fonts/example2/f.png)
![g](docs/fonts/example2/g.png)
![h](docs/fonts/example2/h.png)
![i](docs/fonts/example2/i.png)
![j](docs/fonts/example2/j.png)
![k](docs/fonts/example2/k.png)
![l](docs/fonts/example2/l.png)
![m](docs/fonts/example2/m.png)
![n](docs/fonts/example2/n.png)
![o](docs/fonts/example2/o.png)
![p](docs/fonts/example2/p.png)
![q](docs/fonts/example2/q.png)
![r](docs/fonts/example2/r.png)
![s](docs/fonts/example2/s.png)
![t](docs/fonts/example2/t.png)
![u](docs/fonts/example2/u.png)
![v](docs/fonts/example2/v.png)
![w](docs/fonts/example2/w.png)
![x](docs/fonts/example2/x.png)
![y](docs/fonts/example2/y.png)
![z](docs/fonts/example2/z.png)

#### Digits

![0](docs/fonts/example2/0.png)
![1](docs/fonts/example2/1.png)
![2](docs/fonts/example2/2.png)
![3](docs/fonts/example2/3.png)
![4](docs/fonts/example2/4.png)
![5](docs/fonts/example2/5.png)
![6](docs/fonts/example2/6.png)
![7](docs/fonts/example2/7.png)
![8](docs/fonts/example2/8.png)
![9](docs/fonts/example2/9.png)

#### Punctuation

![point](docs/fonts/example2/_point.png)
![comma](docs/fonts/example2/_comma.png)
![colon](docs/fonts/example2/_colon.png)
![semicolon](docs/fonts/example2/_semicolon.png)
![exclamation](docs/fonts/example2/_exclamation.png)
![question](docs/fonts/example2/_question.png)
![plus](docs/fonts/example2/_plus.png)
![minus](docs/fonts/example2/_minus.png)
![mult](docs/fonts/example2/_mult.png)
![div](docs/fonts/example2/_div.png)
![equal](docs/fonts/example2/_equal.png)


### Example 3

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example3/example.html).

#### Letters

![a](docs/fonts/example3/a.png)
![b](docs/fonts/example3/b.png)
![c](docs/fonts/example3/c.png)
![d](docs/fonts/example3/d.png)
![e](docs/fonts/example3/e.png)
![f](docs/fonts/example3/f.png)
![g](docs/fonts/example3/g.png)
![h](docs/fonts/example3/h.png)
![i](docs/fonts/example3/i.png)
![j](docs/fonts/example3/j.png)
![k](docs/fonts/example3/k.png)
![l](docs/fonts/example3/l.png)
![m](docs/fonts/example3/m.png)
![n](docs/fonts/example3/n.png)
![o](docs/fonts/example3/o.png)
![p](docs/fonts/example3/p.png)
![q](docs/fonts/example3/q.png)
![r](docs/fonts/example3/r.png)
![s](docs/fonts/example3/s.png)
![t](docs/fonts/example3/t.png)
![u](docs/fonts/example3/u.png)
![v](docs/fonts/example3/v.png)
![w](docs/fonts/example3/w.png)
![x](docs/fonts/example3/x.png)
![y](docs/fonts/example3/y.png)
![z](docs/fonts/example3/z.png)

#### Digits

![0](docs/fonts/example3/0.png)
![1](docs/fonts/example3/1.png)
![2](docs/fonts/example3/2.png)
![3](docs/fonts/example3/3.png)
![4](docs/fonts/example3/4.png)
![5](docs/fonts/example3/5.png)
![6](docs/fonts/example3/6.png)
![7](docs/fonts/example3/7.png)
![8](docs/fonts/example3/8.png)
![9](docs/fonts/example3/9.png)

#### Punctuation

![point](docs/fonts/example3/_point.png)
![comma](docs/fonts/example3/_comma.png)
![colon](docs/fonts/example3/_colon.png)
![semicolon](docs/fonts/example3/_semicolon.png)
![exclamation](docs/fonts/example3/_exclamation.png)
![question](docs/fonts/example3/_question.png)
![plus](docs/fonts/example3/_plus.png)
![minus](docs/fonts/example3/_minus.png)
![mult](docs/fonts/example3/_mult.png)
![div](docs/fonts/example3/_div.png)
![equal](docs/fonts/example3/_equal.png)


### Example 4

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example4/example.html).

#### Letters

![a](docs/fonts/example4/a.png)
![b](docs/fonts/example4/b.png)
![c](docs/fonts/example4/c.png)
![d](docs/fonts/example4/d.png)
![e](docs/fonts/example4/e.png)
![f](docs/fonts/example4/f.png)
![g](docs/fonts/example4/g.png)
![h](docs/fonts/example4/h.png)
![i](docs/fonts/example4/i.png)
![j](docs/fonts/example4/j.png)
![k](docs/fonts/example4/k.png)
![l](docs/fonts/example4/l.png)
![m](docs/fonts/example4/m.png)
![n](docs/fonts/example4/n.png)
![o](docs/fonts/example4/o.png)
![p](docs/fonts/example4/p.png)
![q](docs/fonts/example4/q.png)
![r](docs/fonts/example4/r.png)
![s](docs/fonts/example4/s.png)
![t](docs/fonts/example4/t.png)
![u](docs/fonts/example4/u.png)
![v](docs/fonts/example4/v.png)
![w](docs/fonts/example4/w.png)
![x](docs/fonts/example4/x.png)
![y](docs/fonts/example4/y.png)
![z](docs/fonts/example4/z.png)

#### Digits

![0](docs/fonts/example4/0.png)
![1](docs/fonts/example4/1.png)
![2](docs/fonts/example4/2.png)
![3](docs/fonts/example4/3.png)
![4](docs/fonts/example4/4.png)
![5](docs/fonts/example4/5.png)
![6](docs/fonts/example4/6.png)
![7](docs/fonts/example4/7.png)
![8](docs/fonts/example4/8.png)
![9](docs/fonts/example4/9.png)

#### Punctuation

![point](docs/fonts/example4/_point.png)
![comma](docs/fonts/example4/_comma.png)
![colon](docs/fonts/example4/_colon.png)
![semicolon](docs/fonts/example4/_semicolon.png)
![exclamation](docs/fonts/example4/_exclamation.png)
![question](docs/fonts/example4/_question.png)
![plus](docs/fonts/example4/_plus.png)
![minus](docs/fonts/example4/_minus.png)
![mult](docs/fonts/example4/_mult.png)
![div](docs/fonts/example4/_div.png)
![equal](docs/fonts/example4/_equal.png)


### Example 5

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example5/example.html).

#### Letters

![a](docs/fonts/example5/a.png)
![b](docs/fonts/example5/b.png)
![c](docs/fonts/example5/c.png)
![d](docs/fonts/example5/d.png)
![e](docs/fonts/example5/e.png)
![f](docs/fonts/example5/f.png)
![g](docs/fonts/example5/g.png)
![h](docs/fonts/example5/h.png)
![i](docs/fonts/example5/i.png)
![j](docs/fonts/example5/j.png)
![k](docs/fonts/example5/k.png)
![l](docs/fonts/example5/l.png)
![m](docs/fonts/example5/m.png)
![n](docs/fonts/example5/n.png)
![o](docs/fonts/example5/o.png)
![p](docs/fonts/example5/p.png)
![q](docs/fonts/example5/q.png)
![r](docs/fonts/example5/r.png)
![s](docs/fonts/example5/s.png)
![t](docs/fonts/example5/t.png)
![u](docs/fonts/example5/u.png)
![v](docs/fonts/example5/v.png)
![w](docs/fonts/example5/w.png)
![x](docs/fonts/example5/x.png)
![y](docs/fonts/example5/y.png)
![z](docs/fonts/example5/z.png)

#### Digits

![0](docs/fonts/example5/0.png)
![1](docs/fonts/example5/1.png)
![2](docs/fonts/example5/2.png)
![3](docs/fonts/example5/3.png)
![4](docs/fonts/example5/4.png)
![5](docs/fonts/example5/5.png)
![6](docs/fonts/example5/6.png)
![7](docs/fonts/example5/7.png)
![8](docs/fonts/example5/8.png)
![9](docs/fonts/example5/9.png)

#### Punctuation

![point](docs/fonts/example5/_point.png)
![comma](docs/fonts/example5/_comma.png)
![colon](docs/fonts/example5/_colon.png)
![semicolon](docs/fonts/example5/_semicolon.png)
![exclamation](docs/fonts/example5/_exclamation.png)
![question](docs/fonts/example5/_question.png)
![plus](docs/fonts/example5/_plus.png)
![minus](docs/fonts/example5/_minus.png)
![mult](docs/fonts/example5/_mult.png)
![div](docs/fonts/example5/_div.png)
![equal](docs/fonts/example5/_equal.png)


### Example 6

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example6/example.html).

#### Letters

![a](docs/fonts/example6/a.png)
![b](docs/fonts/example6/b.png)
![c](docs/fonts/example6/c.png)
![d](docs/fonts/example6/d.png)
![e](docs/fonts/example6/e.png)
![f](docs/fonts/example6/f.png)
![g](docs/fonts/example6/g.png)
![h](docs/fonts/example6/h.png)
![i](docs/fonts/example6/i.png)
![j](docs/fonts/example6/j.png)
![k](docs/fonts/example6/k.png)
![l](docs/fonts/example6/l.png)
![m](docs/fonts/example6/m.png)
![n](docs/fonts/example6/n.png)
![o](docs/fonts/example6/o.png)
![p](docs/fonts/example6/p.png)
![q](docs/fonts/example6/q.png)
![r](docs/fonts/example6/r.png)
![s](docs/fonts/example6/s.png)
![t](docs/fonts/example6/t.png)
![u](docs/fonts/example6/u.png)
![v](docs/fonts/example6/v.png)
![w](docs/fonts/example6/w.png)
![x](docs/fonts/example6/x.png)
![y](docs/fonts/example6/y.png)
![z](docs/fonts/example6/z.png)


#### Digits

![0](docs/fonts/example6/0.png)
![1](docs/fonts/example6/1.png)
![2](docs/fonts/example6/2.png)
![3](docs/fonts/example6/3.png)
![4](docs/fonts/example6/4.png)
![5](docs/fonts/example6/5.png)
![6](docs/fonts/example6/6.png)
![7](docs/fonts/example6/7.png)
![8](docs/fonts/example6/8.png)
![9](docs/fonts/example6/9.png)

#### Punctuation

![point](docs/fonts/example6/_point.png)
![comma](docs/fonts/example6/_comma.png)
![colon](docs/fonts/example6/_colon.png)
![semicolon](docs/fonts/example6/_semicolon.png)
![exclamation](docs/fonts/example6/_exclamation.png)
![question](docs/fonts/example6/_question.png)
![plus](docs/fonts/example6/_plus.png)
![minus](docs/fonts/example6/_minus.png)
![mult](docs/fonts/example6/_mult.png)
![div](docs/fonts/example6/_div.png)
![equal](docs/fonts/example6/_equal.png)

### Example 7

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example7/example.html).

#### Letters

![a](docs/fonts/example7/a.png)
![b](docs/fonts/example7/b.png)
![c](docs/fonts/example7/c.png)
![d](docs/fonts/example7/d.png)
![e](docs/fonts/example7/e.png)
![f](docs/fonts/example7/f.png)
![g](docs/fonts/example7/g.png)
![h](docs/fonts/example7/h.png)
![i](docs/fonts/example7/i.png)
![j](docs/fonts/example7/j.png)
![k](docs/fonts/example7/k.png)
![l](docs/fonts/example7/l.png)
![m](docs/fonts/example7/m.png)
![n](docs/fonts/example7/n.png)
![o](docs/fonts/example7/o.png)
![p](docs/fonts/example7/p.png)
![q](docs/fonts/example7/q.png)
![r](docs/fonts/example7/r.png)
![s](docs/fonts/example7/s.png)
![t](docs/fonts/example7/t.png)
![u](docs/fonts/example7/u.png)
![v](docs/fonts/example7/v.png)
![w](docs/fonts/example7/w.png)
![x](docs/fonts/example7/x.png)
![y](docs/fonts/example7/y.png)
![z](docs/fonts/example7/z.png)


#### Digits

![0](docs/fonts/example7/0.png)
![1](docs/fonts/example7/1.png)
![2](docs/fonts/example7/2.png)
![3](docs/fonts/example7/3.png)
![4](docs/fonts/example7/4.png)
![5](docs/fonts/example7/5.png)
![6](docs/fonts/example7/6.png)
![7](docs/fonts/example7/7.png)
![8](docs/fonts/example7/8.png)
![9](docs/fonts/example7/9.png)

#### Punctuation

![point](docs/fonts/example7/_point.png)
![comma](docs/fonts/example7/_comma.png)
![colon](docs/fonts/example7/_colon.png)
![semicolon](docs/fonts/example7/_semicolon.png)
![exclamation](docs/fonts/example7/_exclamation.png)
![question](docs/fonts/example7/_question.png)
![plus](docs/fonts/example7/_plus.png)
![minus](docs/fonts/example7/_minus.png)
![mult](docs/fonts/example7/_mult.png)
![div](docs/fonts/example7/_div.png)
![equal](docs/fonts/example7/_equal.png)

### Example 8

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example8/example.html).

#### Letters

![a](docs/fonts/example8/a.png)
![b](docs/fonts/example8/b.png)
![c](docs/fonts/example8/c.png)
![d](docs/fonts/example8/d.png)
![e](docs/fonts/example8/e.png)
![f](docs/fonts/example8/f.png)
![g](docs/fonts/example8/g.png)
![h](docs/fonts/example8/h.png)
![i](docs/fonts/example8/i.png)
![j](docs/fonts/example8/j.png)
![k](docs/fonts/example8/k.png)
![l](docs/fonts/example8/l.png)
![m](docs/fonts/example8/m.png)
![n](docs/fonts/example8/n.png)
![o](docs/fonts/example8/o.png)
![p](docs/fonts/example8/p.png)
![q](docs/fonts/example8/q.png)
![r](docs/fonts/example8/r.png)
![s](docs/fonts/example8/s.png)
![t](docs/fonts/example8/t.png)
![u](docs/fonts/example8/u.png)
![v](docs/fonts/example8/v.png)
![w](docs/fonts/example8/w.png)
![x](docs/fonts/example8/x.png)
![y](docs/fonts/example8/y.png)
![z](docs/fonts/example8/z.png)


#### Digits

![0](docs/fonts/example8/0.png)
![1](docs/fonts/example8/1.png)
![2](docs/fonts/example8/2.png)
![3](docs/fonts/example8/3.png)
![4](docs/fonts/example8/4.png)
![5](docs/fonts/example8/5.png)
![6](docs/fonts/example8/6.png)
![7](docs/fonts/example8/7.png)
![8](docs/fonts/example8/8.png)
![9](docs/fonts/example8/9.png)

#### Punctuation

![point](docs/fonts/example8/_point.png)
![comma](docs/fonts/example8/_comma.png)
![colon](docs/fonts/example8/_colon.png)
![semicolon](docs/fonts/example8/_semicolon.png)
![exclamation](docs/fonts/example8/_exclamation.png)
![question](docs/fonts/example8/_question.png)
![plus](docs/fonts/example8/_plus.png)
![minus](docs/fonts/example8/_minus.png)
![mult](docs/fonts/example8/_mult.png)
![div](docs/fonts/example8/_div.png)
![equal](docs/fonts/example8/_equal.png)

### Example 9

Link to [Lorem Ipsum](https://eobermuhlner.github.io/alien-script-generator/fonts/example1/example9.html).

#### Letters

![a](docs/fonts/example9/a.png)
![b](docs/fonts/example9/b.png)
![c](docs/fonts/example9/c.png)
![d](docs/fonts/example9/d.png)
![e](docs/fonts/example9/e.png)
![f](docs/fonts/example9/f.png)
![g](docs/fonts/example9/g.png)
![h](docs/fonts/example9/h.png)
![i](docs/fonts/example9/i.png)
![j](docs/fonts/example9/j.png)
![k](docs/fonts/example9/k.png)
![l](docs/fonts/example9/l.png)
![m](docs/fonts/example9/m.png)
![n](docs/fonts/example9/n.png)
![o](docs/fonts/example9/o.png)
![p](docs/fonts/example9/p.png)
![q](docs/fonts/example9/q.png)
![r](docs/fonts/example9/r.png)
![s](docs/fonts/example9/s.png)
![t](docs/fonts/example9/t.png)
![u](docs/fonts/example9/u.png)
![v](docs/fonts/example9/v.png)
![w](docs/fonts/example9/w.png)
![x](docs/fonts/example9/x.png)
![y](docs/fonts/example9/y.png)
![z](docs/fonts/example9/z.png)


#### Digits

![0](docs/fonts/example9/0.png)
![1](docs/fonts/example9/1.png)
![2](docs/fonts/example9/2.png)
![3](docs/fonts/example9/3.png)
![4](docs/fonts/example9/4.png)
![5](docs/fonts/example9/5.png)
![6](docs/fonts/example9/6.png)
![7](docs/fonts/example9/7.png)
![8](docs/fonts/example9/8.png)
![9](docs/fonts/example9/9.png)

#### Punctuation

![point](docs/fonts/example9/_point.png)
![comma](docs/fonts/example9/_comma.png)
![colon](docs/fonts/example9/_colon.png)
![semicolon](docs/fonts/example9/_semicolon.png)
![exclamation](docs/fonts/example9/_exclamation.png)
![question](docs/fonts/example9/_question.png)
![plus](docs/fonts/example9/_plus.png)
![minus](docs/fonts/example9/_minus.png)
![mult](docs/fonts/example9/_mult.png)
![div](docs/fonts/example9/_div.png)
![equal](docs/fonts/example9/_equal.png)

