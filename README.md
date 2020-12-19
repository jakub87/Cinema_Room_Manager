# Cinema-Room-Manager

Cinema Room Manager - project from Hyperskill

<p><b>Objectives</b></p>
<p>Now your menu should look like this:</p>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>

<p>How to calculate ticket price</p>
<ul>
	<li>If the total number of seats in the screen room is not more than 60, then the price of each ticket is 10 dollars.</li>
	<li>In a larger room, the tickets are 10 dollars for the front half of the rows and 8 dollars for the back half. Please note that the number of rows can be odd, for example, 9 rows. In this case, the first half is the first 4 rows, and the second half is the rest 5 rows.</li>
</ul>

<p> When the item <b>Statistics</b> is chosen, your program should print the following information:</p>

<ul>
	<li>The number of purchased tickets;</li>
	<li>The number of purchased tickets represented as a percentage. Percentages should be rounded to 2 decimal places;</li>
	<li>Current income;</li>
	<li>Total income that shows how much money the theatre will get if all the tickets are sold.</li>
</ul>

<p>The rest of the menu items should work the same way as before, except the item <b>Buy a ticket</b> shouldn't allow a user to buy a ticket that has already been purchased.</p>

<p>If a user chooses an already taken seat, print <b>That ticket has already been purchased!</b> and ask them to enter different seat coordinates until they pick an available seat. Of course, you shouldn't allow coordinates that are out of bounds. If this happens, print <b>Wrong input!</b> and ask to enter different seat coordinates until the user picks an available seat.</p>

<p><b>Examples</b></p> 

<code>Enter the number of rows:</code><br>
<code>> 6</code><br>
<code>Enter the number of seats in each row:</code><br>
<code>> 6</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 3</code><br>
<code>Number of purchased tickets: 0</code><br>
<code>Percentage: 0.00%</code><br>
<code>Current income: $0</code><br>
<code>Total income: $360</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 2</code><br>
<code>Enter a row number:</code><br>
<code>> 1</code><br>
<code>Enter a seat number in that row:</code><br>
<code>> 1</code><br>
<code>Ticket price: $10</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 3</code><br>
<code>Number of purchased tickets: 1</code><br>
<code>Percentage: 2.78%</code><br>
<code>Current income: $10</code><br>
<code>Total income: $360</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 2</code><br>
<code>Enter a row number:</code><br>
<code>> 1</code><br>
<code>Enter a seat number in that row:</code><br>
<code>> 1</code><br>
<code>That ticket has already been purchased!</code><br>
<code>Enter a row number:</code><br>
<code>> 10</code><br>
<code>Enter a seat number in that row:</code><br>
<code>> 20</code><br>
<code>Wrong input!</code><br>
<code>Enter a row number:</code><br>
<code>> 4</code><br>
<code>Enter a seat number in that row:</code><br>
<code>> 4</code><br>
<code>Ticket price: $10</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 1</code><br>
<code>Cinema:</code><br>
<code>  1 2 3 4 5 6</code><br>
<code>1 B S S S S S</code><br>
<code>2 S S S S S S</code><br>
<code>3 S S S S S S</code><br>
<code>4 S S S B S S</code><br>
<code>5 S S S S S S</code><br>
<code>6 S S S S S S</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 3</code><br>
<code>Number of purchased tickets: 2</code><br>
<code>Percentage: 5.56%</code><br>
<code>Current income: $20</code><br>
<code>Total income: $360</code><br>
<code>1. Show the seats</code><br>
<code>2. Buy a ticket</code><br>
<code>3. Statistics</code><br>
<code>0. Exit</code><br>
<code>> 0</code><br>