# BotClean-AI-in-Java-Hackerrank-Solution-
In this challenge, you must program the behaviour of a robot.

The robot is positionned in a cell in a grid GG of size H∗WH∗W. Your task is to move the robot through it in order to clean every "dirty" cells.

Input Format

The first line contians the position x and y of the robot.

The next line contains the height HH and the width WW of the grid.ille.

The HH next lines represent the grid GG. Each cell is represented by one of those three characters:

'b' for the position of the robot
'd' for a dirty cell
'-' for a clean cell
If the robot is on a dirty cell, the character 'd' will be used. 

Constraints 
1≤W≤501≤W≤50 
1≤H≤501≤H≤50
Output Format

You must print the next action the robot will perform. Here are the five possibilities:

LEFT
RIGHT
UP
DOWN
CLEAN
It's important you understand that the input you get is a specific situation, and you must only print the next action to perform. You program will be called iteratively several times so that the robot cleans all the grid.

Sample Input

0 0
5 5
b---d
-d--d
--dd-
--d--
----d
Sample Output

RIGHT
Resultant state

-b--d
-d--d
--dd-
--d--
----d
