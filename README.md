# Втора лабораториска вежба по Софтверско инженерство
## Благој Јанакиевски, бр. на индекс 186088 
**Група на код:**

Ја добив групата на код 4.


**Control Flow Graph**

Control Flow Graph-от го нацртав во draw.io и може да се виде на следната слика, додека пак именувањата на јазлите се направени според линиите код во функцијтата „function“. Кодот заедно со означените линиите како јазли може да се виде во датотеката node_names.txt.

![](ControlFlowGraph.png)

**Цикломатска комплексност**

Цикломатска комплексност се добива со одземање на бројот на јазли (13) од бројот на ребра (19) и на добиениот број му се додава 2. Т.е 19 - 13 + 2 = 8


**Тест случаеви според критериумот Multiple Conditions**

Multiple Condition критериумот ги разгледува сите одлучувачки јазли каде што има потенцијално делење и можност за одбирање на повеќе различни насоки, притоа се разгледуваат сите можни насоки (true & false). Во мојот случај потребни ми беа 9 тестови така што ќе можат да се изминат сите евалуациски состојби. Ги избрав следните, така што во табелите се обележани евалуациите со кој тест поминуваат. Во csv документот е направена матрица така што ги покажува одлуките на сите услови. Доколку има „\“ значи дека тие делови од кодот не се извршуваат воопшто. Во for циклусот имам обележано „T….F“, бидејќи во сите од случаите ќе биде точно и ќе се извршува се додека не стигнеме до крај на password-от и со тоа завршува самиот циклус. Додека пак за линиите код во циклусот, се проверува за секој карактер посебно, доколку барем еден од нив е цифра, голема буква или специјален карактер, ќе се изврше соодветната линија код, затоа е бележано со „T“  доколку поминува барем еднаш.

1. user = null
2. user = [Blagoj, null, janakievskibaze@gmail.com]
3. user = [null, Blagoj, janakievskibaze@gmail.com]
4. user = [Blagoj, BlAgoj12, janakievskibaze@gmail.com]
5. user = [Blagoj, Janak12, janakievskibaze@gmail.com]
6. user = [Blagoj, Janakievski12, janakievskibaze@gmail.com]
7. user = [Blagoj, j@nakievski, janakievskibaze@gmail.com]
8. user = [Blagoj, janakievski12, janakievskibaze@gmail.com] 
9. user = [Blagoj, J@nakievski12, janakievskibaze@gmail.com]

![](multiple_conditions.jpg)

**Тест случаеви според критериумот Every Branch**

Every Branch методата е всушност правење тест случаеви така што може да се изминат сите гранки(патеки) во графот. Овие 5 тест примери беа доволни за тоа да успее во мојот случај:

1. user = null
2. user = [Blagoj, null, janakievskibaze@gmail.com]
3. user = [Blagoj, BlAgoj12, janakievskibaze@gmail.com]
4. user = [Blagoj, janakievski12, janakievskibaze@gmail.com]
5. user = [Blagoj, J@nakievski12, janakievskibaze@gmail.com]

![](every_branch.jpg)
