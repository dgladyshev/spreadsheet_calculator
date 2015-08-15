# spreadsheet_calculator

##comment

This exercise is one of my latest test assignments during job search.

##assignment description

Spreadsheet Calculator

A spreadsheet consists of a two—dimensional array of cells, labeled A1, A2, etc. Rows are identified using letters, columns by numbers. Each cell contains either an integer (its value) or
an expression. Expressions contain integers, cell references, and the operators ‘+', ‘—‘, ‘*‘, ‘/‘ with the usual rules of evaluation — note that the input is RPN and should be evaluated in stack order.

Write a program (in Java or Scala) to read a spreadsheet from ’stdin’ via file input.txt, evaluate the values of all the cells, and write the output to ’stdout’.

The spreadsheet input is defined as follows:

° Line 1: two integers, defining the width and height ofthe spreadsheet (n, m)

° n*m lines each containing an expression which is the value of the corresponding cell
(cells enumerated in the order A1, A2, A<n>, B1,...)

Your program must output its data in the same format, but each cell should be reduced to a
single floating—point value.

So basically your program must evaluate spreadsheets like this:

![Alt text](/data_screenshot.png?raw=true)
